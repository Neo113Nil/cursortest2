package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", "Landroidx/window/area/WindowAreaInfo;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1", f = "WindowAreaControllerImpl.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class WindowAreaControllerImpl$windowAreaInfos$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends androidx.window.area.WindowAreaInfo>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.window.area.WindowAreaControllerImpl getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.window.extensions.area.WindowAreaComponent windowAreaComponent;
        androidx.window.extensions.area.WindowAreaComponent windowAreaComponent2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.window.area.WindowAreaControllerImpl windowAreaControllerImpl = this.getHighSpeedVideoSizes;
            final androidx.window.reflection.Consumer2 consumer2 = new androidx.window.reflection.Consumer2() { // from class: androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda0
                @Override // androidx.window.reflection.Consumer2
                public final void accept(java.lang.Object obj2) {
                    androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1.getHighSpeedVideoFpsRanges(androidx.window.area.WindowAreaControllerImpl.this, producerScope, ((java.lang.Integer) obj2).intValue());
                }
            };
            final androidx.window.area.WindowAreaControllerImpl windowAreaControllerImpl2 = this.getHighSpeedVideoSizes;
            final androidx.window.reflection.Consumer2 consumer22 = new androidx.window.reflection.Consumer2() { // from class: androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda1
                @Override // androidx.window.reflection.Consumer2
                public final void accept(java.lang.Object obj2) {
                    androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1.getHighResolutionOutputSizeshNQ4ISI(androidx.window.area.WindowAreaControllerImpl.this, producerScope, (androidx.window.extensions.area.ExtensionWindowAreaStatus) obj2);
                }
            };
            windowAreaComponent = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
            windowAreaComponent.addRearDisplayStatusListener(consumer2);
            windowAreaComponent2 = this.getHighSpeedVideoSizes.getHighSpeedVideoSizesFor;
            windowAreaComponent2.addRearDisplayPresentationStatusListener(consumer22);
            final androidx.window.area.WindowAreaControllerImpl windowAreaControllerImpl3 = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1.getHighSpeedVideoFpsRangesFor(androidx.window.area.WindowAreaControllerImpl.this, consumer2, consumer22);
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

    public static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.window.area.WindowAreaControllerImpl windowAreaControllerImpl, kotlinx.coroutines.channels.ProducerScope producerScope, androidx.window.extensions.area.ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        java.util.HashMap hashMap;
        androidx.window.area.WindowAreaControllerImpl.access$updateRearDisplayPresentationAvailability(windowAreaControllerImpl, extensionWindowAreaStatus);
        kotlinx.coroutines.channels.SendChannel channel = producerScope.getChannel();
        hashMap = windowAreaControllerImpl.Camera2StreamConfigurationMap;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        channel.mo9266trySendJP2dKIU(kotlin.collections.CollectionsKt.toList(values));
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.window.area.WindowAreaControllerImpl windowAreaControllerImpl, kotlinx.coroutines.channels.ProducerScope producerScope, int i) {
        java.util.HashMap hashMap;
        androidx.window.area.WindowAreaControllerImpl.access$updateRearDisplayAvailability(windowAreaControllerImpl, i);
        kotlinx.coroutines.channels.SendChannel channel = producerScope.getChannel();
        hashMap = windowAreaControllerImpl.Camera2StreamConfigurationMap;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(values, "");
        channel.mo9266trySendJP2dKIU(kotlin.collections.CollectionsKt.toList(values));
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.window.area.WindowAreaControllerImpl windowAreaControllerImpl, androidx.window.reflection.Consumer2 consumer2, androidx.window.reflection.Consumer2 consumer22) {
        androidx.window.extensions.area.WindowAreaComponent windowAreaComponent;
        androidx.window.extensions.area.WindowAreaComponent windowAreaComponent2;
        windowAreaComponent = windowAreaControllerImpl.getHighSpeedVideoSizesFor;
        windowAreaComponent.removeRearDisplayStatusListener(consumer2);
        windowAreaComponent2 = windowAreaControllerImpl.getHighSpeedVideoSizesFor;
        windowAreaComponent2.removeRearDisplayPresentationStatusListener(consumer22);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super java.util.List<? extends androidx.window.area.WindowAreaInfo>> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1 windowAreaControllerImpl$windowAreaInfos$1 = new androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1(this.getHighSpeedVideoSizes, continuation);
        windowAreaControllerImpl$windowAreaInfos$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return windowAreaControllerImpl$windowAreaInfos$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WindowAreaControllerImpl$windowAreaInfos$1(androidx.window.area.WindowAreaControllerImpl windowAreaControllerImpl, kotlin.coroutines.Continuation<? super androidx.window.area.WindowAreaControllerImpl$windowAreaInfos$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = windowAreaControllerImpl;
    }
}
