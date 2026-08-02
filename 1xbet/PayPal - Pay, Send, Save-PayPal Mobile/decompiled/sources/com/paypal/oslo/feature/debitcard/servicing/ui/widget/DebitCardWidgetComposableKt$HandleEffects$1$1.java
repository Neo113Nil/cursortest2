package com.paypal.oslo.feature.debitcard.servicing.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1", f = "DebitCardWidgetComposable.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, nl = {147}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardWidgetComposableKt$HandleEffects$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect debitCardWidgetEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect) obj;
            if (debitCardWidgetEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement) {
                com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName productName = ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardManagement) debitCardWidgetEffect).getProductName();
                if (productName == com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName.UNKNOWN) {
                    productName = null;
                }
                if (productName == null) {
                    productName = this.getHighSpeedVideoSizes.getProductName();
                }
                java.lang.Object m14539access$navigateWithOptionalResultiPWDtZM = com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.m14539access$navigateWithOptionalResultiPWDtZM(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardServicingDestination(productName, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.debitcard.api.navigation.result.DebitCardActivationResultType) null, (com.paypal.oslo.feature.debitcard.api.navigation.DebitCardAcquisitionOnArrivalAction) null, (com.paypal.oslo.feature.debitcard.api.model.DebitCardPostEnrollmentAction) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null), continuation);
                return m14539access$navigateWithOptionalResultiPWDtZM == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m14539access$navigateWithOptionalResultiPWDtZM : kotlin.Unit.INSTANCE;
            }
            if (debitCardWidgetEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow) {
                final androidx.navigation3.runtime.NavKey destinationKey = ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToAcquisitionFlow) debitCardWidgetEffect).getDestinationKey();
                if (destinationKey != null) {
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.debitcard.LoggerKt.log, "Acquisition flow destination is null, cannot navigate", null, null, null, 14, null);
                }
            } else {
                if (debitCardWidgetEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow) {
                    java.lang.Object m14539access$navigateWithOptionalResultiPWDtZM2 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.m14539access$navigateWithOptionalResultiPWDtZM(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.debitcard.servicing.di.DebitCardActivationRouterDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToActivateCardFlow) debitCardWidgetEffect).getDebitCardActivationInfo()), continuation);
                    return m14539access$navigateWithOptionalResultiPWDtZM2 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m14539access$navigateWithOptionalResultiPWDtZM2 : kotlin.Unit.INSTANCE;
                }
                if (debitCardWidgetEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow) {
                    this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj2) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1.AnonymousClass1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                        }
                    });
                } else {
                    if (!(debitCardWidgetEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.Object m14539access$navigateWithOptionalResultiPWDtZM3 = com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt.m14539access$navigateWithOptionalResultiPWDtZM(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, new com.paypal.oslo.feature.debitcard.servicing.di.CardReplacementDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToCardReplacementFlow) debitCardWidgetEffect).getReplacementInfo()), continuation);
                    return m14539access$navigateWithOptionalResultiPWDtZM3 == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m14539access$navigateWithOptionalResultiPWDtZM3 : kotlin.Unit.INSTANCE;
                }
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(navKey);
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect debitCardWidgetEffect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.debitcard.cardacquisition.di.DebitCardAcquisitionIntroDestination(((com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetEffect.NavigateToBDMCAcquisitionFlow) debitCardWidgetEffect).getProductName()));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
            this.getHighSpeedVideoSizes = debitCardWidgetViewModel;
            this.getHighSpeedVideoFpsRanges = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = str;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DebitCardWidgetComposableKt$HandleEffects$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.widget.mvi.DebitCardWidgetViewModel debitCardWidgetViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.widget.DebitCardWidgetComposableKt$HandleEffects$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = debitCardWidgetViewModel;
        this.Camera2StreamConfigurationMap = appNavigator;
        this.getHighSpeedVideoSizes = str;
    }
}
