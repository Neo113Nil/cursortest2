package n;

import androidx.appcompat.widget.Toolbar;
import m.MenuItemC2071i;

/* loaded from: classes.dex */
public final /* synthetic */ class v0 implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f18328k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Toolbar f18329l;

    public /* synthetic */ v0(Toolbar toolbar, int i) {
        this.f18328k = i;
        this.f18329l = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18328k) {
            case 0:
                x0 x0Var = this.f18329l.f6770U;
                MenuItemC2071i menuItemC2071i = x0Var == null ? null : x0Var.f18331l;
                if (menuItemC2071i != null) {
                    menuItemC2071i.collapseActionView();
                    break;
                }
                break;
            default:
                this.f18329l.l();
                break;
        }
    }
}
