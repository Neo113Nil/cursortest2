package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$signUpWithGoogle$1", f = "UserVerificationViewModel.kt", i = {1, 1, 1, 1, 1, 1}, l = {299, 300}, m = "invokeSuspend", n = {"this_$iv", "it$iv", "success", "$i$f$onRight", "$i$a$-also-Either$onRight$1$iv", "$i$a$-onRight-UserVerificationViewModel$signUpWithGoogle$1$1"}, nl = {300, 803}, s = {"L$0", "L$2", "L$3", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes13.dex */
final class UserVerificationViewModel$signUpWithGoogle$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
    
        if (r6 != r0) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0090  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.identity.userverification.domain.usecase.FetchGoogleSignUpDetailsUseCase fetchGoogleSignUpDetailsUseCase;
        arrow.core.Either either;
        arrow.core.Either either2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoSizesFor.accessartificialFrame;
            mutableStateFlow.setValue(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Loading.INSTANCE);
            fetchGoogleSignUpDetailsUseCase = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes;
            this.getInputFormats = 1;
            obj = fetchGoogleSignUpDetailsUseCase.invoke(this.Camera2StreamConfigurationMap, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                either2 = (arrow.core.Either) this.getOutputMinFrameDuration;
                kotlin.ResultKt.throwOnFailure(obj);
                either = either2;
                com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel = this.getHighSpeedVideoSizesFor;
                if (either.isLeft()) {
                    com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$handleGoogleSignUpError(userVerificationViewModel, (com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpError) ((arrow.core.Either.Left) either).getValue());
                }
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        either = (arrow.core.Either) obj;
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel2 = this.getHighSpeedVideoSizesFor;
        if (either.isRight()) {
            com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails googleSignUpDetails = (com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails) ((arrow.core.Either.Right) either).getValue();
            this.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputMinFrameDuration = either;
            this.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(googleSignUpDetails);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighResolutionOutputSizeshNQ4ISI = 0;
            this.getHighSpeedVideoFpsRanges = 0;
            this.getInputFormats = 2;
            if (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.access$handleGoogleSignUpDetails(userVerificationViewModel2, googleSignUpDetails, this) != coroutine_suspended) {
                either2 = either;
                either = either2;
            }
            return coroutine_suspended;
        }
        com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel3 = this.getHighSpeedVideoSizesFor;
        if (either.isLeft()) {
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$signUpWithGoogle$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$signUpWithGoogle$1(this.getHighSpeedVideoSizesFor, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserVerificationViewModel$signUpWithGoogle$1(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel userVerificationViewModel, android.content.Context context, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel$signUpWithGoogle$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizesFor = userVerificationViewModel;
        this.Camera2StreamConfigurationMap = context;
    }
}
