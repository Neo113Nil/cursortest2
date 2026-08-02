package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\n\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lkotlin/io/LinesSequence$iterator$1;", "", "", "", "hasNext", "()Z", io.ktor.http.LinkHeader.Rel.Next, "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class LinesSequence$iterator$1 implements java.util.Iterator<java.lang.String>, kotlin.jvm.internal.markers.KMappedMarker {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;
    final /* synthetic */ kotlin.io.LinesSequence getHighSpeedVideoFpsRanges;

    LinesSequence$iterator$1(kotlin.io.LinesSequence linesSequence) {
        this.getHighSpeedVideoFpsRanges = linesSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        java.io.BufferedReader bufferedReader;
        if (this.getHighSpeedVideoFpsRanges == null && !this.getHighSpeedVideoSizes) {
            bufferedReader = this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap;
            java.lang.String readLine = bufferedReader.readLine();
            this.getHighSpeedVideoFpsRanges = readLine;
            if (readLine == null) {
                this.getHighSpeedVideoSizes = true;
            }
        }
        return this.getHighSpeedVideoFpsRanges != null;
    }

    @Override // java.util.Iterator
    public final java.lang.String next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.String str = this.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRanges = null;
        kotlin.jvm.internal.Intrinsics.checkNotNull(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
