package j3;

import A0.J0;
import G1.C0140k;
import G1.r;
import G1.y;
import H3.q;
import L4.C0219b;
import L4.C0222e;
import L4.C0226i;
import L4.C0229l;
import L4.z;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0487p;
import e2.C1930k;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import o4.AbstractC2223a;
import o4.AbstractC2234l;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import r.C2321G;
import r.O;
import r3.AbstractC2349a;
import t3.AbstractC2425d;
import y4.v;

/* loaded from: classes.dex */
public final class i implements D2.f, q, Q1.d {

    /* renamed from: l, reason: collision with root package name */
    public static i f17518l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile i f17519m;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17520k;

    public /* synthetic */ i(int i) {
        this.f17520k = i;
    }

    public static final String a(byte[] bArr, byte[][] bArr2, int i) {
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8 = -1;
        byte[] bArr3 = PublicSuffixDatabase.f18667e;
        int length = bArr.length;
        int i9 = 0;
        while (i9 < length) {
            int i10 = (i9 + length) / 2;
            while (i10 > i8 && bArr[i10] != 10) {
                i10 += i8;
            }
            int i11 = i10 + 1;
            int i12 = 1;
            while (true) {
                i5 = i11 + i12;
                if (bArr[i5] == 10) {
                    break;
                }
                i12++;
            }
            int i13 = i5 - i11;
            int i14 = i;
            boolean z5 = false;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (z5) {
                    i6 = 46;
                    z3 = false;
                } else {
                    byte b3 = bArr2[i14][i15];
                    byte[] bArr4 = z4.b.f21979a;
                    int i17 = b3 & 255;
                    z3 = z5;
                    i6 = i17;
                }
                byte b5 = bArr[i11 + i16];
                byte[] bArr5 = z4.b.f21979a;
                i7 = i6 - (b5 & 255);
                if (i7 != 0) {
                    break;
                }
                i16++;
                i15++;
                if (i16 == i13) {
                    break;
                }
                if (bArr2[i14].length != i15) {
                    z5 = z3;
                } else {
                    if (i14 == bArr2.length - 1) {
                        break;
                    }
                    i14++;
                    z5 = true;
                    i15 = -1;
                }
            }
            if (i7 >= 0) {
                if (i7 <= 0) {
                    int i18 = i13 - i16;
                    int length2 = bArr2[i14].length - i15;
                    int length3 = bArr2.length;
                    for (int i19 = i14 + 1; i19 < length3; i19++) {
                        length2 += bArr2[i19].length;
                    }
                    if (length2 >= i18) {
                        if (length2 <= i18) {
                            Charset charset = StandardCharsets.UTF_8;
                            kotlin.jvm.internal.l.e("UTF_8", charset);
                            return new String(bArr, i11, i13, charset);
                        }
                    }
                }
                i9 = i5 + 1;
                i8 = -1;
            }
            length = i10;
            i8 = -1;
        }
        return null;
    }

    public static final void b(C0222e c0222e, long j5, boolean z3) {
        C0222e c0222e2;
        ReentrantLock reentrantLock = C0222e.f3081h;
        if (C0222e.f3084l == null) {
            C0222e.f3084l = new C0222e();
            C0219b c0219b = new C0219b("Okio Watchdog");
            c0219b.setDaemon(true);
            c0219b.start();
        }
        long nanoTime = System.nanoTime();
        if (j5 != 0 && z3) {
            c0222e.f3086g = Math.min(j5, c0222e.c() - nanoTime) + nanoTime;
        } else if (j5 != 0) {
            c0222e.f3086g = j5 + nanoTime;
        } else {
            if (!z3) {
                throw new AssertionError();
            }
            c0222e.f3086g = c0222e.c();
        }
        long j6 = c0222e.f3086g - nanoTime;
        C0222e c0222e3 = C0222e.f3084l;
        kotlin.jvm.internal.l.c(c0222e3);
        while (true) {
            c0222e2 = c0222e3.f;
            if (c0222e2 == null || j6 < c0222e2.f3086g - nanoTime) {
                break;
            }
            kotlin.jvm.internal.l.c(c0222e2);
            c0222e3 = c0222e2;
        }
        c0222e.f = c0222e2;
        c0222e3.f = c0222e;
        if (c0222e3 == C0222e.f3084l) {
            C0222e.i.signal();
        }
    }

    public static final boolean d(z zVar) {
        z zVar2 = M4.f.f3631e;
        zVar.getClass();
        C0229l c0229l = M4.c.f3621a;
        C0229l c0229l2 = zVar.f3127k;
        int j5 = C0229l.j(c0229l2, c0229l);
        if (j5 == -1) {
            j5 = C0229l.j(c0229l2, M4.c.f3622b);
        }
        if (j5 != -1) {
            c0229l2 = C0229l.n(c0229l2, j5 + 1, 0, 2);
        } else if (zVar.g() != null && c0229l2.c() == 2) {
            c0229l2 = C0229l.f3092n;
        }
        return !AbstractC2234l.r0(c0229l2.p(), ".class", true);
    }

    public static ArrayList e(List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((v) obj) != v.f21427l) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(X3.o.S(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((v) obj2).f21434k);
        }
        return arrayList2;
    }

    public static C0222e f() {
        C0222e c0222e = C0222e.f3084l;
        kotlin.jvm.internal.l.c(c0222e);
        C0222e c0222e2 = c0222e.f;
        if (c0222e2 == null) {
            long nanoTime = System.nanoTime();
            C0222e.i.await(C0222e.f3082j, TimeUnit.MILLISECONDS);
            C0222e c0222e3 = C0222e.f3084l;
            kotlin.jvm.internal.l.c(c0222e3);
            if (c0222e3.f != null || System.nanoTime() - nanoTime < C0222e.f3083k) {
                return null;
            }
            return C0222e.f3084l;
        }
        long nanoTime2 = c0222e2.f3086g - System.nanoTime();
        if (nanoTime2 > 0) {
            C0222e.i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0222e c0222e4 = C0222e.f3084l;
        kotlin.jvm.internal.l.c(c0222e4);
        c0222e4.f = c0222e2.f;
        c0222e2.f = null;
        c0222e2.f3085e = 2;
        return c0222e2;
    }

    public static String h(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static byte[] j(List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        C0226i c0226i = new C0226i();
        ArrayList e3 = e(list);
        int size = e3.size();
        int i = 0;
        while (i < size) {
            Object obj = e3.get(i);
            i++;
            String str = (String) obj;
            c0226i.P(str.length());
            c0226i.U(str);
        }
        return c0226i.t(c0226i.f3091l);
    }

    public static C0140k l(Context context, y yVar, Bundle bundle, EnumC0487p enumC0487p, r rVar) {
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.l.e("randomUUID().toString()", uuid);
        kotlin.jvm.internal.l.f("destination", yVar);
        kotlin.jvm.internal.l.f("hostLifecycleState", enumC0487p);
        return new C0140k(context, yVar, bundle, enumC0487p, rVar, uuid, null);
    }

    public static Typeface m(String str, O0.l lVar, int i) {
        Typeface create;
        if (i == 0 && kotlin.jvm.internal.l.a(lVar, O0.l.f4027m) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), lVar.f4033k, i == 1);
        return create;
    }

    public static Typeface n(String str, O0.l lVar, int i) {
        if (i == 0 && kotlin.jvm.internal.l.a(lVar, O0.l.f4027m) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int t5 = AbstractC2425d.t(lVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(t5) : Typeface.create(str, t5);
    }

    public static C0229l p(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i5 = i * 2;
            bArr[i] = (byte) (M4.b.a(str.charAt(i5 + 1)) + (M4.b.a(str.charAt(i5)) << 4));
        }
        return new C0229l(bArr);
    }

    public static C0229l q(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        byte[] bytes = str.getBytes(AbstractC2223a.f18653a);
        kotlin.jvm.internal.l.e("getBytes(...)", bytes);
        C0229l c0229l = new C0229l(bytes);
        c0229l.f3095m = str;
        return c0229l;
    }

    public static z s(String str) {
        kotlin.jvm.internal.l.f("<this>", str);
        C0229l c0229l = M4.c.f3621a;
        C0226i c0226i = new C0226i();
        c0226i.U(str);
        return M4.c.d(c0226i, false);
    }

    public static z t(File file) {
        String str = z.f3126l;
        String file2 = file.toString();
        kotlin.jvm.internal.l.e("toString(...)", file2);
        return s(file2);
    }

    public static void u(Context context) {
        m3.v.e(context);
        synchronized (i.class) {
            try {
                if (f17518l == null) {
                    p.a(context);
                    i iVar = new i(0);
                    context.getApplicationContext();
                    f17518l = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean v() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static final m y(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean z(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z3;
        if (packageInfo == null) {
            packageInfo2 = null;
        } else {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z3 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                packageInfo2 = packageInfo;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z3 ? y(packageInfo2, o.f17528a) : y(packageInfo2, o.f17528a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            packageInfo2 = packageInfo;
        }
        z3 = true;
        if (packageInfo != null) {
            if ((!z3 ? y(packageInfo2, o.f17528a) : y(packageInfo2, o.f17528a[0])) == null) {
            }
        }
        return false;
    }

    @Override // Q1.d
    public void c(int i, Serializable serializable) {
        String str;
        switch (this.f17520k) {
            case 27:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i != 6 && i != 7 && i != 8) {
                    Log.d("ProfileInstaller", str);
                    break;
                } else {
                    Log.e("ProfileInstaller", str, (Throwable) serializable);
                    break;
                }
                break;
        }
    }

    @Override // D2.f
    public boolean g() {
        return true;
    }

    @Override // Q1.d
    public void i() {
        switch (this.f17520k) {
            case 27:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // H3.q
    public Object k() {
        switch (this.f17520k) {
            case 6:
                return new TreeSet();
            case 7:
                return new LinkedHashSet();
            case 8:
                return new ArrayDeque();
            case 9:
                return new ArrayList();
            case 10:
                return new ConcurrentSkipListMap();
            case 11:
                return new ConcurrentHashMap();
            case 12:
                return new TreeMap();
            case 13:
                return new LinkedHashMap();
            default:
                return new H3.p(true);
        }
    }

    public Typeface o(O0.n nVar, O0.l lVar, int i) {
        String str;
        switch (this.f17520k) {
            case 25:
                nVar.getClass();
                return m("sans-serif", lVar, i);
            default:
                nVar.getClass();
                int i5 = lVar.f4033k / 100;
                if (i5 >= 0 && i5 < 2) {
                    str = "sans-serif-thin";
                } else if (2 > i5 || i5 >= 4) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            str = "sans-serif-medium";
                        } else if ((6 > i5 || i5 >= 8) && 8 <= i5 && i5 < 11) {
                            str = "sans-serif-black";
                        }
                    }
                    str = "sans-serif";
                } else {
                    str = "sans-serif-light";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface n5 = n(str, lVar, i);
                    if (!kotlin.jvm.internal.l.a(n5, Typeface.create(Typeface.DEFAULT, AbstractC2425d.t(lVar, i))) && !kotlin.jvm.internal.l.a(n5, n(null, lVar, i))) {
                        typeface = n5;
                    }
                }
                return typeface == null ? n("sans-serif", lVar, i) : typeface;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q r(M3.a aVar) {
        String str;
        q gVar;
        int i = 9;
        int i5 = 10;
        int i6 = 0;
        Map map = Collections.EMPTY_MAP;
        Type type = aVar.f3617b;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        Class cls = aVar.f3616a;
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        i iVar = null;
        q c1930k = EnumSet.class.isAssignableFrom(cls) ? new C1930k(i5, type) : cls == EnumMap.class ? new H3.f(i6, type) : null;
        if (c1930k != null) {
            return c1930k;
        }
        List list = Collections.EMPTY_LIST;
        H3.d.f();
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                AbstractC2349a abstractC2349a = K3.c.f2892a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e3) {
                    str = "Failed making constructor '" + K3.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e3.getMessage() + K3.c.e(e3);
                }
                gVar = str != null ? new H3.g(str, i6) : new J0(declaredConstructor);
            } catch (NoSuchMethodException unused) {
            }
            if (gVar == null) {
                return gVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                iVar = SortedSet.class.isAssignableFrom(cls) ? new i(6) : Set.class.isAssignableFrom(cls) ? new i(7) : Queue.class.isAssignableFrom(cls) ? new i(8) : new i(i);
            } else if (Map.class.isAssignableFrom(cls)) {
                iVar = ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new i(i5) : ConcurrentMap.class.isAssignableFrom(cls) ? new i(11) : SortedMap.class.isAssignableFrom(cls) ? new i(12) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new M3.a(((ParameterizedType) type).getActualTypeArguments()[0]).f3616a)) ? new i(14) : new i(13);
            }
            if (iVar != null) {
                return iVar;
            }
            String h3 = h(cls);
            return h3 != null ? new H3.e(h3) : new C1930k(i, cls);
        }
        gVar = null;
        if (gVar == null) {
        }
    }

    public String toString() {
        switch (this.f17520k) {
            case 15:
                return Collections.EMPTY_MAP.toString();
            default:
                return super.toString();
        }
    }

    public i() {
        this.f17520k = 24;
        new r.r(16);
        long[] jArr = O.f18957a;
        new C2321G();
    }

    private final void w() {
    }

    @Override // D2.f
    public void shutdown() {
    }

    private final void x(int i, Serializable serializable) {
    }
}
