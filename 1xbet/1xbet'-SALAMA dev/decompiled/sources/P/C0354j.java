package P;

import android.view.DisplayCutout;
import java.util.Objects;

/* JADX INFO: renamed from: P.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0354j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
        return this.f5077a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5077a + "}";
    }
}
