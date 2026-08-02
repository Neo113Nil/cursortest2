package androidx.core.os;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroid/os/ProfilingResult;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.core.os.Profiling$registerForAllProfilingResults$1", f = "Profiling.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes7.dex */
final class Profiling$registerForAllProfilingResults$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super android.os.ProfilingResult>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.content.Context Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final kotlinx.coroutines.channels.ProducerScope producerScope = (kotlinx.coroutines.channels.ProducerScope) this.getHighResolutionOutputSizeshNQ4ISI;
            final java.util.function.Consumer consumer = new java.util.function.Consumer() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj2) {
                    androidx.core.os.Profiling$registerForAllProfilingResults$1.bV_(kotlinx.coroutines.channels.ProducerScope.this, (android.os.ProfilingResult) obj2);
                }
            };
            final android.os.ProfilingManager profilingManager = (android.os.ProfilingManager) this.Camera2StreamConfigurationMap.getSystemService(android.os.ProfilingManager.class);
            profilingManager.registerForAllProfilingResults(new java.util.concurrent.Executor() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda1
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    runnable.run();
                }
            }, consumer);
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(producerScope, new kotlin.jvm.functions.Function0() { // from class: androidx.core.os.Profiling$registerForAllProfilingResults$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.core.os.Profiling$registerForAllProfilingResults$1.bW_(profilingManager, consumer);
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

    public static /* synthetic */ void bV_(kotlinx.coroutines.channels.ProducerScope producerScope, android.os.ProfilingResult profilingResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(profilingResult);
        producerScope.mo9266trySendJP2dKIU(profilingResult);
    }

    public static /* synthetic */ kotlin.Unit bW_(android.os.ProfilingManager profilingManager, java.util.function.Consumer consumer) {
        profilingManager.unregisterForAllProfilingResults(consumer);
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super android.os.ProfilingResult> producerScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.core.os.Profiling$registerForAllProfilingResults$1) create(producerScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.core.os.Profiling$registerForAllProfilingResults$1 profiling$registerForAllProfilingResults$1 = new androidx.core.os.Profiling$registerForAllProfilingResults$1(this.Camera2StreamConfigurationMap, continuation);
        profiling$registerForAllProfilingResults$1.getHighResolutionOutputSizeshNQ4ISI = obj;
        return profiling$registerForAllProfilingResults$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Profiling$registerForAllProfilingResults$1(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.core.os.Profiling$registerForAllProfilingResults$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = context;
    }
}
