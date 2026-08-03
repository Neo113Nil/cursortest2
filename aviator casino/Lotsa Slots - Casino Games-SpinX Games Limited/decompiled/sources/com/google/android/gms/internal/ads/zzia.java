package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzia extends com.google.android.gms.internal.ads.zzhh implements com.google.android.gms.internal.ads.zzii {
    private final boolean zza;
    private final int zzb;
    private final int zzc;
    private final java.lang.String zzd;
    private final com.google.android.gms.internal.ads.zzih zze;
    private final com.google.android.gms.internal.ads.zzih zzf;
    private com.google.android.gms.internal.ads.zzht zzg;
    private java.net.HttpURLConnection zzh;
    private java.io.InputStream zzi;
    private boolean zzj;
    private int zzk;
    private long zzl;
    private long zzm;

    /* synthetic */ zzia(java.lang.String str, int i, int i2, boolean z, boolean z2, com.google.android.gms.internal.ads.zzih zzihVar, com.google.android.gms.internal.ads.zzgtk zzgtkVar, boolean z3, byte[] bArr) {
        super(true);
        this.zzd = str;
        this.zzb = i;
        this.zzc = i2;
        this.zza = z;
        this.zze = zzihVar;
        this.zzf = new com.google.android.gms.internal.ads.zzih();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.net.HttpURLConnection zzk(java.net.URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, java.util.Map map) throws java.io.IOException {
        java.lang.String sb;
        java.lang.String str;
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzb);
        httpURLConnection.setReadTimeout(this.zzc);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.putAll(this.zze.zza());
        hashMap.putAll(this.zzf.zza());
        hashMap.putAll(map);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (j == 0) {
            if (j2 == -1) {
                sb = null;
                if (sb != null) {
                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, sb);
                }
                str = this.zzd;
                if (str != null) {
                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, str);
                }
                httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
                httpURLConnection.setInstanceFollowRedirects(z2);
                httpURLConnection.setDoOutput(false);
                int i2 = com.google.android.gms.internal.ads.zzht.zzh;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.connect();
                return httpURLConnection;
            }
            j = 0;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("bytes=");
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
        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, true == z ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(false);
        int i22 = com.google.android.gms.internal.ads.zzht.zzh;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private final java.net.URL zzl(java.net.URL url, java.lang.String str, com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzie {
        if (str == null) {
            throw new com.google.android.gms.internal.ads.zzie("Null location redirect", zzhtVar, 2001, 1);
        }
        try {
            java.net.URL url2 = new java.net.URL(url, str);
            java.lang.String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                java.lang.String.valueOf(protocol);
                throw new com.google.android.gms.internal.ads.zzie("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)), zzhtVar, 2001, 1);
            }
            if (this.zza || protocol.equals(url.getProtocol())) {
                return url2;
            }
            java.lang.String protocol2 = url.getProtocol();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(protocol2).length() + 40 + java.lang.String.valueOf(protocol).length() + 1);
            sb.append("Disallowed cross-protocol redirect (");
            sb.append(protocol2);
            sb.append(" to ");
            sb.append(protocol);
            sb.append(")");
            throw new com.google.android.gms.internal.ads.zzie(sb.toString(), zzhtVar, 2001, 1);
        } catch (java.net.MalformedURLException e) {
            throw new com.google.android.gms.internal.ads.zzie(e, zzhtVar, 2001, 1);
        }
    }

    private final void zzm() {
        java.net.HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
                com.google.android.gms.internal.ads.zzeg.zzf("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
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
            if (j != -1) {
                long j2 = j - this.zzm;
                if (j2 != 0) {
                    i2 = (int) java.lang.Math.min(i2, j2);
                }
                return -1;
            }
            java.io.InputStream inputStream = this.zzi;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            java.io.InputStream inputStream2 = inputStream;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzm += read;
            zzh(read);
            return read;
        } catch (java.io.IOException e) {
            com.google.android.gms.internal.ads.zzht zzhtVar = this.zzg;
            java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
            throw com.google.android.gms.internal.ads.zzie.zza(e, zzhtVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00cc, code lost:
    
        if (r8 == 0) goto L37;
     */
    @Override // com.google.android.gms.internal.ads.zzhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzie {
        int i;
        java.net.URL url;
        long j;
        long j2;
        boolean zza;
        java.net.HttpURLConnection httpURLConnection;
        java.lang.String str;
        byte[] bArr;
        long j3;
        this.zzg = zzhtVar;
        this.zzm = 0L;
        this.zzl = 0L;
        zzf(zzhtVar);
        try {
            java.lang.Thread currentThread = java.lang.Thread.currentThread();
            android.net.TrafficStats.setThreadStatsTag((int) (android.os.Build.VERSION.SDK_INT < 36 ? currentThread.getId() : currentThread.threadId()));
            url = new java.net.URL(zzhtVar.zza.toString());
            int i2 = zzhtVar.zzb;
            byte[] bArr2 = zzhtVar.zzc;
            j = zzhtVar.zze;
            j2 = zzhtVar.zzf;
            zza = zzhtVar.zza(1);
        } catch (java.io.IOException e) {
            e = e;
            i = 1;
        }
        if (this.zza) {
            java.net.URL url2 = url;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 > 20) {
                    i = 1;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i4).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i4);
                    throw new com.google.android.gms.internal.ads.zzie(new java.net.NoRouteToHostException(sb.toString()), zzhtVar, 2001, 1);
                }
                long j4 = j2;
                long j5 = j;
                java.net.URL url3 = url2;
                java.net.HttpURLConnection zzk = zzk(url2, 1, null, j, j2, zza, false, zzhtVar.zzd);
                int responseCode = zzk.getResponseCode();
                java.lang.String headerField = zzk.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    httpURLConnection = zzk;
                    break;
                }
                i = 1;
                try {
                    zzk.disconnect();
                    url2 = zzl(url3, headerField, zzhtVar);
                    i3 = i4;
                    j2 = j4;
                    j = j5;
                } catch (java.io.IOException e2) {
                    e = e2;
                }
                e = e2;
                zzm();
                throw com.google.android.gms.internal.ads.zzie.zza(e, zzhtVar, i);
            }
        }
        httpURLConnection = zzk(url, 1, null, j, j2, zza, true, zzhtVar.zzd);
        this.zzh = httpURLConnection;
        this.zzk = httpURLConnection.getResponseCode();
        java.lang.String responseMessage = httpURLConnection.getResponseMessage();
        int i5 = this.zzk;
        if (i5 < 200 || i5 > 299) {
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = httpURLConnection.getHeaderFields();
            if (this.zzk == 416) {
                str = responseMessage;
                if (zzhtVar.zze == com.google.android.gms.internal.ads.zzij.zza(httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE))) {
                    this.zzj = true;
                    zzg(zzhtVar);
                    long j6 = zzhtVar.zzf;
                    if (j6 != -1) {
                        return j6;
                    }
                    return 0L;
                }
            } else {
                str = responseMessage;
            }
            java.io.InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                bArr = errorStream != null ? com.google.android.gms.internal.ads.zzgzm.zza(errorStream) : com.google.android.gms.internal.ads.zzfl.zzb;
            } catch (java.io.IOException unused) {
                bArr = com.google.android.gms.internal.ads.zzfl.zzb;
            }
            byte[] bArr3 = bArr;
            zzm();
            throw new com.google.android.gms.internal.ads.zzig(this.zzk, str, this.zzk == 416 ? new com.google.android.gms.internal.ads.zzhq(2008) : null, headerFields, zzhtVar, bArr3);
        }
        httpURLConnection.getContentType();
        if (this.zzk == 200) {
            j3 = zzhtVar.zze;
        }
        j3 = 0;
        boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_ENCODING));
        if (equalsIgnoreCase) {
            this.zzl = zzhtVar.zzf;
        } else {
            long j7 = zzhtVar.zzf;
            if (j7 != -1) {
                this.zzl = j7;
            } else {
                long zzb = com.google.android.gms.internal.ads.zzij.zzb(httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH), httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE));
                this.zzl = zzb != -1 ? zzb - j3 : -1L;
            }
        }
        try {
            this.zzi = httpURLConnection.getInputStream();
            if (equalsIgnoreCase) {
                this.zzi = new java.util.zip.GZIPInputStream(this.zzi);
            }
            this.zzj = true;
            zzg(zzhtVar);
            if (j3 != 0) {
                try {
                    byte[] bArr4 = new byte[4096];
                    while (j3 > 0) {
                        int min = (int) java.lang.Math.min(j3, android.support.v4.media.session.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                        java.io.InputStream inputStream = this.zzi;
                        java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                        java.io.InputStream inputStream2 = inputStream;
                        int read = inputStream.read(bArr4, 0, min);
                        if (java.lang.Thread.currentThread().isInterrupted()) {
                            throw new com.google.android.gms.internal.ads.zzie(new java.io.InterruptedIOException(), zzhtVar, 2000, 1);
                        }
                        if (read == -1) {
                            throw new com.google.android.gms.internal.ads.zzie(zzhtVar, 2008, 1);
                        }
                        j3 -= read;
                        zzh(read);
                    }
                } catch (java.io.IOException e3) {
                    zzm();
                    if (e3 instanceof com.google.android.gms.internal.ads.zzie) {
                        throw ((com.google.android.gms.internal.ads.zzie) e3);
                    }
                    throw new com.google.android.gms.internal.ads.zzie(e3, zzhtVar, 2000, 1);
                }
            }
            return this.zzl;
        } catch (java.io.IOException e4) {
            zzm();
            throw new com.google.android.gms.internal.ads.zzie(e4, zzhtVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        java.net.HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection != null) {
            return android.net.Uri.parse(httpURLConnection.getURL().toString());
        }
        com.google.android.gms.internal.ads.zzht zzhtVar = this.zzg;
        if (zzhtVar != null) {
            return zzhtVar.zza;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws com.google.android.gms.internal.ads.zzie {
        try {
            java.io.InputStream inputStream = this.zzi;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    com.google.android.gms.internal.ads.zzht zzhtVar = this.zzg;
                    java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                    com.google.android.gms.internal.ads.zzht zzhtVar2 = zzhtVar;
                    throw new com.google.android.gms.internal.ads.zzie(e, zzhtVar, 2000, 3);
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
            android.net.TrafficStats.clearThreadStatsTag();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzhp
    public final java.util.Map zzj() {
        java.net.HttpURLConnection httpURLConnection = this.zzh;
        return httpURLConnection == null ? com.google.android.gms.internal.ads.zzgwp.zza() : new com.google.android.gms.internal.ads.zzhz(httpURLConnection.getHeaderFields());
    }
}
