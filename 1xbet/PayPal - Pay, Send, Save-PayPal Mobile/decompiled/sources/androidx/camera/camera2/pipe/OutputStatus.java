package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStatus;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class OutputStatus {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.OutputStatus.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStatus.Companion(null);
    private static final int PENDING = m544constructorimpl(0);
    private static final int AVAILABLE = m544constructorimpl(1);
    private static final int UNAVAILABLE = m544constructorimpl(2);
    private static final int ERROR_OUTPUT_FAILED = m544constructorimpl(10);
    private static final int ERROR_OUTPUT_ABORTED = m544constructorimpl(11);
    private static final int ERROR_OUTPUT_MISSING = m544constructorimpl(12);
    private static final int ERROR_OUTPUT_DROPPED = m544constructorimpl(13);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m544constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m546equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStatus$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStatus;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS, com.visa.cbp.getEncExpo.warmup, "getPENDING-U7r42EA", "()I", "AVAILABLE", "getAVAILABLE-U7r42EA", "UNAVAILABLE", "getUNAVAILABLE-U7r42EA", "ERROR_OUTPUT_FAILED", "getERROR_OUTPUT_FAILED-U7r42EA", "ERROR_OUTPUT_ABORTED", "getERROR_OUTPUT_ABORTED-U7r42EA", "ERROR_OUTPUT_MISSING", "getERROR_OUTPUT_MISSING-U7r42EA", "ERROR_OUTPUT_DROPPED", "getERROR_OUTPUT_DROPPED-U7r42EA"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getPENDING-U7r42EA, reason: not valid java name */
        public final int m555getPENDINGU7r42EA() {
            return androidx.camera.camera2.pipe.OutputStatus.PENDING;
        }

        /* renamed from: getAVAILABLE-U7r42EA, reason: not valid java name */
        public final int m550getAVAILABLEU7r42EA() {
            return androidx.camera.camera2.pipe.OutputStatus.AVAILABLE;
        }

        /* renamed from: getUNAVAILABLE-U7r42EA, reason: not valid java name */
        public final int m556getUNAVAILABLEU7r42EA() {
            return androidx.camera.camera2.pipe.OutputStatus.UNAVAILABLE;
        }

        /* renamed from: getERROR_OUTPUT_FAILED-U7r42EA, reason: not valid java name */
        public final int m553getERROR_OUTPUT_FAILEDU7r42EA() {
            return androidx.camera.camera2.pipe.OutputStatus.ERROR_OUTPUT_FAILED;
        }

        /* renamed from: getERROR_OUTPUT_ABORTED-U7r42EA, reason: not valid java name */
        public final int m551getERROR_OUTPUT_ABORTEDU7r42EA() {
            return androidx.camera.camera2.pipe.OutputStatus.ERROR_OUTPUT_ABORTED;
        }

        /* renamed from: getERROR_OUTPUT_MISSING-U7r42EA, reason: not valid java name */
        public final int m554getERROR_OUTPUT_MISSINGU7r42EA() {
            return androidx.camera.camera2.pipe.OutputStatus.ERROR_OUTPUT_MISSING;
        }

        /* renamed from: getERROR_OUTPUT_DROPPED-U7r42EA, reason: not valid java name */
        public final int m552getERROR_OUTPUT_DROPPEDU7r42EA() {
            return androidx.camera.camera2.pipe.OutputStatus.ERROR_OUTPUT_DROPPED;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ OutputStatus(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m548toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m548toStringimpl(int i) {
        if (i == 0) {
            return com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING_STATUS;
        }
        if (i == 1) {
            return "AVAILABLE";
        }
        if (i == 2) {
            return "UNAVAILABLE";
        }
        switch (i) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputStatus(value=");
                sb.append(i);
                sb.append(')');
                return sb.toString();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m549unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m547hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m545equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m547hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m545equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.OutputStatus) && i == ((androidx.camera.camera2.pipe.OutputStatus) obj).m549unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.OutputStatus m543boximpl(int i) {
        return new androidx.camera.camera2.pipe.OutputStatus(i);
    }
}
