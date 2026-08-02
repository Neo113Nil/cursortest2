package m;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import i.C1226d;
import i.DialogInterfaceC1229g;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1423g implements x, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f15109a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f15110b;

    /* renamed from: c, reason: collision with root package name */
    public k f15111c;

    /* renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f15112d;

    /* renamed from: e, reason: collision with root package name */
    public w f15113e;

    /* renamed from: f, reason: collision with root package name */
    public C1422f f15114f;

    public C1423g(ContextWrapper contextWrapper) {
        this.f15109a = contextWrapper;
        this.f15110b = LayoutInflater.from(contextWrapper);
    }

    @Override // m.x
    public final void a(k kVar, boolean z4) {
        w wVar = this.f15113e;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    @Override // m.x
    public final void c(Context context, k kVar) {
        if (this.f15109a != null) {
            this.f15109a = context;
            if (this.f15110b == null) {
                this.f15110b = LayoutInflater.from(context);
            }
        }
        this.f15111c = kVar;
        C1422f c1422f = this.f15114f;
        if (c1422f != null) {
            c1422f.notifyDataSetChanged();
        }
    }

    @Override // m.x
    public final boolean d() {
        return false;
    }

    @Override // m.x
    public final void e(w wVar) {
        throw null;
    }

    @Override // m.x
    public final void f() {
        C1422f c1422f = this.f15114f;
        if (c1422f != null) {
            c1422f.notifyDataSetChanged();
        }
    }

    @Override // m.x
    public final boolean g(m mVar) {
        return false;
    }

    @Override // m.x
    public final boolean i(SubMenuC1416D subMenuC1416D) {
        if (!subMenuC1416D.hasVisibleItems()) {
            return false;
        }
        l lVar = new l();
        lVar.f15147a = subMenuC1416D;
        Context context = subMenuC1416D.f15138a;
        B.v vVar = new B.v(context);
        C1226d c1226d = (C1226d) vVar.f966c;
        C1423g c1423g = new C1423g(c1226d.f13656a);
        lVar.f15149c = c1423g;
        c1423g.f15113e = lVar;
        subMenuC1416D.b(c1423g, context);
        C1423g c1423g2 = lVar.f15149c;
        if (c1423g2.f15114f == null) {
            c1423g2.f15114f = new C1422f(c1423g2);
        }
        c1226d.f13667m = c1423g2.f15114f;
        c1226d.f13668n = lVar;
        View view = subMenuC1416D.f15127F;
        if (view != null) {
            c1226d.f13660e = view;
        } else {
            c1226d.f13658c = subMenuC1416D.f15126E;
            c1226d.f13659d = subMenuC1416D.f15125D;
        }
        c1226d.f13666l = lVar;
        DialogInterfaceC1229g e7 = vVar.e();
        lVar.f15148b = e7;
        e7.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.f15148b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lVar.f15148b.show();
        w wVar = this.f15113e;
        if (wVar == null) {
            return true;
        }
        wVar.n(subMenuC1416D);
        return true;
    }

    @Override // m.x
    public final boolean j(m mVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        this.f15111c.q(this.f15114f.getItem(i7), this, 0);
    }
}
