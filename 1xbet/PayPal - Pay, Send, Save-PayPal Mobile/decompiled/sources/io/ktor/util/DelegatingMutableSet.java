package io.ktor.util;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u0006\u0012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\b\u0010\fJ\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0010J\u001d\u0010\u0018\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0013J\u001d\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u0013J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u001d\u0010\u001b\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u0013J\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0096\u0002¢\u0006\u0004\b&\u0010\u0010J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R%\u0010-\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R%\u0010/\u001a\u0013\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\b\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00100\u001a\u00020!8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010#"}, d2 = {"Lio/ktor/util/DelegatingMutableSet;", com.google.common.net.HttpHeaders.FROM, "To", "", "delegate", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "convertTo", "convert", "<init>", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "", "(Ljava/util/Collection;)Ljava/util/Collection;", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "elements", "addAll", "(Ljava/util/Collection;)Z", "", "clear", "()V", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "hashCode", "()I", "", "other", "equals", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoSizes", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public class DelegatingMutableSet<From, To> implements java.util.Set<To>, kotlin.jvm.internal.markers.KMutableSet {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<From> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function1<From, To> getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<To, From> getHighSpeedVideoSizes;
    private final int size;

    /* JADX WARN: Multi-variable type inference failed */
    public DelegatingMutableSet(java.util.Set<From> set, kotlin.jvm.functions.Function1<? super From, ? extends To> function1, kotlin.jvm.functions.Function1<? super To, ? extends From> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.getHighResolutionOutputSizeshNQ4ISI = set;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighSpeedVideoSizes = function12;
        this.size = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return getSize();
    }

    public java.util.Collection<From> convert(java.util.Collection<? extends To> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<? extends To> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.getHighSpeedVideoSizes.invoke(it.next()));
        }
        return arrayList;
    }

    public java.util.Collection<To> convertTo(java.util.Collection<? extends From> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<? extends From> collection2 = collection;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(collection2, 10));
        java.util.Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.getHighSpeedVideoFpsRanges.invoke(it.next()));
        }
        return arrayList;
    }

    public int getSize() {
        return this.size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(To element) {
        return this.getHighResolutionOutputSizeshNQ4ISI.add(this.getHighSpeedVideoSizes.invoke(element));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection<? extends To> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.addAll(convert(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object element) {
        return this.getHighResolutionOutputSizeshNQ4ISI.remove(this.getHighSpeedVideoSizes.invoke(element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.removeAll(kotlin.collections.CollectionsKt.toSet(convert(elements)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.retainAll(kotlin.collections.CollectionsKt.toSet(convert(elements)));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(java.lang.Object element) {
        return this.getHighResolutionOutputSizeshNQ4ISI.contains(this.getHighSpeedVideoSizes.invoke(element));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.containsAll(convert(elements));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator<To> iterator() {
        return new io.ktor.util.DelegatingMutableSet$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(java.lang.Object other) {
        if (other == null || !(other instanceof java.util.Set)) {
            return false;
        }
        java.util.Collection<To> convertTo = convertTo(this.getHighResolutionOutputSizeshNQ4ISI);
        return ((java.util.Set) other).containsAll(convertTo) && convertTo.containsAll((java.util.Collection) other);
    }

    public java.lang.String toString() {
        return convertTo(this.getHighResolutionOutputSizeshNQ4ISI).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }
}
