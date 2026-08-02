package kotlin.collections;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\n\u0010\fJ\u0018\u0010\r\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8\u0017@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/getHighResolutionOutputSizeshNQ4ISI;", "", "", "p0", "", "p1", "<init>", "([Ljava/lang/Object;I)V", "(I)V", "get", "(I)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "", "getHighSpeedVideoSizes", "[Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getSize", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RingBuffer<T> extends kotlin.collections.AbstractList<T> implements java.util.RandomAccess {
    int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.Object[] Camera2StreamConfigurationMap;

    public RingBuffer(java.lang.Object[] objArr, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(objArr, "");
        this.Camera2StreamConfigurationMap = objArr;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("ring buffer filled size should not be negative but it is ".concat(java.lang.String.valueOf(i)).toString());
        }
        if (i > objArr.length) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ring buffer filled size: ");
            sb.append(i);
            sb.append(" cannot be larger than the buffer size: ");
            sb.append(objArr.length);
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        this.getHighSpeedVideoSizes = objArr.length;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public RingBuffer(int i) {
        this(new java.lang.Object[i], 0);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize, reason: from getter */
    public final int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final T get(int p0) {
        kotlin.collections.AbstractList.INSTANCE.checkElementIndex$kotlin_stdlib(p0, size());
        return (T) this.Camera2StreamConfigurationMap[(this.getHighSpeedVideoFpsRanges + p0) % this.getHighSpeedVideoSizes];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final java.util.Iterator<T> iterator() {
        return new kotlin.collections.AbstractIterator<T>(this) { // from class: kotlin.collections.RingBuffer$iterator$1

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private int getHighSpeedVideoSizes;

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private int Camera2StreamConfigurationMap;
            final /* synthetic */ kotlin.collections.RingBuffer<T> getHighSpeedVideoSizes;

            {
                int i;
                this.getHighSpeedVideoSizes = this;
                this.getHighSpeedVideoSizes = this.size();
                i = this.getHighSpeedVideoFpsRanges;
                this.Camera2StreamConfigurationMap = i;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.collections.AbstractIterator
            protected final void computeNext() {
                java.lang.Object[] objArr;
                int i;
                if (this.getHighSpeedVideoSizes != 0) {
                    objArr = this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap;
                    setNext(objArr[this.Camera2StreamConfigurationMap]);
                    kotlin.collections.RingBuffer<T> ringBuffer = this.getHighSpeedVideoSizes;
                    int i2 = this.Camera2StreamConfigurationMap;
                    i = ringBuffer.getHighSpeedVideoSizes;
                    this.Camera2StreamConfigurationMap = (i2 + 1) % i;
                    this.getHighSpeedVideoSizes--;
                    return;
                }
                done();
            }
        };
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        int length = p0.length;
        java.lang.Object[] objArr = p0;
        if (length < size()) {
            java.lang.Object[] objArr2 = (T[]) java.util.Arrays.copyOf(p0, size());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(objArr2, "");
            objArr = objArr2;
        }
        int size = size();
        int i = 0;
        int i2 = 0;
        for (int i3 = this.getHighSpeedVideoFpsRanges; i2 < size && i3 < this.getHighSpeedVideoSizes; i3++) {
            objArr[i2] = this.Camera2StreamConfigurationMap[i3];
            i2++;
        }
        while (i2 < size) {
            objArr[i2] = this.Camera2StreamConfigurationMap[i];
            i2++;
            i++;
        }
        return (T[]) kotlin.collections.CollectionsKt.terminateCollectionToArray(size, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[size()]);
    }

    public final void getHighSpeedVideoSizes(int p0) {
        if (p0 < 0) {
            throw new java.lang.IllegalArgumentException("n shouldn't be negative but it is ".concat(java.lang.String.valueOf(p0)).toString());
        }
        if (p0 > size()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("n shouldn't be greater than the buffer size: n = ");
            sb.append(p0);
            sb.append(", size = ");
            sb.append(size());
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (p0 > 0) {
            int i = this.getHighSpeedVideoFpsRanges;
            int i2 = this.getHighSpeedVideoSizes;
            int i3 = (i + p0) % i2;
            if (i > i3) {
                kotlin.collections.ArraysKt.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null, i, i2);
                kotlin.collections.ArraysKt.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null, 0, i3);
            } else {
                kotlin.collections.ArraysKt.fill(this.Camera2StreamConfigurationMap, (java.lang.Object) null, i, i3);
            }
            this.getHighSpeedVideoFpsRanges = i3;
            this.getHighResolutionOutputSizeshNQ4ISI = size() - p0;
        }
    }
}
