package com.unity3d.player;

/* renamed from: com.unity3d.player.c0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4900c0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f11783a;
    public final /* synthetic */ UnityPlayer b;

    public RunnableC4900c0(UnityPlayer unityPlayer, boolean z) {
        this.b = unityPlayer;
        this.f11783a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean shouldRunWithoutFocus;
        boolean z = this.b.m_RunWithoutFocus;
        boolean z2 = this.f11783a;
        if (z == z2) {
            return;
        }
        this.b.m_RunWithoutFocus = z2;
        shouldRunWithoutFocus = this.b.shouldRunWithoutFocus();
        if (shouldRunWithoutFocus) {
            return;
        }
        UnityPlayer unityPlayer = this.b;
        com.unity3d.player.a.Q q = unityPlayer.mState;
        if (q.f11753a || q.c) {
            return;
        }
        unityPlayer.setupUnityToBePaused();
    }
}
