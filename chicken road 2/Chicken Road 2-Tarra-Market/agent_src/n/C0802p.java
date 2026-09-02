package n;

import android.os.Build;
import android.view.View;
import j.C0774a;
import java.util.Objects;

/* renamed from: n.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0802p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6169b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r f6170a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new C0794h() : i2 >= 29 ? new C0793g() : new C0792f()).b().f6171a.a().f6171a.b().f6171a.c();
    }

    public C0802p(r rVar) {
        this.f6170a = rVar;
    }

    public r a() {
        return this.f6170a;
    }

    public r b() {
        return this.f6170a;
    }

    public r c() {
        return this.f6170a;
    }

    public C0788b e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0802p)) {
            return false;
        }
        C0802p c0802p = (C0802p) obj;
        return l() == c0802p.l() && k() == c0802p.k() && Objects.equals(i(), c0802p.i()) && Objects.equals(g(), c0802p.g()) && Objects.equals(e(), c0802p.e());
    }

    public C0774a f() {
        return i();
    }

    public C0774a g() {
        return C0774a.f6044e;
    }

    public C0774a h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C0774a i() {
        return C0774a.f6044e;
    }

    public C0774a j() {
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

    public void n(C0774a[] c0774aArr) {
    }

    public void o(r rVar) {
    }

    public void p(C0774a c0774a) {
    }
}
