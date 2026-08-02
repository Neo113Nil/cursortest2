package l;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import m.MenuC1413A;

/* renamed from: l.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1369g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14810a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1364b f14811b;

    public C1369g(Context context, AbstractC1364b abstractC1364b) {
        this.f14810a = context;
        this.f14811b = abstractC1364b;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f14811b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f14811b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1413A(this.f14810a, this.f14811b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f14811b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f14811b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f14811b.f14796a;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f14811b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f14811b.f14797b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f14811b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f14811b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f14811b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f14811b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f14811b.f14796a = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f14811b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z4) {
        this.f14811b.p(z4);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.f14811b.l(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.f14811b.n(i7);
    }
}
