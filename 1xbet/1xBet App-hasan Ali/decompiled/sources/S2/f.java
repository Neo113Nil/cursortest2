package S2;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import m.MenuItemC2071i;
import n.B0;
import n.x0;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5323k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f5324l;

    public /* synthetic */ f(int i, Object obj) {
        this.f5323k = i;
        this.f5324l = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5323k) {
            case 0:
                d dVar = (d) this.f5324l;
                dVar.f5296G = 2;
                dVar.f5298l.finish();
                break;
            case 1:
                x0 x0Var = ((Toolbar) this.f5324l).f6770U;
                MenuItemC2071i menuItemC2071i = x0Var == null ? null : x0Var.f18331l;
                if (menuItemC2071i != null) {
                    menuItemC2071i.collapseActionView();
                    break;
                }
                break;
            default:
                B0 b02 = (B0) this.f5324l;
                if (b02.f18128k != null) {
                    b02.getClass();
                    break;
                }
                break;
        }
    }

    public f(B0 b02) {
        this.f5323k = 2;
        this.f5324l = b02;
        b02.f18120a.getContext();
    }
}
