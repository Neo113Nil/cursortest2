package kotlinx.coroutines.sync;

/* compiled from: Semaphore.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.sync.SemaphoreSegment, kotlinx.coroutines.sync.SemaphoreSegment> {
    public static final kotlinx.coroutines.sync.SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 INSTANCE = new kotlinx.coroutines.sync.SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1();

    SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1() {
        super(2, kotlinx.coroutines.sync.SemaphoreKt.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ kotlinx.coroutines.sync.SemaphoreSegment invoke(java.lang.Long l, kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment) {
        return invoke(l.longValue(), semaphoreSegment);
    }

    public final kotlinx.coroutines.sync.SemaphoreSegment invoke(long j, kotlinx.coroutines.sync.SemaphoreSegment semaphoreSegment) {
        kotlinx.coroutines.sync.SemaphoreSegment createSegment;
        createSegment = kotlinx.coroutines.sync.SemaphoreKt.createSegment(j, semaphoreSegment);
        return createSegment;
    }
}
