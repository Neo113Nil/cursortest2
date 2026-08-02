package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", i = {0}, l = {389}, m = "invokeSuspend", n = {"durationScaleJob"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.runtime.Recomposer Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.view.LifecycleOwner getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 getHighSpeedVideoFpsRanges;
    final /* synthetic */ android.view.View getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.platform.MotionDurationScaleImpl> getHighSpeedVideoSizes;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.Job job;
        kotlinx.coroutines.Job job2;
        kotlinx.coroutines.flow.StateFlow Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getInputFormats;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.CoroutineScope coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoSizesFor;
            try {
                androidx.compose.ui.platform.MotionDurationScaleImpl motionDurationScaleImpl = this.getHighSpeedVideoSizes.element;
                if (motionDurationScaleImpl != null) {
                    Camera2StreamConfigurationMap = androidx.compose.ui.platform.WindowRecomposer_androidKt.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor.getContext().getApplicationContext());
                    motionDurationScaleImpl.getHighSpeedVideoSizes(((java.lang.Number) Camera2StreamConfigurationMap.getValue()).floatValue());
                    job2 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(Camera2StreamConfigurationMap, motionDurationScaleImpl, null), 3, null);
                } else {
                    job2 = null;
                }
                try {
                    this.getHighSpeedVideoSizesFor = job2;
                    this.getInputFormats = 1;
                    if (this.Camera2StreamConfigurationMap.runRecomposeAndApplyChanges(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    job = job2;
                } catch (java.lang.Throwable th) {
                    job = job2;
                    th = th;
                    if (job != null) {
                        kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.getLifecycle().removeObserver(this.getHighSpeedVideoFpsRanges);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                job = null;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            job = (kotlinx.coroutines.Job) this.getHighSpeedVideoSizesFor;
            try {
                kotlin.ResultKt.throwOnFailure(obj);
            } catch (java.lang.Throwable th3) {
                th = th3;
                if (job != null) {
                }
                this.getHighResolutionOutputSizeshNQ4ISI.getLifecycle().removeObserver(this.getHighSpeedVideoFpsRanges);
                throw th;
            }
        }
        if (job != null) {
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.getLifecycle().removeObserver(this.getHighSpeedVideoFpsRanges);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, continuation);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.getHighSpeedVideoSizesFor = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.ui.platform.MotionDurationScaleImpl> objectRef, androidx.compose.runtime.Recomposer recomposer, androidx.view.LifecycleOwner lifecycleOwner, androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, android.view.View view, kotlin.coroutines.Continuation<? super androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = objectRef;
        this.Camera2StreamConfigurationMap = recomposer;
        this.getHighResolutionOutputSizeshNQ4ISI = lifecycleOwner;
        this.getHighSpeedVideoFpsRanges = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.getHighSpeedVideoFpsRangesFor = view;
    }
}
