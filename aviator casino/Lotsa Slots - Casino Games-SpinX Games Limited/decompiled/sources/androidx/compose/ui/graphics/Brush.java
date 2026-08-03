package androidx.compose.ui.graphics;

/* compiled from: Brush.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u00020\u0004X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0012\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "()V", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "J", "applyTo", "", "size", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Brush {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.Brush.Companion INSTANCE = new androidx.compose.ui.graphics.Brush.Companion(null);
    private final long intrinsicSize;

    public /* synthetic */ Brush(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo2060applyToPq9zytI(long size, androidx.compose.ui.graphics.Paint p, float alpha);

    private Brush() {
        this.intrinsicSize = androidx.compose.ui.geometry.Size.INSTANCE.m1948getUnspecifiedNHjbRc();
    }

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name and from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    /* compiled from: Brush.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\\\u0010\u0003\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0012J\\\u0010\u0013\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J>\u0010\u0013\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0019J\\\u0010\u001a\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001a\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001fJH\u0010 \u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J*\u0010 \u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010#J\\\u0010$\u001a\u00020\u00042*\u0010\u0005\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\"\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u000fJ>\u0010$\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "()V", "horizontalGradient", "Landroidx/compose/ui/graphics/Brush;", "colorStops", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "startX", "endX", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "horizontalGradient-8A-3gB4", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "colors", "", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "start", "Landroidx/compose/ui/geometry/Offset;", "end", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "center", com.helpshift.proactive.InAppViewConstants.RADIUS, "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "verticalGradient", "startY", "endY", "verticalGradient-8A-3gB4", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2065linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, long j, long j2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = androidx.compose.ui.geometry.Offset.INSTANCE.m1885getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2075linearGradientmHitzGk((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2075linearGradientmHitzGk(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, long start, long end, int tileMode) {
            java.util.ArrayList arrayList = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair : colorStops) {
                arrayList.add(androidx.compose.ui.graphics.Color.m2103boximpl(pair.getSecond().m2123unboximpl()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair2 : colorStops) {
                arrayList3.add(java.lang.Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new androidx.compose.ui.graphics.LinearGradient(arrayList2, arrayList3, start, end, tileMode, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2064linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, long j, long j2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = androidx.compose.ui.geometry.Offset.INSTANCE.m1885getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2074linearGradientmHitzGk((java.util.List<androidx.compose.ui.graphics.Color>) list, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2074linearGradientmHitzGk(java.util.List<androidx.compose.ui.graphics.Color> colors, long start, long end, int tileMode) {
            return new androidx.compose.ui.graphics.LinearGradient(colors, null, start, end, tileMode, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2062horizontalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2072horizontalGradient8A3gB4((java.util.List<androidx.compose.ui.graphics.Color>) list, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2072horizontalGradient8A3gB4(java.util.List<androidx.compose.ui.graphics.Color> colors, float startX, float endX, int tileMode) {
            return m2074linearGradientmHitzGk(colors, androidx.compose.ui.geometry.OffsetKt.Offset(startX, 0.0f), androidx.compose.ui.geometry.OffsetKt.Offset(endX, 0.0f), tileMode);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2063horizontalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2073horizontalGradient8A3gB4((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2073horizontalGradient8A3gB4(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, float startX, float endX, int tileMode) {
            return m2075linearGradientmHitzGk((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) java.util.Arrays.copyOf(colorStops, colorStops.length), androidx.compose.ui.geometry.OffsetKt.Offset(startX, 0.0f), androidx.compose.ui.geometry.OffsetKt.Offset(endX, 0.0f), tileMode);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2070verticalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2080verticalGradient8A3gB4((java.util.List<androidx.compose.ui.graphics.Color>) list, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2080verticalGradient8A3gB4(java.util.List<androidx.compose.ui.graphics.Color> colors, float startY, float endY, int tileMode) {
            return m2074linearGradientmHitzGk(colors, androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, startY), androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, endY), tileMode);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2071verticalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2081verticalGradient8A3gB4((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2081verticalGradient8A3gB4(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, float startY, float endY, int tileMode) {
            return m2075linearGradientmHitzGk((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) java.util.Arrays.copyOf(colorStops, colorStops.length), androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, startY), androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, endY), tileMode);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2067radialGradientP_VxKs$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, long j, float f, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            float f2 = (i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2077radialGradientP_VxKs((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, j2, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2077radialGradientP_VxKs(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, long center, float radius, int tileMode) {
            java.util.ArrayList arrayList = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair : colorStops) {
                arrayList.add(androidx.compose.ui.graphics.Color.m2103boximpl(pair.getSecond().m2123unboximpl()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair2 : colorStops) {
                arrayList3.add(java.lang.Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new androidx.compose.ui.graphics.RadialGradient(arrayList2, arrayList3, center, radius, tileMode, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2066radialGradientP_VxKs$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, long j, float f, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            float f2 = (i2 & 4) != 0 ? Float.POSITIVE_INFINITY : f;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m2494getClamp3opZhB0();
            }
            return companion.m2076radialGradientP_VxKs((java.util.List<androidx.compose.ui.graphics.Color>) list, j2, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2076radialGradientP_VxKs(java.util.List<androidx.compose.ui.graphics.Color> colors, long center, float radius, int tileMode) {
            return new androidx.compose.ui.graphics.RadialGradient(colors, null, center, radius, tileMode, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2069sweepGradientUv8p0NA$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, long j, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            }
            return companion.m2079sweepGradientUv8p0NA((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, j);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2079sweepGradientUv8p0NA(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, long center) {
            java.util.ArrayList arrayList = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair : colorStops) {
                arrayList.add(androidx.compose.ui.graphics.Color.m2103boximpl(pair.getSecond().m2123unboximpl()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair2 : colorStops) {
                arrayList3.add(java.lang.Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new androidx.compose.ui.graphics.SweepGradient(center, arrayList2, arrayList3, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m2068sweepGradientUv8p0NA$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, long j, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            }
            return companion.m2078sweepGradientUv8p0NA((java.util.List<androidx.compose.ui.graphics.Color>) list, j);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m2078sweepGradientUv8p0NA(java.util.List<androidx.compose.ui.graphics.Color> colors, long center) {
            return new androidx.compose.ui.graphics.SweepGradient(center, colors, null, null);
        }
    }
}
