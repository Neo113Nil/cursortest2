package com.paypal.oslo.feature.pools.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl", f = "CreatePoolRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {50}, m = "createPool", n = {"input", "combineError$iv", "state$iv", "raise$iv$iv$iv", "$this$ior_u24lambda_u240$iv", "$this$createPool_u24lambda_u241", "mutation", "$i$f$ior", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-_foldOrThrow-RaiseKt__BuildersKt$ior$1$iv", "$i$a$-ior-CreatePoolRepositoryImpl$createPool$3"}, nl = {51}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "I$0", "I$1", "I$2", "I$3", "I$4"}, v = 2)
/* loaded from: classes13.dex */
final class CreatePoolRepositoryImpl$createPool$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl isOutputSupportedFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.isOutputSupportedFor.createPool(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreatePoolRepositoryImpl$createPool$1(com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl createPoolRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.pools.data.repository.CreatePoolRepositoryImpl$createPool$1> continuation) {
        super(continuation);
        this.isOutputSupportedFor = createPoolRepositoryImpl;
    }
}
