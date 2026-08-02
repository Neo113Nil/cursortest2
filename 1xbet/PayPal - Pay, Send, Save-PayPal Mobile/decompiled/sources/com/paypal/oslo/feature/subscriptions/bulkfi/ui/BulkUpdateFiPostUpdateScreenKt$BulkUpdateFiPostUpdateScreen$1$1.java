package com.paypal.oslo.feature.subscriptions.bulkfi.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1", f = "BulkUpdateFiPostUpdateScreen.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, nl = {119}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getHighSpeedVideoSizes;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "effect", "Lcom/paypal/oslo/feature/subscriptions/bulkfi/ui/model/BulkUpdateFiPostUpdateUiEffect;"}, k = 3, mv = {2, 3, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1$1", f = "BulkUpdateFiPostUpdateScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
    /* renamed from: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel Camera2StreamConfigurationMap;
        int getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ com.paypal.oslo.feature.subscriptions.api.domain.AgreementType getHighSpeedVideoFpsRangesFor;
        /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            final com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect bulkUpdateFiPostUpdateUiEffect = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect) this.getHighSpeedVideoSizes;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            if (bulkUpdateFiPostUpdateUiEffect instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToUpdateFi) {
                this.getHighSpeedVideoFpsRanges.m11575navigateForResultInternaluBl809w(this.Camera2StreamConfigurationMap.getUpdateFiRequestId(), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.subscriptions.updatefi.navigation.result.UpdateFiChangedNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (bulkUpdateFiPostUpdateUiEffect instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToDone) {
                r4.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$kta2d0yOlnzZWCUOCcVxEe3ugGs(com.paypal.oslo.core.navigation.AppNavigator.this, r2, r3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (bulkUpdateFiPostUpdateUiEffect instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToClose) {
                r4.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt.$r8$lambda$kta2d0yOlnzZWCUOCcVxEe3ugGs(com.paypal.oslo.core.navigation.AppNavigator.this, r2, r3, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(bulkUpdateFiPostUpdateUiEffect instanceof com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect bulkUpdateFiPostUpdateUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            navigationScope.goBackWithResult(((com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateBack) bulkUpdateFiPostUpdateUiEffect).getResult());
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect bulkUpdateFiPostUpdateUiEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToUpdateFi navigateToUpdateFi = (com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect.NavigateToUpdateFi) bulkUpdateFiPostUpdateUiEffect;
            navigationScope.push(new com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFIBottomSheetDestination(navigateToUpdateFi.getAgreementIds(), navigateToUpdateFi.getAgreementType(), navigateToUpdateFi.getPreferredFiId(), com.paypal.oslo.feature.subscriptions.shared.navigation.UpdateFiSource.BULK_FI_POST_UPDATE));
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.subscriptions.bulkfi.ui.model.BulkUpdateFiPostUpdateUiEffect bulkUpdateFiPostUpdateUiEffect, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1.AnonymousClass1) create(bulkUpdateFiPostUpdateUiEffect, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
            com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1.AnonymousClass1 anonymousClass1 = new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoSizes = obj;
            return anonymousClass1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel bulkUpdateFiPostUpdateViewModel, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1.AnonymousClass1> continuation) {
            super(2, continuation);
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.Camera2StreamConfigurationMap = bulkUpdateFiPostUpdateViewModel;
            this.getHighSpeedVideoFpsRangesFor = agreementType;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(this.getHighSpeedVideoFpsRangesFor.getUiEffect(), new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, null), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1(com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateViewModel bulkUpdateFiPostUpdateViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.subscriptions.api.domain.AgreementType agreementType, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.bulkfi.ui.BulkUpdateFiPostUpdateScreenKt$BulkUpdateFiPostUpdateScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = bulkUpdateFiPostUpdateViewModel;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = agreementType;
    }
}
