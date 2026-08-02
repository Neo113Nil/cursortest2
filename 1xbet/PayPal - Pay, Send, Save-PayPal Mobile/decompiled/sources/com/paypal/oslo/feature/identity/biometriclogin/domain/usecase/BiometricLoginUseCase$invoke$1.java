package com.paypal.oslo.feature.identity.biometriclogin.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/paypal/oslo/feature/identity/biometriclogin/domain/usecase/BiometricLoginState;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$invoke$1", f = "BiometricLoginUseCase.kt", i = {0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 8, 8}, l = {95, 96, 106, 113, 114, 116, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "this_$iv", "it$iv", "error", "$i$f$onLeft", "$i$a$-also-Either$onLeft$1$iv", "$i$a$-onLeft-BiometricLoginUseCase$invoke$1$1", "$this$flow", "nonce", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-BiometricLoginUseCase$invoke$1$lockedSignature$1", "$this$flow", "nonce", "lockedSignature", "$this$flow", "nonce", "lockedSignature", "$this$flow", "nonce", "lockedSignature", "this_$iv", "error", "$i$f$fold", "$i$a$-fold-BiometricLoginUseCase$invoke$1$unlockedSignature$1", "$this$flow", "nonce", "lockedSignature", "unlockedSignature", "$this$flow", "nonce", "lockedSignature", "unlockedSignature", "$this$flow", "nonce", "lockedSignature", "unlockedSignature", "serverResult"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, 97, 107, 114, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 117, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 125}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes12.dex */
final class BiometricLoginUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.fragment.app.FragmentActivity getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    private /* synthetic */ java.lang.Object getOutputSizes;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01b9, code lost:
    
        if (r0.emit(r9, r8) != r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x018c, code lost:
    
        if (r9 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01f9, code lost:
    
        if (r0.emit(r6, r8) != r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013f, code lost:
    
        if (r9 == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f3, code lost:
    
        if (r0.emit(r4, r8) != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0239, code lost:
    
        if (r0.emit(r5, r8) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b6, code lost:
    
        if (r9 != r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.identity.biometriclogin.domain.repository.BiometricEligibilityRepository biometricEligibilityRepository;
        java.security.Signature signature;
        java.lang.String str;
        com.paypal.oslo.feature.identity.biometriclogin.domain.BiometricAuthenticator biometricAuthenticator;
        java.security.Signature signature2;
        java.security.Signature signature3;
        kotlinx.coroutines.flow.FlowCollector flowCollector = (kotlinx.coroutines.flow.FlowCollector) this.getOutputSizes;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.getOutputFormats) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                biometricEligibilityRepository = this.getHighSpeedVideoSizesFor.Camera2StreamConfigurationMap;
                this.getOutputSizes = flowCollector;
                this.getOutputFormats = 1;
                obj = biometricEligibilityRepository.isEligibleForLogin(this);
                break;
            case 1:
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either = (arrow.core.Either) obj;
                if (either.isLeft()) {
                    com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError biometricLoginError = (com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError) ((arrow.core.Either.Left) either).getValue();
                    com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed failed = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed(biometricLoginError);
                    this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(biometricLoginError);
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.Camera2StreamConfigurationMap = 0;
                    this.getOutputFormats = 2;
                    break;
                } else {
                    java.lang.String generateNonce = com.paypal.oslo.feature.identity.devicebinding.security.utils.NonceUtilsKt.generateNonce();
                    arrow.core.Either access$createLockedSignature = com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase.access$createLockedSignature(this.getHighSpeedVideoSizesFor);
                    if (access$createLockedSignature instanceof arrow.core.Either.Right) {
                        signature = (java.security.Signature) ((arrow.core.Either.Right) access$createLockedSignature).getValue();
                        this.getOutputSizes = flowCollector;
                        this.getHighSpeedVideoSizes = generateNonce;
                        this.getInputSizeshNQ4ISI = signature;
                        this.getOutputFormats = 4;
                        if (flowCollector.emit(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.AuthenticatingBiometric.INSTANCE, this) != coroutine_suspended) {
                            str = generateNonce;
                            biometricAuthenticator = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
                            this.getOutputSizes = flowCollector;
                            this.getHighSpeedVideoSizes = str;
                            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature);
                            this.getOutputFormats = 5;
                            obj = biometricAuthenticator.authenticate(this.getHighSpeedVideoFpsRangesFor, signature, this);
                            break;
                        }
                    } else {
                        if (!(access$createLockedSignature instanceof arrow.core.Either.Left)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError biometricLoginError2 = (com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError) ((arrow.core.Either.Left) access$createLockedSignature).getValue();
                        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed failed2 = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed(biometricLoginError2);
                        this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(generateNonce);
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(access$createLockedSignature);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(biometricLoginError2);
                        this.getHighResolutionOutputSizeshNQ4ISI = 0;
                        this.getHighSpeedVideoFpsRanges = 0;
                        this.getOutputFormats = 3;
                        break;
                    }
                }
                return coroutine_suspended;
            case 2:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 3:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 4:
                signature = (java.security.Signature) this.getInputSizeshNQ4ISI;
                str = (java.lang.String) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                biometricAuthenticator = this.getHighSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI;
                this.getOutputSizes = flowCollector;
                this.getHighSpeedVideoSizes = str;
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature);
                this.getOutputFormats = 5;
                obj = biometricAuthenticator.authenticate(this.getHighSpeedVideoFpsRangesFor, signature, this);
                break;
            case 5:
                signature = (java.security.Signature) this.getInputSizeshNQ4ISI;
                str = (java.lang.String) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                arrow.core.Either either2 = (arrow.core.Either) obj;
                if (either2 instanceof arrow.core.Either.Right) {
                    java.security.Signature signature4 = (java.security.Signature) ((arrow.core.Either.Right) either2).getValue();
                    this.getOutputSizes = flowCollector;
                    this.getHighSpeedVideoSizes = str;
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature);
                    this.getOutputMinFrameDuration = signature4;
                    this.getOutputFormats = 7;
                    if (flowCollector.emit(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.VerifyingWithServer.INSTANCE, this) != coroutine_suspended) {
                        signature2 = signature;
                        signature3 = signature4;
                        this.getOutputSizes = flowCollector;
                        this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                        this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature2);
                        this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature3);
                        this.getOutputFormats = 8;
                        obj = com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase.access$verifyWithServer(this.getHighSpeedVideoSizesFor, signature3, str, this);
                        break;
                    }
                } else {
                    if (!(either2 instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError biometricLoginError3 = (com.paypal.oslo.feature.identity.biometriclogin.domain.model.BiometricLoginError) ((arrow.core.Either.Left) either2).getValue();
                    com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed failed3 = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState.Failed(biometricLoginError3);
                    this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                    this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature);
                    this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either2);
                    this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(biometricLoginError3);
                    this.getHighResolutionOutputSizeshNQ4ISI = 0;
                    this.getHighSpeedVideoFpsRanges = 0;
                    this.getOutputFormats = 6;
                    break;
                }
                return coroutine_suspended;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            case 7:
                signature3 = (java.security.Signature) this.getOutputMinFrameDuration;
                signature2 = (java.security.Signature) this.getInputSizeshNQ4ISI;
                str = (java.lang.String) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                this.getOutputSizes = flowCollector;
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature2);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature3);
                this.getOutputFormats = 8;
                obj = com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase.access$verifyWithServer(this.getHighSpeedVideoSizesFor, signature3, str, this);
                break;
            case 8:
                signature3 = (java.security.Signature) this.getOutputMinFrameDuration;
                signature2 = (java.security.Signature) this.getInputSizeshNQ4ISI;
                str = (java.lang.String) this.getHighSpeedVideoSizes;
                kotlin.ResultKt.throwOnFailure(obj);
                com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState biometricLoginState = (com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState) obj;
                this.getOutputSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(flowCollector);
                this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature2);
                this.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(signature3);
                this.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(biometricLoginState);
                this.getOutputFormats = 9;
                break;
            case 9:
                kotlin.ResultKt.throwOnFailure(obj);
                return kotlin.Unit.INSTANCE;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginState> flowCollector, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$invoke$1) create(flowCollector, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$invoke$1 biometricLoginUseCase$invoke$1 = new com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$invoke$1(this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoFpsRangesFor, continuation);
        biometricLoginUseCase$invoke$1.getOutputSizes = obj;
        return biometricLoginUseCase$invoke$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BiometricLoginUseCase$invoke$1(com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase biometricLoginUseCase, androidx.fragment.app.FragmentActivity fragmentActivity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.biometriclogin.domain.usecase.BiometricLoginUseCase$invoke$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = biometricLoginUseCase;
        this.getHighSpeedVideoFpsRangesFor = fragmentActivity;
    }
}
