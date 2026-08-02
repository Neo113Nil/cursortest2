package E50;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z50.C10989c;

/* loaded from: classes3.dex */
public final class a implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void transformPage(@NotNull View view, float f7) {
        Intrinsics.checkNotNullParameter(view, "view");
        C10989c.a("CubeTransformer", "position = " + f7 + " view.x=" + view.getX() + " view = " + view);
        if (-1.0f > f7 || f7 > 1.0f) {
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
        view.setPivotX(f7 < 0.0f ? view.getWidth() : 0.0f);
        view.setPivotY(view.getHeight() * 0.5f);
        view.setRotationY(f7 * 25.0f);
    }
}
