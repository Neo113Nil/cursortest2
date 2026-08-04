package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import W5.AbstractC0486a1;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
final class zzcdm extends zzfq implements zzgs {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private final zzgr zze;
    private zzgc zzf;
    private HttpURLConnection zzg;
    private final Queue zzh;
    private InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    public zzcdm(String str, zzgx zzgxVar, int i7, int i8, long j, long j3) {
        super(true);
        zzcv.zzc(str);
        this.zzd = str;
        this.zze = new zzgr();
        this.zzb = i7;
        this.zzc = i8;
        this.zzh = new ArrayDeque();
        this.zzq = j;
        this.zzr = j3;
        if (zzgxVar != null) {
            zzf(zzgxVar);
        }
    }

    private final void zzl() {
        while (!this.zzh.isEmpty()) {
            try {
                ((HttpURLConnection) this.zzh.remove()).disconnect();
            } catch (Exception e7) {
                int i7 = J.f3546b;
                j.e("Unexpected error while disconnecting", e7);
            }
        }
        this.zzg = null;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i7, int i8) throws zzgo {
        if (i8 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j3 = this.zzm;
            if (j - j3 == 0) {
                return -1;
            }
            long j7 = this.zzn + j3;
            long j8 = i8;
            long j9 = this.zzr;
            long j10 = j7 + j8 + j9;
            long j11 = this.zzp;
            long j12 = j11 + 1;
            if (j10 > j12) {
                long j13 = this.zzo;
                if (j11 < j13) {
                    long jMin = Math.min(j13, Math.max(((this.zzq + j12) - j9) - 1, (-1) + j12 + j8));
                    zzk(j12, jMin, 2);
                    this.zzp = jMin;
                    j11 = jMin;
                }
            }
            int i9 = this.zzi.read(bArr, i7, (int) Math.min(j8, ((j11 + 1) - this.zzn) - this.zzm));
            if (i9 == -1) {
                throw new EOFException();
            }
            this.zzm += (long) i9;
            zzg(i9);
            return i9;
        } catch (IOException e7) {
            throw new zzgo(e7, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) throws zzgo {
        this.zzf = zzgcVar;
        this.zzm = 0L;
        long j = zzgcVar.zze;
        long j3 = zzgcVar.zzf;
        long jMin = j3 == -1 ? this.zzq : Math.min(this.zzq, j3);
        this.zzn = j;
        HttpURLConnection httpURLConnectionZzk = zzk(j, (jMin + j) - 1, 1);
        this.zzg = httpURLConnectionZzk;
        String headerField = httpURLConnectionZzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j7 = Long.parseLong(matcher.group(2));
                    long j8 = Long.parseLong(matcher.group(3));
                    long j9 = zzgcVar.zzf;
                    if (j9 != -1) {
                        this.zzl = j9;
                        this.zzo = Math.max(j7, (this.zzn + j9) - 1);
                    } else {
                        this.zzl = j8 - this.zzn;
                        this.zzo = j8 - 1;
                    }
                    this.zzp = j7;
                    this.zzj = true;
                    zzj(zzgcVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String strH = AbstractC0486a1.h("Unexpected Content-Range [", headerField, "]");
                    int i7 = J.f3546b;
                    j.d(strH);
                }
            }
        }
        throw new zzcdk(headerField, zzgcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final void zzd() {
        try {
            InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    throw new zzgo(e7, this.zzf, 2000, 3);
                }
            }
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
        } catch (Throwable th) {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfq, com.google.android.gms.internal.ads.zzfx
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final HttpURLConnection zzk(long j, long j3, int i7) throws zzgo {
        String string = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j + "-" + j3);
            httpURLConnection.setRequestProperty("User-Agent", this.zzd);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            String string2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new zzcdl(this.zzk, headerFields, this.zzf, i7);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (IOException e7) {
                    zzl();
                    throw new zzgo(e7, this.zzf, 2000, i7);
                }
            } catch (IOException e8) {
                zzl();
                throw new zzgo("Unable to connect to ".concat(String.valueOf(string2)), e8, this.zzf, 2000, i7);
            }
        } catch (IOException e9) {
            throw new zzgo("Unable to connect to ".concat(String.valueOf(string)), e9, this.zzf, 2000, i7);
        }
    }
}
