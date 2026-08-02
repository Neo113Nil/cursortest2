package com.paypal.oslo.feature.dataprivacy.ui.screens.dar;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1", f = "DataAccessSelectSourcesScreen.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1$1, reason: invalid class name */
    static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final /* synthetic */ java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
            final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect effect = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect) obj;
            if (effect instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1.AnonymousClass1.getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            } else {
                if (!(effect instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateBack)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1.AnonymousClass1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect effect, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.push(new com.paypal.oslo.feature.dataprivacy.api.navigation.DataAccessChooseFormatDestination(kotlin.collections.CollectionsKt.joinToString$default(((com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel.Effect.NavigateToChooseFormat) effect).getSelectedSources(), ",", null, null, 0, null, null, 62, null)));
            return kotlin.Unit.INSTANCE;
        }

        public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
            navigationScope.goBack();
            return kotlin.Unit.INSTANCE;
        }

        AnonymousClass1(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
            this.getHighSpeedVideoFpsRanges = appNavigator;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (this.Camera2StreamConfigurationMap.getEffect().collect(new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI), this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel dataAccessSelectSourcesViewModel, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.dataprivacy.ui.screens.dar.DataAccessSelectSourcesScreenKt$DataAccessSelectSourcesScreen$1$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = dataAccessSelectSourcesViewModel;
        this.getHighResolutionOutputSizeshNQ4ISI = appNavigator;
    }
}
