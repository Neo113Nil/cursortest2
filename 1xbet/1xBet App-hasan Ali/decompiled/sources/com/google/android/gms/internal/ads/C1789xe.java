package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1789xe extends AbstractC1744we {

    /* renamed from: p, reason: collision with root package name */
    public static final Set f16309p = Collections.synchronizedSet(new HashSet());

    /* renamed from: q, reason: collision with root package name */
    public static final DecimalFormat f16310q = new DecimalFormat("#,###");

    /* renamed from: n, reason: collision with root package name */
    public File f16311n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16312o;

    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    public final void k() {
        this.f16312o = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038e  */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r0v40, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.nio.channels.ReadableByteChannel] */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.google.android.gms.internal.ads.D7] */
    /* JADX WARN: Type inference failed for: r7v6, types: [com.google.android.gms.internal.ads.A7] */
    @Override // com.google.android.gms.internal.ads.AbstractC1744we
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(String str) {
        int i;
        String str2;
        FileOutputStream fileOutputStream;
        long j5;
        String str3;
        int i5;
        int i6;
        boolean z3;
        if (this.f16311n == null) {
            l(str, null, "noCacheDir", null);
            return false;
        }
        do {
            File file = this.f16311n;
            if (file == null) {
                i = 0;
            } else {
                i = 0;
                for (File file2 : file.listFiles()) {
                    if (!file2.getName().endsWith(".done")) {
                        i++;
                    }
                }
            }
            A7 a7 = F7.f8883q;
            Q2.r rVar = Q2.r.f5053d;
            if (i > ((Integer) rVar.f5056c.a(a7)).intValue()) {
                File file3 = this.f16311n;
                if (file3 == null) {
                    break;
                }
                long j6 = Long.MAX_VALUE;
                File file4 = null;
                for (File file5 : file3.listFiles()) {
                    if (!file5.getName().endsWith(".done")) {
                        long lastModified = file5.lastModified();
                        if (lastModified < j6) {
                            file4 = file5;
                            j6 = lastModified;
                        }
                    }
                }
                if (file4 != null) {
                    z3 = file4.delete();
                    File t5 = t(file4);
                    if (t5.isFile()) {
                        z3 &= t5.delete();
                    }
                } else {
                    z3 = false;
                }
            } else {
                File file6 = new File(new File(this.f16311n, U2.e.n(str, "MD5")).getPath());
                File t6 = t(file6);
                if (file6.isFile() && t6.isFile()) {
                    int length = (int) file6.length();
                    U2.j.d("Stream cache hit at ".concat(String.valueOf(str)));
                    U2.e.f5861b.post(new RunnableC1609te(this, str, file6.getAbsolutePath(), length));
                    return true;
                }
                String valueOf = String.valueOf(this.f16311n.getAbsolutePath());
                String valueOf2 = String.valueOf(str);
                Set set = f16309p;
                String concat = valueOf.concat(valueOf2);
                synchronized (set) {
                    try {
                        if (set.contains(concat)) {
                            U2.j.i("Stream cache already in progress at " + str);
                            l(str, file6.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(concat);
                        String str4 = "error";
                        try {
                            Aq aq = new Aq(3, (byte) 0);
                            It it = new It();
                            it.f9640k = aq;
                            it.f9641l = null;
                            HttpURLConnection b3 = it.b(new Ix(str, 4));
                            int responseCode = b3.getResponseCode();
                            if (responseCode >= 400) {
                                str4 = "badUrl";
                                str2 = "HTTP request failed. Code: " + Integer.toString(responseCode);
                                try {
                                    throw new IOException("HTTP status code " + responseCode + " at " + str);
                                } catch (IOException e3) {
                                    e = e3;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.f16312o) {
                                    }
                                    if (file6.exists()) {
                                    }
                                    l(str, file6.getAbsolutePath(), str4, str2);
                                    f16309p.remove(concat);
                                    return false;
                                } catch (RuntimeException e5) {
                                    e = e5;
                                    fileOutputStream = null;
                                    if (e instanceof RuntimeException) {
                                    }
                                    fileOutputStream.close();
                                    if (this.f16312o) {
                                    }
                                    if (file6.exists()) {
                                    }
                                    l(str, file6.getAbsolutePath(), str4, str2);
                                    f16309p.remove(concat);
                                    return false;
                                }
                            }
                            int contentLength = b3.getContentLength();
                            if (contentLength < 0) {
                                U2.j.i("Stream cache aborted, missing content-length header at " + str);
                                l(str, file6.getAbsolutePath(), "contentLengthMissing", null);
                                set.remove(concat);
                                return false;
                            }
                            String format = f16310q.format(contentLength);
                            int intValue = ((Integer) rVar.f5056c.a(F7.f8889r)).intValue();
                            if (contentLength > intValue) {
                                U2.j.i("Content length " + format + " exceeds limit at " + str);
                                StringBuilder sb = new StringBuilder();
                                sb.append("File too big for full file cache. Size: ");
                                sb.append(format);
                                l(str, file6.getAbsolutePath(), "sizeExceeded", sb.toString());
                                set.remove(concat);
                                return false;
                            }
                            U2.j.d("Caching " + format + " bytes from " + str);
                            ?? newChannel = Channels.newChannel(b3.getInputStream());
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file6);
                            try {
                                try {
                                    ?? channel = fileOutputStream2.getChannel();
                                    ?? allocate = ByteBuffer.allocate(1048576);
                                    P2.o.f4767B.f4776j.getClass();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    ?? r7 = F7.f8665C;
                                    T2.z zVar = new T2.z(((Long) rVar.f5056c.a(r7)).longValue());
                                    long longValue = ((Long) rVar.f5056c.a(F7.f8660B)).longValue();
                                    int i7 = 0;
                                    String str5 = r7;
                                    while (true) {
                                        int read = newChannel.read(allocate);
                                        if (read < 0) {
                                            fileOutputStream2.close();
                                            if (U2.j.l(3)) {
                                                U2.j.d("Preloaded " + f16310q.format(i7) + " bytes from " + str);
                                            }
                                            file6.setReadable(true, false);
                                            if (t6.isFile()) {
                                                t6.setLastModified(System.currentTimeMillis());
                                            } else {
                                                try {
                                                    t6.createNewFile();
                                                } catch (IOException unused) {
                                                }
                                            }
                                            U2.e.f5861b.post(new RunnableC1609te(this, str, file6.getAbsolutePath(), i7));
                                            f16309p.remove(concat);
                                            return true;
                                        }
                                        int i8 = i7 + read;
                                        try {
                                            if (i8 > intValue) {
                                                String str6 = "File too big for full file cache. Size: " + Integer.toString(i8);
                                                throw new IOException("stream cache file size limit exceeded");
                                            }
                                            allocate.flip();
                                            while (channel.write(allocate) > 0) {
                                            }
                                            allocate.clear();
                                            if (System.currentTimeMillis() - currentTimeMillis > 1000 * longValue) {
                                                String str7 = "Timeout exceeded. Limit: " + Long.toString(longValue) + " sec";
                                                throw new IOException("stream cache time limit exceeded");
                                            }
                                            Object obj = channel;
                                            if (this.f16312o) {
                                                throw new IOException("abort requested");
                                            }
                                            if (zVar.i()) {
                                                String str8 = allocate;
                                                i5 = contentLength;
                                                i6 = i8;
                                                j5 = longValue;
                                                str3 = str8;
                                                U2.e.f5861b.post(new RunnableC1430pe(this, str, file6.getAbsolutePath(), i6, i5));
                                            } else {
                                                j5 = longValue;
                                                str3 = allocate;
                                                i5 = contentLength;
                                                i6 = i8;
                                            }
                                            i7 = i6;
                                            contentLength = i5;
                                            allocate = str3;
                                            channel = obj;
                                            longValue = j5;
                                            str5 = str3;
                                        } catch (IOException | RuntimeException e6) {
                                            e = e6;
                                            str2 = str5;
                                            fileOutputStream = fileOutputStream2;
                                            if (e instanceof RuntimeException) {
                                            }
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException | NullPointerException unused2) {
                                            }
                                            if (this.f16312o) {
                                            }
                                            if (file6.exists()) {
                                            }
                                            l(str, file6.getAbsolutePath(), str4, str2);
                                            f16309p.remove(concat);
                                            return false;
                                        }
                                    }
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    fileOutputStream = fileOutputStream2;
                                    str2 = null;
                                    if (e instanceof RuntimeException) {
                                        P2.o.f4767B.f4774g.i("VideoStreamFullFileCache.preload", e);
                                    }
                                    fileOutputStream.close();
                                    if (this.f16312o) {
                                        U2.j.h("Preload aborted for URL \"" + str + "\"");
                                    } else {
                                        U2.j.j("Preload failed for URL \"" + str + "\"", e);
                                    }
                                    if (file6.exists() && !file6.delete()) {
                                        U2.j.i("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                    }
                                    l(str, file6.getAbsolutePath(), str4, str2);
                                    f16309p.remove(concat);
                                    return false;
                                }
                            } catch (IOException e8) {
                                e = e8;
                                fileOutputStream = fileOutputStream2;
                                str2 = null;
                                if (e instanceof RuntimeException) {
                                }
                                fileOutputStream.close();
                                if (this.f16312o) {
                                }
                                if (file6.exists()) {
                                    U2.j.i("Could not delete partial cache file at ".concat(String.valueOf(file6.getAbsolutePath())));
                                }
                                l(str, file6.getAbsolutePath(), str4, str2);
                                f16309p.remove(concat);
                                return false;
                            }
                        } catch (IOException | RuntimeException e9) {
                            e = e9;
                            str2 = null;
                        }
                    } finally {
                    }
                }
            }
        } while (z3);
        U2.j.i("Unable to expire stream cache");
        l(str, null, "expireFailed", null);
        return false;
    }

    public final File t(File file) {
        return new File(new File(this.f16311n, String.valueOf(file.getName()).concat(".done")).getPath());
    }
}
