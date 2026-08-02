package com.google.android.gms.internal.firebase_database;

import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.support.annotation.Nullable;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.Thread;
import java.net.Socket;
import java.net.URI;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class zzjr {
    private static final AtomicInteger zzsx = new AtomicInteger(0);
    private static final Charset zzsy = Charset.forName("UTF-8");
    private static ThreadFactory zzti = Executors.defaultThreadFactory();
    private static zzjq zztj = new zzjs();
    private final zzhz zzbs;

    @Nullable
    private final String zzcs;
    private final URI zztc;
    private final zzka zztd;
    private final zzkb zzte;
    private final zzjy zztf;
    private volatile int zzsz = zzjv.zztm;
    private volatile Socket zzta = null;
    private zzjw zztb = null;
    private final int zztg = zzsx.incrementAndGet();
    private final Thread zzth = zzti.newThread(new zzjt(this));

    public zzjr(zzaf zzafVar, URI uri, String str, Map<String, String> map) {
        this.zztc = uri;
        this.zzcs = zzafVar.zzw();
        zzia zzq = zzafVar.zzq();
        int i = this.zztg;
        StringBuilder sb = new StringBuilder(14);
        sb.append("sk_");
        sb.append(i);
        this.zzbs = new zzhz(zzq, "WebSocket", sb.toString());
        this.zztf = new zzjy(uri, null, map);
        this.zztd = new zzka(this);
        this.zzte = new zzkb(this, "TubeSock", this.zztg);
    }

    private final Socket createSocket() {
        String scheme = this.zztc.getScheme();
        String host = this.zztc.getHost();
        int port = this.zztc.getPort();
        if (scheme != null && scheme.equals("ws")) {
            if (port == -1) {
                port = 80;
            }
            try {
                return new Socket(host, port);
            } catch (UnknownHostException e) {
                String valueOf = String.valueOf(host);
                throw new zzjx(valueOf.length() != 0 ? "unknown host: ".concat(valueOf) : new String("unknown host: "), e);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(this.zztc);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 31);
                sb.append("error while creating socket to ");
                sb.append(valueOf2);
                throw new zzjx(sb.toString(), e2);
            }
        }
        if (scheme == null || !scheme.equals("wss")) {
            String valueOf3 = String.valueOf(scheme);
            throw new zzjx(valueOf3.length() != 0 ? "unsupported protocol: ".concat(valueOf3) : new String("unsupported protocol: "));
        }
        if (port == -1) {
            port = 443;
        }
        SSLSessionCache sSLSessionCache = null;
        try {
            if (this.zzcs != null) {
                sSLSessionCache = new SSLSessionCache(new File(this.zzcs));
            }
        } catch (IOException e3) {
            this.zzbs.zza("Failed to initialize SSL session cache", e3, new Object[0]);
        }
        try {
            SSLSocket sSLSocket = (SSLSocket) SSLCertificateSocketFactory.getDefault(60000, sSLSessionCache).createSocket(host, port);
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(host, sSLSocket.getSession())) {
                return sSLSocket;
            }
            String valueOf4 = String.valueOf(this.zztc);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 39);
            sb2.append("Error while verifying secure socket to ");
            sb2.append(valueOf4);
            throw new zzjx(sb2.toString());
        } catch (UnknownHostException e4) {
            String valueOf5 = String.valueOf(host);
            throw new zzjx(valueOf5.length() != 0 ? "unknown host: ".concat(valueOf5) : new String("unknown host: "), e4);
        } catch (IOException e5) {
            String valueOf6 = String.valueOf(this.zztc);
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf6).length() + 38);
            sb3.append("error while creating secure socket to ");
            sb3.append(valueOf6);
            throw new zzjx(sb3.toString(), e5);
        }
    }

    static ThreadFactory getThreadFactory() {
        return zzti;
    }

    private final synchronized void zza(byte b, byte[] bArr) {
        if (this.zzsz != zzjv.zzto) {
            this.zztb.zza(new zzjx("error while sending data: not connected"));
            return;
        }
        try {
            this.zzte.zza(b, true, bArr);
        } catch (IOException e) {
            this.zztb.zza(new zzjx("Failed to send frame", e));
            close();
        }
    }

    static zzjq zzgi() {
        return zztj;
    }

    private final synchronized void zzgl() {
        if (this.zzsz == zzjv.zztq) {
            return;
        }
        this.zztd.zzgp();
        this.zzte.zzgr();
        if (this.zzta != null) {
            try {
                this.zzta.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        this.zzsz = zzjv.zztq;
        this.zztb.onClose();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void zzgn() {
        try {
            Socket createSocket = createSocket();
            synchronized (this) {
                this.zzta = createSocket;
                if (this.zzsz == zzjv.zztq) {
                    try {
                        this.zzta.close();
                        this.zzta = null;
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                DataInputStream dataInputStream = new DataInputStream(createSocket.getInputStream());
                OutputStream outputStream = createSocket.getOutputStream();
                outputStream.write(this.zztf.zzgo());
                ArrayList arrayList = new ArrayList();
                byte[] bArr = new byte[1000];
                boolean z = false;
                while (true) {
                    int i = 0;
                    while (!z) {
                        int read = dataInputStream.read();
                        if (read == -1) {
                            throw new zzjx("Connection closed before handshake was complete");
                        }
                        bArr[i] = (byte) read;
                        i++;
                        if (bArr[i - 1] == 10 && bArr[i - 2] == 13) {
                            String str = new String(bArr, zzsy);
                            if (str.trim().equals("")) {
                                z = true;
                            } else {
                                arrayList.add(str.trim());
                            }
                            bArr = new byte[1000];
                        } else if (i == 1000) {
                            String valueOf = String.valueOf(new String(bArr, zzsy));
                            throw new zzjx(valueOf.length() != 0 ? "Unexpected long line in handshake: ".concat(valueOf) : new String("Unexpected long line in handshake: "));
                        }
                    }
                    int parseInt = Integer.parseInt(((String) arrayList.get(0)).substring(9, 12));
                    if (parseInt == 407) {
                        throw new zzjx("connection failed: proxy authentication not supported");
                    }
                    if (parseInt == 404) {
                        throw new zzjx("connection failed: 404 not found");
                    }
                    if (parseInt != 101) {
                        StringBuilder sb = new StringBuilder(50);
                        sb.append("connection failed: unknown status code ");
                        sb.append(parseInt);
                        throw new zzjx(sb.toString());
                    }
                    arrayList.remove(0);
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList2 = arrayList;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList2.get(i2);
                        i2++;
                        String[] split = ((String) obj).split(": ", 2);
                        hashMap.put(split[0], split[1]);
                    }
                    if (!((String) hashMap.get("Upgrade")).toLowerCase(Locale.US).equals("websocket")) {
                        throw new zzjx("connection failed: missing header field in server handshake: Upgrade");
                    }
                    if (!((String) hashMap.get("Connection")).toLowerCase(Locale.US).equals("upgrade")) {
                        throw new zzjx("connection failed: missing header field in server handshake: Connection");
                    }
                    this.zzte.zza(outputStream);
                    this.zztd.zza(dataInputStream);
                    this.zzsz = zzjv.zzto;
                    this.zzte.zzgt().start();
                    this.zztb.zzav();
                    this.zztd.run();
                    return;
                }
            }
        } catch (zzjx e2) {
            this.zztb.zza(e2);
        } catch (IOException e3) {
            zzjw zzjwVar = this.zztb;
            String valueOf2 = String.valueOf(e3.getMessage());
            zzjwVar.zza(new zzjx(valueOf2.length() != 0 ? "error while connecting: ".concat(valueOf2) : new String("error while connecting: "), e3));
        } finally {
            close();
        }
    }

    public final synchronized void close() {
        switch (zzju.zztl[this.zzsz - 1]) {
            case 1:
                this.zzsz = zzjv.zztq;
                return;
            case 2:
                zzgl();
                return;
            case 3:
                try {
                    this.zzsz = zzjv.zztp;
                    this.zzte.zzgr();
                    this.zzte.zza((byte) 8, true, new byte[0]);
                    return;
                } catch (IOException e) {
                    this.zztb.zza(new zzjx("Failed to send close frame", e));
                    return;
                }
            case 4:
                return;
            case 5:
                return;
            default:
                return;
        }
    }

    public final synchronized void connect() {
        if (this.zzsz != zzjv.zztm) {
            this.zztb.zza(new zzjx("connect() already called"));
            close();
            return;
        }
        zzjq zzjqVar = zztj;
        Thread thread = this.zzth;
        int i = this.zztg;
        StringBuilder sb = new StringBuilder(26);
        sb.append("TubeSockReader-");
        sb.append(i);
        zzjqVar.zza(thread, sb.toString());
        this.zzsz = zzjv.zztn;
        this.zzth.start();
    }

    public final void zza(zzjw zzjwVar) {
        this.zztb = zzjwVar;
    }

    final void zzb(zzjx zzjxVar) {
        this.zztb.zza(zzjxVar);
        if (this.zzsz == zzjv.zzto) {
            close();
        }
        zzgl();
    }

    final synchronized void zzd(byte[] bArr) {
        zza((byte) 10, bArr);
    }

    final zzjw zzgj() {
        return this.zztb;
    }

    final void zzgk() {
        zzgl();
    }

    public final void zzgm() throws InterruptedException {
        if (this.zzte.zzgt().getState() != Thread.State.NEW) {
            this.zzte.zzgt().join();
        }
        this.zzth.join();
    }

    public final synchronized void zzm(String str) {
        zza((byte) 1, str.getBytes(zzsy));
    }
}
