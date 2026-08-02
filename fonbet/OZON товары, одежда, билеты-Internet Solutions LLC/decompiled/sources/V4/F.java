package V4;

import android.view.ViewGroup;
import android.view.WindowId;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    private final WindowId f28002a;

    F(@NonNull ViewGroup viewGroup) {
        this.f28002a = viewGroup.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && ((F) obj).f28002a.equals(this.f28002a);
    }

    public final int hashCode() {
        return this.f28002a.hashCode();
    }
}
