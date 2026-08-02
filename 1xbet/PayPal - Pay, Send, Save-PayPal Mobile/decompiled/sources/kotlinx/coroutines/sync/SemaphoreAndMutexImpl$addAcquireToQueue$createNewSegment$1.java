package kotlinx.coroutines.sync;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.sync.SemaphoreSegment, kotlinx.coroutines.sync.SemaphoreSegment> {
    public static final kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 Camera2StreamConfigurationMap = new kotlinx.coroutines.sync.SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1();

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment invoke(java.lang.Long l, kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment) {
        return kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(l.longValue(), semaphoreSegment);
    }

    SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, kotlinx.coroutines.sync.SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }
}
