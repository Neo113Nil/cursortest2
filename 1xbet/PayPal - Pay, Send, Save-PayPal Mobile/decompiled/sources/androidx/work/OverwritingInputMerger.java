package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/work/OverwritingInputMerger;", "Landroidx/work/InputMerger;", "<init>", "()V", "", "Landroidx/work/Data;", "inputs", "merge", "(Ljava/util/List;)Landroidx/work/Data;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OverwritingInputMerger extends androidx.work.InputMerger {
    @Override // androidx.work.InputMerger
    public final androidx.work.Data merge(java.util.List<androidx.work.Data> inputs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inputs, "");
        androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator<androidx.work.Data> it = inputs.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll(it.next().getKeyValueMap());
        }
        builder.putAll(linkedHashMap);
        return builder.build();
    }
}
