package com.unity3d.player.a;

import android.content.DialogInterface;

/* loaded from: classes7.dex */
public final class G implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unity3d.player.A f11743a;

    public G(com.unity3d.player.A a2) {
        this.f11743a = a2;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f11743a.invokeOnClose();
    }
}
