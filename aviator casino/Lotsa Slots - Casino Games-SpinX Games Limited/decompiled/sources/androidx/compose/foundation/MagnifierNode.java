package androidx.compose.foundation;

/* compiled from: Magnifier.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0099\u0001\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u0012\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\b\u0010J\u001a\u00020\u000fH\u0016J\b\u0010K\u001a\u00020\u000fH\u0016J\u0010\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020\u000fH\u0016J\b\u0010P\u001a\u00020\u000fH\u0002J\u0092\u0001\u0010Q\u001a\u00020\u000f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b2\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\b\u0010T\u001a\u00020\u000fH\u0002J\b\u0010U\u001a\u00020\u000fH\u0002J\f\u0010V\u001a\u00020\u000f*\u00020WH\u0016J\f\u0010X\u001a\u00020\u000f*\u00020YH\u0016R1\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010-\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u00020\u000eX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R+\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00103\"\u0004\bB\u00105R\u0016\u0010C\u001a\u00020\nX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010@R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "", "useTextDefault", "", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "anchorPositionInRoot", "getAnchorPositionInRoot-F1C5BW0", "()J", "setAnchorPositionInRoot-k-4lQ0M", "(J)V", "anchorPositionInRoot$delegate", "Landroidx/compose/runtime/MutableState;", "getClippingEnabled", "()Z", "setClippingEnabled", "(Z)V", "getCornerRadius-D9Ej5fM", "()F", "setCornerRadius-0680j_4", "(F)V", "F", "density", "getElevation-D9Ej5fM", "setElevation-0680j_4", "magnifier", "Landroidx/compose/foundation/PlatformMagnifier;", "getMagnifierCenter", "()Lkotlin/jvm/functions/Function1;", "setMagnifierCenter", "(Lkotlin/jvm/functions/Function1;)V", "getOnSizeChanged", "setOnSizeChanged", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "previousSize", "Landroidx/compose/ui/unit/IntSize;", "getSize-MYxV2XQ", "setSize-EaSLcWc", "J", "getSourceCenter", "setSourceCenter", "sourceCenterInRoot", "getUseTextDefault", "setUseTextDefault", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getZoom", "setZoom", "onAttach", "onDetach", "onGloballyPositioned", com.ironsource.Y3.f, "Landroidx/compose/ui/layout/LayoutCoordinates;", "onObservedReadsChanged", "recreateMagnifier", "update", "update-5F03MCQ", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "updateMagnifier", "updateSizeIfNecessary", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MagnifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.ObserverModifierNode {
    public static final int $stable = 8;

    /* renamed from: anchorPositionInRoot$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState anchorPositionInRoot;
    private boolean clippingEnabled;
    private float cornerRadius;
    private androidx.compose.ui.unit.Density density;
    private float elevation;
    private androidx.compose.foundation.PlatformMagnifier magnifier;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> magnifierCenter;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> onSizeChanged;
    private androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory;
    private androidx.compose.ui.unit.IntSize previousSize;
    private long size;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;
    private android.view.View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: getShouldClearDescendantSemantics */
    public /* synthetic */ boolean getIsClearingSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldClearDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return androidx.compose.ui.node.SemanticsModifierNode.CC.$default$getShouldMergeDescendantSemantics(this);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        androidx.compose.ui.node.DrawModifierNode.CC.$default$onMeasureResultChanged(this);
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> getSourceCenter() {
        return this.sourceCenter;
    }

    public final void setSourceCenter(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1) {
        this.sourceCenter = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> getMagnifierCenter() {
        return this.magnifierCenter;
    }

    public final void setMagnifierCenter(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1) {
        this.magnifierCenter = function1;
    }

    public final kotlin.jvm.functions.Function1<androidx.compose.ui.unit.DpSize, kotlin.Unit> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public final void setOnSizeChanged(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> function1) {
        this.onSizeChanged = function1;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final void setUseTextDefault(boolean z) {
        this.useTextDefault = z;
    }

    public /* synthetic */ MagnifierNode(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? androidx.compose.ui.unit.DpSize.INSTANCE.m4585getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f2, (i & 128) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM() : f3, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? androidx.compose.foundation.PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m277setSizeEaSLcWc(long j) {
        this.size = j;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m275setCornerRadius0680j_4(float f) {
        this.cornerRadius = f;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m276setElevation0680j_4(float f) {
        this.elevation = f;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final void setClippingEnabled(boolean z) {
        this.clippingEnabled = z;
    }

    public final androidx.compose.foundation.PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    public final void setPlatformMagnifierFactory(androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    private MagnifierNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function12, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
        this.anchorPositionInRoot = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(androidx.compose.ui.geometry.Offset.m1860boximpl(androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0()), null, 2, null);
        this.sourceCenterInRoot = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnchorPositionInRoot-F1C5BW0, reason: not valid java name */
    private final long m270getAnchorPositionInRootF1C5BW0() {
        return ((androidx.compose.ui.geometry.Offset) this.anchorPositionInRoot.getValue()).getPackedValue();
    }

    /* renamed from: setAnchorPositionInRoot-k-4lQ0M, reason: not valid java name */
    private final void m271setAnchorPositionInRootk4lQ0M(long j) {
        this.anchorPositionInRoot.setValue(androidx.compose.ui.geometry.Offset.m1860boximpl(j));
    }

    /* renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m278update5F03MCQ(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> sourceCenter, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> onSizeChanged, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory) {
        float f = this.zoom;
        long j = this.size;
        float f2 = this.cornerRadius;
        float f3 = this.elevation;
        boolean z = this.clippingEnabled;
        androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        if (this.magnifier == null || ((zoom != f && !platformMagnifierFactory.getCanUpdateZoom()) || !androidx.compose.ui.unit.DpSize.m4573equalsimpl0(size, j) || !androidx.compose.ui.unit.Dp.m4483equalsimpl0(cornerRadius, f2) || !androidx.compose.ui.unit.Dp.m4483equalsimpl0(elevation, f3) || clippingEnabled != z || !kotlin.jvm.internal.Intrinsics.areEqual(platformMagnifierFactory, platformMagnifierFactory2))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        androidx.compose.foundation.PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                invoke2();
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                android.view.View view;
                androidx.compose.ui.unit.Density density;
                androidx.compose.foundation.PlatformMagnifier platformMagnifier;
                view = androidx.compose.foundation.MagnifierNode.this.view;
                android.view.View view2 = (android.view.View) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.foundation.MagnifierNode.this, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
                androidx.compose.foundation.MagnifierNode.this.view = view2;
                density = androidx.compose.foundation.MagnifierNode.this.density;
                androidx.compose.ui.unit.Density density2 = (androidx.compose.ui.unit.Density) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.foundation.MagnifierNode.this, androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity());
                androidx.compose.foundation.MagnifierNode.this.density = density2;
                platformMagnifier = androidx.compose.foundation.MagnifierNode.this.magnifier;
                if (platformMagnifier == null || !kotlin.jvm.internal.Intrinsics.areEqual(view2, view) || !kotlin.jvm.internal.Intrinsics.areEqual(density2, density)) {
                    androidx.compose.foundation.MagnifierNode.this.recreateMagnifier();
                }
                androidx.compose.foundation.MagnifierNode.this.updateMagnifier();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recreateMagnifier() {
        androidx.compose.ui.unit.Density density;
        androidx.compose.foundation.PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        android.view.View view = this.view;
        if (view == null || (density = this.density) == null) {
            return;
        }
        this.magnifier = this.platformMagnifierFactory.mo305createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMagnifier() {
        androidx.compose.ui.unit.Density density;
        long m1886getUnspecifiedF1C5BW0;
        long m1886getUnspecifiedF1C5BW02;
        androidx.compose.foundation.PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null) {
            return;
        }
        long packedValue = this.sourceCenter.invoke(density).getPackedValue();
        if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(m270getAnchorPositionInRootF1C5BW0()) && androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(packedValue)) {
            m1886getUnspecifiedF1C5BW0 = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m270getAnchorPositionInRootF1C5BW0(), packedValue);
        } else {
            m1886getUnspecifiedF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
        }
        this.sourceCenterInRoot = m1886getUnspecifiedF1C5BW0;
        if (androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(m1886getUnspecifiedF1C5BW0)) {
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1 = this.magnifierCenter;
            if (function1 != null) {
                androidx.compose.ui.geometry.Offset m1860boximpl = androidx.compose.ui.geometry.Offset.m1860boximpl(function1.invoke(density).getPackedValue());
                if (!androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(m1860boximpl.getPackedValue())) {
                    m1860boximpl = null;
                }
                if (m1860boximpl != null) {
                    m1886getUnspecifiedF1C5BW02 = androidx.compose.ui.geometry.Offset.m1876plusMKHz9U(m270getAnchorPositionInRootF1C5BW0(), m1860boximpl.getPackedValue());
                    platformMagnifier.mo304updateWko1d7g(this.sourceCenterInRoot, m1886getUnspecifiedF1C5BW02, this.zoom);
                    updateSizeIfNecessary();
                    return;
                }
            }
            m1886getUnspecifiedF1C5BW02 = androidx.compose.ui.geometry.Offset.INSTANCE.m1886getUnspecifiedF1C5BW0();
            platformMagnifier.mo304updateWko1d7g(this.sourceCenterInRoot, m1886getUnspecifiedF1C5BW02, this.zoom);
            updateSizeIfNecessary();
            return;
        }
        platformMagnifier.dismiss();
    }

    private final void updateSizeIfNecessary() {
        androidx.compose.ui.unit.Density density;
        androidx.compose.foundation.PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || androidx.compose.ui.unit.IntSize.m4649equalsimpl(platformMagnifier.mo303getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(androidx.compose.ui.unit.DpSize.m4564boximpl(density.mo313toDpSizekrfVVM(androidx.compose.ui.unit.IntSizeKt.m4662toSizeozmzZPI(platformMagnifier.mo303getSizeYbymL2g()))));
        }
        this.previousSize = androidx.compose.ui.unit.IntSize.m4644boximpl(platformMagnifier.mo303getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.foundation.MagnifierNode$draw$1(this, null), 3, null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        m271setAnchorPositionInRootk4lQ0M(androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(coordinates));
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.foundation.Magnifier_androidKt.getMagnifierPositionInRoot(), new kotlin.jvm.functions.Function0<androidx.compose.ui.geometry.Offset>() { // from class: androidx.compose.foundation.MagnifierNode$applySemantics$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ androidx.compose.ui.geometry.Offset invoke() {
                return androidx.compose.ui.geometry.Offset.m1860boximpl(m279invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0, reason: not valid java name */
            public final long m279invokeF1C5BW0() {
                long j;
                j = androidx.compose.foundation.MagnifierNode.this.sourceCenterInRoot;
                return j;
            }
        });
    }
}
