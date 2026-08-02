package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JA\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u0018J7\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0019JI\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"JA\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u0015\u0010#J?\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010#J)\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0$H\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,2\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b/\u00100J%\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010\u0018JA\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0013\u00102R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00103R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u00104"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "", "", "root", "tail", "", io.ktor.http.ContentDisposition.Parameters.Size, "rootShift", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "element", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "p0", "p1", "p2", "getHighSpeedVideoFpsRangesFor", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "getHighSpeedVideoSizes", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "p3", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "p4", "getHighResolutionOutputSizeshNQ4ISI", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "removeAt", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Camera2StreamConfigurationMap", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "removeAll", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "builder", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "", "listIterator", "(I)Ljava/util/ListIterator;", "get", "(I)Ljava/lang/Object;", "set", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "[Ljava/lang/Object;", com.visa.cbp.getEncExpo.warmup, "getSize", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersistentVector<E> extends androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList<E> implements androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.Object[] Camera2StreamConfigurationMap;
    private final int size;

    public PersistentVector(java.lang.Object[] objArr, java.lang.Object[] objArr2, int i, int i2) {
        this.Camera2StreamConfigurationMap = objArr;
        this.getHighSpeedVideoFpsRangesFor = objArr2;
        this.size = i;
        this.getHighSpeedVideoSizes = i2;
        if (size() <= 32) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Trie-based persistent vector should have at least 33 elements, got ");
            sb.append(size());
            androidx.compose.runtime.PreconditionsKt.throwIllegalArgumentException(sb.toString());
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(size() - androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()) <= kotlin.ranges.RangesKt.coerceAtMost(objArr2.length, 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final /* bridge */ /* synthetic */ androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection add(java.lang.Object obj) {
        return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E>) obj);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.size;
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> add(E element) {
        int size = size() - androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size());
        if (size < 32) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            copyOf[size] = element;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(this.Camera2StreamConfigurationMap, copyOf, size() + 1, this.getHighSpeedVideoSizes);
        }
        return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(element));
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E> getHighSpeedVideoFpsRangesFor(java.lang.Object[] p0, java.lang.Object[] p1, java.lang.Object[] p2) {
        int size = size();
        int i = this.getHighSpeedVideoSizes;
        if ((size >> 5) > (1 << i)) {
            java.lang.Object[] presizedBufferWith = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(p0);
            int i2 = this.getHighSpeedVideoSizes + 5;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<>(getHighSpeedVideoSizes(presizedBufferWith, i2, p1), p2, size() + 1, i2);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<>(getHighSpeedVideoSizes(p0, i, p1), p2, size() + 1, this.getHighSpeedVideoSizes);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r4 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final java.lang.Object[] getHighSpeedVideoSizes(java.lang.Object[] p0, int p1, java.lang.Object[] p2) {
        java.lang.Object[] objArr;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(size() - 1, p1);
        if (p0 != null) {
            objArr = java.util.Arrays.copyOf(p0, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArr, "");
        }
        objArr = new java.lang.Object[32];
        if (p1 == 5) {
            objArr[indexSegment] = p2;
            return objArr;
        }
        objArr[indexSegment] = getHighSpeedVideoSizes((java.lang.Object[]) objArr[indexSegment], p1 - 5, p2);
        return objArr;
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> add(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        if (index == size()) {
            return add((androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E>) element);
        }
        int rootSize = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size());
        if (index >= rootSize) {
            return getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, index - rootSize, element);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        return getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, index, element, objectRef), 0, objectRef.getValue());
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<E> getHighSpeedVideoFpsRangesFor(java.lang.Object[] p0, int p1, java.lang.Object p2) {
        int size = size() - androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size());
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        if (size < 32) {
            kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRangesFor, copyOf, p1 + 1, p1, size);
            copyOf[p1] = p2;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector<>(p0, copyOf, size() + 1, this.getHighSpeedVideoSizes);
        }
        java.lang.Object[] objArr = this.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj = objArr[31];
        kotlin.collections.ArraysKt.copyInto(objArr, copyOf, p1 + 1, p1, size - 1);
        copyOf[p1] = p2;
        return getHighSpeedVideoFpsRangesFor(p0, copyOf, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.presizedBufferWith(obj));
    }

    private final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI(java.lang.Object[] p0, int p1, int p2, java.lang.Object p3, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p4) {
        java.lang.Object[] copyOf;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2, p1);
        if (p1 == 0) {
            if (indexSegment != 0) {
                copyOf = java.util.Arrays.copyOf(p0, 32);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            } else {
                copyOf = new java.lang.Object[32];
            }
            kotlin.collections.ArraysKt.copyInto(p0, copyOf, indexSegment + 1, indexSegment, 31);
            p4.setValue(p0[31]);
            copyOf[indexSegment] = p3;
            return copyOf;
        }
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(p0, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
        int i = p1 - 5;
        java.lang.Object obj = p0[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        copyOf2[indexSegment] = getHighResolutionOutputSizeshNQ4ISI((java.lang.Object[]) obj, i, p2, p3, p4);
        while (true) {
            indexSegment++;
            if (indexSegment >= 32 || copyOf2[indexSegment] == null) {
                break;
            }
            java.lang.Object obj2 = p0[indexSegment];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
            copyOf2[indexSegment] = getHighResolutionOutputSizeshNQ4ISI((java.lang.Object[]) obj2, i, 0, p4.getValue(), p4);
        }
        return copyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeAt(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        int rootSize = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size());
        if (index >= rootSize) {
            return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, rootSize, this.getHighSpeedVideoSizes, index - rootSize);
        }
        return Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, index, new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(this.getHighSpeedVideoFpsRangesFor[0])), rootSize, this.getHighSpeedVideoSizes, 0);
    }

    private final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, int p2, int p3) {
        int size = size() - p1;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt.m5417assert(p3 < size);
        if (size != 1) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            int i = size - 1;
            if (p3 < i) {
                kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRangesFor, copyOf, p3, p3 + 1, size);
            }
            copyOf[i] = null;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(p0, copyOf, (p1 + size) - 1, p2);
        }
        if (p2 == 0) {
            if (p0.length == 33) {
                p0 = java.util.Arrays.copyOf(p0, 32);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(p0, "");
            }
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector(p0);
        }
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef objectRef = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef(null);
        java.lang.Object[] highSpeedVideoSizes = getHighSpeedVideoSizes(p0, p2, p1 - 1, objectRef);
        kotlin.jvm.internal.Intrinsics.checkNotNull(highSpeedVideoSizes);
        java.lang.Object value = objectRef.getValue();
        kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
        java.lang.Object[] objArr = (java.lang.Object[]) value;
        if (highSpeedVideoSizes[1] == null) {
            java.lang.Object obj = highSpeedVideoSizes[0];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector((java.lang.Object[]) obj, objArr, p1, p2 - 5);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(highSpeedVideoSizes, objArr, p1, p2);
    }

    private final java.lang.Object[] getHighSpeedVideoSizes(java.lang.Object[] p0, int p1, int p2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p3) {
        java.lang.Object[] highSpeedVideoSizes;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2, p1);
        if (p1 == 5) {
            p3.setValue(p0[indexSegment]);
            highSpeedVideoSizes = null;
        } else {
            java.lang.Object obj = p0[indexSegment];
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            highSpeedVideoSizes = getHighSpeedVideoSizes((java.lang.Object[]) obj, p1 - 5, p2, p3);
        }
        if (highSpeedVideoSizes == null && indexSegment == 0) {
            return null;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(p0, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        copyOf[indexSegment] = highSpeedVideoSizes;
        return copyOf;
    }

    private final java.lang.Object[] Camera2StreamConfigurationMap(java.lang.Object[] p0, int p1, int p2, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.ObjectRef p3) {
        java.lang.Object[] copyOf;
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2, p1);
        if (p1 == 0) {
            if (indexSegment != 0) {
                copyOf = java.util.Arrays.copyOf(p0, 32);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            } else {
                copyOf = new java.lang.Object[32];
            }
            kotlin.collections.ArraysKt.copyInto(p0, copyOf, indexSegment, indexSegment + 1, 32);
            copyOf[31] = p3.getValue();
            p3.setValue(p0[indexSegment]);
            return copyOf;
        }
        int indexSegment2 = p0[31] == null ? androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()) - 1, p1) : 31;
        java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(p0, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
        int i = p1 - 5;
        int i2 = indexSegment + 1;
        if (i2 <= indexSegment2) {
            while (true) {
                java.lang.Object obj = copyOf2[indexSegment2];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                copyOf2[indexSegment2] = Camera2StreamConfigurationMap((java.lang.Object[]) obj, i, 0, p3);
                if (indexSegment2 == i2) {
                    break;
                }
                indexSegment2--;
            }
        }
        java.lang.Object obj2 = copyOf2[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        copyOf2[indexSegment] = Camera2StreamConfigurationMap((java.lang.Object[]) obj2, i, p2, p3);
        return copyOf2;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> removeAll(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<E> builder = builder();
        builder.removeAllWithPredicate(predicate);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<E> builder() {
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder<>(this, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final java.util.ListIterator<E> listIterator(int index) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkPositionIndex$runtime(index, size());
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorIterator(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, index, size(), (this.getHighSpeedVideoSizes / 5) + 1);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final E get(int index) {
        java.lang.Object[] objArr;
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        if (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()) <= index) {
            objArr = this.getHighSpeedVideoFpsRangesFor;
        } else {
            objArr = this.Camera2StreamConfigurationMap;
            for (int i = this.getHighSpeedVideoSizes; i > 0; i -= 5) {
                java.lang.Object obj = objArr[androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(index, i)];
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
                objArr = (java.lang.Object[]) obj;
            }
        }
        return (E) objArr[index & 31];
    }

    @Override // kotlin.collections.AbstractList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList<E> set(int index, E element) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation.checkElementIndex$runtime(index, size());
        if (androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.rootSize(size()) <= index) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.getHighSpeedVideoFpsRangesFor, 32);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            copyOf[index & 31] = element;
            return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(this.Camera2StreamConfigurationMap, copyOf, size(), this.getHighSpeedVideoSizes);
        }
        return new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVector(getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, index, element), this.getHighSpeedVideoFpsRangesFor, size(), this.getHighSpeedVideoSizes);
    }

    private final java.lang.Object[] getHighSpeedVideoFpsRangesFor(java.lang.Object[] p0, int p1, int p2, java.lang.Object p3) {
        int indexSegment = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.UtilsKt.indexSegment(p2, p1);
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(p0, 32);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        if (p1 == 0) {
            copyOf[indexSegment] = p3;
            return copyOf;
        }
        java.lang.Object obj = copyOf[indexSegment];
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        copyOf[indexSegment] = getHighSpeedVideoFpsRangesFor((java.lang.Object[]) obj, p1 - 5, p2, p3);
        return copyOf;
    }
}
