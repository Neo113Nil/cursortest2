package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\rJ-\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\r"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics;", "", "<init>", "()V", "Landroidx/compose/ui/layout/LayoutModifier;", "p0", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "p1", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "p2", "", "p3", "getHighSpeedVideoFpsRanges", "(Landroidx/compose/ui/layout/LayoutModifier;Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "DefaultIntrinsicMeasurable", "EmptyPlaceable", "IntrinsicMinMax", "IntrinsicWidthHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MeasuringIntrinsics {
    public static final androidx.compose.ui.layout.MeasuringIntrinsics INSTANCE = new androidx.compose.ui.layout.MeasuringIntrinsics();

    private MeasuringIntrinsics() {
    }

    public static int getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.LayoutModifier p0, androidx.compose.ui.layout.IntrinsicMeasureScope p1, androidx.compose.ui.layout.IntrinsicMeasurable p2, int p3) {
        return p0.mo2052measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(p1, p1.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(p2, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.getHighSpeedVideoFpsRanges, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.getHighSpeedVideoFpsRanges), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, p3, 7, null)).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public static int getHighSpeedVideoSizes(androidx.compose.ui.layout.LayoutModifier p0, androidx.compose.ui.layout.IntrinsicMeasureScope p1, androidx.compose.ui.layout.IntrinsicMeasurable p2, int p3) {
        return p0.mo2052measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(p1, p1.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(p2, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.getHighSpeedVideoFpsRanges, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.getHighSpeedVideoFpsRangesFor), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, p3, 0, 0, 13, null)).getGetHighSpeedVideoSizes();
    }

    public static int Camera2StreamConfigurationMap(androidx.compose.ui.layout.LayoutModifier p0, androidx.compose.ui.layout.IntrinsicMeasureScope p1, androidx.compose.ui.layout.IntrinsicMeasurable p2, int p3) {
        return p0.mo2052measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(p1, p1.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(p2, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Camera2StreamConfigurationMap, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.getHighSpeedVideoFpsRanges), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, 0, 0, p3, 7, null)).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    public static int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.LayoutModifier p0, androidx.compose.ui.layout.IntrinsicMeasureScope p1, androidx.compose.ui.layout.IntrinsicMeasurable p2, int p3) {
        return p0.mo2052measure3p2s80s(new androidx.compose.ui.layout.IntrinsicsMeasureScope(p1, p1.getLayoutDirection()), new androidx.compose.ui.layout.MeasuringIntrinsics.DefaultIntrinsicMeasurable(p2, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Camera2StreamConfigurationMap, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.getHighSpeedVideoFpsRangesFor), androidx.compose.ui.unit.ConstraintsKt.Constraints$default(0, p3, 0, 0, 13, null)).getGetHighSpeedVideoSizes();
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$DefaultIntrinsicMeasurable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "p0", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "p1", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "p2", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;)V", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/Placeable;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "measure", "", "minIntrinsicWidth", "(I)I", "maxIntrinsicWidth", "minIntrinsicHeight", "maxIntrinsicHeight", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "Camera2StreamConfigurationMap", "", "getParentData", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class DefaultIntrinsicMeasurable implements androidx.compose.ui.layout.Measurable {
        private final androidx.compose.ui.layout.IntrinsicMeasurable getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight Camera2StreamConfigurationMap;
        private final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax getHighSpeedVideoSizes;

        public DefaultIntrinsicMeasurable(androidx.compose.ui.layout.IntrinsicMeasurable intrinsicMeasurable, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax intrinsicMinMax, androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight intrinsicWidthHeight) {
            this.getHighSpeedVideoFpsRanges = intrinsicMeasurable;
            this.getHighSpeedVideoSizes = intrinsicMinMax;
            this.Camera2StreamConfigurationMap = intrinsicWidthHeight;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final java.lang.Object getParentData() {
            return this.getHighSpeedVideoFpsRanges.getParentData();
        }

        @Override // androidx.compose.ui.layout.Measurable
        /* renamed from: measure-BRTryo0 */
        public final androidx.compose.ui.layout.Placeable mo7353measureBRTryo0(long p0) {
            int minIntrinsicHeight;
            int minIntrinsicWidth;
            if (this.Camera2StreamConfigurationMap == androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.getHighSpeedVideoFpsRanges) {
                if (this.getHighSpeedVideoSizes == androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Camera2StreamConfigurationMap) {
                    minIntrinsicWidth = this.getHighSpeedVideoFpsRanges.maxIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(p0));
                } else {
                    minIntrinsicWidth = this.getHighSpeedVideoFpsRanges.minIntrinsicWidth(androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(p0));
                }
                return new androidx.compose.ui.layout.MeasuringIntrinsics.EmptyPlaceable(minIntrinsicWidth, androidx.compose.ui.unit.Constraints.m8549getHasBoundedHeightimpl(p0) ? androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(p0) : 32767);
            }
            if (this.getHighSpeedVideoSizes == androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.Camera2StreamConfigurationMap) {
                minIntrinsicHeight = this.getHighSpeedVideoFpsRanges.maxIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(p0));
            } else {
                minIntrinsicHeight = this.getHighSpeedVideoFpsRanges.minIntrinsicHeight(androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(p0));
            }
            return new androidx.compose.ui.layout.MeasuringIntrinsics.EmptyPlaceable(androidx.compose.ui.unit.Constraints.m8550getHasBoundedWidthimpl(p0) ? androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(p0) : 32767, minIntrinsicHeight);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicWidth(int p0) {
            return this.getHighSpeedVideoFpsRanges.minIntrinsicWidth(p0);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicWidth(int p0) {
            return this.getHighSpeedVideoFpsRanges.maxIntrinsicWidth(p0);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int minIntrinsicHeight(int p0) {
            return this.getHighSpeedVideoFpsRanges.minIntrinsicHeight(p0);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasurable
        public final int maxIntrinsicHeight(int p0) {
            return this.getHighSpeedVideoFpsRanges.maxIntrinsicHeight(p0);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ:\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000b2\u0019\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0002\b\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$EmptyPlaceable;", "Landroidx/compose/ui/layout/Placeable;", "", "p0", "p1", "<init>", "(II)V", "Landroidx/compose/ui/layout/AlignmentLine;", "get", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/unit/IntOffset;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "p2", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class EmptyPlaceable extends androidx.compose.ui.layout.Placeable {
        @Override // androidx.compose.ui.layout.Measured
        public final int get(androidx.compose.ui.layout.AlignmentLine p0) {
            return Integer.MIN_VALUE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.compose.ui.layout.Placeable
        /* renamed from: placeAt-f8xVGno */
        public final void mo7354placeAtf8xVGno(long p0, float p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> p2) {
        }

        public EmptyPlaceable(int i, int i2) {
            m7413setMeasuredSizeozmzZPI(androidx.compose.ui.unit.IntSize.m8767constructorimpl((i2 & 4294967295L) | (i << 32)));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicMinMax;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IntrinsicMinMax {
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
        private static final /* synthetic */ androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax[] getHighSpeedVideoSizes;
        public static final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax getHighSpeedVideoFpsRanges = new androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax("Min", 0);
        public static final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax Camera2StreamConfigurationMap = new androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax("Max", 1);

        private IntrinsicMinMax(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax[] highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            getHighSpeedVideoSizes = highResolutionOutputSizeshNQ4ISI;
            getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(highResolutionOutputSizeshNQ4ISI);
        }

        public static androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax[] values() {
            return (androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax[]) getHighSpeedVideoSizes.clone();
        }

        public static androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax valueOf(java.lang.String str) {
            return (androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax) java.lang.Enum.valueOf(androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax.class, str);
        }

        private static final /* synthetic */ androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax[] getHighResolutionOutputSizeshNQ4ISI() {
            return new androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicMinMax[]{getHighSpeedVideoFpsRanges, Camera2StreamConfigurationMap};
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/compose/ui/layout/MeasuringIntrinsics$IntrinsicWidthHeight;", "", "<init>", "(Ljava/lang/String;I)V", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IntrinsicWidthHeight {
        private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
        public static final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight getHighSpeedVideoFpsRanges = new androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight(com.google.common.net.HttpHeaders.WIDTH, 0);
        public static final androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight getHighSpeedVideoFpsRangesFor = new androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight(com.daon.dmds.recognizers.IDMDSResultCreatorFields.Height, 1);
        private static final /* synthetic */ androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight[] getHighSpeedVideoSizes;

        private IntrinsicWidthHeight(java.lang.String str, int i) {
        }

        static {
            androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight[] Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap();
            getHighSpeedVideoSizes = Camera2StreamConfigurationMap2;
            Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap2);
        }

        public static androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight[] values() {
            return (androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight[]) getHighSpeedVideoSizes.clone();
        }

        public static androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight valueOf(java.lang.String str) {
            return (androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight) java.lang.Enum.valueOf(androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight.class, str);
        }

        private static final /* synthetic */ androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight[] Camera2StreamConfigurationMap() {
            return new androidx.compose.ui.layout.MeasuringIntrinsics.IntrinsicWidthHeight[]{getHighSpeedVideoFpsRanges, getHighSpeedVideoFpsRangesFor};
        }
    }
}
