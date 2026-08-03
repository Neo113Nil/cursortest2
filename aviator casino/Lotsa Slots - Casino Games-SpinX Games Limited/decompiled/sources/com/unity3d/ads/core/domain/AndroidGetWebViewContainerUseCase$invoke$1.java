package com.unity3d.ads.core.domain;

/* compiled from: AndroidGetWebViewContainerUseCase.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", f = "AndroidGetWebViewContainerUseCase.kt", i = {0, 0}, l = {24}, m = "invoke", n = {"this", "adPlayerScope"}, s = {"L$0", "L$1"})
/* loaded from: classes5.dex */
final class AndroidGetWebViewContainerUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidGetWebViewContainerUseCase$invoke$1(com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidGetWebViewContainerUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, this);
    }
}
