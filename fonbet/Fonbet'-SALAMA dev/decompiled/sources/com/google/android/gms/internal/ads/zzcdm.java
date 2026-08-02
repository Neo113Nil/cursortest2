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

/* loaded from: classes.dex */
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
    public final int zza(byte[] bArr, int i7, int i8) {
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
            long j9 = j7 + j8 + this.zzr;
            long j10 = this.zzp;
            long j11 = j10 + 1;
            if (j9 > j11) {
                long j12 = this.zzo;
                if (j10 < j12) {
                    long min = Math.min(j12, Math.max(((this.zzq + j11) - r3) - 1, (-1) + j11 + j8));
                    zzk(j11, min, 2);
                    this.zzp = min;
                    j10 = min;
                }
            }
            int read = this.zzi.read(bArr, i7, (int) Math.min(j8, ((j10 + 1) - this.zzn) - this.zzm));
            if (read == -1) {
                throw new EOFException();
            }
            this.zzm += read;
            zzg(read);
            return read;
        } catch (IOException e7) {
            throw new zzgo(e7, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfx
    public final long zzb(zzgc zzgcVar) {
        this.zzf = zzgcVar;
        this.zzm = 0L;
        long j = zzgcVar.zze;
        long j3 = zzgcVar.zzf;
        long min = j3 == -1 ? this.zzq : Math.min(this.zzq, j3);
        this.zzn = j;
        HttpURLConnection zzk = zzk(j, (min + j) - 1, 1);
        this.zzg = zzk;
        String headerField = zzk.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long parseLong = Long.parseLong(matcher.group(2));
                    long parseLong2 = Long.parseLong(matcher.group(3));
                    long j7 = zzgcVar.zzf;
                    if (j7 != -1) {
                        this.zzl = j7;
                        this.zzo = Math.max(parseLong, (this.zzn + j7) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzj(zzgcVar);
                    return this.zzl;
                } catch (NumberFormatException unused) {
                    String h6 = AbstractC0486a1.h("Unexpected Content-Range [", headerField, "]");
                    int i7 = J.f3546b;
                    j.d(h6);
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
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzh();
            }
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

    public final HttpURLConnection zzk(long j, long j3, int i7) {
        String uri = this.zzf.zza.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri).openConnection();
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
            String uri2 = this.zzf.zza.toString();
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
                throw new zzgo("Unable to connect to ".concat(String.valueOf(uri2)), e8, this.zzf, 2000, i7);
            }
        } catch (IOException e9) {
            throw new zzgo("Unable to connect to ".concat(String.valueOf(uri)), e9, this.zzf, 2000, i7);
        }
    }
}
