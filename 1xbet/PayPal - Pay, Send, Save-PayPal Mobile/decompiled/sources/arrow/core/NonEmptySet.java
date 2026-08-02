package arrow.core;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\r\b\u0087@\u0018\u0000 R*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001RB\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u001f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\nJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0014\u0010\u0006J\u000f\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010!\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000&H\u0016¢\u0006\u0004\b'\u0010(J/\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000&\"\u0004\b\u0001\u0010*2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+H\u0016¢\u0006\u0004\b-\u0010.J/\u00103\u001a\b\u0012\u0004\u0012\u00028\u00010&\"\u0004\b\u0001\u001002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010+H\u0016¢\u0006\u0004\b2\u0010.J5\u00105\u001a\b\u0012\u0004\u0012\u00028\u00010&\"\u0004\b\u0001\u001002\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030+H\u0016¢\u0006\u0004\b4\u0010.J:\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00010&\"\u0004\b\u0001\u001002\u001d\u00101\u001a\u0019\u0012\t\u0012\u00070\"¢\u0006\u0002\b7\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000106H\u0016¢\u0006\u0004\b8\u00109J5\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;0&\"\u0004\b\u0001\u001002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\u0016¢\u0006\u0004\b<\u0010=J\u0018\u0010@\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00028\u0000H\u0096\u0003¢\u0006\u0004\b?\u0010 J\u001e\u0010D\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000AH\u0096\u0001¢\u0006\u0004\bB\u0010CJ\u0016\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000EH\u0096\u0003¢\u0006\u0004\bF\u0010GR \u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bI\u0010J\u0012\u0004\bK\u0010LR\u0014\u0010O\u001a\u00028\u00008WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010\u0017R\u0014\u0010Q\u001a\u00020\"8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010$\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00028\u00000\u0002"}, d2 = {"Larrow/core/NonEmptySet;", "E", "", "Larrow/core/NonEmptyCollection;", "elements", "constructor-impl", "(Ljava/util/Set;)Ljava/util/Set;", "first", "", "rest", "(Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/Set;", "plus-J9TPrxk", "(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;", "plus", "element", "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "", "isEmpty-impl", "(Ljava/util/Set;)Z", "isEmpty", "toSet-impl", "toSet", "lastOrNull-impl", "(Ljava/util/Set;)Ljava/lang/Object;", "lastOrNull", "", "toString-impl", "(Ljava/util/Set;)Ljava/lang/String;", "toString", "", "other", "equals-impl", "(Ljava/util/Set;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/util/Set;)I", "hashCode", "Larrow/core/NonEmptyList;", "distinct-1X0FA-Y", "(Ljava/util/Set;)Ljava/util/List;", "distinct", "K", "Lkotlin/Function1;", "selector", "distinctBy-0-xjo5U", "(Ljava/util/Set;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "distinctBy", "T", "transform", "map-0-xjo5U", "map", "flatMap-0-xjo5U", "flatMap", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "mapIndexed-0-xjo5U", "(Ljava/util/Set;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "mapIndexed", "Lkotlin/Pair;", "zip-0-xjo5U", "(Ljava/util/Set;Larrow/core/NonEmptyCollection;)Ljava/util/List;", "zip", "contains-impl", "contains", "", "containsAll-impl", "(Ljava/util/Set;Ljava/util/Collection;)Z", "containsAll", "", "iterator-impl", "(Ljava/util/Set;)Ljava/util/Iterator;", "iterator", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getElements$annotations", "()V", "getHighResolutionOutputSizeshNQ4ISI", "getHead-impl", "head", "getSize-impl", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class NonEmptySet<E> implements java.util.Set<E>, arrow.core.NonEmptyCollection<E>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final arrow.core.NonEmptySet.Companion INSTANCE = new arrow.core.NonEmptySet.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<E> getHighResolutionOutputSizeshNQ4ISI;

    public static /* synthetic */ void getElements$annotations() {
    }

    /* renamed from: isEmpty-impl, reason: not valid java name */
    public static boolean m9650isEmptyimpl(java.util.Set<? extends E> set) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: toSet-impl, reason: not valid java name */
    public static final java.util.Set<E> m9661toSetimpl(java.util.Set<? extends E> set) {
        return set;
    }

    /* renamed from: firstOrNull-impl, reason: not valid java name */
    public static E m9645firstOrNullimpl(java.util.Set<? extends E> set) {
        return (E) m9636boximpl(set).firstOrNull();
    }

    /* renamed from: toNonEmptyList-1X0FA-Y, reason: not valid java name */
    public static java.util.List<E> m9659toNonEmptyList1X0FAY(java.util.Set<? extends E> set) {
        return m9636boximpl(set).mo9557toNonEmptyList1X0FAY();
    }

    /* renamed from: toNonEmptySet-5sCjGKo, reason: not valid java name */
    public static java.util.Set<E> m9660toNonEmptySet5sCjGKo(java.util.Set<? extends E> set) {
        return m9636boximpl(set).mo9558toNonEmptySet5sCjGKo();
    }

    @Override // arrow.core.NonEmptyCollection
    public final /* bridge */ E firstOrNull() {
        return (E) arrow.core.NonEmptyCollection.DefaultImpls.firstOrNull(this);
    }

    @Override // arrow.core.NonEmptyCollection
    public final /* synthetic */ arrow.core.NonEmptyCollection plus(java.lang.Iterable iterable) {
        return m9636boximpl(m9664plusJ9TPrxk(iterable));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // arrow.core.NonEmptyCollection
    public final /* synthetic */ arrow.core.NonEmptyCollection plus(java.lang.Object obj) {
        return m9636boximpl(m9665plusJ9TPrxk((arrow.core.NonEmptySet<E>) obj));
    }

    @Override // arrow.core.NonEmptyCollection
    /* renamed from: toNonEmptyList-1X0FA-Y */
    public final /* bridge */ java.util.List<E> mo9557toNonEmptyList1X0FAY() {
        return arrow.core.NonEmptyCollection.DefaultImpls.m9564toNonEmptyList1X0FAY(this);
    }

    @Override // arrow.core.NonEmptyCollection
    /* renamed from: toNonEmptySet-5sCjGKo */
    public final /* bridge */ java.util.Set<E> mo9558toNonEmptySet5sCjGKo() {
        return arrow.core.NonEmptyCollection.DefaultImpls.m9565toNonEmptySet5sCjGKo(this);
    }

    @Override // arrow.core.NonEmptyCollection
    public final /* synthetic */ arrow.core.NonEmptyCollection zip(arrow.core.NonEmptyCollection nonEmptyCollection) {
        return arrow.core.NonEmptyList.m9567boximpl(m9667zip0xjo5U(nonEmptyCollection));
    }

    private /* synthetic */ NonEmptySet(java.util.Set set) {
        this.getHighResolutionOutputSizeshNQ4ISI = set;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> java.util.Set<E> m9637constructorimpl(E e, java.lang.Iterable<? extends E> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return m9638constructorimpl(kotlin.collections.SetsKt.plus(kotlin.collections.SetsKt.setOf(e), (java.lang.Iterable) iterable));
    }

    /* renamed from: plus-J9TPrxk, reason: not valid java name */
    public final java.util.Set<E> m9664plusJ9TPrxk(java.lang.Iterable<? extends E> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return m9657plusJ9TPrxk((java.util.Set) this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Iterable) iterable);
    }

    /* renamed from: plus-J9TPrxk, reason: not valid java name */
    public static java.util.Set<E> m9657plusJ9TPrxk(java.util.Set<? extends E> set, java.lang.Iterable<? extends E> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return m9638constructorimpl(kotlin.collections.SetsKt.plus((java.util.Set) set, (java.lang.Iterable) iterable));
    }

    /* renamed from: plus-J9TPrxk, reason: not valid java name */
    public final java.util.Set<E> m9665plusJ9TPrxk(E e) {
        return m9658plusJ9TPrxk(this.getHighResolutionOutputSizeshNQ4ISI, e);
    }

    /* renamed from: plus-J9TPrxk, reason: not valid java name */
    public static java.util.Set<E> m9658plusJ9TPrxk(java.util.Set<? extends E> set, E e) {
        return m9638constructorimpl(kotlin.collections.SetsKt.plus(set, e));
    }

    @Override // java.util.Set, java.util.Collection, arrow.core.NonEmptyCollection
    public final boolean isEmpty() {
        return m9650isEmptyimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.util.Set<E> toSet() {
        return m9661toSetimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: getHead-impl, reason: not valid java name */
    public static E m9647getHeadimpl(java.util.Set<? extends E> set) {
        return (E) kotlin.collections.CollectionsKt.first(set);
    }

    @Override // arrow.core.NonEmptyCollection
    public final E getHead() {
        return (E) m9647getHeadimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: lastOrNull-impl, reason: not valid java name */
    public static E m9652lastOrNullimpl(java.util.Set<? extends E> set) {
        return (E) kotlin.collections.CollectionsKt.last(set);
    }

    @Override // arrow.core.NonEmptyCollection
    public final E lastOrNull() {
        return (E) m9652lastOrNullimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9662toStringimpl(java.util.Set<? extends E> set) {
        return set.toString();
    }

    public final java.lang.String toString() {
        return m9662toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return m9643equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, obj);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9643equalsimpl(java.util.Set<? extends E> set, java.lang.Object obj) {
        return kotlin.jvm.internal.Intrinsics.areEqual(set, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return m9649hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9649hashCodeimpl(java.util.Set<? extends E> set) {
        return set.hashCode();
    }

    @Override // arrow.core.NonEmptyCollection
    /* renamed from: distinct-1X0FA-Y */
    public final java.util.List<E> mo9552distinct1X0FAY() {
        return m9641distinct1X0FAY(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: distinct-1X0FA-Y, reason: not valid java name */
    public static java.util.List<E> m9641distinct1X0FAY(java.util.Set<? extends E> set) {
        return arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.toList(set));
    }

    @Override // arrow.core.NonEmptyCollection
    /* renamed from: distinctBy-0-xjo5U */
    public final <K> java.util.List<E> mo9553distinctBy0xjo5U(kotlin.jvm.functions.Function1<? super E, ? extends K> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return m9642distinctBy0xjo5U(this.getHighResolutionOutputSizeshNQ4ISI, function1);
    }

    /* renamed from: distinctBy-0-xjo5U, reason: not valid java name */
    public static <K> java.util.List<E> m9642distinctBy0xjo5U(java.util.Set<? extends E> set, kotlin.jvm.functions.Function1<? super E, ? extends K> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            amex.AMEXKernel aMEXKernel = (java.lang.Object) it.next();
            if (hashSet.add(function1.invoke(aMEXKernel))) {
                arrayList.add(aMEXKernel);
            }
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    @Override // arrow.core.NonEmptyCollection
    /* renamed from: map-0-xjo5U */
    public final <T> java.util.List<T> mo9555map0xjo5U(kotlin.jvm.functions.Function1<? super E, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return m9653map0xjo5U(this.getHighResolutionOutputSizeshNQ4ISI, function1);
    }

    /* renamed from: map-0-xjo5U, reason: not valid java name */
    public static <T> java.util.List<T> m9653map0xjo5U(java.util.Set<? extends E> set, kotlin.jvm.functions.Function1<? super E, ? extends T> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.Set<? extends E> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        java.util.Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    @Override // arrow.core.NonEmptyCollection
    /* renamed from: flatMap-0-xjo5U */
    public final <T> java.util.List<T> mo9554flatMap0xjo5U(kotlin.jvm.functions.Function1<? super E, ? extends arrow.core.NonEmptyCollection<? extends T>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return m9646flatMap0xjo5U(this.getHighResolutionOutputSizeshNQ4ISI, function1);
    }

    /* renamed from: flatMap-0-xjo5U, reason: not valid java name */
    public static <T> java.util.List<T> m9646flatMap0xjo5U(java.util.Set<? extends E> set, kotlin.jvm.functions.Function1<? super E, ? extends arrow.core.NonEmptyCollection<? extends T>> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList, function1.invoke(it.next()));
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    @Override // arrow.core.NonEmptyCollection
    /* renamed from: mapIndexed-0-xjo5U */
    public final <T> java.util.List<T> mo9556mapIndexed0xjo5U(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        return m9654mapIndexed0xjo5U(this.getHighResolutionOutputSizeshNQ4ISI, function2);
    }

    /* renamed from: mapIndexed-0-xjo5U, reason: not valid java name */
    public static <T> java.util.List<T> m9654mapIndexed0xjo5U(java.util.Set<? extends E> set, kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super E, ? extends T> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        java.util.Set<? extends E> set2 = set;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set2, 10));
        int i = 0;
        for (T t : set2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(function2.invoke(java.lang.Integer.valueOf(i), t));
            i++;
        }
        return arrow.core.NonEmptyList.m9570constructorimpl(arrayList);
    }

    /* renamed from: zip-0-xjo5U, reason: not valid java name */
    public final <T> java.util.List<kotlin.Pair<E, T>> m9667zip0xjo5U(arrow.core.NonEmptyCollection<? extends T> nonEmptyCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonEmptyCollection, "");
        return m9663zip0xjo5U(this.getHighResolutionOutputSizeshNQ4ISI, nonEmptyCollection);
    }

    /* renamed from: zip-0-xjo5U, reason: not valid java name */
    public static <T> java.util.List<kotlin.Pair<E, T>> m9663zip0xjo5U(java.util.Set<? extends E> set, arrow.core.NonEmptyCollection<? extends T> nonEmptyCollection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nonEmptyCollection, "");
        return arrow.core.NonEmptyList.m9570constructorimpl(kotlin.collections.CollectionsKt.zip(set, nonEmptyCollection));
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0006\"\u00028\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0001\u0010\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Larrow/core/NonEmptySet$Companion;", "", "<init>", "()V", "E", "head", "", "t", "Larrow/core/NonEmptySet;", "of-rU2te6o", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/Set;", "of", "", "values", "of-J9TPrxk", "(Ljava/lang/Iterable;)Ljava/util/Set;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final <E> arrow.core.NonEmptySet<? extends E> of(E e, E... eArr) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eArr, "");
            return arrow.core.NonEmptySet.m9636boximpl(m9669ofrU2te6o(e, eArr));
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: of-rU2te6o, reason: not valid java name */
        public final <E> java.util.Set<E> m9669ofrU2te6o(E head, E... t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
            return arrow.core.NonEmptySetKt.nonEmptySetOf(head, java.util.Arrays.copyOf(t, t.length));
        }

        @kotlin.jvm.JvmStatic
        public final <E> arrow.core.NonEmptySet<? extends E> of(java.lang.Iterable<? extends E> iterable) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
            return arrow.core.NonEmptySet.m9636boximpl(m9668ofJ9TPrxk(iterable));
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: of-J9TPrxk, reason: not valid java name */
        public final <E> java.util.Set<E> m9668ofJ9TPrxk(java.lang.Iterable<? extends E> values) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "");
            return arrow.core.NonEmptySetKt.toNonEmptySetOrThrow(values);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ java.util.Set getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) kotlin.jvm.internal.CollectionToArray.toArray(this, tArr);
    }

    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        return kotlin.jvm.internal.CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<E> iterator() {
        return m9651iteratorimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.util.Set, java.util.Collection
    /* renamed from: getSize, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return m9648getSizeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return m9640containsAllimpl(this.getHighResolutionOutputSizeshNQ4ISI, collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        return m9639containsimpl(this.getHighResolutionOutputSizeshNQ4ISI, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(E e) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: of-rU2te6o, reason: not valid java name */
    public static final <E> java.util.Set<E> m9656ofrU2te6o(E e, E... eArr) {
        return INSTANCE.m9669ofrU2te6o(e, eArr);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: of-J9TPrxk, reason: not valid java name */
    public static final <E> java.util.Set<E> m9655ofJ9TPrxk(java.lang.Iterable<? extends E> iterable) {
        return INSTANCE.m9668ofJ9TPrxk(iterable);
    }

    @kotlin.jvm.JvmStatic
    public static final <E> arrow.core.NonEmptySet<? extends E> of(E e, E... eArr) {
        return INSTANCE.of(e, eArr);
    }

    @kotlin.jvm.JvmStatic
    public static final <E> arrow.core.NonEmptySet<? extends E> of(java.lang.Iterable<? extends E> iterable) {
        return INSTANCE.of(iterable);
    }

    /* renamed from: iterator-impl, reason: not valid java name */
    public static java.util.Iterator<E> m9651iteratorimpl(java.util.Set<? extends E> set) {
        return set.iterator();
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static int m9648getSizeimpl(java.util.Set<? extends E> set) {
        return set.size();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9644equalsimpl0(java.util.Set<? extends java.lang.Object> set, java.util.Set<? extends java.lang.Object> set2) {
        return m9636boximpl(set).equals(m9636boximpl(set2));
    }

    /* renamed from: containsAll-impl, reason: not valid java name */
    public static boolean m9640containsAllimpl(java.util.Set<? extends E> set, java.util.Collection<? extends E> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        return set.containsAll(collection);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static boolean m9639containsimpl(java.util.Set<? extends E> set, E e) {
        return set.contains(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: constructor-impl, reason: not valid java name */
    public static <E> java.util.Set<E> m9638constructorimpl(java.util.Set<? extends E> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        return set;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ arrow.core.NonEmptySet m9636boximpl(java.util.Set set) {
        return new arrow.core.NonEmptySet(set);
    }
}
