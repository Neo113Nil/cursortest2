package kotlin.text;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00120\u0010\f\u001a,\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R>\u0010\u0018\u001a,\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n0\b¢\u0006\u0002\b\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "", "p0", "", "p1", "p2", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "p3", "<init>", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "", "iterator", "()Ljava/util/Iterator;", "getHighSpeedVideoSizes", "Ljava/lang/CharSequence;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function2;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final class DelimitedRangesSequence implements kotlin.sequences.Sequence<kotlin.ranges.IntRange> {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.jvm.functions.Function2<java.lang.CharSequence, java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.CharSequence Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(java.lang.CharSequence charSequence, int i, int i2, kotlin.jvm.functions.Function2<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.Camera2StreamConfigurationMap = charSequence;
        this.getHighSpeedVideoFpsRangesFor = 0;
        this.getHighResolutionOutputSizeshNQ4ISI = i2;
        this.getHighSpeedVideoFpsRanges = function2;
    }

    @Override // kotlin.sequences.Sequence
    public final java.util.Iterator<kotlin.ranges.IntRange> iterator() {
        return new kotlin.text.DelimitedRangesSequence$iterator$1(this);
    }
}
