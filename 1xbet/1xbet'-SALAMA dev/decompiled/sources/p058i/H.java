package p058i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0623j;
import com.google.android.gms.common.internal.w;
import java.lang.ref.WeakReference;
import p078l.a;
import p078l.b;
import p078l.j;
import p086m.i;
import p086m.k;

/* JADX INFO: loaded from: classes.dex */
public final class H extends b implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f13630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f13631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f13632f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ I f13633x;

    public H(I i7, Context context, w wVar) {
        this.f13633x = i7;
        this.f13629c = context;
        this.f13631e = wVar;
        k kVar = new k(context);
        kVar.f15130C = 1;
        this.f13630d = kVar;
        kVar.f15148e = this;
    }

    @Override // p078l.b
    public final void a() {
        I i7 = this.f13633x;
        if (i7.f13644i != this) {
            return;
        }
        boolean z4 = i7.f13650p;
        boolean z7 = i7.f13651q;
        if (z4 || z7) {
            i7.j = this;
            i7.f13645k = this.f13631e;
        } else {
            this.f13631e.g(this);
        }
        this.f13631e = null;
        i7.v(false);
        ActionBarContextView actionBarContextView = i7.f13641f;
        if (actionBarContextView.f8188B == null) {
            actionBarContextView.e();
        }
        i7.f13638c.setHideOnContentScrollEnabled(i7.f13656v);
        i7.f13644i = null;
    }

    @Override // p086m.i
    public final void b(k kVar) {
        if (this.f13631e == null) {
            return;
        }
        i();
        C0623j c0623j = this.f13633x.f13641f.f8201d;
        if (c0623j != null) {
            c0623j.l();
        }
    }

    @Override // p078l.b
    public final View c() {
        WeakReference weakReference = this.f13632f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p078l.b
    public final k d() {
        return this.f13630d;
    }

    @Override // p086m.i
    public final boolean e(k kVar, MenuItem menuItem) {
        w wVar = this.f13631e;
        if (wVar != null) {
            return ((a) wVar.f11335b).k(this, menuItem);
        }
        return false;
    }

    @Override // p078l.b
    public final MenuInflater f() {
        return new j(this.f13629c);
    }

    @Override // p078l.b
    public final CharSequence g() {
        return this.f13633x.f13641f.getSubtitle();
    }

    @Override // p078l.b
    public final CharSequence h() {
        return this.f13633x.f13641f.getTitle();
    }

    @Override // p078l.b
    public final void i() {
        if (this.f13633x.f13644i != this) {
            return;
        }
        k kVar = this.f13630d;
        kVar.w();
        try {
            this.f13631e.a(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override // p078l.b
    public final boolean j() {
        return this.f13633x.f13641f.f8196J;
    }

    @Override // p078l.b
    public final void k(View view) {
        this.f13633x.f13641f.setCustomView(view);
        this.f13632f = new WeakReference(view);
    }

    @Override // p078l.b
    public final void l(int i7) {
        m(this.f13633x.f13636a.getResources().getString(i7));
    }

    @Override // p078l.b
    public final void m(CharSequence charSequence) {
        this.f13633x.f13641f.setSubtitle(charSequence);
    }

    @Override // p078l.b
    public final void n(int i7) {
        o(this.f13633x.f13636a.getResources().getString(i7));
    }

    @Override // p078l.b
    public final void o(CharSequence charSequence) {
        this.f13633x.f13641f.setTitle(charSequence);
    }

    @Override // p078l.b
    public final void p(boolean z4) {
        this.f14803b = z4;
        this.f13633x.f13641f.setTitleOptional(z4);
    }
}
