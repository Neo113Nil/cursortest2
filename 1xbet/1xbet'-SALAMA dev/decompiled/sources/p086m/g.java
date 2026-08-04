package p086m;

import B.v;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p058i.C0907d;
import p058i.DialogInterfaceC0910g;

/* JADX INFO: loaded from: classes.dex */
public final class g implements x, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f15115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LayoutInflater f15116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f15117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ExpandedMenuView f15118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w f15119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f f15120f;

    public g(ContextWrapper contextWrapper) {
        this.f15115a = contextWrapper;
        this.f15116b = LayoutInflater.from(contextWrapper);
    }

    @Override // p086m.x
    public final void a(k kVar, boolean z4) {
        w wVar = this.f15119e;
        if (wVar != null) {
            wVar.a(kVar, z4);
        }
    }

    @Override // p086m.x
    public final void c(Context context, k kVar) {
        if (this.f15115a != null) {
            this.f15115a = context;
            if (this.f15116b == null) {
                this.f15116b = LayoutInflater.from(context);
            }
        }
        this.f15117c = kVar;
        f fVar = this.f15120f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // p086m.x
    public final boolean d() {
        return false;
    }

    @Override // p086m.x
    public final void e(w wVar) {
        throw null;
    }

    @Override // p086m.x
    public final void f() {
        f fVar = this.f15120f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override // p086m.x
    public final boolean g(m mVar) {
        return false;
    }

    @Override // p086m.x
    public final boolean i(D d7) {
        if (!d7.hasVisibleItems()) {
            return false;
        }
        l lVar = new l();
        lVar.f15153a = d7;
        Context context = d7.f15144a;
        v vVar = new v(context);
        C0907d c0907d = (C0907d) vVar.f966c;
        g gVar = new g(c0907d.f13662a);
        lVar.f15155c = gVar;
        gVar.f15119e = lVar;
        d7.b(gVar, context);
        g gVar2 = lVar.f15155c;
        if (gVar2.f15120f == null) {
            gVar2.f15120f = new f(gVar2);
        }
        c0907d.f13673m = gVar2.f15120f;
        c0907d.f13674n = lVar;
        View view = d7.f15133F;
        if (view != null) {
            c0907d.f13666e = view;
        } else {
            c0907d.f13664c = d7.f15132E;
            c0907d.f13665d = d7.f15131D;
        }
        c0907d.f13672l = lVar;
        DialogInterfaceC0910g dialogInterfaceC0910gE = vVar.e();
        lVar.f15154b = dialogInterfaceC0910gE;
        dialogInterfaceC0910gE.setOnDismissListener(lVar);
        WindowManager.LayoutParams attributes = lVar.f15154b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        lVar.f15154b.show();
        w wVar = this.f15119e;
        if (wVar == null) {
            return true;
        }
        wVar.n(d7);
        return true;
    }

    @Override // p086m.x
    public final boolean j(m mVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j) {
        this.f15117c.q(this.f15120f.getItem(i7), this, 0);
    }
}
