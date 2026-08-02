package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel$makePrimaryEmail$1", f = "MakePrimaryEmailViewModel.kt", i = {1, 1, 1, 1}, l = {73, 83}, m = "invokeSuspend", n = {"this_$iv", "error", "$i$f$fold", "$i$a$-fold-MakePrimaryEmailViewModel$makePrimaryEmail$1$1"}, nl = {121, 84}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class MakePrimaryEmailViewModel$makePrimaryEmail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel getInputFormats;
    int getInputSizeshNQ4ISI;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ee, code lost:
    
        if (com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel.access$handleError(r5, r3, r14) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00fa, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r15 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryEmailUseCase makePrimaryEmailUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            mutableStateFlow2 = this.getInputFormats.getInputFormats;
            mutableStateFlow2.setValue(null);
            mutableStateFlow3 = this.getInputFormats.Camera2StreamConfigurationMap;
            mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            makePrimaryEmailUseCase = this.getInputFormats.getHighSpeedVideoFpsRangesFor;
            this.getInputSizeshNQ4ISI = 1;
            obj = makePrimaryEmailUseCase.invoke(this.getHighResolutionOutputSizeshNQ4ISI, this);
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
        java.lang.String str = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel = this.getInputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Email set as primary successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", str)), null, 4, null);
            mutableStateFlow5 = makePrimaryEmailViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow5.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            mutableStateFlow6 = makePrimaryEmailViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow6.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to make email primary", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", str)), 2, null);
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail().trackEmailError(emailError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_MAKE_PRIMARY_EMAIL, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.MAKE_PRIMARY, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.MAKE_PRIMARY_FAILED);
            mutableStateFlow4 = makePrimaryEmailViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.getHighSpeedVideoSizes = 0;
            this.getInputSizeshNQ4ISI = 2;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel$makePrimaryEmail$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel$makePrimaryEmail$1(this.getInputFormats, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakePrimaryEmailViewModel$makePrimaryEmail$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel makePrimaryEmailViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryEmailViewModel$makePrimaryEmail$1> continuation) {
        super(2, continuation);
        this.getInputFormats = makePrimaryEmailViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
    }
}
