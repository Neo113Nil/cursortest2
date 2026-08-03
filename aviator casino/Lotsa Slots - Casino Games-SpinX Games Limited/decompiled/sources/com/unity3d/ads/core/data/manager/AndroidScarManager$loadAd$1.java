package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidScarManager.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", i = {}, l = {93}, m = "loadAd", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidScarManager$loadAd$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.data.manager.AndroidScarManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidScarManager$loadAd$1(com.unity3d.ads.core.data.manager.AndroidScarManager androidScarManager, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1> continuation) {
        super(continuation);
        this.this$0 = androidScarManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadAd(null, null, null, null, null, 0, this);
    }
}
