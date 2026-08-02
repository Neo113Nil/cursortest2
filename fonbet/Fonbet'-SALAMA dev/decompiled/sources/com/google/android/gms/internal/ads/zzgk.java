package com.google.android.gms.internal.ads;

import android.net.Uri;
import e1.k;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import w1.L;

/* loaded from: classes.dex */
public final class zzgk extends zzfq implements zzgs {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgr zze;
    private final zzgr zzf;
    private zzgc zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    public /* synthetic */ zzgk(String str, int i7, int i8, boolean z4, boolean z7, zzgr zzgrVar, zzfti zzftiVar, boolean z8, zzgj zzgjVar) {
        super(true);
        this.zzd = str;
        this.zzb = i7;
        this.zzc = i8;
        this.zza = z4;
        this.zze = zzgrVar;
        this.zzf = new zzgr();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i7, byte[] bArr, long j, long j3, boolean z4, boolean z7, Map map) {
        String sb;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zze.zza());
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j == 0) {
            if (j3 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.zzd;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty("Accept-Encoding", true == z4 ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z7);
                httpURLConnection.setDoOutput(false);
                int i8 = zzgc.zzh;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder j7 = k.j("bytes=", "-", j);
        if (j3 != -1) {
            j7.append((j + j3) - 1);
        }
        sb = j7.toString();
        if (sb != null) {
        }
        str = this.zzd;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true == z4 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z7);
        httpURLConnection.setDoOutput(false);
        int i82 = zzgc.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzgc zzgcVar) {
        if (str == null) {
            throw new zzgo("Null location redirect", zzgcVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new zzgo("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzgcVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzgo(L.j("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzgcVar, 2001, 1);
        } catch (MalformedURLException e7) {
            throw new zzgo(e7, zzgcVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e7) {
                zzdq.zzd("DefaultHttpDataSource", "Unexpected error while disconnecting", e7);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j3 = j - this.zzm;
                if (j3 != 0) {
                    i8 = (int) Math.min(i8, j3);
                }
                return -1;
            }
            InputStream inputStream = this.zzi;
            int i9 = zzen.zza;
            int read = inputStream.read(bArr, i7, i8);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzg(read);
            return read;
        } catch (IOException e7) {
            zzgc zzgcVar = this.zzg;
            int i10 = zzen.zza;
            throw zzgo.zza(e7, zzgcVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00bd, code lost:
    
        if (r10 == r19) goto L35;
     */
    @Override // com.google.android.gms.internal.ads.zzfx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzgc zzgcVar) {
        long j;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.zzg = zzgcVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzi(zzgcVar);
        try {
            URL url = new URL(zzgcVar.zza.toString());
            long j7 = zzgcVar.zze;
            long j8 = zzgcVar.zzf;
            boolean zzb = zzgcVar.zzb(1);
            if (this.zza) {
                j = 0;
                URL url2 = url;
                int i7 = 0;
                while (true) {
                    int i8 = i7 + 1;
                    if (i7 > 20) {
                        throw new zzgo(new NoRouteToHostException("Too many redirects: " + i8), zzgcVar, 2001, 1);
                    }
                    long j9 = j7;
                    URL url3 = url2;
                    HttpURLConnection zzk = zzk(url2, 1, null, j7, j8, zzb, false, zzgcVar.zzd);
                    int responseCode = zzk.getResponseCode();
                    String headerField = zzk.getHeaderField("Location");
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        httpURLConnection = zzk;
                        break;
                    }
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzgcVar);
                    j7 = j9;
                    i7 = i8;
                }
            } else {
                j = 0;
                httpURLConnection = zzk(url, 1, null, j7, j8, zzb, true, zzgcVar.zzd);
            }
            this.zzh = httpURLConnection;
            this.zzk = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            int i9 = this.zzk;
            if (i9 < 200 || i9 > 299) {
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (this.zzk == 416) {
                    str = responseMessage;
                    if (zzgcVar.zze == zzgt.zzb(httpURLConnection.getHeaderField("Content-Range"))) {
                        this.zzj = true;
                        zzj(zzgcVar);
                        long j10 = zzgcVar.zzf;
                        return j10 != -1 ? j10 : j;
                    }
                } else {
                    str = responseMessage;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    bArr = errorStream != null ? zzfyx.zzb(errorStream) : zzen.zzc;
                } catch (IOException unused) {
                    bArr = zzen.zzc;
                }
                byte[] bArr2 = bArr;
                zzm();
                throw new zzgq(this.zzk, str, this.zzk == 416 ? new zzfy(2008) : null, headerFields, zzgcVar, bArr2);
            }
            httpURLConnection.getContentType();
            if (this.zzk == 200) {
                j3 = zzgcVar.zze;
            }
            j3 = j;
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.zzl = zzgcVar.zzf;
            } else {
                long j11 = zzgcVar.zzf;
                if (j11 != -1) {
                    this.zzl = j11;
                } else {
                    long zza = zzgt.zza(httpURLConnection.getHeaderField("Content-Length"), httpURLConnection.getHeaderField("Content-Range"));
                    this.zzl = zza != -1 ? zza - j3 : -1L;
                }
            }
            try {
                this.zzi = httpURLConnection.getInputStream();
                if (equalsIgnoreCase) {
                    this.zzi = new GZIPInputStream(this.zzi);
                }
                this.zzj = true;
                zzj(zzgcVar);
                if (j3 != j) {
                    try {
                        byte[] bArr3 = new byte[4096];
                        while (j3 > j) {
                            int min = (int) Math.min(j3, 4096L);
                            InputStream inputStream = this.zzi;
                            int i10 = zzen.zza;
                            int read = inputStream.read(bArr3, 0, min);
                            if (Thread.currentThread().isInterrupted()) {
                                throw new zzgo(new InterruptedIOException(), zzgcVar, 2000, 1);
                            }
                            if (read == -1) {
                                throw new zzgo(zzgcVar, 2008, 1);
                            }
                            j3 -= read;
                            zzg(read);
                        }
                    } catch (IOException e7) {
                        zzm();
                        if (e7 instanceof zzgo) {
                            throw ((zzgo) e7);
                        }
                        throw new zzgo(e7, zzgcVar, 2000, 1);
                    }
                }
                return this.zzl;
            } catch (IOException e8) {
                zzm();
                throw new zzgo(e8, zzgcVar, 2000, 1);
            }
        } catch (IOException e9) {
            zzm();
            throw zzgo.zza(e9, zzgcVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzgc zzgcVar = this.zzg;
        if (zzgcVar != null) {
            return zzgcVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    zzgc zzgcVar = this.zzg;
                    int i7 = zzen.zza;
                    throw new zzgo(e7, zzgcVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
            this.zzh = null;
            this.zzg = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzfwk.zzd() : new zzgi(httpURLConnection.getHeaderFields());
    }
}
