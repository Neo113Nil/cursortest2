package kotlin.sequences;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\u00060\u0018j\u0002`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u001d\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Lkotlin/sequences/SequenceBuilderIterator;", "T", "Lkotlin/sequences/SequenceScope;", "", "Lkotlin/coroutines/Continuation;", "", "<init>", "()V", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "", "getHighSpeedVideoFpsRangesFor", "()Ljava/lang/Throwable;", "p0", "yield", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "yieldAll", "(Ljava/util/Iterator;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Result;", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Ljava/util/Iterator;", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class SequenceBuilderIterator<T> extends kotlin.sequences.SequenceScope<T> implements java.util.Iterator<T>, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.util.Iterator<? extends T> getHighSpeedVideoSizes;
    kotlin.coroutines.Continuation<? super kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private T getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw getHighSpeedVideoFpsRangesFor();
                }
                java.util.Iterator<? extends T> it = this.getHighSpeedVideoSizes;
                kotlin.jvm.internal.Intrinsics.checkNotNull(it);
                if (it.hasNext()) {
                    this.getHighSpeedVideoFpsRanges = 2;
                    return true;
                }
                this.getHighSpeedVideoSizes = null;
            }
            this.getHighSpeedVideoFpsRanges = 5;
            kotlin.coroutines.Continuation<? super kotlin.Unit> continuation = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation);
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m23436constructorimpl(unit));
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        do {
            int i = this.getHighSpeedVideoFpsRanges;
            if (i != 0 && i != 1) {
                if (i == 2) {
                    this.getHighSpeedVideoFpsRanges = 1;
                    java.util.Iterator<? extends T> it = this.getHighSpeedVideoSizes;
                    kotlin.jvm.internal.Intrinsics.checkNotNull(it);
                    return it.next();
                }
                if (i == 3) {
                    this.getHighSpeedVideoFpsRanges = 0;
                    T t = this.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRangesFor = null;
                    return t;
                }
                throw getHighSpeedVideoFpsRangesFor();
            }
        } while (hasNext());
        throw new java.util.NoSuchElementException();
    }

    private final java.lang.Throwable getHighSpeedVideoFpsRangesFor() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 4) {
            return new java.util.NoSuchElementException();
        }
        if (i == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected state of the iterator: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        return new java.lang.IllegalStateException(sb.toString());
    }

    @Override // kotlin.sequences.SequenceScope
    public final java.lang.Object yield(T t, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoFpsRangesFor = t;
        this.getHighSpeedVideoFpsRanges = 3;
        this.getHighResolutionOutputSizeshNQ4ISI = continuation;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.sequences.SequenceScope
    public final java.lang.Object yieldAll(java.util.Iterator<? extends T> it, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!it.hasNext()) {
            return kotlin.Unit.INSTANCE;
        }
        this.getHighSpeedVideoSizes = it;
        this.getHighSpeedVideoFpsRanges = 2;
        this.getHighResolutionOutputSizeshNQ4ISI = continuation;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object p0) {
        kotlin.ResultKt.throwOnFailure(p0);
        this.getHighSpeedVideoFpsRanges = 4;
    }

    @Override // kotlin.coroutines.Continuation
    public final kotlin.coroutines.CoroutineContext getContext() {
        return kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
