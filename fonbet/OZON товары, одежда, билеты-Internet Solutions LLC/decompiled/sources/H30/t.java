package H30;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.ui.button.transparent.TransparentButtonView;

/* loaded from: classes3.dex */
public final class t {
    public static final void a(@NotNull TransparentButtonView transparentButtonView, int i11, int i12) {
        Intrinsics.checkNotNullParameter(transparentButtonView, "<this>");
        Drawable drawable = androidx.core.content.a.getDrawable(transparentButtonView.getContext(), i11);
        int color = androidx.core.content.a.getColor(transparentButtonView.getContext(), i12);
        if (Build.VERSION.SDK_INT >= 29) {
            if (drawable != null) {
                drawable.setColorFilter(new BlendModeColorFilter(color, BlendMode.SRC_ATOP));
            }
        } else if (drawable != null) {
            drawable.setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        transparentButtonView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
    }
}
