package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/RequestTemplate;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "getName-impl", "name"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class RequestTemplate {
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m680constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m682equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ RequestTemplate(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: getName-impl, reason: not valid java name */
    public static final java.lang.String m683getNameimpl(int i) {
        switch (i) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case 6:
                return "TEMPLATE_MANUAL";
            default:
                return "UNKNOWN-".concat(java.lang.String.valueOf(i));
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m686unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m685toStringimpl(this.value);
    }

    public final int hashCode() {
        return m684hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m681equalsimpl(this.value, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m685toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RequestTemplate(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m684hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m681equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.RequestTemplate) && i == ((androidx.camera.camera2.pipe.RequestTemplate) obj).m686unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.RequestTemplate m679boximpl(int i) {
        return new androidx.camera.camera2.pipe.RequestTemplate(i);
    }
}
