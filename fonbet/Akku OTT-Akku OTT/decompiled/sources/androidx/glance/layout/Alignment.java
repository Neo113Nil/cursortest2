package androidx.glance.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.q;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/glance/layout/Alignment;", "", "horizontal", "Landroidx/glance/layout/Alignment$Horizontal;", "vertical", "Landroidx/glance/layout/Alignment$Vertical;", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHorizontal-PGIyAqw", "()I", "I", "getVertical-mnfRV0w", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "Horizontal", "Vertical", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Alignment {
    public static final int $stable = 0;
    private static final int Bottom;
    private static final Alignment BottomCenter;
    private static final Alignment BottomEnd;
    private static final Alignment BottomStart;
    private static final Alignment Center;
    private static final Alignment CenterEnd;
    private static final int CenterHorizontally;
    private static final Alignment CenterStart;
    private static final int CenterVertically;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final int End;
    private static final int Start;
    private static final int Top;
    private static final Alignment TopCenter;
    private static final Alignment TopEnd;
    private static final Alignment TopStart;
    private final int horizontal;
    private final int vertical;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000bR\u001c\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0016\u0010\u0006R\u0011\u0010\u0017\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000bR\u001c\u0010\u0019\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001a\u0010\u0006R\u001c\u0010\u001b\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001c\u0010\u0006R\u001c\u0010\u001d\u001a\u00020\u0015ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001e\u0010\u0006R\u001c\u0010\u001f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b \u0010\u0006R\u0011\u0010!\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000bR\u0011\u0010#\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000bR\u0011\u0010%\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/glance/layout/Alignment$Companion;", "", "()V", "Bottom", "Landroidx/glance/layout/Alignment$Vertical;", "getBottom-mnfRV0w", "()I", "I", "BottomCenter", "Landroidx/glance/layout/Alignment;", "getBottomCenter", "()Landroidx/glance/layout/Alignment;", "BottomEnd", "getBottomEnd", "BottomStart", "getBottomStart", "Center", "getCenter", "CenterEnd", "getCenterEnd", "CenterHorizontally", "Landroidx/glance/layout/Alignment$Horizontal;", "getCenterHorizontally-PGIyAqw", "CenterStart", "getCenterStart", "CenterVertically", "getCenterVertically-mnfRV0w", "End", "getEnd-PGIyAqw", "Start", "getStart-PGIyAqw", "Top", "getTop-mnfRV0w", "TopCenter", "getTopCenter", "TopEnd", "getTopEnd", "TopStart", "getTopStart", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getBottom-mnfRV0w, reason: not valid java name */
        public final int m1363getBottommnfRV0w() {
            return Alignment.Bottom;
        }

        public final Alignment getBottomCenter() {
            return Alignment.BottomCenter;
        }

        public final Alignment getBottomEnd() {
            return Alignment.BottomEnd;
        }

        public final Alignment getBottomStart() {
            return Alignment.BottomStart;
        }

        public final Alignment getCenter() {
            return Alignment.Center;
        }

        public final Alignment getCenterEnd() {
            return Alignment.CenterEnd;
        }

        /* renamed from: getCenterHorizontally-PGIyAqw, reason: not valid java name */
        public final int m1364getCenterHorizontallyPGIyAqw() {
            return Alignment.CenterHorizontally;
        }

        public final Alignment getCenterStart() {
            return Alignment.CenterStart;
        }

        /* renamed from: getCenterVertically-mnfRV0w, reason: not valid java name */
        public final int m1365getCenterVerticallymnfRV0w() {
            return Alignment.CenterVertically;
        }

        /* renamed from: getEnd-PGIyAqw, reason: not valid java name */
        public final int m1366getEndPGIyAqw() {
            return Alignment.End;
        }

        /* renamed from: getStart-PGIyAqw, reason: not valid java name */
        public final int m1367getStartPGIyAqw() {
            return Alignment.Start;
        }

        /* renamed from: getTop-mnfRV0w, reason: not valid java name */
        public final int m1368getTopmnfRV0w() {
            return Alignment.Top;
        }

        public final Alignment getTopCenter() {
            return Alignment.TopCenter;
        }

        public final Alignment getTopEnd() {
            return Alignment.TopEnd;
        }

        public final Alignment getTopStart() {
            return Alignment.TopStart;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/glance/layout/Alignment$Horizontal;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class Horizontal {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Start = m1370constructorimpl(0);
        private static final int CenterHorizontally = m1370constructorimpl(1);
        private static final int End = m1370constructorimpl(2);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/glance/layout/Alignment$Horizontal$Companion;", "", "()V", "CenterHorizontally", "Landroidx/glance/layout/Alignment$Horizontal;", "getCenterHorizontally-PGIyAqw", "()I", "I", "End", "getEnd-PGIyAqw", "Start", "getStart-PGIyAqw", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getCenterHorizontally-PGIyAqw, reason: not valid java name */
            public final int m1376getCenterHorizontallyPGIyAqw() {
                return Horizontal.CenterHorizontally;
            }

            /* renamed from: getEnd-PGIyAqw, reason: not valid java name */
            public final int m1377getEndPGIyAqw() {
                return Horizontal.End;
            }

            /* renamed from: getStart-PGIyAqw, reason: not valid java name */
            public final int m1378getStartPGIyAqw() {
                return Horizontal.Start;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Horizontal(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Horizontal m1369boximpl(int i) {
            return new Horizontal(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m1370constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1371equalsimpl(int i, Object obj) {
            return (obj instanceof Horizontal) && i == ((Horizontal) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1372equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1373hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1374toStringimpl(int i) {
            return q.a("Horizontal(value=", i, ')');
        }

        public boolean equals(Object obj) {
            return m1371equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m1373hashCodeimpl(this.value);
        }

        public String toString() {
            return m1374toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/glance/layout/Alignment$Vertical;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class Vertical {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Top = m1380constructorimpl(0);
        private static final int CenterVertically = m1380constructorimpl(1);
        private static final int Bottom = m1380constructorimpl(2);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/glance/layout/Alignment$Vertical$Companion;", "", "()V", "Bottom", "Landroidx/glance/layout/Alignment$Vertical;", "getBottom-mnfRV0w", "()I", "I", "CenterVertically", "getCenterVertically-mnfRV0w", "Top", "getTop-mnfRV0w", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: getBottom-mnfRV0w, reason: not valid java name */
            public final int m1386getBottommnfRV0w() {
                return Vertical.Bottom;
            }

            /* renamed from: getCenterVertically-mnfRV0w, reason: not valid java name */
            public final int m1387getCenterVerticallymnfRV0w() {
                return Vertical.CenterVertically;
            }

            /* renamed from: getTop-mnfRV0w, reason: not valid java name */
            public final int m1388getTopmnfRV0w() {
                return Vertical.Top;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Vertical(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Vertical m1379boximpl(int i) {
            return new Vertical(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        private static int m1380constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1381equalsimpl(int i, Object obj) {
            return (obj instanceof Vertical) && i == ((Vertical) obj).getValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1382equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1383hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1384toStringimpl(int i) {
            return q.a("Vertical(value=", i, ')');
        }

        public boolean equals(Object obj) {
            return m1381equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m1383hashCodeimpl(this.value);
        }

        public String toString() {
            return m1384toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getValue() {
            return this.value;
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        Horizontal.Companion companion = Horizontal.INSTANCE;
        int m1378getStartPGIyAqw = companion.m1378getStartPGIyAqw();
        Vertical.Companion companion2 = Vertical.INSTANCE;
        TopStart = new Alignment(m1378getStartPGIyAqw, companion2.m1388getTopmnfRV0w(), defaultConstructorMarker);
        TopCenter = new Alignment(companion.m1376getCenterHorizontallyPGIyAqw(), companion2.m1388getTopmnfRV0w(), defaultConstructorMarker);
        TopEnd = new Alignment(companion.m1377getEndPGIyAqw(), companion2.m1388getTopmnfRV0w(), defaultConstructorMarker);
        CenterStart = new Alignment(companion.m1378getStartPGIyAqw(), companion2.m1387getCenterVerticallymnfRV0w(), defaultConstructorMarker);
        Center = new Alignment(companion.m1376getCenterHorizontallyPGIyAqw(), companion2.m1387getCenterVerticallymnfRV0w(), defaultConstructorMarker);
        CenterEnd = new Alignment(companion.m1377getEndPGIyAqw(), companion2.m1387getCenterVerticallymnfRV0w(), defaultConstructorMarker);
        BottomStart = new Alignment(companion.m1378getStartPGIyAqw(), companion2.m1386getBottommnfRV0w(), defaultConstructorMarker);
        BottomCenter = new Alignment(companion.m1376getCenterHorizontallyPGIyAqw(), companion2.m1386getBottommnfRV0w(), defaultConstructorMarker);
        BottomEnd = new Alignment(companion.m1377getEndPGIyAqw(), companion2.m1386getBottommnfRV0w(), defaultConstructorMarker);
        Top = companion2.m1388getTopmnfRV0w();
        CenterVertically = companion2.m1387getCenterVerticallymnfRV0w();
        Bottom = companion2.m1386getBottommnfRV0w();
        Start = companion.m1378getStartPGIyAqw();
        CenterHorizontally = companion.m1376getCenterHorizontallyPGIyAqw();
        End = companion.m1377getEndPGIyAqw();
    }

    public /* synthetic */ Alignment(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(Alignment.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type androidx.glance.layout.Alignment");
        Alignment alignment = (Alignment) other;
        return Horizontal.m1372equalsimpl0(this.horizontal, alignment.horizontal) && Vertical.m1382equalsimpl0(this.vertical, alignment.vertical);
    }

    /* renamed from: getHorizontal-PGIyAqw, reason: not valid java name and from getter */
    public final int getHorizontal() {
        return this.horizontal;
    }

    /* renamed from: getVertical-mnfRV0w, reason: not valid java name and from getter */
    public final int getVertical() {
        return this.vertical;
    }

    public int hashCode() {
        return Vertical.m1383hashCodeimpl(this.vertical) + (Horizontal.m1373hashCodeimpl(this.horizontal) * 31);
    }

    public String toString() {
        return "Alignment(horizontal=" + ((Object) Horizontal.m1374toStringimpl(this.horizontal)) + ", vertical=" + ((Object) Vertical.m1384toStringimpl(this.vertical)) + ')';
    }

    private Alignment(int i, int i2) {
        this.horizontal = i;
        this.vertical = i2;
    }
}
