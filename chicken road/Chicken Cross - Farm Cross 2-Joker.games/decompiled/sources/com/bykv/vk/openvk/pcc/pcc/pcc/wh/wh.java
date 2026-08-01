package com.bykv.vk.openvk.pcc.pcc.pcc.wh;

import android.view.SurfaceHolder;
import java.lang.ref.WeakReference;

/* loaded from: classes5.dex */
public class wh implements SurfaceHolder.Callback {
    private final WeakReference<SurfaceHolder.Callback> pcc;

    public wh(SurfaceHolder.Callback callback) {
        this.pcc = new WeakReference<>(callback);
    }

    public SurfaceHolder.Callback pcc() {
        return this.pcc.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.pcc.get();
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        SurfaceHolder.Callback callback = this.pcc.get();
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.pcc.get();
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }
}
