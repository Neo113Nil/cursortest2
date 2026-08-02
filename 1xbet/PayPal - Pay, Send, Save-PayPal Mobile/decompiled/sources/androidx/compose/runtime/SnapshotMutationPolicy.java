package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/SnapshotMutationPolicy;", "T", "", "a", util.h.xy.cb.b.f1091, "", "equivalent", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "previous", "current", "applied", "merge", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SnapshotMutationPolicy<T> {
    boolean equivalent(T a2, T b);

    default T merge(T previous, T current, T applied) {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> T merge(androidx.compose.runtime.SnapshotMutationPolicy<T> snapshotMutationPolicy, T t, T t2, T t3) {
            return (T) androidx.compose.runtime.SnapshotMutationPolicy.super.merge(t, t2, t3);
        }
    }
}
