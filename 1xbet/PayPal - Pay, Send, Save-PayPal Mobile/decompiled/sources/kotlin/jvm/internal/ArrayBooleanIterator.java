package kotlin.jvm.internal;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lkotlin/jvm/internal/ArrayBooleanIterator;", "Lkotlin/collections/BooleanIterator;", "", "p0", "<init>", "([Z)V", "", "hasNext", "()Z", "nextBoolean", "getHighResolutionOutputSizeshNQ4ISI", "[Z", "getHighSpeedVideoSizes", "", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class ArrayBooleanIterator extends kotlin.collections.BooleanIterator {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean[] getHighSpeedVideoSizes;

    public ArrayBooleanIterator(boolean[] zArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zArr, "");
        this.getHighSpeedVideoSizes = zArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.getHighResolutionOutputSizeshNQ4ISI < this.getHighSpeedVideoSizes.length;
    }

    @Override // kotlin.collections.BooleanIterator
    public final boolean nextBoolean() {
        try {
            boolean[] zArr = this.getHighSpeedVideoSizes;
            int i = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = i + 1;
            return zArr[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.getHighResolutionOutputSizeshNQ4ISI--;
            throw new java.util.NoSuchElementException(e.getMessage());
        }
    }
}
