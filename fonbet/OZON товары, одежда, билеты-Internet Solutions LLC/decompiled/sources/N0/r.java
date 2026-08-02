package N0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(@NotNull View view, @NotNull Outline outline) {
        outline.setRect(0, 0, view.getWidth(), view.getHeight());
        outline.setAlpha(0.0f);
    }
}
