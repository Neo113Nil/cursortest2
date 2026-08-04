package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import W5.AbstractC0486a1;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes.dex */
final class zzcct extends zzfq implements zzgs {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgr zzg;
    private zzgc zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcct(String str, zzgx zzgxVar, int i7, int i8, int i9) {
        super(true);
        this.zzc = new zzccs(this);
        this.zzr = new HashSet();
        zzcv.zzc(str);
        this.zzf = str;
        this.zzg = new zzgr();
        this.zzd = i7;
        this.zze = i8;
        this.zzq = i9;
        if (zzgxVar != null) {
            zzf(zzgxVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                int i7 = J.f3546b;
                j.e("Unexpected error while disconnecting", e7);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) throws zzgo {
        int i9;
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzb.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j3 = this.zzm;
                    if (j == j3) {
                        zzb.set(bArr2);
                        break;
                    }
                    int i10 = this.zzj.read(bArr2, 0, (int) Math.min(j3 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i10 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i10;
                    zzg(i10);
                }
            }
            if (i8 == 0) {
                return 0;
            }
            long j7 = this.zzn;
            if (j7 != -1) {
                long j8 = j7 - this.zzp;
                if (j8 != 0) {
                    i8 = (int) Math.min(i8, j8);
                    i9 = this.zzj.read(bArr, i7, i8);
                    if (i9 == -1) {
                        this.zzp += (long) i9;
                        zzg(i9);
                        return i9;
                    }
                    if (this.zzn == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i9 = this.zzj.read(bArr, i7, i8);
                if (i9 == -1) {
                    this.zzp += (long) i9;
                    zzg(i9);
                    return i9;
                }
                if (this.zzn == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e7) {
            throw new zzgo(e7, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x025f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000f, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:94:0x0223, B:96:0x022e, B:98:0x023f, B:101:0x0248, B:102:0x0257, B:104:0x025f, B:105:0x0266, B:106:0x0267, B:107:0x027d), top: B:118:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x022e A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000f, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:94:0x0223, B:96:0x022e, B:98:0x023f, B:101:0x0248, B:102:0x0257, B:104:0x025f, B:105:0x0266, B:106:0x0267, B:107:0x027d), top: B:118:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzgo {
        int responseCode;
        String headerField;
        String protocol;
        long j;
        long jMax;
        this.zzh = zzgcVar;
        long j3 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzgcVar.zza.toString());
            long j7 = zzgcVar.zze;
            long j8 = zzgcVar.zzf;
            boolean zZzb = zzgcVar.zzb(1);
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                if (i7 > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i8);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Map.Entry entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j7 == j3) {
                    if (j8 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zZzb) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzgq zzgqVar = new zzgq(this.zzl, null, null, headerFields, zzgcVar, zzen.zzc);
                                if (this.zzl != 416) {
                                    throw zzgqVar;
                                }
                                zzgqVar.initCause(new zzfy(2008));
                                throw zzgqVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzgcVar.zze;
                                if (j == 0) {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            this.zzm = j;
                            if (zzgcVar.zzb(1)) {
                                this.zzn = zzgcVar.zzf;
                            } else {
                                long j9 = zzgcVar.zzf;
                                if (j9 != -1) {
                                    this.zzn = j9;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            String strH = AbstractC0486a1.h("Unexpected Content-Length [", headerField2, "]");
                                            int i9 = J.f3546b;
                                            j.d(strH);
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j10 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < 0) {
                                                    jMax = j10;
                                                } else if (jMax != j10) {
                                                    int i10 = J.f3546b;
                                                    j.g("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                                    jMax = Math.max(jMax, j10);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                String strH2 = AbstractC0486a1.h("Unexpected Content-Range [", headerField3, "]");
                                                int i11 = J.f3546b;
                                                j.d(strH2);
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzj(zzgcVar);
                                return this.zzn;
                            } catch (IOException e7) {
                                zzn();
                                throw new zzgo(e7, zzgcVar, 2000, 1);
                            }
                        } catch (IOException e8) {
                            zzn();
                            throw new zzgo("Unable to connect to ".concat(String.valueOf(zzgcVar.zza.toString())), e8, zzgcVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i7 = i8;
                    j3 = 0;
                } else {
                    j3 = j7;
                }
                String string = "bytes=" + j3 + "-";
                if (j8 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append((j3 + j8) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zZzb) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i7 = i8;
                j3 = 0;
            }
        } catch (IOException e9) {
            throw new zzgo("Unable to connect to ".concat(String.valueOf(zzgcVar.zza.toString())), e9, zzgcVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                int i7 = zzen.zza;
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new zzgo(e7, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        } catch (Throwable th) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i7) {
        this.zzq = i7;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e7) {
                    int i8 = J.f3546b;
                    j.h("Failed to update receive buffer size.", e7);
                }
            }
        }
    }
}
