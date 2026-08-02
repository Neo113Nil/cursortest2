package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class K3 {

    /* renamed from: a, reason: collision with root package name */
    public long f10115a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10116b;

    /* renamed from: c, reason: collision with root package name */
    public final Serializable f10117c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f10118d;

    public K3(long j5, String str, String str2, int i) {
        this.f10115a = j5;
        this.f10117c = str;
        this.f10118d = str2;
        this.f10116b = i;
    }

    public static int d(I3 i32) {
        return (m(i32) << 24) | m(i32) | (m(i32) << 8) | (m(i32) << 16);
    }

    public static long e(I3 i32) {
        return (m(i32) & 255) | ((m(i32) & 255) << 8) | ((m(i32) & 255) << 16) | ((m(i32) & 255) << 24) | ((m(i32) & 255) << 32) | ((m(i32) & 255) << 40) | ((m(i32) & 255) << 48) | ((m(i32) & 255) << 56);
    }

    public static String g(I3 i32) {
        return new String(l(i32, e(i32)), "UTF-8");
    }

    public static void i(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void j(BufferedOutputStream bufferedOutputStream, long j5) {
        bufferedOutputStream.write((byte) j5);
        bufferedOutputStream.write((byte) (j5 >>> 8));
        bufferedOutputStream.write((byte) (j5 >>> 16));
        bufferedOutputStream.write((byte) (j5 >>> 24));
        bufferedOutputStream.write((byte) (j5 >>> 32));
        bufferedOutputStream.write((byte) (j5 >>> 40));
        bufferedOutputStream.write((byte) (j5 >>> 48));
        bufferedOutputStream.write((byte) (j5 >>> 56));
    }

    public static void k(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        int length = bytes.length;
        j(bufferedOutputStream, length);
        bufferedOutputStream.write(bytes, 0, length);
    }

    public static byte[] l(I3 i32, long j5) {
        long j6 = i32.f9522l - i32.f9523m;
        if (j5 >= 0 && j5 <= j6) {
            int i = (int) j5;
            if (i == j5) {
                byte[] bArr = new byte[i];
                new DataInputStream(i32).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j5 + ", maxLength=" + j6);
    }

    public static int m(I3 i32) {
        int read = i32.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String o(String str) {
        int length = str.length() / 2;
        return String.valueOf(String.valueOf(str.substring(0, length).hashCode())).concat(String.valueOf(String.valueOf(str.substring(length).hashCode())));
    }

    public synchronized C1456q3 a(String str) {
        H3 h3 = (H3) ((LinkedHashMap) this.f10117c).get(str);
        if (h3 == null) {
            return null;
        }
        File f = f(str);
        try {
            I3 i32 = new I3(new BufferedInputStream(new FileInputStream(f)), f.length());
            try {
                H3 a5 = H3.a(i32);
                if (!TextUtils.equals(str, a5.f9316b)) {
                    F3.a("%s: key=%s, found=%s", f.getAbsolutePath(), str, a5.f9316b);
                    H3 h32 = (H3) ((LinkedHashMap) this.f10117c).remove(str);
                    if (h32 != null) {
                        this.f10115a -= h32.f9315a;
                    }
                    return null;
                }
                byte[] l5 = l(i32, i32.f9522l - i32.f9523m);
                C1456q3 c1456q3 = new C1456q3();
                c1456q3.f15087a = l5;
                c1456q3.f15088b = h3.f9317c;
                c1456q3.f15089c = h3.f9318d;
                c1456q3.f15090d = h3.f9319e;
                c1456q3.f15091e = h3.f;
                c1456q3.f = h3.f9320g;
                List<C1635u3> list = h3.f9321h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (C1635u3 c1635u3 : list) {
                    treeMap.put(c1635u3.f15790a, c1635u3.f15791b);
                }
                c1456q3.f15092g = treeMap;
                c1456q3.f15093h = Collections.unmodifiableList(h3.f9321h);
                return c1456q3;
            } finally {
                i32.close();
            }
        } catch (IOException e3) {
            F3.a("%s: %s", f.getAbsolutePath(), e3.toString());
            h(str);
            return null;
        }
    }

    public synchronized void b() {
        long length;
        I3 i32;
        synchronized (this) {
            File a5 = ((J3) this.f10118d).a();
            if (a5.exists()) {
                File[] listFiles = a5.listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        try {
                            length = file.length();
                            i32 = new I3(new BufferedInputStream(new FileInputStream(file)), length);
                        } catch (IOException unused) {
                            file.delete();
                        }
                        try {
                            H3 a6 = H3.a(i32);
                            a6.f9315a = length;
                            n(a6.f9316b, a6);
                            i32.close();
                        } catch (Throwable th) {
                            i32.close();
                            throw th;
                        }
                    }
                }
            } else if (!a5.mkdirs()) {
                F3.b("Unable to create cache dir %s", a5.getAbsolutePath());
            }
        }
    }

    public synchronized void c(String str, C1456q3 c1456q3) {
        long j5;
        float f;
        try {
            long j6 = this.f10115a;
            int length = c1456q3.f15087a.length;
            long j7 = j6 + length;
            int i = this.f10116b;
            float f5 = 0.9f;
            if (j7 <= i || length <= i * 0.9f) {
                File f6 = f(str);
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(f6));
                    H3 h3 = new H3(str, c1456q3);
                    try {
                        i(bufferedOutputStream, 538247942);
                        k(bufferedOutputStream, str);
                        String str2 = h3.f9317c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        k(bufferedOutputStream, str2);
                        j(bufferedOutputStream, h3.f9318d);
                        j(bufferedOutputStream, h3.f9319e);
                        j(bufferedOutputStream, h3.f);
                        j(bufferedOutputStream, h3.f9320g);
                        List<C1635u3> list = h3.f9321h;
                        if (list != null) {
                            i(bufferedOutputStream, list.size());
                            for (C1635u3 c1635u3 : list) {
                                k(bufferedOutputStream, c1635u3.f15790a);
                                k(bufferedOutputStream, c1635u3.f15791b);
                            }
                        } else {
                            i(bufferedOutputStream, 0);
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.write(c1456q3.f15087a);
                        bufferedOutputStream.close();
                        h3.f9315a = f6.length();
                        n(str, h3);
                        if (this.f10115a >= this.f10116b) {
                            if (F3.f8650a) {
                                F3.c("Pruning old cache entries.", new Object[0]);
                            }
                            long j8 = this.f10115a;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Iterator it = ((LinkedHashMap) this.f10117c).entrySet().iterator();
                            int i5 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    j5 = j8;
                                    break;
                                }
                                H3 h32 = (H3) ((Map.Entry) it.next()).getValue();
                                if (f(h32.f9316b).delete()) {
                                    f = f5;
                                    j5 = j8;
                                    this.f10115a -= h32.f9315a;
                                } else {
                                    f = f5;
                                    j5 = j8;
                                    String str3 = h32.f9316b;
                                    F3.a("Could not delete cache entry for key=%s, filename=%s", str3, o(str3));
                                }
                                it.remove();
                                i5++;
                                if (this.f10115a < this.f10116b * f) {
                                    break;
                                }
                                j8 = j5;
                                f5 = f;
                            }
                            if (F3.f8650a) {
                                F3.c("pruned %d files, %d bytes, %d ms", Integer.valueOf(i5), Long.valueOf(this.f10115a - j5), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                            }
                        }
                    } catch (IOException e3) {
                        F3.a("%s", e3.toString());
                        bufferedOutputStream.close();
                        F3.a("Failed to write header for %s", f6.getAbsolutePath());
                        throw new IOException();
                    }
                } catch (IOException unused) {
                    if (!f6.delete()) {
                        F3.a("Could not clean up file %s", f6.getAbsolutePath());
                    }
                    if (!((J3) this.f10118d).a().exists()) {
                        F3.a("Re-initializing cache after external clearing.", new Object[0]);
                        ((LinkedHashMap) this.f10117c).clear();
                        this.f10115a = 0L;
                        b();
                    }
                }
            }
        } finally {
        }
    }

    public File f(String str) {
        return new File(((J3) this.f10118d).a(), o(str));
    }

    public synchronized void h(String str) {
        boolean delete = f(str).delete();
        H3 h3 = (H3) ((LinkedHashMap) this.f10117c).remove(str);
        if (h3 != null) {
            this.f10115a -= h3.f9315a;
        }
        if (delete) {
            return;
        }
        F3.a("Could not delete cache entry for key=%s, filename=%s", str, o(str));
    }

    public void n(String str, H3 h3) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f10117c;
        if (linkedHashMap.containsKey(str)) {
            this.f10115a = (h3.f9315a - ((H3) linkedHashMap.get(str)).f9315a) + this.f10115a;
        } else {
            this.f10115a += h3.f9315a;
        }
        linkedHashMap.put(str, h3);
    }

    public K3(C1390oj c1390oj) {
        this.f10117c = new LinkedHashMap(16, 0.75f, true);
        this.f10115a = 0L;
        this.f10118d = c1390oj;
        this.f10116b = 5242880;
    }

    public K3(File file) {
        this.f10117c = new LinkedHashMap(16, 0.75f, true);
        this.f10115a = 0L;
        this.f10118d = new C1529ro(4, file);
        this.f10116b = 20971520;
    }
}
