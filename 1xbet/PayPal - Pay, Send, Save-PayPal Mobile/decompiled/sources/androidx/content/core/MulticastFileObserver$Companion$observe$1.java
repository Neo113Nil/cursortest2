package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", i = {0, 0}, l = {78, 79}, m = "invokeSuspend", n = {"$this$channelFlow", "disposeListener"}, s = {"L$0", "L$1"}, v = 1)
/* loaded from: classes7.dex */
final class MulticastFileObserver$Companion$observe$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ java.io.File getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (kotlinx.coroutines.channels.ProduceKt.awaitClose(r3, new androidx.content.core.MulticastFileObserver$Companion$observe$1$$ExternalSyntheticLambda1(r1), r6) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        final kotlinx.coroutines.DisposableHandle highSpeedVideoFpsRangesFor;
        kotlinx.coroutines.channels.ProducerScope producerScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope2 = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
            final java.io.File file = this.getHighSpeedVideoFpsRanges;
            kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: androidx.datastore.core.MulticastFileObserver$Companion$observe$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.content.core.MulticastFileObserver$Companion$observe$1.Camera2StreamConfigurationMap(file, producerScope2, (java.lang.String) obj2);
                }
            };
            androidx.content.core.MulticastFileObserver.Companion companion = androidx.content.core.MulticastFileObserver.INSTANCE;
            java.io.File parentFile = this.getHighSpeedVideoFpsRanges.getParentFile();
            kotlin.jvm.internal.Intrinsics.checkNotNull(parentFile);
            highSpeedVideoFpsRangesFor = androidx.content.core.MulticastFileObserver.Companion.getHighSpeedVideoFpsRangesFor(parentFile, function1);
            this.getHighSpeedVideoFpsRangesFor = producerScope2;
            this.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoSizes = 1;
            if (producerScope2.send(kotlin.Unit.INSTANCE, this) != coroutine_suspended) {
                producerScope = producerScope2;
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return kotlin.Unit.INSTANCE;
        }
        highSpeedVideoFpsRangesFor = (kotlinx.coroutines.DisposableHandle) this.Camera2StreamConfigurationMap;
        producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighSpeedVideoFpsRangesFor;
        kotlin.ResultKt.throwOnFailure(obj);
        this.getHighSpeedVideoFpsRangesFor = null;
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoSizes = 2;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlinx.coroutines.DisposableHandle disposableHandle) {
        disposableHandle.dispose();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(java.io.File file, kotlinx.coroutines.channels.ProducerScope producerScope, java.lang.String str) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, file.getName())) {
            kotlinx.coroutines.channels.ChannelsKt.trySendBlocking(producerScope, kotlin.Unit.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super kotlin.Unit> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.MulticastFileObserver$Companion$observe$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.content.core.MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new androidx.content.core.MulticastFileObserver$Companion$observe$1(this.getHighSpeedVideoFpsRanges, continuation);
        multicastFileObserver$Companion$observe$1.getHighSpeedVideoFpsRangesFor = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastFileObserver$Companion$observe$1(java.io.File file, kotlin.coroutines.Continuation<? super androidx.content.core.MulticastFileObserver$Companion$observe$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = file;
    }
}
