package com.paypal.oslo.feature.userprofile.ui.viewmodel;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$deleteEmail$1", f = "DeleteEmailViewModel.kt", i = {1, 1, 1, 1}, l = {73, 83}, m = "invokeSuspend", n = {"this_$iv", "error", "$i$f$fold", "$i$a$-fold-DeleteEmailViewModel$deleteEmail$1$1"}, nl = {121, 84}, s = {"L$0", "L$1", "I$0", "I$1"}, v = 2)
/* loaded from: classes15.dex */
final class DeleteEmailViewModel$deleteEmail$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel getOutputFormats;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ee, code lost:
    
        if (com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel.access$handleError(r5, r3, r14) == r0) goto L24;
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
        com.paypal.oslo.feature.userprofile.domain.usecase.RemoveEmailUseCase removeEmailUseCase;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow4;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow5;
        kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow6;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            mutableStateFlow = this.getOutputFormats.getHighSpeedVideoFpsRanges;
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
            mutableStateFlow2 = this.getOutputFormats.getHighSpeedVideoSizesFor;
            mutableStateFlow2.setValue(null);
            mutableStateFlow3 = this.getOutputFormats.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow3.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            removeEmailUseCase = this.getOutputFormats.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizesFor = 1;
            obj = removeEmailUseCase.invoke(this.getHighSpeedVideoSizes, this);
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
        java.lang.String str = this.getHighSpeedVideoSizes;
        com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel = this.getOutputFormats;
        if (either instanceof arrow.core.Either.Right) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Email deleted successfully", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", str)), null, 4, null);
            mutableStateFlow5 = deleteEmailViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow5.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            mutableStateFlow6 = deleteEmailViewModel.getHighSpeedVideoFpsRangesFor;
            mutableStateFlow6.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true));
        } else if (either instanceof arrow.core.Either.Left) {
            com.paypal.oslo.feature.userprofile.domain.model.email.EmailError emailError = (com.paypal.oslo.feature.userprofile.domain.model.email.EmailError) ((arrow.core.Either.Left) either).getValue();
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to delete email", null, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("emailId", str)), 2, null);
            com.paypal.oslo.feature.userprofile.ui.analytics.UserProfileTracking.INSTANCE.getEmail().trackEmailError(emailError, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.SCREEN_DELETE_EMAIL, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.EmailManagement.ErrorCodes.DELETE_FAILED);
            mutableStateFlow4 = deleteEmailViewModel.getHighSpeedVideoFpsRanges;
            mutableStateFlow4.setValue(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false));
            this.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
            this.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(emailError);
            this.getHighSpeedVideoFpsRangesFor = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getHighSpeedVideoSizesFor = 2;
        } else {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$deleteEmail$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$deleteEmail$1(this.getOutputFormats, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeleteEmailViewModel$deleteEmail$1(com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel deleteEmailViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.userprofile.ui.viewmodel.DeleteEmailViewModel$deleteEmail$1> continuation) {
        super(2, continuation);
        this.getOutputFormats = deleteEmailViewModel;
        this.getHighSpeedVideoSizes = str;
    }
}
