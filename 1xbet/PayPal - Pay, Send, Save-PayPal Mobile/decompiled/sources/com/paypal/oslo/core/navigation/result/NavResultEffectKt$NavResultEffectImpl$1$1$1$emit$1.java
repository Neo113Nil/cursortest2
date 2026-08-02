package com.paypal.oslo.core.navigation.result;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1$1", f = "NavResultEffect.kt", i = {0}, l = {103}, m = "emit", n = {"result"}, nl = {107}, s = {"L$0"}, v = 2)
/* loaded from: classes10.dex */
final class NavResultEffectKt$NavResultEffectImpl$1$1$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1.AnonymousClass1<T> Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.emit(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavResultEffectKt$NavResultEffectImpl$1$1$1$emit$1(com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1.AnonymousClass1<? super T> anonymousClass1, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.navigation.result.NavResultEffectKt$NavResultEffectImpl$1$1$1$emit$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = anonymousClass1;
    }
}
