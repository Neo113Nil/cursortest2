package f5;

import android.view.Surface;
import android.view.SurfaceControl;

/* renamed from: f5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1101a {
    public static /* synthetic */ Surface h(SurfaceControl surfaceControl) {
        return new Surface(surfaceControl);
    }

    public static /* synthetic */ SurfaceControl.Builder i() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction j() {
        return new SurfaceControl.Transaction();
    }

    public static /* bridge */ /* synthetic */ SurfaceControl.Transaction l(Object obj) {
        return (SurfaceControl.Transaction) obj;
    }

    public static /* synthetic */ void n() {
    }
}
