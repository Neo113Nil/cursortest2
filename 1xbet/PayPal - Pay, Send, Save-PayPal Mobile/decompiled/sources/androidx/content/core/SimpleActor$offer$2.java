package androidx.content.core;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", i = {}, l = {114, 114}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes3.dex */
final class SimpleActor$offer$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.content.core.SimpleActor<T> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005c, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if (r6 == r0) goto L21;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:6:0x005f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.content.core.AtomicInt atomicInt;
        kotlin.jvm.functions.Function2 function2;
        kotlinx.coroutines.CoroutineScope coroutineScope;
        kotlinx.coroutines.channels.Channel channel;
        androidx.content.core.AtomicInt atomicInt2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            atomicInt = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
            if (atomicInt.get() <= 0) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            coroutineScope = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
            function2 = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
            channel = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = channel.receive(this);
        } else if (i == 1) {
            function2 = (kotlin.jvm.functions.Function2) this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            this.getHighSpeedVideoFpsRangesFor = 2;
        } else {
            if (i != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            atomicInt2 = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).Camera2StreamConfigurationMap;
            if (atomicInt2.decrementAndGet() == 0) {
                return kotlin.Unit.INSTANCE;
            }
            coroutineScope = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRangesFor;
            kotlinx.coroutines.CoroutineScopeKt.ensureActive(coroutineScope);
            function2 = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).getHighSpeedVideoFpsRanges;
            channel = ((androidx.content.core.SimpleActor) this.getHighSpeedVideoFpsRanges).getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = function2;
            this.getHighSpeedVideoFpsRangesFor = 1;
            obj = channel.receive(this);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.content.core.SimpleActor$offer$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.content.core.SimpleActor$offer$2(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleActor$offer$2(androidx.content.core.SimpleActor<T> simpleActor, kotlin.coroutines.Continuation<? super androidx.content.core.SimpleActor$offer$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = simpleActor;
    }
}
