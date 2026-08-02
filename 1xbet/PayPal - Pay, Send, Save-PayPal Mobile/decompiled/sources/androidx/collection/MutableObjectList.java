package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003MNOB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\t\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\rJ\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u000f\u0010\u0012J\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u000f\u0010\u0014J#\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000f\u0010\u0015J#\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u000f\u0010\u0016J#\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u000f\u0010\u0018J\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u000f\u0010\u001aJ\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u000f\u0010\u001cJ\u001b\u0010\u000f\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b\u000f\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b\"\u0010 J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b&\u0010\u0006J\u0018\u0010'\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b'\u0010(J\u001e\u0010'\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b'\u0010)J\u001e\u0010'\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002¢\u0006\u0004\b'\u0010*J\u001e\u0010'\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002¢\u0006\u0004\b'\u0010+J\u001e\u0010'\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b'\u0010,J\u001e\u0010'\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b'\u0010-J\u001e\u0010'\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\u0002¢\u0006\u0004\b'\u0010.J\u0018\u0010/\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b/\u0010(J\u001e\u0010/\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b/\u0010)J\u001e\u0010/\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\u0002¢\u0006\u0004\b/\u0010*J\u001e\u0010/\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0086\u0002¢\u0006\u0004\b/\u0010+J\u001e\u0010/\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0086\u0002¢\u0006\u0004\b/\u0010,J\u001e\u0010/\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b/\u0010-J\u001e\u0010/\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0086\u0002¢\u0006\u0004\b/\u0010.J\u0015\u00100\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b0\u0010\nJ\u001b\u00101\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b1\u0010\u0010J\u001b\u00101\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b1\u0010\u0012J\u001b\u00101\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b1\u0010\u0014J\u001b\u00101\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b1\u0010\u001aJ\u001b\u00101\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b1\u0010\u001cJ\u001b\u00101\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\b1\u0010\u001eJ\u0015\u00102\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b2\u00103J,\u00107\u001a\u00020\f2\u0017\u00106\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b5\u0012\u0004\u0012\u00020\b04H\u0086\bø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001d\u0010;\u001a\u00020\f2\u0006\u00109\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0003¢\u0006\u0004\b;\u0010<J'\u0010?\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00032\u000e\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0\u0013H\u0000¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\bA\u0010\u0010J\u001b\u0010A\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\bA\u0010\u0014J\u001b\u0010A\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\bA\u0010BJ\u001b\u0010A\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\bA\u0010\u001aJ\u001b\u0010A\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d¢\u0006\u0004\bA\u0010\u001eJ \u0010C\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\f2\b\b\u0002\u0010E\u001a\u00020\u0003¢\u0006\u0004\bF\u0010\u0006R\u0012\u0010%\u001a\u00020\u00038Ç\u0002¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010I8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "", "initialCapacity", "<init>", "(I)V", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "index", "", "(ILjava/lang/Object;)V", "elements", "addAll", "(Landroidx/collection/ObjectList;)Z", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)Z", "", "([Ljava/lang/Object;)Z", "(ILandroidx/collection/ObjectList;)Z", "(I[Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "", "(Ljava/lang/Iterable;)Z", "", "(Ljava/util/List;)Z", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Z", "asList", "()Ljava/util/List;", "", "asMutableList", "clear", "()V", "capacity", "ensureCapacity", "minusAssign", "(Ljava/lang/Object;)V", "(Landroidx/collection/ObjectList;)V", "(Landroidx/collection/ScatterSet;)V", "([Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "(Ljava/util/List;)V", "(Lkotlin/sequences/Sequence;)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "removeRange", "(II)V", "", "oldContent", "resizeStorage", "(I[Ljava/lang/Object;)V", "retainAll", "(Ljava/util/Collection;)Z", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "minCapacity", "trim", "getCapacity", "()I", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "Camera2StreamConfigurationMap", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "getHighSpeedVideoSizes", "MutableObjectListIterator", "ObjectListMutableList", "SubList"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableObjectList<E> extends androidx.collection.ObjectList<E> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.collection.MutableObjectList.ObjectListMutableList<E> getHighSpeedVideoSizes;

    public MutableObjectList(int i) {
        super(i, null);
    }

    public /* synthetic */ MutableObjectList(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(E element) {
        int i = this._size + 1;
        java.lang.Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        this.content[this._size] = element;
        this._size++;
        return true;
    }

    public final void add(int index, E element) {
        if (index < 0 || index > this._size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(index);
            sb.append(" must be in 0..");
            sb.append(this._size);
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
        }
        int i = this._size + 1;
        java.lang.Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        java.lang.Object[] objArr2 = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, index + 1, index, this._size);
        }
        objArr2[index] = element;
        this._size++;
    }

    public final boolean addAll(int index, E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (index < 0 || index > this._size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(index);
            sb.append(" must be in 0..");
            sb.append(this._size);
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
        }
        if (elements.length == 0) {
            return false;
        }
        int length = this._size + elements.length;
        java.lang.Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        java.lang.Object[] objArr2 = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, elements.length + index, index, this._size);
        }
        kotlin.collections.ArraysKt.copyInto$default(elements, objArr2, index, 0, 0, 12, (java.lang.Object) null);
        this._size += elements.length;
        return true;
    }

    public final boolean addAll(int index, java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (index < 0 || index > this._size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(index);
            sb.append(" must be in 0..");
            sb.append(this._size);
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
        }
        int i = 0;
        if (elements.isEmpty()) {
            return false;
        }
        int size = this._size + elements.size();
        java.lang.Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        java.lang.Object[] objArr2 = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, elements.size() + index, index, this._size);
        }
        for (java.lang.Object obj : elements) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            objArr2[i + index] = obj;
            i++;
        }
        this._size += elements.size();
        return true;
    }

    public final boolean addAll(int index, androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (index < 0 || index > this._size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Index ");
            sb.append(index);
            sb.append(" must be in 0..");
            sb.append(this._size);
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
        }
        if (elements.isEmpty()) {
            return false;
        }
        int i = this._size + elements._size;
        java.lang.Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        java.lang.Object[] objArr2 = this.content;
        if (index != this._size) {
            kotlin.collections.ArraysKt.copyInto(objArr2, objArr2, elements._size + index, index, this._size);
        }
        kotlin.collections.ArraysKt.copyInto(elements.content, objArr2, index, 0, elements._size);
        this._size += elements._size;
        return true;
    }

    public final boolean addAll(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        plusAssign((androidx.collection.ObjectList) elements);
        return i != this._size;
    }

    public final boolean addAll(androidx.collection.ScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        plusAssign((androidx.collection.ScatterSet) elements);
        return i != this._size;
    }

    public final boolean addAll(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        plusAssign((java.lang.Object[]) elements);
        return i != this._size;
    }

    public final boolean addAll(java.util.List<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        plusAssign((java.util.List) elements);
        return i != this._size;
    }

    public final boolean addAll(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        plusAssign((java.lang.Iterable) elements);
        return i != this._size;
    }

    public final boolean addAll(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        plusAssign((kotlin.sequences.Sequence) elements);
        return i != this._size;
    }

    public final void plusAssign(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (elements.isEmpty()) {
            return;
        }
        int i = this._size + elements._size;
        java.lang.Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        kotlin.collections.ArraysKt.copyInto(elements.content, this.content, this._size, 0, elements._size);
        this._size += elements._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(androidx.collection.ScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (elements.isEmpty()) {
            return;
        }
        int i = this._size + elements.get_size();
        java.lang.Object[] objArr = this.content;
        if (objArr.length < i) {
            resizeStorage(i, objArr);
        }
        java.lang.Object[] objArr2 = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j) < 128) {
                        add(objArr2[(i2 << 3) + i4]);
                    }
                    j >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void plusAssign(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (elements.length == 0) {
            return;
        }
        int length = this._size + elements.length;
        java.lang.Object[] objArr = this.content;
        if (objArr.length < length) {
            resizeStorage(length, objArr);
        }
        kotlin.collections.ArraysKt.copyInto$default(elements, this.content, this._size, 0, 0, 12, (java.lang.Object) null);
        this._size += elements.length;
    }

    public final void plusAssign(java.util.List<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        if (elements.isEmpty()) {
            return;
        }
        int i = this._size;
        int size = elements.size() + i;
        java.lang.Object[] objArr = this.content;
        if (objArr.length < size) {
            resizeStorage(size, objArr);
        }
        java.lang.Object[] objArr2 = this.content;
        int size2 = elements.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = elements.get(i2);
        }
        this._size += elements.size();
    }

    public final void clear() {
        kotlin.collections.ArraysKt.fill(this.content, (java.lang.Object) null, 0, this._size);
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(androidx.collection.MutableObjectList mutableObjectList, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableObjectList._size;
        }
        mutableObjectList.trim(i);
    }

    public final void trim(int minCapacity) {
        int max = java.lang.Math.max(minCapacity, this._size);
        if (this.content.length > max) {
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(this.content, max);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
            this.content = copyOf;
        }
    }

    public final void ensureCapacity(int capacity) {
        java.lang.Object[] objArr = this.content;
        if (objArr.length < capacity) {
            resizeStorage(capacity, objArr);
        }
    }

    public final void resizeStorage(int capacity, java.lang.Object[] oldContent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldContent, "");
        int length = oldContent.length;
        this.content = kotlin.collections.ArraysKt.copyInto(oldContent, new java.lang.Object[java.lang.Math.max(capacity, (length * 3) / 2)], 0, 0, length);
    }

    public final void plusAssign(E element) {
        add(element);
    }

    public final void minusAssign(E element) {
        remove(element);
    }

    public final boolean remove(E element) {
        int indexOf = indexOf(element);
        if (indexOf < 0) {
            return false;
        }
        removeAt(indexOf);
        return true;
    }

    public final void removeIf(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        int i = this._size;
        java.lang.Object[] objArr = this.content;
        int i2 = 0;
        kotlin.ranges.IntRange until = kotlin.ranges.RangesKt.until(0, this._size);
        int first = until.getFirst();
        int last = until.getLast();
        if (first <= last) {
            while (true) {
                objArr[first - i2] = objArr[first];
                if (predicate.invoke(objArr[first]).booleanValue()) {
                    i2++;
                }
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        kotlin.collections.ArraysKt.fill(objArr, (java.lang.Object) null, i - i2, i);
        this._size -= i2;
    }

    public final boolean removeAll(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        for (E e : elements) {
            remove(e);
        }
        return i != this._size;
    }

    public final boolean removeAll(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        minusAssign((androidx.collection.ObjectList) elements);
        return i != this._size;
    }

    public final boolean removeAll(androidx.collection.ScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        minusAssign((androidx.collection.ScatterSet) elements);
        return i != this._size;
    }

    public final boolean removeAll(java.util.List<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        minusAssign((java.util.List) elements);
        return i != this._size;
    }

    public final boolean removeAll(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        minusAssign((java.lang.Iterable) elements);
        return i != this._size;
    }

    public final boolean removeAll(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        minusAssign((kotlin.sequences.Sequence) elements);
        return i != this._size;
    }

    public final void minusAssign(java.util.List<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            remove(elements.get(i));
        }
    }

    public final E removeAt(int index) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        java.lang.Object[] objArr = this.content;
        E e = (E) objArr[index];
        if (index != this._size - 1) {
            kotlin.collections.ArraysKt.copyInto(objArr, objArr, index, index + 1, this._size);
        }
        this._size--;
        objArr[this._size] = null;
        return e;
    }

    public final void removeRange(int start, int end) {
        if (start < 0 || start > this._size || end < 0 || end > this._size) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Start (");
            sb.append(start);
            sb.append(") and end (");
            sb.append(end);
            sb.append(") must be in 0..");
            sb.append(this._size);
            androidx.collection.internal.RuntimeHelpersKt.throwIndexOutOfBoundsException(sb.toString());
        }
        if (end < start) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Start (");
            sb2.append(start);
            sb2.append(") is more than end (");
            sb2.append(end);
            sb2.append(')');
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException(sb2.toString());
        }
        if (end != start) {
            if (end < this._size) {
                kotlin.collections.ArraysKt.copyInto(this.content, this.content, start, end, this._size);
            }
            int i = this._size - (end - start);
            kotlin.collections.ArraysKt.fill(this.content, (java.lang.Object) null, i, this._size);
            this._size = i;
        }
    }

    public final boolean retainAll(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        java.lang.Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (kotlin.collections.ArraysKt.indexOf(elements, objArr[i2]) < 0) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        java.lang.Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!elements.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        java.lang.Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!elements.contains(objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        java.lang.Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!kotlin.collections.CollectionsKt.contains(elements, objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = this._size;
        java.lang.Object[] objArr = this.content;
        for (int i2 = this._size - 1; i2 >= 0; i2--) {
            if (!kotlin.sequences.SequencesKt.contains(elements, objArr[i2])) {
                removeAt(i2);
            }
        }
        return i != this._size;
    }

    public final E set(int index, E element) {
        if (index < 0 || index >= this._size) {
            throwIndexOutOfBoundsExclusiveException$collection(index);
        }
        java.lang.Object[] objArr = this.content;
        E e = (E) objArr[index];
        objArr[index] = element;
        return e;
    }

    @Override // androidx.collection.ObjectList
    public final java.util.List<E> asList() {
        return asMutableList();
    }

    public final java.util.List<E> asMutableList() {
        androidx.collection.MutableObjectList.ObjectListMutableList<E> objectListMutableList = this.getHighSpeedVideoSizes;
        if (objectListMutableList != null) {
            return objectListMutableList;
        }
        androidx.collection.MutableObjectList.ObjectListMutableList<E> objectListMutableList2 = new androidx.collection.MutableObjectList.ObjectListMutableList<>(this);
        this.getHighSpeedVideoSizes = objectListMutableList2;
        return objectListMutableList2;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", "T", "", "", "p0", "", "p1", "<init>", "(Ljava/util/List;I)V", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)V", "", "hasNext", "()Z", "hasPrevious", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/Object;", "nextIndex", "()I", "previous", "previousIndex", "remove", "()V", "set", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class MutableObjectListIterator<T> implements java.util.ListIterator<T>, kotlin.jvm.internal.markers.KMutableListIterator {
        private final java.util.List<T> getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoSizes;

        public MutableObjectListIterator(java.util.List<T> list, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.getHighSpeedVideoFpsRanges = list;
            this.getHighSpeedVideoSizes = i - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final boolean hasNext() {
            return this.getHighSpeedVideoSizes < this.getHighSpeedVideoFpsRanges.size() - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final T next() {
            java.util.List<T> list = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = i;
            return list.get(i);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public final void remove() {
            this.getHighSpeedVideoFpsRanges.remove(this.getHighSpeedVideoSizes);
            this.getHighSpeedVideoSizes--;
        }

        @Override // java.util.ListIterator
        public final boolean hasPrevious() {
            return this.getHighSpeedVideoSizes >= 0;
        }

        @Override // java.util.ListIterator
        public final int nextIndex() {
            return this.getHighSpeedVideoSizes + 1;
        }

        @Override // java.util.ListIterator
        public final T previous() {
            java.util.List<T> list = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i - 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public final int previousIndex() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // java.util.ListIterator
        public final void add(T p0) {
            java.util.List<T> list = this.getHighSpeedVideoFpsRanges;
            int i = this.getHighSpeedVideoSizes + 1;
            this.getHighSpeedVideoSizes = i;
            list.add(i, p0);
        }

        @Override // java.util.ListIterator
        public final void set(T p0) {
            this.getHighSpeedVideoFpsRanges.set(this.getHighSpeedVideoSizes, p0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\r\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\b\u0010\rJ%\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\tJ\u001d\u0010\u0015\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0004\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\tJ\u001d\u0010%\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b%\u0010\u0011J\u001d\u0010&\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b&\u0010\u0011J \u0010'\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", "T", "", "Landroidx/collection/MutableObjectList;", "p0", "<init>", "(Landroidx/collection/MutableObjectList;)V", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "p1", "", "(ILjava/lang/Object;)V", "", "addAll", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "clear", "()V", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/MutableObjectList;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class ObjectListMutableList<T> implements java.util.List<T>, kotlin.jvm.internal.markers.KMutableList {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.collection.MutableObjectList<T> getHighSpeedVideoSizes;

        public ObjectListMutableList(androidx.collection.MutableObjectList<T> mutableObjectList) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableObjectList, "");
            this.getHighSpeedVideoSizes = mutableObjectList;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(java.lang.Object p0) {
            return this.getHighSpeedVideoSizes.contains(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(java.util.Collection<? extends java.lang.Object> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.getHighSpeedVideoSizes.containsAll(p0);
        }

        @Override // java.util.List
        public final T get(int p0) {
            androidx.collection.ObjectListKt.access$checkIndex(this, p0);
            return this.getHighSpeedVideoSizes.get(p0);
        }

        @Override // java.util.List
        public final int indexOf(java.lang.Object p0) {
            return this.getHighSpeedVideoSizes.indexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.getHighSpeedVideoSizes.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<T> iterator() {
            return new androidx.collection.MutableObjectList.MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(java.lang.Object p0) {
            return this.getHighSpeedVideoSizes.lastIndexOf(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            return this.getHighSpeedVideoSizes.add(p0);
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.getHighSpeedVideoSizes.add(p0, p1);
        }

        @Override // java.util.List
        public final boolean addAll(int p0, java.util.Collection<? extends T> p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            return this.getHighSpeedVideoSizes.addAll(p0, p1);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends T> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.getHighSpeedVideoSizes.addAll(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            this.getHighSpeedVideoSizes.clear();
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator() {
            return new androidx.collection.MutableObjectList.MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator(int p0) {
            return new androidx.collection.MutableObjectList.MutableObjectListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(java.lang.Object p0) {
            return this.getHighSpeedVideoSizes.remove(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(java.util.Collection<? extends java.lang.Object> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.getHighSpeedVideoSizes.removeAll(p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(java.util.Collection<? extends java.lang.Object> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            return this.getHighSpeedVideoSizes.retainAll((java.util.Collection<? extends T>) p0);
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            androidx.collection.ObjectListKt.access$checkIndex(this, p0);
            return this.getHighSpeedVideoSizes.set(p0, p1);
        }

        @Override // java.util.List
        public final java.util.List<T> subList(int p0, int p1) {
            androidx.collection.MutableObjectList.ObjectListMutableList<T> objectListMutableList = this;
            androidx.collection.ObjectListKt.access$checkSubIndex(objectListMutableList, p0, p1);
            return new androidx.collection.MutableObjectList.SubList(objectListMutableList, p0, p1);
        }

        @Override // java.util.List
        public final T remove(int i) {
            androidx.collection.ObjectListKt.access$checkIndex(this, i);
            return this.getHighSpeedVideoSizes.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public final int size() {
            return this.getHighSpeedVideoSizes.getSize();
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
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B%\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\rJ%\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u000bJ\u001d\u0010\u0015\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010#J\u0017\u0010$\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b$\u0010\u000bJ\u001d\u0010%\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b%\u0010\u0011J\u001d\u0010&\u001a\u00020\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0016¢\u0006\u0004\b&\u0010\u0011J \u0010'\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010,"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", "T", "", "p0", "", "p1", "p2", "<init>", "(Ljava/util/List;II)V", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "", "(ILjava/lang/Object;)V", "", "addAll", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "clear", "()V", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class SubList<T> implements java.util.List<T>, kotlin.jvm.internal.markers.KMutableList {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final java.util.List<T> Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private int getHighSpeedVideoFpsRanges;

        public SubList(java.util.List<T> list, int i, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.Camera2StreamConfigurationMap = list;
            this.getHighSpeedVideoSizes = i;
            this.getHighSpeedVideoFpsRanges = i2;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean contains(java.lang.Object p0) {
            int i = this.getHighSpeedVideoFpsRanges;
            for (int i2 = this.getHighSpeedVideoSizes; i2 < i; i2++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.get(i2), p0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean containsAll(java.util.Collection<? extends java.lang.Object> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            java.util.Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public final T get(int p0) {
            androidx.collection.ObjectListKt.access$checkIndex(this, p0);
            return this.Camera2StreamConfigurationMap.get(p0 + this.getHighSpeedVideoSizes);
        }

        @Override // java.util.List
        public final int indexOf(java.lang.Object p0) {
            int i = this.getHighSpeedVideoFpsRanges;
            for (int i2 = this.getHighSpeedVideoSizes; i2 < i; i2++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.get(i2), p0)) {
                    return i2 - this.getHighSpeedVideoSizes;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean isEmpty() {
            return this.getHighSpeedVideoFpsRanges == this.getHighSpeedVideoSizes;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public final java.util.Iterator<T> iterator() {
            return new androidx.collection.MutableObjectList.MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final int lastIndexOf(java.lang.Object p0) {
            int i = this.getHighSpeedVideoFpsRanges - 1;
            int i2 = this.getHighSpeedVideoSizes;
            if (i2 > i) {
                return -1;
            }
            while (!kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.get(i), p0)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.getHighSpeedVideoSizes;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean add(T p0) {
            java.util.List<T> list = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i + 1;
            list.add(i, p0);
            return true;
        }

        @Override // java.util.List
        public final void add(int p0, T p1) {
            this.Camera2StreamConfigurationMap.add(p0 + this.getHighSpeedVideoSizes, p1);
            this.getHighSpeedVideoFpsRanges++;
        }

        @Override // java.util.List
        public final boolean addAll(int p0, java.util.Collection<? extends T> p1) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
            this.Camera2StreamConfigurationMap.addAll(p0 + this.getHighSpeedVideoSizes, p1);
            this.getHighSpeedVideoFpsRanges += p1.size();
            return p1.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean addAll(java.util.Collection<? extends T> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.Camera2StreamConfigurationMap.addAll(this.getHighSpeedVideoFpsRanges, p0);
            this.getHighSpeedVideoFpsRanges += p0.size();
            return p0.size() > 0;
        }

        @Override // java.util.List, java.util.Collection
        public final void clear() {
            int i = this.getHighSpeedVideoFpsRanges - 1;
            int i2 = this.getHighSpeedVideoSizes;
            if (i2 <= i) {
                while (true) {
                    this.Camera2StreamConfigurationMap.remove(i);
                    if (i == i2) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            this.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoSizes;
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator() {
            return new androidx.collection.MutableObjectList.MutableObjectListIterator(this, 0);
        }

        @Override // java.util.List
        public final java.util.ListIterator<T> listIterator(int p0) {
            return new androidx.collection.MutableObjectList.MutableObjectListIterator(this, p0);
        }

        @Override // java.util.List, java.util.Collection
        public final boolean remove(java.lang.Object p0) {
            int i = this.getHighSpeedVideoFpsRanges;
            for (int i2 = this.getHighSpeedVideoSizes; i2 < i; i2++) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap.get(i2), p0)) {
                    this.Camera2StreamConfigurationMap.remove(i2);
                    this.getHighSpeedVideoFpsRanges--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean removeAll(java.util.Collection<? extends java.lang.Object> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            int i = this.getHighSpeedVideoFpsRanges;
            java.util.Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i != this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.List, java.util.Collection
        public final boolean retainAll(java.util.Collection<? extends java.lang.Object> p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            int i = this.getHighSpeedVideoFpsRanges;
            int i2 = i - 1;
            int i3 = this.getHighSpeedVideoSizes;
            if (i3 <= i2) {
                while (true) {
                    if (!p0.contains(this.Camera2StreamConfigurationMap.get(i2))) {
                        this.Camera2StreamConfigurationMap.remove(i2);
                        this.getHighSpeedVideoFpsRanges--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            return i != this.getHighSpeedVideoFpsRanges;
        }

        @Override // java.util.List
        public final T set(int p0, T p1) {
            androidx.collection.ObjectListKt.access$checkIndex(this, p0);
            return this.Camera2StreamConfigurationMap.set(p0 + this.getHighSpeedVideoSizes, p1);
        }

        @Override // java.util.List
        public final java.util.List<T> subList(int p0, int p1) {
            androidx.collection.MutableObjectList.SubList<T> subList = this;
            androidx.collection.ObjectListKt.access$checkSubIndex(subList, p0, p1);
            return new androidx.collection.MutableObjectList.SubList(subList, p0, p1);
        }

        @Override // java.util.List
        public final T remove(int i) {
            androidx.collection.ObjectListKt.access$checkIndex(this, i);
            this.getHighSpeedVideoFpsRanges--;
            return this.Camera2StreamConfigurationMap.remove(i + this.getHighSpeedVideoSizes);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return this.getHighSpeedVideoFpsRanges - this.getHighSpeedVideoSizes;
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
    }

    public final void plusAssign(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void plusAssign(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    public final void minusAssign(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        for (E e : elements) {
            remove(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            remove(objArr[i2]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.ScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        remove(objArr[(i << 3) + i3]);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void minusAssign(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public MutableObjectList() {
        this(0, 1, null);
    }
}
