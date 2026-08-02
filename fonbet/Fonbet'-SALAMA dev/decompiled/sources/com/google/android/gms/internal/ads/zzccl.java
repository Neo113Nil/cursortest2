package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.J;
import J2.d;
import J2.g;
import J2.j;
import W5.AbstractC0486a1;
import android.os.SystemClock;
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

/* loaded from: classes.dex */
public final class zzccl extends zzcci {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzccl(zzcaw zzcawVar) {
        super(zzcawVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i7 = J.f3546b;
            j.g("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfon.zza(zzfom.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String valueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i8 = J.f3546b;
            j.g("Could not create preload cache directory at ".concat(valueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i9 = J.f3546b;
        j.g("Could not set cache file permissions at ".concat(valueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfon.zza(zzfom.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcci
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03e9  */
    @Override // com.google.android.gms.internal.ads.zzcci
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzt(final String str) {
        int i7;
        String str2;
        FileOutputStream fileOutputStream;
        String str3;
        boolean z4;
        ByteBuffer byteBuffer;
        FileChannel fileChannel;
        ReadableByteChannel readableByteChannel;
        int i8;
        int i9;
        int responseCode;
        boolean z7;
        boolean z8 = false;
        FileOutputStream fileOutputStream2 = null;
        if (this.zzg == null) {
            zzg(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.zzg;
            if (file == null) {
                i7 = 0;
            } else {
                i7 = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i7++;
                    }
                }
            }
            zzbbp zzbbpVar = zzbby.zzq;
            C0254t c0254t = C0254t.f2723d;
            if (i7 > ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue()) {
                File file3 = this.zzg;
                if (file3 == null) {
                    break;
                }
                long j = Long.MAX_VALUE;
                File file4 = null;
                for (File file5 : file3.listFiles()) {
                    if (!file5.getName().endsWith(".done")) {
                        long lastModified = file5.lastModified();
                        if (lastModified < j) {
                            file4 = file5;
                            j = lastModified;
                        }
                    }
                }
                if (file4 != null) {
                    z7 = file4.delete();
                    File zza = zza(file4);
                    if (zza.isFile()) {
                        z7 &= zza.delete();
                    }
                } else {
                    z7 = false;
                }
            } else {
                File file6 = new File(zzfon.zza(zzfom.zza(), this.zzg, d.a(str, "MD5")));
                File zza2 = zza(file6);
                if (file6.isFile() && zza2.isFile()) {
                    int length = (int) file6.length();
                    String valueOf = String.valueOf(str);
                    int i10 = J.f3546b;
                    j.b("Stream cache hit at ".concat(valueOf));
                    zzh(str, file6.getAbsolutePath(), length);
                    return true;
                }
                String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
                String valueOf3 = String.valueOf(str);
                Set set = zze;
                String concat = valueOf2.concat(valueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(concat)) {
                            int i11 = J.f3546b;
                            j.g("Stream cache already in progress at " + str);
                            zzg(str, file6.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        String str4 = "error";
                        try {
                            HttpURLConnection zzn = zzfoz.zza().zzn(new zzfpk() { // from class: com.google.android.gms.internal.ads.zzcck
                                @Override // com.google.android.gms.internal.ads.zzfpk
                                public final URLConnection zza() {
                                    int i12 = zzccl.zzd;
                                    zzbzg zzbzgVar = o.f1952C.f1969p;
                                    int intValue = ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzO)).intValue();
                                    URL url = new URL(str);
                                    int i13 = 0;
                                    while (true) {
                                        i13++;
                                        if (i13 > 20) {
                                            throw new IOException("Too many redirects (20)");
                                        }
                                        URLConnection openConnection = url.openConnection();
                                        openConnection.setConnectTimeout(intValue);
                                        openConnection.setReadTimeout(intValue);
                                        if (!(openConnection instanceof HttpURLConnection)) {
                                            throw new IOException("Invalid protocol.");
                                        }
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                                        g gVar = new g();
                                        gVar.a(httpURLConnection, null);
                                        httpURLConnection.setInstanceFollowRedirects(false);
                                        int responseCode2 = httpURLConnection.getResponseCode();
                                        gVar.b(httpURLConnection, responseCode2);
                                        if (responseCode2 / 100 != 3) {
                                            return httpURLConnection;
                                        }
                                        String headerField = httpURLConnection.getHeaderField("Location");
                                        if (headerField == null) {
                                            throw new IOException("Missing Location header in redirect");
                                        }
                                        URL url2 = new URL(url, headerField);
                                        String protocol = url2.getProtocol();
                                        if (protocol == null) {
                                            throw new IOException("Protocol is null");
                                        }
                                        if (!protocol.equals("http") && !protocol.equals("https")) {
                                            throw new IOException("Unsupported scheme: ".concat(protocol));
                                        }
                                        String concat2 = "Redirecting to ".concat(headerField);
                                        int i14 = J.f3546b;
                                        j.b(concat2);
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (zzn != null && (responseCode = zzn.getResponseCode()) >= 400) {
                                str4 = "badUrl";
                                try {
                                    str2 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                } catch (IOException | RuntimeException e7) {
                                    e = e7;
                                    str2 = null;
                                }
                                try {
                                    throw new IOException("HTTP status code " + responseCode + " at " + str);
                                } catch (IOException e8) {
                                    e = e8;
                                    if (e instanceof RuntimeException) {
                                    }
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException | NullPointerException unused) {
                                    }
                                    if (this.zzh) {
                                    }
                                    if (file6.exists()) {
                                    }
                                    zzg(str, file6.getAbsolutePath(), str4, str2);
                                    zze.remove(concat);
                                    return false;
                                } catch (RuntimeException e9) {
                                    e = e9;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream2.close();
                                    if (this.zzh) {
                                    }
                                    if (file6.exists()) {
                                    }
                                    zzg(str, file6.getAbsolutePath(), str4, str2);
                                    zze.remove(concat);
                                    return false;
                                }
                            }
                            int contentLength = zzn.getContentLength();
                            if (contentLength < 0) {
                                int i12 = J.f3546b;
                                j.g("Stream cache aborted, missing content-length header at " + str);
                                zzg(str, file6.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(concat);
                                return false;
                            }
                            String format = zzf.format(contentLength);
                            int intValue = ((Integer) c0254t.f2726c.zzb(zzbby.zzr)).intValue();
                            if (contentLength > intValue) {
                                int i13 = J.f3546b;
                                j.g("Content length " + format + " exceeds limit at " + str);
                                zzg(str, file6.getAbsolutePath(), "sizeExceeded", "File too big for full file cache. Size: " + format);
                                set.remove(concat);
                                return false;
                            }
                            int i14 = J.f3546b;
                            j.b("Caching " + format + " bytes from " + str);
                            ReadableByteChannel newChannel = Channels.newChannel(zzn.getInputStream());
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file6);
                            try {
                                FileChannel channel = fileOutputStream3.getChannel();
                                ByteBuffer allocate = ByteBuffer.allocate(1048576);
                                o.f1952C.j.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                long longValue = ((Long) c0254t.f2726c.zzb(zzbby.zzN)).longValue();
                                Object obj = new Object();
                                long longValue2 = ((Long) c0254t.f2726c.zzb(zzbby.zzM)).longValue();
                                long j3 = Long.MIN_VALUE;
                                int i15 = 0;
                                while (true) {
                                    int read = newChannel.read(allocate);
                                    if (read < 0) {
                                        fileOutputStream3.close();
                                        if (j.j(3)) {
                                            j.b("Preloaded " + zzf.format(i15) + " bytes from " + str);
                                        }
                                        file6.setReadable(true, false);
                                        if (zza2.isFile()) {
                                            zza2.setLastModified(System.currentTimeMillis());
                                        } else {
                                            try {
                                                zza2.createNewFile();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                        zzh(str, file6.getAbsolutePath(), i15);
                                        zze.remove(concat);
                                        return true;
                                    }
                                    i15 += read;
                                    try {
                                        try {
                                            if (i15 > intValue) {
                                                String str5 = "File too big for full file cache. Size: " + Integer.toString(i15);
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                            allocate.flip();
                                            while (channel.write(allocate) > 0) {
                                            }
                                            allocate.clear();
                                            if (System.currentTimeMillis() - currentTimeMillis > 1000 * longValue2) {
                                                String str6 = "Timeout exceeded. Limit: " + Long.toString(longValue2) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            if (this.zzh) {
                                                throw new IOException("abort requested");
                                            }
                                            synchronized (obj) {
                                                try {
                                                    o.f1952C.j.getClass();
                                                    long elapsedRealtime = SystemClock.elapsedRealtime();
                                                    if (j3 + longValue > elapsedRealtime) {
                                                        z4 = z8;
                                                    } else {
                                                        j3 = elapsedRealtime;
                                                        z4 = true;
                                                    }
                                                } catch (Throwable th) {
                                                    th = th;
                                                    while (true) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                        }
                                                    }
                                                }
                                            }
                                            if (z4) {
                                                byteBuffer = allocate;
                                                str3 = str4;
                                                fileChannel = channel;
                                                fileOutputStream = fileOutputStream3;
                                                readableByteChannel = newChannel;
                                                i8 = intValue;
                                                i9 = contentLength;
                                                try {
                                                    try {
                                                        d.f3805b.post(new zzccc(this, str, file6.getAbsolutePath(), i15, contentLength, false));
                                                    } catch (IOException e10) {
                                                        e = e10;
                                                        str4 = str3;
                                                        fileOutputStream2 = fileOutputStream;
                                                        str2 = null;
                                                        if (e instanceof RuntimeException) {
                                                            o.f1952C.f1961g.zzw(e, "VideoStreamFullFileCache.preload");
                                                        }
                                                        fileOutputStream2.close();
                                                        if (this.zzh) {
                                                            String h6 = AbstractC0486a1.h("Preload aborted for URL \"", str, "\"");
                                                            int i16 = J.f3546b;
                                                            j.f(h6);
                                                        } else {
                                                            String h7 = AbstractC0486a1.h("Preload failed for URL \"", str, "\"");
                                                            int i17 = J.f3546b;
                                                            j.h(h7, e);
                                                        }
                                                        if (file6.exists() && !file6.delete()) {
                                                            j.g("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                                        }
                                                        zzg(str, file6.getAbsolutePath(), str4, str2);
                                                        zze.remove(concat);
                                                        return false;
                                                    }
                                                } catch (RuntimeException e11) {
                                                    e = e11;
                                                    str4 = str3;
                                                    fileOutputStream2 = fileOutputStream;
                                                    str2 = null;
                                                    if (e instanceof RuntimeException) {
                                                    }
                                                    fileOutputStream2.close();
                                                    if (this.zzh) {
                                                    }
                                                    if (file6.exists()) {
                                                        j.g("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                                    }
                                                    zzg(str, file6.getAbsolutePath(), str4, str2);
                                                    zze.remove(concat);
                                                    return false;
                                                }
                                            } else {
                                                byteBuffer = allocate;
                                                fileChannel = channel;
                                                fileOutputStream = fileOutputStream3;
                                                readableByteChannel = newChannel;
                                                i8 = intValue;
                                                i9 = contentLength;
                                                str3 = str4;
                                            }
                                            newChannel = readableByteChannel;
                                            allocate = byteBuffer;
                                            str4 = str3;
                                            channel = fileChannel;
                                            fileOutputStream3 = fileOutputStream;
                                            intValue = i8;
                                            contentLength = i9;
                                            z8 = false;
                                        } catch (IOException e12) {
                                            e = e12;
                                            fileOutputStream2 = fileOutputStream;
                                            str2 = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream2.close();
                                            if (this.zzh) {
                                            }
                                            if (file6.exists()) {
                                            }
                                            zzg(str, file6.getAbsolutePath(), str4, str2);
                                            zze.remove(concat);
                                            return false;
                                        } catch (RuntimeException e13) {
                                            e = e13;
                                            fileOutputStream2 = fileOutputStream;
                                            str2 = null;
                                            if (e instanceof RuntimeException) {
                                            }
                                            fileOutputStream2.close();
                                            if (this.zzh) {
                                            }
                                            if (file6.exists()) {
                                            }
                                            zzg(str, file6.getAbsolutePath(), str4, str2);
                                            zze.remove(concat);
                                            return false;
                                        }
                                    } catch (IOException | RuntimeException e14) {
                                        e = e14;
                                        str2 = obj;
                                        fileOutputStream2 = fileOutputStream;
                                        if (e instanceof RuntimeException) {
                                        }
                                        fileOutputStream2.close();
                                        if (this.zzh) {
                                        }
                                        if (file6.exists()) {
                                        }
                                        zzg(str, file6.getAbsolutePath(), str4, str2);
                                        zze.remove(concat);
                                        return false;
                                    }
                                }
                            } catch (IOException | RuntimeException e15) {
                                e = e15;
                                fileOutputStream = fileOutputStream3;
                                str3 = str4;
                            }
                        } catch (IOException | RuntimeException e16) {
                            e = e16;
                            str4 = "error";
                            str2 = null;
                            fileOutputStream2 = null;
                        }
                    } finally {
                    }
                }
            }
        } while (z7);
        int i18 = J.f3546b;
        j.g("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
    }
}
