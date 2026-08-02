package c2;

import A1.InterfaceC0027k;
import java.util.Arrays;
import v0.AbstractC1663a;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class e0 implements InterfaceC0027k {

    /* renamed from: f, reason: collision with root package name */
    public static final R5.M f10340f = new R5.M(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f10341a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10342b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10343c;

    /* renamed from: d, reason: collision with root package name */
    public final A1.X[] f10344d;

    /* renamed from: e, reason: collision with root package name */
    public int f10345e;

    public e0(String str, A1.X... xArr) {
        AbstractC1664a.f(xArr.length > 0);
        this.f10342b = str;
        this.f10344d = xArr;
        this.f10341a = xArr.length;
        int g3 = v2.i.g(xArr[0].f283C);
        this.f10343c = g3 == -1 ? v2.i.g(xArr[0].f282B) : g3;
        String str2 = xArr[0].f306c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i7 = xArr[0].f308e | 16384;
        for (int i8 = 1; i8 < xArr.length; i8++) {
            String str3 = xArr[i8].f306c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b("languages", xArr[0].f306c, xArr[i8].f306c, i8);
                return;
            } else {
                if (i7 != (xArr[i8].f308e | 16384)) {
                    b("role flags", Integer.toBinaryString(xArr[0].f308e), Integer.toBinaryString(xArr[i8].f308e), i8);
                    return;
                }
            }
        }
    }

    public static void b(String str, String str2, String str3, int i7) {
        StringBuilder l7 = e1.k.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        l7.append(str3);
        l7.append("' (track ");
        l7.append(i7);
        l7.append(")");
        AbstractC1664a.l("TrackGroup", "", new IllegalStateException(l7.toString()));
    }

    public final int a(A1.X x4) {
        int i7 = 0;
        while (true) {
            A1.X[] xArr = this.f10344d;
            if (i7 >= xArr.length) {
                return -1;
            }
            if (x4 == xArr[i7]) {
                return i7;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f10342b.equals(e0Var.f10342b) && Arrays.equals(this.f10344d, e0Var.f10344d);
    }

    public final int hashCode() {
        if (this.f10345e == 0) {
            this.f10345e = AbstractC1663a.d(527, 31, this.f10342b) + Arrays.hashCode(this.f10344d);
        }
        return this.f10345e;
    }
}
