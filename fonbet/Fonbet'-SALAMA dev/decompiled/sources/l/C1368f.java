package l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0644j;
import com.google.android.gms.common.internal.w;
import java.lang.ref.WeakReference;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1368f extends AbstractC1364b implements m.i {

    /* renamed from: c, reason: collision with root package name */
    public Context f14804c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContextView f14805d;

    /* renamed from: e, reason: collision with root package name */
    public w f14806e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f14807f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14808x;

    /* renamed from: y, reason: collision with root package name */
    public m.k f14809y;

    @Override // l.AbstractC1364b
    public final void a() {
        if (this.f14808x) {
            return;
        }
        this.f14808x = true;
        this.f14806e.g(this);
    }

    @Override // m.i
    public final void b(m.k kVar) {
        i();
        C0644j c0644j = this.f14805d.f8201d;
        if (c0644j != null) {
            c0644j.l();
        }
    }

    @Override // l.AbstractC1364b
    public final View c() {
        WeakReference weakReference = this.f14807f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // l.AbstractC1364b
    public final m.k d() {
        return this.f14809y;
    }

    @Override // m.i
    public final boolean e(m.k kVar, MenuItem menuItem) {
        return ((InterfaceC1363a) this.f14806e.f11335b).k(this, menuItem);
    }

    @Override // l.AbstractC1364b
    public final MenuInflater f() {
        return new C1372j(this.f14805d.getContext());
    }

    @Override // l.AbstractC1364b
    public final CharSequence g() {
        return this.f14805d.getSubtitle();
    }

    @Override // l.AbstractC1364b
    public final CharSequence h() {
        return this.f14805d.getTitle();
    }

    @Override // l.AbstractC1364b
    public final void i() {
        this.f14806e.a(this, this.f14809y);
    }

    @Override // l.AbstractC1364b
    public final boolean j() {
        return this.f14805d.f8196J;
    }

    @Override // l.AbstractC1364b
    public final void k(View view) {
        this.f14805d.setCustomView(view);
        this.f14807f = view != null ? new WeakReference(view) : null;
    }

    @Override // l.AbstractC1364b
    public final void l(int i7) {
        m(this.f14804c.getString(i7));
    }

    @Override // l.AbstractC1364b
    public final void m(CharSequence charSequence) {
        this.f14805d.setSubtitle(charSequence);
    }

    @Override // l.AbstractC1364b
    public final void n(int i7) {
        o(this.f14804c.getString(i7));
    }

    @Override // l.AbstractC1364b
    public final void o(CharSequence charSequence) {
        this.f14805d.setTitle(charSequence);
    }

    @Override // l.AbstractC1364b
    public final void p(boolean z4) {
        this.f14797b = z4;
        this.f14805d.setTitleOptional(z4);
    }
}
