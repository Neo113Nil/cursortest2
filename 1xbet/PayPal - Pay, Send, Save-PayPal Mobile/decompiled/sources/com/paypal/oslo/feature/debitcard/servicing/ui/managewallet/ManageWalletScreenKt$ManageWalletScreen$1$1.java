package com.paypal.oslo.feature.debitcard.servicing.ui.managewallet;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1", f = "ManageWalletScreen.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, nl = {126}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class ManageWalletScreenKt$ManageWalletScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ java.lang.String getInputSizeshNQ4ISI;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ java.lang.String getHighSpeedVideoSizes;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect manageWalletEffect = (com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect) obj;
            if (manageWalletEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.NavigateBack) {
                this.getHighResolutionOutputSizeshNQ4ISI.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (!(manageWalletEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletLockedToast)) {
                if (!(manageWalletEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletUnlockedToast)) {
                    if (!(manageWalletEffect instanceof com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.mvi.ManageWalletEffect.ShowWalletRemovedToast)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    this.getHighSpeedVideoFpsRanges.setValue(this.getHighSpeedVideoSizes);
                } else {
                    this.getHighSpeedVideoFpsRanges.setValue(this.Camera2StreamConfigurationMap);
                }
            } else {
                this.getHighSpeedVideoFpsRanges.setValue(this.getHighSpeedVideoFpsRangesFor);
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.compose.runtime.MutableState<java.lang.String> mutableState) {
            this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.Camera2StreamConfigurationMap = str2;
            this.getHighSpeedVideoSizes = str3;
            this.getHighSpeedVideoFpsRanges = mutableState;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getInputFormats = 1;
            if (this.getHighSpeedVideoFpsRangesFor.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ManageWalletScreenKt$ManageWalletScreen$1$1(com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.viewmodel.ManageWalletViewModel manageWalletViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, java.lang.String str2, java.lang.String str3, androidx.compose.runtime.MutableState<java.lang.String> mutableState, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managewallet.ManageWalletScreenKt$ManageWalletScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = manageWalletViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
        this.Camera2StreamConfigurationMap = str;
        this.getInputSizeshNQ4ISI = str2;
        this.getHighSpeedVideoSizes = str3;
        this.getHighSpeedVideoFpsRanges = mutableState;
    }
}
