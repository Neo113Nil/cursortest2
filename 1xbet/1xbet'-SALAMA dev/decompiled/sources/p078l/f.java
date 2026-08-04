package p078l;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0623j;
import com.google.android.gms.common.internal.w;
import java.lang.ref.WeakReference;
import p086m.i;
import p086m.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f14810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContextView f14811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f14812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f14813f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f14814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public k f14815y;

    @Override // p078l.b
    public final void a() {
        if (this.f14814x) {
            return;
        }
        this.f14814x = true;
        this.f14812e.g(this);
    }

    @Override // p086m.i
    public final void b(k kVar) {
        i();
        C0623j c0623j = this.f14811d.f8201d;
        if (c0623j != null) {
            c0623j.l();
        }
    }

    @Override // p078l.b
    public final View c() {
        WeakReference weakReference = this.f14813f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p078l.b
    public final k d() {
        return this.f14815y;
    }

    @Override // p086m.i
    public final boolean e(k kVar, MenuItem menuItem) {
        return ((a) this.f14812e.f11335b).k(this, menuItem);
    }

    @Override // p078l.b
    public final MenuInflater f() {
        return new j(this.f14811d.getContext());
    }

    @Override // p078l.b
    public final CharSequence g() {
        return this.f14811d.getSubtitle();
    }

    @Override // p078l.b
    public final CharSequence h() {
        return this.f14811d.getTitle();
    }

    @Override // p078l.b
    public final void i() {
        this.f14812e.a(this, this.f14815y);
    }

    @Override // p078l.b
    public final boolean j() {
        return this.f14811d.f8196J;
    }

    @Override // p078l.b
    public final void k(View view) {
        this.f14811d.setCustomView(view);
        this.f14813f = view != null ? new WeakReference(view) : null;
    }

    @Override // p078l.b
    public final void l(int i7) {
        m(this.f14810c.getString(i7));
    }

    @Override // p078l.b
    public final void m(CharSequence charSequence) {
        this.f14811d.setSubtitle(charSequence);
    }

    @Override // p078l.b
    public final void n(int i7) {
        o(this.f14810c.getString(i7));
    }

    @Override // p078l.b
    public final void o(CharSequence charSequence) {
        this.f14811d.setTitle(charSequence);
    }

    @Override // p078l.b
    public final void p(boolean z4) {
        this.f14803b = z4;
        this.f14811d.setTitleOptional(z4);
    }
}
