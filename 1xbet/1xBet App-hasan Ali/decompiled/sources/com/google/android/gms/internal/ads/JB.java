package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class JB {

    /* renamed from: E, reason: collision with root package name */
    public static final Lj f9878E;

    /* renamed from: P, reason: collision with root package name */
    public static final C0861cr f9887P;

    /* renamed from: Q, reason: collision with root package name */
    public static final C0861cr f9888Q;

    /* renamed from: v, reason: collision with root package name */
    public static final O5 f9909v;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9890a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9891b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9892c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9893d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9894e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9895g = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f9896h = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] i = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f9897j = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9898k = {5, 8, 10, 12};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f9899l = {6, 9, 12, 15};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f9900m = {2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f9901n = {9, 11, 13, 16};

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f9902o = {5, 8, 10, 12};

    /* renamed from: p, reason: collision with root package name */
    public static final String[] f9903p = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: q, reason: collision with root package name */
    public static final String[] f9904q = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: r, reason: collision with root package name */
    public static final String[] f9905r = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f9906s = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: t, reason: collision with root package name */
    public static final G3 f9907t = new G3(4, "https://csi.gstatic.com/csi", "gads:sdk_csi_server");

    /* renamed from: u, reason: collision with root package name */
    public static final G3 f9908u = new G3(4, "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/sdk-core-v40-loader.html", "gads:sdk_core_location");

    /* renamed from: w, reason: collision with root package name */
    public static final O5 f9910w = new O5(10);

    /* renamed from: x, reason: collision with root package name */
    public static final O5 f9911x = new O5(12);

    /* renamed from: y, reason: collision with root package name */
    public static final O5 f9912y = new O5(14);

    /* renamed from: z, reason: collision with root package name */
    public static final O5 f9913z = new O5(16);

    /* renamed from: A, reason: collision with root package name */
    public static final O5 f9874A = new O5(25);

    /* renamed from: B, reason: collision with root package name */
    public static final O5 f9875B = new O5(27);

    /* renamed from: C, reason: collision with root package name */
    public static final Lj f9876C = new Lj(0);

    /* renamed from: D, reason: collision with root package name */
    public static final Object f9877D = new Object();

    /* renamed from: F, reason: collision with root package name */
    public static final Lj f9879F = new Lj(9);

    /* renamed from: G, reason: collision with root package name */
    public static final Lj f9880G = new Lj(11);

    /* renamed from: H, reason: collision with root package name */
    public static final Lj f9881H = new Lj(13);

    /* renamed from: I, reason: collision with root package name */
    public static final Lj f9882I = new Lj(15);
    public static final Lj J = new Lj(17);
    public static final Lj K = new Lj(20);

    /* renamed from: L, reason: collision with root package name */
    public static final Lj f9883L = new Lj(23);

    /* renamed from: M, reason: collision with root package name */
    public static final Lj f9884M = new Lj(28);

    /* renamed from: N, reason: collision with root package name */
    public static final C0861cr f9885N = new C0861cr(0);

    /* renamed from: O, reason: collision with root package name */
    public static final C0861cr f9886O = new C0861cr(2);

    /* renamed from: R, reason: collision with root package name */
    public static final C0861cr f9889R = new C0861cr(8);

    static {
        int i5 = 6;
        int i6 = 4;
        f9909v = new O5(i6);
        f9878E = new Lj(i5);
        f9887P = new C0861cr(i6);
        f9888Q = new C0861cr(i5);
    }

    public static String a(String str, Throwable th) {
        String replace;
        if (th != null) {
            synchronized (f9877D) {
                Throwable th2 = th;
                while (true) {
                    if (th2 == null) {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    } finally {
                    }
                }
            }
        } else {
            replace = null;
        }
        if (TextUtils.isEmpty(replace)) {
            return str;
        }
        return str + "\n  " + replace.replace("\n", "\n  ") + "\n";
    }

    public static C1761wv b(XmlPullParser xmlPullParser, String str, String str2) {
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i5 = 0;
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (AbstractC1803xs.H(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String h3 = AbstractC1803xs.h(xmlPullParser, concat2);
                String h4 = AbstractC1803xs.h(xmlPullParser, concat3);
                String h5 = AbstractC1803xs.h(xmlPullParser, concat4);
                String h6 = AbstractC1803xs.h(xmlPullParser, concat5);
                if (h3 == null || h4 == null) {
                    C0954ev c0954ev = AbstractC1044gv.f13676l;
                    return C1761wv.f16184o;
                }
                C1722w0 c1722w0 = new C1722w0(h5 != null ? Long.parseLong(h5) : 0L, h6 != null ? Long.parseLong(h6) : 0L, h3);
                int length = objArr.length;
                int i6 = i5 + 1;
                int d5 = AbstractC0776av.d(length, i6);
                if (d5 > length) {
                    objArr = Arrays.copyOf(objArr, d5);
                }
                objArr[i5] = c1722w0;
                i5 = i6;
            }
        } while (!AbstractC1803xs.z(xmlPullParser, str.concat(":Directory")));
        return AbstractC1044gv.k(i5, objArr);
    }

    public static GB c() {
        String str;
        ClassLoader classLoader = JB.class.getClassLoader();
        if (GB.class.equals(GB.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!GB.class.getPackage().equals(JB.class.getPackage())) {
                throw new IllegalArgumentException(GB.class.getName());
            }
            str = GB.class.getPackage().getName() + ".BlazeGenerated" + GB.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        L1.a.t(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (IllegalAccessException e3) {
                        throw new IllegalStateException(e3);
                    } catch (InvocationTargetException e5) {
                        throw new IllegalStateException(e5);
                    }
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(e6);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = Arrays.asList(new JB[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e8) {
                    Logger.getLogger(EB.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(GB.class.getSimpleName()), (Throwable) e8);
                }
            }
            if (arrayList.size() == 1) {
                return (GB) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (GB) GB.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e9) {
                throw new IllegalStateException(e9);
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException(e10);
            } catch (InvocationTargetException e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    public static void d(String str, String str2) {
        synchronized (f9877D) {
            Log.d(str, a(str2, null));
        }
    }

    public static Y e(G g5, boolean z3, boolean z5) {
        Y y5;
        long j5;
        C1617tm c1617tm;
        int i5;
        int i6;
        int[] iArr;
        long j6 = g5.j();
        long j7 = -1;
        long j8 = 4096;
        if (j6 != -1 && j6 <= 4096) {
            j8 = j6;
        }
        C1617tm c1617tm2 = new C1617tm(64);
        int i7 = (int) j8;
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i7) {
            c1617tm2.g(8);
            boolean z7 = true;
            if (!g5.G(c1617tm2.f15724a, i8, 8, true)) {
                break;
            }
            long D5 = c1617tm2.D();
            int q5 = c1617tm2.q();
            if (D5 == 1) {
                j5 = j7;
                g5.E(c1617tm2.f15724a, 8, 8);
                i5 = 16;
                c1617tm2.i(16);
                D5 = c1617tm2.C();
                c1617tm = c1617tm2;
            } else {
                j5 = j7;
                if (D5 == 0) {
                    long j9 = g5.j();
                    if (j9 != j5) {
                        D5 = (j9 - g5.b()) + 8;
                    }
                }
                c1617tm = c1617tm2;
                i5 = 8;
            }
            long j10 = D5;
            y5 = null;
            long j11 = i5;
            if (j10 < j11) {
                return new C1543s1(18);
            }
            i9 += i5;
            if (q5 == 1836019574) {
                i7 += (int) j10;
                if (j6 != -1 && i7 > j6) {
                    i7 = (int) j6;
                }
                c1617tm2 = c1617tm;
                j7 = j5;
                i8 = 0;
            } else {
                if (q5 == 1836019558 || q5 == 1836475768) {
                    i8 = 1;
                    break;
                }
                z6 |= !(q5 != 1835295092);
                long j12 = j6;
                if ((i9 + j10) - j11 >= i7) {
                    i8 = 0;
                    break;
                }
                int i10 = (int) (j10 - j11);
                i9 += i10;
                if (q5 != 1718909296) {
                    i6 = 0;
                    if (i10 != 0) {
                        g5.B(i10);
                    }
                } else {
                    if (i10 < 8) {
                        return new C1543s1(18);
                    }
                    c1617tm.g(i10);
                    i6 = 0;
                    g5.E(c1617tm.f15724a, 0, i10);
                    boolean h3 = h(c1617tm.q(), z5) | z6;
                    c1617tm.k(4);
                    int o5 = c1617tm.o() / 4;
                    if (!h3 && o5 > 0) {
                        iArr = new int[o5];
                        int i11 = 0;
                        while (true) {
                            if (i11 >= o5) {
                                z7 = h3;
                                break;
                            }
                            int q6 = c1617tm.q();
                            iArr[i11] = q6;
                            if (h(q6, z5)) {
                                break;
                            }
                            i11++;
                        }
                    } else {
                        z7 = h3;
                        iArr = null;
                    }
                    if (!z7) {
                        C1543s1 c1543s1 = new C1543s1(19);
                        if (iArr != null) {
                            int length = Arrays.copyOf(iArr, iArr.length).length;
                        }
                        return c1543s1;
                    }
                    z6 = z7;
                }
                i8 = i6;
                c1617tm2 = c1617tm;
                j7 = j5;
                j6 = j12;
            }
        }
        y5 = null;
        return !z6 ? C1543s1.f15407n : z3 != i8 ? i8 != 0 ? C1543s1.f15405l : C1543s1.f15406m : y5;
    }

    public static void f(String str, String str2) {
        synchronized (f9877D) {
            Log.e(str, a(str2, null));
        }
    }

    public static void g(String str, String str2, Throwable th) {
        synchronized (f9877D) {
            Log.e(str, a(str2, th));
        }
    }

    public static boolean h(int i5, boolean z3) {
        if ((i5 >>> 8) == 3368816) {
            return true;
        }
        if (i5 == 1751476579) {
            if (z3) {
                return true;
            }
            i5 = 1751476579;
        }
        int[] iArr = f9906s;
        for (int i6 = 0; i6 < 29; i6++) {
            if (iArr[i6] == i5) {
                return true;
            }
        }
        return false;
    }

    public static void i(String str, String str2) {
        synchronized (f9877D) {
            Log.i(str, a(str2, null));
        }
    }

    public static int j(int i5, int i6) {
        int i7;
        if (i5 < 0 || i5 >= 3 || i6 < 0 || (i7 = i6 >> 1) >= 19) {
            return -1;
        }
        int i8 = f9891b[i5];
        if (i8 == 44100) {
            int i9 = f[i7] + (i6 & 1);
            return i9 + i9;
        }
        int i10 = f9894e[i7];
        return i8 == 32000 ? i10 * 6 : i10 * 4;
    }

    public static int k(C0826c0 c0826c0, int[] iArr) {
        int i5 = 0;
        for (int i6 = 0; i6 < 3 && c0826c0.w(); i6++) {
            i5++;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < i5; i8++) {
            i7 += 1 << iArr[i8];
        }
        return c0826c0.f(iArr[i5]) + i7;
    }

    public static void l(String str, String str2) {
        synchronized (f9877D) {
            Log.w(str, a(str2, null));
        }
    }

    public static C0826c0 m(byte[] bArr) {
        byte b3 = bArr[0];
        if (b3 == Byte.MAX_VALUE || b3 == 100 || b3 == 64 || b3 == 113) {
            return new C0826c0(bArr.length, bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b5 = copyOf[0];
        if (b5 == -2 || b5 == -1 || b5 == 37 || b5 == -14 || b5 == -24) {
            for (int i5 = 0; i5 < copyOf.length - 1; i5 += 2) {
                byte b6 = copyOf[i5];
                int i6 = i5 + 1;
                copyOf[i5] = copyOf[i6];
                copyOf[i6] = b6;
            }
        }
        int length = copyOf.length;
        C0826c0 c0826c0 = new C0826c0(length, copyOf);
        if (copyOf[0] == 31) {
            C0826c0 c0826c02 = new C0826c0(length, copyOf);
            while (c0826c02.a() >= 16) {
                c0826c02.u(2);
                int f5 = c0826c02.f(14);
                int min = Math.min(8 - c0826c0.f12945d, 14);
                int i7 = c0826c0.f12945d;
                int i8 = (8 - i7) - min;
                byte[] bArr2 = c0826c0.f12943b;
                int i9 = c0826c0.f12944c;
                byte b7 = (byte) (((65280 >> i7) | ((1 << i8) - 1)) & bArr2[i9]);
                bArr2[i9] = b7;
                int i10 = 14 - min;
                int i11 = f5 & 16383;
                bArr2[i9] = (byte) (b7 | ((i11 >>> i10) << i8));
                int i12 = i9 + 1;
                while (i10 > 8) {
                    i10 -= 8;
                    c0826c0.f12943b[i12] = (byte) (i11 >>> i10);
                    i12++;
                }
                byte[] bArr3 = c0826c0.f12943b;
                byte b8 = (byte) (bArr3[i12] & ((1 << r7) - 1));
                bArr3[i12] = b8;
                bArr3[i12] = (byte) (((i11 & ((1 << i10) - 1)) << (8 - i10)) | b8);
                c0826c0.u(14);
                c0826c0.x();
            }
        }
        int length2 = copyOf.length;
        c0826c0.f12943b = copyOf;
        c0826c0.f12944c = 0;
        c0826c0.f12945d = 0;
        c0826c0.f12946e = length2;
        return c0826c0;
    }

    public static void n(String str, String str2, Throwable th) {
        synchronized (f9877D) {
            Log.w(str, a(str2, th));
        }
    }
}
