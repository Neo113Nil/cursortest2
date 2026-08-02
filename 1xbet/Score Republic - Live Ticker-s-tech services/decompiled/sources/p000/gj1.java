package p000;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gj1 extends AbstractC0751u2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final Context f2767l;

    /* JADX INFO: renamed from: m */
    public final on0 f2768m;

    /* JADX INFO: renamed from: n */
    public C0312i6 f2769n;

    /* JADX INFO: renamed from: o */
    public WeakReference f2770o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ hj1 f2771p;

    public gj1(hj1 hj1Var, Context context, C0312i6 c0312i6) {
        this.f2771p = hj1Var;
        this.f2767l = context;
        this.f2769n = c0312i6;
        on0 on0Var = new on0(context);
        on0Var.f5810u = 1;
        this.f2768m = on0Var;
        on0Var.f5803n = this;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: a */
    public final void mo2101a() {
        hj1 hj1Var = this.f2771p;
        if (hj1Var.f3235i != this) {
            return;
        }
        if (hj1Var.f3242p) {
            hj1Var.f3236j = this;
            hj1Var.f3237k = this.f2769n;
        } else {
            this.f2769n.m2546q(this);
        }
        this.f2769n = null;
        hj1Var.m2275a(false);
        ActionBarContextView actionBarContextView = hj1Var.f3232f;
        if (actionBarContextView.f352t == null) {
            actionBarContextView.m342e();
        }
        hj1Var.f3229c.setHideOnContentScrollEnabled(hj1Var.f3247u);
        hj1Var.f3235i = null;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: b */
    public final View mo2102b() {
        WeakReference weakReference = this.f2770o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: c */
    public final on0 mo2103c() {
        return this.f2768m;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: d */
    public final MenuInflater mo2104d() {
        return new vb1(this.f2767l);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: e */
    public final CharSequence mo2105e() {
        return this.f2771p.f3232f.getSubtitle();
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: f */
    public final CharSequence mo2106f() {
        return this.f2771p.f3232f.getTitle();
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final boolean mo311g(on0 on0Var, MenuItem menuItem) {
        C0312i6 c0312i6 = this.f2769n;
        if (c0312i6 != null) {
            return ((f71) c0312i6.f3447k).m1673t(this, menuItem);
        }
        return false;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: h */
    public final void mo2107h() {
        if (this.f2771p.f3235i != this) {
            return;
        }
        on0 on0Var = this.f2768m;
        on0Var.m3719w();
        try {
            this.f2769n.m2547s(this, on0Var);
        } finally {
            on0Var.m3718v();
        }
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: i */
    public final void mo313i(on0 on0Var) {
        if (this.f2769n == null) {
            return;
        }
        mo2107h();
        C0603q2 c0603q2 = this.f2771p.f3232f.f345m;
        if (c0603q2 != null) {
            c0603q2.m4028l();
        }
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: j */
    public final boolean mo2108j() {
        return this.f2771p.f3232f.f340B;
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: k */
    public final void mo2109k(View view) {
        this.f2771p.f3232f.setCustomView(view);
        this.f2770o = new WeakReference(view);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: l */
    public final void mo2110l(int i) {
        mo2111m(this.f2771p.f3227a.getResources().getString(i));
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: m */
    public final void mo2111m(CharSequence charSequence) {
        this.f2771p.f3232f.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: n */
    public final void mo2112n(int i) {
        mo2113o(this.f2771p.f3227a.getResources().getString(i));
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: o */
    public final void mo2113o(CharSequence charSequence) {
        this.f2771p.f3232f.setTitle(charSequence);
    }

    @Override // p000.AbstractC0751u2
    /* JADX INFO: renamed from: p */
    public final void mo2114p(boolean z) {
        this.f7646k = z;
        this.f2771p.f3232f.setTitleOptional(z);
    }
}
