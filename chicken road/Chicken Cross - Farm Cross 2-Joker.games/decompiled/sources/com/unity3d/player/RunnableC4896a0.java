package com.unity3d.player;

import android.widget.FrameLayout;

/* renamed from: com.unity3d.player.a0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4896a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f11780a;

    public RunnableC4896a0(UnityPlayer unityPlayer) {
        this.f11780a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unity3d.player.a.J j;
        FrameLayout frameLayout = this.f11780a.getFrameLayout();
        j = this.f11780a.m_SplashScreen;
        frameLayout.removeView(j);
        this.f11780a.m_SplashScreen = null;
    }
}
