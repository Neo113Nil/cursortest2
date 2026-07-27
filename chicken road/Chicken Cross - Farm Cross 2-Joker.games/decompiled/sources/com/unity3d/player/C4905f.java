package com.unity3d.player;

import com.google.android.gms.tasks.OnSuccessListener;

/* renamed from: com.unity3d.player.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4905f implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerMobileDataConfirmationCallback f11788a;
    public final UnityPlayer b;

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback = this.f11788a;
        if (iAssetPackManagerMobileDataConfirmationCallback != null) {
            this.b.invokeOnMainThread(new RunnableC4903e(iAssetPackManagerMobileDataConfirmationCallback, num.intValue() == -1));
        }
    }

    public C4905f(UnityPlayer unityPlayer, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        this.b = unityPlayer;
        this.f11788a = iAssetPackManagerMobileDataConfirmationCallback;
    }
}
