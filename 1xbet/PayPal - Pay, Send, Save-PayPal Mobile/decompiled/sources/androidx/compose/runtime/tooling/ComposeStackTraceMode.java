package androidx.compose.runtime.tooling;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceMode;", "", "", "p0", "Camera2StreamConfigurationMap", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class ComposeStackTraceMode {
    private static boolean Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.runtime.tooling.ComposeStackTraceMode.Companion INSTANCE = new androidx.compose.runtime.tooling.ComposeStackTraceMode.Companion(null);
    private static final int None = Camera2StreamConfigurationMap(0);
    private static final int GroupKeys = Camera2StreamConfigurationMap(1);
    private static final int SourceInformation = Camera2StreamConfigurationMap(2);

    private static int Camera2StreamConfigurationMap(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5496equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/compose/runtime/tooling/ComposeStackTraceMode$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/tooling/ComposeStackTraceMode;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, com.visa.cbp.getEncExpo.warmup, "getNone-MD5MrJc", "()I", "GroupKeys", "getGroupKeys-MD5MrJc", "SourceInformation", "getSourceInformation-MD5MrJc", "getAuto-MD5MrJc", "Auto", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-MD5MrJc, reason: not valid java name */
        public final int m5502getNoneMD5MrJc() {
            return androidx.compose.runtime.tooling.ComposeStackTraceMode.None;
        }

        /* renamed from: getGroupKeys-MD5MrJc, reason: not valid java name */
        public final int m5501getGroupKeysMD5MrJc() {
            return androidx.compose.runtime.tooling.ComposeStackTraceMode.GroupKeys;
        }

        /* renamed from: getSourceInformation-MD5MrJc, reason: not valid java name */
        public final int m5503getSourceInformationMD5MrJc() {
            return androidx.compose.runtime.tooling.ComposeStackTraceMode.SourceInformation;
        }

        /* renamed from: getAuto-MD5MrJc, reason: not valid java name */
        public final int m5500getAutoMD5MrJc() {
            return androidx.compose.runtime.tooling.ComposeStackTraceMode.Camera2StreamConfigurationMap ? m5501getGroupKeysMD5MrJc() : m5502getNoneMD5MrJc();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ ComposeStackTraceMode(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m5498toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return m5497hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m5495equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5498toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ComposeStackTraceMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5497hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5495equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.tooling.ComposeStackTraceMode) && i == ((androidx.compose.runtime.tooling.ComposeStackTraceMode) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.tooling.ComposeStackTraceMode m5494boximpl(int i) {
        return new androidx.compose.runtime.tooling.ComposeStackTraceMode(i);
    }
}
