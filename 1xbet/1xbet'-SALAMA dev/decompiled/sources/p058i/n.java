package p058i;

import P.U;
import P.b0;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f13722b;

    public /* synthetic */ n(v vVar, int i7) {
        this.f13721a = i7;
        this.f13722b = vVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        ViewGroup viewGroup;
        v vVar = this.f13722b;
        switch (this.f13721a) {
            case 0:
                if ((1 & vVar.f13795q0) != 0) {
                    vVar.w(0);
                }
                if ((vVar.f13795q0 & 4096) != 0) {
                    vVar.w(108);
                }
                vVar.f13794p0 = false;
                vVar.f13795q0 = 0;
                break;
            default:
                vVar.f13767N.showAtLocation(vVar.f13766M, 55, 0, 0);
                b0 b0Var = vVar.f13769P;
                if (b0Var != null) {
                    b0Var.b();
                }
                if (vVar.f13770Q && (viewGroup = vVar.f13771R) != null) {
                    WeakHashMap weakHashMap = U.f5037a;
                    z4 = viewGroup.isLaidOut();
                }
                if (!z4) {
                    vVar.f13766M.setAlpha(1.0f);
                    vVar.f13766M.setVisibility(0);
                } else {
                    vVar.f13766M.setAlpha(0.0f);
                    b0 b0VarA = U.a(vVar.f13766M);
                    b0VarA.a(1.0f);
                    vVar.f13769P = b0VarA;
                    b0VarA.d(new o(this, 0));
                }
                break;
        }
    }
}
