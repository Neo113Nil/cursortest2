package m;

import android.os.Build;
import android.view.View;
import i.C0040a;
import java.util.Objects;

/* loaded from: classes.dex */
public class p {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f879b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final r f880a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        (i2 >= 30 ? new h() : i2 >= 29 ? new g() : new f()).b().f881a.a().f881a.b().f881a.c();
    }

    public p(r rVar) {
        this.f880a = rVar;
    }

    public r a() {
        return this.f880a;
    }

    public r b() {
        return this.f880a;
    }

    public r c() {
        return this.f880a;
    }

    public b e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return l() == pVar.l() && k() == pVar.k() && Objects.equals(i(), pVar.i()) && Objects.equals(g(), pVar.g()) && Objects.equals(e(), pVar.e());
    }

    public C0040a f() {
        return i();
    }

    public C0040a g() {
        return C0040a.f550e;
    }

    public C0040a h() {
        return i();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), g(), e());
    }

    public C0040a i() {
        return C0040a.f550e;
    }

    public C0040a j() {
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

    public void n(C0040a[] c0040aArr) {
    }

    public void o(r rVar) {
    }

    public void p(C0040a c0040a) {
    }
}
