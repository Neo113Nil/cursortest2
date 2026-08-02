package com.paypal.oslo.feature.taptopay.data.sdk;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializationError;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2", f = "CompositeSdkInitializer.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {63, 64}, m = "invokeSuspend", n = {"$this$supervisorScope", "thalesDeferred", "payairDeferred", "$this$supervisorScope", "thalesDeferred", "payairDeferred", "thalesError"}, nl = {64, 66}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class CompositeSdkInitializer$init$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, ? extends kotlin.Unit>>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.Class<? extends android.app.Activity> getHighSpeedVideoSizes;
    int getInputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r1 == r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x012f, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r3 != r8) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Deferred async$default;
        kotlinx.coroutines.Deferred async$default2;
        java.lang.Object await;
        com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError sdkInitializationError;
        java.lang.Object await2;
        kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getOutputFormats;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$thalesDeferred$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, null), 3, null);
            async$default2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2$payairDeferred$1(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, null), 3, null);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
            this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
            this.getHighResolutionOutputSizeshNQ4ISI = async$default2;
            this.getInputSizeshNQ4ISI = 1;
            await = async$default.await(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError sdkInitializationError2 = (com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError) this.Camera2StreamConfigurationMap;
                kotlin.ResultKt.throwOnFailure(obj);
                sdkInitializationError = sdkInitializationError2;
                await2 = obj;
                com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError sdkInitializationError3 = (com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError) ((arrow.core.Either) await2).leftOrNull();
                if (sdkInitializationError != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Thales SDK initialization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("debugMessage", sdkInitializationError.getDebugMessage())), null, 4, null);
                }
                if (sdkInitializationError3 != null) {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Payair SDK initialization failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("debugMessage", sdkInitializationError3.getDebugMessage())), null, 4, null);
                }
                if (sdkInitializationError != null && sdkInitializationError3 != null) {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "All SDK initializations failed", null, null, null, 14, null);
                    java.lang.String debugMessage = sdkInitializationError.getDebugMessage();
                    java.lang.String debugMessage2 = sdkInitializationError3.getDebugMessage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Both SDKs failed - Thales: ");
                    sb.append(debugMessage);
                    sb.append(", Payair: ");
                    sb.append(debugMessage2);
                    return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError(sb.toString(), null, 2, null));
                }
                return arrow.core.EitherKt.right(kotlin.Unit.INSTANCE);
            }
            async$default2 = (kotlinx.coroutines.Deferred) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.Deferred deferred = (kotlinx.coroutines.Deferred) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
            async$default = deferred;
            await = obj;
        }
        sdkInitializationError = (com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError) ((arrow.core.Either) await).leftOrNull();
        this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(coroutineScope);
        this.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(async$default2);
        this.Camera2StreamConfigurationMap = sdkInitializationError;
        this.getInputSizeshNQ4ISI = 2;
        await2 = async$default2.await(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, ? extends kotlin.Unit>> continuation) {
        return ((com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2 compositeSdkInitializer$init$2 = new com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2(this.getOutputMinFrameDuration, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        compositeSdkInitializer$init$2.getOutputFormats = obj;
        return compositeSdkInitializer$init$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompositeSdkInitializer$init$2(com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer compositeSdkInitializer, java.lang.Class<? extends android.app.Activity> cls, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.sdk.CompositeSdkInitializer$init$2> continuation) {
        super(2, continuation);
        this.getOutputMinFrameDuration = compositeSdkInitializer;
        this.getHighSpeedVideoSizes = cls;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
