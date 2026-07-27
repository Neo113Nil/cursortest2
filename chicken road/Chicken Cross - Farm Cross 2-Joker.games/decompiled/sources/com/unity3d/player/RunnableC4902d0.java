package com.unity3d.player;

/* renamed from: com.unity3d.player.d0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4902d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11785a;

    public RunnableC4902d0(String str) {
        this.f11785a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UnityPlayer.nativeSetLaunchURL(this.f11785a);
    }
}
