package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1", f = "BulkUpdateFiEntryScreen.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, nl = {105}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.res.Resources getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function2<java.util.List<java.lang.String>, java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel>, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1$1", f = "BulkUpdateFiEntryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState Camera2StreamConfigurationMap;
        final /* synthetic */ kotlin.jvm.functions.Function2<java.util.List<java.lang.String>, java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel>, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        final /* synthetic */ android.content.res.Resources getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.String string;
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect bulkUpdateFiUiEffect = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoFpsRanges != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (bulkUpdateFiUiEffect instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi) {
                this.Camera2StreamConfigurationMap.clearToast();
                com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi navigateToUpdateFi = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.NavigateToUpdateFi) bulkUpdateFiUiEffect;
                this.getHighResolutionOutputSizeshNQ4ISI.invoke(navigateToUpdateFi.getAgreementIds(), navigateToUpdateFi.getAgreementsMap());
            } else {
                if (!(bulkUpdateFiUiEffect instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect.ShowMaxFiSelectedError) bulkUpdateFiUiEffect).getAgreementType(), com.paypal.oslo.feature.subscriptions.api.domain.AgreementType.Business.INSTANCE)) {
                    string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_max_selection_error_vaulted);
                } else {
                    string = this.getHighSpeedVideoFpsRangesFor.getString(com.paypal.oslo.feature.subscriptions.R.string.feature_subscriptions_bulk_update_fi_max_selection_error);
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                this.Camera2StreamConfigurationMap.showToast(string);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiUiEffect bulkUpdateFiUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1.AnonymousClass1) create(bulkUpdateFiUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1.AnonymousClass1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel>, kotlin.Unit> function2, android.content.res.Resources resources, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.Camera2StreamConfigurationMap = uiToastState;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
            this.getHighSpeedVideoFpsRangesFor = resources;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoSizes = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.Camera2StreamConfigurationMap.getUiEffect(), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiViewModel bulkUpdateFiViewModel, com.paypal.oslo.feature.subscriptions.shared.domain.UiToastState uiToastState, kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super java.util.Map<java.lang.String, com.paypal.oslo.feature.subscriptions.hub.ui.models.SubscriptionItemUiModel>, kotlin.Unit> function2, android.content.res.Resources resources, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiEntryScreenKt$BulkUpdateFiEntryScreen$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = bulkUpdateFiViewModel;
        this.getHighSpeedVideoFpsRangesFor = uiToastState;
        this.getHighSpeedVideoFpsRanges = function2;
        this.getHighResolutionOutputSizeshNQ4ISI = resources;
    }
}
