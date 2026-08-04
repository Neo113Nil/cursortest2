package p018c2;

import A1.InterfaceC0027k;
import A1.X;
import R5.M;
import java.util.Arrays;
import p031e1.k;
import p151v2.a;
import p151v2.i;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements InterfaceC0027k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final M f10340f = new M(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X[] f10344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10345e;

    public e0(String str, X... xArr) {
        a.f(xArr.length > 0);
        this.f10342b = str;
        this.f10344d = xArr;
        this.f10341a = xArr.length;
        int iG = i.g(xArr[0].f283C);
        this.f10343c = iG == -1 ? i.g(xArr[0].f282B) : iG;
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
        StringBuilder sbL = k.l("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbL.append(str3);
        sbL.append("' (track ");
        sbL.append(i7);
        sbL.append(")");
        a.l("TrackGroup", "", new IllegalStateException(sbL.toString()));
    }

    public final int a(X x4) {
        int i7 = 0;
        while (true) {
            X[] xArr = this.f10344d;
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
            this.f10345e = p150v0.a.d(527, 31, this.f10342b) + Arrays.hashCode(this.f10344d);
        }
        return this.f10345e;
    }
}
