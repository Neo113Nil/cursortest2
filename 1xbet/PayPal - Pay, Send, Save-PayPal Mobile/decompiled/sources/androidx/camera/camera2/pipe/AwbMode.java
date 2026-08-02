package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/AwbMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "isOn-impl", "(I)Z", "isOn", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class AwbMode {
    private static final int AUTO;
    private static final int CLOUDY_DAYLIGHT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.AwbMode.Companion INSTANCE = new androidx.camera.camera2.pipe.AwbMode.Companion(null);
    private static final int DAYLIGHT;
    private static final int FLUORESCENT;
    private static final int INCANDESCENT;
    private static final int OFF;
    private static final int SHADE;
    private static final int TWILIGHT;
    private static final java.util.List<androidx.camera.camera2.pipe.AwbMode> values;
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m195constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m197equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m200isOnimpl(int i) {
        return i != 0;
    }

    private /* synthetic */ AwbMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/camera/camera2/pipe/AwbMode$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/camera/camera2/pipe/AwbMode;", "fromIntOrNull--SaEiwI", "(I)Landroidx/camera/camera2/pipe/AwbMode;", "fromIntOrNull", "OFF", com.visa.cbp.getEncExpo.warmup, "getOFF-3hxnlF8", "()I", "AUTO", "getAUTO-3hxnlF8", "CLOUDY_DAYLIGHT", "getCLOUDY_DAYLIGHT-3hxnlF8", "DAYLIGHT", "getDAYLIGHT-3hxnlF8", "INCANDESCENT", "getINCANDESCENT-3hxnlF8", "FLUORESCENT", "getFLUORESCENT-3hxnlF8", "SHADE", "getSHADE-3hxnlF8", "TWILIGHT", "getTWILIGHT-3hxnlF8", "", "values", "Ljava/util/List;", "getValues", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getOFF-3hxnlF8, reason: not valid java name */
        public final int m209getOFF3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.OFF;
        }

        /* renamed from: getAUTO-3hxnlF8, reason: not valid java name */
        public final int m204getAUTO3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.AUTO;
        }

        /* renamed from: getCLOUDY_DAYLIGHT-3hxnlF8, reason: not valid java name */
        public final int m205getCLOUDY_DAYLIGHT3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.CLOUDY_DAYLIGHT;
        }

        /* renamed from: getDAYLIGHT-3hxnlF8, reason: not valid java name */
        public final int m206getDAYLIGHT3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.DAYLIGHT;
        }

        /* renamed from: getINCANDESCENT-3hxnlF8, reason: not valid java name */
        public final int m208getINCANDESCENT3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.INCANDESCENT;
        }

        /* renamed from: getFLUORESCENT-3hxnlF8, reason: not valid java name */
        public final int m207getFLUORESCENT3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.FLUORESCENT;
        }

        /* renamed from: getSHADE-3hxnlF8, reason: not valid java name */
        public final int m210getSHADE3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.SHADE;
        }

        /* renamed from: getTWILIGHT-3hxnlF8, reason: not valid java name */
        public final int m211getTWILIGHT3hxnlF8() {
            return androidx.camera.camera2.pipe.AwbMode.TWILIGHT;
        }

        public final java.util.List<androidx.camera.camera2.pipe.AwbMode> getValues() {
            return androidx.camera.camera2.pipe.AwbMode.values;
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: fromIntOrNull--SaEiwI, reason: not valid java name */
        public final androidx.camera.camera2.pipe.AwbMode m203fromIntOrNullSaEiwI(int value) {
            java.lang.Object obj;
            java.util.Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((androidx.camera.camera2.pipe.AwbMode) obj).m202unboximpl() == value) {
                    break;
                }
            }
            return (androidx.camera.camera2.pipe.AwbMode) obj;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int m195constructorimpl = m195constructorimpl(0);
        OFF = m195constructorimpl;
        int m195constructorimpl2 = m195constructorimpl(1);
        AUTO = m195constructorimpl2;
        int m195constructorimpl3 = m195constructorimpl(6);
        CLOUDY_DAYLIGHT = m195constructorimpl3;
        int m195constructorimpl4 = m195constructorimpl(5);
        DAYLIGHT = m195constructorimpl4;
        int m195constructorimpl5 = m195constructorimpl(2);
        INCANDESCENT = m195constructorimpl5;
        int m195constructorimpl6 = m195constructorimpl(3);
        FLUORESCENT = m195constructorimpl6;
        int m195constructorimpl7 = m195constructorimpl(8);
        SHADE = m195constructorimpl7;
        int m195constructorimpl8 = m195constructorimpl(7);
        TWILIGHT = m195constructorimpl8;
        values = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.AwbMode[]{m194boximpl(m195constructorimpl), m194boximpl(m195constructorimpl2), m194boximpl(m195constructorimpl3), m194boximpl(m195constructorimpl4), m194boximpl(m195constructorimpl5), m194boximpl(m195constructorimpl6), m194boximpl(m195constructorimpl7), m194boximpl(m195constructorimpl8)});
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m202unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m201toStringimpl(this.value);
    }

    public final int hashCode() {
        return m199hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m196equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m201toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AwbMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m199hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: fromIntOrNull--SaEiwI, reason: not valid java name */
    public static final androidx.camera.camera2.pipe.AwbMode m198fromIntOrNullSaEiwI(int i) {
        return INSTANCE.m203fromIntOrNullSaEiwI(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m196equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.AwbMode) && i == ((androidx.camera.camera2.pipe.AwbMode) obj).m202unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.AwbMode m194boximpl(int i) {
        return new androidx.camera.camera2.pipe.AwbMode(i);
    }
}
