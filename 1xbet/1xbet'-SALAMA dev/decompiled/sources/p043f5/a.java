package p043f5;

import android.view.Surface;
import android.view.SurfaceControl;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
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
