package com.inmobi.media;

import coil.disk.DiskLruCache;
import com.ironsource.U3;
import io.ktor.sse.ServerSentEventKt;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3786i6 implements Closeable {
    public static final Pattern p = Pattern.compile("[a-z0-9_-]{1,64}");
    public static final C3588b6 q = new C3588b6();
    public final File b;
    public final File c;
    public final File d;
    public final File e;
    public final InterfaceC3729g6 g;
    public final long j;
    public BufferedWriter l;
    public int m;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f7157a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    public final LinkedHashMap i = new LinkedHashMap(0, 0.75f, true);
    public long k = 0;
    public long n = 0;
    public final CallableC3617c6 o = new CallableC3617c6(this);
    public final int f = 1;
    public final int h = 2;

    public C3786i6(File file, long j, InterfaceC3729g6 interfaceC3729g6) {
        this.b = file;
        this.c = new File(file, DiskLruCache.JOURNAL_FILE);
        this.d = new File(file, DiskLruCache.JOURNAL_FILE_TMP);
        this.e = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.j = j;
        this.g = interfaceC3729g6;
    }

    public final void a() {
        File file = this.d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            C3701f6 c3701f6 = (C3701f6) it.next();
            int i = 0;
            if (c3701f6.d == null) {
                while (i < this.h) {
                    this.k += c3701f6.b[i];
                    i++;
                }
            } else {
                c3701f6.d = null;
                while (i < this.h) {
                    File a2 = c3701f6.a(i);
                    if (a2.exists() && !a2.delete()) {
                        throw new IOException();
                    }
                    File b = c3701f6.b(i);
                    if (b.exists() && !b.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        C4084sl c4084sl = new C4084sl(new FileInputStream(this.c), AbstractC3945nn.f7272a);
        try {
            String a2 = c4084sl.a();
            String a3 = c4084sl.a();
            String a4 = c4084sl.a();
            String a5 = c4084sl.a();
            String a6 = c4084sl.a();
            if (!DiskLruCache.MAGIC.equals(a2) || !"1".equals(a3) || !Integer.toString(this.f).equals(a4) || !Integer.toString(this.h).equals(a5) || !"".equals(a6)) {
                throw new IOException("unexpected journal header: [" + a2 + ", " + a3 + ", " + a5 + ", " + a6 + U3.j.e);
            }
            int i = 0;
            while (true) {
                try {
                    c(c4084sl.a());
                    i++;
                } catch (EOFException unused) {
                    this.m = i - this.i.size();
                    AbstractC3945nn.a(c4084sl);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC3945nn.a(c4084sl);
            throw th;
        }
    }

    public final void c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.i.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        C3701f6 c3701f6 = (C3701f6) this.i.get(substring);
        if (c3701f6 == null) {
            c3701f6 = new C3701f6(this, substring);
            this.i.put(substring, c3701f6);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c3701f6.d = new C3672e6(this, c3701f6);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(ServerSentEventKt.SPACE);
        c3701f6.c = true;
        c3701f6.d = null;
        if (split.length != c3701f6.e.h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                c3701f6.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.l == null) {
            return;
        }
        Iterator it = new ArrayList(this.i.values()).iterator();
        while (it.hasNext()) {
            C3672e6 c3672e6 = ((C3701f6) it.next()).d;
            if (c3672e6 != null) {
                c3672e6.d.a(c3672e6, false);
            }
        }
        while (this.k > this.j) {
            d((String) ((Map.Entry) this.i.entrySet().iterator().next()).getKey());
        }
        this.l.close();
        this.l = null;
    }

    public final synchronized void d(String str) {
        if (this.l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        C3701f6 c3701f6 = (C3701f6) this.i.get(str);
        if (c3701f6 != null && c3701f6.d == null) {
            for (int i = 0; i < this.h; i++) {
                File file = c3701f6.a(i);
                if (this.g != null) {
                    Intrinsics.checkNotNullParameter(file, "file");
                    if (str != null && i == 0) {
                        String str2 = "";
                        try {
                            String a2 = AbstractC3945nn.a(new InputStreamReader(new FileInputStream(file), AbstractC3945nn.b));
                            Intrinsics.checkNotNullExpressionValue(a2, "readFully(...)");
                            str2 = a2;
                        } catch (Exception unused) {
                        }
                        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("urlKey", str), TuplesKt.to("url", str2));
                        C3829jm c3829jm = C3829jm.f7187a;
                        C3829jm.b("ResourceDiskCacheFileEvicted", mutableMapOf, EnumC3944nm.f7271a);
                    }
                }
                if (file.exists() && !file.delete()) {
                    throw new IOException("failed to delete " + file);
                }
                long j = this.k;
                long[] jArr = c3701f6.b;
                this.k = j - jArr[i];
                jArr[i] = 0;
            }
            this.m++;
            this.l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.i.remove(str);
            int i2 = this.m;
            if (i2 >= 2000 && i2 >= this.i.size()) {
                this.f7157a.submit(this.o);
            }
        }
    }

    public final C3672e6 a(String str) {
        synchronized (this) {
            if (this.l != null) {
                if (p.matcher(str).matches()) {
                    C3701f6 c3701f6 = (C3701f6) this.i.get(str);
                    if (c3701f6 == null) {
                        c3701f6 = new C3701f6(this, str);
                        this.i.put(str, c3701f6);
                    } else if (c3701f6.d != null) {
                        return null;
                    }
                    C3672e6 c3672e6 = new C3672e6(this, c3701f6);
                    c3701f6.d = c3672e6;
                    this.l.write("DIRTY " + str + '\n');
                    this.l.flush();
                    return c3672e6;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void c() {
        BufferedWriter bufferedWriter = this.l;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.d), AbstractC3945nn.f7272a));
        try {
            bufferedWriter2.write(DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (C3701f6 c3701f6 : this.i.values()) {
                if (c3701f6.d != null) {
                    bufferedWriter2.write("DIRTY " + c3701f6.f7100a + '\n');
                } else {
                    StringBuilder append = new StringBuilder().append("CLEAN ").append(c3701f6.f7100a);
                    StringBuilder sb = new StringBuilder();
                    for (long j : c3701f6.b) {
                        sb.append(' ').append(j);
                    }
                    bufferedWriter2.write(append.append(sb.toString()).append('\n').toString());
                }
            }
            bufferedWriter2.close();
            if (this.c.exists()) {
                File file = this.c;
                File file2 = this.e;
                if (file2.exists() && !file2.delete()) {
                    throw new IOException();
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (this.d.renameTo(this.c)) {
                this.e.delete();
                this.l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c, true), AbstractC3945nn.f7272a));
            } else {
                throw new IOException();
            }
        } catch (Throwable th) {
            bufferedWriter2.close();
            throw th;
        }
    }

    public final synchronized void a(C3672e6 c3672e6, boolean z) {
        int i;
        C3701f6 c3701f6 = c3672e6.f7081a;
        if (c3701f6.d == c3672e6) {
            if (z && !c3701f6.c) {
                for (int i2 = 0; i2 < this.h; i2++) {
                    if (c3672e6.b[i2]) {
                        if (!c3701f6.b(i2).exists()) {
                            c3672e6.d.a(c3672e6, false);
                            return;
                        }
                    } else {
                        c3672e6.d.a(c3672e6, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            for (int i3 = 0; i3 < this.h; i3++) {
                File b = c3701f6.b(i3);
                if (z) {
                    if (b.exists()) {
                        File a2 = c3701f6.a(i3);
                        b.renameTo(a2);
                        long j = c3701f6.b[i3];
                        long length = a2.length();
                        c3701f6.b[i3] = length;
                        this.k = (this.k - j) + length;
                    }
                } else if (b.exists() && !b.delete()) {
                    throw new IOException();
                }
            }
            this.m++;
            c3701f6.d = null;
            if (c3701f6.c | z) {
                c3701f6.c = true;
                BufferedWriter bufferedWriter = this.l;
                StringBuilder append = new StringBuilder("CLEAN ").append(c3701f6.f7100a);
                StringBuilder sb = new StringBuilder();
                for (long j2 : c3701f6.b) {
                    sb.append(' ').append(j2);
                }
                bufferedWriter.write(append.append(sb.toString()).append('\n').toString());
                if (z) {
                    this.n++;
                }
            } else {
                this.i.remove(c3701f6.f7100a);
                this.l.write("REMOVE " + c3701f6.f7100a + '\n');
            }
            this.l.flush();
            if (this.k > this.j || ((i = this.m) >= 2000 && i >= this.i.size())) {
                this.f7157a.submit(this.o);
                return;
            }
            return;
        }
        throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
    }

    public final synchronized C3757h6 b(String key) {
        InputStream inputStream;
        if (this.l != null) {
            if (p.matcher(key).matches()) {
                C3701f6 c3701f6 = (C3701f6) this.i.get(key);
                if (c3701f6 == null) {
                    return null;
                }
                if (!c3701f6.c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.h];
                for (int i = 0; i < this.h; i++) {
                    try {
                        inputStreamArr[i] = new FileInputStream(c3701f6.a(i));
                    } catch (FileNotFoundException unused) {
                        if (this.g != null) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("urlKey", key));
                            C3829jm c3829jm = C3829jm.f7187a;
                            C3829jm.b("ResourceDiskCacheFileMissing", mutableMapOf, EnumC3944nm.f7271a);
                        }
                        for (int i2 = 0; i2 < this.h && (inputStream = inputStreamArr[i2]) != null; i2++) {
                            AbstractC3945nn.a(inputStream);
                        }
                        return null;
                    }
                }
                this.m++;
                this.l.append((CharSequence) ("READ " + key + '\n'));
                int i3 = this.m;
                if (i3 >= 2000 && i3 >= this.i.size()) {
                    this.f7157a.submit(this.o);
                }
                return new C3757h6(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }
}
