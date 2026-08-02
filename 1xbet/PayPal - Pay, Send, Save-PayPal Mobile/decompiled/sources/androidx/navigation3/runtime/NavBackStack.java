package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 <*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00060\u0005j\u0002`\u0006:\u0001<B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bB\u001d\b\u0016\u0012\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\r\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u0014J\u001e\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001J\u001f\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001J\t\u0010\u001b\u001a\u00020\u0015H\u0096\u0001J\u0016\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001J\u0016\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0003¢\u0006\u0002\u0010\u001fJ\u0016\u0010 \u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010!J\t\u0010\"\u001a\u00020\u0012H\u0096\u0001J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0003J\u0016\u0010%\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010!J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'H\u0096\u0001J\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000'2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001J#\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0096\u0001J\u0011\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020)H\u0096\u0001J\u0016\u0010/\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010\u0014J\u0017\u00100\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001J\u0016\u00101\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0002\u0010\u001fJ\u0017\u00102\u001a\u00020\u00122\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0096\u0001J\u001e\u00103\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0002\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u00106\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0096\u0001R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0012\u00108\u001a\u00020)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:R\t\u0010;\u001a\u00020\u0017X\u0096\u0005¨\u0006="}, d2 = {"Landroidx/navigation3/runtime/NavBackStack;", "T", "Landroidx/navigation3/runtime/NavKey;", "", "Landroidx/compose/runtime/snapshots/StateObject;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "base", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "()V", "elements", "", "([Landroidx/navigation3/runtime/NavKey;)V", "getBase$navigation3_runtime", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "", "element", "(Landroidx/navigation3/runtime/NavKey;)Z", "", "index", "", "(ILandroidx/navigation3/runtime/NavKey;)V", "addAll", "", "clear", "contains", "containsAll", "get", "(I)Landroidx/navigation3/runtime/NavKey;", "indexOf", "(Landroidx/navigation3/runtime/NavKey;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "mergeRecords", "Landroidx/compose/runtime/snapshots/StateRecord;", "previous", "current", "applied", "prependStateRecord", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "remove", "removeAll", "removeAt", "retainAll", "set", "(ILandroidx/navigation3/runtime/NavKey;)Landroidx/navigation3/runtime/NavKey;", "subList", "fromIndex", "toIndex", "firstStateRecord", "getFirstStateRecord", "()Landroidx/compose/runtime/snapshots/StateRecord;", io.ktor.http.ContentDisposition.Parameters.Size, "Companion", "navigation3-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable(with = androidx.navigation3.runtime.serialization.NavBackStackSerializer.class)
/* loaded from: classes3.dex */
public final class NavBackStack<T extends androidx.navigation3.runtime.NavKey> implements java.util.List<T>, androidx.compose.runtime.snapshots.StateObject, java.util.RandomAccess, kotlin.jvm.internal.markers.KMutableList {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.navigation3.runtime.NavBackStack.Companion INSTANCE = new androidx.navigation3.runtime.NavBackStack.Companion(null);
    private final androidx.compose.runtime.snapshots.SnapshotStateList<T> base;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005\"\u0004\b\u0001\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/navigation3/runtime/NavBackStack$Companion;", "", "<init>", "()V", "T", "Lkotlinx/serialization/KSerializer;", "typeSerial0", "Landroidx/navigation3/runtime/NavBackStack;", "serializer", "(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final <T> kotlinx.serialization.KSerializer<androidx.navigation3.runtime.NavBackStack<T>> serializer(kotlinx.serialization.KSerializer<T> typeSerial0) {
            return new androidx.navigation3.runtime.serialization.NavBackStackSerializer(typeSerial0);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NavBackStack(androidx.compose.runtime.snapshots.SnapshotStateList<T> snapshotStateList) {
        this.base = snapshotStateList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof androidx.navigation3.runtime.NavKey) {
            return contains((androidx.navigation3.runtime.NavBackStack<T>) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof androidx.navigation3.runtime.NavKey) {
            return indexOf((androidx.navigation3.runtime.NavBackStack<T>) obj);
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof androidx.navigation3.runtime.NavKey) {
            return lastIndexOf((androidx.navigation3.runtime.NavBackStack<T>) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final T remove(int i) {
        return removeAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(java.lang.Object obj) {
        if (obj instanceof androidx.navigation3.runtime.NavKey) {
            return remove((androidx.navigation3.runtime.NavBackStack<T>) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final androidx.compose.runtime.snapshots.SnapshotStateList<T> getBase$navigation3_runtime() {
        return this.base;
    }

    public NavBackStack() {
        this(androidx.compose.runtime.SnapshotStateKt.mutableStateListOf());
    }

    public NavBackStack(T... tArr) {
        this(androidx.compose.runtime.SnapshotStateKt.mutableStateListOf(java.util.Arrays.copyOf(tArr, tArr.length)));
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.List
    public final java.util.List<T> subList(int fromIndex, int toIndex) {
        return this.base.subList(fromIndex, toIndex);
    }

    @Override // java.util.List
    public final T set(int index, T element) {
        return this.base.set(index, element);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> elements) {
        return this.base.retainAll(elements);
    }

    public final T removeAt(int index) {
        return this.base.remove(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> elements) {
        return this.base.removeAll(elements);
    }

    public final boolean remove(T element) {
        return this.base.remove(element);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final void prependStateRecord(androidx.compose.runtime.snapshots.StateRecord value) {
        this.base.prependStateRecord(value);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final androidx.compose.runtime.snapshots.StateRecord mergeRecords(androidx.compose.runtime.snapshots.StateRecord previous, androidx.compose.runtime.snapshots.StateRecord current, androidx.compose.runtime.snapshots.StateRecord applied) {
        return this.base.mergeRecords(previous, current, applied);
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator(int index) {
        return this.base.listIterator(index);
    }

    @Override // java.util.List
    public final java.util.ListIterator<T> listIterator() {
        return this.base.listIterator();
    }

    public final int lastIndexOf(T element) {
        return this.base.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<T> iterator() {
        return this.base.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.base.isEmpty();
    }

    public final int indexOf(T element) {
        return this.base.indexOf(element);
    }

    public final int getSize() {
        return this.base.size();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public final androidx.compose.runtime.snapshots.StateRecord getFirstStateRecord() {
        return this.base.getFirstStateRecord();
    }

    @Override // java.util.List
    public final T get(int index) {
        return this.base.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        return this.base.containsAll(elements);
    }

    public final boolean contains(T element) {
        return this.base.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.base.clear();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends T> elements) {
        return this.base.addAll(elements);
    }

    @Override // java.util.List
    public final boolean addAll(int index, java.util.Collection<? extends T> elements) {
        return this.base.addAll(index, elements);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T element) {
        return this.base.add(element);
    }

    @Override // java.util.List
    public final void add(int index, T element) {
        this.base.add(index, element);
    }
}
