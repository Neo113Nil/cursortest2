package com.unity3d.ads.core.domain;

/* compiled from: LegacyShowUseCase.kt */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", i = {0, 0, 1}, l = {207, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE}, m = "emit", n = {"this", "it", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes5.dex */
final class LegacyShowUseCase$invoke$4$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$4$emit$1(com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4<? super T> legacyShowUseCase$invoke$4, kotlin.coroutines.Continuation<? super com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4$emit$1> continuation) {
        super(continuation);
        this.this$0 = legacyShowUseCase$invoke$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((com.unity3d.ads.core.data.model.ShowEvent) null, (kotlin.coroutines.Continuation<? super kotlin.Unit>) this);
    }
}
