package n1;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends f0 {
    public g0(k0 k0Var, WindowInsets windowInsets) {
        super(k0Var, windowInsets);
    }

    @Override // n1.Z, n1.h0
    public List<Rect> f(int i) {
        List<Rect> boundingRects;
        boundingRects = this.f18402c.getBoundingRects(j0.a(i));
        return boundingRects;
    }

    @Override // n1.Z, n1.h0
    public List<Rect> g(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.f18402c.getBoundingRectsIgnoringVisibility(j0.a(i));
        return boundingRectsIgnoringVisibility;
    }

    public g0(k0 k0Var, g0 g0Var) {
        super(k0Var, g0Var);
    }

    @Override // n1.Z, n1.h0
    public void q() {
    }
}
