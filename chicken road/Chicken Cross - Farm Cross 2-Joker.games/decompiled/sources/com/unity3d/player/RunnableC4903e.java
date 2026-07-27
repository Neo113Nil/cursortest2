package com.unity3d.player;

/* renamed from: com.unity3d.player.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC4903e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final IAssetPackManagerMobileDataConfirmationCallback f11786a;
    public final boolean b;

    public RunnableC4903e(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback, boolean z) {
        this.f11786a = iAssetPackManagerMobileDataConfirmationCallback;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11786a.onMobileDataConfirmationResult(this.b);
    }
}
