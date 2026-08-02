package w2;

import android.view.Surface;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public abstract class j {
    public static void a(Surface surface, float f7) {
        try {
            surface.setFrameRate(f7, f7 == 0.0f ? 0 : 1);
        } catch (IllegalStateException e7) {
            AbstractC1664a.l("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e7);
        }
    }
}
