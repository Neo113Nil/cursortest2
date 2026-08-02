package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\f\b\u0000\u0018\u0000 /*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B\u0017\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0019J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u001aJ\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010!J\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0002¢\u0006\u0004\b&\u0010'J%\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u001aR\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\u00168WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "buffer", "<init>", "([Ljava/lang/Object;)V", "element", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "elements", "addAll", "(Ljava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/Function1;", "", "predicate", "removeAll", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "", "index", "c", "(ILjava/util/Collection;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAt", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "getHighResolutionOutputSizeshNQ4ISI", "[Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmallPersistentVector<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList<E> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object[] getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.Companion INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector EMPTY = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(new java.lang.Object[0]);

    public SmallPersistentVector(java.lang.Object[] objArr) {
        this.getHighSpeedVideoFpsRanges = objArr;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(objArr.length <= 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection add(java.lang.Object obj) {
        return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector<E>) obj);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection addAll(java.util.Collection collection) {
        return addAll(collection);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.getHighSpeedVideoFpsRanges.length;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> add(E element) {
        if (size() < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, size() + 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            copyOf[size()] = element;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(copyOf);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(this.getHighSpeedVideoFpsRanges, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(element), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> addAll(java.util.Collection<? extends E> elements) {
        if (size() + elements.size() <= 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, size() + elements.size());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            int size = size();
            java.util.Iterator<? extends E> it = elements.iterator();
            while (it.hasNext()) {
                copyOf[size] = it.next();
                size++;
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(copyOf);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<E> builder = builder();
        builder.addAll(elements);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeAll(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRanges;
        int size = size();
        int size2 = size();
        boolean z = false;
        for (int i = 0; i < size2; i++) {
            java.lang.Object obj = this.getHighSpeedVideoFpsRanges[i];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z) {
                    java.lang.Object[] objArr2 = this.getHighSpeedVideoFpsRanges;
                    objArr = java.util.Arrays.copyOf(objArr2, objArr2.length);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArr, "");
                    z = true;
                    size = i;
                }
            } else if (z) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(kotlin.collections.ArraysKt.copyOfRange(objArr, 0, size));
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> addAll(int index, java.util.Collection<? extends E> c) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        if (size() + c.size() > 32) {
            androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<E> builder = builder();
            builder.addAll(index, c);
            return builder.build();
        }
        java.lang.Object[] objArr = new java.lang.Object[size() + c.size()];
        kotlin.collections.ArraysKt.copyInto$default(this.getHighSpeedVideoFpsRanges, objArr, 0, 0, index, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRanges, objArr, c.size() + index, index, size());
        java.util.Iterator<? extends E> it = c.iterator();
        while (it.hasNext()) {
            objArr[index] = it.next();
            index++;
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(objArr);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> add(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        if (index == size()) {
            return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector<E>) element);
        }
        if (size() >= 32) {
            java.lang.Object[] objArr = this.getHighSpeedVideoFpsRanges;
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRanges, copyOf, index + 1, index, size() - 1);
            copyOf[index] = element;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(copyOf, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(this.getHighSpeedVideoFpsRanges[31]), size() + 1, 0);
        }
        java.lang.Object[] objArr2 = new java.lang.Object[size() + 1];
        kotlin.collections.ArraysKt.copyInto$default(this.getHighSpeedVideoFpsRanges, objArr2, 0, 0, index, 6, (java.lang.Object) null);
        kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRanges, objArr2, index + 1, index, size());
        objArr2[index] = element;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(objArr2);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeAt(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        if (size() == 1) {
            return EMPTY;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRanges, size() - 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRanges, copyOf, index, index + 1, size());
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(copyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder<E> builder() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder(this, null, this.getHighSpeedVideoFpsRanges, 0);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int indexOf(java.lang.Object element) {
        return kotlin.collections.ArraysKt.indexOf(this.getHighSpeedVideoFpsRanges, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object element) {
        return kotlin.collections.ArraysKt.lastIndexOf(this.getHighSpeedVideoFpsRanges, element);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.BufferIterator(this.getHighSpeedVideoFpsRanges, index, size());
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final E get(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        return (E) this.getHighSpeedVideoFpsRanges[index];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> set(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRanges;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        copyOf[index] = element;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(copyOf);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector getEMPTY() {
            return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector.EMPTY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
