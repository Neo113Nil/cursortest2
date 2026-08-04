package P;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class p0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0 f5098b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q0 f5099a;

    static {
        i0 g0Var;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30) {
            g0Var = new h0();
        } else {
            g0Var = i7 >= 29 ? new g0() : new f0();
        }
        f5098b = g0Var.b().f5101a.a().f5101a.b().f5101a.c();
    }

    public p0(q0 q0Var) {
        this.f5099a = q0Var;
    }

    public q0 a() {
        return this.f5099a;
    }

    public q0 b() {
        return this.f5099a;
    }

    public q0 c() {
        return this.f5099a;
    }

    public C0354j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k() == p0Var.k() && j() == p0Var.j() && Objects.equals(h(), p0Var.h()) && Objects.equals(f(), p0Var.f()) && Objects.equals(e(), p0Var.e());
    }

    public I.c f() {
        return I.c.f3461e;
    }

    public I.c g() {
        return h();
    }

    public I.c h() {
        return I.c.f3461e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(k()), Boolean.valueOf(j()), h(), f(), e());
    }

    public q0 i(int i7, int i8, int i9, int i10) {
        return f5098b;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public void d(View view) {
    }

    public void l(I.c[] cVarArr) {
    }

    public void m(q0 q0Var) {
    }

    public void n(I.c cVar) {
    }
}
