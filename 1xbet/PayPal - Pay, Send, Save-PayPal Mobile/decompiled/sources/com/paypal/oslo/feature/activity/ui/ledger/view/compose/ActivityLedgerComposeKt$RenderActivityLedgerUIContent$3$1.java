package com.paypal.oslo.feature.activity.ui.ledger.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1", f = "ActivityLedgerCompose.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, nl = {163}, s = {}, v = 2)
/* loaded from: classes10.dex */
final class ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1$1", f = "ActivityLedgerCompose.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect activityLedgerUiEffect = (com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.Camera2StreamConfigurationMap != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen) {
                this.getHighSpeedVideoFpsRangesFor.fetchActivityLedgerItems$activity_prodRelease(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.ReLoadInitialLedgerScreen) activityLedgerUiEffect).getFilterType());
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied) {
                this.getHighSpeedVideoFpsRangesFor.fetchActivityLedgerItems$activity_prodRelease(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterApplied) activityLedgerUiEffect).getFilterType());
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.TriggerFilterCleared) {
                this.getHighSpeedVideoFpsRangesFor.fetchActivityLedgerItems$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null));
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen) {
                this.getHighSpeedVideoFpsRangesFor.invokeAction$activity_prodRelease(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToActivityDetailScreen) activityLedgerUiEffect).getActivityTransactionModel(), null);
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction) {
                this.getHighSpeedVideoFpsRangesFor.invokeAction$activity_prodRelease(null, ((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleActivityTransactionPrimaryAction) activityLedgerUiEffect).getPrimaryActionModel());
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToSearchScreen) {
                this.getHighSpeedVideoFpsRangesFor.navigateToSearchScreen$activity_prodRelease();
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen) {
                com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.m11865navigateByNavigationTypeVU73JmE$activity_prodRelease$default(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingNavigation(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPackageDetailScreen) activityLedgerUiEffect).getDestinationKey()), null, 2, null);
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen) {
                com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.m11865navigateByNavigationTypeVU73JmE$activity_prodRelease$default(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PromotionalRewardNavigation(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.NavigateToPromotionalRewardScreen) activityLedgerUiEffect).getDestinationKey()), null, 2, null);
            } else if (activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed) {
                com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.m11865navigateByNavigationTypeVU73JmE$activity_prodRelease$default(this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandleXoomActivityTransactionTilePressed) activityLedgerUiEffect).getDestinationKey()), null, 2, null);
            } else {
                if (!(activityLedgerUiEffect instanceof com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRangesFor.m11869navigateByNavigationTypeVU73JmE$activity_prodRelease(new com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.PackageTrackingLinkEmailNavigation(((com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect.HandlePackageTrackingLinkEmailPressed) activityLedgerUiEffect).getDestinationKey()), this.getHighSpeedVideoFpsRangesFor.getNavPackageTrackingRequestId());
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerUiEffect activityLedgerUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1.AnonymousClass1) create(activityLedgerUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRangesFor = activityLedgerViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoSizes.getLedgerScreenUIEffect$activity_prodRelease(), new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1.AnonymousClass1(this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1(this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.activity.ui.ledger.view.compose.ActivityLedgerComposeKt$RenderActivityLedgerUIContent$3$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = activityLedgerViewModel;
    }
}
