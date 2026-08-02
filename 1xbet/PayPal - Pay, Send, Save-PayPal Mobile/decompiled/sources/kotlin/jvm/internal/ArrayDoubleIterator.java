package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lkotlin/jvm/internal/ArrayDoubleIterator;", "Lkotlin/collections/DoubleIterator;", "", "p0", "<init>", "([D)V", "", "hasNext", "()Z", "", "nextDouble", "()D", "Camera2StreamConfigurationMap", "[D", "", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ArrayDoubleIterator extends kotlin.collections.DoubleIterator {
    private final double[] Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    public ArrayDoubleIterator(double[] dArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dArr, "");
        this.Camera2StreamConfigurationMap = dArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoFpsRanges < this.Camera2StreamConfigurationMap.length;
    }

    @Override // kotlin.collections.DoubleIterator
    public final double nextDouble() {
        try {
            double[] dArr = this.Camera2StreamConfigurationMap;
            int i = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoFpsRanges = i + 1;
            return dArr[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.getHighSpeedVideoFpsRanges--;
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }
}
