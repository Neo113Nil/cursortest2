package P;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: P.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0354j {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f5077a;

    public C0354j(DisplayCutout displayCutout) {
        this.f5077a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0354j.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f5077a, ((C0354j) obj).f5077a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f5077a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5077a + "}";
    }
}
