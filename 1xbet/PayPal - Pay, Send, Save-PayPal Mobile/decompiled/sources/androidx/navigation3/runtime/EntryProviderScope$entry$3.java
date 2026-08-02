package androidx.navigation3.runtime;

/* JADX INFO: Add missing generic type declarations: [K] */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class EntryProviderScope$entry$3<K> implements kotlin.jvm.functions.Function1<K, java.util.Map<java.lang.String, ? extends java.lang.Object>> {
    final /* synthetic */ java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(java.lang.Object obj) {
        return invoke2((androidx.navigation3.runtime.EntryProviderScope$entry$3<K>) obj);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke2(K k) {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public EntryProviderScope$entry$3(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.getHighSpeedVideoFpsRangesFor = map;
    }
}
