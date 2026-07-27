package E;

import android.os.Build;
import android.view.View;
import java.util.Objects;
import x.C1528c;

/* loaded from: classes.dex */
public class Z {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f595b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b0 f596a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new S() : i2 >= 29 ? new Q() : new O()).b().f601a.a().f601a.b().f601a.c();
    }

    public Z(b0 b0Var) {
        this.f596a = b0Var;
    }

    public b0 a() {
        return this.f596a;
    }

    public b0 b() {
        return this.f596a;
    }

    public b0 c() {
        return this.f596a;
    }

    public C0031f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z = (Z) obj;
        return l() == z.l() && k() == z.k() && Objects.equals(i(), z.i()) && Objects.equals(g(), z.g()) && Objects.equals(e(), z.e());
    }

    public C1528c f() {
        return i();
    }

    public C1528c g() {
        return C1528c.f12231e;
    }

    public C1528c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C1528c i() {
        return C1528c.f12231e;
    }

    public C1528c j() {
        return i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i2) {
        return true;
    }

    public void d(View view) {
    }

    public void n(C1528c[] c1528cArr) {
    }

    public void o(b0 b0Var) {
    }

    public void p(C1528c c1528c) {
    }
}
