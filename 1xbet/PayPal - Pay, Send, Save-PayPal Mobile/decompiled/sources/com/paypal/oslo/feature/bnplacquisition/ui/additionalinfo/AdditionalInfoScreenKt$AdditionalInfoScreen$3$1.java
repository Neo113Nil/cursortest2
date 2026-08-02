package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1", f = "AdditionalInfoScreen.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, nl = {131}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class AdditionalInfoScreenKt$AdditionalInfoScreen$3$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect additionalInfoUiEffect = (com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(additionalInfoUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.NavigateBack.INSTANCE)) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(additionalInfoUiEffect, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.CloseAcquisition.INSTANCE)) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(additionalInfoUiEffect instanceof com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.NavigateToReviewTerms)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoSizes.setReviewTermsData(((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiEffect.NavigateToReviewTerms) additionalInfoUiEffect).getReviewTermsData());
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.popWhileInstanceOf(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.api.navigation.BnplAcquisitionFlowDestination.class));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.bnplacquisition.navigation.ReviewTermsDestination((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 7, (kotlin.jvm.internal.DefaultConstructorMarker) null));
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoSizes = bnplAcquisitionSharedViewModel;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.getHighResolutionOutputSizeshNQ4ISI.getUiEffect().collect(new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1.AnonymousClass1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdditionalInfoScreenKt$AdditionalInfoScreen$3$1(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel additionalInfoViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.bnplacquisition.ui.shared.BnplAcquisitionSharedViewModel bnplAcquisitionSharedViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoScreenKt$AdditionalInfoScreen$3$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = additionalInfoViewModel;
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = bnplAcquisitionSharedViewModel;
    }
}
