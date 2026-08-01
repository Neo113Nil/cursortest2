package com.unity3d.player;

import android.telephony.PhoneStateListener;

/* renamed from: com.unity3d.player.k0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4916k0 extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f11796a;

    public C4916k0(UnityPlayer unityPlayer) {
        this.f11796a = unityPlayer;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        this.f11796a.nativeMuteMasterAudio(i == 1);
    }
}
