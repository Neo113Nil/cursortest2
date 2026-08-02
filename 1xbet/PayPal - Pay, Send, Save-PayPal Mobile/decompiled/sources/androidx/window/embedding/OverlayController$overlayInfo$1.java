package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/window/embedding/OverlayInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.window.embedding.OverlayController$overlayInfo$1", f = "OverlayController.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class OverlayController$overlayInfo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.window.embedding.OverlayInfo>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ java.lang.String Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.window.embedding.OverlayController getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.window.embedding.EmbeddingBackend embeddingBackend;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            final androidx.core.util.Consumer<androidx.window.embedding.OverlayInfo> consumer = new androidx.core.util.Consumer() { // from class: androidx.window.embedding.OverlayController$overlayInfo$1$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj2) {
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU((androidx.window.embedding.OverlayInfo) obj2);
                }
            };
            embeddingBackend = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
            embeddingBackend.addOverlayInfoCallback(this.Camera2StreamConfigurationMap, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), consumer);
            final androidx.window.embedding.OverlayController overlayController = this.getHighSpeedVideoSizes;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.OverlayController$overlayInfo$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.window.embedding.OverlayController$overlayInfo$1.getHighSpeedVideoFpsRangesFor(androidx.window.embedding.OverlayController.this, consumer);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.window.embedding.OverlayController overlayController, androidx.core.util.Consumer consumer) {
        androidx.window.embedding.EmbeddingBackend embeddingBackend;
        embeddingBackend = overlayController.getHighSpeedVideoFpsRangesFor;
        embeddingBackend.removeOverlayInfoCallback(consumer);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.window.embedding.OverlayInfo> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.window.embedding.OverlayController$overlayInfo$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.window.embedding.OverlayController$overlayInfo$1 overlayController$overlayInfo$1 = new androidx.window.embedding.OverlayController$overlayInfo$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        overlayController$overlayInfo$1.getHighSpeedVideoFpsRangesFor = obj;
        return overlayController$overlayInfo$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OverlayController$overlayInfo$1(androidx.window.embedding.OverlayController overlayController, java.lang.String str, kotlin.coroutines.Continuation<? super androidx.window.embedding.OverlayController$overlayInfo$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = overlayController;
        this.Camera2StreamConfigurationMap = str;
    }
}
