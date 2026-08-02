package androidx.concurrent.futures;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.util.concurrent.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.C1049c0;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.I;
import kotlinx.coroutines.K;
import kotlinx.coroutines.M;
import kotlinx.coroutines.S;
import kotlinx.coroutines.T;
import kotlinx.coroutines.internal.p;
import kotlinx.coroutines.scheduling.c;

@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0011\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072'\u0010\r\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0002\b\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/concurrent/futures/SuspendToFutureAdapter;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "", "launchUndispatched", "Lkotlin/Function2;", "Lkotlinx/coroutines/K;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "block", "Lcom/google/common/util/concurrent/u;", "launchFuture", "(Lkotlin/coroutines/CoroutineContext;ZLkotlin/jvm/functions/Function2;)Lcom/google/common/util/concurrent/u;", "androidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1", "GlobalListenableFutureScope", "Landroidx/concurrent/futures/SuspendToFutureAdapter$GlobalListenableFutureScope$1;", "Lkotlinx/coroutines/I;", "GlobalListenableFutureAwaitContext", "Lkotlinx/coroutines/I;", "DeferredFuture", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuspendToFutureAdapter {
    public static final SuspendToFutureAdapter INSTANCE = new SuspendToFutureAdapter();
    private static final SuspendToFutureAdapter$GlobalListenableFutureScope$1 GlobalListenableFutureScope = new K() { // from class: androidx.concurrent.futures.SuspendToFutureAdapter$GlobalListenableFutureScope$1
        private final CoroutineContext coroutineContext;

        {
            c cVar = C1049c0.a;
            this.coroutineContext = p.a;
        }

        @Override // kotlinx.coroutines.K
        public CoroutineContext getCoroutineContext() {
            return this.coroutineContext;
        }
    };
    private static final I GlobalListenableFutureAwaitContext = C1049c0.b;

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\"\u0010$\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00018\u00008\u00000\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Landroidx/concurrent/futures/SuspendToFutureAdapter$DeferredFuture;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/google/common/util/concurrent/u;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/S;", "resultDeferred", "<init>", "(Lkotlinx/coroutines/S;)V", "", "shouldInterrupt", "cancel", "(Z)Z", "isCancelled", "()Z", "isDone", "get", "()Ljava/lang/Object;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "Ljava/lang/Runnable;", "listener", "Ljava/util/concurrent/Executor;", "executor", "", "addListener", "(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/S;", "Landroidx/concurrent/futures/ResolvableFuture;", "kotlin.jvm.PlatformType", "delegateFuture", "Landroidx/concurrent/futures/ResolvableFuture;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class DeferredFuture<T> implements u<T>, Continuation<T> {
        private final ResolvableFuture<T> delegateFuture = ResolvableFuture.create();
        private final S<T> resultDeferred;

        /* JADX WARN: Multi-variable type inference failed */
        public DeferredFuture(S<? extends T> s) {
            this.resultDeferred = s;
        }

        @Override // com.google.common.util.concurrent.u
        public void addListener(Runnable listener, Executor executor) {
            this.delegateFuture.addListener(listener, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean shouldInterrupt) {
            boolean cancel = this.delegateFuture.cancel(shouldInterrupt);
            if (cancel) {
                this.resultDeferred.cancel((CancellationException) null);
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public T get() {
            return this.delegateFuture.get();
        }

        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public CoroutineContext get$context() {
            return SuspendToFutureAdapter.GlobalListenableFutureAwaitContext;
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegateFuture.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegateFuture.isDone();
        }

        @Override // kotlin.coroutines.Continuation
        public void resumeWith(Object result) {
            Throwable m1719exceptionOrNullimpl = Result.m1719exceptionOrNullimpl(result);
            if (m1719exceptionOrNullimpl == null) {
                this.delegateFuture.set(result);
            } else if (m1719exceptionOrNullimpl instanceof CancellationException) {
                this.delegateFuture.cancel(false);
            } else {
                this.delegateFuture.setException(m1719exceptionOrNullimpl);
            }
        }

        @Override // java.util.concurrent.Future
        public T get(long timeout, TimeUnit unit) {
            return this.delegateFuture.get(timeout, unit);
        }
    }

    private SuspendToFutureAdapter() {
    }

    public static /* synthetic */ u launchFuture$default(SuspendToFutureAdapter suspendToFutureAdapter, CoroutineContext coroutineContext, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return suspendToFutureAdapter.launchFuture(coroutineContext, z, function2);
    }

    public final <T> u<T> launchFuture(CoroutineContext context, boolean launchUndispatched, Function2<? super K, ? super Continuation<? super T>, ? extends Object> block) {
        T a = C1082i.a(GlobalListenableFutureScope, context, launchUndispatched ? M.d : M.a, block);
        DeferredFuture deferredFuture = new DeferredFuture(a);
        Continuation<Unit> createCoroutine = ContinuationKt.createCoroutine(new SuspendToFutureAdapter$launchFuture$1$1(a), deferredFuture);
        Result.Companion companion = Result.INSTANCE;
        createCoroutine.resumeWith(Result.m1716constructorimpl(Unit.INSTANCE));
        return deferredFuture;
    }
}
