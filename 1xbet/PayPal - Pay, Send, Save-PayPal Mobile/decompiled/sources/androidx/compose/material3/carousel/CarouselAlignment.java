package androidx.compose.material3.carousel;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006"}, d2 = {"Landroidx/compose/material3/carousel/CarouselAlignment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class CarouselAlignment {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.carousel.CarouselAlignment.Companion INSTANCE = new androidx.compose.material3.carousel.CarouselAlignment.Companion(null);
    private static final int Start = -1;
    private static final int Center = 0;
    private static final int End = 1;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4235equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/material3/carousel/CarouselAlignment$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/carousel/CarouselAlignment;", "Start", com.visa.cbp.getEncExpo.warmup, "getStart-NUL3oTo", "()I", "Center", "getCenter-NUL3oTo", "End", "getEnd-NUL3oTo"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getStart-NUL3oTo, reason: not valid java name */
        public final int m4241getStartNUL3oTo() {
            return androidx.compose.material3.carousel.CarouselAlignment.Start;
        }

        /* renamed from: getCenter-NUL3oTo, reason: not valid java name */
        public final int m4239getCenterNUL3oTo() {
            return androidx.compose.material3.carousel.CarouselAlignment.Center;
        }

        /* renamed from: getEnd-NUL3oTo, reason: not valid java name */
        public final int m4240getEndNUL3oTo() {
            return androidx.compose.material3.carousel.CarouselAlignment.End;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ CarouselAlignment(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m4237toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m4236hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m4234equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m4237toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CarouselAlignment(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4236hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4234equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.material3.carousel.CarouselAlignment) && i == ((androidx.compose.material3.carousel.CarouselAlignment) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.carousel.CarouselAlignment m4233boximpl(int i) {
        return new androidx.compose.material3.carousel.CarouselAlignment(i);
    }
}
