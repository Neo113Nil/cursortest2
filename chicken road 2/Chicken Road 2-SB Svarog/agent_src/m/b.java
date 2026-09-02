package m;

import android.view.DisplayCutout;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f856a;

    public b(DisplayCutout displayCutout) {
        this.f856a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f856a, ((b) obj).f856a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f856a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f856a + "}";
    }
}
