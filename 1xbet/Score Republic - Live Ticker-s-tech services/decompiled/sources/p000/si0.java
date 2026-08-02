package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class si0 implements eo0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: j */
    public Context f7119j;

    /* JADX INFO: renamed from: k */
    public LayoutInflater f7120k;

    /* JADX INFO: renamed from: l */
    public on0 f7121l;

    /* JADX INFO: renamed from: m */
    public ExpandedMenuView f7122m;

    /* JADX INFO: renamed from: n */
    public do0 f7123n;

    /* JADX INFO: renamed from: o */
    public ri0 f7124o;

    public si0(ContextWrapper contextWrapper) {
        this.f7119j = contextWrapper;
        this.f7120k = LayoutInflater.from(contextWrapper);
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: b */
    public final void mo1481b(on0 on0Var, boolean z) {
        do0 do0Var = this.f7123n;
        if (do0Var != null) {
            do0Var.mo609b(on0Var, z);
        }
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: d */
    public final boolean mo1482d(rn0 rn0Var) {
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: e */
    public final void mo1483e(do0 do0Var) {
        throw null;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: f */
    public final boolean mo1484f(rn0 rn0Var) {
        return false;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: g */
    public final void mo1485g() {
        ri0 ri0Var = this.f7124o;
        if (ri0Var != null) {
            ri0Var.notifyDataSetChanged();
        }
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: h */
    public final void mo1486h(Context context, on0 on0Var) {
        if (this.f7119j != null) {
            this.f7119j = context;
            if (this.f7120k == null) {
                this.f7120k = LayoutInflater.from(context);
            }
        }
        this.f7121l = on0Var;
        ri0 ri0Var = this.f7124o;
        if (ri0Var != null) {
            ri0Var.notifyDataSetChanged();
        }
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: j */
    public final boolean mo1487j(gb1 gb1Var) {
        boolean zHasVisibleItems = gb1Var.hasVisibleItems();
        Context context = gb1Var.f5799j;
        if (!zHasVisibleItems) {
            return false;
        }
        pn0 pn0Var = new pn0();
        pn0Var.f6218j = gb1Var;
        C0678s3 c0678s3 = new C0678s3(context);
        C0530o3 c0530o3 = (C0530o3) c0678s3.f7022k;
        si0 si0Var = new si0(c0530o3.f5586a);
        pn0Var.f6220l = si0Var;
        si0Var.f7123n = pn0Var;
        gb1Var.m3706b(si0Var, context);
        si0 si0Var2 = pn0Var.f6220l;
        if (si0Var2.f7124o == null) {
            si0Var2.f7124o = new ri0(si0Var2);
        }
        c0530o3.f5597l = si0Var2.f7124o;
        c0530o3.f5598m = pn0Var;
        View view = gb1Var.f5813x;
        if (view != null) {
            c0530o3.f5590e = view;
        } else {
            c0530o3.f5588c = gb1Var.f5812w;
            c0530o3.f5589d = gb1Var.f5811v;
        }
        c0530o3.f5596k = pn0Var;
        DialogInterfaceC0715t3 dialogInterfaceC0715t3M4471a = c0678s3.m4471a();
        pn0Var.f6219k = dialogInterfaceC0715t3M4471a;
        dialogInterfaceC0715t3M4471a.setOnDismissListener(pn0Var);
        WindowManager.LayoutParams attributes = pn0Var.f6219k.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        pn0Var.f6219k.show();
        do0 do0Var = this.f7123n;
        if (do0Var == null) {
            return true;
        }
        do0Var.mo621q(gb1Var);
        return true;
    }

    @Override // p000.eo0
    /* JADX INFO: renamed from: k */
    public final boolean mo1488k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f7121l.m3713q(this.f7124o.getItem(i), this, 0);
    }
}
