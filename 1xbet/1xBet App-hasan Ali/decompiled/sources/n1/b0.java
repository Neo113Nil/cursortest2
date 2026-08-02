package n1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class b0 extends a0 {
    public b0(k0 k0Var, WindowInsets windowInsets) {
        super(k0Var, windowInsets);
    }

    @Override // n1.h0
    public k0 a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f18402c.consumeDisplayCutout();
        return k0.c(null, consumeDisplayCutout);
    }

    @Override // n1.Z, n1.h0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Objects.equals(this.f18402c, b0Var.f18402c) && Objects.equals(this.f18405g, b0Var.f18405g) && Z.M(this.f18406h, b0Var.f18406h);
    }

    @Override // n1.h0
    public C2163d h() {
        DisplayCutout displayCutout;
        displayCutout = this.f18402c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C2163d(displayCutout);
    }

    @Override // n1.h0
    public int hashCode() {
        return this.f18402c.hashCode();
    }

    public b0(k0 k0Var, b0 b0Var) {
        super(k0Var, b0Var);
    }
}
