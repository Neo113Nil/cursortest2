package kotlin.time;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "p0", "Lkotlin/time/Duration;", "p1", "<init>", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "elapsedNow-UwyO8pc", "()J", "elapsedNow", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "getHighSpeedVideoFpsRangesFor", "Lkotlin/time/TimeMark;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class AdjustedTimeMark implements kotlin.time.TimeMark {
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.time.TimeMark getHighSpeedVideoSizes;

    private AdjustedTimeMark(kotlin.time.TimeMark timeMark, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeMark, "");
        this.getHighSpeedVideoSizes = timeMark;
        this.Camera2StreamConfigurationMap = j;
    }

    @Override // kotlin.time.TimeMark
    public final /* bridge */ boolean hasNotPassedNow() {
        return kotlin.time.TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    public final /* bridge */ boolean hasPassedNow() {
        return kotlin.time.TimeMark.DefaultImpls.hasPassedNow(this);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: minus-LRDsOJo */
    public final /* bridge */ kotlin.time.TimeMark mo23934minusLRDsOJo(long j) {
        return kotlin.time.TimeMark.DefaultImpls.m24026minusLRDsOJo(this, j);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: elapsedNow-UwyO8pc */
    public final long mo23933elapsedNowUwyO8pc() {
        return kotlin.time.Duration.m23965minusLRDsOJo(this.getHighSpeedVideoSizes.mo23933elapsedNowUwyO8pc(), this.Camera2StreamConfigurationMap);
    }

    @Override // kotlin.time.TimeMark
    /* renamed from: plus-LRDsOJo */
    public final kotlin.time.TimeMark mo23936plusLRDsOJo(long p0) {
        return new kotlin.time.AdjustedTimeMark(this.getHighSpeedVideoSizes, kotlin.time.Duration.m23966plusLRDsOJo(this.Camera2StreamConfigurationMap, p0), null);
    }

    public /* synthetic */ AdjustedTimeMark(kotlin.time.TimeMark timeMark, long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(timeMark, j);
    }
}
