package kotlinx.serialization.json;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000b\b\u0007\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001.B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001fH\u0096\u0003¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\"\u0010\u001cJ\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010#2\u0006\u0010\u0018\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b$\u0010&J&\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010'\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010-\u001a\u00020\u000b8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\r"}, d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "content", "<init>", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "contains", "(Lkotlinx/serialization/json/JsonElement;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Lkotlinx/serialization/json/JsonElement;", "indexOf", "(Lkotlinx/serialization/json/JsonElement;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "Ljava/util/List;", "getSize", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = kotlinx.serialization.json.JsonArraySerializer.class)
/* loaded from: classes5.dex */
public final class JsonArray extends kotlinx.serialization.json.JsonElement implements java.util.List<kotlinx.serialization.json.JsonElement>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlinx.serialization.json.JsonArray.Companion INSTANCE = new kotlinx.serialization.json.JsonArray.Companion(null);
    private final java.util.List<kotlinx.serialization.json.JsonElement> content;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<kotlinx.serialization.json.JsonArray> serializer() {
            return kotlinx.serialization.json.JsonArraySerializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(java.util.List<? extends kotlinx.serialization.json.JsonElement> list) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.content = list;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof kotlinx.serialization.json.JsonElement) {
            return contains((kotlinx.serialization.json.JsonElement) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof kotlinx.serialization.json.JsonElement) {
            return indexOf((kotlinx.serialization.json.JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof kotlinx.serialization.json.JsonElement) {
            return lastIndexOf((kotlinx.serialization.json.JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object other) {
        return kotlin.jvm.internal.Intrinsics.areEqual(this.content, other);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.content.hashCode();
    }

    public final java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.content, ",", "[", "]", 0, null, null, 56, null);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final java.util.List<kotlinx.serialization.json.JsonElement> subList(int fromIndex, int toIndex) {
        return this.content.subList(fromIndex, toIndex);
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super kotlinx.serialization.json.JsonElement> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement set2(int i, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ kotlinx.serialization.json.JsonElement set(int i, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<kotlinx.serialization.json.JsonElement> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* renamed from: remove, reason: avoid collision after fix types in other method */
    public final kotlinx.serialization.json.JsonElement remove2(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ kotlinx.serialization.json.JsonElement remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator<kotlinx.serialization.json.JsonElement> listIterator(int index) {
        return this.content.listIterator(index);
    }

    @Override // java.util.List
    public final java.util.ListIterator<kotlinx.serialization.json.JsonElement> listIterator() {
        return this.content.listIterator();
    }

    public final int lastIndexOf(kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return this.content.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<kotlinx.serialization.json.JsonElement> iterator() {
        return this.content.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.content.isEmpty();
    }

    public final int indexOf(kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return this.content.indexOf(element);
    }

    public final int getSize() {
        return this.content.size();
    }

    @Override // java.util.List
    public final kotlinx.serialization.json.JsonElement get(int index) {
        return this.content.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        return this.content.containsAll(elements);
    }

    public final boolean contains(kotlinx.serialization.json.JsonElement element) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(element, "");
        return this.content.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends kotlinx.serialization.json.JsonElement> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends kotlinx.serialization.json.JsonElement> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public final void add2(int i, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, kotlinx.serialization.json.JsonElement jsonElement) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
