package com.paypal.oslo.feature.activity.ui.search.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1", f = "ActivitySearchFilterCompose.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, nl = {108}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1$1", f = "ActivitySearchFilterCompose.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            boolean booleanValue;
            com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect activitySearchUiEffect = (com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (!(activitySearchUiEffect instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateBack)) {
                if (activitySearchUiEffect instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen) {
                    this.getHighSpeedVideoFpsRanges.invokeAction$activity_prodRelease(((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.NavigateToActivityDetailScreen) activitySearchUiEffect).getActivityTransactionModel(), null);
                } else if (activitySearchUiEffect instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction) {
                    this.getHighSpeedVideoFpsRanges.invokeAction$activity_prodRelease(null, ((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleSearchResultPrimaryAction) activitySearchUiEffect).getPrimaryActionModel());
                } else {
                    if (!(activitySearchUiEffect instanceof com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoFpsRanges.navigateByNavigationType$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation(((com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect.HandleXoomTransactionTileAction) activitySearchUiEffect).getDestinationKey()));
                }
            } else {
                com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel = this.getHighSpeedVideoFpsRanges;
                booleanValue = ((java.lang.Boolean) this.getHighSpeedVideoFpsRangesFor.getValue()).booleanValue();
                activitySearchViewModel.navigateBack$activity_prodRelease(booleanValue);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiEffect activitySearchUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1.AnonymousClass1) create(activitySearchUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighResolutionOutputSizeshNQ4ISI = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = activitySearchViewModel;
            this.getHighSpeedVideoFpsRangesFor = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect$activity_prodRelease(), new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = activitySearchViewModel;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
