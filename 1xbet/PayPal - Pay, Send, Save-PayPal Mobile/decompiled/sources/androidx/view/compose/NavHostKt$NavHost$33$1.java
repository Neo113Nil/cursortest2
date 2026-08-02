package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$33$1", f = "NavHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class NavHostKt$NavHost$33$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.collection.MutableObjectFloatMap<java.lang.String> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.State<java.util.List<androidx.view.NavBackStackEntry>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.compose.ComposeNavigator getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.Transition<androidx.view.NavBackStackEntry> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.view.NavHostController getHighSpeedVideoSizes;
    int getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getInputFormats != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor.getCurrentState(), this.getHighSpeedVideoFpsRangesFor.getTargetState()) && (this.getHighSpeedVideoSizes.getCurrentBackStackEntry() == null || kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor.getTargetState(), this.getHighSpeedVideoSizes.getCurrentBackStackEntry()))) {
            java.util.List access$NavHost$lambda$53 = androidx.view.compose.NavHostKt.access$NavHost$lambda$53(this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.view.compose.ComposeNavigator composeNavigator = this.getHighSpeedVideoFpsRanges;
            java.util.Iterator it = access$NavHost$lambda$53.iterator();
            while (it.hasNext()) {
                composeNavigator.onTransitionComplete((androidx.view.NavBackStackEntry) it.next());
            }
            androidx.collection.MutableObjectFloatMap<java.lang.String> mutableObjectFloatMap = this.Camera2StreamConfigurationMap;
            androidx.compose.animation.core.Transition<androidx.view.NavBackStackEntry> transition = this.getHighSpeedVideoFpsRangesFor;
            long[] jArr = mutableObjectFloatMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                java.lang.Object obj2 = mutableObjectFloatMap.keys[i4];
                                float f = mutableObjectFloatMap.values[i4];
                                if (!kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) obj2, transition.getTargetState().getId())) {
                                    mutableObjectFloatMap.removeValueAt(i4);
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.NavHostKt$NavHost$33$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.compose.NavHostKt$NavHost$33$1(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavHostKt$NavHost$33$1(androidx.compose.animation.core.Transition<androidx.view.NavBackStackEntry> transition, androidx.view.NavHostController navHostController, androidx.collection.MutableObjectFloatMap<java.lang.String> mutableObjectFloatMap, androidx.compose.runtime.State<? extends java.util.List<androidx.view.NavBackStackEntry>> state, androidx.view.compose.ComposeNavigator composeNavigator, kotlin.coroutines.Continuation<? super androidx.view.compose.NavHostKt$NavHost$33$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = transition;
        this.getHighSpeedVideoSizes = navHostController;
        this.Camera2StreamConfigurationMap = mutableObjectFloatMap;
        this.getHighResolutionOutputSizeshNQ4ISI = state;
        this.getHighSpeedVideoFpsRanges = composeNavigator;
    }
}
