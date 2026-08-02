package androidx.appcompat.view;

import android.content.Context;
import android.view.MenuInflater;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes8.dex */
public final class e extends b implements g.a {

    /* renamed from: c, reason: collision with root package name */
    private Context f37257c;

    /* renamed from: d, reason: collision with root package name */
    private ActionBarContextView f37258d;

    /* renamed from: e, reason: collision with root package name */
    private b.a f37259e;

    /* renamed from: f, reason: collision with root package name */
    private WeakReference<View> f37260f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f37261g;

    /* renamed from: h, reason: collision with root package name */
    private androidx.appcompat.view.menu.g f37262h;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar) {
        this.f37257c = context;
        this.f37258d = actionBarContextView;
        this.f37259e = aVar;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(actionBarContextView.getContext());
        gVar.G();
        this.f37262h = gVar;
        gVar.F(this);
    }

    @Override // androidx.appcompat.view.menu.g.a
    public final void a(@NonNull androidx.appcompat.view.menu.g gVar) {
        k();
        this.f37258d.r();
    }

    @Override // androidx.appcompat.view.menu.g.a
    public final boolean b(@NonNull androidx.appcompat.view.menu.g gVar, @NonNull androidx.appcompat.view.menu.i iVar) {
        return this.f37259e.b(this, iVar);
    }

    @Override // androidx.appcompat.view.b
    public final void c() {
        if (this.f37261g) {
            return;
        }
        this.f37261g = true;
        this.f37259e.c(this);
    }

    @Override // androidx.appcompat.view.b
    public final View d() {
        WeakReference<View> weakReference = this.f37260f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public final androidx.appcompat.view.menu.g e() {
        return this.f37262h;
    }

    @Override // androidx.appcompat.view.b
    public final MenuInflater f() {
        return new g(this.f37258d.getContext());
    }

    @Override // androidx.appcompat.view.b
    public final CharSequence g() {
        return this.f37258d.g();
    }

    @Override // androidx.appcompat.view.b
    public final CharSequence i() {
        return this.f37258d.h();
    }

    @Override // androidx.appcompat.view.b
    public final void k() {
        this.f37259e.d(this, this.f37262h);
    }

    @Override // androidx.appcompat.view.b
    public final boolean l() {
        return this.f37258d.k();
    }

    @Override // androidx.appcompat.view.b
    public final void m(View view) {
        this.f37258d.m(view);
        this.f37260f = view != null ? new WeakReference<>(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public final void n(int i11) {
        o(this.f37257c.getString(i11));
    }

    @Override // androidx.appcompat.view.b
    public final void o(CharSequence charSequence) {
        this.f37258d.n(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public final void q(int i11) {
        r(this.f37257c.getString(i11));
    }

    @Override // androidx.appcompat.view.b
    public final void r(CharSequence charSequence) {
        this.f37258d.o(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public final void s(boolean z11) {
        super.s(z11);
        this.f37258d.p(z11);
    }
}
