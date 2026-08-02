package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000fJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\r\u0010\u0011J\u001d\u0010\r\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012¢\u0006\u0004\b\r\u0010\u0013J\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b\r\u0010\u0015J\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\r\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b%\u0010\u0006J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b!\u0010\u0006J\u0018\u0010&\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010'J\u001e\u0010&\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b&\u0010(J\u001e\u0010&\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b&\u0010)J\u001e\u0010&\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002¢\u0006\u0004\b&\u0010*J \u0010&\u001a\u00020\u00182\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b&\u0010+J\u001e\u0010&\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002¢\u0006\u0004\b&\u0010,J\u001e\u0010&\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002¢\u0006\u0004\b&\u0010-J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b.\u0010'J\u001e\u0010.\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0086\u0002¢\u0006\u0004\b.\u0010(J\u001e\u0010.\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002¢\u0006\u0004\b.\u0010)J\u001e\u0010.\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0086\u0002¢\u0006\u0004\b.\u0010*J \u0010.\u001a\u00020\u00182\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012H\u0086\u0002¢\u0006\u0004\b.\u0010+J\u001e\u0010.\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0086\u0002¢\u0006\u0004\b.\u0010,J\u001e\u0010.\u001a\u00020\u00182\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\u0002¢\u0006\u0004\b.\u0010-J\u0015\u0010/\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b/\u0010\nJ\u001b\u00100\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b0\u0010\u000eJ\u001b\u00100\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b0\u0010\u000fJ\u001b\u00100\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b0\u0010\u0011J\u001d\u00100\u001a\u00020\b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0012¢\u0006\u0004\b0\u0010\u0013J\u001b\u00100\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014¢\u0006\u0004\b0\u0010\u0015J\u001b\u00100\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b0\u0010\u0017J\u0017\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u00020\u0003H\u0000¢\u0006\u0004\b2\u0010\u0006J'\u00105\u001a\u00020\u00182\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b03H\u0086\bø\u0001\u0000¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00182\u0006\u00107\u001a\u00020\u0003H\u0000¢\u0006\u0004\b8\u0010\u0006J'\u00109\u001a\u00020\b2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b03H\u0086\bø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u00109\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b9\u0010\u000fJ\u001b\u00109\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b9\u0010\u0011J\u001b\u00109\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000;¢\u0006\u0004\b9\u0010<J\r\u0010=\u001a\u00020\u0003¢\u0006\u0004\b=\u0010>J\u0015\u0010@\u001a\u00020\u00182\u0006\u0010?\u001a\u00020\u0003¢\u0006\u0004\b@\u0010\u0006R\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/collection/MutableOrderedScatterSet;", "E", "Landroidx/collection/OrderedScatterSet;", "", "initialCapacity", "<init>", "(I)V", "element", "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "(Ljava/lang/Object;)Z", "Landroidx/collection/ObjectList;", "elements", "addAll", "(Landroidx/collection/ObjectList;)Z", "(Landroidx/collection/OrderedScatterSet;)Z", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)Z", "", "([Ljava/lang/Object;)Z", "", "(Ljava/lang/Iterable;)Z", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)Z", "", "adjustStorage$collection", "()V", "", "asMutableSet", "()Ljava/util/Set;", "clear", "dropDeletes$collection", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/Object;)I", "getHighSpeedVideoFpsRangesFor", "(I)I", "getHighSpeedVideoFpsRanges", "minusAssign", "(Ljava/lang/Object;)V", "(Landroidx/collection/ObjectList;)V", "(Landroidx/collection/OrderedScatterSet;)V", "(Landroidx/collection/ScatterSet;)V", "([Ljava/lang/Object;)V", "(Ljava/lang/Iterable;)V", "(Lkotlin/sequences/Sequence;)V", "plusAssign", "remove", "removeAll", "index", "removeElementAt", "Lkotlin/Function1;", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function1;)V", "newCapacity", "resizeStorage$collection", "retainAll", "(Lkotlin/jvm/functions/Function1;)Z", "", "(Ljava/util/Collection;)Z", "trim", "()I", "maxSize", "trimToSize", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableOrderedScatterSet<E> extends androidx.collection.OrderedScatterSet<E> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    public /* synthetic */ MutableOrderedScatterSet(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public MutableOrderedScatterSet(int i) {
        super(null);
        if (i < 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("Capacity must be a positive value.");
        }
        getHighResolutionOutputSizeshNQ4ISI(androidx.collection.ScatterMapKt.unloadedCapacity(i));
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0) {
        long[] jArr;
        int max = p0 > 0 ? java.lang.Math.max(7, androidx.collection.ScatterMapKt.normalizeCapacity(p0)) : 0;
        this._capacity = max;
        getHighSpeedVideoFpsRanges(max);
        this.elements = max == 0 ? androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS : new java.lang.Object[max];
        if (max == 0) {
            jArr = androidx.collection.SieveCacheKt.getEmptyNodes();
        } else {
            jArr = new long[max];
            kotlin.collections.ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (java.lang.Object) null);
        }
        this.nodes = jArr;
    }

    private final void getHighSpeedVideoFpsRanges(int p0) {
        long[] jArr;
        if (p0 == 0) {
            jArr = androidx.collection.ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((p0 + 15) & (-8)) >> 3];
            kotlin.collections.ArraysKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (java.lang.Object) null);
        }
        this.metadata = jArr;
        long[] jArr2 = this.metadata;
        int i = p0 >> 3;
        long j = 255 << ((p0 & 7) << 3);
        jArr2[i] = (jArr2[i] & (~j)) | j;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    public final boolean add(E element) {
        int i = get_size();
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((androidx.collection.MutableOrderedScatterSet<E>) element);
        this.elements[highResolutionOutputSizeshNQ4ISI] = element;
        this.nodes[highResolutionOutputSizeshNQ4ISI] = (this.head & androidx.collection.SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head != Integer.MAX_VALUE) {
            this.nodes[this.head] = ((androidx.collection.SieveCacheKt.NodeLinkMask & highResolutionOutputSizeshNQ4ISI) << 31) | (this.nodes[this.head] & androidx.collection.SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = highResolutionOutputSizeshNQ4ISI;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = highResolutionOutputSizeshNQ4ISI;
        }
        return get_size() != i;
    }

    public final void plusAssign(E element) {
        int highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((androidx.collection.MutableOrderedScatterSet<E>) element);
        this.elements[highResolutionOutputSizeshNQ4ISI] = element;
        this.nodes[highResolutionOutputSizeshNQ4ISI] = (this.head & androidx.collection.SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (this.head != Integer.MAX_VALUE) {
            this.nodes[this.head] = ((androidx.collection.SieveCacheKt.NodeLinkMask & highResolutionOutputSizeshNQ4ISI) << 31) | (this.nodes[this.head] & androidx.collection.SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = highResolutionOutputSizeshNQ4ISI;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = highResolutionOutputSizeshNQ4ISI;
        }
    }

    public final boolean addAll(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        plusAssign((java.lang.Object[]) elements);
        return i != get_size();
    }

    public final boolean addAll(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        plusAssign((java.lang.Iterable) elements);
        return i != get_size();
    }

    public final boolean addAll(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        plusAssign((kotlin.sequences.Sequence) elements);
        return i != get_size();
    }

    public final boolean addAll(androidx.collection.OrderedScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        plusAssign((androidx.collection.OrderedScatterSet) elements);
        return i != get_size();
    }

    public final boolean addAll(androidx.collection.ScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        plusAssign((androidx.collection.ScatterSet) elements);
        return i != get_size();
    }

    public final boolean addAll(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        plusAssign((androidx.collection.ObjectList) elements);
        return i != get_size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r14 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean remove(E element) {
        int i;
        androidx.collection.MutableOrderedScatterSet<E> mutableOrderedScatterSet = this;
        int hashCode = (element != null ? element.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = mutableOrderedScatterSet._capacity;
        int i4 = (i2 >>> 7) & i3;
        int i5 = 0;
        loop0: while (true) {
            long[] jArr = mutableOrderedScatterSet.metadata;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = ((i2 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            int i8 = i2;
            long j3 = (~j2) & (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i4) & i3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mutableOrderedScatterSet.elements[i], element)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
            i2 = i8;
        }
        boolean z = i >= 0;
        if (z) {
            removeElementAt(i);
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void minusAssign(E element) {
        int i;
        androidx.collection.MutableOrderedScatterSet<E> mutableOrderedScatterSet = this;
        int i2 = 0;
        int hashCode = (element != null ? element.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i3 = mutableOrderedScatterSet._capacity;
        int i4 = (hashCode ^ (hashCode << 16)) >>> 7;
        loop0: while (true) {
            int i5 = i4 & i3;
            long[] jArr = mutableOrderedScatterSet.metadata;
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j2 = ((r2 & 127) * androidx.collection.ScatterMapKt.BitmaskLsb) ^ j;
            long j3 = (j2 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j2) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((java.lang.Long.numberOfTrailingZeros(j3) >> 3) + i5) & i3;
                if (kotlin.jvm.internal.Intrinsics.areEqual(mutableOrderedScatterSet.elements[i], element)) {
                    break loop0;
                } else {
                    j3 &= j3 - 1;
                }
            }
            i2 += 8;
            i4 = i5 + i2;
        }
        if (i >= 0) {
            removeElementAt(i);
        }
    }

    public final boolean removeAll(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        minusAssign((java.lang.Object[]) elements);
        return i != get_size();
    }

    public final boolean removeAll(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        minusAssign((kotlin.sequences.Sequence) elements);
        return i != get_size();
    }

    public final boolean removeAll(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        minusAssign((java.lang.Iterable) elements);
        return i != get_size();
    }

    public final boolean removeAll(androidx.collection.OrderedScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        minusAssign((androidx.collection.OrderedScatterSet) elements);
        return i != get_size();
    }

    public final boolean removeAll(androidx.collection.ScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        minusAssign((androidx.collection.ScatterSet) elements);
        return i != get_size();
    }

    public final boolean removeAll(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        int i = get_size();
        minusAssign((androidx.collection.ObjectList) elements);
        return i != get_size();
    }

    public final void removeIf(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.elements;
        long[] jArr = this.metadata;
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
                        int i4 = (i << 3) + i3;
                        if (predicate.invoke(objArr[i4]).booleanValue()) {
                            removeElementAt(i4);
                        }
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

    public final boolean retainAll(java.util.Collection<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!kotlin.collections.CollectionsKt.contains(elements, objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(androidx.collection.OrderedScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!elements.contains(objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean retainAll(androidx.collection.ScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = this.elements;
        int i = this._size;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!elements.contains(objArr[i5])) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this._size;
    }

    public final boolean retainAll(kotlin.jvm.functions.Function1<? super E, java.lang.Boolean> predicate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(predicate, "");
        java.lang.Object[] objArr = this.elements;
        int i = get_size();
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!predicate.invoke(objArr[i5]).booleanValue()) {
                                removeElementAt(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != get_size();
    }

    public final void removeElementAt(int index) {
        this._size--;
        long[] jArr = this.metadata;
        int i = this._capacity;
        int i2 = index >> 3;
        int i3 = (index & 7) << 3;
        long j = (jArr[i2] & (~(255 << i3))) | (254 << i3);
        jArr[i2] = j;
        jArr[(((index - 7) & i) + (i & 7)) >> 3] = j;
        this.elements[index] = null;
        long[] jArr2 = this.nodes;
        long j2 = jArr2[index];
        int i4 = (int) ((j2 >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
        int i5 = (int) (j2 & androidx.collection.SieveCacheKt.NodeLinkMask);
        if (i4 != Integer.MAX_VALUE) {
            jArr2[i4] = (jArr2[i4] & androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask) | (i5 & androidx.collection.SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i5;
        }
        if (i5 != Integer.MAX_VALUE) {
            jArr2[i5] = ((i4 & androidx.collection.SieveCacheKt.NodeLinkMask) << 31) | (androidx.collection.SieveCacheKt.NodeMetaAndNextMask & jArr2[i5]);
        } else {
            this.tail = i4;
        }
        jArr2[index] = 4611686018427387903L;
    }

    public final void clear() {
        this._size = 0;
        if (this.metadata != androidx.collection.ScatterMapKt.EmptyGroup) {
            kotlin.collections.ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, (java.lang.Object) null);
            long[] jArr = this.metadata;
            int i = this._capacity;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr[i2] = (jArr[i2] & (~j)) | j;
        }
        kotlin.collections.ArraysKt.fill(this.elements, (java.lang.Object) null, 0, this._capacity);
        kotlin.collections.ArraysKt.fill$default(this.nodes, 4611686018427387903L, 0, 0, 6, (java.lang.Object) null);
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
    }

    private final int getHighSpeedVideoFpsRangesFor(int p0) {
        int i = this._capacity;
        int i2 = p0 & i;
        int i3 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i4 = i2 >> 3;
            int i5 = (i2 & 7) << 3;
            long j = ((jArr[i4 + 1] << (64 - i5)) & ((-i5) >> 63)) | (jArr[i4] >>> i5);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i2 + (java.lang.Long.numberOfTrailingZeros(j2) >> 3)) & i;
            }
            i3 += 8;
            i2 = (i2 + i3) & i;
        }
    }

    public final int trim() {
        int i = this._capacity;
        int normalizeCapacity = androidx.collection.ScatterMapKt.normalizeCapacity(androidx.collection.ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity >= i) {
            return 0;
        }
        resizeStorage$collection(normalizeCapacity);
        return i - this._capacity;
    }

    public final void trimToSize(int maxSize) {
        long[] jArr = this.nodes;
        int i = this.head;
        while (i != Integer.MAX_VALUE && this._size > maxSize && this._size != 0) {
            int i2 = (int) (jArr[i] & androidx.collection.SieveCacheKt.NodeLinkMask);
            removeElementAt(i);
            i = i2;
        }
    }

    public final void adjustStorage$collection() {
        if (this._capacity > 8 && java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(this._size) * 32), kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl(this._capacity) * 25)) <= 0) {
            dropDeletes$collection();
        } else {
            resizeStorage$collection(androidx.collection.ScatterMapKt.nextCapacity(this._capacity));
        }
    }

    public final void dropDeletes$collection() {
        long j;
        long j2;
        int i;
        long j3;
        int i2;
        int i3;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i4 = this._capacity;
        java.lang.Object[] objArr = this.elements;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i4];
        long j4 = 9223372034707292159L;
        int i5 = 0;
        kotlin.collections.ArraysKt.fill(jArr3, 9223372034707292159L, 0, i4);
        for (int i6 = 0; i6 < ((i4 + 7) >> 3); i6++) {
            long j5 = jArr[i6] & (-9187201950435737472L);
            jArr[i6] = (-72340172838076674L) & ((~j5) + (j5 >>> 7));
        }
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(jArr);
        int i7 = lastIndex - 1;
        jArr[i7] = (jArr[i7] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i8 = 0;
        while (i8 != i4) {
            int i9 = i8 >> 3;
            int i10 = (i8 & 7) << 3;
            long j6 = (jArr[i9] >> i10) & 255;
            if (j6 != 128 && j6 == 254) {
                java.lang.Object obj = objArr[i8];
                int hashCode = (obj != null ? obj.hashCode() : i5) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i11 = (hashCode ^ (hashCode << 16)) >>> 7;
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i11);
                int i12 = i11 & i4;
                if (((highSpeedVideoFpsRangesFor - i12) & i4) / 8 == ((i8 - i12) & i4) / 8) {
                    jArr[i9] = ((~(255 << i10)) & jArr[i9]) | ((r16 & 127) << i10);
                    j3 = 9223372034707292159L;
                    if (jArr3[i8] == 9223372034707292159L) {
                        long j7 = i8;
                        jArr3[i8] = j7 | (j7 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i5];
                    i8++;
                    j4 = j3;
                } else {
                    j3 = j4;
                    int i13 = highSpeedVideoFpsRangesFor >> 3;
                    long j8 = jArr[i13];
                    int i14 = (highSpeedVideoFpsRangesFor & 7) << 3;
                    if (((j8 >> i14) & 255) == 128) {
                        int i15 = i8;
                        jArr[i13] = (j8 & (~(255 << i14))) | ((r16 & 127) << i14);
                        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (128 << i10);
                        objArr[highSpeedVideoFpsRangesFor] = objArr[i15];
                        objArr[i15] = null;
                        jArr2[highSpeedVideoFpsRangesFor] = jArr2[i15];
                        jArr2[i15] = 4611686018427387903L;
                        int i16 = (int) ((jArr3[i15] >> 32) & 4294967295L);
                        if (i16 != Integer.MAX_VALUE) {
                            jArr3[i16] = (jArr3[i16] & (-4294967296L)) | highSpeedVideoFpsRangesFor;
                            jArr3[i15] = (jArr3[i15] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i15] = highSpeedVideoFpsRangesFor | 9223372032559808512L;
                        }
                        jArr3[highSpeedVideoFpsRangesFor] = (i15 << 32) | androidx.collection.SieveCacheKt.NodeLinkMask;
                        i2 = i15;
                    } else {
                        int i17 = i8;
                        jArr[i13] = ((r16 & 127) << i14) | (j8 & (~(255 << i14)));
                        java.lang.Object obj2 = objArr[highSpeedVideoFpsRangesFor];
                        objArr[highSpeedVideoFpsRangesFor] = objArr[i17];
                        objArr[i17] = obj2;
                        long j9 = jArr2[highSpeedVideoFpsRangesFor];
                        jArr2[highSpeedVideoFpsRangesFor] = jArr2[i17];
                        jArr2[i17] = j9;
                        int i18 = (int) ((jArr3[i17] >> 32) & 4294967295L);
                        if (i18 != Integer.MAX_VALUE) {
                            long j10 = highSpeedVideoFpsRangesFor;
                            jArr3[i18] = (jArr3[i18] & (-4294967296L)) | j10;
                            jArr3[i17] = (j10 << 32) | (jArr3[i17] & 4294967295L);
                        } else {
                            long j11 = highSpeedVideoFpsRangesFor;
                            jArr3[i17] = j11 | (j11 << 32);
                            i18 = i17;
                        }
                        jArr3[highSpeedVideoFpsRangesFor] = (i18 << 32) | i17;
                        i2 = i17 - 1;
                    }
                    i3 = 0;
                    jArr[jArr.length - 1] = jArr[0];
                    i8 = i2 + 1;
                }
            } else {
                j3 = j4;
                i3 = i5;
                i8++;
            }
            i5 = i3;
            j4 = j3;
        }
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.collection.ScatterMapKt.loadedCapacity(get_capacity()) - this._size;
        long[] jArr4 = this.nodes;
        int length = jArr4.length;
        while (i5 < length) {
            long j12 = jArr4[i5];
            int i19 = (int) ((j12 >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            int i20 = (int) (j12 & androidx.collection.SieveCacheKt.NodeLinkMask);
            if (i19 == Integer.MAX_VALUE) {
                i = Integer.MAX_VALUE;
                j2 = 4294967295L;
            } else {
                j2 = 4294967295L;
                i = (int) (jArr3[i19] & 4294967295L);
            }
            jArr4[i5] = (((j12 & androidx.collection.SieveCacheKt.NodeMetaMask) | i) << 31) | (i20 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr3[i20] & j2));
            i5++;
        }
        if (this.head != Integer.MAX_VALUE) {
            j = 4294967295L;
            this.head = (int) (jArr3[this.head] & 4294967295L);
        } else {
            j = 4294967295L;
        }
        if (this.tail != Integer.MAX_VALUE) {
            this.tail = (int) (jArr3[this.tail] & j);
        }
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        java.lang.Object[] objArr;
        long[] jArr2 = this.metadata;
        java.lang.Object[] objArr2 = this.elements;
        long[] jArr3 = this.nodes;
        int i = this._capacity;
        int[] iArr = new int[i];
        getHighResolutionOutputSizeshNQ4ISI(newCapacity);
        long[] jArr4 = this.metadata;
        java.lang.Object[] objArr3 = this.elements;
        long[] jArr5 = this.nodes;
        int i2 = this._capacity;
        int i3 = 0;
        while (i3 < i) {
            if (((jArr2[i3 >> 3] >> ((i3 & 7) << 3)) & 255) < 128) {
                java.lang.Object obj = objArr2[i3];
                int hashCode = (obj != null ? obj.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
                int i4 = hashCode ^ (hashCode << 16);
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i4 >>> 7);
                long j = i4 & 127;
                int i5 = highSpeedVideoFpsRangesFor >> 3;
                int i6 = (highSpeedVideoFpsRangesFor & 7) << 3;
                jArr = jArr2;
                objArr = objArr2;
                long j2 = (jArr4[i5] & (~(255 << i6))) | (j << i6);
                jArr4[i5] = j2;
                jArr4[(((highSpeedVideoFpsRangesFor - 7) & i2) + (i2 & 7)) >> 3] = j2;
                objArr3[highSpeedVideoFpsRangesFor] = obj;
                jArr5[highSpeedVideoFpsRangesFor] = jArr3[i3];
                iArr[i3] = highSpeedVideoFpsRangesFor;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i3++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        long[] jArr6 = this.nodes;
        int length = jArr6.length;
        int i7 = 0;
        while (true) {
            int i8 = Integer.MAX_VALUE;
            if (i7 >= length) {
                break;
            }
            long j3 = jArr6[i7];
            int i9 = (int) ((j3 >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            int i10 = (int) (androidx.collection.SieveCacheKt.NodeLinkMask & j3);
            long j4 = i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[i9];
            if (i10 != Integer.MAX_VALUE) {
                i8 = iArr[i10];
            }
            jArr6[i7] = (((j3 & androidx.collection.SieveCacheKt.NodeMetaMask) | j4) << 31) | i8;
            i7++;
        }
        if (this.head != Integer.MAX_VALUE) {
            this.head = iArr[this.head];
        }
        if (this.tail != Integer.MAX_VALUE) {
            this.tail = iArr[this.tail];
        }
    }

    public final java.util.Set<E> asMutableSet() {
        return new androidx.collection.MutableOrderedSetWrapper(this);
    }

    public final void plusAssign(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        for (E e : elements) {
            plusAssign((androidx.collection.MutableOrderedScatterSet<E>) e);
        }
    }

    public final void plusAssign(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((androidx.collection.MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void plusAssign(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((androidx.collection.MutableOrderedScatterSet<E>) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(androidx.collection.OrderedScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i = elements.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            plusAssign((androidx.collection.MutableOrderedScatterSet<E>) objArr[i]);
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(androidx.collection.ScatterSet<E> elements) {
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
                        plusAssign((androidx.collection.MutableOrderedScatterSet<E>) objArr[(i << 3) + i3]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            plusAssign((androidx.collection.MutableOrderedScatterSet<E>) objArr[i2]);
        }
    }

    public final void minusAssign(E[] elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        for (E e : elements) {
            minusAssign((androidx.collection.MutableOrderedScatterSet<E>) e);
        }
    }

    public final void minusAssign(kotlin.sequences.Sequence<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((androidx.collection.MutableOrderedScatterSet<E>) it.next());
        }
    }

    public final void minusAssign(java.lang.Iterable<? extends E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.util.Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((androidx.collection.MutableOrderedScatterSet<E>) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.OrderedScatterSet<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = elements.elements;
        long[] jArr = elements.nodes;
        int i = elements.tail;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & androidx.collection.SieveCacheKt.NodeLinkMask);
            minusAssign((androidx.collection.MutableOrderedScatterSet<E>) objArr[i]);
            i = i2;
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
                        minusAssign((androidx.collection.MutableOrderedScatterSet<E>) objArr[(i << 3) + i3]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(androidx.collection.ObjectList<E> elements) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elements, "");
        java.lang.Object[] objArr = elements.content;
        int i = elements._size;
        for (int i2 = 0; i2 < i; i2++) {
            minusAssign((androidx.collection.MutableOrderedScatterSet<E>) objArr[i2]);
        }
    }

    private final int getHighResolutionOutputSizeshNQ4ISI(E p0) {
        int hashCode = (p0 != null ? p0.hashCode() : 0) * androidx.collection.ScatterMapKt.MurmurHashC1;
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this._capacity;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * androidx.collection.ScatterMapKt.BitmaskLsb);
            for (long j4 = (j3 - androidx.collection.ScatterMapKt.BitmaskLsb) & (~j3) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = ((java.lang.Long.numberOfTrailingZeros(j4) >> 3) + i5) & i4;
                if (kotlin.jvm.internal.Intrinsics.areEqual(this.elements[numberOfTrailingZeros], p0)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i2);
                if (this.getHighResolutionOutputSizeshNQ4ISI == 0 && ((this.metadata[highSpeedVideoFpsRangesFor >> 3] >> ((highSpeedVideoFpsRangesFor & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(i2);
                }
                this._size++;
                int i10 = highSpeedVideoFpsRangesFor >> 3;
                int i11 = (highSpeedVideoFpsRangesFor & 7) << 3;
                this.getHighResolutionOutputSizeshNQ4ISI -= ((this.metadata[i10] >> i11) & 255) == 128 ? 1 : 0;
                long[] jArr2 = this.metadata;
                int i12 = this._capacity;
                long j5 = ((~(255 << i11)) & jArr2[i10]) | (j2 << i11);
                jArr2[i10] = j5;
                jArr2[(((highSpeedVideoFpsRangesFor - 7) & i12) + (i12 & 7)) >> 3] = j5;
                return highSpeedVideoFpsRangesFor;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public MutableOrderedScatterSet() {
        this(0, 1, null);
    }
}
