package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0644j;
import java.lang.ref.WeakReference;
import l.AbstractC1364b;
import l.C1372j;
import l.InterfaceC1363a;

/* renamed from: i.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1221H extends AbstractC1364b implements m.i {

    /* renamed from: c, reason: collision with root package name */
    public final Context f13623c;

    /* renamed from: d, reason: collision with root package name */
    public final m.k f13624d;

    /* renamed from: e, reason: collision with root package name */
    public com.google.android.gms.common.internal.w f13625e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f13626f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C1222I f13627x;

    public C1221H(C1222I c1222i, Context context, com.google.android.gms.common.internal.w wVar) {
        this.f13627x = c1222i;
        this.f13623c = context;
        this.f13625e = wVar;
        m.k kVar = new m.k(context);
        kVar.f15124C = 1;
        this.f13624d = kVar;
        kVar.f15142e = this;
    }

    @Override // l.AbstractC1364b
    public final void a() {
        C1222I c1222i = this.f13627x;
        if (c1222i.f13638i != this) {
            return;
        }
        boolean z4 = c1222i.f13644p;
        boolean z7 = c1222i.f13645q;
        if (z4 || z7) {
            c1222i.j = this;
            c1222i.f13639k = this.f13625e;
        } else {
            this.f13625e.g(this);
        }
        this.f13625e = null;
        c1222i.v(false);
        ActionBarContextView actionBarContextView = c1222i.f13635f;
        if (actionBarContextView.f8188B == null) {
            actionBarContextView.e();
        }
        c1222i.f13632c.setHideOnContentScrollEnabled(c1222i.f13650v);
        c1222i.f13638i = null;
    }

    @Override // m.i
    public final void b(m.k kVar) {
        if (this.f13625e == null) {
            return;
        }
        i();
        C0644j c0644j = this.f13627x.f13635f.f8201d;
        if (c0644j != null) {
            c0644j.l();
        }
    }

    @Override // l.AbstractC1364b
    public final View c() {
        WeakReference weakReference = this.f13626f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC1364b
    public final m.k d() {
        return this.f13624d;
    }

    @Override // m.i
    public final boolean e(m.k kVar, MenuItem menuItem) {
        com.google.android.gms.common.internal.w wVar = this.f13625e;
        if (wVar != null) {
            return ((InterfaceC1363a) wVar.f11335b).k(this, menuItem);
        }
        return false;
    }

    @Override // l.AbstractC1364b
    public final MenuInflater f() {
        return new C1372j(this.f13623c);
    }

    @Override // l.AbstractC1364b
    public final CharSequence g() {
        return this.f13627x.f13635f.getSubtitle();
    }

    @Override // l.AbstractC1364b
    public final CharSequence h() {
        return this.f13627x.f13635f.getTitle();
    }

    @Override // l.AbstractC1364b
    public final void i() {
        if (this.f13627x.f13638i != this) {
            return;
        }
        m.k kVar = this.f13624d;
        kVar.w();
        try {
            this.f13625e.a(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override // l.AbstractC1364b
    public final boolean j() {
        return this.f13627x.f13635f.f8196J;
    }

    @Override // l.AbstractC1364b
    public final void k(View view) {
        this.f13627x.f13635f.setCustomView(view);
        this.f13626f = new WeakReference(view);
    }

    @Override // l.AbstractC1364b
    public final void l(int i7) {
        m(this.f13627x.f13630a.getResources().getString(i7));
    }

    @Override // l.AbstractC1364b
    public final void m(CharSequence charSequence) {
        this.f13627x.f13635f.setSubtitle(charSequence);
    }

    @Override // l.AbstractC1364b
    public final void n(int i7) {
        o(this.f13627x.f13630a.getResources().getString(i7));
    }

    @Override // l.AbstractC1364b
    public final void o(CharSequence charSequence) {
        this.f13627x.f13635f.setTitle(charSequence);
    }

    @Override // l.AbstractC1364b
    public final void p(boolean z4) {
        this.f14797b = z4;
        this.f13627x.f13635f.setTitleOptional(z4);
    }
}
