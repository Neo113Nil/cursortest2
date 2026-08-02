package com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1", f = "DebitCardManagementScreen.kt", i = {}, l = {324}, m = "invokeSuspend", n = {}, nl = {350}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DebitCardManagementScreenKt$DebitCardManagementScreen$11$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<kotlin.Pair<com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName, java.lang.String>> Camera2StreamConfigurationMap;
    int CoroutineDebuggingKt;
    final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel coroutineCreation;
    final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizes;
    final /* synthetic */ java.lang.String getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.pds.components.DropdownState getInputFormats;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getInputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputFormats;
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getOutputMinFrameDurationlomOqCM;
    final /* synthetic */ java.lang.String getOutputSizes;
    final /* synthetic */ java.lang.String getOutputSizeshNQ4ISI;
    final /* synthetic */ java.lang.String getOutputStallDuration;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputStallDurationlomOqCM;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> isOutputSupportedFor;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> isOutputSupportedForhNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> toString;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> unwrapAs;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
        final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel coroutineBoundary;
        final /* synthetic */ java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
        final /* synthetic */ java.lang.String getHighSpeedVideoFpsRangesFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<kotlin.Pair<com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName, java.lang.String>> getHighSpeedVideoSizes;
        final /* synthetic */ com.paypal.pds.components.DropdownState getHighSpeedVideoSizesFor;
        final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> getInputFormats;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getInputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getOutputFormats;
        final /* synthetic */ java.lang.String getOutputMinFrameDuration;
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getOutputMinFrameDurationlomOqCM;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getOutputSizes;
        final /* synthetic */ java.lang.String getOutputSizeshNQ4ISI;
        final /* synthetic */ java.lang.String getOutputStallDuration;
        final /* synthetic */ java.lang.String getOutputStallDurationlomOqCM;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.String> getValidOutputFormatsForInputhNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> isOutputSupportedFor;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> isOutputSupportedForhNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> toString;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> unwrapAs;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            com.paypal.oslo.core.navigation.AppNavigator appNavigator = this.getOutputMinFrameDurationlomOqCM;
            android.content.Context context = this.getHighSpeedVideoFpsRanges;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState access$DebitCardManagementScreen$lambda$1 = com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.access$DebitCardManagementScreen$lambda$1(this.getInputFormats);
            com.paypal.pds.components.DropdownState dropdownState = this.getHighSpeedVideoSizesFor;
            com.paypal.oslo.feature.debitcard.shared.ui.webview.utils.DebitCardWebViewUrlBuilder debitCardWebViewUrlBuilder = this.coroutineBoundary.getDebitCardWebViewUrlBuilder();
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.isOutputSupportedFor;
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2 = this.unwrapAs;
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3 = this.getOutputSizes;
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4 = this.toString;
            androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState5 = this.isOutputSupportedForhNQ4ISI;
            androidx.compose.runtime.MutableState<kotlin.Pair<com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName, java.lang.String>> mutableState6 = this.getHighSpeedVideoSizes;
            androidx.compose.runtime.MutableState<java.lang.String> mutableState7 = this.getInputSizeshNQ4ISI;
            java.lang.String str = this.getOutputSizeshNQ4ISI;
            java.lang.String str2 = this.getHighSpeedVideoFpsRangesFor;
            java.lang.String str3 = this.getOutputStallDurationlomOqCM;
            java.lang.String str4 = this.Camera2StreamConfigurationMap;
            java.lang.String str5 = this.getOutputStallDuration;
            java.lang.String str6 = this.getOutputMinFrameDuration;
            java.lang.String str7 = this.getOutputFormats;
            java.lang.String str8 = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.runtime.MutableState<java.lang.String> mutableState8 = this.getValidOutputFormatsForInputhNQ4ISI;
            com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt.m14414access$handleNavigationEffectxc7oF3o((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementEffect) obj, appNavigator, context, access$DebitCardManagementScreen$lambda$1, dropdownState, debitCardWebViewUrlBuilder, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, mutableState7, str, str2, str3, str4, str5, str6, str7, str8, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1.AnonymousClass1.Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState.this, (java.lang.String) obj2);
                }
            });
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            mutableState.setValue(str);
            return kotlin.Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, com.paypal.pds.components.DropdownState dropdownState, com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState5, androidx.compose.runtime.MutableState<kotlin.Pair<com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName, java.lang.String>> mutableState6, androidx.compose.runtime.MutableState<java.lang.String> mutableState7, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> state, androidx.compose.runtime.MutableState<java.lang.String> mutableState8) {
            this.getOutputMinFrameDurationlomOqCM = appNavigator;
            this.getHighSpeedVideoFpsRanges = context;
            this.getHighSpeedVideoSizesFor = dropdownState;
            this.coroutineBoundary = debitCardManagementViewModel;
            this.isOutputSupportedFor = mutableState;
            this.unwrapAs = mutableState2;
            this.getOutputSizes = mutableState3;
            this.toString = mutableState4;
            this.isOutputSupportedForhNQ4ISI = mutableState5;
            this.getHighSpeedVideoSizes = mutableState6;
            this.getInputSizeshNQ4ISI = mutableState7;
            this.getOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = str2;
            this.getOutputStallDurationlomOqCM = str3;
            this.Camera2StreamConfigurationMap = str4;
            this.getOutputStallDuration = str5;
            this.getOutputMinFrameDuration = str6;
            this.getOutputFormats = str7;
            this.getHighResolutionOutputSizeshNQ4ISI = str8;
            this.getInputFormats = state;
            this.getValidOutputFormatsForInputhNQ4ISI = mutableState8;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.CoroutineDebuggingKt;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.CoroutineDebuggingKt = 1;
            if (this.coroutineCreation.getUiEffect().collect(new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1.AnonymousClass1(this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.coroutineCreation, this.toString, this.getValidOutputFormatsForInputhNQ4ISI, this.getOutputStallDurationlomOqCM, this.isOutputSupportedFor, this.unwrapAs, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges, this.getOutputSizes, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.isOutputSupportedForhNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1(this.coroutineCreation, this.getOutputMinFrameDurationlomOqCM, this.getHighSpeedVideoFpsRangesFor, this.getInputFormats, this.toString, this.getValidOutputFormatsForInputhNQ4ISI, this.getOutputStallDurationlomOqCM, this.isOutputSupportedFor, this.unwrapAs, this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputStallDuration, this.getHighSpeedVideoFpsRanges, this.getOutputSizes, this.getOutputFormats, this.getHighSpeedVideoSizesFor, this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.isOutputSupportedForhNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DebitCardManagementScreenKt$DebitCardManagementScreen$11$1(com.paypal.oslo.feature.debitcard.servicing.ui.managecard.viewmodel.DebitCardManagementViewModel debitCardManagementViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, android.content.Context context, com.paypal.pds.components.DropdownState dropdownState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState3, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState4, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState5, androidx.compose.runtime.MutableState<kotlin.Pair<com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName, java.lang.String>> mutableState6, androidx.compose.runtime.MutableState<java.lang.String> mutableState7, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.debitcard.servicing.ui.managecard.mvi.DebitCardManagementState> state, androidx.compose.runtime.MutableState<java.lang.String> mutableState8, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.servicing.ui.managecard.components.DebitCardManagementScreenKt$DebitCardManagementScreen$11$1> continuation) {
        super(2, continuation);
        this.coroutineCreation = debitCardManagementViewModel;
        this.getOutputMinFrameDurationlomOqCM = appNavigator;
        this.getHighSpeedVideoFpsRangesFor = context;
        this.getInputFormats = dropdownState;
        this.toString = mutableState;
        this.getValidOutputFormatsForInputhNQ4ISI = mutableState2;
        this.getOutputStallDurationlomOqCM = mutableState3;
        this.isOutputSupportedFor = mutableState4;
        this.unwrapAs = mutableState5;
        this.Camera2StreamConfigurationMap = mutableState6;
        this.getInputSizeshNQ4ISI = mutableState7;
        this.getOutputSizeshNQ4ISI = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.getOutputStallDuration = str3;
        this.getHighSpeedVideoFpsRanges = str4;
        this.getOutputSizes = str5;
        this.getOutputFormats = str6;
        this.getHighSpeedVideoSizesFor = str7;
        this.getHighSpeedVideoSizes = str8;
        this.getOutputMinFrameDuration = state;
        this.isOutputSupportedForhNQ4ISI = mutableState8;
    }
}
