package p000;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rb1 extends ActionMode {

    /* JADX INFO: renamed from: a */
    public final Context f6799a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0751u2 f6800b;

    public rb1(Context context, AbstractC0751u2 abstractC0751u2) {
        this.f6799a = context;
        this.f6800b = abstractC0751u2;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f6800b.mo2101a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f6800b.mo2102b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new ho0(this.f6799a, this.f6800b.mo2103c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f6800b.mo2104d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f6800b.mo2105e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f6800b.f7645j;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f6800b.mo2106f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f6800b.f7646k;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f6800b.mo2107h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f6800b.mo2108j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f6800b.mo2109k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f6800b.mo2111m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f6800b.f7645j = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f6800b.mo2113o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f6800b.mo2114p(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f6800b.mo2110l(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f6800b.mo2112n(i);
    }
}
