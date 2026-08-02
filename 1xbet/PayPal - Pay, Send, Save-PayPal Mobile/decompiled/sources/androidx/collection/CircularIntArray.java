package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0005J\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0005J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001eR\u0011\u0010 \u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0011\u0010#\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010\u001b"}, d2 = {"Landroidx/collection/CircularIntArray;", "", "", "minCapacity", "<init>", "(I)V", "element", "", "addFirst", "addLast", "clear", "()V", "getHighSpeedVideoFpsRangesFor", "index", "get", "(I)I", "", "isEmpty", "()Z", "popFirst", "()I", "popLast", com.datadog.android.rum.internal.metric.slowframes.DefaultUISlownessMetricDispatcher.KEY_COUNT, "removeFromEnd", "removeFromStart", io.ktor.http.ContentDisposition.Parameters.Size, "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "", "[I", "getFirst", "first", "getHighResolutionOutputSizeshNQ4ISI", "getLast", "last", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CircularIntArray {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;
    private int getHighResolutionOutputSizeshNQ4ISI;
    private int[] getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    public CircularIntArray(int i) {
        if (i <= 0) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("capacity must be >= 1");
        }
        if (i > 1073741824) {
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalArgumentException("capacity must be <= 2^30");
        }
        i = java.lang.Integer.bitCount(i) != 1 ? java.lang.Integer.highestOneBit(i - 1) << 1 : i;
        this.getHighSpeedVideoFpsRanges = i - 1;
        this.getHighSpeedVideoFpsRangesFor = new int[i];
    }

    public /* synthetic */ CircularIntArray(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int length = iArr.length;
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = length << 1;
        if (i2 < 0) {
            throw new java.lang.RuntimeException("Max array capacity exceeded");
        }
        int[] iArr2 = new int[i2];
        kotlin.collections.ArraysKt.copyInto(iArr, iArr2, 0, i, length);
        kotlin.collections.ArraysKt.copyInto(this.getHighSpeedVideoFpsRangesFor, iArr2, length - i, 0, this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighSpeedVideoFpsRangesFor = iArr2;
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getHighSpeedVideoSizes = length;
        this.getHighSpeedVideoFpsRanges = i2 - 1;
    }

    public final void addFirst(int element) {
        int i = (this.getHighResolutionOutputSizeshNQ4ISI - 1) & this.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRangesFor[i] = element;
        if (i == this.getHighSpeedVideoSizes) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    public final void addLast(int element) {
        int[] iArr = this.getHighSpeedVideoFpsRangesFor;
        int i = this.getHighSpeedVideoSizes;
        iArr[i] = element;
        int i2 = this.getHighSpeedVideoFpsRanges & (i + 1);
        this.getHighSpeedVideoSizes = i2;
        if (i2 == this.getHighResolutionOutputSizeshNQ4ISI) {
            getHighSpeedVideoFpsRangesFor();
        }
    }

    public final int popFirst() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == this.getHighSpeedVideoSizes) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor[i];
        this.getHighResolutionOutputSizeshNQ4ISI = (i + 1) & this.getHighSpeedVideoFpsRanges;
        return i2;
    }

    public final int popLast() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoSizes;
        if (i == i2) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        int i3 = this.getHighSpeedVideoFpsRanges & (i2 - 1);
        int i4 = this.getHighSpeedVideoFpsRangesFor[i3];
        this.getHighSpeedVideoSizes = i3;
        return i4;
    }

    public final void clear() {
        this.getHighSpeedVideoSizes = this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final void removeFromStart(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges & (this.getHighResolutionOutputSizeshNQ4ISI + count);
    }

    public final void removeFromEnd(int count) {
        if (count <= 0) {
            return;
        }
        if (count > size()) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        this.getHighSpeedVideoSizes = this.getHighSpeedVideoFpsRanges & (this.getHighSpeedVideoSizes - count);
    }

    public final int getFirst() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == this.getHighSpeedVideoSizes) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return this.getHighSpeedVideoFpsRangesFor[i];
    }

    public final int getLast() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = this.getHighSpeedVideoSizes;
        if (i == i2) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return this.getHighSpeedVideoFpsRangesFor[(i2 - 1) & this.getHighSpeedVideoFpsRanges];
    }

    public final int get(int index) {
        if (index < 0 || index >= size()) {
            androidx.collection.CollectionPlatformUtils collectionPlatformUtils = androidx.collection.CollectionPlatformUtils.INSTANCE;
            throw new java.lang.ArrayIndexOutOfBoundsException();
        }
        return this.getHighSpeedVideoFpsRangesFor[this.getHighSpeedVideoFpsRanges & (this.getHighResolutionOutputSizeshNQ4ISI + index)];
    }

    public final int size() {
        return (this.getHighSpeedVideoSizes - this.getHighResolutionOutputSizeshNQ4ISI) & this.getHighSpeedVideoFpsRanges;
    }

    public final boolean isEmpty() {
        return this.getHighResolutionOutputSizeshNQ4ISI == this.getHighSpeedVideoSizes;
    }

    public CircularIntArray() {
        this(0, 1, null);
    }
}
