package androidx.compose.runtime;

/* compiled from: SnapshotMutationPolicy.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÂ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/StructuralEqualityPolicy;", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "", "()V", "equivalent", "", "a", "b", "toString", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class StructuralEqualityPolicy implements androidx.compose.runtime.SnapshotMutationPolicy<java.lang.Object> {
    public static final androidx.compose.runtime.StructuralEqualityPolicy INSTANCE = new androidx.compose.runtime.StructuralEqualityPolicy();

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public /* synthetic */ java.lang.Object merge(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        return androidx.compose.runtime.SnapshotMutationPolicy.CC.$default$merge(this, obj, obj2, obj3);
    }

    private StructuralEqualityPolicy() {
    }

    @Override // androidx.compose.runtime.SnapshotMutationPolicy
    public boolean equivalent(java.lang.Object a2, java.lang.Object b) {
        return kotlin.jvm.internal.Intrinsics.areEqual(a2, b);
    }

    public java.lang.String toString() {
        return "StructuralEqualityPolicy";
    }
}
