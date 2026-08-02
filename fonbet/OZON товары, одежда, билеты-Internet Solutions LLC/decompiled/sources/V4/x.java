package V4;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f28071a;

    x(@NonNull View view) {
        this.f28071a = view.getOverlay();
    }

    public final void a(@NonNull Drawable drawable) {
        this.f28071a.add(drawable);
    }

    public final void b(@NonNull Drawable drawable) {
        this.f28071a.remove(drawable);
    }
}
