package com.unity3d.player;

import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import com.unity3d.player.a.C4877f;

/* loaded from: classes7.dex */
public final class O implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f11718a;

    public O(P p) {
        this.f11718a = p;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f11718a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        P p = this.f11718a;
        com.unity3d.player.a.D d = p.c;
        FrameLayout frameLayout = p.b.getFrameLayout();
        com.unity3d.player.a.C c = d.b;
        if (c == null || c.getParent() != null) {
            return;
        }
        frameLayout.addView(d.b);
        frameLayout.bringChildToFront(d.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f11718a.b.updateGLDisplay(0, surfaceHolder.getSurface());
        this.f11718a.b.sendSurfaceChangedEvent();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        P p = this.f11718a;
        com.unity3d.player.a.D d = p.c;
        C4877f c4877f = p.f11721a;
        d.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && d.f11741a != null) {
            if (d.b == null) {
                d.b = new com.unity3d.player.a.C(d, d.f11741a);
            }
            d.b.a(c4877f);
        }
        this.f11718a.b.handleDeferredPauseOnSurfaceDestroyed();
        this.f11718a.b.updateGLDisplay(0, null);
    }
}
