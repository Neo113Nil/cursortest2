package D;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: D.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f238a;

    public C0004e(DisplayCutout displayCutout) {
        this.f238a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0004e.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f238a, ((C0004e) obj).f238a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f238a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f238a + "}";
    }
}
