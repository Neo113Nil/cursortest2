package androidx.compose.ui.layout;

/* compiled from: Placeable.kt */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e\u0018\u00010$¢\u0006\u0002\b&H$ø\u0001\u0000¢\u0006\u0004\b'\u0010(R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0017@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "()J", "J", "", "height", "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "width", "getWidth", "onMeasuredSizeChanged", "", "placeAt", "position", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Placeable implements androidx.compose.ui.layout.Measured {
    public static final int $stable = 8;
    private long apparentToRealOffset;
    private int height;
    private long measuredSize = androidx.compose.ui.unit.IntSizeKt.IntSize(0, 0);
    private long measurementConstraints;
    private int width;

    @Override // androidx.compose.ui.layout.Measured, androidx.compose.ui.layout.IntrinsicMeasurable
    public /* synthetic */ java.lang.Object getParentData() {
        return androidx.compose.ui.layout.Measured.CC.$default$getParentData(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: placeAt-f8xVGno */
    public abstract void mo3403placeAtf8xVGno(long position, float zIndex, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> layerBlock);

    public Placeable() {
        long j;
        j = androidx.compose.ui.layout.PlaceableKt.DefaultConstraints;
        this.measurementConstraints = j;
        this.apparentToRealOffset = androidx.compose.ui.unit.IntOffset.INSTANCE.m4620getZeronOccac();
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return androidx.compose.ui.unit.IntSize.m4652getWidthimpl(this.measuredSize);
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return androidx.compose.ui.unit.IntSize.m4651getHeightimpl(this.measuredSize);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    protected final void m3454setMeasuredSizeozmzZPI(long j) {
        if (androidx.compose.ui.unit.IntSize.m4650equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    private final void onMeasuredSizeChanged() {
        this.width = kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.IntSize.m4652getWidthimpl(this.measuredSize), androidx.compose.ui.unit.Constraints.m4426getMinWidthimpl(this.measurementConstraints), androidx.compose.ui.unit.Constraints.m4424getMaxWidthimpl(this.measurementConstraints));
        this.height = kotlin.ranges.RangesKt.coerceIn(androidx.compose.ui.unit.IntSize.m4651getHeightimpl(this.measuredSize), androidx.compose.ui.unit.Constraints.m4425getMinHeightimpl(this.measurementConstraints), androidx.compose.ui.unit.Constraints.m4423getMaxHeightimpl(this.measurementConstraints));
        this.apparentToRealOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset((this.width - androidx.compose.ui.unit.IntSize.m4652getWidthimpl(this.measuredSize)) / 2, (this.height - androidx.compose.ui.unit.IntSize.m4651getHeightimpl(this.measuredSize)) / 2);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m3455setMeasurementConstraintsBRTryo0(long j) {
        if (androidx.compose.ui.unit.Constraints.m4417equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    /* compiled from: Placeable.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JD\u0010\u001a\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JD\u0010!\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\"\u0010 J&\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0017J$\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JA\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000¢\u0006\u0004\b&\u0010 J?\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eJA\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000¢\u0006\u0004\b(\u0010 J?\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "place", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "placeWithLayer", "placeWithLayer-aW-9-wM", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        public androidx.compose.ui.layout.LayoutCoordinates getCoordinates() {
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract androidx.compose.ui.unit.LayoutDirection getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        public abstract int getParentWidth();

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3457placeRelative70tqf50$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m3463placeRelative70tqf50(placeable, j, f);
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

        public final void placeRelative(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f) {
            long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j)), f, null);
            } else {
                long IntOffset2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset));
                long j2 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset2) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset2) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, null);
            }
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

        public final void place(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f) {
            long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i, i2);
            long j = placeable.apparentToRealOffset;
            placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j)), f, null);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m3456place70tqf50$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m3460place70tqf50(placeable, j, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3458placeRelativeWithLayeraW9wM$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            float f2 = (i & 2) != 0 ? 0.0f : f;
            if ((i & 4) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3464placeRelativeWithLayeraW9wM(placeable, j, f2, function1);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            float f2 = (i3 & 4) != 0 ? 0.0f : f;
            if ((i3 & 8) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function1);
        }

        public final void placeRelativeWithLayer(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j)), f, function1);
            } else {
                long IntOffset2 = androidx.compose.ui.unit.IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset));
                long j2 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset2) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset2) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, function1);
            }
        }

        public static /* synthetic */ void placeWithLayer$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1 function1, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            float f2 = (i3 & 4) != 0 ? 0.0f : f;
            if ((i3 & 8) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, function1);
        }

        public final void placeWithLayer(androidx.compose.ui.layout.Placeable placeable, int i, int i2, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(i, i2);
            long j = placeable.apparentToRealOffset;
            placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j)), f, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m3459placeWithLayeraW9wM$default(androidx.compose.ui.layout.Placeable.PlacementScope placementScope, androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            float f2 = (i & 2) != 0 ? 0.0f : f;
            if ((i & 4) != 0) {
                function1 = androidx.compose.ui.layout.PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m3465placeWithLayeraW9wM(placeable, j, f2, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3462placeAutoMirroredaW9wM$ui_release(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, function1);
            } else {
                long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j));
                long j3 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j3), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j3)), f, function1);
            }
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m3461placeApparentToRealOffsetaW9wM$ui_release(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, function1);
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m3463placeRelative70tqf50(androidx.compose.ui.layout.Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, null);
            } else {
                long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j));
                long j3 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j3), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j3)), f, null);
            }
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m3460place70tqf50(androidx.compose.ui.layout.Placeable placeable, long j, float f) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, null);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3464placeRelativeWithLayeraW9wM(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            if (getParentLayoutDirection() == androidx.compose.ui.unit.LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, function1);
            } else {
                long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - androidx.compose.ui.unit.IntOffset.m4610getXimpl(j), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j));
                long j3 = placeable.apparentToRealOffset;
                placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j3), androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j3)), f, function1);
            }
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m3465placeWithLayeraW9wM(androidx.compose.ui.layout.Placeable placeable, long j, float f, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.GraphicsLayerScope, kotlin.Unit> function1) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo3403placeAtf8xVGno(androidx.compose.ui.unit.IntOffsetKt.IntOffset(androidx.compose.ui.unit.IntOffset.m4610getXimpl(j) + androidx.compose.ui.unit.IntOffset.m4610getXimpl(j2), androidx.compose.ui.unit.IntOffset.m4611getYimpl(j) + androidx.compose.ui.unit.IntOffset.m4611getYimpl(j2)), f, function1);
        }
    }
}
