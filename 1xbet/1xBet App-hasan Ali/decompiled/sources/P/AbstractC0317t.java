package P;

import java.util.ArrayList;

/* renamed from: P.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0317t {

    /* renamed from: a, reason: collision with root package name */
    public static final C0293g0 f4557a = new C0293g0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final C0293g0 f4558b = new C0293g0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final C0293g0 f4559c = new C0293g0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final C0293g0 f4560d = new C0293g0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final C0293g0 f4561e = new C0293g0("reference");
    public static final A0.S0 f = new A0.S0(3);

    public static final void a(ArrayList arrayList, int i, int i5) {
        int e3 = e(i, arrayList);
        if (e3 < 0) {
            e3 = -(e3 + 1);
        }
        while (e3 < arrayList.size() && ((S) arrayList.get(e3)).f4393b < i5) {
        }
    }

    public static final void b(L0 l02, ArrayList arrayList, int i) {
        if (l02.l(i)) {
            arrayList.add(l02.n(i));
            return;
        }
        int[] iArr = l02.f4332b;
        int i5 = iArr[(i * 5) + 3] + i;
        for (int i6 = i + 1; i6 < i5; i6 += iArr[(i6 * 5) + 3]) {
            b(l02, arrayList, i6);
        }
    }

    public static final void c(String str) {
        throw new C0300k(L1.a.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void d(String str) {
        throw new C0300k(L1.a.n("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int e(int i, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int g5 = kotlin.jvm.internal.l.g(((S) arrayList.get(i6)).f4393b, i);
            if (g5 < 0) {
                i5 = i6 + 1;
            } else {
                if (g5 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final Object f(Object obj, String str, Object obj2) {
        U u5 = obj instanceof U ? (U) obj : null;
        if (u5 == null) {
            return null;
        }
        Object obj3 = u5.f4402a;
        boolean equals = obj3.equals(str);
        Object obj4 = u5.f4403b;
        if (equals && kotlin.jvm.internal.l.a(obj4, obj2)) {
            return obj;
        }
        Object f5 = f(obj3, str, obj2);
        return f5 == null ? f(obj4, str, obj2) : f5;
    }

    public static final void g(P0 p02, int i, Object obj) {
        int h3 = p02.h(i);
        Object[] objArr = p02.f4368c;
        Object obj2 = objArr[h3];
        objArr[h3] = C0302l.f4480a;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }
}
