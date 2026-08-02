package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J:\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\fH$¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014¢\u0006\u0004\b\u000e\u0010\u0013R$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00148WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0019R*\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020 8\u0005@EX\u0085\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010)\u001a\u00020(2\u0006\u0010!\u001a\u00020(8\u0005@EX\u0085\u000e¢\u0006\u0012\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%\"\u0004\b+\u0010'R$\u0010,\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "<init>", "()V", "", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/unit/IntOffset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "placeAt", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "p0", "width", com.visa.cbp.getEncExpo.warmup, "getWidth", "()I", "height", "getHeight", "getMeasuredWidth", "measuredWidth", "getMeasuredHeight", "measuredHeight", "Landroidx/compose/ui/unit/IntSize;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "measuredSize", "J", "getMeasuredSize-YbymL2g", "()J", "setMeasuredSize-ozmzZPI", "(J)V", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "PlacementScope"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Placeable implements androidx.compose.ui.layout.Measured {
    public static final int $stable = 8;
    private long apparentToRealOffset;
    private int height;
    private long measuredSize = androidx.compose.ui.unit.IntSize.m8767constructorimpl(0);
    private long measurementConstraints;
    private int width;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo7354placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock);

    public Placeable() {
        long j;
        j = androidx.compose.ui.layout.PlaceableKt.getHighResolutionOutputSizeshNQ4ISI;
        this.measurementConstraints = j;
        this.apparentToRealOffset = androidx.compose.ui.unit.IntOffset.INSTANCE.m8740getZeronOccac();
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return (int) (this.measuredSize >> 32);
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    protected final void m7413setMeasuredSizeozmzZPI(long j) {
        if (androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    private final void getHighResolutionOutputSizeshNQ4ISI() {
        this.width = kotlin.ranges.RangesKt.coerceIn((int) (this.measuredSize >> 32), androidx.compose.ui.unit.Constraints.m8556getMinWidthimpl(this.measurementConstraints), androidx.compose.ui.unit.Constraints.m8554getMaxWidthimpl(this.measurementConstraints));
        this.height = kotlin.ranges.RangesKt.coerceIn((int) (this.measuredSize & 4294967295L), androidx.compose.ui.unit.Constraints.m8555getMinHeightimpl(this.measurementConstraints), androidx.compose.ui.unit.Constraints.m8553getMaxHeightimpl(this.measurementConstraints));
        int i = this.width;
        long j = this.measuredSize;
        this.apparentToRealOffset = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((((r0 - ((int) (j & 4294967295L))) / 2) & 4294967295L) | (((i - ((int) (j >> 32))) / 2) << 32));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo7412placeAtf8xVGno(long position, float zIndex, androidx.compose.ui.graphics.layer.GraphicsLayer layer) {
        mo7354placeAtf8xVGno(position, zIndex, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m7414setMeasurementConstraintsBRTryo0(long j) {
        if (androidx.compose.ui.unit.Constraints.m8548equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        getHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    @kotlin.Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0010\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0010\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0014J+\u0010\u0015\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0014J#\u0010\u0015\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u000fJ>\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b\u001f\u0010\u001eJ>\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00052\u0019\b\u0002\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b \u0010\u001cJ3\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010#J+\u0010\u001f\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b \u0010$J3\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010#J+\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010$JA\u0010&\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u001b\b\b\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017¢\u0006\u0002\b\u0019H\u0080\b¢\u0006\u0004\b%\u0010\u001cJ,\u0010&\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0080\b¢\u0006\u0004\b%\u0010'JA\u0010)\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u001b\b\b\u0010\u001a\u001a\u0015\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0018\u00010\u0017¢\u0006\u0002\b\u0019H\u0080\b¢\u0006\u0004\b(\u0010\u001cJ,\u0010)\u001a\u00020\r*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020!H\u0080\b¢\u0006\u0004\b(\u0010'J&\u0010+\u001a\u00020\r2\u0017\u0010*\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0004\b+\u0010,J\u0013\u0010-\u001a\u00020\r*\u00020\tH\u0002¢\u0006\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00103\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00100R\u0014\u00106\u001a\u00020\u00118%X¤\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078%X¤\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0016\u0010>\u001a\u0004\u0018\u00010;8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010A"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "", "defaultValue", "current", "(Landroidx/compose/ui/layout/Ruler;F)F", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/unit/IntOffset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "zIndex", "", "placeRelative-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "placeRelative", "", "x", "y", "(Landroidx/compose/ui/layout/Placeable;IIF)V", "place", "place-70tqf50", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeRelativeWithLayer", "(Landroidx/compose/ui/layout/Placeable;IIFLkotlin/jvm/functions/Function1;)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(Landroidx/compose/ui/layout/Placeable;IILandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeAutoMirrored-aW-9-wM$ui", "placeAutoMirrored", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeApparentToRealOffset-aW-9-wM$ui", "placeApparentToRealOffset", "block", "withMotionFrameOfReferencePlacement", "(Lkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/layout/Placeable;)V", "getDensity", "()F", "density", "getFontScale", "fontScale", "getParentWidth", "()I", "parentWidth", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentLayoutDirection", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "getHighSpeedVideoFpsRanges", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @androidx.compose.ui.layout.PlacementScopeMarker
    public static abstract class PlacementScope implements androidx.compose.ui.unit.Density {
        public static final int $stable = 0;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        public float current(androidx.compose.ui.layout.Ruler ruler, float f) {
            return f;
        }

        public androidx.compose.ui.layout.LayoutCoordinates getCoordinates() {
            return null;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: getDensity */
        public float getGetHighResolutionOutputSizeshNQ4ISI() {
            return 1.0f;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: getFontScale */
        public float getCamera2StreamConfigurationMap() {
            return 1.0f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract androidx.compose.ui.unit.LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m7416placeRelative70tqf50$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m7426placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        public static /* synthetic */ void place$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m7415place70tqf50$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m7421place70tqf50(placeable, j, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m7417placeRelativeWithLayeraW9wM$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.Camera2StreamConfigurationMap;
            }
            placementScope.m7427placeRelativeWithLayeraW9wM(placeable, j, f2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) function1);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.Camera2StreamConfigurationMap;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) function1);
        }

        public static /* synthetic */ void placeWithLayer$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.Camera2StreamConfigurationMap;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m7419placeWithLayeraW9wM$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.Camera2StreamConfigurationMap;
            }
            placementScope.m7429placeWithLayeraW9wM(placeable, j, f2, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) function1);
        }

        public static /* synthetic */ void placeWithLayer$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m7420placeWithLayeraW9wM$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m7430placeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 8) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, graphicsLayer, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m7418placeRelativeWithLayeraW9wM$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            placementScope.m7428placeRelativeWithLayeraW9wM(placeable, j, graphicsLayer, f);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m7425placeAutoMirroredaW9wM$ui(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) & 4294967295L) | (((parentWidth - width) - androidx.compose.ui.unit.IntOffset.m8729getXimpl(j)) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui, reason: not valid java name */
        public final void m7424placeAutoMirroredaW9wM$ui(androidx.compose.ui.layout.Placeable placeable, long j, float f, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) & 4294967295L) | (((parentWidth - width) - androidx.compose.ui.unit.IntOffset.m8729getXimpl(j)) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m7423placeApparentToRealOffsetaW9wM$ui(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui, reason: not valid java name */
        public final void m7422placeApparentToRealOffsetaW9wM$ui(androidx.compose.ui.layout.Placeable placeable, long j, float f, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer) {
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        public final void withMotionFrameOfReferencePlacement(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.Placeable.PlacementScope, kotlin.Unit> block) {
            this.getHighSpeedVideoFpsRangesFor = true;
            block.invoke(this);
            this.getHighSpeedVideoFpsRangesFor = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.layout.Placeable placeable) {
            if (placeable instanceof androidx.compose.ui.node.MotionReferencePlacementDelegate) {
                ((androidx.compose.ui.node.MotionReferencePlacementDelegate) placeable).updatePlacedUnderMotionFrameOfReference(this.getHighSpeedVideoFpsRangesFor);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m7426placeRelative70tqf50(androidx.compose.ui.layout.Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) & 4294967295L) | (((parentWidth - width) - androidx.compose.ui.unit.IntOffset.m8729getXimpl(j)) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
        }

        public final void placeRelative(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f) {
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8723constructorimpl);
            long m8723constructorimpl2 = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8723constructorimpl) & 4294967295L) | (((parentWidth - width) - m8729getXimpl) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl2, placeable.apparentToRealOffset), f, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
        }

        public final void place(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f) {
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m7421place70tqf50(androidx.compose.ui.layout.Placeable placeable, long j, float f) {
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, (kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit>) null);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m7427placeRelativeWithLayeraW9wM(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) & 4294967295L) | (((parentWidth - width) - androidx.compose.ui.unit.IntOffset.m8729getXimpl(j)) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        public final void placeRelativeWithLayer(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, function1);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8723constructorimpl);
            long m8723constructorimpl2 = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8723constructorimpl) & 4294967295L) | (((parentWidth - width) - m8729getXimpl) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl2, placeable.apparentToRealOffset), f, function1);
        }

        public final void placeWithLayer(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m7429placeWithLayeraW9wM(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7354placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, function1);
        }

        public final void placeWithLayer(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f) {
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m7430placeWithLayeraW9wM(androidx.compose.ui.layout.Placeable placeable, long j, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f) {
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        public final void placeRelativeWithLayer(androidx.compose.ui.layout.Placeable placeable, int i, int i2, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f) {
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((i2 & 4294967295L) | (i << 32));
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8723constructorimpl);
            long m8723constructorimpl2 = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8723constructorimpl) & 4294967295L) | (((parentWidth - width) - m8729getXimpl) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl2, placeable.apparentToRealOffset), f, graphicsLayer);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m7428placeRelativeWithLayeraW9wM(androidx.compose.ui.layout.Placeable placeable, long j, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, float f) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                getHighResolutionOutputSizeshNQ4ISI(placeable);
                placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(j, placeable.apparentToRealOffset), f, graphicsLayer);
                return;
            }
            int parentWidth = getParentWidth();
            int width = placeable.getWidth();
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl((androidx.compose.ui.unit.IntOffset.m8730getYimpl(j) & 4294967295L) | (((parentWidth - width) - androidx.compose.ui.unit.IntOffset.m8729getXimpl(j)) << 32));
            getHighResolutionOutputSizeshNQ4ISI(placeable);
            placeable.mo7412placeAtf8xVGno(androidx.compose.ui.unit.IntOffset.m8733plusqkQi6aY(m8723constructorimpl, placeable.apparentToRealOffset), f, graphicsLayer);
        }
    }
}
