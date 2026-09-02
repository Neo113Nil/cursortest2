package com.goldenboot.saga.zone;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0096\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$2\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b%\u0010'J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u0010\u000e¨\u00062"}, d2 = {"Lcom/goldenboot/saga/zone/GridCallback;", "Lcom/goldenboot/saga/zone/VibrationMaterializer;", "", "Lcom/goldenboot/saga/zone/AlarmHook;", "fonts", "<init>", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "flattenPackage", "(Lcom/goldenboot/saga/zone/AlarmHook;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "injectConstraint", "(I)Lcom/goldenboot/saga/zone/AlarmHook;", "inflateEdge", "(Lcom/goldenboot/saga/zone/AlarmHook;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "queryModel", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "decodePath", "Ljava/util/List;", "storeCharset", "()Ljava/util/List;", "filterPayload", "size", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.goldenboot.saga.zone.GridCallback, reason: from toString */
/* loaded from: classes.dex */
public final class FontListFontFamily extends VibrationMaterializer implements List<AlarmHook>, KMappedMarker {
    public static final int drawScope = 0;

    /* renamed from: decodePath, reason: from kotlin metadata and from toString */
    private final List<AlarmHook> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(List<? extends AlarmHook> list) {
        super(null);
        this.fonts = list;
        if (list.isEmpty()) {
            EmitterUpgrade.flushSample("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, AlarmHook alarmHook) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends AlarmHook> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AlarmHook bindBody() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof AlarmHook) {
            return flattenPackage((AlarmHook) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> elements) {
        return this.fonts.containsAll(elements);
    }

    public AlarmHook dispatchTimezone(int i, AlarmHook alarmHook) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontListFontFamily) && Intrinsics.areEqual(this.fonts, ((FontListFontFamily) other).fonts);
    }

    public void expandArgs(int i, AlarmHook alarmHook) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int filterPayload() {
        return this.fonts.size();
    }

    public boolean findTask(AlarmHook alarmHook) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean flattenPackage(AlarmHook element) {
        return this.fonts.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.fonts.hashCode();
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof AlarmHook) {
            return inflateEdge((AlarmHook) obj);
        }
        return -1;
    }

    public int inflateEdge(AlarmHook element) {
        return this.fonts.indexOf(element);
    }

    @Override // java.util.List
    /* renamed from: injectConstraint, reason: merged with bridge method [inline-methods] */
    public AlarmHook get(int index) {
        return this.fonts.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<AlarmHook> iterator() {
        return this.fonts.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof AlarmHook) {
            return queryModel((AlarmHook) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator<AlarmHook> listIterator() {
        return this.fonts.listIterator();
    }

    public void mergeLocale(AlarmHook alarmHook) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public AlarmHook packPackage(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int queryModel(AlarmHook element) {
        return this.fonts.lastIndexOf(element);
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ AlarmHook remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator<AlarmHook> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ AlarmHook set(int i, AlarmHook alarmHook) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return filterPayload();
    }

    @Override // java.util.List
    public void sort(Comparator<? super AlarmHook> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<AlarmHook> storeCharset() {
        return this.fonts;
    }

    @Override // java.util.List
    public List<AlarmHook> subList(int fromIndex, int toIndex) {
        return this.fonts.subList(fromIndex, toIndex);
    }

    public void syncScope(AlarmHook alarmHook) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }

    public AlarmHook unlockMessage() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends AlarmHook> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator<AlarmHook> listIterator(int index) {
        return this.fonts.listIterator(index);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) CollectionToArray.toArray(this, tArr);
    }
}
