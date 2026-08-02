package com.paypal.oslo.feature.identity.passkey.management.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel$createPasskey$1", f = "PasskeyEnrollmentViewModel.kt", i = {1, 1, 1, 1, 1}, l = {110, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m = "invokeSuspend", n = {"createResult", "this_$iv", "success", "$i$f$fold", "$i$a$-fold-PasskeyEnrollmentViewModel$createPasskey$1$3"}, nl = {115, 134}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyEnrollmentViewModel$createPasskey$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e2, code lost:
    
        if (r1.send(r4, r11) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0146, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007e, code lost:
    
        if (r12 != r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        java.lang.Object value;
        com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        java.lang.Object value2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        java.lang.Object value3;
        kotlinx.coroutines.channels.Channel channel;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputFormats.Camera2StreamConfigurationMap;
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(value, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Enrolling(null, 1, null)));
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.identity.LoggerKt.log, "Starting passkey creation", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("hasPublicCredential", java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor != null))), null, 4, null);
            passkeyCreateUseCase = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            this.getInputSizeshNQ4ISI = 1;
            obj = passkeyCreateUseCase.invoke(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyFlowVariant.APP_SETTINGS, this.getHighSpeedVideoFpsRangesFor, this);
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
        arrow.core.Either either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel = this.getOutputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess passkeyCreateSuccess = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateSuccess) ((arrow.core.Either.Right) either).getValue();
            com.paypal.oslo.feature.identity.LoggerKt.log.i("Passkey created successfully", kotlin.collections.MapsKt.emptyMap(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("credentialId", passkeyCreateSuccess.getPasskeyCredentialId())));
            mutableStateFlow3 = passkeyEnrollmentViewModel.Camera2StreamConfigurationMap;
            do {
                value3 = mutableStateFlow3.getValue();
            } while (!mutableStateFlow3.compareAndSet(value3, com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Idle.INSTANCE));
            channel = passkeyEnrollmentViewModel.getHighSpeedVideoSizes;
            com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiEffect.EnrollmentSuccess enrollmentSuccess = com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiEffect.EnrollmentSuccess.INSTANCE;
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(passkeyCreateSuccess);
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getInputSizeshNQ4ISI = 2;
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError passkeyCreateError = (com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.model.PasskeyCreateError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.identity.LoggerKt.log;
            kotlin.Pair[] pairArr = new kotlin.Pair[2];
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(passkeyCreateError.getClass()).getSimpleName();
            if (simpleName == null) {
                simpleName = "";
            }
            pairArr[0] = kotlin.TuplesKt.to("errorType", simpleName);
            pairArr[1] = kotlin.TuplesKt.to("error", passkeyCreateError.toString());
            com.paypal.android.logger.Logger.w$default(logger, "Passkey creation failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
            mutableStateFlow2 = passkeyEnrollmentViewModel.Camera2StreamConfigurationMap;
            do {
                value2 = mutableStateFlow2.getValue();
            } while (!mutableStateFlow2.compareAndSet(value2, new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentUiState.Error(passkeyCreateError)));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel$createPasskey$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel$createPasskey$1(this.getOutputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyEnrollmentViewModel$createPasskey$1(com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel passkeyEnrollmentViewModel, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.ui.PasskeyEnrollmentViewModel$createPasskey$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = passkeyEnrollmentViewModel;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = context;
    }
}
