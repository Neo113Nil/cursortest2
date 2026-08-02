package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class a implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter k;
    public int m;
    public long j = 0;
    public final LinkedHashMap<String, d> l = new LinkedHashMap<>(0, 0.75f, true);
    public long n = 0;
    public final ThreadPoolExecutor o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final CallableC0052a p = new CallableC0052a();
    public final int e = 1;
    public final int i = 1;

    /* renamed from: com.bumptech.glide.disklrucache.a$a, reason: collision with other inner class name */
    public class CallableC0052a implements Callable<Void> {
        public CallableC0052a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (a.this) {
                try {
                    a aVar = a.this;
                    if (aVar.k == null) {
                        return null;
                    }
                    aVar.a0();
                    if (a.this.x()) {
                        a.this.Y();
                        a.this.m = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    public static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {
        public final d a;
        public final boolean[] b;
        public boolean c;

        public c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[a.this.i];
        }

        public final void a() throws IOException {
            a.d(a.this, this, false);
        }

        public final File b() throws IOException {
            File file;
            synchronized (a.this) {
                try {
                    d dVar = this.a;
                    if (dVar.f != this) {
                        throw new IllegalStateException();
                    }
                    if (!dVar.e) {
                        this.b[0] = true;
                    }
                    file = dVar.d[0];
                    a.this.a.mkdirs();
                } catch (Throwable th) {
                    throw th;
                }
            }
            return file;
        }
    }

    public final class d {
        public final String a;
        public final long[] b;
        public final File[] c;
        public final File[] d;
        public boolean e;
        public c f;

        public d(String str) {
            this.a = str;
            int i = a.this.i;
            File file = a.this.a;
            this.b = new long[i];
            this.c = new File[i];
            this.d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.c[i2] = new File(file, sb.toString());
                sb.append(".tmp");
                this.d[i2] = new File(file, sb.toString());
                sb.setLength(length);
            }
        }

        public final String a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }
    }

    public final class e {
        public final File[] a;

        public e(File[] fileArr) {
            this.a = fileArr;
        }
    }

    public a(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static void Z(File file, File file2, boolean z) throws IOException {
        if (z) {
            q(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void d(a aVar, c cVar, boolean z) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.a;
            if (dVar.f != cVar) {
                throw new IllegalStateException();
            }
            if (z && !dVar.e) {
                for (int i = 0; i < aVar.i; i++) {
                    if (!cVar.b[i]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!dVar.d[i].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < aVar.i; i2++) {
                File file = dVar.d[i2];
                if (!z) {
                    q(file);
                } else if (file.exists()) {
                    File file2 = dVar.c[i2];
                    file.renameTo(file2);
                    long j = dVar.b[i2];
                    long length = file2.length();
                    dVar.b[i2] = length;
                    aVar.j = (aVar.j - j) + length;
                }
            }
            aVar.m++;
            dVar.f = null;
            if (dVar.e || z) {
                dVar.e = true;
                aVar.k.append((CharSequence) "CLEAN");
                aVar.k.append(' ');
                aVar.k.append((CharSequence) dVar.a);
                aVar.k.append((CharSequence) dVar.a());
                aVar.k.append('\n');
                if (z) {
                    aVar.n++;
                }
            } else {
                aVar.l.remove(dVar.a);
                aVar.k.append((CharSequence) "REMOVE");
                aVar.k.append(' ');
                aVar.k.append((CharSequence) dVar.a);
                aVar.k.append('\n');
            }
            t(aVar.k);
            if (aVar.j > aVar.f || aVar.x()) {
                aVar.o.submit(aVar.p);
            }
        }
    }

    @TargetApi(26)
    public static void l(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void q(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void t(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a y(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                Z(file2, file3, false);
            }
        }
        a aVar = new a(file, j);
        if (aVar.b.exists()) {
            try {
                aVar.W();
                aVar.H();
                return aVar;
            } catch (IOException e2) {
                PrintStream printStream = System.out;
                Objects.toString(file);
                e2.getMessage();
                printStream.getClass();
                aVar.close();
                com.bumptech.glide.disklrucache.c.a(aVar.a);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, j);
        aVar2.Y();
        return aVar2;
    }

    public final void H() throws IOException {
        q(this.c);
        Iterator<d> it = this.l.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f;
            int i = this.i;
            int i2 = 0;
            if (cVar == null) {
                while (i2 < i) {
                    this.j += next.b[i2];
                    i2++;
                }
            } else {
                next.f = null;
                while (i2 < i) {
                    q(next.c[i2]);
                    q(next.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void W() throws IOException {
        File file = this.b;
        com.bumptech.glide.disklrucache.b bVar = new com.bumptech.glide.disklrucache.b(new FileInputStream(file), com.bumptech.glide.disklrucache.c.a);
        try {
            String d2 = bVar.d();
            String d3 = bVar.d();
            String d4 = bVar.d();
            String d5 = bVar.d();
            String d6 = bVar.d();
            if (!"libcore.io.DiskLruCache".equals(d2) || !"1".equals(d3) || !Integer.toString(this.e).equals(d4) || !Integer.toString(this.i).equals(d5) || !"".equals(d6)) {
                throw new IOException("unexpected journal header: [" + d2 + ", " + d3 + ", " + d5 + ", " + d6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    X(bVar.d());
                    i++;
                } catch (EOFException unused) {
                    this.m = i - this.l.size();
                    if (bVar.e == -1) {
                        Y();
                    } else {
                        this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), com.bumptech.glide.disklrucache.c.a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void X(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = indexOf + 1;
        int indexOf2 = str.indexOf(32, i);
        LinkedHashMap<String, d> linkedHashMap = this.l;
        if (indexOf2 == -1) {
            substring = str.substring(i);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i, indexOf2);
        }
        d dVar = linkedHashMap.get(substring);
        if (dVar == null) {
            dVar = new d(substring);
            linkedHashMap.put(substring, dVar);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f = new c(dVar);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        dVar.e = true;
        dVar.f = null;
        if (split.length != a.this.i) {
            throw new IOException("unexpected journal line: " + Arrays.toString(split));
        }
        for (int i2 = 0; i2 < split.length; i2++) {
            try {
                dVar.b[i2] = Long.parseLong(split[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            }
        }
    }

    public final synchronized void Y() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.k;
            if (bufferedWriter != null) {
                l(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.c), com.bumptech.glide.disklrucache.c.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.i));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.l.values()) {
                    if (dVar.f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.a + dVar.a() + '\n');
                    }
                }
                l(bufferedWriter2);
                if (this.b.exists()) {
                    Z(this.b, this.d, true);
                }
                Z(this.c, this.b, false);
                this.d.delete();
                this.k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.b, true), com.bumptech.glide.disklrucache.c.a));
            } catch (Throwable th) {
                l(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a0() throws IOException {
        while (this.j > this.f) {
            String key = this.l.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.k == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.l.get(key);
                    if (dVar != null && dVar.f == null) {
                        for (int i = 0; i < this.i; i++) {
                            File file = dVar.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.j;
                            long[] jArr = dVar.b;
                            this.j = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.m++;
                        this.k.append((CharSequence) "REMOVE");
                        this.k.append(' ');
                        this.k.append((CharSequence) key);
                        this.k.append('\n');
                        this.l.remove(key);
                        if (x()) {
                            this.o.submit(this.p);
                        }
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.k == null) {
                return;
            }
            Iterator it = new ArrayList(this.l.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            a0();
            l(this.k);
            this.k = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final c s(String str) throws IOException {
        synchronized (this) {
            try {
                if (this.k == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.l.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.l.put(str, dVar);
                } else if (dVar.f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f = cVar;
                this.k.append((CharSequence) "DIRTY");
                this.k.append(' ');
                this.k.append((CharSequence) str);
                this.k.append('\n');
                t(this.k);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized e u(String str) throws IOException {
        if (this.k == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.l.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.e) {
            return null;
        }
        for (File file : dVar.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.m++;
        this.k.append((CharSequence) "READ");
        this.k.append(' ');
        this.k.append((CharSequence) str);
        this.k.append('\n');
        if (x()) {
            this.o.submit(this.p);
        }
        return new e(dVar.c);
    }

    public final boolean x() {
        int i = this.m;
        return i >= 2000 && i >= this.l.size();
    }
}
