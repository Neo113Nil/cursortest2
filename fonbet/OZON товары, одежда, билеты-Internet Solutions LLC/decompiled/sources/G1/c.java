package G1;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import l1.C7848y;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class c {
    @NotNull
    public static final C7848y a(@NotNull Resources resources, int i11) {
        Drawable drawable = resources.getDrawable(i11, null);
        Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        return new C7848y(((BitmapDrawable) drawable).getBitmap());
    }
}
