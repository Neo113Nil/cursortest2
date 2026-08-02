package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000e\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/layout/LazyImpl;", "Lkotlin/Lazy;", "", "Lkotlin/Function0;", "p0", "", "p1", "<init>", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "", "isInitialized", "()Z", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "()Ljava/lang/Integer;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LazyImpl implements kotlin.Lazy<java.lang.Integer> {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Integer> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private int getHighSpeedVideoFpsRangesFor = -1;

    public LazyImpl(kotlin.jvm.functions.Function0<java.lang.Integer> function0, java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = function0;
        this.Camera2StreamConfigurationMap = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.Lazy
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer getValue() {
        if (this.getHighSpeedVideoFpsRangesFor == -1) {
            this.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRanges.invoke().intValue();
        }
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == -1) {
            throw new java.lang.IllegalStateException(this.Camera2StreamConfigurationMap);
        }
        return java.lang.Integer.valueOf(i);
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return this.getHighSpeedVideoFpsRangesFor != -1;
    }

    public final java.lang.String toString() {
        return isInitialized() ? java.lang.String.valueOf(getValue().intValue()) : this.Camera2StreamConfigurationMap;
    }
}
