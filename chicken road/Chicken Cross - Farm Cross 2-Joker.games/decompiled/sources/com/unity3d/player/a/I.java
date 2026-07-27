package com.unity3d.player.a;

import android.content.DialogInterface;
import com.unity3d.player.I0;

/* loaded from: classes7.dex */
public final class I implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unity3d.player.A f11745a;

    public I(com.unity3d.player.A a2) {
        this.f11745a = a2;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        I0 i0 = this.f11745a.f;
        if (i0 != null) {
            i0.a();
        }
    }
}
