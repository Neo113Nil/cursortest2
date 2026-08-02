package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lkotlinx/coroutines/internal/ThreadLocalKey;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/internal/ThreadLocalElement;", "Ljava/lang/ThreadLocal;", "threadLocal", "<init>", "(Ljava/lang/ThreadLocal;)V", "copy", "(Ljava/lang/ThreadLocal;)Lkotlinx/coroutines/internal/ThreadLocalKey;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/ThreadLocal;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ThreadLocalKey implements kotlin.coroutines.CoroutineContext.Key<kotlinx.coroutines.internal.ThreadLocalElement<?>> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.ThreadLocal<?> getHighSpeedVideoFpsRangesFor;

    public ThreadLocalKey(java.lang.ThreadLocal<?> threadLocal) {
        this.getHighSpeedVideoFpsRangesFor = threadLocal;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreadLocalKey(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof kotlinx.coroutines.internal.ThreadLocalKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, ((kotlinx.coroutines.internal.ThreadLocalKey) other).getHighSpeedVideoFpsRangesFor);
    }

    public final kotlinx.coroutines.internal.ThreadLocalKey copy(java.lang.ThreadLocal<?> threadLocal) {
        return new kotlinx.coroutines.internal.ThreadLocalKey(threadLocal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlinx.coroutines.internal.ThreadLocalKey copy$default(kotlinx.coroutines.internal.ThreadLocalKey threadLocalKey, java.lang.ThreadLocal threadLocal, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            threadLocal = threadLocalKey.getHighSpeedVideoFpsRangesFor;
        }
        return threadLocalKey.copy(threadLocal);
    }
}
