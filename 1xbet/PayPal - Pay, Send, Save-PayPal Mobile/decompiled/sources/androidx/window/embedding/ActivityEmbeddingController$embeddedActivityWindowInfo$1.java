package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/window/embedding/EmbeddedActivityWindowInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1", f = "ActivityEmbeddingController.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class ActivityEmbeddingController$embeddedActivityWindowInfo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.window.embedding.EmbeddedActivityWindowInfo>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.window.embedding.ActivityEmbeddingController getHighResolutionOutputSizeshNQ4ISI;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.app.Activity getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.window.embedding.EmbeddingBackend embeddingBackend;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            final androidx.core.util.Consumer<androidx.window.embedding.EmbeddedActivityWindowInfo> consumer = new androidx.core.util.Consumer() { // from class: androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj2) {
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU((androidx.window.embedding.EmbeddedActivityWindowInfo) obj2);
                }
            };
            embeddingBackend = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            embeddingBackend.addEmbeddedActivityWindowInfoCallbackForActivity(this.getHighSpeedVideoSizes, consumer);
            final androidx.window.embedding.ActivityEmbeddingController activityEmbeddingController = this.getHighResolutionOutputSizeshNQ4ISI;
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1.getHighSpeedVideoFpsRanges(androidx.window.embedding.ActivityEmbeddingController.this, consumer);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(androidx.window.embedding.ActivityEmbeddingController activityEmbeddingController, androidx.core.util.Consumer consumer) {
        androidx.window.embedding.EmbeddingBackend embeddingBackend;
        embeddingBackend = activityEmbeddingController.Camera2StreamConfigurationMap;
        embeddingBackend.removeEmbeddedActivityWindowInfoCallbackForActivity(consumer);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.window.embedding.EmbeddedActivityWindowInfo> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1 activityEmbeddingController$embeddedActivityWindowInfo$1 = new androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
        activityEmbeddingController$embeddedActivityWindowInfo$1.getHighSpeedVideoFpsRangesFor = obj;
        return activityEmbeddingController$embeddedActivityWindowInfo$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActivityEmbeddingController$embeddedActivityWindowInfo$1(androidx.window.embedding.ActivityEmbeddingController activityEmbeddingController, android.app.Activity activity, kotlin.coroutines.Continuation<? super androidx.window.embedding.ActivityEmbeddingController$embeddedActivityWindowInfo$1> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = activityEmbeddingController;
        this.getHighSpeedVideoSizes = activity;
    }
}
