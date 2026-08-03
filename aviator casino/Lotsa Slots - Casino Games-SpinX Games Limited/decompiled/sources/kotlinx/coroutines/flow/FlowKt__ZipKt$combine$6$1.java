package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Zip.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class FlowKt__ZipKt$combine$6$1<T> implements kotlin.jvm.functions.Function0<T[]> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flowArray;

    public FlowKt__ZipKt$combine$6$1(kotlinx.coroutines.flow.Flow<T>[] flowArr) {
        this.$flowArray = flowArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T[] invoke() {
        int length = this.$flowArray.length;
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(0, "T?");
        return (T[]) new java.lang.Object[length];
    }
}
