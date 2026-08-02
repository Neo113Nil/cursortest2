package p000;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y00 implements View.OnClickListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9121j = 0;

    /* JADX INFO: renamed from: k */
    public final Object f9122k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f9123l;

    public y00(xd1 xd1Var) {
        this.f9123l = xd1Var;
        Context context = xd1Var.f8896a.getContext();
        CharSequence charSequence = xd1Var.f8903h;
        C0344j2 c0344j2 = new C0344j2();
        c0344j2.f3779n = 4096;
        c0344j2.f3781p = 4096;
        c0344j2.f3786u = null;
        c0344j2.f3787v = null;
        c0344j2.f3788w = false;
        c0344j2.f3789x = false;
        c0344j2.f3790y = 16;
        c0344j2.f3783r = context;
        c0344j2.f3775j = charSequence;
        this.f9122k = c0344j2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f9121j;
        Object obj = this.f9122k;
        Object obj2 = this.f9123l;
        switch (i) {
            case 0:
                d10 d10Var = (d10) obj2;
                g10 g10Var = d10Var.f1517t;
                if (g10Var != null) {
                    ((C0963zt) g10Var).m6036f(e10.f1899l);
                }
                m80.m3343j("Dismissing fiam");
                d10Var.m1079c((Activity) obj);
                d10Var.f1516s = null;
                d10Var.f1517t = null;
                break;
            default:
                xd1 xd1Var = (xd1) obj2;
                Window.Callback callback = xd1Var.f8906k;
                if (callback != null && xd1Var.f8907l) {
                    callback.onMenuItemSelected(0, (C0344j2) obj);
                    break;
                }
                break;
        }
    }

    public y00(d10 d10Var, Activity activity) {
        this.f9123l = d10Var;
        this.f9122k = activity;
    }
}
