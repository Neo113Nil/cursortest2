package com.zettle.sdk.feature.taptopay.core;

@kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialise$1", f = "TapToPayEngineInteractor.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 241}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes17.dex */
final class TapToPayEngineInteractorImpl$initialise$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl.access$attestationLogin(r5.getHighSpeedVideoFpsRanges, r5.getHighSpeedVideoSizes, r5) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0079, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r6 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Context context;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl tapToPayEngineInteractorImpl = this.getHighSpeedVideoFpsRanges;
            com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit = this.Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialiseTapToPayEngine$2(tapToPayEngineInteractorImpl, configurationInit, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            this.getHighResolutionOutputSizeshNQ4ISI = 2;
        } else {
            com.zettle.sdk.feature.taptopay.core.attestation.Attestation attestation = this.getHighSpeedVideoFpsRanges.getAttestation();
            context = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI;
            attestation.action(new com.zettle.sdk.feature.taptopay.core.attestation.Attestation.Action.LogOut(context));
            com.zettle.sdk.core.log.LogKt.warn(this.getHighSpeedVideoFpsRanges, "Tap to pay engine not initialised", new com.zettle.sdk.core.NonFatalException(this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRangesFor(), "Configurations broken"));
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialise$1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
        return new com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialise$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TapToPayEngineInteractorImpl$initialise$1(com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl tapToPayEngineInteractorImpl, com.zettle.sdk.feature.taptopay.core.models.ConfigurationInit configurationInit, java.lang.String str, kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.core.TapToPayEngineInteractorImpl$initialise$1> continuation) {
        super(1, continuation);
        this.getHighSpeedVideoFpsRanges = tapToPayEngineInteractorImpl;
        this.Camera2StreamConfigurationMap = configurationInit;
        this.getHighSpeedVideoSizes = str;
    }
}
