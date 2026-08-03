package kotlinx.coroutines.debug.internal;

/* compiled from: Comparisons.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugProbesImpl$dumpCoroutinesInfoImpl$$inlined$sortedBy$1<T> implements java.util.Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Long.valueOf(((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) t).info.sequenceNumber), java.lang.Long.valueOf(((kotlinx.coroutines.debug.internal.DebugProbesImpl.CoroutineOwner) t2).info.sequenceNumber));
    }
}
