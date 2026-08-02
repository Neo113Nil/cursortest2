package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class w91 extends AbstractC0751u2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public Context f8464l;

    /* JADX INFO: renamed from: m */
    public ActionBarContextView f8465m;

    /* JADX INFO: renamed from: n */
    public C0312i6 f8466n;

    /* JADX INFO: renamed from: o */
    public WeakReference f8467o;

    /* JADX INFO: renamed from: p */
    public boolean f8468p;

    /* JADX INFO: renamed from: q */
    public on0 f8469q;

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: a */
    public final void mo2101a() {
        if (this.f8468p) {
            return;
        }
        this.f8468p = true;
        this.f8466n.m2546q(this);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: b */
    public final View mo2102b() {
        WeakReference weakReference = this.f8467o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: c */
    public final on0 mo2103c() {
        return this.f8469q;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo2104d() {
        return new vb1(this.f8465m.getContext());
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: e */
    public final CharSequence mo2105e() {
        return this.f8465m.getSubtitle();
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: f */
    public final CharSequence mo2106f() {
        return this.f8465m.getTitle();
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final boolean mo311g(on0 on0Var, MenuItem menuItem) {
        return ((f71) this.f8466n.f3447k).m1673t(this, menuItem);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: h */
    public final void mo2107h() {
        this.f8466n.m2547s(this, this.f8469q);
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: i */
    public final void mo313i(on0 on0Var) {
        mo2107h();
        C0603q2 c0603q2 = this.f8465m.f345m;
        if (c0603q2 != null) {
            c0603q2.m4028l();
        }
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: j */
    public final boolean mo2108j() {
        return this.f8465m.f340B;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: k */
    public final void mo2109k(View view) {
        this.f8465m.setCustomView(view);
        this.f8467o = view != null ? new WeakReference(view) : null;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: l */
    public final void mo2110l(int i) {
        mo2111m(this.f8464l.getString(i));
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: m */
    public final void mo2111m(CharSequence charSequence) {
        this.f8465m.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: n */
    public final void mo2112n(int i) {
        mo2113o(this.f8464l.getString(i));
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: o */
    public final void mo2113o(CharSequence charSequence) {
        this.f8465m.setTitle(charSequence);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: p */
    public final void mo2114p(boolean z) {
        this.f7646k = z;
        this.f8465m.setTitleOptional(z);
    }
}
