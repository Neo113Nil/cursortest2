package androidx.compose.ui.text.intl;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010!"}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList;", "", "Landroidx/compose/ui/text/intl/Locale;", "", "localeList", "<init>", "(Ljava/util/List;)V", "", "languageTags", "(Ljava/lang/String;)V", "locales", "([Landroidx/compose/ui/text/intl/Locale;)V", "", "i", "get", "(I)Landroidx/compose/ui/text/intl/Locale;", "element", "", "contains", "(Landroidx/compose/ui/text/intl/Locale;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getLocaleList", "()Ljava/util/List;", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LocaleList implements java.util.Collection<androidx.compose.ui.text.intl.Locale>, kotlin.jvm.internal.markers.KMappedMarker {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.intl.LocaleList.Companion INSTANCE = new androidx.compose.ui.text.intl.LocaleList.Companion(null);
    private static final androidx.compose.ui.text.intl.LocaleList Empty = new androidx.compose.ui.text.intl.LocaleList((java.util.List<androidx.compose.ui.text.intl.Locale>) kotlin.collections.CollectionsKt.emptyList());
    private final java.util.List<androidx.compose.ui.text.intl.Locale> localeList;
    private final int size;

    public LocaleList(java.util.List<androidx.compose.ui.text.intl.Locale> list) {
        this.localeList = list;
        this.size = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj instanceof androidx.compose.ui.text.intl.Locale) {
            return contains((androidx.compose.ui.text.intl.Locale) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int size() {
        return getSize();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\t\u0010\b"}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/intl/LocaleList;", "Empty", "Landroidx/compose/ui/text/intl/LocaleList;", "getEmpty", "()Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "current"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.intl.LocaleList getEmpty() {
            return androidx.compose.ui.text.intl.LocaleList.Empty;
        }

        public final androidx.compose.ui.text.intl.LocaleList getCurrent() {
            return androidx.compose.ui.text.intl.PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.util.List<androidx.compose.ui.text.intl.Locale> getLocaleList() {
        return this.localeList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LocaleList(java.lang.String str) {
        this(r7);
        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList(split$default.size());
        int size = split$default.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(kotlin.text.StringsKt.trim((java.lang.String) split$default.get(i)).toString());
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList3.add(new androidx.compose.ui.text.intl.Locale((java.lang.String) arrayList2.get(i2)));
        }
    }

    public LocaleList(androidx.compose.ui.text.intl.Locale... localeArr) {
        this((java.util.List<androidx.compose.ui.text.intl.Locale>) kotlin.collections.ArraysKt.toList(localeArr));
    }

    public final androidx.compose.ui.text.intl.Locale get(int i) {
        return this.localeList.get(i);
    }

    public final int getSize() {
        return this.size;
    }

    public final boolean contains(androidx.compose.ui.text.intl.Locale element) {
        return this.localeList.contains(element);
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection<?> elements) {
        return this.localeList.containsAll(elements);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<androidx.compose.ui.text.intl.Locale> iterator() {
        return this.localeList.iterator();
    }

    @Override // java.util.Collection
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.intl.LocaleList) && kotlin.jvm.internal.Intrinsics.areEqual(this.localeList, ((androidx.compose.ui.text.intl.LocaleList) other).localeList);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.localeList.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LocaleList(localeList=");
        sb.append(this.localeList);
        sb.append(')');
        return sb.toString();
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeIf(java.util.function.Predicate<? super androidx.compose.ui.text.intl.Locale> predicate) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection<? extends androidx.compose.ui.text.intl.Locale> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* synthetic */ boolean add(androidx.compose.ui.text.intl.Locale locale) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public final boolean add2(androidx.compose.ui.text.intl.Locale locale) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
