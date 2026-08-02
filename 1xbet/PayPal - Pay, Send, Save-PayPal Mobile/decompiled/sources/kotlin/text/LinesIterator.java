package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\n\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e"}, d2 = {"Lkotlin/text/LinesIterator;", "", "", "", "p0", "<init>", "(Ljava/lang/CharSequence;)V", "", "hasNext", "()Z", "getHighSpeedVideoSizes", "Ljava/lang/CharSequence;", "getHighSpeedVideoFpsRangesFor", "", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class LinesIterator implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMappedMarker {
    private static final kotlin.text.LinesIterator.State State = new kotlin.text.LinesIterator.State(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private int Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/text/LinesIterator$State;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class State {
        private State() {
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LinesIterator(java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        this.getHighSpeedVideoFpsRangesFor = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.getHighSpeedVideoSizes;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.Camera2StreamConfigurationMap < 0) {
            this.getHighSpeedVideoSizes = 2;
            return false;
        }
        int length = this.getHighSpeedVideoFpsRangesFor.length();
        int length2 = this.getHighSpeedVideoFpsRangesFor.length();
        for (int i4 = this.getHighResolutionOutputSizeshNQ4ISI; i4 < length2; i4++) {
            char charAt = this.getHighSpeedVideoFpsRangesFor.charAt(i4);
            if (charAt == '\n' || charAt == '\r') {
                i = (charAt == '\r' && (i2 = i4 + 1) < this.getHighSpeedVideoFpsRangesFor.length() && this.getHighSpeedVideoFpsRangesFor.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.getHighSpeedVideoSizes = 1;
                this.Camera2StreamConfigurationMap = i;
                this.getHighSpeedVideoFpsRanges = length;
                return true;
            }
        }
        i = -1;
        this.getHighSpeedVideoSizes = 1;
        this.Camera2StreamConfigurationMap = i;
        this.getHighSpeedVideoFpsRanges = length;
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ java.lang.String next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        this.getHighSpeedVideoSizes = 0;
        int i = this.getHighSpeedVideoFpsRanges;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap + i;
        return this.getHighSpeedVideoFpsRangesFor.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
