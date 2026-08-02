package p000;

import android.view.DisplayCutout;

/* JADX INFO: renamed from: bu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0075bu {

    /* JADX INFO: renamed from: a */
    public final DisplayCutout f986a;

    public C0075bu(DisplayCutout displayCutout) {
        this.f986a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0075bu.class != obj.getClass()) {
            return false;
        }
        return this.f986a.equals(((C0075bu) obj).f986a);
    }

    public final int hashCode() {
        return this.f986a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f986a + "}";
    }
}
