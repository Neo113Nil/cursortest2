package n1;

import android.os.Build;
import android.view.DisplayCutout;
import g1.C1968b;
import java.util.Objects;

/* renamed from: n1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2163d {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f18426a;

    public C2163d(DisplayCutout displayCutout) {
        this.f18426a = displayCutout;
    }

    public final C1968b a() {
        return Build.VERSION.SDK_INT >= 30 ? C1968b.c(D0.d.d(this.f18426a)) : C1968b.f17072e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2163d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f18426a, ((C2163d) obj).f18426a);
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f18426a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f18426a + "}";
    }
}
