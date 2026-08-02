package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\u0002\u0013\u0014"}, d2 = {"Landroidx/compose/ui/graphics/Brush;", "", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/graphics/Paint;", "p", "", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "applyTo", "intrinsicSize", "J", "getIntrinsicSize-NH-jbRc", "()J", "Companion", "Landroidx/compose/ui/graphics/ShaderBrush;", "Landroidx/compose/ui/graphics/SolidColor;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Brush {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.Brush.Companion INSTANCE = new androidx.compose.ui.graphics.Brush.Companion(null);
    private final long intrinsicSize;

    /* renamed from: applyTo-Pq9zytI, reason: not valid java name */
    public abstract void mo5941applyToPq9zytI(long size, androidx.compose.ui.graphics.Paint p, float alpha);

    private Brush() {
        this.intrinsicSize = androidx.compose.ui.geometry.Size.INSTANCE.m5829getUnspecifiedNHjbRc();
    }

    /* renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name and from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0011\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0014J9\u0010\u0019\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018JW\u0010\u0019\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u001aJ9\u0010\u001e\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u0018JW\u0010\u001e\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001aJW\u0010#\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J9\u0010#\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010$JC\u0010'\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b%\u0010(J%\u0010/\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010."}, d2 = {"Landroidx/compose/ui/graphics/Brush$Companion;", "", "<init>", "()V", "", "Lkotlin/Pair;", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "Landroidx/compose/ui/geometry/Offset;", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroidx/compose/ui/graphics/Brush;", "linearGradient-mHitzGk", "([Lkotlin/Pair;JJI)Landroidx/compose/ui/graphics/Brush;", "linearGradient", "", "colors", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/Brush;", "startX", "endX", "horizontalGradient-8A-3gB4", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/Brush;", "horizontalGradient", "([Lkotlin/Pair;FFI)Landroidx/compose/ui/graphics/Brush;", "startY", "endY", "verticalGradient-8A-3gB4", "verticalGradient", com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER, "radius", "radialGradient-P_Vx-Ks", "([Lkotlin/Pair;JFI)Landroidx/compose/ui/graphics/Brush;", "radialGradient", "(Ljava/util/List;JFI)Landroidx/compose/ui/graphics/Brush;", "sweepGradient-Uv8p0NA", "([Lkotlin/Pair;J)Landroidx/compose/ui/graphics/Brush;", "sweepGradient", "(Ljava/util/List;J)Landroidx/compose/ui/graphics/Brush;", "dstBrush", "srcBrush", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "composite-7EN7VTw", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;I)Landroidx/compose/ui/graphics/Brush;", "composite"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5946linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, long j, long j2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = androidx.compose.ui.geometry.Offset.INSTANCE.m5766getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5957linearGradientmHitzGk((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5957linearGradientmHitzGk(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, long start, long end, int tileMode) {
            java.util.ArrayList arrayList = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair : colorStops) {
                arrayList.add(androidx.compose.ui.graphics.Color.m5986boximpl(pair.getSecond().m6006unboximpl()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair2 : colorStops) {
                arrayList3.add(java.lang.Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new androidx.compose.ui.graphics.LinearGradient(arrayList2, arrayList3, start, end, tileMode, null);
        }

        /* renamed from: linearGradient-mHitzGk$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5945linearGradientmHitzGk$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, long j, long j2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
            }
            long j3 = j;
            if ((i2 & 4) != 0) {
                j2 = androidx.compose.ui.geometry.Offset.INSTANCE.m5766getInfiniteF1C5BW0();
            }
            long j4 = j2;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5956linearGradientmHitzGk((java.util.List<androidx.compose.ui.graphics.Color>) list, j3, j4, i);
        }

        /* renamed from: linearGradient-mHitzGk, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5956linearGradientmHitzGk(java.util.List<androidx.compose.ui.graphics.Color> colors, long start, long end, int tileMode) {
            return new androidx.compose.ui.graphics.LinearGradient(colors, null, start, end, tileMode, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5943horizontalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5954horizontalGradient8A3gB4((java.util.List<androidx.compose.ui.graphics.Color>) list, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5944horizontalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5955horizontalGradient8A3gB4((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, f, f2, i);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5955horizontalGradient8A3gB4(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, float startX, float endX, int tileMode) {
            return m5957linearGradientmHitzGk((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) java.util.Arrays.copyOf(colorStops, colorStops.length), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(startX) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(endX) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), tileMode);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5951verticalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5962verticalGradient8A3gB4((java.util.List<androidx.compose.ui.graphics.Color>) list, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5952verticalGradient8A3gB4$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, float f, float f2, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            if ((i2 & 4) != 0) {
                f2 = Float.POSITIVE_INFINITY;
            }
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5963verticalGradient8A3gB4((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, f, f2, i);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5963verticalGradient8A3gB4(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, float startY, float endY, int tileMode) {
            return m5957linearGradientmHitzGk((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) java.util.Arrays.copyOf(colorStops, colorStops.length), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(startY) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(endY) & 4294967295L)), tileMode);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5948radialGradientP_VxKs$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, long j, float f, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5959radialGradientP_VxKs((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, j2, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5959radialGradientP_VxKs(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, long center, float radius, int tileMode) {
            java.util.ArrayList arrayList = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair : colorStops) {
                arrayList.add(androidx.compose.ui.graphics.Color.m5986boximpl(pair.getSecond().m6006unboximpl()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair2 : colorStops) {
                arrayList3.add(java.lang.Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new androidx.compose.ui.graphics.RadialGradient(arrayList2, arrayList3, center, radius, tileMode, null);
        }

        /* renamed from: radialGradient-P_Vx-Ks$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5947radialGradientP_VxKs$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, long j, float f, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            }
            long j2 = j;
            if ((i2 & 4) != 0) {
                f = Float.POSITIVE_INFINITY;
            }
            float f2 = f;
            if ((i2 & 8) != 0) {
                i = androidx.compose.ui.graphics.TileMode.INSTANCE.m6361getClamp3opZhB0();
            }
            return companion.m5958radialGradientP_VxKs((java.util.List<androidx.compose.ui.graphics.Color>) list, j2, f2, i);
        }

        /* renamed from: radialGradient-P_Vx-Ks, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5958radialGradientP_VxKs(java.util.List<androidx.compose.ui.graphics.Color> colors, long center, float radius, int tileMode) {
            return new androidx.compose.ui.graphics.RadialGradient(colors, null, center, radius, tileMode, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5950sweepGradientUv8p0NA$default(androidx.compose.ui.graphics.Brush.Companion companion, kotlin.Pair[] pairArr, long j, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            }
            return companion.m5961sweepGradientUv8p0NA((kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[]) pairArr, j);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5961sweepGradientUv8p0NA(kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color>[] colorStops, long center) {
            java.util.ArrayList arrayList = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair : colorStops) {
                arrayList.add(androidx.compose.ui.graphics.Color.m5986boximpl(pair.getSecond().m6006unboximpl()));
            }
            java.util.ArrayList arrayList2 = arrayList;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(colorStops.length);
            for (kotlin.Pair<java.lang.Float, androidx.compose.ui.graphics.Color> pair2 : colorStops) {
                arrayList3.add(java.lang.Float.valueOf(pair2.getFirst().floatValue()));
            }
            return new androidx.compose.ui.graphics.SweepGradient(center, arrayList2, arrayList3, null);
        }

        /* renamed from: sweepGradient-Uv8p0NA$default, reason: not valid java name */
        public static /* synthetic */ androidx.compose.ui.graphics.Brush m5949sweepGradientUv8p0NA$default(androidx.compose.ui.graphics.Brush.Companion companion, java.util.List list, long j, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                j = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            }
            return companion.m5960sweepGradientUv8p0NA((java.util.List<androidx.compose.ui.graphics.Color>) list, j);
        }

        /* renamed from: sweepGradient-Uv8p0NA, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5960sweepGradientUv8p0NA(java.util.List<androidx.compose.ui.graphics.Color> colors, long center) {
            return new androidx.compose.ui.graphics.SweepGradient(center, colors, null, null);
        }

        /* renamed from: composite-7EN7VTw, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5953composite7EN7VTw(androidx.compose.ui.graphics.Brush dstBrush, androidx.compose.ui.graphics.Brush srcBrush, int blendMode) {
            return new androidx.compose.ui.graphics.CompositeShaderBrush(androidx.compose.ui.graphics.BrushKt.toShaderBrush(dstBrush), androidx.compose.ui.graphics.BrushKt.toShaderBrush(srcBrush), blendMode, null);
        }

        /* renamed from: horizontalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5954horizontalGradient8A3gB4(java.util.List<androidx.compose.ui.graphics.Color> colors, float startX, float endX, int tileMode) {
            return m5956linearGradientmHitzGk(colors, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(startX) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(endX) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L)), tileMode);
        }

        /* renamed from: verticalGradient-8A-3gB4, reason: not valid java name */
        public final androidx.compose.ui.graphics.Brush m5962verticalGradient8A3gB4(java.util.List<androidx.compose.ui.graphics.Color> colors, float startY, float endY, int tileMode) {
            return m5956linearGradientmHitzGk(colors, androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(startY) & 4294967295L)), androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(endY) & 4294967295L)), tileMode);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Brush(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
