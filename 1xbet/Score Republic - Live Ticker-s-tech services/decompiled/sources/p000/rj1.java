package p000;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rj1 extends qj1 {
    public rj1(ak1 ak1Var, WindowInsets windowInsets) {
        super(ak1Var, windowInsets);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: a */
    public ak1 mo4358a() {
        return ak1.m270b(this.f6171c.consumeDisplayCutout(), null);
    }

    @Override // p000.xj1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj1)) {
            return false;
        }
        rj1 rj1Var = (rj1) obj;
        return Objects.equals(this.f6171c, rj1Var.f6171c) && Objects.equals(this.f6175g, rj1Var.f6175g) && pj1.m3927I(this.f6176h, rj1Var.f6176h);
    }

    @Override // p000.xj1
    /* JADX INFO: renamed from: g */
    public C0075bu mo4359g() {
        DisplayCutout displayCutout = this.f6171c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0075bu(displayCutout);
    }

    @Override // p000.xj1
    public int hashCode() {
        return this.f6171c.hashCode();
    }
}
