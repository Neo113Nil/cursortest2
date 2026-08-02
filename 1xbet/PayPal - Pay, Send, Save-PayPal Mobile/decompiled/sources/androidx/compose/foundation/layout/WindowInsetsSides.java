package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0088\u0001\u001c\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides;", "", "", "p0", "getHighSpeedVideoFpsRanges", "(I)I", "sides", "plus-gK_yJZ4", "(II)I", "plus", "", "hasAny-bkgdKaI$foundation_layout", "(II)Z", "hasAny", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "getHighSpeedVideoSizes", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int AllowLeftInLtr;
    private static final int AllowLeftInRtl;
    private static final int AllowRightInLtr;
    private static final int AllowRightInRtl;
    private static final int Bottom;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.layout.WindowInsetsSides.Companion INSTANCE = new androidx.compose.foundation.layout.WindowInsetsSides.Companion(null);
    private static final int End;
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Start;
    private static final int Top;
    private static final int Vertical;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1761equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighSpeedVideoFpsRanges(int i) {
        return i;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout, reason: not valid java name */
    public static final boolean m1762hasAnybkgdKaI$foundation_layout(int i, int i2) {
        return (i & i2) != 0;
    }

    private /* synthetic */ WindowInsetsSides(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m1764plusgK_yJZ4(int i, int i2) {
        return getHighSpeedVideoFpsRanges(i | i2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1765toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WindowInsetsSides(");
        sb.append(getHighSpeedVideoSizes(i));
        sb.append(')');
        return sb.toString();
    }

    public final java.lang.String toString() {
        return m1765toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    private static final java.lang.String getHighSpeedVideoSizes(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i2 = Start;
        if ((i & i2) == i2) {
            getHighSpeedVideoFpsRanges(sb, "Start");
        }
        int i3 = Left;
        if ((i & i3) == i3) {
            getHighSpeedVideoFpsRanges(sb, "Left");
        }
        int i4 = Top;
        if ((i & i4) == i4) {
            getHighSpeedVideoFpsRanges(sb, "Top");
        }
        int i5 = End;
        if ((i & i5) == i5) {
            getHighSpeedVideoFpsRanges(sb, "End");
        }
        int i6 = Right;
        if ((i & i6) == i6) {
            getHighSpeedVideoFpsRanges(sb, "Right");
        }
        int i7 = Bottom;
        if ((i & i7) == i7) {
            getHighSpeedVideoFpsRanges(sb, "Bottom");
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    private static final void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, java.lang.String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsSides$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "AllowLeftInLtr", com.visa.cbp.getEncExpo.warmup, "getAllowLeftInLtr-JoeWqyM$foundation_layout", "()I", "AllowRightInLtr", "getAllowRightInLtr-JoeWqyM$foundation_layout", "AllowLeftInRtl", "getAllowLeftInRtl-JoeWqyM$foundation_layout", "AllowRightInRtl", "getAllowRightInRtl-JoeWqyM$foundation_layout", "Start", "getStart-JoeWqyM", "End", "getEnd-JoeWqyM", "Top", "getTop-JoeWqyM", "Bottom", "getBottom-JoeWqyM", "Left", "getLeft-JoeWqyM", "Right", "getRight-JoeWqyM", "Horizontal", "getHorizontal-JoeWqyM", "Vertical", "getVertical-JoeWqyM"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m1767getAllowLeftInLtrJoeWqyM$foundation_layout() {
            return androidx.compose.foundation.layout.WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m1769getAllowRightInLtrJoeWqyM$foundation_layout() {
            return androidx.compose.foundation.layout.WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m1768getAllowLeftInRtlJoeWqyM$foundation_layout() {
            return androidx.compose.foundation.layout.WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m1770getAllowRightInRtlJoeWqyM$foundation_layout() {
            return androidx.compose.foundation.layout.WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m1776getStartJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.Start;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m1772getEndJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.End;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m1777getTopJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.Top;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m1771getBottomJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.Bottom;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m1774getLeftJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m1775getRightJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.Right;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m1773getHorizontalJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.Horizontal;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m1778getVerticalJoeWqyM() {
            return androidx.compose.foundation.layout.WindowInsetsSides.Vertical;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(8);
        AllowLeftInLtr = highSpeedVideoFpsRanges;
        int highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(4);
        AllowRightInLtr = highSpeedVideoFpsRanges2;
        int highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(2);
        AllowLeftInRtl = highSpeedVideoFpsRanges3;
        int highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(1);
        AllowRightInRtl = highSpeedVideoFpsRanges4;
        Start = m1764plusgK_yJZ4(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges4);
        End = m1764plusgK_yJZ4(highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges3);
        int highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(16);
        Top = highSpeedVideoFpsRanges5;
        int highSpeedVideoFpsRanges6 = getHighSpeedVideoFpsRanges(32);
        Bottom = highSpeedVideoFpsRanges6;
        int m1764plusgK_yJZ4 = m1764plusgK_yJZ4(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges3);
        Left = m1764plusgK_yJZ4;
        int m1764plusgK_yJZ42 = m1764plusgK_yJZ4(highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges4);
        Right = m1764plusgK_yJZ42;
        Horizontal = m1764plusgK_yJZ4(m1764plusgK_yJZ4, m1764plusgK_yJZ42);
        Vertical = m1764plusgK_yJZ4(highSpeedVideoFpsRanges5, highSpeedVideoFpsRanges6);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m1763hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m1760equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1763hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1760equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.layout.WindowInsetsSides) && i == ((androidx.compose.foundation.layout.WindowInsetsSides) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.layout.WindowInsetsSides m1759boximpl(int i) {
        return new androidx.compose.foundation.layout.WindowInsetsSides(i);
    }
}
