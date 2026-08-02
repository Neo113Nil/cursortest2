package com.paypal.oslo.feature.cryptocurrency.ui.receive;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1", f = "CryptoReceiveScreen.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class CryptoReceiveScreenKt$CryptoReceiveScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizesFor;
    final /* synthetic */ java.lang.String getInputFormats;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getOutputFormats;
    final /* synthetic */ com.paypal.pds.components.BottomSheetController getOutputMinFrameDuration;
    int getOutputSizes;
    final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel getOutputStallDurationlomOqCM;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ androidx.compose.runtime.State<java.lang.String> Camera2StreamConfigurationMap;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.String> getHighSpeedVideoSizes;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getHighSpeedVideoSizesFor;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputFormats;
        final /* synthetic */ com.paypal.pds.components.BottomSheetController getInputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getOutputFormats;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getOutputMinFrameDuration;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect cryptoReceiveEffect = (com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect) obj;
            if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoReceiveEffect, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.NavigateBack.INSTANCE)) {
                this.getOutputMinFrameDuration.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1.AnonymousClass1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else if (cryptoReceiveEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard) {
                com.paypal.oslo.feature.cryptocurrency.ui.common.util.ContextExtensionsKt.copyToClipboard(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyToClipboard) cryptoReceiveEffect).getText(), this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoSizesFor.setValue(this.getHighResolutionOutputSizeshNQ4ISI);
            } else if (cryptoReceiveEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard) {
                com.paypal.oslo.feature.cryptocurrency.ui.common.util.ContextExtensionsKt.copyToClipboard(this.getHighSpeedVideoFpsRanges, ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.CopyMemoToClipboard) cryptoReceiveEffect).getText(), this.getHighSpeedVideoFpsRangesFor);
                this.getHighSpeedVideoSizesFor.setValue(this.getOutputFormats);
            } else if (cryptoReceiveEffect instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShareAddress) {
                com.paypal.oslo.feature.cryptocurrency.ui.common.util.ContextExtensionsKt.shareText(this.getHighSpeedVideoFpsRanges, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt.access$CryptoReceiveScreen$lambda$7(this.Camera2StreamConfigurationMap), com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt.access$CryptoReceiveScreen$lambda$6(this.getHighSpeedVideoSizes));
            } else if (kotlin.jvm.internal.Intrinsics.areEqual(cryptoReceiveEffect, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowHowReceivingWorksInfo.INSTANCE)) {
                this.getInputFormats.showSheet();
            } else {
                if (!kotlin.jvm.internal.Intrinsics.areEqual(cryptoReceiveEffect, com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEffect.ShowNetworkSelectionSheet.INSTANCE)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getInputSizeshNQ4ISI.showSheet();
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.State<java.lang.String> state, androidx.compose.runtime.State<java.lang.String> state2) {
            this.getOutputMinFrameDuration = appNavigator;
            this.getHighSpeedVideoFpsRanges = context;
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.getOutputFormats = str3;
            this.getInputFormats = bottomSheetController;
            this.getInputSizeshNQ4ISI = bottomSheetController2;
            this.getHighSpeedVideoSizesFor = mutableState;
            this.Camera2StreamConfigurationMap = state;
            this.getHighSpeedVideoSizes = state2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getOutputSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getOutputSizes = 1;
            if (this.getOutputStallDurationlomOqCM.getEffect().collect(new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1.AnonymousClass1(this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        throw new kotlin.KotlinNothingValueException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1(this.getOutputStallDurationlomOqCM, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getInputFormats, this.getOutputMinFrameDuration, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoReceiveScreenKt$CryptoReceiveScreen$1$1(com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel cryptoReceiveViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.pds.components.BottomSheetController bottomSheetController2, androidx.compose.runtime.MutableState<java.lang.String> mutableState, androidx.compose.runtime.State<java.lang.String> state, androidx.compose.runtime.State<java.lang.String> state2, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveScreenKt$CryptoReceiveScreen$1$1> continuation) {
        super(2, continuation);
        this.getOutputStallDurationlomOqCM = cryptoReceiveViewModel;
        this.getInputSizeshNQ4ISI = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.Camera2StreamConfigurationMap = str2;
        this.getInputFormats = str3;
        this.getOutputMinFrameDuration = bottomSheetController;
        this.getOutputFormats = bottomSheetController2;
        this.getHighSpeedVideoSizesFor = mutableState;
        this.getHighSpeedVideoSizes = state;
        this.getHighSpeedVideoFpsRanges = state2;
    }
}
