package androidx.navigation3.ui;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1", f = "NavDisplay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes.dex */
final class NavDisplayKt__NavDisplayKt$NavDisplay$10$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.util.List<androidx.navigation3.scene.OverlayScene<T>> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation3.scene.OverlayScene<T>> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighSpeedVideoSizes != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<androidx.navigation3.scene.OverlayScene<T>> list = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List list2 = this.getHighSpeedVideoFpsRangesFor;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.navigation3.scene.OverlayScene overlayScene = (androidx.navigation3.scene.OverlayScene) list.get(i);
            if (!list2.contains(overlayScene)) {
                list2.add(overlayScene);
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    NavDisplayKt__NavDisplayKt$NavDisplay$10$1(java.util.List<? extends androidx.navigation3.scene.OverlayScene<T>> list, androidx.compose.runtime.snapshots.SnapshotStateList<androidx.navigation3.scene.OverlayScene<T>> snapshotStateList, kotlin.coroutines.Continuation<? super androidx.navigation3.ui.NavDisplayKt__NavDisplayKt$NavDisplay$10$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = snapshotStateList;
    }
}
