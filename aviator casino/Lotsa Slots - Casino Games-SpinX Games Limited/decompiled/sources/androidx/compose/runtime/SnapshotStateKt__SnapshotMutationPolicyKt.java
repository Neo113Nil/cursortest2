package androidx.compose.runtime;

/* compiled from: SnapshotMutationPolicy.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002¨\u0006\u0005"}, d2 = {"neverEqualPolicy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "T", "referentialEqualityPolicy", "structuralEqualityPolicy", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotMutationPolicyKt {
    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        androidx.compose.runtime.ReferentialEqualityPolicy referentialEqualityPolicy = androidx.compose.runtime.ReferentialEqualityPolicy.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(referentialEqualityPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy>");
        return referentialEqualityPolicy;
    }

    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        androidx.compose.runtime.StructuralEqualityPolicy structuralEqualityPolicy = androidx.compose.runtime.StructuralEqualityPolicy.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(structuralEqualityPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy>");
        return structuralEqualityPolicy;
    }

    public static final <T> androidx.compose.runtime.SnapshotMutationPolicy<T> neverEqualPolicy() {
        androidx.compose.runtime.NeverEqualPolicy neverEqualPolicy = androidx.compose.runtime.NeverEqualPolicy.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNull(neverEqualPolicy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy>");
        return neverEqualPolicy;
    }
}
