package com.unity3d.player;

import android.app.Activity;

/* renamed from: com.unity3d.player.f0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4906f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f11789a;

    public RunnableC4906f0(UnityPlayer unityPlayer) {
        this.f11789a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean nativeIsAutorotationOn;
        UnityPlayer unityPlayer;
        Activity activity;
        int i;
        nativeIsAutorotationOn = this.f11789a.nativeIsAutorotationOn();
        if (!nativeIsAutorotationOn || (activity = (unityPlayer = this.f11789a).mActivity) == null) {
            return;
        }
        i = unityPlayer.mInitialScreenOrientation;
        activity.setRequestedOrientation(i);
    }
}
