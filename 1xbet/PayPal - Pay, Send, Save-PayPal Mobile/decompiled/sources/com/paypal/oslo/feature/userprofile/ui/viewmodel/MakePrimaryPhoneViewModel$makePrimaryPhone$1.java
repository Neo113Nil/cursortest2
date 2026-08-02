package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel$makePrimaryPhone$1", f = "MakePrimaryPhoneViewModel.kt", i = {}, l = {48}, m = "invokeSuspend", n = {}, nl = {78}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class MakePrimaryPhoneViewModel$makePrimaryPhone$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
        com.paypal.oslo.feature.userprofile.domain.usecase.MakePrimaryPhoneUseCase makePrimaryPhoneUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow2;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow3;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            makePrimaryPhoneUseCase = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            obj = makePrimaryPhoneUseCase.invoke(this.getHighSpeedVideoFpsRanges, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        arrow.core.Either either = (arrow.core.Either) obj;
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel makePrimaryPhoneViewModel = this.getHighSpeedVideoFpsRangesFor;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Phone set as primary successfully", null, null, 6, null);
            mutableStateFlow4 = makePrimaryPhoneViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            mutableStateFlow5 = makePrimaryPhoneViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow5.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.userprofile.domain.model.PhoneError phoneError = (com.paypal.oslo.feature.userprofile.domain.model.PhoneError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("phoneId", str));
            kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", phoneError.toString()));
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getPhone().trackPhoneError(phoneError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.SCREEN_MAKE_PRIMARY_PHONE, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.MAKE_PRIMARY, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.PhoneManagement.ErrorCodes.MAKE_PRIMARY_FAILED);
            mutableStateFlow2 = makePrimaryPhoneViewModel.Camera2StreamConfigurationMap;
            mutableStateFlow2.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            mutableStateFlow3 = makePrimaryPhoneViewModel.getHighResolutionOutputSizeshNQ4ISI;
            mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel$makePrimaryPhone$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel$makePrimaryPhone$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakePrimaryPhoneViewModel$makePrimaryPhone$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel makePrimaryPhoneViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.MakePrimaryPhoneViewModel$makePrimaryPhone$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = makePrimaryPhoneViewModel;
        this.getHighSpeedVideoFpsRanges = str;
    }
}
