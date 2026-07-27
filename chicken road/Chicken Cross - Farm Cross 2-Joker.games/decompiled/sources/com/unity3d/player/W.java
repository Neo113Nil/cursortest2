package com.unity3d.player;

import com.unity3d.player.a.AbstractC4874c;
import com.unity3d.player.a.AbstractC4890t;

/* loaded from: classes7.dex */
public final class W implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11735a;
    public final /* synthetic */ UnityPlayer b;

    public W(UnityPlayer unityPlayer, int i) {
        this.b = unityPlayer;
        this.f11735a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            UnityPlayer unityPlayer = this.b;
            AbstractC4874c.a(unityPlayer.mActivity, unityPlayer.getFrameLayout(), this.f11735a);
        } catch (Exception e) {
            AbstractC4890t.Log(6, "Exception when opening Activity Indicator " + e);
        }
    }
}
