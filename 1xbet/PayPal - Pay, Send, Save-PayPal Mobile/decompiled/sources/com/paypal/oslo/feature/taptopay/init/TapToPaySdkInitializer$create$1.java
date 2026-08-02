package com.paypal.oslo.feature.taptopay.init;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.init.TapToPaySdkInitializer$create$1", f = "TapToPaySdkInitializer.kt", i = {1}, l = {62, 69}, m = "invokeSuspend", n = {"baseUrl"}, nl = {63, 72}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class TapToPaySdkInitializer$create$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.init.CompanionSyncPolicy getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        if (r11 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0032, code lost:
    
        if (r10.getHighResolutionOutputSizeshNQ4ISI.awaitSync(r10.Camera2StreamConfigurationMap, r10) != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Class<?> cls;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Right) {
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "TapToPay SDK initialization completed successfully", null, null, 6, null);
                } else if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError sdkInitializationError = (com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.taptopay.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[2];
                    pairArr[0] = kotlin.TuplesKt.to("error", sdkInitializationError.getDebugMessage());
                    java.lang.Throwable throwable = sdkInitializationError.getThrowable();
                    pairArr[1] = kotlin.TuplesKt.to("errorType", (throwable == null || (cls = throwable.getClass()) == null) ? null : cls.getSimpleName());
                    com.paypal.android.logger.Logger.w$default(logger, "TapToPay SDK initialization failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.String baseUrl = this.Camera2StreamConfigurationMap.getBaseUrl();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(baseUrl);
        sb.append("/v1/device-tokens");
        java.lang.String obj2 = sb.toString();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "Starting TapToPay SDK initialization", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("baseUrl", obj2)), null, 4, null);
        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(obj2);
        this.getHighSpeedVideoFpsRanges = 2;
        obj = this.getHighSpeedVideoFpsRangesFor.init(com.paypal.oslo.feature.taptopay.ui.paymode.PayModeActivity.class, obj2, this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.taptopay.init.TapToPaySdkInitializer$create$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.init.TapToPaySdkInitializer$create$1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPaySdkInitializer$create$1(com.paypal.oslo.feature.taptopay.init.CompanionSyncPolicy companionSyncPolicy, com.paypal.oslo.core.remoteconfig.config.RemoteConfigConfig remoteConfigConfig, com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer sdkInitializer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.init.TapToPaySdkInitializer$create$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = companionSyncPolicy;
        this.Camera2StreamConfigurationMap = remoteConfigConfig;
        this.getHighSpeedVideoFpsRangesFor = sdkInitializer;
    }
}
