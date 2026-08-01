package com.google.android.gms.internal.ads;

import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.util.Clock;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzcjv extends zzcjs {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcjv(zzcif zzcifVar) {
        super(zzcifVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzgam.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String absolutePath = this.zzg.getAbsolutePath();
            String.valueOf(absolutePath);
            String valueOf = String.valueOf(absolutePath);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(valueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String absolutePath2 = this.zzg.getAbsolutePath();
        String.valueOf(absolutePath2);
        String valueOf2 = String.valueOf(absolutePath2);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(valueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        zzgan zza = zzgam.zza();
        File file2 = this.zzg;
        String name = file.getName();
        String.valueOf(name);
        return new File(zza.zza(file2, String.valueOf(name).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcjs
    public final void zzl() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0405, code lost:
    
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0407, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x040f, code lost:
    
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0411, code lost:
    
        r0 = r15.format((long) r1);
        r3 = new java.lang.StringBuilder((java.lang.String.valueOf(r0).length() + 22) + java.lang.String.valueOf(r37).length());
        r3.append(r16);
        r3.append(r0);
        r3.append(" bytes from ");
        r3.append(r37);
        com.google.android.gms.ads.internal.util.client.zzo.zzd(r3.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0443, code lost:
    
        r11.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x044c, code lost:
    
        if (r0.isFile() == false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x044e, code lost:
    
        r0.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x045a, code lost:
    
        r0.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ca A[LOOP:0: B:3:0x0020->B:13:0x00ca, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04c9  */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v44 */
    @Override // com.google.android.gms.internal.ads.zzcjs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(final String str) {
        String str2;
        int i;
        File file;
        String str3;
        String str4;
        String str5;
        String str6;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        ?? r1;
        String str7;
        ReadableByteChannel readableByteChannel;
        int i2;
        com.google.android.gms.ads.internal.util.zzbu zzbuVar;
        ByteBuffer byteBuffer;
        FileChannel fileChannel;
        int i3;
        int i4;
        String str8;
        String str9;
        boolean delete;
        String str10 = " sec";
        String str11 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = this.zzg;
            if (file2 == null) {
                str2 = str11;
                i = 0;
            } else {
                File[] listFiles = file2.listFiles();
                int length = listFiles.length;
                str2 = str11;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length) {
                    File[] fileArr = listFiles;
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
            if (i > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzy)).intValue()) {
                File file3 = this.zzg;
                if (file3 == null) {
                    str9 = str10;
                } else {
                    File[] listFiles2 = file3.listFiles();
                    int length2 = listFiles2.length;
                    long j = Long.MAX_VALUE;
                    int i8 = 0;
                    str9 = str10;
                    File file4 = null;
                    while (i8 < length2) {
                        File file5 = listFiles2[i8];
                        File[] fileArr2 = listFiles2;
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
                    if (file4 != null) {
                        boolean delete2 = file4.delete();
                        File zza = zza(file4);
                        delete = zza.isFile() ? zza.delete() & delete2 : delete2;
                        if (delete) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
                            zzq(str, null, "expireFailed", null);
                            return false;
                        }
                        str11 = str2;
                        str10 = str9;
                    }
                }
                delete = false;
                if (delete) {
                }
            } else {
                String str12 = str10;
                file = new File(zzgam.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
                File zza2 = zza(file);
                if (file.isFile() && zza2.isFile()) {
                    int length3 = (int) file.length();
                    String.valueOf(str);
                    String valueOf = String.valueOf(str);
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(valueOf));
                    zzo(str, file.getAbsolutePath(), length3);
                    return true;
                }
                String absolutePath = this.zzg.getAbsolutePath();
                String.valueOf(absolutePath);
                String.valueOf(str);
                String valueOf2 = String.valueOf(absolutePath);
                String valueOf3 = String.valueOf(str);
                Set set = zze;
                String concat = valueOf2.concat(valueOf3);
                synchronized (set) {
                    if (set.contains(concat)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36);
                        sb.append("Stream cache already in progress at ");
                        sb.append(str);
                        String sb2 = sb.toString();
                        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
                        zzq(str, file.getAbsolutePath(), "inProgress", null);
                        return false;
                    }
                    set.add(concat);
                    try {
                        str4 = "error";
                    } catch (IOException | RuntimeException e) {
                        e = e;
                        str3 = concat;
                        str4 = "error";
                    }
                    try {
                        HttpURLConnection zzh = zzgbk.zza().zzh(new zzgba() { // from class: com.google.android.gms.internal.ads.zzcju
                            @Override // com.google.android.gms.internal.ads.zzgba
                            public final /* synthetic */ URLConnection zza() {
                                int i13 = zzcjv.zzd;
                                com.google.android.gms.ads.internal.zzt.zzq();
                                int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzas)).intValue();
                                URL url = new URL(str);
                                int i14 = 0;
                                while (true) {
                                    i14++;
                                    if (i14 > 20) {
                                        throw new IOException("Too many redirects (20)");
                                    }
                                    int i15 = zzgat.zzb;
                                    URLConnection openConnection = url.openConnection();
                                    openConnection.setConnectTimeout(intValue);
                                    openConnection.setReadTimeout(intValue);
                                    if (!(openConnection instanceof HttpURLConnection)) {
                                        throw new IOException("Invalid protocol.");
                                    }
                                    HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                    zzlVar.zza(httpURLConnection, null);
                                    httpURLConnection.setInstanceFollowRedirects(false);
                                    int responseCode = httpURLConnection.getResponseCode();
                                    zzlVar.zzc(httpURLConnection, responseCode);
                                    if (responseCode / 100 != 3) {
                                        return httpURLConnection;
                                    }
                                    String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                                    if (headerField == null) {
                                        throw new IOException("Missing Location header in redirect");
                                    }
                                    URL url2 = new URL(url, headerField);
                                    String protocol = url2.getProtocol();
                                    if (protocol == null) {
                                        throw new IOException("Protocol is null");
                                    }
                                    if (!protocol.equals(ProxyConfig.MATCH_HTTP) && !protocol.equals("https")) {
                                        throw new IOException("Unsupported scheme: ".concat(protocol));
                                    }
                                    String concat2 = "Redirecting to ".concat(headerField);
                                    int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzd(concat2);
                                    httpURLConnection.disconnect();
                                    url = url2;
                                }
                            }
                        }, 265, -1);
                        if (zzh instanceof HttpURLConnection) {
                            HttpURLConnection httpURLConnection = zzh;
                            int responseCode = zzh.getResponseCode();
                            if (responseCode >= 400) {
                                try {
                                    String num = Integer.toString(responseCode);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(num).length() + 27);
                                    sb3.append("HTTP request failed. Code: ");
                                    sb3.append(num);
                                    str6 = sb3.toString();
                                } catch (IOException | RuntimeException e2) {
                                    e = e2;
                                    str3 = concat;
                                    str5 = "badUrl";
                                    str6 = null;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException | NullPointerException unused) {
                                    }
                                    if (this.zzh) {
                                    }
                                    if (file.exists()) {
                                    }
                                    zzq(str, file.getAbsolutePath(), str5, str6);
                                    zze.remove(str3);
                                    return false;
                                }
                                try {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str).length());
                                    sb4.append("HTTP status code ");
                                    sb4.append(responseCode);
                                    sb4.append(" at ");
                                    sb4.append(str);
                                    throw new IOException(sb4.toString());
                                } catch (IOException | RuntimeException e3) {
                                    e = e3;
                                    str3 = concat;
                                    str5 = "badUrl";
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
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
                            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 55);
                            sb5.append("Stream cache aborted, missing content-length header at ");
                            sb5.append(str);
                            String sb6 = sb5.toString();
                            int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb6);
                            zzq(str, file.getAbsolutePath(), "contentLengthMissing", null);
                            set.remove(concat);
                            return false;
                        }
                        DecimalFormat decimalFormat = zzf;
                        String format = decimalFormat.format(contentLength);
                        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzz)).intValue();
                        String str13 = "File too big for full file cache. Size: ";
                        if (contentLength > intValue) {
                            StringBuilder sb7 = new StringBuilder(String.valueOf(format).length() + 33 + String.valueOf(str).length());
                            sb7.append("Content length ");
                            sb7.append(format);
                            sb7.append(" exceeds limit at ");
                            sb7.append(str);
                            String sb8 = sb7.toString();
                            int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb8);
                            StringBuilder sb9 = new StringBuilder(String.valueOf(format).length() + 40);
                            sb9.append("File too big for full file cache. Size: ");
                            sb9.append(format);
                            zzq(str, file.getAbsolutePath(), "sizeExceeded", sb9.toString());
                            set.remove(concat);
                            return false;
                        }
                        StringBuilder sb10 = new StringBuilder(String.valueOf(format).length() + 20 + String.valueOf(str).length());
                        sb10.append("Caching ");
                        sb10.append(format);
                        sb10.append(" bytes from ");
                        sb10.append(str);
                        String sb11 = sb10.toString();
                        int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzd(sb11);
                        ReadableByteChannel newChannel = Channels.newChannel(zzh.getInputStream());
                        fileOutputStream2 = new FileOutputStream(file);
                        try {
                            FileChannel channel = fileOutputStream2.getChannel();
                            ByteBuffer allocate = ByteBuffer.allocate(1048576);
                            Clock zzk = com.google.android.gms.ads.internal.zzt.zzk();
                            long currentTimeMillis = zzk.currentTimeMillis();
                            com.google.android.gms.ads.internal.util.zzbu zzbuVar2 = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzar)).longValue());
                            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaq)).longValue();
                            r1 = 0;
                            while (true) {
                                int read = newChannel.read(allocate);
                                if (read < 0) {
                                    break;
                                }
                                int i16 = read + r1;
                                try {
                                    try {
                                        if (i16 > intValue) {
                                            String str14 = str13;
                                            String num2 = Integer.toString(i16);
                                            StringBuilder sb12 = new StringBuilder(String.valueOf(num2).length() + 40);
                                            sb12.append(str14);
                                            sb12.append(num2);
                                            sb12.toString();
                                            throw new IOException("stream cache file size limit exceeded");
                                        }
                                        try {
                                            allocate.flip();
                                            do {
                                            } while (channel.write(allocate) > 0);
                                            allocate.clear();
                                            if (zzk.currentTimeMillis() - currentTimeMillis > 1000 * longValue) {
                                                String l = Long.toString(longValue);
                                                StringBuilder sb13 = new StringBuilder(String.valueOf(l).length() + 29);
                                                sb13.append("Timeout exceeded. Limit: ");
                                                sb13.append(l);
                                                sb13.append(str12);
                                                sb13.toString();
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            if (this.zzh) {
                                                throw new IOException("abort requested");
                                            }
                                            if (zzbuVar2.zza()) {
                                                i3 = intValue;
                                                readableByteChannel = newChannel;
                                                i2 = i16;
                                                zzbuVar = zzbuVar2;
                                                byteBuffer = allocate;
                                                fileChannel = channel;
                                                str7 = concat;
                                                str8 = str13;
                                                i4 = contentLength;
                                                try {
                                                    try {
                                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcjm(this, str, file.getAbsolutePath(), i2, contentLength, false));
                                                    } catch (RuntimeException e4) {
                                                        e = e4;
                                                        str3 = str7;
                                                        fileOutputStream = fileOutputStream2;
                                                        str5 = str4;
                                                        str6 = null;
                                                        if (e instanceof RuntimeException) {
                                                            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "VideoStreamFullFileCache.preload");
                                                        }
                                                        fileOutputStream.close();
                                                        if (this.zzh) {
                                                            StringBuilder sb14 = new StringBuilder(String.valueOf(str).length() + 25);
                                                            sb14.append("Preload failed for URL \"");
                                                            sb14.append(str);
                                                            sb14.append("\"");
                                                            String sb15 = sb14.toString();
                                                            int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzj(sb15, e);
                                                        } else {
                                                            StringBuilder sb16 = new StringBuilder(String.valueOf(str).length() + 26);
                                                            sb16.append("Preload aborted for URL \"");
                                                            sb16.append(str);
                                                            sb16.append("\"");
                                                            String sb17 = sb16.toString();
                                                            int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzh(sb17);
                                                        }
                                                        if (file.exists() && !file.delete()) {
                                                            String absolutePath2 = file.getAbsolutePath();
                                                            String.valueOf(absolutePath2);
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(absolutePath2)));
                                                        }
                                                        zzq(str, file.getAbsolutePath(), str5, str6);
                                                        zze.remove(str3);
                                                        return false;
                                                    }
                                                } catch (IOException e5) {
                                                    e = e5;
                                                    str3 = str7;
                                                    fileOutputStream = fileOutputStream2;
                                                    str5 = str4;
                                                    str6 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file.exists()) {
                                                        String absolutePath22 = file.getAbsolutePath();
                                                        String.valueOf(absolutePath22);
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(absolutePath22)));
                                                    }
                                                    zzq(str, file.getAbsolutePath(), str5, str6);
                                                    zze.remove(str3);
                                                    return false;
                                                }
                                            } else {
                                                readableByteChannel = newChannel;
                                                i2 = i16;
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
                                        } catch (IOException | RuntimeException e6) {
                                            e = e6;
                                            str7 = concat;
                                            str3 = str7;
                                            fileOutputStream = fileOutputStream2;
                                            str5 = str4;
                                            str6 = null;
                                            if (e instanceof RuntimeException) {
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
                                    } catch (IOException | RuntimeException e7) {
                                        e = e7;
                                        str6 = r1;
                                        str5 = decimalFormat;
                                        str3 = str7;
                                        fileOutputStream = fileOutputStream2;
                                        if (e instanceof RuntimeException) {
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
                                } catch (IOException | RuntimeException e8) {
                                    e = e8;
                                    str5 = decimalFormat;
                                    str3 = str7;
                                    str6 = null;
                                    fileOutputStream = fileOutputStream2;
                                    if (e instanceof RuntimeException) {
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
                        } catch (IOException | RuntimeException e9) {
                            e = e9;
                            str3 = concat;
                        }
                    } catch (IOException | RuntimeException e10) {
                        e = e10;
                        str3 = concat;
                        str5 = str4;
                        str6 = null;
                        fileOutputStream = null;
                        if (e instanceof RuntimeException) {
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
        zzo(str, file.getAbsolutePath(), r1);
        str3 = str7;
        try {
            zze.remove(str3);
            return true;
        } catch (IOException e11) {
            e = e11;
            fileOutputStream = fileOutputStream2;
            str5 = str4;
            str6 = null;
            if (e instanceof RuntimeException) {
            }
            fileOutputStream.close();
            if (this.zzh) {
            }
            if (file.exists()) {
            }
            zzq(str, file.getAbsolutePath(), str5, str6);
            zze.remove(str3);
            return false;
        } catch (RuntimeException e12) {
            e = e12;
            fileOutputStream = fileOutputStream2;
            str5 = str4;
            str6 = null;
            if (e instanceof RuntimeException) {
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
