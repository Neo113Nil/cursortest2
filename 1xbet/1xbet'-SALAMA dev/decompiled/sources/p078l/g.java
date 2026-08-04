package p078l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p086m.A;

/* JADX INFO: loaded from: classes.dex */
public final class g extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f14816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f14817b;

    public g(Context context, b bVar) {
        this.f14816a = context;
        this.f14817b = bVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f14817b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f14817b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new A(this.f14816a, this.f14817b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f14817b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f14817b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f14817b.f14802a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f14817b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f14817b.f14803b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f14817b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f14817b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f14817b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f14817b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f14817b.f14802a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f14817b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f14817b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f14817b.l(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f14817b.n(i7);
    }
}
