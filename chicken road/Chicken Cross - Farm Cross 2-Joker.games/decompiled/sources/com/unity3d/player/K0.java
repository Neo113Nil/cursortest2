package com.unity3d.player;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;

/* loaded from: classes7.dex */
public final class K0 implements SurfaceHolder.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForGameActivity f11715a;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public K0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.f11715a = unityPlayerForGameActivity;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        com.unity3d.player.a.D d;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.f11715a;
        d = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        com.unity3d.player.a.C c = d.b;
        if (c == null || c.getParent() != null) {
            return;
        }
        frameLayout.addView(d.b);
        frameLayout.bringChildToFront(d.b);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        com.unity3d.player.a.D d;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.f11715a;
        d = unityPlayerForGameActivity.m_PersistentUnitySurface;
        SurfaceView surfaceView = unityPlayerForGameActivity.m_SurfaceView;
        d.getClass();
        if (PlatformSupport.NOUGAT_SUPPORT && d.f11741a != null) {
            if (d.b == null) {
                d.b = new com.unity3d.player.a.C(d, d.f11741a);
            }
            d.b.a(surfaceView);
        }
        this.f11715a.handleDeferredPauseOnSurfaceDestroyed();
    }
}
