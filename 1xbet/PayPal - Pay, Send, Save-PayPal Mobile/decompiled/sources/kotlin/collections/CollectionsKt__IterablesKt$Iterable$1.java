package kotlin.collections;

/* JADX INFO: Add missing generic type declarations: [T] */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/collections/CollectionsKt__IterablesKt$Iterable$1;", "", "", "iterator", "()Ljava/util/Iterator;"}, k = 1, mv = {2, 3, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class CollectionsKt__IterablesKt$Iterable$1<T> implements java.lang.Iterable<T>, kotlin.jvm.internal.markers.KMappedMarker {
    final /* synthetic */ kotlin.jvm.functions.Function0<java.util.Iterator<T>> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionsKt__IterablesKt$Iterable$1(kotlin.jvm.functions.Function0<? extends java.util.Iterator<? extends T>> function0) {
        this.Camera2StreamConfigurationMap = function0;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return this.Camera2StreamConfigurationMap.invoke();
    }
}
