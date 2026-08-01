package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.google.common.net.HttpHeaders;
import com.ironsource.U3;
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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzckd extends zzhk implements zzil {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzik zzg;
    private zzhw zzh;
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

    zzckd(String str, zziq zziqVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new zzckc(this);
        this.zzr = new HashSet();
        zzdh.zza(str);
        this.zzf = str;
        this.zzg = new zzik();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zziqVar != null) {
            zze(zziqVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x012f, code lost:
    
        if (r2 == 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a7 A[Catch: IOException -> 0x0300, TryCatch #3 {IOException -> 0x0300, blocks: (B:3:0x000e, B:4:0x0027, B:6:0x002d, B:8:0x003d, B:9:0x0045, B:10:0x005d, B:12:0x0063, B:19:0x0093, B:21:0x00b9, B:22:0x00d8, B:23:0x00dd, B:25:0x00e6, B:26:0x00ed, B:40:0x0115, B:103:0x029a, B:105:0x02a7, B:107:0x02b8, B:113:0x02c1, B:114:0x02d1, B:117:0x02da, B:118:0x02e1, B:122:0x02e2, B:123:0x02ff), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6 A[Catch: IOException -> 0x0300, TryCatch #3 {IOException -> 0x0300, blocks: (B:3:0x000e, B:4:0x0027, B:6:0x002d, B:8:0x003d, B:9:0x0045, B:10:0x005d, B:12:0x0063, B:19:0x0093, B:21:0x00b9, B:22:0x00d8, B:23:0x00dd, B:25:0x00e6, B:26:0x00ed, B:40:0x0115, B:103:0x029a, B:105:0x02a7, B:107:0x02b8, B:113:0x02c1, B:114:0x02d1, B:117:0x02da, B:118:0x02e1, B:122:0x02e2, B:123:0x02ff), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzhs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(zzhw zzhwVar) throws zzih {
        long j;
        long j2;
        int responseCode;
        String headerField;
        int responseCode2;
        long j3;
        long parseLong;
        String headerField2;
        this.zzh = zzhwVar;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzhwVar.zza.toString());
            byte[] bArr = zzhwVar.zzc;
            long j4 = zzhwVar.zze;
            long j5 = zzhwVar.zzf;
            boolean zza2 = zzhwVar.zza(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i2);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Iterator it = this.zzg.zza().entrySet().iterator(); it.hasNext(); it = it) {
                    Map.Entry entry = (Map.Entry) it.next();
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j4 != 0) {
                    j = j4;
                } else if (j5 != -1) {
                    j = 0;
                } else {
                    j2 = j4;
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zza2) {
                        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzij zzijVar = new zzij(this.zzl, null, null, headerFields, zzhwVar, zzfm.zzb);
                                if (this.zzl == 416) {
                                    throw zzijVar;
                                }
                                zzijVar.initCause(new zzht(2008));
                                throw zzijVar;
                            }
                            if (responseCode2 == 200) {
                                j3 = zzhwVar.zze;
                            }
                            j3 = 0;
                            this.zzm = j3;
                            if (zzhwVar.zza(1)) {
                                this.zzn = zzhwVar.zzf;
                            } else {
                                long j6 = zzhwVar.zzf;
                                if (j6 != -1) {
                                    this.zzn = j6;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField3 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        try {
                                            parseLong = Long.parseLong(headerField3);
                                        } catch (NumberFormatException unused) {
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(headerField3).length() + 28);
                                            sb2.append("Unexpected Content-Length [");
                                            sb2.append(headerField3);
                                            sb2.append(U3.j.e);
                                            String sb3 = sb2.toString();
                                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb3);
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                        if (!TextUtils.isEmpty(headerField2)) {
                                            Matcher matcher = zza.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                    if (parseLong < 0) {
                                                        parseLong = parseLong2;
                                                    } else if (parseLong != parseLong2) {
                                                        StringBuilder sb4 = new StringBuilder(String.valueOf(headerField3).length() + 25 + String.valueOf(headerField2).length() + 1);
                                                        sb4.append("Inconsistent headers [");
                                                        sb4.append(headerField3);
                                                        sb4.append("] [");
                                                        sb4.append(headerField2);
                                                        sb4.append(U3.j.e);
                                                        String sb5 = sb4.toString();
                                                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb5);
                                                        parseLong = Math.max(parseLong, parseLong2);
                                                    }
                                                } catch (NumberFormatException unused2) {
                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                                    sb6.append("Unexpected Content-Range [");
                                                    sb6.append(headerField2);
                                                    sb6.append(U3.j.e);
                                                    String sb7 = sb6.toString();
                                                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzf(sb7);
                                                }
                                            }
                                        }
                                        this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                    }
                                    parseLong = -1;
                                    headerField2 = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_RANGE);
                                    if (!TextUtils.isEmpty(headerField2)) {
                                    }
                                    this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzg(zzhwVar);
                                return this.zzn;
                            } catch (IOException e) {
                                zzn();
                                throw new zzih(e, zzhwVar, 2000, 1);
                            }
                        } catch (IOException e2) {
                            zzn();
                            String uri = zzhwVar.zza.toString();
                            String.valueOf(uri);
                            throw new zzih("Unable to connect to ".concat(String.valueOf(uri)), e2, zzhwVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                        String.valueOf(protocol);
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j4 = j2;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j).length() + 7);
                sb8.append("bytes=");
                j2 = j4;
                long j7 = j;
                sb8.append(j7);
                sb8.append("-");
                String sb9 = sb8.toString();
                if (j5 != -1) {
                    long j8 = (j7 + j5) - 1;
                    StringBuilder sb10 = new StringBuilder(sb9.length() + String.valueOf(j8).length());
                    sb10.append(sb9);
                    sb10.append(j8);
                    sb9 = sb10.toString();
                }
                httpURLConnection.setRequestProperty("Range", sb9);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zza2) {
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.zzi = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.zzl = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    Map<String, List<String>> headerFields2 = this.zzi.getHeaderFields();
                    zzn();
                    zzij zzijVar2 = new zzij(this.zzl, null, null, headerFields2, zzhwVar, zzfm.zzb);
                    if (this.zzl == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (IOException e3) {
            String uri2 = zzhwVar.zza.toString();
            String.valueOf(uri2);
            throw new zzih("Unable to connect to ".concat(String.valueOf(uri2)), e3, zzhwVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhs
    public final void zzd() throws zzih {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzih(e, this.zzh, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhs, com.google.android.gms.internal.ads.zzil
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzk(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    final /* synthetic */ int zzm() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws zzih {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.zzj.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzo += read;
                    zzh(read);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzj.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += read2;
            zzh(read2);
            return read2;
        } catch (IOException e) {
            throw new zzih(e, this.zzh, 2000, 2);
        }
    }
}
