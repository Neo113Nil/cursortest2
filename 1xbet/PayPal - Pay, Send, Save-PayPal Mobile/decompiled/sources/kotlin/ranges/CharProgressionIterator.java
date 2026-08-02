package kotlin.ranges;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e"}, d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "nextChar", "()C", com.visa.cbp.getEncExpo.warmup, "getStep", "()I", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Z", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CharProgressionIterator extends kotlin.collections.CharIterator {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;
    private final int step;

    public CharProgressionIterator(char c, char c2, int i) {
        this.step = i;
        this.getHighSpeedVideoSizes = c2;
        boolean z = i <= 0 ? kotlin.jvm.internal.Intrinsics.compare((int) c, (int) c2) >= 0 : kotlin.jvm.internal.Intrinsics.compare((int) c, (int) c2) <= 0;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = z ? c : c2;
    }

    public final int getStep() {
        return this.step;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // kotlin.collections.CharIterator
    public final char nextChar() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == this.getHighSpeedVideoSizes) {
            if (!this.Camera2StreamConfigurationMap) {
                throw new java.util.NoSuchElementException();
            }
            this.Camera2StreamConfigurationMap = false;
        } else {
            this.getHighSpeedVideoFpsRanges = this.step + i;
        }
        return (char) i;
    }
}
