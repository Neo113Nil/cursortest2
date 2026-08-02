package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "backEvent", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Landroidx/navigation/compose/internal/BackEventCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", i = {0}, l = {523}, m = "invokeSuspend", n = {"currentBackStackEntry"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class NavHostKt$NavHost$25$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.compose.ComposeNavigator getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.MutableFloatState getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.runtime.State<java.util.List<androidx.view.NavBackStackEntry>> getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.NavBackStackEntry navBackStackEntry;
        androidx.view.NavBackStackEntry navBackStackEntry2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow flow = (kotlinx.coroutines.flow.Flow) this.getHighSpeedVideoFpsRanges;
                if (androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoSizes).size() > 1) {
                    this.getHighSpeedVideoFpsRangesFor.setFloatValue(0.0f);
                    navBackStackEntry = (androidx.view.NavBackStackEntry) kotlin.collections.CollectionsKt.lastOrNull(androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoSizes));
                    androidx.view.compose.ComposeNavigator composeNavigator = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(navBackStackEntry);
                    composeNavigator.prepareForTransition(navBackStackEntry);
                    this.getHighResolutionOutputSizeshNQ4ISI.prepareForTransition((androidx.view.NavBackStackEntry) androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoSizes).get(androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoSizes).size() - 2));
                } else {
                    navBackStackEntry = null;
                }
                final androidx.compose.runtime.State<java.util.List<androidx.view.NavBackStackEntry>> state = this.getHighSpeedVideoSizes;
                final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.Camera2StreamConfigurationMap;
                final androidx.compose.runtime.MutableFloatState mutableFloatState = this.getHighSpeedVideoFpsRangesFor;
                this.getHighSpeedVideoFpsRanges = navBackStackEntry;
                this.getInputFormats = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.navigation.compose.NavHostKt$NavHost$25$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        androidx.view.BackEventCompat backEventCompat = (androidx.view.BackEventCompat) obj2;
                        if (androidx.view.compose.NavHostKt.access$NavHost$lambda$38(state).size() > 1) {
                            mutableState.setValue(java.lang.Boolean.valueOf(true));
                            mutableFloatState.setFloatValue(backEventCompat.getProgress());
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                navBackStackEntry2 = navBackStackEntry;
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                navBackStackEntry2 = (androidx.view.NavBackStackEntry) this.getHighSpeedVideoFpsRanges;
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoSizes).size() > 1) {
                this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(false));
                androidx.view.compose.ComposeNavigator composeNavigator2 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.jvm.internal.Intrinsics.checkNotNull(navBackStackEntry2);
                composeNavigator2.popBackStack(navBackStackEntry2, false);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            if (androidx.view.compose.NavHostKt.access$NavHost$lambda$38(this.getHighSpeedVideoSizes).size() > 1) {
                this.Camera2StreamConfigurationMap.setValue(java.lang.Boolean.valueOf(false));
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.NavHostKt$NavHost$25$1) create(flow, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.compose.NavHostKt$NavHost$25$1 navHostKt$NavHost$25$1 = new androidx.view.compose.NavHostKt$NavHost$25$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, continuation);
        navHostKt$NavHost$25$1.getHighSpeedVideoFpsRanges = obj;
        return navHostKt$NavHost$25$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavHostKt$NavHost$25$1(androidx.view.compose.ComposeNavigator composeNavigator, androidx.compose.runtime.State<? extends java.util.List<androidx.view.NavBackStackEntry>> state, androidx.compose.runtime.MutableFloatState mutableFloatState, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, kotlin.coroutines.Continuation<? super androidx.view.compose.NavHostKt$NavHost$25$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = composeNavigator;
        this.getHighSpeedVideoSizes = state;
        this.getHighSpeedVideoFpsRangesFor = mutableFloatState;
        this.Camera2StreamConfigurationMap = mutableState;
    }
}
