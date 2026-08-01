package com.unity3d.player;

import com.unity3d.player.UnityPlayer;
import com.unity3d.player.a.AbstractC4890t;

/* renamed from: com.unity3d.player.j0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4914j0 implements IPermissionRequestCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final long f11795a;
    public final /* synthetic */ UnityPlayer b;

    public C4914j0(long j, UnityPlayer unityPlayer) {
        this.b = unityPlayer;
        this.f11795a = j;
    }

    @Override // com.unity3d.player.IPermissionRequestCallbacks
    public final void onPermissionResult(String[] strArr, int[] iArr) {
        int length = iArr.length;
        boolean z = false;
        if (length != 0) {
            if (length == 1) {
                if (iArr[0] == 1) {
                    z = true;
                }
            } else {
                AbstractC4890t.Log(6, "Only a single permission request is supported");
                return;
            }
        }
        if (this.f11795a == 0) {
            return;
        }
        this.b.invokeOnMainThread((UnityPlayer.a) new C4912i0(this, z));
    }
}
