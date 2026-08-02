package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1", f = "RequestHistoryScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class RequestHistoryScreenKt$RequestHistoryScreen$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState> Camera2StreamConfigurationMap;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRanges != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState access$RequestHistoryScreen$lambda$0 = com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt.access$RequestHistoryScreen$lambda$0(this.Camera2StreamConfigurationMap);
        if (access$RequestHistoryScreen$lambda$0 instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success) {
            com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState access$RequestHistoryScreen$lambda$02 = com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt.access$RequestHistoryScreen$lambda$0(this.Camera2StreamConfigurationMap);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$RequestHistoryScreen$lambda$02, "");
            if (((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Success) access$RequestHistoryScreen$lambda$02).getRequests().isEmpty()) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        } else if (access$RequestHistoryScreen$lambda$0 instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess) {
            com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState access$RequestHistoryScreen$lambda$03 = com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt.access$RequestHistoryScreen$lambda$0(this.Camera2StreamConfigurationMap);
            kotlin.jvm.internal.Intrinsics.checkNotNull(access$RequestHistoryScreen$lambda$03, "");
            if (((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.PartialSuccess) access$RequestHistoryScreen$lambda$03).getData().isEmpty()) {
                this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1.getHighSpeedVideoFpsRanges((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        } else if (access$RequestHistoryScreen$lambda$0 instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState.Error) {
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1.getHighResolutionOutputSizeshNQ4ISI((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(com.paypal.oslo.feature.dataprivacy.api.navigation.DataAccessIntroDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(com.paypal.oslo.feature.dataprivacy.api.navigation.DataAccessIntroDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.replaceTop(com.paypal.oslo.feature.dataprivacy.api.navigation.DataAccessIntroDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RequestHistoryScreenKt$RequestHistoryScreen$2$1(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.runtime.State<? extends com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessState> state, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.screens.dar.RequestHistoryScreenKt$RequestHistoryScreen$2$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = appNavigator;
        this.Camera2StreamConfigurationMap = state;
    }
}
