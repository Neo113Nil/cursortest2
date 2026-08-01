package com.unity3d.player;

/* loaded from: classes7.dex */
public final class V implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f11734a;

    public V(UnityPlayer unityPlayer) {
        this.f11734a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11734a.setupUnityToBePaused();
        this.f11734a.windowFocusChanged(false);
        this.f11734a.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
    }
}
