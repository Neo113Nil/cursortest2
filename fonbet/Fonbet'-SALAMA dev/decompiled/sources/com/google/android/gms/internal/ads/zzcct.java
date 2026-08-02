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

/* loaded from: classes.dex */
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

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
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
                    int read = this.zzj.read(bArr2, 0, (int) Math.min(j3 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzo += read;
                    zzg(read);
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
                }
                return -1;
            }
            int read2 = this.zzj.read(bArr, i7, i8);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzg(read2);
            return read2;
        } catch (IOException e7) {
            throw new zzgo(e7, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0108, code lost:
    
        if (r2 == 0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022e A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000f, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x0223, B:102:0x022e, B:104:0x023f, B:110:0x0248, B:111:0x0257, B:114:0x025f, B:115:0x0266, B:118:0x0267, B:119:0x027d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x025f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000f, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x0040, B:10:0x0058, B:12:0x005e, B:19:0x0082, B:21:0x009c, B:22:0x00ae, B:23:0x00b3, B:25:0x00bc, B:26:0x00c3, B:39:0x00ee, B:100:0x0223, B:102:0x022e, B:104:0x023f, B:110:0x0248, B:111:0x0257, B:114:0x025f, B:115:0x0266, B:118:0x0267, B:119:0x027d), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0  */
    @Override // com.google.android.gms.internal.ads.zzfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzgc zzgcVar) {
        int responseCode;
        String headerField;
        long j;
        long parseLong;
        String headerField2;
        this.zzh = zzgcVar;
        long j3 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzgcVar.zza.toString());
            long j7 = zzgcVar.zze;
            long j8 = zzgcVar.zzf;
            boolean zzb2 = zzgcVar.zzb(1);
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
                    if (!zzb2) {
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
                            }
                            j = 0;
                            this.zzm = j;
                            if (zzgcVar.zzb(1)) {
                                this.zzn = zzgcVar.zzf;
                            } else {
                                long j9 = zzgcVar.zzf;
                                if (j9 != -1) {
                                    this.zzn = j9;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        try {
                                            parseLong = Long.parseLong(headerField3);
                                        } catch (NumberFormatException unused) {
                                            String h6 = AbstractC0486a1.h("Unexpected Content-Length [", headerField3, "]");
                                            int i9 = J.f3546b;
                                            j.d(h6);
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                        if (!TextUtils.isEmpty(headerField2)) {
                                            Matcher matcher = zza.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                    if (parseLong < 0) {
                                                        parseLong = parseLong2;
                                                    } else if (parseLong != parseLong2) {
                                                        int i10 = J.f3546b;
                                                        j.g("Inconsistent headers [" + headerField3 + "] [" + headerField2 + "]");
                                                        parseLong = Math.max(parseLong, parseLong2);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    String h7 = AbstractC0486a1.h("Unexpected Content-Range [", headerField2, "]");
                                                    int i11 = J.f3546b;
                                                    j.d(h7);
                                                }
                                            }
                                        }
                                        this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                    }
                                    parseLong = -1;
                                    headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField2)) {
                                    }
                                    this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
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
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i7 = i8;
                    j3 = 0;
                } else {
                    j3 = j7;
                }
                String str = "bytes=" + j3 + "-";
                if (j8 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append((j3 + j8) - 1);
                    str = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", str);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zzb2) {
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
                }
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
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
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
