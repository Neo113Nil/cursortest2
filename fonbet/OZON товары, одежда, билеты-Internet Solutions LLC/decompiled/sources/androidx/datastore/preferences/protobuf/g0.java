package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5378y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f42520a;

    /* renamed from: b, reason: collision with root package name */
    private static final m0<?, ?> f42521b;

    /* renamed from: c, reason: collision with root package name */
    private static final o0 f42522c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f42523d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        int i11 = c0.f42503d;
        m0<?, ?> m0Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f42520a = cls;
        try {
            int i12 = c0.f42503d;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                m0Var = (m0) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            }
        } catch (Throwable unused3) {
        }
        f42521b = m0Var;
        f42522c = new o0();
    }

    public static void A(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).D(i11, list, z11);
    }

    public static void B(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).F(i11, list, z11);
    }

    public static void C(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).K(i11, list, z11);
    }

    public static void D(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).M(i11, list, z11);
    }

    static int a(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5377x)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5365k.j(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5377x c5377x = (C5377x) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5365k.j(c5377x.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int b(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC5365k.h(i11) + 4) * size;
    }

    static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (AbstractC5365k.h(i11) + 8) * size;
    }

    static int d(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5377x)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5365k.j(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5377x c5377x = (C5377x) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5365k.j(c5377x.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int e(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof H)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5365k.j(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        H h11 = (H) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5365k.j(h11.getLong(i11));
            i11++;
        }
        return i13;
    }

    static int f(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5377x)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5365k.e(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5377x c5377x = (C5377x) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5365k.e(c5377x.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int g(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof H)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5365k.f(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        H h11 = (H) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5365k.f(h11.getLong(i11));
            i11++;
        }
        return i13;
    }

    static int h(List<Integer> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C5377x)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5365k.i(list.get(i11).intValue());
                i11++;
            }
            return i12;
        }
        C5377x c5377x = (C5377x) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5365k.i(c5377x.getInt(i11));
            i11++;
        }
        return i13;
    }

    static int i(List<Long> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof H)) {
            int i12 = 0;
            while (i11 < size) {
                i12 += AbstractC5365k.j(list.get(i11).longValue());
                i11++;
            }
            return i12;
        }
        H h11 = (H) list;
        int i13 = 0;
        while (i11 < size) {
            i13 += AbstractC5365k.j(h11.getLong(i11));
            i11++;
        }
        return i13;
    }

    static <UT, UB> UB j(Object obj, int i11, List<Integer> list, C5378y.b bVar, UB ub2, m0<UT, UB> m0Var) {
        if (bVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                if (!bVar.a()) {
                    if (ub2 == null) {
                        ub2 = (UB) m0Var.f(obj);
                    }
                    m0Var.e(ub2, i11, intValue);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = list.get(i13);
            int intValue2 = num.intValue();
            if (bVar.a()) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                if (ub2 == null) {
                    ub2 = (UB) m0Var.f(obj);
                }
                m0Var.e(ub2, i11, intValue2);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return ub2;
    }

    public static void k(Class<?> cls) {
        if (AbstractC5376w.class.isAssignableFrom(cls)) {
            return;
        }
        int i11 = c0.f42503d;
        Class<?> cls2 = f42520a;
        if (cls2 != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static m0<?, ?> m() {
        return f42521b;
    }

    public static o0 n() {
        return f42522c;
    }

    public static void o(int i11, List<Boolean> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).c(i11, list, z11);
    }

    public static void p(int i11, List<Double> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).g(i11, list, z11);
    }

    public static void q(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).j(i11, list, z11);
    }

    public static void r(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).l(i11, list, z11);
    }

    public static void s(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).n(i11, list, z11);
    }

    public static void t(int i11, List<Float> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).p(i11, list, z11);
    }

    public static void u(int i11, List<?> list, t0 t0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5366l c5366l = (C5366l) t0Var;
        c5366l.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            c5366l.q(i11, list.get(i12), f0Var);
        }
    }

    public static void v(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).s(i11, list, z11);
    }

    public static void w(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).u(i11, list, z11);
    }

    public static void x(int i11, List<?> list, t0 t0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        C5366l c5366l = (C5366l) t0Var;
        c5366l.getClass();
        for (int i12 = 0; i12 < list.size(); i12++) {
            c5366l.w(i11, list.get(i12), f0Var);
        }
    }

    public static void y(int i11, List<Integer> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).z(i11, list, z11);
    }

    public static void z(int i11, List<Long> list, t0 t0Var, boolean z11) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((C5366l) t0Var).B(i11, list, z11);
    }
}
