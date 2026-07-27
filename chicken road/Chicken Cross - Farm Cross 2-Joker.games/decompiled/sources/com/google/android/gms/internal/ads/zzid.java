package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
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

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzid extends zzhk implements zzil {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzik zze;
    private final zzik zzf;
    private zzhw zzg;
    private HttpURLConnection zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzid(String str, int i, int i2, boolean z, boolean z2, zzik zzikVar, zzgul zzgulVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzikVar;
        this.zzf = new zzik();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final HttpURLConnection zzk(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
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
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty("Range", sb);
                }
                str = this.zzd;
                if (str != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str);
                }
                httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = zzhw.zzh;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        StringBuilder sb2 = new StringBuilder("bytes=");
        sb2.append(j);
        sb2.append("-");
        if (j2 != -1) {
            sb2.append((j + j2) - 1);
        }
        sb = sb2.toString();
        if (sb != null) {
        }
        str = this.zzd;
        if (str != null) {
        }
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = zzhw.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final URL zzl(URL url, String str, zzhw zzhwVar) throws zzih {
        if (str == null) {
            throw new zzih("Null location redirect", zzhwVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                String.valueOf(protocol);
                throw new zzih("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzhwVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb = new StringBuilder(String.valueOf(protocol2).length() + 40 + String.valueOf(protocol).length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new zzih(sb.toString(), zzhwVar, 2001, 1);
        } catch (MalformedURLException e) {
            throw new zzih(e, zzhwVar, 2001, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzeh.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzih {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            InputStream inputStream = this.zzi;
            String str = zzfm.zza;
            InputStream inputStream2 = inputStream;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (IOException e) {
            zzhw zzhwVar = this.zzg;
            String str2 = zzfm.zza;
            throw zzih.zza(e, zzhwVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d0, code lost:
    
        if (r8 == 0) goto L40;
     */
    @Override // com.google.android.gms.internal.ads.zzhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhw zzhwVar) throws zzih {
        int i;
        URL url;
        long j;
        long j2;
        boolean zza;
        HttpURLConnection httpURLConnection;
        String str;
        byte[] bArr;
        long j3;
        this.zzg = zzhwVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzf(zzhwVar);
        try {
            Thread currentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            url = new URL(zzhwVar.zza.toString());
            int i2 = zzhwVar.zzb;
            byte[] bArr2 = zzhwVar.zzc;
            j = zzhwVar.zze;
            j2 = zzhwVar.zzf;
            zza = zzhwVar.zza(1);
            try {
            } catch (IOException e) {
                e = e;
                i = 1;
            }
        } catch (IOException e2) {
            e = e2;
            i = 1;
        }
        if (this.zza) {
            URL url2 = url;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 > 20) {
                    i = 1;
                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i4);
                    throw new zzih(new NoRouteToHostException(sb.toString()), zzhwVar, 2001, 1);
                }
                long j4 = j2;
                long j5 = j;
                URL url3 = url2;
                HttpURLConnection zzk = zzk(url2, 1, null, j, j2, zza, false, zzhwVar.zzd);
                int responseCode = zzk.getResponseCode();
                String headerField = zzk.getHeaderField(HttpHeaders.LOCATION);
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = zzk;
                    break;
                }
                i = 1;
                try {
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzhwVar);
                    i3 = i4;
                    j2 = j4;
                    j = j5;
                } catch (IOException e3) {
                    e = e3;
                }
                e = e3;
                zzm();
                throw zzih.zza(e, zzhwVar, i);
            }
        }
        httpURLConnection = zzk(url, 1, null, j, j2, zza, true, zzhwVar.zzd);
        this.zzh = httpURLConnection;
        this.zzk = httpURLConnection.getResponseCode();
        String responseMessage = httpURLConnection.getResponseMessage();
        int i5 = this.zzk;
        if (i5 < 200 || i5 > 299) {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.zzk == 416) {
                str = responseMessage;
                if (zzhwVar.zze == zzim.zza(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE))) {
                    this.zzj = true;
                    zzg(zzhwVar);
                    long j6 = zzhwVar.zzf;
                    if (j6 != -1) {
                        return j6;
                    }
                    return 0L;
                }
            } else {
                str = responseMessage;
            }
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bArr = errorStream != null ? zzham.zza(errorStream) : zzfm.zzb;
            } catch (IOException unused) {
                bArr = zzfm.zzb;
            }
            byte[] bArr3 = bArr;
            zzm();
            throw new zzij(this.zzk, str, this.zzk == 416 ? new zzht(2008) : null, headerFields, zzhwVar, bArr3);
        }
        httpURLConnection.getContentType();
        if (this.zzk == 200) {
            j3 = zzhwVar.zze;
        }
        j3 = 0;
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_ENCODING));
        if (equalsIgnoreCase) {
            this.zzl = zzhwVar.zzf;
        } else {
            long j7 = zzhwVar.zzf;
            if (j7 != -1) {
                this.zzl = j7;
            } else {
                long zzb = zzim.zzb(httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField(HttpHeaders.CONTENT_RANGE));
                this.zzl = zzb != -1 ? zzb - j3 : -1L;
            }
        }
        try {
            this.zzi = httpURLConnection.getInputStream();
            if (equalsIgnoreCase) {
                this.zzi = new GZIPInputStream(this.zzi);
            }
            this.zzj = true;
            zzg(zzhwVar);
            if (j3 != 0) {
                try {
                    byte[] bArr4 = new byte[4096];
                    while (j3 > 0) {
                        int min = (int) Math.min(j3, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                        InputStream inputStream = this.zzi;
                        String str2 = zzfm.zza;
                        InputStream inputStream2 = inputStream;
                        int read = inputStream.read(bArr4, 0, min);
                        if (Thread.currentThread().isInterrupted()) {
                            throw new zzih(new InterruptedIOException(), zzhwVar, 2000, 1);
                        }
                        if (read == -1) {
                            throw new zzih(zzhwVar, 2008, 1);
                        }
                        j3 -= read;
                        zzh(read);
                    }
                } catch (IOException e4) {
                    zzm();
                    if (e4 instanceof zzih) {
                        throw ((zzih) e4);
                    }
                    throw new zzih(e4, zzhwVar, 2000, 1);
                }
            }
            return this.zzl;
        } catch (IOException e5) {
            zzm();
            throw new zzih(e5, zzhwVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        zzhw zzhwVar = this.zzg;
        if (zzhwVar != null) {
            return zzhwVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws zzih {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    zzhw zzhwVar = this.zzg;
                    String str = zzfm.zza;
                    zzhw zzhwVar2 = zzhwVar;
                    throw new zzih(e, zzhwVar, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzm();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
            this.zzh = null;
            this.zzg = null;
            TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs, com.google.android.gms.internal.ads.zzil
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? zzgxp.zza() : new zzic(httpURLConnection.getHeaderFields());
    }
}
