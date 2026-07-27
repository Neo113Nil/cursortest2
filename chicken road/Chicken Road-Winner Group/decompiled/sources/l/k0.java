package l;

import android.view.View;
import androidx.appcompat.widget.Toolbar;
import k.MenuItemC1070k;

/* loaded from: classes.dex */
public final class k0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9827a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9828b;

    public k0(p0 p0Var) {
        this.f9828b = p0Var;
        p0Var.f9849a.getContext();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f9827a) {
            case 0:
                l0 l0Var = ((Toolbar) this.f9828b).f2067I;
                MenuItemC1070k menuItemC1070k = l0Var == null ? null : l0Var.f9830b;
                if (menuItemC1070k != null) {
                    menuItemC1070k.collapseActionView();
                    break;
                }
                break;
            default:
                p0 p0Var = (p0) this.f9828b;
                if (p0Var.f9858k != null) {
                    p0Var.getClass();
                    break;
                }
                break;
        }
    }

    public k0(Toolbar toolbar) {
        this.f9828b = toolbar;
    }
}
