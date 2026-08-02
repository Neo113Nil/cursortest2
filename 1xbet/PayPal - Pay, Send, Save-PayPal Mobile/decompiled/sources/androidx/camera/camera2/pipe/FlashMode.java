package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/FlashMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class FlashMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.FlashMode.Companion INSTANCE = new androidx.camera.camera2.pipe.FlashMode.Companion(null);
    private static final int OFF;
    private static final int SINGLE;
    private static final int TORCH;
    private static final java.util.List<androidx.camera.camera2.pipe.FlashMode> getHighResolutionOutputSizeshNQ4ISI;
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m446constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m448equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/camera/camera2/pipe/FlashMode$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/camera/camera2/pipe/FlashMode;", "fromIntOrNull-2-3f5tw", "(I)Landroidx/camera/camera2/pipe/FlashMode;", "fromIntOrNull", "OFF", com.visa.cbp.getEncExpo.warmup, "getOFF-Le5xUZU", "()I", "SINGLE", "getSINGLE-Le5xUZU", "TORCH", "getTORCH-Le5xUZU", "", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getOFF-Le5xUZU, reason: not valid java name */
        public final int m454getOFFLe5xUZU() {
            return androidx.camera.camera2.pipe.FlashMode.OFF;
        }

        /* renamed from: getSINGLE-Le5xUZU, reason: not valid java name */
        public final int m455getSINGLELe5xUZU() {
            return androidx.camera.camera2.pipe.FlashMode.SINGLE;
        }

        /* renamed from: getTORCH-Le5xUZU, reason: not valid java name */
        public final int m456getTORCHLe5xUZU() {
            return androidx.camera.camera2.pipe.FlashMode.TORCH;
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: fromIntOrNull-2-3f5tw, reason: not valid java name */
        public final androidx.camera.camera2.pipe.FlashMode m453fromIntOrNull23f5tw(int value) {
            java.lang.Object obj;
            java.util.Iterator it = androidx.camera.camera2.pipe.FlashMode.getHighResolutionOutputSizeshNQ4ISI.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((androidx.camera.camera2.pipe.FlashMode) obj).m452unboximpl() == value) {
                    break;
                }
            }
            return (androidx.camera.camera2.pipe.FlashMode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ FlashMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        int m446constructorimpl = m446constructorimpl(0);
        OFF = m446constructorimpl;
        int m446constructorimpl2 = m446constructorimpl(1);
        SINGLE = m446constructorimpl2;
        int m446constructorimpl3 = m446constructorimpl(2);
        TORCH = m446constructorimpl3;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.FlashMode[]{m445boximpl(m446constructorimpl), m445boximpl(m446constructorimpl2), m445boximpl(m446constructorimpl3)});
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m452unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m451toStringimpl(this.value);
    }

    public final int hashCode() {
        return m450hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m447equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m451toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlashMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m450hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: fromIntOrNull-2-3f5tw, reason: not valid java name */
    public static final androidx.camera.camera2.pipe.FlashMode m449fromIntOrNull23f5tw(int i) {
        return INSTANCE.m453fromIntOrNull23f5tw(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m447equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.FlashMode) && i == ((androidx.camera.camera2.pipe.FlashMode) obj).m452unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.FlashMode m445boximpl(int i) {
        return new androidx.camera.camera2.pipe.FlashMode(i);
    }
}
