package p000;

import android.app.Activity;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a10 implements View.OnTouchListener {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f16j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f17k;

    public /* synthetic */ a10(int i, Object obj) {
        this.f16j = i;
        this.f17k = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.f16j;
        Object obj = this.f17k;
        switch (i) {
            case 0:
                b10 b10Var = (b10) obj;
                d10 d10Var = b10Var.f674q;
                if (motionEvent.getAction() != 4) {
                    return false;
                }
                g10 g10Var = d10Var.f1517t;
                if (g10Var != null) {
                    ((C0963zt) g10Var).m6036f(e10.f1897j);
                }
                Activity activity = b10Var.f672o;
                m80.m3343j("Dismissing fiam");
                d10Var.m1079c(activity);
                d10Var.f1516s = null;
                d10Var.f1517t = null;
                return true;
            default:
                zi0 zi0Var = (zi0) obj;
                wi0 wi0Var = zi0Var.f9796z;
                Handler handler = zi0Var.f9775D;
                C0275h6 c0275h6 = zi0Var.f9779H;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && c0275h6 != null && c0275h6.isShowing() && x >= 0 && x < c0275h6.getWidth() && y >= 0 && y < c0275h6.getHeight()) {
                    handler.postDelayed(wi0Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(wi0Var);
                }
                return false;
        }
    }
}
