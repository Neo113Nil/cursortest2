package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\u000f\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/AfMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "isOn-impl", "(I)Z", "isOn", "isContinuous-impl", "isContinuous", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class AfMode {
    private static final int AUTO;
    private static final int CONTINUOUS_PICTURE;
    private static final int CONTINUOUS_VIDEO;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.AfMode.Companion INSTANCE = new androidx.camera.camera2.pipe.AfMode.Companion(null);
    private static final int EDOF;
    private static final int MACRO;
    private static final int OFF;
    private static final java.util.List<androidx.camera.camera2.pipe.AfMode> values;
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m168constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m170equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: isContinuous-impl, reason: not valid java name */
    public static final boolean m173isContinuousimpl(int i) {
        return i == 3 || i == 4;
    }

    /* renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m174isOnimpl(int i) {
        return i != 0;
    }

    private /* synthetic */ AfMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/AfMode$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/camera/camera2/pipe/AfMode;", "fromIntOrNull-MKXwA8g", "(I)Landroidx/camera/camera2/pipe/AfMode;", "fromIntOrNull", "OFF", com.visa.cbp.getEncExpo.warmup, "getOFF-vHZNRtE", "()I", "AUTO", "getAUTO-vHZNRtE", "MACRO", "getMACRO-vHZNRtE", "CONTINUOUS_VIDEO", "getCONTINUOUS_VIDEO-vHZNRtE", "CONTINUOUS_PICTURE", "getCONTINUOUS_PICTURE-vHZNRtE", "EDOF", "getEDOF-vHZNRtE", "", "values", "Ljava/util/List;", "getValues", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getOFF-vHZNRtE, reason: not valid java name */
        public final int m183getOFFvHZNRtE() {
            return androidx.camera.camera2.pipe.AfMode.OFF;
        }

        /* renamed from: getAUTO-vHZNRtE, reason: not valid java name */
        public final int m178getAUTOvHZNRtE() {
            return androidx.camera.camera2.pipe.AfMode.AUTO;
        }

        /* renamed from: getMACRO-vHZNRtE, reason: not valid java name */
        public final int m182getMACROvHZNRtE() {
            return androidx.camera.camera2.pipe.AfMode.MACRO;
        }

        /* renamed from: getCONTINUOUS_VIDEO-vHZNRtE, reason: not valid java name */
        public final int m180getCONTINUOUS_VIDEOvHZNRtE() {
            return androidx.camera.camera2.pipe.AfMode.CONTINUOUS_VIDEO;
        }

        /* renamed from: getCONTINUOUS_PICTURE-vHZNRtE, reason: not valid java name */
        public final int m179getCONTINUOUS_PICTUREvHZNRtE() {
            return androidx.camera.camera2.pipe.AfMode.CONTINUOUS_PICTURE;
        }

        /* renamed from: getEDOF-vHZNRtE, reason: not valid java name */
        public final int m181getEDOFvHZNRtE() {
            return androidx.camera.camera2.pipe.AfMode.EDOF;
        }

        public final java.util.List<androidx.camera.camera2.pipe.AfMode> getValues() {
            return androidx.camera.camera2.pipe.AfMode.values;
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: fromIntOrNull-MKXwA8g, reason: not valid java name */
        public final androidx.camera.camera2.pipe.AfMode m177fromIntOrNullMKXwA8g(int value) {
            java.lang.Object obj;
            java.util.Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((androidx.camera.camera2.pipe.AfMode) obj).m176unboximpl() == value) {
                    break;
                }
            }
            return (androidx.camera.camera2.pipe.AfMode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int m168constructorimpl = m168constructorimpl(0);
        OFF = m168constructorimpl;
        int m168constructorimpl2 = m168constructorimpl(1);
        AUTO = m168constructorimpl2;
        int m168constructorimpl3 = m168constructorimpl(2);
        MACRO = m168constructorimpl3;
        int m168constructorimpl4 = m168constructorimpl(3);
        CONTINUOUS_VIDEO = m168constructorimpl4;
        int m168constructorimpl5 = m168constructorimpl(4);
        CONTINUOUS_PICTURE = m168constructorimpl5;
        int m168constructorimpl6 = m168constructorimpl(5);
        EDOF = m168constructorimpl6;
        values = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.AfMode[]{m167boximpl(m168constructorimpl), m167boximpl(m168constructorimpl2), m167boximpl(m168constructorimpl3), m167boximpl(m168constructorimpl4), m167boximpl(m168constructorimpl5), m167boximpl(m168constructorimpl6)});
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m176unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m175toStringimpl(this.value);
    }

    public final int hashCode() {
        return m172hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m169equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m175toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AfMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m172hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: fromIntOrNull-MKXwA8g, reason: not valid java name */
    public static final androidx.camera.camera2.pipe.AfMode m171fromIntOrNullMKXwA8g(int i) {
        return INSTANCE.m177fromIntOrNullMKXwA8g(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m169equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.AfMode) && i == ((androidx.camera.camera2.pipe.AfMode) obj).m176unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.AfMode m167boximpl(int i) {
        return new androidx.camera.camera2.pipe.AfMode(i);
    }
}
