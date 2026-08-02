package p000;

import android.os.Build;
import android.view.View;
import android.widget.EdgeEffect;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class af0 {

    /* JADX INFO: renamed from: a */
    public static final g72 f164a;

    /* JADX INFO: renamed from: b */
    public static final g72 f165b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f166c = {48, 49, 53, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f167d = {48, 49, 48, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f168e = {48, 48, 57, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f169f = {48, 48, 53, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f170g = {48, 48, 49, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f171h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f172i = {48, 48, 50, 0};

    static {
        int i = 3;
        f164a = new g72("UNDEFINED", i);
        f165b = new g72("REUSABLE_CLAIMED", i);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m187a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static void m188b(Object obj) {
        if (obj != null) {
            return;
        }
        C0270h1.m2192h("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX INFO: renamed from: c */
    public static void m189c(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            C0270h1.m2190f(AbstractC0024an.m281d(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static float m190d(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0373jv.m2965b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: f */
    public static void m191f(View view, int i, int i2, int i3, int i4) {
        m80.m3345l("\tdesired (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
        if (view.getVisibility() == 8) {
            i = 0;
            i2 = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i2, i4));
        m80.m3345l("\tactual (w,h)", view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    /* JADX INFO: renamed from: g */
    public static void m192g(View view, int i, int i2) {
        m191f(view, i, i2, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: h */
    public static float m193h(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0373jv.m2966c(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    /* JADX INFO: renamed from: i */
    public static final Object m194i(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static final void m195j(InterfaceC0808vm interfaceC0808vm, Object obj) {
        if (!(interfaceC0808vm instanceof C0704st)) {
            interfaceC0808vm.mo476f(obj);
            return;
        }
        C0704st c0704st = (C0704st) interfaceC0808vm;
        AbstractC0292hn abstractC0292hn = c0704st.f7206m;
        AbstractC0882xm abstractC0882xm = c0704st.f7207n;
        Throwable thM3843a = p21.m3843a(obj);
        Object c0657rj = thM3843a == null ? obj : new C0657rj(thM3843a, false);
        if (abstractC0292hn.mo2243p(abstractC0882xm.mo475d())) {
            c0704st.f7208o = c0657rj;
            c0704st.f7905l = 1;
            abstractC0292hn.mo1225o(abstractC0882xm.mo475d(), c0704st);
            return;
        }
        AbstractC0412kx abstractC0412kxM918a = cd1.m918a();
        if (abstractC0412kxM918a.f4587l >= 4294967296L) {
            c0704st.f7208o = c0657rj;
            c0704st.f7905l = 1;
            C0756u7 c0756u7 = abstractC0412kxM918a.f4589n;
            if (c0756u7 == null) {
                c0756u7 = new C0756u7();
                abstractC0412kxM918a.f4589n = c0756u7;
            }
            c0756u7.addLast(c0704st);
            return;
        }
        abstractC0412kxM918a.m3098s(true);
        try {
            ag0 ag0Var = (ag0) abstractC0882xm.mo475d().mo1466j(wa0.f8474n);
            if (ag0Var == null || ag0Var.mo203a()) {
                Object obj2 = c0704st.f7209p;
                InterfaceC0180en interfaceC0180enMo475d = abstractC0882xm.mo475d();
                Object objM5199n = vt1.m5199n(interfaceC0180enMo475d, obj2);
                gf1 gf1VarM5654p = objM5199n != vt1.f8268d ? AbstractC0875xf.m5654p(abstractC0882xm, interfaceC0180enMo475d, objM5199n) : null;
                try {
                    abstractC0882xm.mo476f(obj);
                    if (gf1VarM5654p == null || gf1VarM5654p.m2033d0()) {
                        vt1.m5197j(interfaceC0180enMo475d, objM5199n);
                    }
                } catch (Throwable th) {
                    if (gf1VarM5654p == null || gf1VarM5654p.m2033d0()) {
                        vt1.m5197j(interfaceC0180enMo475d, objM5199n);
                    }
                    throw th;
                }
            } else {
                c0704st.mo476f(new o21(((ig0) ag0Var).m2635z()));
            }
            while (abstractC0412kxM918a.m3100u()) {
            }
        } catch (Throwable th2) {
            try {
                c0704st.m4953j(th2);
            } finally {
                abstractC0412kxM918a.m3097r(true);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m196k(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    /* JADX INFO: renamed from: l */
    public static void m197l(Status status, Object obj, qc1 qc1Var) {
        if (status.f1341j <= 0) {
            qc1Var.m4061b(obj);
        } else {
            qc1Var.m4060a(status.f1343l != null ? new t11(status) : new C0642r4(status));
        }
    }

    /* JADX INFO: renamed from: m */
    public static int m198m(int i) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i2 = 0; i2 < 6; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: n */
    public static void m199n(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C0270h1.m2192h(j11.m2774i(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo200e(char c);
}
