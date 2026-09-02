package n;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788b {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f6146a;

    public C0788b(DisplayCutout displayCutout) {
        this.f6146a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0788b.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f6146a, ((C0788b) obj).f6146a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f6146a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f6146a + "}";
    }
}
