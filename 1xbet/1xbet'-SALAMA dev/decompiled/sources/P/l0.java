package P;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l0 extends k0 {
    public l0(q0 q0Var, WindowInsets windowInsets) {
        super(q0Var, windowInsets);
    }

    @Override // P.p0
    public q0 a() {
        return q0.g(this.f5082c.consumeDisplayCutout(), null);
    }

    @Override // P.p0
    public C0354j e() {
        DisplayCutout displayCutout = this.f5082c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0354j(displayCutout);
    }

    @Override // P.j0, P.p0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Objects.equals(this.f5082c, l0Var.f5082c) && Objects.equals(this.f5084e, l0Var.f5084e);
    }

    @Override // P.p0
    public int hashCode() {
        return this.f5082c.hashCode();
    }
}
