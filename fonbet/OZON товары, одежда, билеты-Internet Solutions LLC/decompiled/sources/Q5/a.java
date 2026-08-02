package Q5;

import android.annotation.TargetApi;
import android.os.StrictMode;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final File f22970a;

    /* renamed from: b, reason: collision with root package name */
    private final File f22971b;

    /* renamed from: c, reason: collision with root package name */
    private final File f22972c;

    /* renamed from: d, reason: collision with root package name */
    private final File f22973d;

    /* renamed from: f, reason: collision with root package name */
    private long f22975f;

    /* renamed from: i, reason: collision with root package name */
    private BufferedWriter f22978i;

    /* renamed from: k, reason: collision with root package name */
    private int f22980k;

    /* renamed from: h, reason: collision with root package name */
    private long f22977h = 0;

    /* renamed from: j, reason: collision with root package name */
    private final LinkedHashMap<String, d> f22979j = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l, reason: collision with root package name */
    private long f22981l = 0;

    /* renamed from: m, reason: collision with root package name */
    final ThreadPoolExecutor f22982m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: n, reason: collision with root package name */
    private final Callable<Void> f22983n = new CallableC0450a();

    /* renamed from: e, reason: collision with root package name */
    private final int f22974e = 1;

    /* renamed from: g, reason: collision with root package name */
    private final int f22976g = 1;

    /* renamed from: Q5.a$a, reason: collision with other inner class name */
    final class CallableC0450a implements Callable<Void> {
        CallableC0450a() {
        }

        @Override // java.util.concurrent.Callable
        public final Void call() throws Exception {
            synchronized (a.this) {
                try {
                    if (a.this.f22978i == null) {
                        return null;
                    }
                    a.this.Q();
                    if (a.this.x()) {
                        a.this.L();
                        a.this.f22980k = 0;
                    }
                    return null;
                } finally {
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a, reason: collision with root package name */
        private final d f22985a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean[] f22986b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f22987c;

        c(d dVar) {
            this.f22985a = dVar;
            this.f22986b = dVar.f22993e ? null : new boolean[a.this.f22976g];
        }

        public final void a() throws IOException {
            a.m(a.this, this, false);
        }

        public final void b() {
            if (this.f22987c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public final void e() throws IOException {
            a.m(a.this, this, true);
            this.f22987c = true;
        }

        public final File f() throws IOException {
            File file;
            synchronized (a.this) {
                try {
                    if (this.f22985a.f22994f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f22985a.f22993e) {
                        this.f22986b[0] = true;
                    }
                    file = this.f22985a.f22992d[0];
                    a.this.f22970a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return file;
        }
    }

    private final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f22989a;

        /* renamed from: b, reason: collision with root package name */
        private final long[] f22990b;

        /* renamed from: c, reason: collision with root package name */
        File[] f22991c;

        /* renamed from: d, reason: collision with root package name */
        File[] f22992d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f22993e;

        /* renamed from: f, reason: collision with root package name */
        private c f22994f;

        d(String str) {
            this.f22989a = str;
            this.f22990b = new long[a.this.f22976g];
            this.f22991c = new File[a.this.f22976g];
            this.f22992d = new File[a.this.f22976g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i11 = 0; i11 < a.this.f22976g; i11++) {
                sb2.append(i11);
                this.f22991c[i11] = new File(a.this.f22970a, sb2.toString());
                sb2.append(".tmp");
                this.f22992d[i11] = new File(a.this.f22970a, sb2.toString());
                sb2.setLength(length);
            }
        }

        static void g(d dVar, String[] strArr) throws IOException {
            if (strArr.length != a.this.f22976g) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
            }
            for (int i11 = 0; i11 < strArr.length; i11++) {
                try {
                    dVar.f22990b[i11] = Long.parseLong(strArr[i11]);
                } catch (NumberFormatException unused) {
                    throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
                }
            }
        }

        public final String h() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j11 : this.f22990b) {
                sb2.append(' ');
                sb2.append(j11);
            }
            return sb2.toString();
        }
    }

    public final class e {

        /* renamed from: a, reason: collision with root package name */
        private final File[] f22996a;

        e(File[] fileArr) {
            this.f22996a = fileArr;
        }

        public final File a() {
            return this.f22996a[0];
        }
    }

    private a(File file, long j11) {
        this.f22970a = file;
        this.f22971b = new File(file, "journal");
        this.f22972c = new File(file, "journal.tmp");
        this.f22973d = new File(file, "journal.bkp");
        this.f22975f = j11;
    }

    private void B() throws IOException {
        File file = this.f22971b;
        Q5.b bVar = new Q5.b(new FileInputStream(file), Q5.c.f23003a);
        try {
            String j11 = bVar.j();
            String j12 = bVar.j();
            String j13 = bVar.j();
            String j14 = bVar.j();
            String j15 = bVar.j();
            if (!"libcore.io.DiskLruCache".equals(j11) || !"1".equals(j12) || !Integer.toString(this.f22974e).equals(j13) || !Integer.toString(this.f22976g).equals(j14) || !"".equals(j15)) {
                throw new IOException("unexpected journal header: [" + j11 + ", " + j12 + ", " + j14 + ", " + j15 + "]");
            }
            int i11 = 0;
            while (true) {
                try {
                    I(bVar.j());
                    i11++;
                } catch (EOFException unused) {
                    this.f22980k = i11 - this.f22979j.size();
                    if (bVar.d()) {
                        L();
                    } else {
                        this.f22978i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), Q5.c.f23003a));
                    }
                    try {
                        bVar.close();
                        return;
                    } catch (RuntimeException e11) {
                        throw e11;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (RuntimeException e12) {
                throw e12;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    private void I(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i11 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i11);
        LinkedHashMap<String, d> linkedHashMap = this.f22979j;
        if (indexOf2 == -1) {
            substring = str.substring(i11);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i11, indexOf2);
        }
        d dVar = linkedHashMap.get(substring);
        if (dVar == null) {
            dVar = new d(substring);
            linkedHashMap.put(substring, dVar);
        }
        if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
            String[] split = str.substring(indexOf2 + 1).split(" ");
            dVar.f22993e = true;
            dVar.f22994f = null;
            d.g(dVar, split);
            return;
        }
        if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f22994f = new c(dVar);
        } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void L() throws IOException {
        try {
            BufferedWriter bufferedWriter = this.f22978i;
            if (bufferedWriter != null) {
                r(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22972c), Q5.c.f23003a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f22974e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f22976g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f22979j.values()) {
                    if (dVar.f22994f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f22989a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f22989a + dVar.h() + '\n');
                    }
                }
                r(bufferedWriter2);
                if (this.f22971b.exists()) {
                    O(this.f22971b, this.f22973d, true);
                }
                O(this.f22972c, this.f22971b, false);
                this.f22973d.delete();
                this.f22978i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22971b, true), Q5.c.f23003a));
            } catch (Throwable th2) {
                r(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private static void O(File file, File file2, boolean z11) throws IOException {
        if (z11) {
            s(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q() throws IOException {
        while (this.f22977h > this.f22975f) {
            String key = this.f22979j.entrySet().iterator().next().getKey();
            synchronized (this) {
                try {
                    if (this.f22978i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    d dVar = this.f22979j.get(key);
                    if (dVar != null && dVar.f22994f == null) {
                        for (int i11 = 0; i11 < this.f22976g; i11++) {
                            File file = dVar.f22991c[i11];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            this.f22977h -= dVar.f22990b[i11];
                            dVar.f22990b[i11] = 0;
                        }
                        this.f22980k++;
                        this.f22978i.append((CharSequence) "REMOVE");
                        this.f22978i.append(' ');
                        this.f22978i.append((CharSequence) key);
                        this.f22978i.append('\n');
                        this.f22979j.remove(key);
                        if (x()) {
                            this.f22982m.submit(this.f22983n);
                        }
                    }
                } finally {
                }
            }
        }
    }

    static void m(a aVar, c cVar, boolean z11) throws IOException {
        synchronized (aVar) {
            d dVar = cVar.f22985a;
            if (dVar.f22994f != cVar) {
                throw new IllegalStateException();
            }
            if (z11 && !dVar.f22993e) {
                for (int i11 = 0; i11 < aVar.f22976g; i11++) {
                    if (!cVar.f22986b[i11]) {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!dVar.f22992d[i11].exists()) {
                        cVar.a();
                        return;
                    }
                }
            }
            for (int i12 = 0; i12 < aVar.f22976g; i12++) {
                File file = dVar.f22992d[i12];
                if (!z11) {
                    s(file);
                } else if (file.exists()) {
                    File file2 = dVar.f22991c[i12];
                    file.renameTo(file2);
                    long j11 = dVar.f22990b[i12];
                    long length = file2.length();
                    dVar.f22990b[i12] = length;
                    aVar.f22977h = (aVar.f22977h - j11) + length;
                }
            }
            aVar.f22980k++;
            dVar.f22994f = null;
            if (dVar.f22993e || z11) {
                dVar.f22993e = true;
                aVar.f22978i.append((CharSequence) "CLEAN");
                aVar.f22978i.append(' ');
                aVar.f22978i.append((CharSequence) dVar.f22989a);
                aVar.f22978i.append((CharSequence) dVar.h());
                aVar.f22978i.append('\n');
                if (z11) {
                    aVar.f22981l++;
                    dVar.getClass();
                }
            } else {
                aVar.f22979j.remove(dVar.f22989a);
                aVar.f22978i.append((CharSequence) "REMOVE");
                aVar.f22978i.append(' ');
                aVar.f22978i.append((CharSequence) dVar.f22989a);
                aVar.f22978i.append('\n');
            }
            v(aVar.f22978i);
            if (aVar.f22977h > aVar.f22975f || aVar.x()) {
                aVar.f22982m.submit(aVar.f22983n);
            }
        }
    }

    @TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
    private static void r(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    private static void s(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    @TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
    private static void v(BufferedWriter bufferedWriter) throws IOException {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        int i11 = this.f22980k;
        return i11 >= 2000 && i11 >= this.f22979j.size();
    }

    public static a y(File file, long j11) throws IOException {
        if (j11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                O(file2, file3, false);
            }
        }
        a aVar = new a(file, j11);
        if (aVar.f22971b.exists()) {
            try {
                aVar.B();
                aVar.z();
                return aVar;
            } catch (IOException e11) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e11.getMessage() + ", removing");
                aVar.close();
                Q5.c.a(aVar.f22970a);
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, j11);
        aVar2.L();
        return aVar2;
    }

    private void z() throws IOException {
        s(this.f22972c);
        Iterator<d> it = this.f22979j.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            c cVar = next.f22994f;
            int i11 = this.f22976g;
            int i12 = 0;
            if (cVar == null) {
                while (i12 < i11) {
                    this.f22977h += next.f22990b[i12];
                    i12++;
                }
            } else {
                next.f22994f = null;
                while (i12 < i11) {
                    s(next.f22991c[i12]);
                    s(next.f22992d[i12]);
                    i12++;
                }
                it.remove();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        try {
            if (this.f22978i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f22979j.values()).iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.f22994f != null) {
                    dVar.f22994f.a();
                }
            }
            Q();
            r(this.f22978i);
            this.f22978i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final c t(String str) throws IOException {
        synchronized (this) {
            try {
                if (this.f22978i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = this.f22979j.get(str);
                if (dVar == null) {
                    dVar = new d(str);
                    this.f22979j.put(str, dVar);
                } else if (dVar.f22994f != null) {
                    return null;
                }
                c cVar = new c(dVar);
                dVar.f22994f = cVar;
                this.f22978i.append((CharSequence) "DIRTY");
                this.f22978i.append(' ');
                this.f22978i.append((CharSequence) str);
                this.f22978i.append('\n');
                v(this.f22978i);
                return cVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized e w(String str) throws IOException {
        if (this.f22978i == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = this.f22979j.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f22993e) {
            return null;
        }
        for (File file : dVar.f22991c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f22980k++;
        this.f22978i.append((CharSequence) "READ");
        this.f22978i.append(' ');
        this.f22978i.append((CharSequence) str);
        this.f22978i.append('\n');
        if (x()) {
            this.f22982m.submit(this.f22983n);
        }
        return new e(dVar.f22991c);
    }
}
