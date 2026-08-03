package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzckf extends com.google.android.gms.internal.ads.zzhh implements com.google.android.gms.internal.ads.zzii {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzih zze;
    private com.google.android.gms.internal.ads.zzht zzf;
    private java.net.HttpURLConnection zzg;
    private final java.util.Queue zzh;
    private java.io.InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private final long zzq;
    private final long zzr;

    zzckf(java.lang.String str, com.google.android.gms.internal.ads.zzin zzinVar, int i, int i2, long j, long j2) {
        super(true);
        com.google.android.gms.internal.ads.zzdg.zza(str);
        this.zzd = str;
        this.zze = new com.google.android.gms.internal.ads.zzih();
        this.zzb = i;
        this.zzc = i2;
        this.zzh = new java.util.ArrayDeque();
        this.zzq = j;
        this.zzr = j2;
        if (zzinVar != null) {
            zze(zzinVar);
        }
    }

    private final void zzl() {
        while (true) {
            java.util.Queue queue = this.zzh;
            if (queue.isEmpty()) {
                this.zzg = null;
                return;
            }
            try {
                ((java.net.HttpURLConnection) queue.remove()).disconnect();
            } catch (java.lang.Exception e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzie {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzl;
            long j2 = this.zzm;
            if (j - j2 == 0) {
                return -1;
            }
            long j3 = this.zzn + j2;
            long j4 = i2;
            long j5 = j3 + j4 + this.zzr;
            long j6 = this.zzp;
            long j7 = j6 + 1;
            if (j5 > j7) {
                long j8 = this.zzo;
                if (j6 < j8) {
                    long min = java.lang.Math.min(j8, java.lang.Math.max(((this.zzq + j7) - r3) - 1, (-1) + j7 + j4));
                    zzk(j7, min, 2);
                    this.zzp = min;
                    j6 = min;
                }
            }
            int read = this.zzi.read(bArr, i, (int) java.lang.Math.min(j4, ((j6 + 1) - this.zzn) - this.zzm));
            if (read == -1) {
                throw new java.io.EOFException();
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzie(e, this.zzf, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzie {
        this.zzf = zzhtVar;
        this.zzm = 0L;
        long j = zzhtVar.zze;
        long j2 = zzhtVar.zzf;
        long min = j2 == -1 ? this.zzq : java.lang.Math.min(this.zzq, j2);
        this.zzn = j;
        java.net.HttpURLConnection zzk = zzk(j, (min + j) - 1, 1);
        this.zzg = zzk;
        java.lang.String headerField = zzk.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
        if (!android.text.TextUtils.isEmpty(headerField)) {
            java.util.regex.Matcher matcher = zza.matcher(headerField);
            if (matcher.find()) {
                try {
                    java.lang.Long.parseLong(matcher.group(1));
                    long parseLong = java.lang.Long.parseLong(matcher.group(2));
                    long parseLong2 = java.lang.Long.parseLong(matcher.group(3));
                    long j3 = zzhtVar.zzf;
                    if (j3 != -1) {
                        this.zzl = j3;
                        this.zzo = java.lang.Math.max(parseLong, (this.zzn + j3) - 1);
                    } else {
                        this.zzl = parseLong2 - this.zzn;
                        this.zzo = parseLong2 - 1;
                    }
                    this.zzp = parseLong;
                    this.zzj = true;
                    zzg(zzhtVar);
                    return this.zzl;
                } catch (java.lang.NumberFormatException unused) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(headerField).length() + 27);
                    sb.append("Unexpected Content-Range [");
                    sb.append(headerField);
                    sb.append(com.ironsource.X3.j.e);
                    java.lang.String sb2 = sb.toString();
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(sb2);
                }
            }
        }
        throw new com.google.android.gms.internal.ads.zzckd(headerField, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        java.net.HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws com.google.android.gms.internal.ads.zzie {
        try {
            java.io.InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    throw new com.google.android.gms.internal.ads.zzie(e, this.zzf, 2000, 3);
                }
            }
        } finally {
            this.zzi = null;
            zzl();
            if (this.zzj) {
                this.zzj = false;
                zzi();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzhp
    public final java.util.Map zzj() {
        java.net.HttpURLConnection httpURLConnection = this.zzg;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final java.net.HttpURLConnection zzk(long j, long j2, int i) throws com.google.android.gms.internal.ads.zzie {
        java.lang.String uri = this.zzf.zza.toString();
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(uri).openConnection();
            httpURLConnection.setConnectTimeout(this.zzb);
            httpURLConnection.setReadTimeout(this.zzc);
            for (java.util.Map.Entry entry : this.zze.zza().entrySet()) {
                httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 7 + java.lang.String.valueOf(j2).length());
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            sb.append(j2);
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, sb.toString());
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.zzd);
            httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.zzh.add(httpURLConnection);
            java.lang.String uri2 = this.zzf.zza.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.zzk = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
                    zzl();
                    throw new com.google.android.gms.internal.ads.zzcke(this.zzk, headerFields, this.zzf, i);
                }
                try {
                    java.io.InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.zzi != null) {
                        inputStream = new java.io.SequenceInputStream(this.zzi, inputStream);
                    }
                    this.zzi = inputStream;
                    return httpURLConnection;
                } catch (java.io.IOException e) {
                    zzl();
                    throw new com.google.android.gms.internal.ads.zzie(e, this.zzf, 2000, i);
                }
            } catch (java.io.IOException e2) {
                zzl();
                java.lang.String.valueOf(uri2);
                java.lang.String valueOf = java.lang.String.valueOf(uri2);
                throw new com.google.android.gms.internal.ads.zzie("Unable to connect to ".concat(valueOf), e2, this.zzf, 2000, i);
            }
        } catch (java.io.IOException e3) {
            java.lang.String.valueOf(uri);
            java.lang.String valueOf2 = java.lang.String.valueOf(uri);
            throw new com.google.android.gms.internal.ads.zzie("Unable to connect to ".concat(valueOf2), e3, this.zzf, 2000, i);
        }
    }
}
