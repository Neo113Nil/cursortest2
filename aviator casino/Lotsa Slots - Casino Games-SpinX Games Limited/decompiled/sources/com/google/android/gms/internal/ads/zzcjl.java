package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzcjl extends com.google.android.gms.internal.ads.zzhh implements com.google.android.gms.internal.ads.zzii {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference();
    private final javax.net.ssl.SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final java.lang.String zzf;
    private final com.google.android.gms.internal.ads.zzih zzg;
    private com.google.android.gms.internal.ads.zzht zzh;
    private java.net.HttpURLConnection zzi;
    private java.io.InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final java.util.Set zzr;

    zzcjl(java.lang.String str, com.google.android.gms.internal.ads.zzin zzinVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new com.google.android.gms.internal.ads.zzcjk(this);
        this.zzr = new java.util.HashSet();
        com.google.android.gms.internal.ads.zzdg.zza(str);
        this.zzf = str;
        this.zzg = new com.google.android.gms.internal.ads.zzih();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzinVar != null) {
            zze(zzinVar);
        }
    }

    private final void zzn() {
        java.net.HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (java.lang.Exception e) {
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
    @Override // com.google.android.gms.internal.ads.zzhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzb(com.google.android.gms.internal.ads.zzht zzhtVar) throws com.google.android.gms.internal.ads.zzie {
        long j;
        long j2;
        int responseCode;
        java.lang.String headerField;
        int responseCode2;
        long j3;
        long parseLong;
        java.lang.String headerField2;
        this.zzh = zzhtVar;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            java.net.URL url = new java.net.URL(zzhtVar.zza.toString());
            byte[] bArr = zzhtVar.zzc;
            long j4 = zzhtVar.zze;
            long j5 = zzhtVar.zzf;
            boolean zza2 = zzhtVar.zza(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 20);
                    sb.append("Too many redirects: ");
                    sb.append(i2);
                    throw new java.net.NoRouteToHostException(sb.toString());
                }
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof javax.net.ssl.HttpsURLConnection) {
                    ((javax.net.ssl.HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (java.util.Iterator it = this.zzg.zza().entrySet().iterator(); it.hasNext(); it = it) {
                    java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                    httpURLConnection.setRequestProperty((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
                }
                if (j4 != 0) {
                    j = j4;
                } else if (j5 != -1) {
                    j = 0;
                } else {
                    j2 = j4;
                    httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.zzf);
                    if (!zza2) {
                        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT_ENCODING, "identity");
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
                                java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                com.google.android.gms.internal.ads.zzig zzigVar = new com.google.android.gms.internal.ads.zzig(this.zzl, null, null, headerFields, zzhtVar, com.google.android.gms.internal.ads.zzfl.zzb);
                                if (this.zzl == 416) {
                                    throw zzigVar;
                                }
                                zzigVar.initCause(new com.google.android.gms.internal.ads.zzhq(2008));
                                throw zzigVar;
                            }
                            if (responseCode2 == 200) {
                                j3 = zzhtVar.zze;
                            }
                            j3 = 0;
                            this.zzm = j3;
                            if (zzhtVar.zza(1)) {
                                this.zzn = zzhtVar.zzf;
                            } else {
                                long j6 = zzhtVar.zzf;
                                if (j6 != -1) {
                                    this.zzn = j6;
                                } else {
                                    java.net.HttpURLConnection httpURLConnection2 = this.zzi;
                                    java.lang.String headerField3 = httpURLConnection2.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_LENGTH);
                                    if (!android.text.TextUtils.isEmpty(headerField3)) {
                                        try {
                                            parseLong = java.lang.Long.parseLong(headerField3);
                                        } catch (java.lang.NumberFormatException unused) {
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(headerField3).length() + 28);
                                            sb2.append("Unexpected Content-Length [");
                                            sb2.append(headerField3);
                                            sb2.append(com.ironsource.X3.j.e);
                                            java.lang.String sb3 = sb2.toString();
                                            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(sb3);
                                        }
                                        headerField2 = httpURLConnection2.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
                                        if (!android.text.TextUtils.isEmpty(headerField2)) {
                                            java.util.regex.Matcher matcher = zza.matcher(headerField2);
                                            if (matcher.find()) {
                                                try {
                                                    long parseLong2 = (java.lang.Long.parseLong(matcher.group(2)) - java.lang.Long.parseLong(matcher.group(1))) + 1;
                                                    if (parseLong < 0) {
                                                        parseLong = parseLong2;
                                                    } else if (parseLong != parseLong2) {
                                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(headerField3).length() + 25 + java.lang.String.valueOf(headerField2).length() + 1);
                                                        sb4.append("Inconsistent headers [");
                                                        sb4.append(headerField3);
                                                        sb4.append("] [");
                                                        sb4.append(headerField2);
                                                        sb4.append(com.ironsource.X3.j.e);
                                                        java.lang.String sb5 = sb4.toString();
                                                        int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb5);
                                                        parseLong = java.lang.Math.max(parseLong, parseLong2);
                                                    }
                                                } catch (java.lang.NumberFormatException unused2) {
                                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(headerField2).length() + 27);
                                                    sb6.append("Unexpected Content-Range [");
                                                    sb6.append(headerField2);
                                                    sb6.append(com.ironsource.X3.j.e);
                                                    java.lang.String sb7 = sb6.toString();
                                                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzf(sb7);
                                                }
                                            }
                                        }
                                        this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                    }
                                    parseLong = -1;
                                    headerField2 = httpURLConnection2.getHeaderField(com.google.common.net.HttpHeaders.CONTENT_RANGE);
                                    if (!android.text.TextUtils.isEmpty(headerField2)) {
                                    }
                                    this.zzn = parseLong != -1 ? parseLong - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzg(zzhtVar);
                                return this.zzn;
                            } catch (java.io.IOException e) {
                                zzn();
                                throw new com.google.android.gms.internal.ads.zzie(e, zzhtVar, 2000, 1);
                            }
                        } catch (java.io.IOException e2) {
                            zzn();
                            java.lang.String uri = zzhtVar.zza.toString();
                            java.lang.String.valueOf(uri);
                            throw new com.google.android.gms.internal.ads.zzie("Unable to connect to ".concat(java.lang.String.valueOf(uri)), e2, zzhtVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new java.net.ProtocolException("Null location redirect");
                    }
                    java.net.URL url2 = new java.net.URL(url, headerField);
                    java.lang.String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !androidx.webkit.ProxyConfig.MATCH_HTTP.equals(protocol)) {
                        java.lang.String.valueOf(protocol);
                        throw new java.net.ProtocolException("Unsupported protocol redirect: ".concat(java.lang.String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j4 = j2;
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 7);
                sb8.append("bytes=");
                j2 = j4;
                long j7 = j;
                sb8.append(j7);
                sb8.append("-");
                java.lang.String sb9 = sb8.toString();
                if (j5 != -1) {
                    long j8 = (j7 + j5) - 1;
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder(sb9.length() + java.lang.String.valueOf(j8).length());
                    sb10.append(sb9);
                    sb10.append(j8);
                    sb9 = sb10.toString();
                }
                httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.RANGE, sb9);
                httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.USER_AGENT, this.zzf);
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
                    java.util.Map<java.lang.String, java.util.List<java.lang.String>> headerFields2 = this.zzi.getHeaderFields();
                    zzn();
                    com.google.android.gms.internal.ads.zzig zzigVar2 = new com.google.android.gms.internal.ads.zzig(this.zzl, null, null, headerFields2, zzhtVar, com.google.android.gms.internal.ads.zzfl.zzb);
                    if (this.zzl == 416) {
                    }
                }
                headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                httpURLConnection.disconnect();
                if (headerField != null) {
                }
            }
        } catch (java.io.IOException e3) {
            java.lang.String uri2 = zzhtVar.zza.toString();
            java.lang.String.valueOf(uri2);
            throw new com.google.android.gms.internal.ads.zzie("Unable to connect to ".concat(java.lang.String.valueOf(uri2)), e3, zzhtVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final android.net.Uri zzc() {
        java.net.HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return android.net.Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() throws com.google.android.gms.internal.ads.zzie {
        try {
            java.io.InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e) {
                    throw new com.google.android.gms.internal.ads.zzie(e, this.zzh, 2000, 3);
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

    @Override // com.google.android.gms.internal.ads.zzhh, com.google.android.gms.internal.ads.zzhp
    public final java.util.Map zzj() {
        java.net.HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzk(int i) {
        this.zzq = i;
        for (java.net.Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (java.net.SocketException e) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    final /* synthetic */ void zzl(java.net.Socket socket) {
        this.zzr.add(socket);
    }

    final /* synthetic */ int zzm() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i, int i2) throws com.google.android.gms.internal.ads.zzie {
        try {
            if (this.zzo != this.zzm) {
                java.util.concurrent.atomic.AtomicReference atomicReference = zzb;
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
                    int read = this.zzj.read(bArr2, 0, (int) java.lang.Math.min(j2 - j, bArr2.length));
                    if (java.lang.Thread.interrupted()) {
                        throw new java.io.InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new java.io.EOFException();
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
                    i2 = (int) java.lang.Math.min(i2, j4);
                }
                return -1;
            }
            int read2 = this.zzj.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new java.io.EOFException();
            }
            this.zzp += read2;
            zzh(read2);
            return read2;
        } catch (java.io.IOException e) {
            throw new com.google.android.gms.internal.ads.zzie(e, this.zzh, 2000, 2);
        }
    }
}
