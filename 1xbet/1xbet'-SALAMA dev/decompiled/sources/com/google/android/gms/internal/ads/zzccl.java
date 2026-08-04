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

/* JADX INFO: loaded from: classes.dex */
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
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i8 = J.f3546b;
            j.g("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i9 = J.f3546b;
        j.g("Could not set cache file permissions at ".concat(strValueOf2));
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
    @Override // com.google.android.gms.internal.ads.zzcci
    public final boolean zzt(final String str) throws Throwable {
        int i7;
        String str2;
        FileOutputStream fileOutputStream;
        String str3;
        boolean z4;
        int responseCode;
        boolean zDelete;
        boolean z7 = false;
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
            if (i7 <= ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue()) {
                File file3 = new File(zzfon.zza(zzfom.zza(), this.zzg, d.a(str, "MD5")));
                File fileZza = zza(file3);
                if (file3.isFile() && fileZza.isFile()) {
                    int length = (int) file3.length();
                    String strValueOf = String.valueOf(str);
                    int i8 = J.f3546b;
                    j.b("Stream cache hit at ".concat(strValueOf));
                    zzh(str, file3.getAbsolutePath(), length);
                    return true;
                }
                String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf3 = String.valueOf(str);
                Set set = zze;
                String strConcat = strValueOf2.concat(strValueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            int i9 = J.f3546b;
                            j.g("Stream cache already in progress at " + str);
                            zzg(str, file3.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        String str4 = "error";
                        try {
                            HttpURLConnection httpURLConnectionZzn = zzfoz.zza().zzn(new zzfpk() { // from class: com.google.android.gms.internal.ads.zzcck
                                @Override // com.google.android.gms.internal.ads.zzfpk
                                public final URLConnection zza() throws IOException {
                                    int i10 = zzccl.zzd;
                                    zzbzg zzbzgVar = o.f1952C.f1969p;
                                    int iIntValue = ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzO)).intValue();
                                    URL url = new URL(str);
                                    int i11 = 0;
                                    while (true) {
                                        i11++;
                                        if (i11 > 20) {
                                            throw new IOException("Too many redirects (20)");
                                        }
                                        URLConnection uRLConnectionOpenConnection = url.openConnection();
                                        uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                        uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                            throw new IOException("Invalid protocol.");
                                        }
                                        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
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
                                        String strConcat2 = "Redirecting to ".concat(headerField);
                                        int i12 = J.f3546b;
                                        j.b(strConcat2);
                                        httpURLConnection.disconnect();
                                        url = url2;
                                    }
                                }
                            }, 265, -1);
                            if (httpURLConnectionZzn == null || (responseCode = httpURLConnectionZzn.getResponseCode()) < 400) {
                                int contentLength = httpURLConnectionZzn.getContentLength();
                                if (contentLength < 0) {
                                    int i10 = J.f3546b;
                                    j.g("Stream cache aborted, missing content-length header at " + str);
                                    zzg(str, file3.getAbsolutePath(), "contentLengthMissing", null);
                                    set.remove(strConcat);
                                    return false;
                                }
                                String str5 = zzf.format(contentLength);
                                int iIntValue = ((Integer) c0254t.f2726c.zzb(zzbby.zzr)).intValue();
                                if (contentLength > iIntValue) {
                                    int i11 = J.f3546b;
                                    j.g("Content length " + str5 + " exceeds limit at " + str);
                                    zzg(str, file3.getAbsolutePath(), "sizeExceeded", "File too big for full file cache. Size: " + str5);
                                    set.remove(strConcat);
                                    return false;
                                }
                                int i12 = J.f3546b;
                                j.b("Caching " + str5 + " bytes from " + str);
                                ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzn.getInputStream());
                                FileOutputStream fileOutputStream3 = new FileOutputStream(file3);
                                try {
                                    FileChannel channel = fileOutputStream3.getChannel();
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1048576);
                                    o.f1952C.j.getClass();
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    long jLongValue = ((Long) c0254t.f2726c.zzb(zzbby.zzN)).longValue();
                                    Object obj = new Object();
                                    long jLongValue2 = ((Long) c0254t.f2726c.zzb(zzbby.zzM)).longValue();
                                    long j = Long.MIN_VALUE;
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                        if (i14 < 0) {
                                            fileOutputStream3.close();
                                            if (j.j(3)) {
                                                j.b("Preloaded " + zzf.format(i13) + " bytes from " + str);
                                            }
                                            file3.setReadable(true, false);
                                            if (fileZza.isFile()) {
                                                fileZza.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    fileZza.createNewFile();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            zzh(str, file3.getAbsolutePath(), i13);
                                            zze.remove(strConcat);
                                            return true;
                                        }
                                        i13 += i14;
                                        try {
                                            try {
                                                if (i13 > iIntValue) {
                                                    String str6 = "File too big for full file cache. Size: " + Integer.toString(i13);
                                                    throw new IOException("stream cache file size limit exceeded");
                                                }
                                                byteBufferAllocate.flip();
                                                while (channel.write(byteBufferAllocate) > 0) {
                                                }
                                                byteBufferAllocate.clear();
                                                if (System.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue2) {
                                                    String str7 = "Timeout exceeded. Limit: " + Long.toString(jLongValue2) + " sec";
                                                    throw new IOException("stream cache time limit exceeded");
                                                }
                                                if (this.zzh) {
                                                    throw new IOException("abort requested");
                                                }
                                                synchronized (obj) {
                                                    try {
                                                        o.f1952C.j.getClass();
                                                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                                                        if (j + jLongValue > jElapsedRealtime) {
                                                            z4 = z7;
                                                        } else {
                                                            j = jElapsedRealtime;
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
                                                    str3 = str4;
                                                    fileOutputStream = fileOutputStream3;
                                                    try {
                                                        try {
                                                            d.f3805b.post(new zzccc(this, str, file3.getAbsolutePath(), i13, contentLength, false));
                                                        } catch (IOException e7) {
                                                            e = e7;
                                                        }
                                                    } catch (RuntimeException e8) {
                                                        e = e8;
                                                    }
                                                } else {
                                                    fileOutputStream = fileOutputStream3;
                                                    str3 = str4;
                                                }
                                                readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                byteBufferAllocate = byteBufferAllocate;
                                                str4 = str3;
                                                channel = channel;
                                                fileOutputStream3 = fileOutputStream;
                                                iIntValue = iIntValue;
                                                contentLength = contentLength;
                                                z7 = false;
                                            } catch (IOException e9) {
                                                e = e9;
                                            } catch (RuntimeException e10) {
                                                e = e10;
                                            }
                                        } catch (IOException | RuntimeException e11) {
                                            e = e11;
                                            str2 = obj;
                                            fileOutputStream2 = fileOutputStream;
                                        }
                                        str4 = str3;
                                        fileOutputStream2 = fileOutputStream;
                                        str2 = 0;
                                    }
                                } catch (IOException | RuntimeException e12) {
                                    e = e12;
                                    fileOutputStream = fileOutputStream3;
                                    str3 = str4;
                                }
                            } else {
                                str4 = "badUrl";
                                try {
                                    str2 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                    try {
                                        throw new IOException("HTTP status code " + responseCode + " at " + str);
                                    } catch (IOException e13) {
                                        e = e13;
                                    } catch (RuntimeException e14) {
                                        e = e14;
                                    }
                                } catch (IOException | RuntimeException e15) {
                                    e = e15;
                                    str2 = 0;
                                }
                            }
                        } catch (IOException | RuntimeException e16) {
                            e = e16;
                            str4 = "error";
                            str2 = 0;
                            fileOutputStream2 = null;
                        }
                        if (e instanceof RuntimeException) {
                            o.f1952C.f1961g.zzw(e, "VideoStreamFullFileCache.preload");
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (IOException | NullPointerException unused2) {
                        }
                        if (this.zzh) {
                            String strH = AbstractC0486a1.h("Preload aborted for URL \"", str, "\"");
                            int i15 = J.f3546b;
                            j.f(strH);
                        } else {
                            String strH2 = AbstractC0486a1.h("Preload failed for URL \"", str, "\"");
                            int i16 = J.f3546b;
                            j.h(strH2, e);
                        }
                        if (file3.exists() && !file3.delete()) {
                            j.g("Could not delete partial cache file at ".concat(String.valueOf(file3.getAbsolutePath())));
                        }
                        zzg(str, file3.getAbsolutePath(), str4, str2);
                        zze.remove(strConcat);
                        return false;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            File file4 = this.zzg;
            if (file4 == null) {
                break;
            }
            long j3 = Long.MAX_VALUE;
            File file5 = null;
            for (File file6 : file4.listFiles()) {
                if (!file6.getName().endsWith(".done")) {
                    long jLastModified = file6.lastModified();
                    if (jLastModified < j3) {
                        file5 = file6;
                        j3 = jLastModified;
                    }
                }
            }
            if (file5 != null) {
                zDelete = file5.delete();
                File fileZza2 = zza(file5);
                if (fileZza2.isFile()) {
                    zDelete &= fileZza2.delete();
                }
            } else {
                zDelete = false;
            }
        } while (zDelete);
        int i17 = J.f3546b;
        j.g("Unable to expire stream cache");
        zzg(str, null, "expireFailed", null);
        return false;
    }
}
