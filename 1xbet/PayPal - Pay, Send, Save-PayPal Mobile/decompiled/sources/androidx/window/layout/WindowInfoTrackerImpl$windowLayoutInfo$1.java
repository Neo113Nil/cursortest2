package androidx.window.layout;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/window/layout/WindowLayoutInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1", f = "WindowInfoTrackerImpl.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super androidx.window.layout.WindowLayoutInfo>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ android.content.Context getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.window.layout.WindowInfoTrackerImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.window.layout.adapter.WindowBackend windowBackend;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.Camera2StreamConfigurationMap;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            final androidx.core.util.Consumer<androidx.window.layout.WindowLayoutInfo> consumer = new androidx.core.util.Consumer() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj2) {
                    kotlinx.coroutines.channels.ProducerScope.this.mo9266trySendJP2dKIU((androidx.window.layout.WindowLayoutInfo) obj2);
                }
            };
            windowBackend = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
            windowBackend.registerLayoutChangeCallback(this.getHighSpeedVideoFpsRanges, new androidx.camera.compose.CameraXViewfinderKt$CameraXViewfinder$viewfinderArgs$2$1$$ExternalSyntheticLambda0(), consumer);
            final androidx.window.layout.WindowInfoTrackerImpl windowInfoTrackerImpl = this.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1.getHighSpeedVideoSizes(androidx.window.layout.WindowInfoTrackerImpl.this, consumer);
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

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.window.layout.WindowInfoTrackerImpl windowInfoTrackerImpl, androidx.core.util.Consumer consumer) {
        androidx.window.layout.adapter.WindowBackend windowBackend;
        windowBackend = windowInfoTrackerImpl.Camera2StreamConfigurationMap;
        windowBackend.unregisterLayoutChangeCallback(consumer);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super androidx.window.layout.WindowLayoutInfo> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1 windowInfoTrackerImpl$windowLayoutInfo$1 = new androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$1.getHighSpeedVideoFpsRangesFor = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerImpl$windowLayoutInfo$1(androidx.window.layout.WindowInfoTrackerImpl windowInfoTrackerImpl, android.content.Context context, kotlin.coroutines.Continuation<? super androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = windowInfoTrackerImpl;
        this.getHighSpeedVideoFpsRanges = context;
    }
}
