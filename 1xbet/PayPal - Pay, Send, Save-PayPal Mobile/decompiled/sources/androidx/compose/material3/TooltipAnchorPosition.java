package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u0011\u0092\u0001\u00020\n"}, d2 = {"Landroidx/compose/material3/TooltipAnchorPosition;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TooltipAnchorPosition {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.TooltipAnchorPosition.Companion INSTANCE = new androidx.compose.material3.TooltipAnchorPosition.Companion(null);
    private static final int Above = 1;
    private static final int Below = 2;
    private static final int Left = 3;
    private static final int Right = 4;
    private static final int Start = 5;
    private static final int End = 6;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4150equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ TooltipAnchorPosition(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public final java.lang.String toString() {
        return m4152toStringimpl(this.getHighSpeedVideoSizes);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m4152toStringimpl(int i) {
        return m4150equalsimpl0(i, Above) ? "Above" : m4150equalsimpl0(i, Below) ? "Below" : m4150equalsimpl0(i, Left) ? "Left" : m4150equalsimpl0(i, Right) ? "Right" : m4150equalsimpl0(i, Start) ? "Start" : m4150equalsimpl0(i, End) ? "End" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b"}, d2 = {"Landroidx/compose/material3/TooltipAnchorPosition$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/TooltipAnchorPosition;", "Above", com.visa.cbp.getEncExpo.warmup, "getAbove-lOKsHw4", "()I", "Below", "getBelow-lOKsHw4", "Left", "getLeft-lOKsHw4", "Right", "getRight-lOKsHw4", "Start", "getStart-lOKsHw4", "End", "getEnd-lOKsHw4"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAbove-lOKsHw4, reason: not valid java name */
        public final int m4154getAbovelOKsHw4() {
            return androidx.compose.material3.TooltipAnchorPosition.Above;
        }

        /* renamed from: getBelow-lOKsHw4, reason: not valid java name */
        public final int m4155getBelowlOKsHw4() {
            return androidx.compose.material3.TooltipAnchorPosition.Below;
        }

        /* renamed from: getLeft-lOKsHw4, reason: not valid java name */
        public final int m4157getLeftlOKsHw4() {
            return androidx.compose.material3.TooltipAnchorPosition.Left;
        }

        /* renamed from: getRight-lOKsHw4, reason: not valid java name */
        public final int m4158getRightlOKsHw4() {
            return androidx.compose.material3.TooltipAnchorPosition.Right;
        }

        /* renamed from: getStart-lOKsHw4, reason: not valid java name */
        public final int m4159getStartlOKsHw4() {
            return androidx.compose.material3.TooltipAnchorPosition.Start;
        }

        /* renamed from: getEnd-lOKsHw4, reason: not valid java name */
        public final int m4156getEndlOKsHw4() {
            return androidx.compose.material3.TooltipAnchorPosition.End;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return m4151hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m4149equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4151hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4149equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.material3.TooltipAnchorPosition) && i == ((androidx.compose.material3.TooltipAnchorPosition) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.TooltipAnchorPosition m4148boximpl(int i) {
        return new androidx.compose.material3.TooltipAnchorPosition(i);
    }
}
