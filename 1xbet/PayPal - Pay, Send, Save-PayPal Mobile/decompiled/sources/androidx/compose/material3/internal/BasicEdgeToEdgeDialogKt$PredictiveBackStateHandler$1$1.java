package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0010\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "progress", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/activity/BackEventCompat;", "Landroidx/compose/material3/internal/BackEventCompat;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1", f = "BasicEdgeToEdgeDialog.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.material3.internal.PredictiveBackState getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function0<kotlin.Unit>> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow flow = (kotlinx.coroutines.flow.Flow) this.Camera2StreamConfigurationMap;
                final androidx.compose.material3.internal.PredictiveBackState predictiveBackState = this.getHighSpeedVideoFpsRanges;
                this.getHighResolutionOutputSizeshNQ4ISI = 1;
                if (flow.collect(new kotlinx.coroutines.flow.FlowCollector() { // from class: androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(java.lang.Object obj2, kotlin.coroutines.Continuation continuation) {
                        androidx.compose.material3.internal.SwipeEdge swipeEdge;
                        androidx.view.BackEventCompat backEventCompat = (androidx.view.BackEventCompat) obj2;
                        androidx.compose.material3.internal.PredictiveBackStateImpl predictiveBackStateImpl = (androidx.compose.material3.internal.PredictiveBackStateImpl) androidx.compose.material3.internal.PredictiveBackState.this;
                        float touchX = backEventCompat.getTouchX();
                        float touchY = backEventCompat.getTouchY();
                        float progress = backEventCompat.getProgress();
                        int swipeEdge2 = backEventCompat.getSwipeEdge();
                        if (swipeEdge2 == 0) {
                            swipeEdge = androidx.compose.material3.internal.SwipeEdge.Left;
                        } else if (swipeEdge2 == 1) {
                            swipeEdge = androidx.compose.material3.internal.SwipeEdge.Right;
                        } else {
                            swipeEdge = androidx.compose.material3.internal.SwipeEdge.None;
                        }
                        predictiveBackStateImpl.getHighSpeedVideoFpsRangesFor(new androidx.compose.material3.internal.BackEventProgress.InProgress(touchX, touchY, progress, swipeEdge));
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
            ((androidx.compose.material3.internal.PredictiveBackStateImpl) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor(androidx.compose.material3.internal.BackEventProgress.Completed.INSTANCE);
            androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt.access$PredictiveBackStateHandler$lambda$1(this.getHighSpeedVideoSizes).invoke();
            return kotlin.Unit.INSTANCE;
        } catch (java.util.concurrent.CancellationException e) {
            ((androidx.compose.material3.internal.PredictiveBackStateImpl) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor(androidx.compose.material3.internal.BackEventProgress.NotRunning.INSTANCE);
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.Flow<? extends androidx.view.BackEventCompat> flow, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1) create(flow, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1 = new androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, continuation);
        basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1.Camera2StreamConfigurationMap = obj;
        return basicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1(androidx.compose.material3.internal.PredictiveBackState predictiveBackState, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0<kotlin.Unit>> state, kotlin.coroutines.Continuation<? super androidx.compose.material3.internal.BasicEdgeToEdgeDialogKt$PredictiveBackStateHandler$1$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = predictiveBackState;
        this.getHighSpeedVideoSizes = state;
    }
}
