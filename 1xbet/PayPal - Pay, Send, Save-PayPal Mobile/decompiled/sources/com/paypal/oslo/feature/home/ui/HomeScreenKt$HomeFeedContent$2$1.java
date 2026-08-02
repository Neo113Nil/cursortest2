package com.paypal.oslo.feature.home.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.ui.HomeScreenKt$HomeFeedContent$2$1", f = "HomeScreen.kt", i = {}, l = {207}, m = "invokeSuspend", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, s = {}, v = 2)
/* loaded from: classes12.dex */
final class HomeScreenKt$HomeFeedContent$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.lazy.LazyListState getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.lazy.LazyListState lazyListState = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlinx.coroutines.flow.Flow distinctUntilChanged = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(kotlinx.coroutines.flow.FlowKt.debounce(androidx.compose.runtime.SnapshotStateKt.snapshotFlow(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.home.ui.HomeScreenKt$HomeFeedContent$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    kotlin.Pair pair;
                    pair = kotlin.TuplesKt.to(java.lang.Integer.valueOf(r0.getFirstVisibleItemIndex()), java.lang.Integer.valueOf(androidx.compose.foundation.lazy.LazyListState.this.getFirstVisibleItemScrollOffset()));
                    return pair;
                }
            }), 300L));
            final kotlin.jvm.functions.Function1<com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> function1 = this.getHighSpeedVideoFpsRangesFor;
            this.Camera2StreamConfigurationMap = 1;
            if (distinctUntilChanged.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: com.paypal.oslo.feature.home.ui.HomeScreenKt$HomeFeedContent$2$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                    kotlin.Pair pair = (kotlin.Pair) obj2;
                    function1.invoke(new com.paypal.oslo.feature.home.ui.mvi.HomeEvent.ScrollPositionChanged(((java.lang.Number) pair.component1()).intValue(), ((java.lang.Number) pair.component2()).intValue()));
                    return kotlin.Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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
        return ((com.paypal.oslo.feature.home.ui.HomeScreenKt$HomeFeedContent$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.home.ui.HomeScreenKt$HomeFeedContent$2$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeFeedContent$2$1(androidx.compose.foundation.lazy.LazyListState lazyListState, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.home.ui.mvi.HomeEvent, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.ui.HomeScreenKt$HomeFeedContent$2$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = lazyListState;
        this.getHighSpeedVideoFpsRangesFor = function1;
    }
}
