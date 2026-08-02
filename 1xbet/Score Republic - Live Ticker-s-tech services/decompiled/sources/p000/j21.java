package p000;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j21 {

    /* JADX INFO: renamed from: a */
    public final Resources f3793a;

    /* JADX INFO: renamed from: b */
    public final Resources.Theme f3794b;

    public j21(Resources resources, Resources.Theme theme) {
        this.f3793a = resources;
        this.f3794b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j21.class == obj.getClass()) {
            j21 j21Var = (j21) obj;
            if (this.f3793a.equals(j21Var.f3793a) && Objects.equals(this.f3794b, j21Var.f3794b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f3793a, this.f3794b);
    }
}
