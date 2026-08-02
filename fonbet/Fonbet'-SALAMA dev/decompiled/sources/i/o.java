package i;

import P.U;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public final class o extends AbstractC1464a {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f13718h;

    public /* synthetic */ o(Object obj, int i7) {
        this.f13717g = i7;
        this.f13718h = obj;
    }

    @Override // n3.AbstractC1464a, P.c0
    public void b() {
        Object obj = this.f13718h;
        switch (this.f13717g) {
            case 0:
                ((n) obj).f13716b.f13760M.setVisibility(0);
                break;
            case 1:
                v vVar = (v) obj;
                vVar.f13760M.setVisibility(0);
                if (vVar.f13760M.getParent() instanceof View) {
                    View view = (View) vVar.f13760M.getParent();
                    WeakHashMap weakHashMap = U.f5037a;
                    P.G.c(view);
                    break;
                }
                break;
        }
    }

    @Override // P.c0
    public final void c() {
        Object obj = this.f13718h;
        switch (this.f13717g) {
            case 0:
                n nVar = (n) obj;
                nVar.f13716b.f13760M.setAlpha(1.0f);
                v vVar = nVar.f13716b;
                vVar.f13763P.d(null);
                vVar.f13763P = null;
                break;
            case 1:
                v vVar2 = (v) obj;
                vVar2.f13760M.setAlpha(1.0f);
                vVar2.f13763P.d(null);
                vVar2.f13763P = null;
                break;
            default:
                com.google.android.gms.common.internal.w wVar = (com.google.android.gms.common.internal.w) obj;
                ((v) wVar.f11336c).f13760M.setVisibility(8);
                v vVar3 = (v) wVar.f11336c;
                PopupWindow popupWindow = vVar3.f13761N;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (vVar3.f13760M.getParent() instanceof View) {
                    View view = (View) vVar3.f13760M.getParent();
                    WeakHashMap weakHashMap = U.f5037a;
                    P.G.c(view);
                }
                vVar3.f13760M.e();
                vVar3.f13763P.d(null);
                vVar3.f13763P = null;
                ViewGroup viewGroup = vVar3.f13765R;
                WeakHashMap weakHashMap2 = U.f5037a;
                P.G.c(viewGroup);
                break;
        }
    }
}
