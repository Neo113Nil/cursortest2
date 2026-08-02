package O0;

import android.view.ViewGroup;
import android.view.WindowId;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f4919a;

    public z(ViewGroup viewGroup) {
        this.f4919a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && ((z) obj).f4919a.equals(this.f4919a);
    }

    public final int hashCode() {
        return this.f4919a.hashCode();
    }
}
