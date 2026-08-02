package androidx.work.impl.constraints.trackers;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\"\u0019\u0010\u0004\u001a\u00070\u0000¢\u0006\u0002\b\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "", "BATTERY_LOW_THRESHOLD", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatteryNotLowTrackerKt {
    public static final float BATTERY_LOW_THRESHOLD = 0.15f;
    private static final java.lang.String getHighSpeedVideoSizes;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("BatteryNotLowTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoSizes = tagWithPrefix;
    }
}
