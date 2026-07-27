package com.unity3d.player;

import android.os.SystemClock;
import android.view.KeyEvent;

/* loaded from: classes7.dex */
public final class Z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f11737a;

    public Z(UnityPlayer unityPlayer) {
        this.f11737a = unityPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = SystemClock.uptimeMillis();
        KeyEvent keyEvent = new KeyEvent(uptimeMillis, uptimeMillis, 0, 4, 1, 0, -1, 0, 0, 257);
        KeyEvent keyEvent2 = new KeyEvent(uptimeMillis, uptimeMillis + 1, 1, 4, 1, 0, -1, 0, 0, 257);
        this.f11737a.getActivity().dispatchKeyEvent(keyEvent);
        this.f11737a.getActivity().dispatchKeyEvent(keyEvent2);
    }
}
