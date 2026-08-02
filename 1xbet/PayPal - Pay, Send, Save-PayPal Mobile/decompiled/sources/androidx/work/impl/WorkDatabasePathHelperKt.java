package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\"\u0019\u0010\u0004\u001a\u00070\u0000¢\u0006\u0002\b\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0003\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoSizes", "WORK_DATABASE_NAME", "", "getHighSpeedVideoFpsRangesFor", "[Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkDatabasePathHelperKt {
    public static final java.lang.String WORK_DATABASE_NAME = "androidx.work.workdb";
    private static final java.lang.String getHighSpeedVideoFpsRanges;
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor;

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WrkDbPathHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoFpsRanges = tagWithPrefix;
        getHighSpeedVideoFpsRangesFor = new java.lang.String[]{"-journal", "-shm", "-wal"};
    }
}
