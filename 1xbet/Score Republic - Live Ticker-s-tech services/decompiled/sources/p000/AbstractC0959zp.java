package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: zp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0959zp {

    /* JADX INFO: renamed from: n */
    public static final g72 f9883n;

    /* JADX INFO: renamed from: o */
    public static final g72 f9884o;

    /* JADX INFO: renamed from: p */
    public static final g72 f9885p;

    /* JADX INFO: renamed from: q */
    public static final g72 f9886q;

    /* JADX INFO: renamed from: r */
    public static final g72 f9887r;

    /* JADX INFO: renamed from: j */
    public static final float[][] f9879j = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: k */
    public static final float[][] f9880k = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: l */
    public static final float[] f9881l = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: m */
    public static final float[][] f9882m = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: s */
    public static final C0189ew f9888s = new C0189ew(false);

    /* JADX INFO: renamed from: t */
    public static final C0189ew f9889t = new C0189ew(true);

    /* JADX INFO: renamed from: u */
    public static final String[] f9890u = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};

    /* JADX INFO: renamed from: v */
    public static final String[] f9891v = {"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};

    static {
        int i = 3;
        f9883n = new g72("COMPLETING_ALREADY", i);
        f9884o = new g72("COMPLETING_WAITING_CHILDREN", i);
        f9885p = new g72("COMPLETING_RETRY", i);
        f9886q = new g72("TOO_LATE_TO_CANCEL", i);
        f9887r = new g72("SEALED", i);
    }

    /* JADX INFO: renamed from: A */
    public static void m5972A(Object obj, String str, boolean z) {
        if (!z) {
            throw new C0694sj(o80.m3651s(str, obj), 8);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final Object m5973B(InterfaceC0180en interfaceC0180en, v60 v60Var, xb1 xb1Var) throws Throwable {
        InterfaceC0180en interfaceC0180en2 = xb1Var.f8992k;
        interfaceC0180en2.getClass();
        InterfaceC0180en interfaceC0180enMo1465i = !((Boolean) interfaceC0180en.mo1467l(Boolean.FALSE, new C0804vi(4))).booleanValue() ? interfaceC0180en2.mo1465i(interfaceC0180en) : AbstractC0875xf.m5650g(interfaceC0180en2, interfaceC0180en, false);
        ag0 ag0Var = (ag0) interfaceC0180enMo1465i.mo1466j(wa0.f8474n);
        if (ag0Var != null && !ag0Var.mo203a()) {
            throw ((ig0) ag0Var).m2635z();
        }
        if (interfaceC0180enMo1465i == interfaceC0180en2) {
            x51 x51Var = new x51(xb1Var, interfaceC0180enMo1465i);
            return t22.m4651e(x51Var, x51Var, v60Var);
        }
        o31 o31Var = o31.f5604l;
        if (af0.m187a(interfaceC0180enMo1465i.mo1466j(o31Var), interfaceC0180en2.mo1466j(o31Var))) {
            gf1 gf1Var = new gf1(interfaceC0180enMo1465i, xb1Var);
            InterfaceC0180en interfaceC0180en3 = gf1Var.f5570n;
            Object objM5199n = vt1.m5199n(interfaceC0180en3, null);
            try {
                return t22.m4651e(gf1Var, gf1Var, v60Var);
            } finally {
                vt1.m5197j(interfaceC0180en3, objM5199n);
            }
        }
        C0741tt c0741tt = new C0741tt(xb1Var, interfaceC0180enMo1465i);
        try {
            af0.m195j(d71.m1111f(d71.m1106a(c0741tt, c0741tt, v60Var)), kf1.f4365a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0741tt.f7588p;
            do {
                int i = atomicIntegerFieldUpdater.get(c0741tt);
                if (i != 0) {
                    if (i != 2) {
                        C0270h1.m2191g("Already suspended");
                        return null;
                    }
                    Object objM5991y = m5991y(c0741tt.m2605E());
                    if (objM5991y instanceof C0657rj) {
                        throw ((C0657rj) objM5991y).f6860a;
                    }
                    return objM5991y;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0741tt, 0, 1));
            return EnumC0513nn.f5459j;
        } catch (Throwable th) {
            c0741tt.mo476f(new o21(th));
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public static float m5974C() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: D */
    public static void m5975D(int i, int i2) {
        String strM5759D;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM5759D = yd0.m5759D("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    C0270h1.m2190f(j11.m2774i(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strM5759D = yd0.m5759D("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM5759D);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m5976E(int i, int i2, int i3) {
        String strM5977F;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strM5977F = m5977F(i, i3, "start index");
            } else {
                strM5977F = (i2 < 0 || i2 > i3) ? m5977F(i2, i3, "end index") : yd0.m5759D("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strM5977F);
        }
    }

    /* JADX INFO: renamed from: F */
    public static String m5977F(int i, int i2, String str) {
        if (i < 0) {
            return yd0.m5759D("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return yd0.m5759D("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        C0270h1.m2190f(j11.m2774i(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static C0591pr m5978b(C0734tm c0734tm, v60 v60Var) {
        C0591pr c0591pr = new C0591pr(AbstractC0875xf.m5651j(c0734tm, C0301hw.f3348j), true);
        c0591pr.m3607c0(EnumC0587pn.f6215j, c0591pr, v60Var);
        return c0591pr;
    }

    /* JADX INFO: renamed from: g */
    public static final String m5979g(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: i */
    public static final void m5980i(InterfaceC0180en interfaceC0180en, Throwable th) {
        try {
            if (((C0198f4) interfaceC0180en.mo1466j(nc1.f5372k)) != null) {
                return;
            }
            AbstractC0477mo.m3407i(interfaceC0180en, th);
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                vt1.m5190a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0477mo.m3407i(interfaceC0180en, th);
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m5981j(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    public static int m5982k(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f9881l;
        return AbstractC0767ui.m4922a(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    /* JADX INFO: renamed from: l */
    public static x91 m5983l(InterfaceC0476mn interfaceC0476mn, v60 v60Var) {
        x91 x91Var = new x91(AbstractC0875xf.m5651j(interfaceC0476mn, C0301hw.f3348j), true);
        x91Var.m3607c0(EnumC0587pn.f6215j, x91Var, v60Var);
        return x91Var;
    }

    /* JADX INFO: renamed from: m */
    public static float m5984m(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: n */
    public static HashSet m5985n(int i) {
        int iCeil;
        if (i < 3) {
            wm1.m5355a("expectedSize", i);
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x011c A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0120 A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x014b A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x014f A[Catch: all -> 0x0156, TRY_LEAVE, TryCatch #2 {all -> 0x0156, blocks: (B:66:0x0118, B:68:0x011c, B:70:0x0120, B:72:0x0129, B:74:0x012f, B:77:0x0135, B:82:0x0143, B:80:0x013c, B:83:0x014b, B:84:0x014f), top: B:155:0x0118, inners: #5 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v29 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX INFO: renamed from: o */
    public static m40 m5986o(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        ?? r4;
        long j;
        Throwable th;
        ?? r5;
        ExecutorService executorService;
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (!xmlResourceParser.getName().equals("font-family")) {
            m5989t(xmlResourceParser);
            return null;
        }
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), jz0.f4234b);
        int i3 = 0;
        String string = typedArrayObtainAttributes.getString(0);
        String string2 = typedArrayObtainAttributes.getString(5);
        String string3 = typedArrayObtainAttributes.getString(6);
        String string4 = typedArrayObtainAttributes.getString(2);
        int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
        int i4 = 3;
        int integer = typedArrayObtainAttributes.getInteger(3, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
        String string5 = typedArrayObtainAttributes.getString(7);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), jz0.f4235c);
                        int i5 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i6 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i7 = typedArrayObtainAttributes2.getInt(i6, 0);
                        int i8 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i8, 0);
                        typedArrayObtainAttributes2.getString(i8);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m5989t(xmlResourceParser);
                        }
                        arrayList.add(new o40(i5, z, string6, i7, resourceId2));
                    } else {
                        m5989t(xmlResourceParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new n40((o40[]) arrayList.toArray(new o40[0]));
        }
        List listM5987p = m5987p(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlResourceParser.next() != i4) {
            if (xmlResourceParser.getEventType() == i) {
                if (xmlResourceParser.getName().equals("fallback")) {
                    TypedArray typedArrayObtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), jz0.f4236d);
                    int i9 = integer;
                    try {
                        String string7 = typedArrayObtainAttributes3.getString(i3);
                        String string8 = typedArrayObtainAttributes3.getString(1);
                        String string9 = typedArrayObtainAttributes3.getString(i);
                        if (string7 == null) {
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            throw new XmlPullParserException("query attribute must be set in fallback element");
                        }
                        while (xmlResourceParser.next() != 3) {
                            try {
                                m5989t(xmlResourceParser);
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = typedArrayObtainAttributes3;
                                j = 1;
                            }
                        }
                        try {
                            r4 = typedArrayObtainAttributes3;
                            i2 = i9;
                            j = 1;
                            try {
                                f40 f40Var = new f40(string, string2, string7, listM5987p, string8, string9);
                                if (r4 instanceof AutoCloseable) {
                                    ((AutoCloseable) r4).close();
                                } else if (r4 instanceof ExecutorService) {
                                    ExecutorService executorService2 = (ExecutorService) r4;
                                    if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService2.isTerminated())) {
                                        executorService2.shutdown();
                                        boolean z2 = false;
                                        while (!zIsTerminated2) {
                                            try {
                                                zIsTerminated2 = executorService2.awaitTermination(1L, timeUnit);
                                            } catch (InterruptedException unused) {
                                                if (!z2) {
                                                    executorService2.shutdownNow();
                                                    z2 = true;
                                                }
                                            }
                                        }
                                        if (z2) {
                                            Thread.currentThread().interrupt();
                                        }
                                    }
                                } else {
                                    r4.recycle();
                                }
                                arrayList2.add(f40Var);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = typedArrayObtainAttributes3;
                            j = 1;
                            th = th;
                            r5 = r4;
                            if (r5 != 0) {
                                throw th;
                            }
                            try {
                                if (!(r5 instanceof AutoCloseable)) {
                                    ((AutoCloseable) r5).close();
                                    throw th;
                                }
                                if (r5 instanceof ExecutorService) {
                                    r5.recycle();
                                    throw th;
                                }
                                executorService = (ExecutorService) r5;
                                if (executorService != ForkJoinPool.commonPool()) {
                                    throw th;
                                }
                                throw th;
                            } catch (Throwable th5) {
                                th.addSuppressed(th5);
                                throw th;
                            }
                        }
                        th = th3;
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = typedArrayObtainAttributes3;
                    }
                    th = th;
                    r5 = r4;
                    if (r5 != 0) {
                        throw th;
                    }
                    if (!(r5 instanceof AutoCloseable)) {
                        ((AutoCloseable) r5).close();
                        throw th;
                    }
                    if (r5 instanceof ExecutorService) {
                        r5.recycle();
                        throw th;
                    }
                    executorService = (ExecutorService) r5;
                    if (executorService != ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                        throw th;
                    }
                    executorService.shutdown();
                    boolean z3 = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(j, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z3) {
                                executorService.shutdownNow();
                                z3 = true;
                            }
                        }
                    }
                    if (!z3) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
                i2 = integer;
                m5989t(xmlResourceParser);
                integer = i2;
                integer2 = integer2;
                string5 = string5;
                i = 2;
                i3 = 0;
                i4 = 3;
            }
        }
        int i10 = integer2;
        String str = string5;
        int i11 = integer;
        if (!arrayList2.isEmpty()) {
            return new p40(arrayList2, i11, i10, str);
        }
        if (string3 == null) {
            C0270h1.m2190f("The provider font XML requires query attribute or fallback children.");
            return null;
        }
        arrayList2.add(new f40(string, string2, string3, listM5987p, null, null));
        if (string4 != null) {
            arrayList2.add(new f40(string, string2, string4, listM5987p, null, null));
        }
        return new p40(arrayList2, i11, i10, str);
    }

    /* JADX INFO: renamed from: p */
    public static List m5987p(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: r */
    public static Object m5988r(v60 v60Var) throws Throwable {
        Thread threadCurrentThread = Thread.currentThread();
        o31 o31Var = o31.f5604l;
        AbstractC0412kx abstractC0412kxM918a = cd1.m918a();
        InterfaceC0180en interfaceC0180enM5650g = AbstractC0875xf.m5650g(C0301hw.f3348j, abstractC0412kxM918a, true);
        C0960zq c0960zq = AbstractC0815vt.f8261a;
        if (interfaceC0180enM5650g != c0960zq && interfaceC0180enM5650g.mo1466j(o31Var) == null) {
            interfaceC0180enM5650g = interfaceC0180enM5650g.mo1465i(c0960zq);
        }
        C0428lc c0428lc = new C0428lc(interfaceC0180enM5650g, threadCurrentThread, abstractC0412kxM918a);
        c0428lc.m3607c0(EnumC0587pn.f6215j, c0428lc, v60Var);
        AbstractC0412kx abstractC0412kx = c0428lc.f4759p;
        if (abstractC0412kx != null) {
            int i = AbstractC0412kx.f4586o;
            abstractC0412kx.m3098s(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jMo3099t = abstractC0412kx != null ? abstractC0412kx.mo3099t() : Long.MAX_VALUE;
                if (!(c0428lc.m2605E() instanceof md0)) {
                    if (abstractC0412kx != null) {
                        int i2 = AbstractC0412kx.f4586o;
                        abstractC0412kx.m3097r(false);
                    }
                    Object objM5991y = m5991y(c0428lc.m2605E());
                    C0657rj c0657rj = objM5991y instanceof C0657rj ? (C0657rj) objM5991y : null;
                    if (c0657rj == null) {
                        return objM5991y;
                    }
                    throw c0657rj.f6860a;
                }
                LockSupport.parkNanos(c0428lc, jMo3099t);
            } catch (Throwable th) {
                if (abstractC0412kx != null) {
                    int i3 = AbstractC0412kx.f4586o;
                    abstractC0412kx.m3097r(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0428lc.m2627r(interruptedException);
        throw interruptedException;
    }

    /* JADX INFO: renamed from: t */
    public static void m5989t(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final String m5990x(InterfaceC0808vm interfaceC0808vm) {
        Object o21Var;
        if (interfaceC0808vm instanceof C0704st) {
            return ((C0704st) interfaceC0808vm).toString();
        }
        try {
            o21Var = interfaceC0808vm + '@' + m5979g(interfaceC0808vm);
        } catch (Throwable th) {
            o21Var = new o21(th);
        }
        if (p21.m3843a(o21Var) != null) {
            o21Var = interfaceC0808vm.getClass().getName() + '@' + m5979g(interfaceC0808vm);
        }
        return (String) o21Var;
    }

    /* JADX INFO: renamed from: y */
    public static final Object m5991y(Object obj) {
        md0 md0Var;
        nd0 nd0Var = obj instanceof nd0 ? (nd0) obj : null;
        return (nd0Var == null || (md0Var = nd0Var.f5384a) == null) ? obj : md0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    /* JADX INFO: renamed from: c */
    public C0190ex m5992c() {
        boolean z;
        List listMo2657d = mo2657d();
        if (listMo2657d != null) {
            z = listMo2657d.size() == 1;
        }
        a90.m131o(listMo2657d, "%s does not have exactly one group", z);
        return (C0190ex) listMo2657d.get(0);
    }

    /* JADX INFO: renamed from: d */
    public abstract List mo2657d();

    /* JADX INFO: renamed from: e */
    public abstract C0831w8 mo2156e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC0875xf mo2658f();

    /* JADX INFO: renamed from: h */
    public abstract Object mo2659h();

    /* JADX INFO: renamed from: q */
    public abstract void mo2660q();

    /* JADX INFO: renamed from: s */
    public abstract void mo2157s();

    /* JADX INFO: renamed from: u */
    public abstract void mo2158u(lj0 lj0Var);

    /* JADX INFO: renamed from: v */
    public void m5993v(ft0 ft0Var) {
        try {
            mo173w(ft0Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            wo1.m5394u(th);
            vt1.m5196h(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo173w(ft0 ft0Var);

    /* JADX INFO: renamed from: z */
    public abstract void mo2159z(List list);
}
