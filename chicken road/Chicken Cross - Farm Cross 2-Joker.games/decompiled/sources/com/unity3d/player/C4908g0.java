package com.unity3d.player;

import android.content.Context;
import android.view.OrientationEventListener;

/* renamed from: com.unity3d.player.g0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4908g0 extends OrientationEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f11791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4908g0(UnityPlayer unityPlayer, Context context, int i) {
        super(context, i);
        this.f11791a = unityPlayer;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        UnityPlayer unityPlayer = this.f11791a;
        unityPlayer.onOrientationChanged(unityPlayer.mNaturalOrientation, i);
    }
}
