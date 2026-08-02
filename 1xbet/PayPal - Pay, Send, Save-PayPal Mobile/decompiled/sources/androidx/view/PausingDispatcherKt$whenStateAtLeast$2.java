package androidx.view;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, m = "invokeSuspend", n = {"controller"}, s = {"L$0"}, v = 1)
/* loaded from: classes.dex */
final class PausingDispatcherKt$whenStateAtLeast$2<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super T>, java.lang.Object> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.Lifecycle getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.lifecycle.Lifecycle.State getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.view.LifecycleController lifecycleController;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) ((kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRanges).getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
            if (job == null) {
                throw new java.lang.IllegalStateException("when[State] methods should have a parent job".toString());
            }
            androidx.view.PausingDispatcher pausingDispatcher = new androidx.view.PausingDispatcher();
            androidx.view.LifecycleController lifecycleController2 = new androidx.view.LifecycleController(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, pausingDispatcher.dispatchQueue, job);
            try {
                this.getHighSpeedVideoFpsRanges = lifecycleController2;
                this.getHighSpeedVideoFpsRangesFor = 1;
                obj = kotlinx.coroutines.BuildersKt.withContext(pausingDispatcher, this.Camera2StreamConfigurationMap, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                lifecycleController = lifecycleController2;
            } catch (java.lang.Throwable th) {
                th = th;
                lifecycleController = lifecycleController2;
                lifecycleController.finish();
                throw th;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleController = (androidx.view.LifecycleController) this.getHighSpeedVideoFpsRanges;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th2) {
                th = th2;
                lifecycleController.finish();
                throw th;
            }
        }
        lifecycleController.finish();
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.Object obj) {
        return ((androidx.view.PausingDispatcherKt$whenStateAtLeast$2) create(coroutineScope, (kotlin.coroutines.Continuation) obj)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.view.PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new androidx.view.PausingDispatcherKt$whenStateAtLeast$2(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        pausingDispatcherKt$whenStateAtLeast$2.getHighSpeedVideoFpsRanges = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PausingDispatcherKt$whenStateAtLeast$2(androidx.view.Lifecycle lifecycle, androidx.lifecycle.Lifecycle.State state, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> function2, kotlin.coroutines.Continuation<? super androidx.view.PausingDispatcherKt$whenStateAtLeast$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycle;
        this.getHighSpeedVideoSizes = state;
        this.Camera2StreamConfigurationMap = function2;
    }
}
