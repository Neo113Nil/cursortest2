package com.paypal.oslo.feature.activity.ui.widgetFullScreen.model;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "item"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1", f = "ActivityWidgetFullScreenViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) this.getHighSpeedVideoFpsRangesFor;
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.Camera2StreamConfigurationMap != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
            com.paypal.oslo.feature.activity.domain.base.utils.widget.ActivityWidgetDataTransformationUtils.INSTANCE.applyTransformationsToTransaction$activity_prodRelease(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData(), this.getHighResolutionOutputSizeshNQ4ISI.getTransformationConfig());
        }
        return activityItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1) create(activityItem, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1 activityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1 = new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        activityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1.getHighSpeedVideoFpsRangesFor = obj;
        return activityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1(com.paypal.oslo.feature.activity.api.widget.interfaces.IActivityWidgetDataTransformer iActivityWidgetDataTransformer, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel$filteredActivityItems$2$1$1$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = iActivityWidgetDataTransformer;
    }
}
