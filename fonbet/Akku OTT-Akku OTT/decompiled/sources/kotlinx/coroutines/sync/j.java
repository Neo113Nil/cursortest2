package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.u;

@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n370#1,2:397\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n383#1:397,2\n*E\n"})
/* loaded from: classes5.dex */
public final class j extends u<j> {
    public final /* synthetic */ AtomicReferenceArray e;

    public j(long j, j jVar, int i) {
        super(j, jVar, i);
        this.e = new AtomicReferenceArray(i.f);
    }

    @Override // kotlinx.coroutines.internal.u
    public final int g() {
        return i.f;
    }

    @Override // kotlinx.coroutines.internal.u
    public final void h(int i, CoroutineContext coroutineContext) {
        this.e.set(i, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
