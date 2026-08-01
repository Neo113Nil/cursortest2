package com.unity3d.player;

import android.widget.FrameLayout;

/* loaded from: classes7.dex */
public final class O0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayerForGameActivity f11719a;

    public O0(UnityPlayerForGameActivity unityPlayerForGameActivity) {
        this.f11719a = unityPlayerForGameActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.D d;
        com.unity3d.player.a.D d2;
        UnityPlayerForGameActivity unityPlayerForGameActivity = this.f11719a;
        d = unityPlayerForGameActivity.m_PersistentUnitySurface;
        FrameLayout frameLayout = unityPlayerForGameActivity.getFrameLayout();
        com.unity3d.player.a.C c = d.b;
        if (c != null && c.getParent() != null) {
            frameLayout.removeView(d.b);
        }
        d2 = this.f11719a.m_PersistentUnitySurface;
        d2.b = null;
    }
}
