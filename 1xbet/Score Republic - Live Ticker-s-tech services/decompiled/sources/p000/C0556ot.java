package p000;

import android.os.StrictMode;
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
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ot */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0556ot implements Closeable {

    /* JADX INFO: renamed from: j */
    public final File f5854j;

    /* JADX INFO: renamed from: k */
    public final File f5855k;

    /* JADX INFO: renamed from: l */
    public final File f5856l;

    /* JADX INFO: renamed from: m */
    public final File f5857m;

    /* JADX INFO: renamed from: o */
    public final long f5859o;

    /* JADX INFO: renamed from: r */
    public BufferedWriter f5862r;

    /* JADX INFO: renamed from: t */
    public int f5864t;

    /* JADX INFO: renamed from: q */
    public long f5861q = 0;

    /* JADX INFO: renamed from: s */
    public final LinkedHashMap f5863s = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: u */
    public long f5865u = 0;

    /* JADX INFO: renamed from: v */
    public final ThreadPoolExecutor f5866v = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0482mt());

    /* JADX INFO: renamed from: w */
    public final CallableC0445lt f5867w = new CallableC0445lt(0, this);

    /* JADX INFO: renamed from: n */
    public final int f5858n = 1;

    /* JADX INFO: renamed from: p */
    public final int f5860p = 1;

    public C0556ot(File file, long j) {
        this.f5854j = file;
        this.f5855k = new File(file, "journal");
        this.f5856l = new File(file, "journal.tmp");
        this.f5857m = new File(file, "journal.bkp");
        this.f5859o = j;
    }

    /* JADX INFO: renamed from: a */
    public static void m3753a(C0556ot c0556ot, C0809vn c0809vn, boolean z) {
        synchronized (c0556ot) {
            C0519nt c0519nt = (C0519nt) c0809vn.f8224l;
            if (c0519nt.f5537f != c0809vn) {
                throw new IllegalStateException();
            }
            if (z && !c0519nt.f5536e) {
                for (int i = 0; i < c0556ot.f5860p; i++) {
                    if (!((boolean[]) c0809vn.f8225m)[i]) {
                        c0809vn.m5171b();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!c0519nt.f5535d[i].exists()) {
                        c0809vn.m5171b();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < c0556ot.f5860p; i2++) {
                File file = c0519nt.f5535d[i2];
                if (!z) {
                    m3755i(file);
                } else if (file.exists()) {
                    File file2 = c0519nt.f5534c[i2];
                    file.renameTo(file2);
                    long j = c0519nt.f5533b[i2];
                    long length = file2.length();
                    c0519nt.f5533b[i2] = length;
                    c0556ot.f5861q = (c0556ot.f5861q - j) + length;
                }
            }
            c0556ot.f5864t++;
            c0519nt.f5537f = null;
            if (c0519nt.f5536e || z) {
                c0519nt.f5536e = true;
                c0556ot.f5862r.append((CharSequence) "CLEAN");
                c0556ot.f5862r.append(' ');
                c0556ot.f5862r.append((CharSequence) c0519nt.f5532a);
                c0556ot.f5862r.append((CharSequence) c0519nt.m3588a());
                c0556ot.f5862r.append('\n');
                if (z) {
                    c0556ot.f5865u++;
                }
            } else {
                c0556ot.f5863s.remove(c0519nt.f5532a);
                c0556ot.f5862r.append((CharSequence) "REMOVE");
                c0556ot.f5862r.append(' ');
                c0556ot.f5862r.append((CharSequence) c0519nt.f5532a);
                c0556ot.f5862r.append('\n');
            }
            m3756l(c0556ot.f5862r);
            if (c0556ot.f5861q > c0556ot.f5859o || c0556ot.m3761o()) {
                c0556ot.f5866v.submit(c0556ot.f5867w);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m3754e(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m3755i(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m3756l(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: p */
    public static C0556ot m3757p(File file, long j) throws IOException {
        if (j <= 0) {
            C0270h1.m2190f("maxSize <= 0");
            return null;
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m3758u(file2, file3, false);
            }
        }
        C0556ot c0556ot = new C0556ot(file, j);
        if (c0556ot.f5855k.exists()) {
            try {
                c0556ot.m3763r();
                c0556ot.m3762q();
                return c0556ot;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                c0556ot.close();
                bh1.m668a(c0556ot.f5854j);
            }
        }
        file.mkdirs();
        C0556ot c0556ot2 = new C0556ot(file, j);
        c0556ot2.m3765t();
        return c0556ot2;
    }

    /* JADX INFO: renamed from: u */
    public static void m3758u(File file, File file2, boolean z) throws IOException {
        if (z) {
            m3755i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f5862r == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.f5863s.values());
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C0809vn c0809vn = ((C0519nt) obj).f5537f;
                if (c0809vn != null) {
                    c0809vn.m5171b();
                }
            }
            m3766v();
            m3754e(this.f5862r);
            this.f5862r = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final C0809vn m3759j(String str) {
        synchronized (this) {
            try {
                if (this.f5862r == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C0519nt c0519nt = (C0519nt) this.f5863s.get(str);
                if (c0519nt == null) {
                    c0519nt = new C0519nt(this, str);
                    this.f5863s.put(str, c0519nt);
                } else if (c0519nt.f5537f != null) {
                    return null;
                }
                C0809vn c0809vn = new C0809vn(this, c0519nt);
                c0519nt.f5537f = c0809vn;
                this.f5862r.append((CharSequence) "DIRTY");
                this.f5862r.append(' ');
                this.f5862r.append((CharSequence) str);
                this.f5862r.append('\n');
                m3756l(this.f5862r);
                return c0809vn;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final synchronized nu1 m3760m(String str) {
        if (this.f5862r == null) {
            throw new IllegalStateException("cache is closed");
        }
        C0519nt c0519nt = (C0519nt) this.f5863s.get(str);
        if (c0519nt == null) {
            return null;
        }
        if (!c0519nt.f5536e) {
            return null;
        }
        for (File file : c0519nt.f5534c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f5864t++;
        this.f5862r.append((CharSequence) "READ");
        this.f5862r.append(' ');
        this.f5862r.append((CharSequence) str);
        this.f5862r.append('\n');
        if (m3761o()) {
            this.f5866v.submit(this.f5867w);
        }
        return new nu1(16, c0519nt.f5534c);
    }

    /* JADX INFO: renamed from: o */
    public final boolean m3761o() {
        int i = this.f5864t;
        return i >= 2000 && i >= this.f5863s.size();
    }

    /* JADX INFO: renamed from: q */
    public final void m3762q() throws IOException {
        m3755i(this.f5856l);
        Iterator it = this.f5863s.values().iterator();
        while (it.hasNext()) {
            C0519nt c0519nt = (C0519nt) it.next();
            C0809vn c0809vn = c0519nt.f5537f;
            int i = this.f5860p;
            int i2 = 0;
            if (c0809vn == null) {
                while (i2 < i) {
                    this.f5861q += c0519nt.f5533b[i2];
                    i2++;
                }
            } else {
                c0519nt.f5537f = null;
                while (i2 < i) {
                    m3755i(c0519nt.f5534c[i2]);
                    m3755i(c0519nt.f5535d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3763r() {
        File file = this.f5855k;
        va1 va1Var = new va1(new FileInputStream(file), bh1.f876a);
        try {
            String strM5140a = va1Var.m5140a();
            String strM5140a2 = va1Var.m5140a();
            String strM5140a3 = va1Var.m5140a();
            String strM5140a4 = va1Var.m5140a();
            String strM5140a5 = va1Var.m5140a();
            if (!"libcore.io.DiskLruCache".equals(strM5140a) || !"1".equals(strM5140a2) || !Integer.toString(this.f5858n).equals(strM5140a3) || !Integer.toString(this.f5860p).equals(strM5140a4) || !"".equals(strM5140a5)) {
                throw new IOException("unexpected journal header: [" + strM5140a + ", " + strM5140a2 + ", " + strM5140a4 + ", " + strM5140a5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    m3764s(va1Var.m5140a());
                    i++;
                } catch (EOFException unused) {
                    this.f5864t = i - this.f5863s.size();
                    if (va1Var.f8154n == -1) {
                        m3765t();
                    } else {
                        this.f5862r = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), bh1.f876a));
                    }
                    try {
                        va1Var.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                va1Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3764s(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            C0270h1.m2187c("unexpected journal line: ".concat(str));
            return;
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.f5863s;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        C0519nt c0519nt = (C0519nt) linkedHashMap.get(strSubstring);
        if (c0519nt == null) {
            c0519nt = new C0519nt(this, strSubstring);
            linkedHashMap.put(strSubstring, c0519nt);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c0519nt.f5537f = new C0809vn(this, c0519nt);
                return;
            } else {
                if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
                    return;
                }
                C0270h1.m2187c("unexpected journal line: ".concat(str));
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c0519nt.f5536e = true;
        c0519nt.f5537f = null;
        if (strArrSplit.length != c0519nt.f5538g.f5860p) {
            C0042ay.m527d(Arrays.toString(strArrSplit), "unexpected journal line: ");
            return;
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                c0519nt.f5533b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                C0042ay.m527d(Arrays.toString(strArrSplit), "unexpected journal line: ");
                return;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final synchronized void m3765t() {
        try {
            BufferedWriter bufferedWriter = this.f5862r;
            if (bufferedWriter != null) {
                m3754e(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5856l), bh1.f876a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f5858n));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f5860p));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C0519nt c0519nt : this.f5863s.values()) {
                    if (c0519nt.f5537f != null) {
                        bufferedWriter2.write("DIRTY " + c0519nt.f5532a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c0519nt.f5532a + c0519nt.m3588a() + '\n');
                    }
                }
                m3754e(bufferedWriter2);
                if (this.f5855k.exists()) {
                    m3758u(this.f5855k, this.f5857m, true);
                }
                m3758u(this.f5856l, this.f5855k, false);
                this.f5857m.delete();
                this.f5862r = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f5855k, true), bh1.f876a));
            } catch (Throwable th) {
                m3754e(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3766v() {
        while (this.f5861q > this.f5859o) {
            String str = (String) ((Map.Entry) this.f5863s.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f5862r == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C0519nt c0519nt = (C0519nt) this.f5863s.get(str);
                    if (c0519nt != null && c0519nt.f5537f == null) {
                        for (int i = 0; i < this.f5860p; i++) {
                            File file = c0519nt.f5534c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.f5861q;
                            long[] jArr = c0519nt.f5533b;
                            this.f5861q = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.f5864t++;
                        this.f5862r.append((CharSequence) "REMOVE");
                        this.f5862r.append(' ');
                        this.f5862r.append((CharSequence) str);
                        this.f5862r.append('\n');
                        this.f5863s.remove(str);
                        if (m3761o()) {
                            this.f5866v.submit(this.f5867w);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
