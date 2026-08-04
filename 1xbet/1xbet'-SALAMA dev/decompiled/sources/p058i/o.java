package p058i;

import P.G;
import P.U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.google.android.gms.common.internal.w;
import java.util.WeakHashMap;
import p097n3.a;

/* JADX INFO: loaded from: classes.dex */
public final class o extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13723g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13724h;

    public /* synthetic */ o(Object obj, int i7) {
        this.f13723g = i7;
        this.f13724h = obj;
    }

    @Override // p097n3.a, P.c0
    public void b() {
        Object obj = this.f13724h;
        switch (this.f13723g) {
            case 0:
                ((n) obj).f13722b.f13766M.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f13766M.setVisibility(0);
                if (vVar.f13766M.getParent() instanceof View) {
                    View view = (View) vVar.f13766M.getParent();
                    WeakHashMap weakHashMap = U.f5037a;
                    G.c(view);
                }
                break;
        }
    }

    @Override // P.c0
    public final void c() {
        Object obj = this.f13724h;
        switch (this.f13723g) {
            case 0:
                n nVar = (n) obj;
                nVar.f13722b.f13766M.setAlpha(1.0f);
                v vVar = nVar.f13722b;
                vVar.f13769P.d(null);
                vVar.f13769P = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f13766M.setAlpha(1.0f);
                vVar2.f13769P.d(null);
                vVar2.f13769P = null;
                break;
            default:
                w wVar = (w) obj;
                ((v) wVar.f11336c).f13766M.setVisibility(8);
                v vVar3 = (v) wVar.f11336c;
                PopupWindow popupWindow = vVar3.f13767N;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f13766M.getParent() instanceof View) {
                    View view = (View) vVar3.f13766M.getParent();
                    WeakHashMap weakHashMap = U.f5037a;
                    G.c(view);
                }
                vVar3.f13766M.e();
                vVar3.f13769P.d(null);
                vVar3.f13769P = null;
                ViewGroup viewGroup = vVar3.f13771R;
                WeakHashMap weakHashMap2 = U.f5037a;
                G.c(viewGroup);
                break;
        }
    }
}
