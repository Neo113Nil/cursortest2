package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0005J\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/AeMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "isOn-impl", "(I)Z", "isOn", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class AeMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.AeMode.Companion INSTANCE = new androidx.camera.camera2.pipe.AeMode.Companion(null);
    private static final int OFF;
    private static final int ON;
    private static final int ON_ALWAYS_FLASH;
    private static final int ON_AUTO_FLASH;
    private static final int ON_AUTO_FLASH_REDEYE;
    private static final int ON_EXTERNAL_FLASH;
    private static final int ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY;
    private static final java.util.List<androidx.camera.camera2.pipe.AeMode> values;
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m149constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m151equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: isOn-impl, reason: not valid java name */
    public static final boolean m155isOnimpl(int i) {
        return i != 0;
    }

    private /* synthetic */ AeMode(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0019\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001c\u0010\u0010R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/camera/camera2/pipe/AeMode$Companion;", "", "<init>", "()V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/camera/camera2/pipe/AeMode;", "fromIntOrNull-kQd0u18", "(I)Landroidx/camera/camera2/pipe/AeMode;", "fromIntOrNull", "fromInt-IwILmM0", "(I)I", "fromInt", "OFF", com.visa.cbp.getEncExpo.warmup, "getOFF-bOjpiJc", "()I", "ON", "getON-bOjpiJc", "ON_ALWAYS_FLASH", "getON_ALWAYS_FLASH-bOjpiJc", "ON_AUTO_FLASH", "getON_AUTO_FLASH-bOjpiJc", "ON_AUTO_FLASH_REDEYE", "getON_AUTO_FLASH_REDEYE-bOjpiJc", "ON_EXTERNAL_FLASH", "getON_EXTERNAL_FLASH-bOjpiJc", "ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY", "getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY-bOjpiJc", "", "values", "Ljava/util/List;", "getValues", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getOFF-bOjpiJc, reason: not valid java name */
        public final int m160getOFFbOjpiJc() {
            return androidx.camera.camera2.pipe.AeMode.OFF;
        }

        /* renamed from: getON-bOjpiJc, reason: not valid java name */
        public final int m161getONbOjpiJc() {
            return androidx.camera.camera2.pipe.AeMode.ON;
        }

        /* renamed from: getON_ALWAYS_FLASH-bOjpiJc, reason: not valid java name */
        public final int m162getON_ALWAYS_FLASHbOjpiJc() {
            return androidx.camera.camera2.pipe.AeMode.ON_ALWAYS_FLASH;
        }

        /* renamed from: getON_AUTO_FLASH-bOjpiJc, reason: not valid java name */
        public final int m163getON_AUTO_FLASHbOjpiJc() {
            return androidx.camera.camera2.pipe.AeMode.ON_AUTO_FLASH;
        }

        /* renamed from: getON_AUTO_FLASH_REDEYE-bOjpiJc, reason: not valid java name */
        public final int m164getON_AUTO_FLASH_REDEYEbOjpiJc() {
            return androidx.camera.camera2.pipe.AeMode.ON_AUTO_FLASH_REDEYE;
        }

        /* renamed from: getON_EXTERNAL_FLASH-bOjpiJc, reason: not valid java name */
        public final int m165getON_EXTERNAL_FLASHbOjpiJc() {
            return androidx.camera.camera2.pipe.AeMode.ON_EXTERNAL_FLASH;
        }

        /* renamed from: getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY-bOjpiJc, reason: not valid java name */
        public final int m166getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITYbOjpiJc() {
            return androidx.camera.camera2.pipe.AeMode.ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY;
        }

        public final java.util.List<androidx.camera.camera2.pipe.AeMode> getValues() {
            return androidx.camera.camera2.pipe.AeMode.values;
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: fromIntOrNull-kQd0u18, reason: not valid java name */
        public final androidx.camera.camera2.pipe.AeMode m159fromIntOrNullkQd0u18(int value) {
            java.lang.Object obj;
            java.util.Iterator<T> it = getValues().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((androidx.camera.camera2.pipe.AeMode) obj).m157unboximpl() == value) {
                    break;
                }
            }
            return (androidx.camera.camera2.pipe.AeMode) obj;
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: fromInt-IwILmM0, reason: not valid java name */
        public final int m158fromIntIwILmM0(int value) {
            if (value == m160getOFFbOjpiJc()) {
                return m160getOFFbOjpiJc();
            }
            if (value == m161getONbOjpiJc()) {
                return m161getONbOjpiJc();
            }
            if (value == m163getON_AUTO_FLASHbOjpiJc()) {
                return m163getON_AUTO_FLASHbOjpiJc();
            }
            if (value == m162getON_ALWAYS_FLASHbOjpiJc()) {
                return m162getON_ALWAYS_FLASHbOjpiJc();
            }
            if (value == m164getON_AUTO_FLASH_REDEYEbOjpiJc()) {
                return m164getON_AUTO_FLASH_REDEYEbOjpiJc();
            }
            if (value == m165getON_EXTERNAL_FLASHbOjpiJc()) {
                return m165getON_EXTERNAL_FLASHbOjpiJc();
            }
            if (value == m166getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITYbOjpiJc()) {
                return m166getON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITYbOjpiJc();
            }
            return m161getONbOjpiJc();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int m149constructorimpl = m149constructorimpl(0);
        OFF = m149constructorimpl;
        int m149constructorimpl2 = m149constructorimpl(1);
        ON = m149constructorimpl2;
        int m149constructorimpl3 = m149constructorimpl(3);
        ON_ALWAYS_FLASH = m149constructorimpl3;
        int m149constructorimpl4 = m149constructorimpl(2);
        ON_AUTO_FLASH = m149constructorimpl4;
        int m149constructorimpl5 = m149constructorimpl(4);
        ON_AUTO_FLASH_REDEYE = m149constructorimpl5;
        int m149constructorimpl6 = m149constructorimpl(5);
        ON_EXTERNAL_FLASH = m149constructorimpl6;
        int m149constructorimpl7 = m149constructorimpl(6);
        ON_LOW_LIGHT_BOOST_BRIGHTNESS_PRIORITY = m149constructorimpl7;
        values = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.AeMode[]{m148boximpl(m149constructorimpl), m148boximpl(m149constructorimpl2), m148boximpl(m149constructorimpl4), m148boximpl(m149constructorimpl3), m148boximpl(m149constructorimpl5), m148boximpl(m149constructorimpl6), m148boximpl(m149constructorimpl7)});
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m157unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m156toStringimpl(this.value);
    }

    public final int hashCode() {
        return m154hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m150equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m156toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AeMode(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m154hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: fromIntOrNull-kQd0u18, reason: not valid java name */
    public static final androidx.camera.camera2.pipe.AeMode m153fromIntOrNullkQd0u18(int i) {
        return INSTANCE.m159fromIntOrNullkQd0u18(i);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: fromInt-IwILmM0, reason: not valid java name */
    public static final int m152fromIntIwILmM0(int i) {
        return INSTANCE.m158fromIntIwILmM0(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m150equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.AeMode) && i == ((androidx.camera.camera2.pipe.AeMode) obj).m157unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.AeMode m148boximpl(int i) {
        return new androidx.camera.camera2.pipe.AeMode(i);
    }
}
