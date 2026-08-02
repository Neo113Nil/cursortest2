package H30;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {
    public static final void a(@NotNull Drawable drawable, int i11) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(i11);
        } else if (drawable instanceof ShapeDrawable) {
            ((ShapeDrawable) drawable).getPaint().setColor(i11);
        } else if (drawable instanceof ColorDrawable) {
            ((ColorDrawable) drawable).setColor(i11);
        }
    }
}
