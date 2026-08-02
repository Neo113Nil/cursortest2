package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"T", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "referentialEqualityPolicy", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "structuralEqualityPolicy", "neverEqualPolicy"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes6.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotMutationPolicyKt {
    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        androidx.compose.runtime.ReferentialEqualityPolicy referentialEqualityPolicy = androidx.compose.runtime.ReferentialEqualityPolicy.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(referentialEqualityPolicy, "");
        return referentialEqualityPolicy;
    }

    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        androidx.compose.runtime.StructuralEqualityPolicy structuralEqualityPolicy = androidx.compose.runtime.StructuralEqualityPolicy.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(structuralEqualityPolicy, "");
        return structuralEqualityPolicy;
    }

    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> neverEqualPolicy() {
        androidx.compose.runtime.NeverEqualPolicy neverEqualPolicy = androidx.compose.runtime.NeverEqualPolicy.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(neverEqualPolicy, "");
        return neverEqualPolicy;
    }
}
