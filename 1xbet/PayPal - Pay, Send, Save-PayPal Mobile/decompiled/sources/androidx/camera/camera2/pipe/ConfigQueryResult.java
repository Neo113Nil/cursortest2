package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u0014\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/ConfigQueryResult;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class ConfigQueryResult {
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.ConfigQueryResult.Companion INSTANCE = new androidx.camera.camera2.pipe.ConfigQueryResult.Companion(null);
    private static final int UNKNOWN = m436constructorimpl(0);
    private static final int SUPPORTED = m436constructorimpl(1);
    private static final int UNSUPPORTED = m436constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m436constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m438equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ ConfigQueryResult(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final java.lang.String toString() {
        return m440toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m440toStringimpl(int i) {
        return m438equalsimpl0(i, SUPPORTED) ? "SUPPORTED" : m438equalsimpl0(i, UNSUPPORTED) ? "UNSUPPORTED" : "UNKNOWN";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/ConfigQueryResult$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/ConfigQueryResult;", "UNKNOWN", com.visa.cbp.getEncExpo.warmup, "getUNKNOWN-Xp6DSB4", "()I", "SUPPORTED", "getSUPPORTED-Xp6DSB4", "UNSUPPORTED", "getUNSUPPORTED-Xp6DSB4"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUNKNOWN-Xp6DSB4, reason: not valid java name */
        public final int m443getUNKNOWNXp6DSB4() {
            return androidx.camera.camera2.pipe.ConfigQueryResult.UNKNOWN;
        }

        /* renamed from: getSUPPORTED-Xp6DSB4, reason: not valid java name */
        public final int m442getSUPPORTEDXp6DSB4() {
            return androidx.camera.camera2.pipe.ConfigQueryResult.SUPPORTED;
        }

        /* renamed from: getUNSUPPORTED-Xp6DSB4, reason: not valid java name */
        public final int m444getUNSUPPORTEDXp6DSB4() {
            return androidx.camera.camera2.pipe.ConfigQueryResult.UNSUPPORTED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return m439hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object obj) {
        return m437equalsimpl(this.getHighSpeedVideoFpsRanges, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m439hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m437equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.ConfigQueryResult) && i == ((androidx.camera.camera2.pipe.ConfigQueryResult) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.ConfigQueryResult m435boximpl(int i) {
        return new androidx.camera.camera2.pipe.ConfigQueryResult(i);
    }
}
