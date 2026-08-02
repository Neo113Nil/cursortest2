package kotlin.io;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lkotlin/io/LinesSequence;", "Lkotlin/sequences/Sequence;", "", "Ljava/io/BufferedReader;", "p0", "<init>", "(Ljava/io/BufferedReader;)V", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoFpsRanges", "Ljava/io/BufferedReader;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class LinesSequence implements kotlin.sequences.Sequence<java.lang.String> {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.io.BufferedReader Camera2StreamConfigurationMap;

    public LinesSequence(java.io.BufferedReader bufferedReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedReader, "");
        this.Camera2StreamConfigurationMap = bufferedReader;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<java.lang.String> iterator() {
        return new kotlin.io.LinesSequence$iterator$1(this);
    }
}
