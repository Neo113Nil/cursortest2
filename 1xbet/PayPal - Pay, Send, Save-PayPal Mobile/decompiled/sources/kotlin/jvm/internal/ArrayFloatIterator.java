package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/jvm/internal/ArrayFloatIterator;", "Lkotlin/collections/FloatIterator;", "", "p0", "<init>", "([F)V", "", "hasNext", "()Z", "", "nextFloat", "()F", "getHighSpeedVideoFpsRangesFor", "[F", "getHighResolutionOutputSizeshNQ4ISI", "", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ArrayFloatIterator extends kotlin.collections.FloatIterator {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float[] getHighResolutionOutputSizeshNQ4ISI;

    public ArrayFloatIterator(float[] fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "");
        this.getHighResolutionOutputSizeshNQ4ISI = fArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighSpeedVideoSizes < this.getHighResolutionOutputSizeshNQ4ISI.length;
    }

    @Override // kotlin.collections.FloatIterator
    public final float nextFloat() {
        try {
            float[] fArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i = this.getHighSpeedVideoSizes;
            this.getHighSpeedVideoSizes = i + 1;
            return fArr[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.getHighSpeedVideoSizes--;
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }
}
