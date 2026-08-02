package androidx.work.impl;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.u;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC1096l;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/work/impl/ToContinuation;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/u;", "futureToObserve", "Lkotlinx/coroutines/l;", "continuation", "<init>", "(Lcom/google/common/util/concurrent/u;Lkotlinx/coroutines/l;)V", "", "run", "()V", "Lcom/google/common/util/concurrent/u;", "getFutureToObserve", "()Lcom/google/common/util/concurrent/u;", "Lkotlinx/coroutines/l;", "getContinuation", "()Lkotlinx/coroutines/l;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ToContinuation<T> implements Runnable {
    private final InterfaceC1096l<T> continuation;
    private final u<T> futureToObserve;

    /* JADX WARN: Multi-variable type inference failed */
    public ToContinuation(u<T> futureToObserve, InterfaceC1096l<? super T> continuation) {
        Intrinsics.checkNotNullParameter(futureToObserve, "futureToObserve");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.futureToObserve = futureToObserve;
        this.continuation = continuation;
    }

    public final InterfaceC1096l<T> getContinuation() {
        return this.continuation;
    }

    public final u<T> getFutureToObserve() {
        return this.futureToObserve;
    }

    @Override // java.lang.Runnable
    public void run() {
        Throwable nonNullCause;
        Object uninterruptibly;
        if (this.futureToObserve.isCancelled()) {
            this.continuation.cancel(null);
            return;
        }
        try {
            InterfaceC1096l<T> interfaceC1096l = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            uninterruptibly = WorkerWrapperKt.getUninterruptibly(this.futureToObserve);
            interfaceC1096l.resumeWith(Result.m1716constructorimpl(uninterruptibly));
        } catch (ExecutionException e) {
            InterfaceC1096l<T> interfaceC1096l2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            nonNullCause = WorkerWrapperKt.nonNullCause(e);
            interfaceC1096l2.resumeWith(Result.m1716constructorimpl(ResultKt.createFailure(nonNullCause)));
        }
    }
}
