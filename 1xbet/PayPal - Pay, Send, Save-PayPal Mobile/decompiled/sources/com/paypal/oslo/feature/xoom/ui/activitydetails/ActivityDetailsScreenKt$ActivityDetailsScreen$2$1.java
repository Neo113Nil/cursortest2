package com.paypal.oslo.feature.xoom.ui.activitydetails;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/paypal/oslo/feature/xoom/navigation/result/AccountLinkingNavResult;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$2$1", f = "ActivityDetailsScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes16.dex */
final class ActivityDetailsScreenKt$ActivityDetailsScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.xoom.navigation.result.AccountLinkingNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRanges.onLoad(this.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.xoom.navigation.result.AccountLinkingNavResult accountLinkingNavResult, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$2$1) create(accountLinkingNavResult, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$2$1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityDetailsScreenKt$ActivityDetailsScreen$2$1(com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsViewModel activityDetailsViewModel, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.xoom.ui.activitydetails.ActivityDetailsScreenKt$ActivityDetailsScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = activityDetailsViewModel;
        this.Camera2StreamConfigurationMap = str;
    }
}
