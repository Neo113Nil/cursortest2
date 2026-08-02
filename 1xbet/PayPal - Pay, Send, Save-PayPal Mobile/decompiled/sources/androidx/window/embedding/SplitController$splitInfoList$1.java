package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Landroidx/window/embedding/SplitInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.window.embedding.SplitController$splitInfoList$1", f = "SplitController.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class SplitController$splitInfoList$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends androidx.window.embedding.SplitInfo>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ android.app.Activity getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.window.embedding.SplitController getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.window.embedding.EmbeddingBackend embeddingBackend;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoSizes;
            final androidx.core.util.Consumer<java.util.List<androidx.window.embedding.SplitInfo>> consumer = new androidx.core.util.Consumer() { // from class: androidx.window.embedding.SplitController$splitInfoList$1$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj2) {
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU((java.util.List) obj2);
                }
            };
            embeddingBackend = this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges;
            embeddingBackend.addSplitListenerForActivity(this.getHighResolutionOutputSizeshNQ4ISI, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), consumer);
            final androidx.window.embedding.SplitController splitController = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.SplitController$splitInfoList$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.window.embedding.SplitController$splitInfoList$1.getHighSpeedVideoSizes(androidx.window.embedding.SplitController.this, consumer);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.window.embedding.SplitController splitController, androidx.core.util.Consumer consumer) {
        androidx.window.embedding.EmbeddingBackend embeddingBackend;
        embeddingBackend = splitController.getHighSpeedVideoFpsRanges;
        embeddingBackend.removeSplitListenerForActivity(consumer);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends androidx.window.embedding.SplitInfo>> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.window.embedding.SplitController$splitInfoList$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.window.embedding.SplitController$splitInfoList$1 splitController$splitInfoList$1 = new androidx.window.embedding.SplitController$splitInfoList$1(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
        splitController$splitInfoList$1.getHighSpeedVideoSizes = obj;
        return splitController$splitInfoList$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplitController$splitInfoList$1(androidx.window.embedding.SplitController splitController, android.app.Activity activity, kotlin.coroutines.Continuation<? super androidx.window.embedding.SplitController$splitInfoList$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = splitController;
        this.getHighResolutionOutputSizeshNQ4ISI = activity;
    }
}
