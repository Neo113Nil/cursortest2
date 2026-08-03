package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcjd extends com.google.android.gms.internal.ads.zzcja {
    public static final /* synthetic */ int zzd = 0;
    private static final java.util.Set zze = java.util.Collections.synchronizedSet(new java.util.HashSet());
    private static final java.text.DecimalFormat zzf = new java.text.DecimalFormat("#,###");
    private java.io.File zzg;
    private boolean zzh;

    public zzcjd(com.google.android.gms.internal.ads.zzchn zzchnVar) {
        super(zzchnVar);
        java.io.File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        java.io.File file = new java.io.File(com.google.android.gms.internal.ads.zzfzk.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            java.lang.String absolutePath = this.zzg.getAbsolutePath();
            java.lang.String.valueOf(absolutePath);
            java.lang.String valueOf = java.lang.String.valueOf(absolutePath);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(valueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        java.lang.String absolutePath2 = this.zzg.getAbsolutePath();
        java.lang.String.valueOf(absolutePath2);
        java.lang.String valueOf2 = java.lang.String.valueOf(absolutePath2);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(valueOf2));
        this.zzg = null;
    }

    private final java.io.File zza(java.io.File file) {
        com.google.android.gms.internal.ads.zzfzl zza = com.google.android.gms.internal.ads.zzfzk.zza();
        java.io.File file2 = this.zzg;
        java.lang.String name = file.getName();
        java.lang.String.valueOf(name);
        return new java.io.File(zza.zza(file2, java.lang.String.valueOf(name).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0401, code lost:
    
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0403, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x040b, code lost:
    
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x040d, code lost:
    
        r0 = r15.format((long) r1);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r37).length());
        r3.append(r16);
        r3.append(r0);
        r3.append(" bytes from ");
        r3.append(r37);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x043f, code lost:
    
        r11.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0448, code lost:
    
        if (r0.isFile() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x044a, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0456, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:73:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04c7  */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    @Override // com.google.android.gms.internal.ads.zzcja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(final java.lang.String str) {
        java.lang.String str2;
        int i;
        java.io.File file;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        ?? r1;
        java.lang.String str7;
        java.nio.channels.ReadableByteChannel readableByteChannel;
        int i2;
        com.google.android.gms.ads.internal.util.zzbu zzbuVar;
        java.nio.ByteBuffer byteBuffer;
        java.nio.channels.FileChannel fileChannel;
        int i3;
        int i4;
        java.lang.String str8;
        java.lang.String str9 = " sec";
        java.lang.String str10 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            java.io.File file2 = this.zzg;
            if (file2 == null) {
                str2 = str10;
                i = 0;
            } else {
                java.io.File[] listFiles = file2.listFiles();
                int length = listFiles.length;
                str2 = str10;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    java.io.File[] fileArr = listFiles;
                    int i7 = length;
                    if (!listFiles[i5].getName().endsWith(".done")) {
                        i6++;
                    }
                    i5++;
                    length = i7;
                    listFiles = fileArr;
                }
                i = i6;
            }
            if (i > ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzu)).intValue()) {
                java.io.File file3 = this.zzg;
                if (file3 != null) {
                    java.io.File[] listFiles2 = file3.listFiles();
                    int length2 = listFiles2.length;
                    long j = Long.MAX_VALUE;
                    int i8 = 0;
                    java.lang.String str11 = str9;
                    java.io.File file4 = null;
                    while (i8 < length2) {
                        java.io.File file5 = listFiles2[i8];
                        java.io.File[] fileArr2 = listFiles2;
                        int i9 = length2;
                        if (!file5.getName().endsWith(".done")) {
                            long lastModified = file5.lastModified();
                            if (lastModified < j) {
                                file4 = file5;
                                j = lastModified;
                            }
                        }
                        i8++;
                        listFiles2 = fileArr2;
                        length2 = i9;
                    }
                    if (file4 == null) {
                        break;
                    }
                    boolean delete = file4.delete();
                    java.io.File zza = zza(file4);
                    if (zza.isFile()) {
                        delete &= zza.delete();
                    }
                    if (!delete) {
                        break;
                    }
                    str10 = str2;
                    str9 = str11;
                } else {
                    break;
                }
            } else {
                java.lang.String str12 = str9;
                file = new java.io.File(com.google.android.gms.internal.ads.zzfzk.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
                java.io.File zza2 = zza(file);
                if (file.isFile() && zza2.isFile()) {
                    int length3 = (int) file.length();
                    java.lang.String.valueOf(str);
                    java.lang.String valueOf = java.lang.String.valueOf(str);
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(valueOf));
                    zzo(str, file.getAbsolutePath(), length3);
                    return true;
                }
                java.lang.String absolutePath = this.zzg.getAbsolutePath();
                java.lang.String.valueOf(absolutePath);
                java.lang.String.valueOf(str);
                java.lang.String valueOf2 = java.lang.String.valueOf(absolutePath);
                java.lang.String valueOf3 = java.lang.String.valueOf(str);
                java.util.Set set = zze;
                java.lang.String concat = valueOf2.concat(valueOf3);
                synchronized (set) {
                    if (set.contains(concat)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 36);
                        sb.append("Stream cache already in progress at ");
                        sb.append(str);
                        java.lang.String sb2 = sb.toString();
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        zzq(str, file.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(concat);
                    try {
                        str4 = "error";
                    } catch (java.io.IOException | java.lang.RuntimeException e) {
                        e = e;
                        str3 = concat;
                        str4 = "error";
                    }
                    try {
                        java.net.HttpURLConnection zzh = com.google.android.gms.internal.ads.zzgai.zza().zzh(new com.google.android.gms.internal.ads.zzfzy() { // from class: com.google.android.gms.internal.ads.zzcjc
                            @Override // com.google.android.gms.internal.ads.zzfzy
                            public final /* synthetic */ java.net.URLConnection zza() {
                                int i12 = com.google.android.gms.internal.ads.zzcjd.zzd;
                                com.google.android.gms.ads.internal.zzt.zzq();
                                int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzan)).intValue();
                                java.net.URL url = new java.net.URL(str);
                                int i13 = 0;
                                while (true) {
                                    i13++;
                                    if (i13 > 20) {
                                        throw new java.io.IOException("Too many redirects (20)");
                                    }
                                    int i14 = com.google.android.gms.internal.ads.zzfzr.zzb;
                                    java.net.URLConnection openConnection = url.openConnection();
                                    openConnection.setConnectTimeout(intValue);
                                    openConnection.setReadTimeout(intValue);
                                    if (!(openConnection instanceof java.net.HttpURLConnection)) {
                                        throw new java.io.IOException("Invalid protocol.");
                                    }
                                    java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
                                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                    zzlVar.zza(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode = httpURLConnection.getResponseCode();
                                    zzlVar.zzc(httpURLConnection, responseCode);
                                    if (responseCode / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    java.lang.String headerField = httpURLConnection.getHeaderField(com.google.common.net.HttpHeaders.LOCATION);
                                    if (headerField == null) {
                                        throw new java.io.IOException("Missing Location header in redirect");
                                    }
                                    java.net.URL url2 = new java.net.URL(url, headerField);
                                    java.lang.String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new java.io.IOException("Protocol is null");
                                    }
                                    if (!protocol.equals(androidx.webkit.ProxyConfig.MATCH_HTTP) && !protocol.equals("https")) {
                                        throw new java.io.IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    java.lang.String concat2 = "Redirecting to ".concat(headerField);
                                    int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzd(concat2);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if (zzh instanceof java.net.HttpURLConnection) {
                            java.net.HttpURLConnection httpURLConnection = zzh;
                            int responseCode = zzh.getResponseCode();
                            if (responseCode >= 400) {
                                try {
                                    java.lang.String num = java.lang.Integer.toString(responseCode);
                                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(num).length() + 27);
                                    sb3.append("HTTP request failed. Code: ");
                                    sb3.append(num);
                                    str6 = sb3.toString();
                                    try {
                                        java.lang.StringBuilder sb4 = new java.lang.StringBuilder(java.lang.String.valueOf(responseCode).length() + 21 + java.lang.String.valueOf(str).length());
                                        sb4.append("HTTP status code ");
                                        sb4.append(responseCode);
                                        sb4.append(" at ");
                                        sb4.append(str);
                                        throw new java.io.IOException(sb4.toString());
                                    } catch (java.io.IOException | java.lang.RuntimeException e2) {
                                        e = e2;
                                        str3 = concat;
                                        str5 = "badUrl";
                                        fileOutputStream = null;
                                        if (e instanceof java.lang.RuntimeException) {
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (java.io.IOException | java.lang.NullPointerException unused) {
                                        }
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzq(str, file.getAbsolutePath(), str5, str6);
                                        zze.remove(str3);
                                        return false;
                                    }
                                } catch (java.io.IOException | java.lang.RuntimeException e3) {
                                    e = e3;
                                    str3 = concat;
                                    str5 = "badUrl";
                                    str6 = null;
                                    fileOutputStream = null;
                                    if (e instanceof java.lang.RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str5, str6);
                                    zze.remove(str3);
                                    return false;
                                }
                            }
                        }
                        int contentLength = zzh.getContentLength();
                        if (contentLength < 0) {
                            java.lang.StringBuilder sb5 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 55);
                            sb5.append("Stream cache aborted, missing content-length header at ");
                            sb5.append(str);
                            java.lang.String sb6 = sb5.toString();
                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                            zzq(str, file.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(concat);
                            return false;
                        }
                        java.text.DecimalFormat decimalFormat = zzf;
                        java.lang.String format = decimalFormat.format(contentLength);
                        int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzv)).intValue();
                        java.lang.String str13 = "File too big for full file cache. Size: ";
                        if (contentLength > intValue) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(format).length() + 33 + java.lang.String.valueOf(str).length());
                            sb7.append("Content length ");
                            sb7.append(format);
                            sb7.append(" exceeds limit at ");
                            sb7.append(str);
                            java.lang.String sb8 = sb7.toString();
                            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb8);
                            java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(format).length() + 40);
                            sb9.append("File too big for full file cache. Size: ");
                            sb9.append(format);
                            zzq(str, file.getAbsolutePath(), "sizeExceeded", sb9.toString());
                            set.remove(concat);
                            return false;
                        }
                        java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(format).length() + 20 + java.lang.String.valueOf(str).length());
                        sb10.append("Caching ");
                        sb10.append(format);
                        sb10.append(" bytes from ");
                        sb10.append(str);
                        java.lang.String sb11 = sb10.toString();
                        int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb11);
                        java.nio.channels.ReadableByteChannel newChannel = java.nio.channels.Channels.newChannel(zzh.getInputStream());
                        fileOutputStream2 = new java.io.FileOutputStream(file);
                        try {
                            java.nio.channels.FileChannel channel = fileOutputStream2.getChannel();
                            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(1048576);
                            com.google.android.gms.common.util.Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
                            long currentTimeMillis = zzk.currentTimeMillis();
                            com.google.android.gms.ads.internal.util.zzbu zzbuVar2 = new com.google.android.gms.ads.internal.util.zzbu(((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzam)).longValue());
                            long longValue = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzal)).longValue();
                            r1 = 0;
                            while (true) {
                                int read = newChannel.read(allocate);
                                if (read < 0) {
                                    break;
                                }
                                int i15 = read + r1;
                                try {
                                    try {
                                        if (i15 > intValue) {
                                            java.lang.String str14 = str13;
                                            java.lang.String num2 = java.lang.Integer.toString(i15);
                                            java.lang.StringBuilder sb12 = new java.lang.StringBuilder(java.lang.String.valueOf(num2).length() + 40);
                                            sb12.append(str14);
                                            sb12.append(num2);
                                            sb12.toString();
                                            throw new java.io.IOException("stream cache file size limit exceeded");
                                        }
                                        try {
                                            allocate.flip();
                                            do {
                                            } while (channel.write(allocate) > 0);
                                            allocate.clear();
                                            if (zzk.currentTimeMillis() - currentTimeMillis > 1000 * longValue) {
                                                java.lang.String l = java.lang.Long.toString(longValue);
                                                java.lang.StringBuilder sb13 = new java.lang.StringBuilder(java.lang.String.valueOf(l).length() + 29);
                                                sb13.append("Timeout exceeded. Limit: ");
                                                sb13.append(l);
                                                sb13.append(str12);
                                                sb13.toString();
                                                throw new java.io.IOException("stream cache time limit exceeded");
                                            }
                                            if (this.zzh) {
                                                throw new java.io.IOException("abort requested");
                                            }
                                            if (zzbuVar2.zza()) {
                                                i3 = intValue;
                                                readableByteChannel = newChannel;
                                                i2 = i15;
                                                zzbuVar = zzbuVar2;
                                                byteBuffer = allocate;
                                                fileChannel = channel;
                                                str7 = concat;
                                                str8 = str13;
                                                i4 = contentLength;
                                                try {
                                                    try {
                                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new com.google.android.gms.internal.ads.zzciu(this, str, file.getAbsolutePath(), i2, contentLength, false));
                                                    } catch (java.lang.RuntimeException e4) {
                                                        e = e4;
                                                        str3 = str7;
                                                        fileOutputStream = fileOutputStream2;
                                                        str5 = str4;
                                                        str6 = null;
                                                        if (e instanceof java.lang.RuntimeException) {
                                                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.zzh) {
                                                            java.lang.StringBuilder sb14 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 25);
                                                            sb14.append("Preload failed for URL \"");
                                                            sb14.append(str);
                                                            sb14.append("\"");
                                                            java.lang.String sb15 = sb14.toString();
                                                            int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb15, e);
                                                        } else {
                                                            java.lang.StringBuilder sb16 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 26);
                                                            sb16.append("Preload aborted for URL \"");
                                                            sb16.append(str);
                                                            sb16.append("\"");
                                                            java.lang.String sb17 = sb16.toString();
                                                            int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb17);
                                                        }
                                                        if (file.exists() && !file.delete()) {
                                                            java.lang.String absolutePath2 = file.getAbsolutePath();
                                                            java.lang.String.valueOf(absolutePath2);
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(java.lang.String.valueOf(absolutePath2)));
                                                        }
                                                        zzq(str, file.getAbsolutePath(), str5, str6);
                                                        zze.remove(str3);
                                                        return false;
                                                    }
                                                } catch (java.io.IOException e5) {
                                                    e = e5;
                                                    str3 = str7;
                                                    fileOutputStream = fileOutputStream2;
                                                    str5 = str4;
                                                    str6 = null;
                                                    if (e instanceof java.lang.RuntimeException) {
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file.exists()) {
                                                        java.lang.String absolutePath22 = file.getAbsolutePath();
                                                        java.lang.String.valueOf(absolutePath22);
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(java.lang.String.valueOf(absolutePath22)));
                                                    }
                                                    zzq(str, file.getAbsolutePath(), str5, str6);
                                                    zze.remove(str3);
                                                    return false;
                                                }
                                            } else {
                                                readableByteChannel = newChannel;
                                                i2 = i15;
                                                zzbuVar = zzbuVar2;
                                                byteBuffer = allocate;
                                                fileChannel = channel;
                                                i3 = intValue;
                                                i4 = contentLength;
                                                str7 = concat;
                                                str8 = str13;
                                            }
                                            str13 = str8;
                                            channel = fileChannel;
                                            intValue = i3;
                                            newChannel = readableByteChannel;
                                            r1 = i2;
                                            zzbuVar2 = zzbuVar;
                                            allocate = byteBuffer;
                                            concat = str7;
                                            contentLength = i4;
                                        } catch (java.io.IOException | java.lang.RuntimeException e6) {
                                            e = e6;
                                            str7 = concat;
                                            str3 = str7;
                                            fileOutputStream = fileOutputStream2;
                                            str5 = str4;
                                            str6 = null;
                                            if (e instanceof java.lang.RuntimeException) {
                                            }
                                            fileOutputStream.close();
                                            if (this.zzh) {
                                            }
                                            if (file.exists()) {
                                            }
                                            zzq(str, file.getAbsolutePath(), str5, str6);
                                            zze.remove(str3);
                                            return false;
                                        }
                                    } catch (java.io.IOException | java.lang.RuntimeException e7) {
                                        e = e7;
                                        str5 = decimalFormat;
                                        str3 = str7;
                                        str6 = null;
                                        fileOutputStream = fileOutputStream2;
                                        if (e instanceof java.lang.RuntimeException) {
                                        }
                                        fileOutputStream.close();
                                        if (this.zzh) {
                                        }
                                        if (file.exists()) {
                                        }
                                        zzq(str, file.getAbsolutePath(), str5, str6);
                                        zze.remove(str3);
                                        return false;
                                    }
                                } catch (java.io.IOException | java.lang.RuntimeException e8) {
                                    e = e8;
                                    str6 = r1;
                                    str5 = decimalFormat;
                                    str3 = str7;
                                    fileOutputStream = fileOutputStream2;
                                    if (e instanceof java.lang.RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str5, str6);
                                    zze.remove(str3);
                                    return false;
                                }
                            }
                        } catch (java.io.IOException | java.lang.RuntimeException e9) {
                            e = e9;
                            str3 = concat;
                        }
                    } catch (java.io.IOException | java.lang.RuntimeException e10) {
                        e = e10;
                        str3 = concat;
                        str5 = str4;
                        str6 = null;
                        fileOutputStream = null;
                        if (e instanceof java.lang.RuntimeException) {
                        }
                        fileOutputStream.close();
                        if (this.zzh) {
                        }
                        if (file.exists()) {
                        }
                        zzq(str, file.getAbsolutePath(), str5, str6);
                        zze.remove(str3);
                        return false;
                    }
                }
            }
        }
        int i18 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
        zzq(str, null, "expireFailed", null);
        return false;
        zzo(str, file.getAbsolutePath(), r1);
        str3 = str7;
        try {
            zze.remove(str3);
            return true;
        } catch (java.io.IOException e11) {
            e = e11;
            fileOutputStream = fileOutputStream2;
            str5 = str4;
            str6 = null;
            if (e instanceof java.lang.RuntimeException) {
            }
            fileOutputStream.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzq(str, file.getAbsolutePath(), str5, str6);
            zze.remove(str3);
            return false;
        } catch (java.lang.RuntimeException e12) {
            e = e12;
            fileOutputStream = fileOutputStream2;
            str5 = str4;
            str6 = null;
            if (e instanceof java.lang.RuntimeException) {
            }
            fileOutputStream.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzq(str, file.getAbsolutePath(), str5, str6);
            zze.remove(str3);
            return false;
        }
    }
}
