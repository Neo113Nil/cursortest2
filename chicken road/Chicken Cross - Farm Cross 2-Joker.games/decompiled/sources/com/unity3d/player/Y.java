package com.unity3d.player;

import android.content.DialogInterface;

/* loaded from: classes7.dex */
public final class Y implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnityPlayer f11736a;

    public Y(UnityPlayer unityPlayer) {
        this.f11736a = unityPlayer;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f11736a.finish();
    }
}
