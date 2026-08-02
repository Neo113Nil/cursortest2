package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;

/* renamed from: androidx.fragment.app.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5399u {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5401w<?> f43172a;

    private C5399u(AbstractC5401w<?> abstractC5401w) {
        this.f43172a = abstractC5401w;
    }

    @NonNull
    public static C5399u b(@NonNull AbstractC5401w<?> abstractC5401w) {
        return new C5399u(abstractC5401w);
    }

    public final void a() {
        AbstractC5401w<?> abstractC5401w = this.f43172a;
        abstractC5401w.f().n(abstractC5401w, abstractC5401w, null);
    }

    public final void c() {
        this.f43172a.f().x();
    }

    public final boolean d(@NonNull MenuItem menuItem) {
        return this.f43172a.f().A(menuItem);
    }

    public final void e() {
        this.f43172a.f().B();
    }

    public final void f() {
        this.f43172a.f().D();
    }

    public final void g() {
        this.f43172a.f().M();
    }

    public final void h() {
        this.f43172a.f().Q();
    }

    public final void i() {
        this.f43172a.f().R();
    }

    public final void j() {
        this.f43172a.f().T();
    }

    public final void k() {
        this.f43172a.f().Z(true);
    }

    @NonNull
    public final G l() {
        return this.f43172a.f();
    }

    public final void m() {
        this.f43172a.f().M0();
    }

    public final View n(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return ((LayoutInflaterFactory2C5403y) this.f43172a.f().t0()).onCreateView(view, str, context, attributeSet);
    }
}
