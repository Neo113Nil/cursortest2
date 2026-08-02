package androidx.core.graphics.drawable;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class c extends d {
    @Override // androidx.core.graphics.drawable.d
    final void b(int i11, int i12, int i13, Rect rect, Rect rect2) {
        Gravity.apply(i11, i12, i13, rect, rect2, 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(@NonNull Outline outline) {
        d();
        outline.setRoundRect(this.f42149h, a());
    }
}
