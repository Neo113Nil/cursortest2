package kotlin.collections;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b&\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 Q*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001QB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007B\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0005\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u0016J\u0011\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00028\u0000H\u0007¢\u0006\u0004\b \u0010\u0016J\u0011\u0010!\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010\"\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\"\u0010%J%\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\u000f\u0010'J\u001d\u0010(\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0017¢\u0006\u0004\b(\u0010)J%\u0010(\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0017¢\u0006\u0004\b(\u0010*J\u0018\u0010+\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u0000H\u0097\u0002¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b/\u0010#J\u0017\u00100\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u00101J\u0017\u00103\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00028\u0000H\u0017¢\u0006\u0004\b3\u0010#J\u0017\u00104\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0003H\u0017¢\u0006\u0004\b4\u0010,J\u001d\u00105\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0017¢\u0006\u0004\b5\u0010)J\u001d\u00106\u001a\u00020\u00122\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0017¢\u0006\u0004\b6\u0010)J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010\u0007J)\u0010;\u001a\b\u0012\u0004\u0012\u00028\u000109\"\u0004\b\u0001\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=09H\u0016¢\u0006\u0004\b;\u0010>J\u001f\u0010A\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0003H\u0014¢\u0006\u0004\bA\u0010BJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010BJ)\u0010C\u001a\b\u0012\u0004\u0012\u00028\u000109\"\u0004\b\u0001\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000109H\u0000¢\u0006\u0004\bC\u0010<J\u0017\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=09H\u0000¢\u0006\u0004\bC\u0010>J\u001f\u0010D\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00032\u0006\u0010@\u001a\u00020\u0003H\u0000¢\u0006\u0004\bD\u0010BJO\u0010J\u001a\u00020\f2>\u0010I\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bF\u0012\b\bG\u0012\u0004\b\b(H\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010=09¢\u0006\f\bF\u0012\b\bG\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0EH\u0000¢\u0006\u0004\bJ\u0010KR\u0016\u0010\u000f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010LR\u001e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010MR$\u0010N\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00038\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\bN\u0010L\u001a\u0004\bO\u0010P"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "", "initialCapacity", "<init>", "(I)V", "()V", "", "elements", "(Ljava/util/Collection;)V", "p0", "", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "(I)I", "getHighResolutionOutputSizeshNQ4ISI", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "firstOrNull", "last", "lastOrNull", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "index", "(ILjava/lang/Object;)V", "p1", "(ILjava/util/Collection;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "removeAt", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "fromIndex", "toIndex", "removeRange", "(II)V", "testToArray$kotlin_stdlib", "testRemoveRange$kotlin_stdlib", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "head", "structure", "internalStructure$kotlin_stdlib", "(Lkotlin/jvm/functions/Function2;)V", com.visa.cbp.getEncExpo.warmup, "[Ljava/lang/Object;", io.ktor.http.ContentDisposition.Parameters.Size, "getSize", "()I", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrayDeque<E> extends kotlin.collections.AbstractMutableList<E> {
    private static final java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object[0];

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private java.lang.Object[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;
    private int size;

    @Override // kotlin.collections.AbstractMutableList
    public final int getSize() {
        return this.size;
    }

    public ArrayDeque(int i) {
        java.lang.Object[] objArr;
        if (i == 0) {
            objArr = getHighResolutionOutputSizeshNQ4ISI;
        } else if (i > 0) {
            objArr = new java.lang.Object[i];
        } else {
            throw new java.lang.IllegalArgumentException("Illegal Capacity: ".concat(java.lang.String.valueOf(i)));
        }
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
    }

    public ArrayDeque() {
        this.getHighResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI;
    }

    public ArrayDeque(java.util.Collection<? extends E> collection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
        java.lang.Object[] array = collection.toArray(new java.lang.Object[0]);
        this.getHighResolutionOutputSizeshNQ4ISI = array;
        this.size = array.length;
        if (array.length == 0) {
            this.getHighResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0) {
        if (p0 < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (p0 <= objArr.length) {
            return;
        }
        if (objArr == getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.lang.Object[kotlin.ranges.RangesKt.coerceAtLeast(p0, 10)];
        } else {
            getHighSpeedVideoSizes(kotlin.collections.AbstractList.INSTANCE.newCapacity$kotlin_stdlib(this.getHighResolutionOutputSizeshNQ4ISI.length, p0));
        }
    }

    private final void getHighSpeedVideoSizes(int p0) {
        java.lang.Object[] objArr = new java.lang.Object[p0];
        java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.collections.ArraysKt.copyInto(objArr2, objArr, 0, this.Camera2StreamConfigurationMap, objArr2.length);
        java.lang.Object[] objArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = objArr3.length;
        int i = this.Camera2StreamConfigurationMap;
        kotlin.collections.ArraysKt.copyInto(objArr3, objArr, length - i, 0, i);
        this.Camera2StreamConfigurationMap = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = objArr;
    }

    private final int Camera2StreamConfigurationMap(int p0) {
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        return p0 >= objArr.length ? p0 - objArr.length : p0;
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(int p0) {
        if (p0 == kotlin.collections.ArraysKt.getLastIndex(this.getHighResolutionOutputSizeshNQ4ISI)) {
            return 0;
        }
        return p0 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final E first() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.getHighResolutionOutputSizeshNQ4ISI[this.Camera2StreamConfigurationMap];
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.getHighResolutionOutputSizeshNQ4ISI[this.Camera2StreamConfigurationMap];
    }

    public final E last() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        return (E) this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + kotlin.collections.CollectionsKt.getLastIndex(this))];
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return (E) this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + kotlin.collections.CollectionsKt.getLastIndex(this))];
    }

    @kotlin.IgnorableReturnValue
    public final E removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        this.modCount++;
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i = this.Camera2StreamConfigurationMap;
        E e = (E) objArr[i];
        objArr[i] = null;
        this.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(i);
        this.size = size() - 1;
        return e;
    }

    @kotlin.IgnorableReturnValue
    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @kotlin.IgnorableReturnValue
    public final E removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        this.modCount++;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + kotlin.collections.CollectionsKt.getLastIndex(this));
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        E e = (E) objArr[Camera2StreamConfigurationMap];
        objArr[Camera2StreamConfigurationMap] = null;
        this.size = size() - 1;
        return e;
    }

    @kotlin.IgnorableReturnValue
    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.IgnorableReturnValue
    public final boolean add(E element) {
        addLast(element);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    public final void add(int index, E element) {
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (index == size()) {
            addLast(element);
            return;
        }
        if (index == 0) {
            addFirst(element);
            return;
        }
        this.modCount++;
        getHighSpeedVideoFpsRangesFor(size() + 1);
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + index);
        if (index >= ((size() + 1) >> 1)) {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
            if (Camera2StreamConfigurationMap < Camera2StreamConfigurationMap2) {
                java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, Camera2StreamConfigurationMap + 1, Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
            } else {
                java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, 1, 0, Camera2StreamConfigurationMap2);
                java.lang.Object[] objArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr3[0] = objArr3[objArr3.length - 1];
                kotlin.collections.ArraysKt.copyInto(objArr3, objArr3, Camera2StreamConfigurationMap + 1, Camera2StreamConfigurationMap, objArr3.length - 1);
            }
            this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap] = element;
        } else {
            int lastIndex = Camera2StreamConfigurationMap == 0 ? kotlin.collections.ArraysKt.getLastIndex(this.getHighResolutionOutputSizeshNQ4ISI) : Camera2StreamConfigurationMap - 1;
            int i = this.Camera2StreamConfigurationMap;
            int lastIndex2 = i == 0 ? kotlin.collections.ArraysKt.getLastIndex(this.getHighResolutionOutputSizeshNQ4ISI) : i - 1;
            int i2 = this.Camera2StreamConfigurationMap;
            if (lastIndex >= i2) {
                java.lang.Object[] objArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr4[lastIndex2] = objArr4[i2];
                kotlin.collections.ArraysKt.copyInto(objArr4, objArr4, i2, i2 + 1, lastIndex + 1);
            } else {
                java.lang.Object[] objArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr5, objArr5, i2 - 1, i2, objArr5.length);
                java.lang.Object[] objArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr6[objArr6.length - 1] = objArr6[0];
                kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, 0, 1, lastIndex + 1);
            }
            this.getHighResolutionOutputSizeshNQ4ISI[lastIndex] = element;
            this.Camera2StreamConfigurationMap = lastIndex2;
        }
        this.size = size() + 1;
    }

    private final void Camera2StreamConfigurationMap(int p0, java.util.Collection<? extends E> p1) {
        java.util.Iterator<? extends E> it = p1.iterator();
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        while (p0 < length && it.hasNext()) {
            this.getHighResolutionOutputSizeshNQ4ISI[p0] = it.next();
            p0++;
        }
        int i = this.Camera2StreamConfigurationMap;
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            this.getHighResolutionOutputSizeshNQ4ISI[i2] = it.next();
        }
        this.size = size() + p1.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.IgnorableReturnValue
    public final boolean addAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (elements.isEmpty()) {
            return false;
        }
        this.modCount++;
        getHighSpeedVideoFpsRangesFor(size() + elements.size());
        Camera2StreamConfigurationMap(Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size()), elements);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    @kotlin.IgnorableReturnValue
    public final boolean addAll(int index, java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        kotlin.collections.AbstractList.INSTANCE.checkPositionIndex$kotlin_stdlib(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        this.modCount++;
        getHighSpeedVideoFpsRangesFor(size() + elements.size());
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + index);
        int size = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int i = this.Camera2StreamConfigurationMap;
            int i2 = i - size;
            if (Camera2StreamConfigurationMap2 < i) {
                java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, i2, i, objArr.length);
                if (size >= Camera2StreamConfigurationMap2) {
                    java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, objArr2.length - size, 0, Camera2StreamConfigurationMap2);
                } else {
                    java.lang.Object[] objArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.collections.ArraysKt.copyInto(objArr3, objArr3, objArr3.length - size, 0, size);
                    java.lang.Object[] objArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.collections.ArraysKt.copyInto(objArr4, objArr4, 0, size, Camera2StreamConfigurationMap2);
                }
            } else if (i2 >= 0) {
                java.lang.Object[] objArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr5, objArr5, i2, i, Camera2StreamConfigurationMap2);
            } else {
                java.lang.Object[] objArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                i2 += objArr6.length;
                int length = objArr6.length - i2;
                if (length >= Camera2StreamConfigurationMap2 - i) {
                    kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, i2, i, Camera2StreamConfigurationMap2);
                } else {
                    kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, i2, i, i + length);
                    java.lang.Object[] objArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.collections.ArraysKt.copyInto(objArr7, objArr7, 0, this.Camera2StreamConfigurationMap + length, Camera2StreamConfigurationMap2);
                }
            }
            this.Camera2StreamConfigurationMap = i2;
            int i3 = Camera2StreamConfigurationMap2 - size;
            if (i3 < 0) {
                i3 += this.getHighResolutionOutputSizeshNQ4ISI.length;
            }
            Camera2StreamConfigurationMap(i3, elements);
        } else {
            int i4 = Camera2StreamConfigurationMap2 + size;
            if (Camera2StreamConfigurationMap2 < Camera2StreamConfigurationMap) {
                int i5 = size + Camera2StreamConfigurationMap;
                java.lang.Object[] objArr8 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i5 <= objArr8.length) {
                    kotlin.collections.ArraysKt.copyInto(objArr8, objArr8, i4, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap);
                } else if (i4 >= objArr8.length) {
                    kotlin.collections.ArraysKt.copyInto(objArr8, objArr8, i4 - objArr8.length, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap);
                } else {
                    int length2 = Camera2StreamConfigurationMap - (i5 - objArr8.length);
                    kotlin.collections.ArraysKt.copyInto(objArr8, objArr8, 0, length2, Camera2StreamConfigurationMap);
                    java.lang.Object[] objArr9 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.collections.ArraysKt.copyInto(objArr9, objArr9, i4, Camera2StreamConfigurationMap2, length2);
                }
            } else {
                java.lang.Object[] objArr10 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr10, objArr10, size, 0, Camera2StreamConfigurationMap);
                java.lang.Object[] objArr11 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (i4 >= objArr11.length) {
                    kotlin.collections.ArraysKt.copyInto(objArr11, objArr11, i4 - objArr11.length, Camera2StreamConfigurationMap2, objArr11.length);
                } else {
                    kotlin.collections.ArraysKt.copyInto(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    java.lang.Object[] objArr12 = this.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.collections.ArraysKt.copyInto(objArr12, objArr12, i4, Camera2StreamConfigurationMap2, objArr12.length - size);
                }
            }
            Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, elements);
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int index) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        return (E) this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + index)];
    }

    @Override // kotlin.collections.AbstractMutableList, java.util.AbstractList, java.util.List
    @kotlin.IgnorableReturnValue
    public final E set(int index, E element) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + index);
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        E e = (E) objArr[Camera2StreamConfigurationMap];
        objArr[Camera2StreamConfigurationMap] = element;
        return e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object element) {
        return indexOf(element) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object element) {
        int i;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 < Camera2StreamConfigurationMap) {
            while (i2 < Camera2StreamConfigurationMap) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.getHighResolutionOutputSizeshNQ4ISI[i2])) {
                    i = this.Camera2StreamConfigurationMap;
                } else {
                    i2++;
                }
            }
            return -1;
        }
        if (isEmpty() || (i2 = this.Camera2StreamConfigurationMap) < Camera2StreamConfigurationMap) {
            return -1;
        }
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        while (true) {
            if (i2 >= length) {
                for (int i3 = 0; i3 < Camera2StreamConfigurationMap; i3++) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.getHighResolutionOutputSizeshNQ4ISI[i3])) {
                        i2 = i3 + this.getHighResolutionOutputSizeshNQ4ISI.length;
                        i = this.Camera2StreamConfigurationMap;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.getHighResolutionOutputSizeshNQ4ISI[i2])) {
                i = this.Camera2StreamConfigurationMap;
                break;
            }
            i2++;
        }
        return i2 - i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object element) {
        int lastIndex;
        int i;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 < Camera2StreamConfigurationMap) {
            lastIndex = Camera2StreamConfigurationMap - 1;
            if (i2 <= lastIndex) {
                while (!kotlin.jvm.internal.Intrinsics.areEqual(element, this.getHighResolutionOutputSizeshNQ4ISI[lastIndex])) {
                    if (lastIndex != i2) {
                        lastIndex--;
                    }
                }
                i = this.Camera2StreamConfigurationMap;
                return lastIndex - i;
            }
            return -1;
        }
        if (!isEmpty() && this.Camera2StreamConfigurationMap >= Camera2StreamConfigurationMap) {
            int i3 = Camera2StreamConfigurationMap - 1;
            while (true) {
                if (i3 >= 0) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(element, this.getHighResolutionOutputSizeshNQ4ISI[i3])) {
                        lastIndex = i3 + this.getHighResolutionOutputSizeshNQ4ISI.length;
                        i = this.Camera2StreamConfigurationMap;
                        break;
                    }
                    i3--;
                } else {
                    lastIndex = kotlin.collections.ArraysKt.getLastIndex(this.getHighResolutionOutputSizeshNQ4ISI);
                    int i4 = this.Camera2StreamConfigurationMap;
                    if (i4 <= lastIndex) {
                        while (!kotlin.jvm.internal.Intrinsics.areEqual(element, this.getHighResolutionOutputSizeshNQ4ISI[lastIndex])) {
                            if (lastIndex != i4) {
                                lastIndex--;
                            }
                        }
                        i = this.Camera2StreamConfigurationMap;
                    }
                }
            }
            return lastIndex - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.IgnorableReturnValue
    public final boolean remove(java.lang.Object element) {
        int indexOf = indexOf(element);
        if (indexOf == -1) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    @Override // kotlin.collections.AbstractMutableList
    @kotlin.IgnorableReturnValue
    public final E removeAt(int index) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(index, size());
        kotlin.collections.ArrayDeque<E> arrayDeque = this;
        if (index == kotlin.collections.CollectionsKt.getLastIndex(arrayDeque)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        this.modCount++;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + index);
        E e = (E) this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap];
        if (index < (size() >> 1)) {
            int i = this.Camera2StreamConfigurationMap;
            if (Camera2StreamConfigurationMap >= i) {
                java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, i + 1, i, Camera2StreamConfigurationMap);
            } else {
                java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, 1, 0, Camera2StreamConfigurationMap);
                java.lang.Object[] objArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i2 = this.Camera2StreamConfigurationMap;
                kotlin.collections.ArraysKt.copyInto(objArr3, objArr3, i2 + 1, i2, objArr3.length - 1);
            }
            java.lang.Object[] objArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i3 = this.Camera2StreamConfigurationMap;
            objArr4[i3] = null;
            this.Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(i3);
        } else {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + kotlin.collections.CollectionsKt.getLastIndex(arrayDeque));
            if (Camera2StreamConfigurationMap <= Camera2StreamConfigurationMap2) {
                java.lang.Object[] objArr5 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr5, objArr5, Camera2StreamConfigurationMap, Camera2StreamConfigurationMap + 1, Camera2StreamConfigurationMap2 + 1);
            } else {
                java.lang.Object[] objArr6 = this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.collections.ArraysKt.copyInto(objArr6, objArr6, Camera2StreamConfigurationMap, Camera2StreamConfigurationMap + 1, objArr6.length);
                java.lang.Object[] objArr7 = this.getHighResolutionOutputSizeshNQ4ISI;
                objArr7[objArr7.length - 1] = objArr7[0];
                kotlin.collections.ArraysKt.copyInto(objArr7, objArr7, 0, 1, Camera2StreamConfigurationMap2 + 1);
            }
            this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap2] = null;
        }
        this.size = size() - 1;
        return e;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            this.modCount++;
            getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size()));
        }
        this.Camera2StreamConfigurationMap = 0;
        this.size = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final <T> T[] toArray(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        if (array.length < size()) {
            array = (T[]) kotlin.collections.ArraysKt.arrayOfNulls(array, size());
        }
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
        int i = this.Camera2StreamConfigurationMap;
        if (i < Camera2StreamConfigurationMap) {
            kotlin.collections.ArraysKt.copyInto$default(this.getHighResolutionOutputSizeshNQ4ISI, array, 0, i, Camera2StreamConfigurationMap, 2, (java.lang.Object) null);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.collections.ArraysKt.copyInto(objArr, array, 0, this.Camera2StreamConfigurationMap, objArr.length);
            java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
            kotlin.collections.ArraysKt.copyInto(objArr2, array, objArr2.length - this.Camera2StreamConfigurationMap, 0, Camera2StreamConfigurationMap);
        }
        return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(size(), array);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[size()]);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int fromIndex, int toIndex) {
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        if (i == 0) {
            return;
        }
        if (i == size()) {
            clear();
            return;
        }
        if (i == 1) {
            removeAt(fromIndex);
            return;
        }
        this.modCount++;
        if (fromIndex < size() - toIndex) {
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + (fromIndex - 1));
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + (toIndex - 1));
            while (fromIndex > 0) {
                int i2 = Camera2StreamConfigurationMap + 1;
                int min = java.lang.Math.min(fromIndex, java.lang.Math.min(i2, Camera2StreamConfigurationMap2 + 1));
                java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                Camera2StreamConfigurationMap2 -= min;
                Camera2StreamConfigurationMap -= min;
                kotlin.collections.ArraysKt.copyInto(objArr, objArr, Camera2StreamConfigurationMap2 + 1, Camera2StreamConfigurationMap + 1, i2);
                if (Camera2StreamConfigurationMap < 0) {
                    Camera2StreamConfigurationMap += this.getHighResolutionOutputSizeshNQ4ISI.length;
                }
                if (Camera2StreamConfigurationMap2 < 0) {
                    Camera2StreamConfigurationMap2 += this.getHighResolutionOutputSizeshNQ4ISI.length;
                }
                fromIndex -= min;
            }
            int Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + i);
            getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap3);
            this.Camera2StreamConfigurationMap = Camera2StreamConfigurationMap3;
        } else {
            int Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + toIndex);
            int Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + fromIndex);
            int size = size();
            while (true) {
                size -= toIndex;
                if (size <= 0) {
                    break;
                }
                java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                toIndex = java.lang.Math.min(size, java.lang.Math.min(objArr2.length - Camera2StreamConfigurationMap4, objArr2.length - Camera2StreamConfigurationMap5));
                java.lang.Object[] objArr3 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i3 = Camera2StreamConfigurationMap4 + toIndex;
                kotlin.collections.ArraysKt.copyInto(objArr3, objArr3, Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4, i3);
                Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(i3);
                Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap5 + toIndex);
            }
            int Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
            int i4 = Camera2StreamConfigurationMap6 - i;
            if (i4 < 0) {
                i4 += this.getHighResolutionOutputSizeshNQ4ISI.length;
            }
            getHighSpeedVideoFpsRangesFor(i4, Camera2StreamConfigurationMap6);
        }
        this.size = size() - i;
    }

    private final void getHighSpeedVideoFpsRangesFor(int p0, int p1) {
        if (p0 < p1) {
            kotlin.collections.ArraysKt.fill(this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Object) null, p0, p1);
            return;
        }
        java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.collections.ArraysKt.fill(objArr, (java.lang.Object) null, p0, objArr.length);
        kotlin.collections.ArraysKt.fill(this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Object) null, 0, p1);
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "");
        return (T[]) toArray(array);
    }

    public final java.lang.Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    public final void testRemoveRange$kotlin_stdlib(int fromIndex, int toIndex) {
        removeRange(fromIndex, toIndex);
    }

    public final void internalStructure$kotlin_stdlib(kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Object[], kotlin.Unit> structure) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(structure, "");
        structure.invoke(java.lang.Integer.valueOf((isEmpty() || (i = this.Camera2StreamConfigurationMap) < Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size())) ? this.Camera2StreamConfigurationMap : i - this.getHighResolutionOutputSizeshNQ4ISI.length), toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.IgnorableReturnValue
    public final boolean removeAll(java.util.Collection<?> elements) {
        int Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.getHighResolutionOutputSizeshNQ4ISI.length != 0) {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
            int i = this.Camera2StreamConfigurationMap;
            if (i < Camera2StreamConfigurationMap2) {
                Camera2StreamConfigurationMap = i;
                while (i < Camera2StreamConfigurationMap2) {
                    java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI[i];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap] = obj;
                        Camera2StreamConfigurationMap++;
                    }
                    i++;
                }
                kotlin.collections.ArraysKt.fill(this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Object) null, Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
            } else {
                int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i2);
                for (int i3 = 0; i3 < Camera2StreamConfigurationMap2; i3++) {
                    java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap] = obj3;
                        Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
                    }
                }
                z = z2;
            }
            if (z) {
                this.modCount++;
                int i4 = Camera2StreamConfigurationMap - this.Camera2StreamConfigurationMap;
                if (i4 < 0) {
                    i4 += this.getHighResolutionOutputSizeshNQ4ISI.length;
                }
                this.size = i4;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @kotlin.IgnorableReturnValue
    public final boolean retainAll(java.util.Collection<?> elements) {
        int Camera2StreamConfigurationMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.getHighResolutionOutputSizeshNQ4ISI.length != 0) {
            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size());
            int i = this.Camera2StreamConfigurationMap;
            if (i < Camera2StreamConfigurationMap2) {
                Camera2StreamConfigurationMap = i;
                while (i < Camera2StreamConfigurationMap2) {
                    java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI[i];
                    if (elements.contains(obj)) {
                        this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap] = obj;
                        Camera2StreamConfigurationMap++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                kotlin.collections.ArraysKt.fill(this.getHighResolutionOutputSizeshNQ4ISI, (java.lang.Object) null, Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
            } else {
                int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    java.lang.Object[] objArr = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (elements.contains(obj2)) {
                        this.getHighResolutionOutputSizeshNQ4ISI[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(i2);
                for (int i3 = 0; i3 < Camera2StreamConfigurationMap2; i3++) {
                    java.lang.Object[] objArr2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    java.lang.Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (elements.contains(obj3)) {
                        this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap] = obj3;
                        Camera2StreamConfigurationMap = getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                this.modCount++;
                int i4 = Camera2StreamConfigurationMap - this.Camera2StreamConfigurationMap;
                if (i4 < 0) {
                    i4 += this.getHighResolutionOutputSizeshNQ4ISI.length;
                }
                this.size = i4;
            }
        }
        return z;
    }

    public final void addFirst(E element) {
        this.modCount++;
        getHighSpeedVideoFpsRangesFor(size() + 1);
        int i = this.Camera2StreamConfigurationMap;
        int lastIndex = i == 0 ? kotlin.collections.ArraysKt.getLastIndex(this.getHighResolutionOutputSizeshNQ4ISI) : i - 1;
        this.Camera2StreamConfigurationMap = lastIndex;
        this.getHighResolutionOutputSizeshNQ4ISI[lastIndex] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        this.modCount++;
        getHighSpeedVideoFpsRangesFor(size() + 1);
        this.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap + size())] = element;
        this.size = size() + 1;
    }
}
