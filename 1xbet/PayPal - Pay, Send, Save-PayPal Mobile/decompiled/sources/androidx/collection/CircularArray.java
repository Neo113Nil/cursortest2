package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0003¢\u0006\u0004\b\u001a\u0010\u0006J\r\u0010\u001b\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0011\u0010#\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0016R\u0016\u0010\u000e\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001dR\u0011\u0010&\u001a\u00028\u00008G¢\u0006\u0006\u001a\u0004\b%\u0010\u0016R\u0016\u0010$\u001a\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "", "minCapacity", "<init>", "(I)V", "element", "", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "()V", "getHighSpeedVideoFpsRanges", "index", "get", "(I)Ljava/lang/Object;", "", "isEmpty", "()Z", "popFirst", "()Ljava/lang/Object;", "popLast", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "removeFromEnd", "removeFromStart", io.ktor.http.ContentDisposition.Parameters.Size, "()I", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRangesFor", "[Ljava/lang/Object;", "getFirst", "first", "Camera2StreamConfigurationMap", "getLast", "last"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CircularArray<E> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;
    private E[] getHighSpeedVideoFpsRangesFor;

    public CircularArray(int i) {
        if (i <= 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i = java.lang.Integer.bitCount(i) != 1 ? java.lang.Integer.highestOneBit(i - 1) << 1 : i;
        this.getHighResolutionOutputSizeshNQ4ISI = i - 1;
        this.getHighSpeedVideoFpsRangesFor = (E[]) new java.lang.Object[i];
    }

    public /* synthetic */ CircularArray(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    private final void getHighSpeedVideoFpsRanges() {
        E[] eArr = this.getHighSpeedVideoFpsRangesFor;
        int length = eArr.length;
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new java.lang.RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new java.lang.Object[i2];
        kotlin.collections.ArraysKt.copyInto(eArr, eArr2, 0, i, length);
        kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRangesFor, eArr2, length - i, 0, this.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRangesFor = eArr2;
        this.getHighSpeedVideoFpsRanges = 0;
        this.Camera2StreamConfigurationMap = length;
        this.getHighResolutionOutputSizeshNQ4ISI = i2 - 1;
    }

    public final void addFirst(E element) {
        int i = (this.getHighSpeedVideoFpsRanges - 1) & this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = i;
        this.getHighSpeedVideoFpsRangesFor[i] = element;
        if (i == this.Camera2StreamConfigurationMap) {
            getHighSpeedVideoFpsRanges();
        }
    }

    public final void addLast(E element) {
        E[] eArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.Camera2StreamConfigurationMap;
        eArr[i] = element;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI & (i + 1);
        this.Camera2StreamConfigurationMap = i2;
        if (i2 == this.getHighSpeedVideoFpsRanges) {
            getHighSpeedVideoFpsRanges();
        }
    }

    public final E popFirst() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == this.Camera2StreamConfigurationMap) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.getHighSpeedVideoFpsRangesFor;
        E e = eArr[i];
        eArr[i] = null;
        this.getHighSpeedVideoFpsRanges = (i + 1) & this.getHighResolutionOutputSizeshNQ4ISI;
        return e;
    }

    public final E popLast() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        if (i == i2) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i3 = this.getHighResolutionOutputSizeshNQ4ISI & (i2 - 1);
        E[] eArr = this.getHighSpeedVideoFpsRangesFor;
        E e = eArr[i3];
        eArr[i3] = null;
        this.Camera2StreamConfigurationMap = i3;
        return e;
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final void removeFromStart(int count) {
        if (count > 0) {
            if (count > size()) {
                androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
                throw new java.lang.ArrayIndexOutOfBoundsException();
            }
            int length = this.getHighSpeedVideoFpsRangesFor.length;
            int i = this.getHighSpeedVideoFpsRanges;
            if (count < length - i) {
                length = i + count;
            }
            while (i < length) {
                this.getHighSpeedVideoFpsRangesFor[i] = null;
                i++;
            }
            int i2 = this.getHighSpeedVideoFpsRanges;
            int i3 = length - i2;
            int i4 = count - i3;
            this.getHighSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI & (i2 + i3);
            if (i4 > 0) {
                for (int i5 = 0; i5 < i4; i5++) {
                    this.getHighSpeedVideoFpsRangesFor[i5] = null;
                }
                this.getHighSpeedVideoFpsRanges = i4;
            }
        }
    }

    public final void removeFromEnd(int count) {
        if (count > 0) {
            if (count > size()) {
                androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
                throw new java.lang.ArrayIndexOutOfBoundsException();
            }
            int i = this.Camera2StreamConfigurationMap;
            int i2 = count < i ? i - count : 0;
            for (int i3 = i2; i3 < i; i3++) {
                this.getHighSpeedVideoFpsRangesFor[i3] = null;
            }
            int i4 = this.Camera2StreamConfigurationMap;
            int i5 = i4 - i2;
            int i6 = count - i5;
            this.Camera2StreamConfigurationMap = i4 - i5;
            if (i6 > 0) {
                int length = this.getHighSpeedVideoFpsRangesFor.length;
                this.Camera2StreamConfigurationMap = length;
                int i7 = length - i6;
                for (int i8 = i7; i8 < length; i8++) {
                    this.getHighSpeedVideoFpsRangesFor[i8] = null;
                }
                this.Camera2StreamConfigurationMap = i7;
            }
        }
    }

    public final E getFirst() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == this.Camera2StreamConfigurationMap) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        E e = this.getHighSpeedVideoFpsRangesFor[i];
        kotlin.jvm.internal.Intrinsics.checkNotNull(e);
        return e;
    }

    public final E getLast() {
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.Camera2StreamConfigurationMap;
        if (i == i2) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        E e = this.getHighSpeedVideoFpsRangesFor[(i2 - 1) & this.getHighResolutionOutputSizeshNQ4ISI];
        kotlin.jvm.internal.Intrinsics.checkNotNull(e);
        return e;
    }

    public final E get(int index) {
        if (index < 0 || index >= size()) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        E e = this.getHighSpeedVideoFpsRangesFor[this.getHighResolutionOutputSizeshNQ4ISI & (this.getHighSpeedVideoFpsRanges + index)];
        kotlin.jvm.internal.Intrinsics.checkNotNull(e);
        return e;
    }

    public final int size() {
        return (this.Camera2StreamConfigurationMap - this.getHighSpeedVideoFpsRanges) & this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isEmpty() {
        return this.getHighSpeedVideoFpsRanges == this.Camera2StreamConfigurationMap;
    }

    public CircularArray() {
        this(0, 1, null);
    }
}
