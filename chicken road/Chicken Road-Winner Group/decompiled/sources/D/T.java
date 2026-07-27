package D;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class T {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f221b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final V f222a;

    static {
        int i3 = Build.VERSION.SDK_INT;
        (i3 >= 30 ? new K() : i3 >= 29 ? new J() : new H()).b().f223a.a().f223a.b().f223a.c();
    }

    public T(V v3) {
        this.f222a = v3;
    }

    public V a() {
        return this.f222a;
    }

    public V b() {
        return this.f222a;
    }

    public V c() {
        return this.f222a;
    }

    public C0004e e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t3 = (T) obj;
        return l() == t3.l() && k() == t3.k() && Objects.equals(i(), t3.i()) && Objects.equals(g(), t3.g()) && Objects.equals(e(), t3.e());
    }

    public w.c f() {
        return i();
    }

    public w.c g() {
        return w.c.f10433e;
    }

    public w.c h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public w.c i() {
        return w.c.f10433e;
    }

    public w.c j() {
        return i();
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m(int i3) {
        return true;
    }

    public void d(View view) {
    }

    public void n(w.c[] cVarArr) {
    }

    public void o(V v3) {
    }

    public void p(w.c cVar) {
    }
}
