package androidx.view.compose;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class DialogHostKt$DialogHost$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.State<java.util.Set<androidx.view.NavBackStackEntry>> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.view.compose.DialogNavigator getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoFpsRangesFor != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Set<androidx.view.NavBackStackEntry> access$DialogHost$lambda$1 = androidx.view.compose.DialogHostKt.access$DialogHost$lambda$1(this.Camera2StreamConfigurationMap);
        androidx.view.compose.DialogNavigator dialogNavigator = this.getHighSpeedVideoFpsRanges;
        androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> snapshotStateList = this.getHighResolutionOutputSizeshNQ4ISI;
        for (androidx.view.NavBackStackEntry navBackStackEntry : access$DialogHost$lambda$1) {
            if (!dialogNavigator.getBackStack$navigation_compose_release().getValue().contains(navBackStackEntry) && !snapshotStateList.contains(navBackStackEntry)) {
                dialogNavigator.onTransitionComplete$navigation_compose_release(navBackStackEntry);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.view.compose.DialogHostKt$DialogHost$2$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.view.compose.DialogHostKt$DialogHost$2$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DialogHostKt$DialogHost$2$1(androidx.compose.runtime.State<? extends java.util.Set<androidx.view.NavBackStackEntry>> state, androidx.view.compose.DialogNavigator dialogNavigator, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.view.NavBackStackEntry> snapshotStateList, kotlin.coroutines.Continuation<? super androidx.view.compose.DialogHostKt$DialogHost$2$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = state;
        this.getHighSpeedVideoFpsRanges = dialogNavigator;
        this.getHighResolutionOutputSizeshNQ4ISI = snapshotStateList;
    }
}
