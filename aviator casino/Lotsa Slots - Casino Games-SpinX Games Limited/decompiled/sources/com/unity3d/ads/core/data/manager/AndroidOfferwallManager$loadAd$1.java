package com.unity3d.ads.core.data.manager;

/* compiled from: AndroidOfferwallManager.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", i = {}, l = {28}, m = "loadAd", n = {}, s = {})
/* loaded from: classes5.dex */
final class AndroidOfferwallManager$loadAd$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.data.manager.AndroidOfferwallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidOfferwallManager$loadAd$1(com.unity3d.ads.core.data.manager.AndroidOfferwallManager androidOfferwallManager, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1> continuation) {
        super(continuation);
        this.this$0 = androidOfferwallManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.loadAd(null, this);
    }
}
