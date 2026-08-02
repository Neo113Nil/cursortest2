package kotlin.text;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/text/SystemProperties;", "", "<init>", "()V", "", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SystemProperties {
    public static final kotlin.text.SystemProperties INSTANCE = new kotlin.text.SystemProperties();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    public static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    private SystemProperties() {
    }

    static {
        java.lang.String property = java.lang.System.getProperty("line.separator");
        kotlin.jvm.internal.Intrinsics.checkNotNull(property);
        getHighResolutionOutputSizeshNQ4ISI = property;
    }
}
