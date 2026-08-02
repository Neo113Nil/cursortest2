package O10;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes7.dex */
public final class f {
    public static final float a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return view.getTranslationY() + view.getBottom() + 0;
    }

    public static final float b(@NotNull View view, boolean z11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        if (z11) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            Object tag = view.getTag(R.id.sticky_overlap_info);
            if (tag instanceof N10.f) {
            }
        }
        return view.getTranslationY() + view.getTop() + 0;
    }
}
