package androidx.compose.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0012\u0092\u0001\u00020\r"}, d2 = {"Landroidx/compose/ui/FrameRateCategory;", "", "", "toString-impl", "(F)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class FrameRateCategory {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.FrameRateCategory.Companion INSTANCE = new androidx.compose.ui.FrameRateCategory.Companion(null);
    private static final float Default = Float.NaN;
    private static final float Normal = -3.0f;
    private static final float High = -4.0f;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/FrameRateCategory$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/FrameRateCategory;", "Default", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getDefault-NSsRyOo", "()F", "Normal", "getNormal-NSsRyOo", "High", "getHigh-NSsRyOo"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getDefault-NSsRyOo, reason: not valid java name */
        public final float m5511getDefaultNSsRyOo() {
            return androidx.compose.ui.FrameRateCategory.Default;
        }

        /* renamed from: getNormal-NSsRyOo, reason: not valid java name */
        public final float m5513getNormalNSsRyOo() {
            return androidx.compose.ui.FrameRateCategory.Normal;
        }

        /* renamed from: getHigh-NSsRyOo, reason: not valid java name */
        public final float m5512getHighNSsRyOo() {
            return androidx.compose.ui.FrameRateCategory.High;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ FrameRateCategory(float f) {
        this.getHighSpeedVideoFpsRangesFor = f;
    }

    public final java.lang.String toString() {
        return m5509toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5509toStringimpl(float f) {
        if (f == -3.0f) {
            return "Normal";
        }
        if (f == -4.0f) {
            return "High";
        }
        return "Default";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ float getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m5508hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m5506equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5508hashCodeimpl(float f) {
        return java.lang.Float.hashCode(f);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5507equalsimpl0(float f, float f2) {
        return java.lang.Float.compare(f, f2) == 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5506equalsimpl(float f, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.FrameRateCategory) && java.lang.Float.compare(f, ((androidx.compose.ui.FrameRateCategory) obj).getGetHighSpeedVideoFpsRangesFor()) == 0;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.FrameRateCategory m5505boximpl(float f) {
        return new androidx.compose.ui.FrameRateCategory(f);
    }
}
