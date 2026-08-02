package com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1", f = "DataDeletionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DataDeletionScreenKt$DataDeletionScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState access$DataDeletionScreen$lambda$0 = com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt.access$DataDeletionScreen$lambda$0(this.getHighResolutionOutputSizeshNQ4ISI);
        if (access$DataDeletionScreen$lambda$0 instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.NavigateToLinkedAccounts) {
            final java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.NavigateToLinkedAccounts) access$DataDeletionScreen$lambda$0).getLinkedAccounts(), ",", null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    java.lang.CharSequence name2;
                    name2 = ((com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount) obj2).name();
                    return name2;
                }
            }, 30, null);
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1.getHighSpeedVideoFpsRanges(joinToString$default, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoSizes.onNavigationHandled();
        } else if (access$DataDeletionScreen$lambda$0 instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState.NavigateToEmailConfirmation) {
            this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
            this.getHighSpeedVideoSizes.onNavigationHandled();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(new com.paypal.oslo.feature.dataprivacy.api.navigation.LinkedAccountsDestination(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(com.paypal.oslo.feature.dataprivacy.api.navigation.EmailConfirmationDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DataDeletionScreenKt$DataDeletionScreen$1$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel dataDeletionViewModel, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionUiState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.DataDeletionScreenKt$DataDeletionScreen$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = dataDeletionViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
    }
}
