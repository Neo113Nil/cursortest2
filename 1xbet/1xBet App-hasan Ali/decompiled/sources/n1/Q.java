package n1;

import android.graphics.RenderNode;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class Q {
    public static /* synthetic */ RenderNode e() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ WindowInsets.Builder f() {
        return new WindowInsets.Builder();
    }

    public static /* synthetic */ WindowInsets.Builder g(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }
}
