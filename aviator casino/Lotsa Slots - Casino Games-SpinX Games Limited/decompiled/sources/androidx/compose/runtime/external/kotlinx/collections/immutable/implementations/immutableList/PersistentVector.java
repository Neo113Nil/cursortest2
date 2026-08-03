package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

/* compiled from: PersistentVector.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B5\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u001b\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J#\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\tH\u0096\u0002¢\u0006\u0002\u0010\u0019JG\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010\u001eJ5\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010 \u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0012\u001a\u00020\tH\u0016J?\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010&J3\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010)JC\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010-J?\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u0006\u0010\u001b\u001a\u00020\t2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002¢\u0006\u0002\u0010/J\"\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\tH\u0016J=\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u001dH\u0002¢\u0006\u0002\u0010&J;\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0002\u00107J\b\u0010(\u001a\u00020\tH\u0002J#\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0013J?\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\b\u0010:\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010;R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\f¨\u0006<"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "root", "", "", "tail", "size", "", "rootShift", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "[Ljava/lang/Object;", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "bufferFor", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "get", "(I)Ljava/lang/Object;", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "insertIntoTail", "tailIndex", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "listIterator", "", "pullLastBuffer", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "rootSize", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "pushTail", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "set", "setInRoot", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PersistentVector<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> {
    public static final int $stable = 8;
    private final java.lang.Object[] root;
    private final int rootShift;
    private final int size;
    private final java.lang.Object[] tail;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection add(java.lang.Object obj) {
        return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E>) obj);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public int getSize() {
        return this.size;
    }

    public PersistentVector(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2) {
        this.root = objArr;
        this.tail = objArr2;
        this.size = i;
        this.rootShift = i2;
        if (size() <= 32) {
            throw new java.lang.IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + size()).toString());
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(size() - androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()) <= kotlin.ranges.RangesKt.coerceAtMost(objArr2.length, 32));
    }

    private final int rootSize() {
        return androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size());
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> add(E element) {
        int size = size() - rootSize();
        if (size < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.tail, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[size] = element;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(this.root, copyOf, size() + 1, this.rootShift);
        }
        return pushFilledTail(this.root, this.tail, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(element));
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E> pushFilledTail(java.lang.Object[] root, java.lang.Object[] filledTail, java.lang.Object[] newTail) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size > (1 << i)) {
            java.lang.Object[] presizedBufferWith = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(root);
            int i2 = this.rootShift + 5;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<>(pushTail(presizedBufferWith, i2, filledTail), newTail, size() + 1, i2);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<>(pushTail(root, i, filledTail), newTail, size() + 1, this.rootShift);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object[] pushTail(java.lang.Object[] root, int shift, java.lang.Object[] tail) {
        java.lang.Object[] objArr;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(size() - 1, shift);
        if (root != null) {
            objArr = java.util.Arrays.copyOf(root, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
        }
        objArr = new java.lang.Object[32];
        if (shift == 5) {
            objArr[indexSegment] = tail;
        } else {
            objArr[indexSegment] = pushTail((java.lang.Object[]) objArr[indexSegment], shift - 5, tail);
        }
        return objArr;
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> add(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime_release(index, size());
        if (index == size()) {
            return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E>) element);
        }
        int rootSize = rootSize();
        if (index >= rootSize) {
            return insertIntoTail(this.root, index - rootSize, element);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        return insertIntoTail(insertIntoRoot(this.root, this.rootShift, index, element, objectRef), 0, objectRef.getValue());
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E> insertIntoTail(java.lang.Object[] root, int tailIndex, java.lang.Object element) {
        int size = size() - rootSize();
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.tail, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (size < 32) {
            kotlin.collections.ArraysKt.copyInto(this.tail, copyOf, tailIndex + 1, tailIndex, size);
            copyOf[tailIndex] = element;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<>(root, copyOf, size() + 1, this.rootShift);
        }
        java.lang.Object[] objArr = this.tail;
        java.lang.Object obj = objArr[31];
        kotlin.collections.ArraysKt.copyInto(objArr, copyOf, tailIndex + 1, tailIndex, size - 1);
        copyOf[tailIndex] = element;
        return pushFilledTail(root, copyOf, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(obj));
    }

    private final java.lang.Object[] insertIntoRoot(java.lang.Object[] root, int shift, int index, java.lang.Object element, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef elementCarry) {
        java.lang.Object[] copyOf;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(index, shift);
        if (shift == 0) {
            if (indexSegment != 0) {
                copyOf = java.util.Arrays.copyOf(root, 32);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            } else {
                copyOf = new java.lang.Object[32];
            }
            kotlin.collections.ArraysKt.copyInto(root, copyOf, indexSegment + 1, indexSegment, 31);
            elementCarry.setValue(root[31]);
            copyOf[indexSegment] = element;
            return copyOf;
        }
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(root, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i = shift - 5;
        java.lang.Object obj = root[indexSegment];
        java.lang.String str = "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>";
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = insertIntoRoot((java.lang.Object[]) obj, i, index, element, elementCarry);
        int i2 = indexSegment + 1;
        while (i2 < 32 && copyOf2[i2] != null) {
            java.lang.Object obj2 = root[i2];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, str);
            java.lang.Object[] objArr = copyOf2;
            objArr[i2] = insertIntoRoot((java.lang.Object[]) obj2, i, 0, elementCarry.getValue(), elementCarry);
            i2++;
            copyOf2 = objArr;
            str = str;
        }
        return copyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeAt(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime_release(index, size());
        int rootSize = rootSize();
        if (index >= rootSize) {
            return removeFromTailAt(this.root, rootSize, this.rootShift, index - rootSize);
        }
        return removeFromTailAt(removeFromRootAt(this.root, this.rootShift, index, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(this.tail[0])), rootSize, this.rootShift, 0);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeFromTailAt(java.lang.Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m1728assert(index < size);
        if (size == 1) {
            return pullLastBufferFromRoot(root, rootSize, shift);
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.tail, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int i = size - 1;
        if (index < i) {
            kotlin.collections.ArraysKt.copyInto(this.tail, copyOf, index, index + 1, size);
        }
        copyOf[i] = null;
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(root, copyOf, (rootSize + size) - 1, shift);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> pullLastBufferFromRoot(java.lang.Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            if (root.length == 33) {
                root = java.util.Arrays.copyOf(root, 32);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(root, "copyOf(this, newSize)");
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(root);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        java.lang.Object[] pullLastBuffer = pullLastBuffer(root, shift, rootSize - 1, objectRef);
        kotlin.jvm.internal.Intrinsics.checkNotNull(pullLastBuffer);
        java.lang.Object value = objectRef.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        java.lang.Object[] objArr = (java.lang.Object[]) value;
        if (pullLastBuffer[1] == null) {
            java.lang.Object obj = pullLastBuffer[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector((java.lang.Object[]) obj, objArr, rootSize, shift - 5);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(pullLastBuffer, objArr, rootSize, shift);
    }

    private final java.lang.Object[] pullLastBuffer(java.lang.Object[] root, int shift, int index, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef tailCarry) {
        java.lang.Object[] pullLastBuffer;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(index, shift);
        if (shift == 5) {
            tailCarry.setValue(root[indexSegment]);
            pullLastBuffer = null;
        } else {
            java.lang.Object obj = root[indexSegment];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            pullLastBuffer = pullLastBuffer((java.lang.Object[]) obj, shift - 5, index, tailCarry);
        }
        if (pullLastBuffer == null && indexSegment == 0) {
            return null;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(root, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[indexSegment] = pullLastBuffer;
        return copyOf;
    }

    private final java.lang.Object[] removeFromRootAt(java.lang.Object[] root, int shift, int index, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef tailCarry) {
        java.lang.Object[] copyOf;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(index, shift);
        if (shift == 0) {
            if (indexSegment != 0) {
                copyOf = java.util.Arrays.copyOf(root, 32);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            } else {
                copyOf = new java.lang.Object[32];
            }
            kotlin.collections.ArraysKt.copyInto(root, copyOf, indexSegment, indexSegment + 1, 32);
            copyOf[31] = tailCarry.getValue();
            tailCarry.setValue(root[indexSegment]);
            return copyOf;
        }
        int indexSegment2 = root[31] == null ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(rootSize() - 1, shift) : 31;
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(root, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i = shift - 5;
        int i2 = indexSegment + 1;
        if (i2 <= indexSegment2) {
            while (true) {
                java.lang.Object obj = copyOf2[indexSegment2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[indexSegment2] = removeFromRootAt((java.lang.Object[]) obj, i, 0, tailCarry);
                if (indexSegment2 == i2) {
                    break;
                }
                indexSegment2--;
            }
        }
        java.lang.Object obj2 = copyOf2[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[indexSegment] = removeFromRootAt((java.lang.Object[]) obj2, i, index, tailCarry);
        return copyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeAll(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<E> builder = builder();
        builder.removeAllWithPredicate(predicate);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<E> builder() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<>(this, this.root, this.tail, this.rootShift);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public java.util.ListIterator<E> listIterator(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime_release(index, size());
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorIterator(this.root, this.tail, index, size(), (this.rootShift / 5) + 1);
    }

    private final java.lang.Object[] bufferFor(int index) {
        if (rootSize() <= index) {
            return this.tail;
        }
        java.lang.Object[] objArr = this.root;
        for (int i = this.rootShift; i > 0; i -= 5) {
            java.lang.Object[] objArr2 = objArr[androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(index, i)];
            kotlin.jvm.internal.Intrinsics.checkNotNull(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public E get(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime_release(index, size());
        return (E) bufferFor(index)[index & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> set(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime_release(index, size());
        if (rootSize() <= index) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.tail, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[index & 31] = element;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(this.root, copyOf, size(), this.rootShift);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(setInRoot(this.root, this.rootShift, index, element), this.tail, size(), this.rootShift);
    }

    private final java.lang.Object[] setInRoot(java.lang.Object[] root, int shift, int index, java.lang.Object e) {
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(index, shift);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(root, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (shift == 0) {
            copyOf[indexSegment] = e;
        } else {
            java.lang.Object obj = copyOf[indexSegment];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[indexSegment] = setInRoot((java.lang.Object[]) obj, shift - 5, index, e);
        }
        return copyOf;
    }
}
