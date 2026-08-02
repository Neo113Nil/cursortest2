package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/Lock3ABehavior;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class Lock3ABehavior {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.Lock3ABehavior.Companion INSTANCE = new androidx.camera.camera2.pipe.Lock3ABehavior.Companion(null);
    private static final int IMMEDIATE = 1;
    private static final int AFTER_CURRENT_SCAN = 2;
    private static final int AFTER_NEW_SCAN = 3;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m526equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/Lock3ABehavior$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "IMMEDIATE", com.visa.cbp.getEncExpo.warmup, "getIMMEDIATE-hRqSH3k", "()I", "AFTER_CURRENT_SCAN", "getAFTER_CURRENT_SCAN-hRqSH3k", "AFTER_NEW_SCAN", "getAFTER_NEW_SCAN-hRqSH3k"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getIMMEDIATE-hRqSH3k, reason: not valid java name */
        public final int m532getIMMEDIATEhRqSH3k() {
            return androidx.camera.camera2.pipe.Lock3ABehavior.IMMEDIATE;
        }

        /* renamed from: getAFTER_CURRENT_SCAN-hRqSH3k, reason: not valid java name */
        public final int m530getAFTER_CURRENT_SCANhRqSH3k() {
            return androidx.camera.camera2.pipe.Lock3ABehavior.AFTER_CURRENT_SCAN;
        }

        /* renamed from: getAFTER_NEW_SCAN-hRqSH3k, reason: not valid java name */
        public final int m531getAFTER_NEW_SCANhRqSH3k() {
            return androidx.camera.camera2.pipe.Lock3ABehavior.AFTER_NEW_SCAN;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ Lock3ABehavior(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m529unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m528toStringimpl(this.value);
    }

    public final int hashCode() {
        return m527hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m525equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m528toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Lock3ABehavior(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m527hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m525equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.Lock3ABehavior) && i == ((androidx.camera.camera2.pipe.Lock3ABehavior) obj).m529unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.Lock3ABehavior m524boximpl(int i) {
        return new androidx.camera.camera2.pipe.Lock3ABehavior(i);
    }
}
