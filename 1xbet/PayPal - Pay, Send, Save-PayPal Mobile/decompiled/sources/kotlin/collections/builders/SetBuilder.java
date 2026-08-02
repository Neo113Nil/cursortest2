package kotlin.collections.builders;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\f\b\u0000\u0018\u0000 1*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005:\u00011B\u001b\b\u0000\u0012\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\nJ\u0017\u0010 \u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u001eJ\u0017\u0010!\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u001eJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\"H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b)\u0010(J\u001d\u0010*\u001a\u00020\u00192\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b*\u0010(R\u001e\u0010-\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00100\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/"}, d2 = {"Lkotlin/collections/builders/SetBuilder;", "E", "", "Lkotlin/collections/AbstractMutableSet;", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "Lkotlin/collections/builders/MapBuilder;", "backing", "<init>", "(Lkotlin/collections/builders/MapBuilder;)V", "()V", "", "initialCapacity", "(I)V", "", "build", "()Ljava/util/Set;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "", "isEmpty", "()Z", "element", "contains", "(Ljava/lang/Object;)Z", "clear", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "remove", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "addAll", "(Ljava/util/Collection;)Z", "removeAll", "retainAll", "getHighSpeedVideoFpsRangesFor", "Lkotlin/collections/builders/MapBuilder;", "Camera2StreamConfigurationMap", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SetBuilder<E> extends kotlin.collections.AbstractMutableSet<E> implements java.util.Set<E>, java.io.Serializable, kotlin.jvm.internal.markers.KMutableSet {
    private static final kotlin.collections.builders.SetBuilder.Companion Companion = new kotlin.collections.builders.SetBuilder.Companion(null);
    private static final kotlin.collections.builders.SetBuilder getHighSpeedVideoSizes = new kotlin.collections.builders.SetBuilder(kotlin.collections.builders.MapBuilder.INSTANCE.getEmpty$kotlin_stdlib());

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.collections.builders.MapBuilder<E, ?> Camera2StreamConfigurationMap;

    public SetBuilder(kotlin.collections.builders.MapBuilder<E, ?> mapBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mapBuilder, "");
        this.Camera2StreamConfigurationMap = mapBuilder;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/collections/builders/SetBuilder$Companion;", "", "<init>", "()V", "Lkotlin/collections/builders/SetBuilder;", "", "getHighSpeedVideoSizes", "Lkotlin/collections/builders/SetBuilder;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SetBuilder() {
        this(new kotlin.collections.builders.MapBuilder());
    }

    public SetBuilder(int i) {
        this(new kotlin.collections.builders.MapBuilder(i));
    }

    public final java.util.Set<E> build() {
        this.Camera2StreamConfigurationMap.build();
        return size() > 0 ? this : getHighSpeedVideoSizes;
    }

    private final java.lang.Object writeReplace() {
        if (this.Camera2StreamConfigurationMap.getIsReadOnly()) {
            return new kotlin.collections.builders.SerializedCollection(this, 1);
        }
        throw new java.io.NotSerializableException("The set cannot be serialized while it is being built.");
    }

    private final void readObject(java.io.ObjectInputStream input) {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    @Override // kotlin.collections.AbstractMutableSet
    public final int getSize() {
        return this.Camera2StreamConfigurationMap.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.Camera2StreamConfigurationMap.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object element) {
        return this.Camera2StreamConfigurationMap.containsKey(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.Camera2StreamConfigurationMap.clear();
    }

    @Override // kotlin.collections.AbstractMutableSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E element) {
        return this.Camera2StreamConfigurationMap.addKey$kotlin_stdlib(element) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object element) {
        return this.Camera2StreamConfigurationMap.removeKey$kotlin_stdlib(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator<E> iterator() {
        return this.Camera2StreamConfigurationMap.keysIterator$kotlin_stdlib();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        this.Camera2StreamConfigurationMap.checkIsMutable$kotlin_stdlib();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        this.Camera2StreamConfigurationMap.checkIsMutable$kotlin_stdlib();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        this.Camera2StreamConfigurationMap.checkIsMutable$kotlin_stdlib();
        return super.retainAll(elements);
    }
}
