package n1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import g1.C1968b;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f18433b;

    /* renamed from: a, reason: collision with root package name */
    public final k0 f18434a;

    static {
        int i = Build.VERSION.SDK_INT;
        f18433b = (i >= 36 ? new X() : i >= 35 ? new W() : i >= 34 ? new V() : i >= 31 ? new U() : i >= 30 ? new T() : i >= 29 ? new S() : new P()).b().f18442a.a().f18442a.b().f18442a.c();
    }

    public h0(k0 k0Var) {
        this.f18434a = k0Var;
    }

    public k0 a() {
        return this.f18434a;
    }

    public k0 b() {
        return this.f18434a;
    }

    public k0 c() {
        return this.f18434a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return t() == h0Var.t() && s() == h0Var.s() && Objects.equals(n(), h0Var.n()) && Objects.equals(l(), h0Var.l()) && Objects.equals(h(), h0Var.h());
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public List<Rect> g(int i) {
        return Collections.EMPTY_LIST;
    }

    public C2163d h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
    }

    public C1968b i(int i) {
        return C1968b.f17072e;
    }

    public C1968b j(int i) {
        if ((i & 8) == 0) {
            return C1968b.f17072e;
        }
        throw new IllegalArgumentException("Unable to query the maximum insets for IME");
    }

    public C1968b k() {
        return n();
    }

    public C1968b l() {
        return C1968b.f17072e;
    }

    public C1968b m() {
        return n();
    }

    public C1968b n() {
        return C1968b.f17072e;
    }

    public C1968b o() {
        return n();
    }

    public k0 r(int i, int i5, int i6, int i7) {
        return f18433b;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        return false;
    }

    public boolean u(int i) {
        return true;
    }

    public void q() {
    }

    public void A(int i) {
    }

    public void B(Rect[][] rectArr) {
    }

    public void C(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void e(k0 k0Var) {
    }

    public void p(View view) {
    }

    public void v(C2165f c2165f) {
    }

    public void w(C1968b[] c1968bArr) {
    }

    public void x(C1968b c1968b) {
    }

    public void y(k0 k0Var) {
    }

    public void z(C1968b c1968b) {
    }
}
