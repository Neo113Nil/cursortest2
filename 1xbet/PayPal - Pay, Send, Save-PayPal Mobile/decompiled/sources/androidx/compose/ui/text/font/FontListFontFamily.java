package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\f\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0015H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0096\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$H\u0096\u0001¢\u0006\u0004\b%\u0010&J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030$2\u0006\u0010\u0019\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b%\u0010'J&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010(\u001a\u00020\f2\u0006\u0010)\u001a\u00020\fH\u0096\u0001¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b-\u0010.R\u0014\u00100\u001a\u00020\f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "", "Landroidx/compose/ui/text/font/Font;", "fonts", "<init>", "(Ljava/util/List;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "element", "contains", "(Landroidx/compose/ui/text/font/Font;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Landroidx/compose/ui/text/font/Font;", "indexOf", "(Landroidx/compose/ui/text/font/Font;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "Ljava/util/List;", "getFonts", "()Ljava/util/List;", "getSize", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontListFontFamily extends androidx.compose.ui.text.font.FileBasedFontFamily implements java.util.List<androidx.compose.ui.text.font.Font>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 0;
    private final java.util.List<androidx.compose.ui.text.font.Font> fonts;

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamily(java.util.List<? extends androidx.compose.ui.text.font.Font> list) {
        super(null);
        this.fonts = list;
        if (list.isEmpty()) {
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.text.font.Font) {
            return contains((androidx.compose.ui.text.font.Font) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.text.font.Font) {
            return indexOf((androidx.compose.ui.text.font.Font) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.text.font.Font) {
            return lastIndexOf((androidx.compose.ui.text.font.Font) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return getSize();
    }

    public final java.util.List<androidx.compose.ui.text.font.Font> getFonts() {
        return this.fonts;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.font.FontListFontFamily) && kotlin.jvm.internal.Intrinsics.areEqual(this.fonts, ((androidx.compose.ui.text.font.FontListFontFamily) other).fonts);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.fonts.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FontListFontFamily(fonts=");
        sb.append(this.fonts);
        sb.append(')');
        return sb.toString();
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
    public final java.util.List<androidx.compose.ui.text.font.Font> subList(int fromIndex, int toIndex) {
        return this.fonts.subList(fromIndex, toIndex);
    }

    @Override // java.util.List
    public final void sort(java.util.Comparator<? super androidx.compose.ui.text.font.Font> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ androidx.compose.ui.text.font.Font set(int i, androidx.compose.ui.text.font.Font font) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public final androidx.compose.ui.text.font.Font set2(int i, androidx.compose.ui.text.font.Font font) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(java.util.function.UnaryOperator<androidx.compose.ui.text.font.Font> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeLast, reason: collision with other method in class */
    public final /* synthetic */ java.lang.Object m8136removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final androidx.compose.ui.text.font.Font removeLast() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: removeFirst, reason: collision with other method in class */
    public final /* synthetic */ java.lang.Object m8135removeFirst() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final androidx.compose.ui.text.font.Font removeFirst() {
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
    public final /* synthetic */ androidx.compose.ui.text.font.Font remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final androidx.compose.ui.text.font.Font remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final java.util.ListIterator<androidx.compose.ui.text.font.Font> listIterator(int index) {
        return this.fonts.listIterator(index);
    }

    @Override // java.util.List
    public final java.util.ListIterator<androidx.compose.ui.text.font.Font> listIterator() {
        return this.fonts.listIterator();
    }

    public final int lastIndexOf(androidx.compose.ui.text.font.Font element) {
        return this.fonts.lastIndexOf(element);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<androidx.compose.ui.text.font.Font> iterator() {
        return this.fonts.iterator();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    public final int indexOf(androidx.compose.ui.text.font.Font element) {
        return this.fonts.indexOf(element);
    }

    public final int getSize() {
        return this.fonts.size();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.List
    public final androidx.compose.ui.text.font.Font get(int index) {
        return this.fonts.get(index);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        return this.fonts.containsAll(elements);
    }

    public final boolean contains(androidx.compose.ui.text.font.Font element) {
        return this.fonts.contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addLast(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(androidx.compose.ui.text.font.Font font) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ void addFirst(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(androidx.compose.ui.text.font.Font font) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends androidx.compose.ui.text.font.Font> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i, java.util.Collection<? extends androidx.compose.ui.text.font.Font> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean add(androidx.compose.ui.text.font.Font font) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* synthetic */ void add(int i, androidx.compose.ui.text.font.Font font) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public final void add2(int i, androidx.compose.ui.text.font.Font font) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
