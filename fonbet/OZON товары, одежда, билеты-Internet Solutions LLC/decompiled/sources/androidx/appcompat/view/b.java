package androidx.appcompat.view;

import android.view.MenuInflater;
import android.view.View;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private Object f37249a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37250b;

    public interface a {
        boolean a(b bVar, androidx.appcompat.view.menu.g gVar);

        boolean b(b bVar, androidx.appcompat.view.menu.i iVar);

        void c(b bVar);

        boolean d(b bVar, androidx.appcompat.view.menu.g gVar);
    }

    public abstract void c();

    public abstract View d();

    public abstract androidx.appcompat.view.menu.g e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public final Object h() {
        return this.f37249a;
    }

    public abstract CharSequence i();

    public final boolean j() {
        return this.f37250b;
    }

    public abstract void k();

    public abstract boolean l();

    public abstract void m(View view);

    public abstract void n(int i11);

    public abstract void o(CharSequence charSequence);

    public final void p(Object obj) {
        this.f37249a = obj;
    }

    public abstract void q(int i11);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z11) {
        this.f37250b = z11;
    }
}
