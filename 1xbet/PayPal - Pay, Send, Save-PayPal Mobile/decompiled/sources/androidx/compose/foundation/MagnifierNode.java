package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u009b\u0001\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001b\b\u0002\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u008f\u0001\u0010\u001e\u001a\u00020\r2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t2\u0019\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\rH\u0002¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b%\u0010 J\u0013\u0010'\u001a\u00020\r*\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0013\u0010.\u001a\u00020\r*\u00020-H\u0016¢\u0006\u0004\b.\u0010/R3\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R5\u0010\u000b\u001a\u0015\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0002\b\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u00100\u001a\u0004\b5\u00102\"\u0004\b6\u00104R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u00068\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u00100\u001a\u0004\b7\u00102\"\u0004\b8\u00104R\"\u0010\u0010\u001a\u00020\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0012\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010\u0013\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010\u0015\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u00109\u001a\u0004\bH\u0010;\"\u0004\bI\u0010=R\"\u0010\u0016\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u00109\u001a\u0004\bJ\u0010;\"\u0004\bK\u0010=R\"\u0010\u0017\u001a\u00020\u00118\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010>\u001a\u0004\bL\u0010@\"\u0004\bM\u0010BR\"\u0010\u0019\u001a\u00020\u00188\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010#\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b%\u0010WR\u0018\u0010$\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bV\u0010YR/\u0010\\\u001a\u0004\u0018\u00010)2\b\u0010Z\u001a\u0004\u0018\u00010)8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b$\u0010,R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010^8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b$\u0010_R\u0014\u0010`\u001a\u00020\b8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010ER\u0016\u0010T\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010CR\u0018\u0010d\u001a\u0004\u0018\u00010a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\\\u0010f"}, d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "sourceCenter", "magnifierCenter", "Landroidx/compose/ui/unit/DpSize;", "", "onSizeChanged", "", "zoom", "", "useTextDefault", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "platformMagnifierFactory", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "update-5F03MCQ", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "update", "onAttach", "()V", "onDetach", "onObservedReadsChanged", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Lkotlin/jvm/functions/Function1;", "getSourceCenter", "()Lkotlin/jvm/functions/Function1;", "setSourceCenter", "(Lkotlin/jvm/functions/Function1;)V", "getMagnifierCenter", "setMagnifierCenter", "getOnSizeChanged", "setOnSizeChanged", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getZoom", "()F", "setZoom", "(F)V", "Z", "getUseTextDefault", "()Z", "setUseTextDefault", "(Z)V", "J", "getSize-MYxV2XQ", "()J", "setSize-EaSLcWc", "(J)V", "getCornerRadius-D9Ej5fM", "setCornerRadius-0680j_4", "getElevation-D9Ej5fM", "setElevation-0680j_4", "getClippingEnabled", "setClippingEnabled", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "Landroid/view/View;", "getOutputFormats", "Landroid/view/View;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/foundation/PlatformMagnifier;", "Landroidx/compose/foundation/PlatformMagnifier;", "p0", "Landroidx/compose/runtime/MutableState;", "getHighResolutionOutputSizeshNQ4ISI", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/State;", "getInputFormats", "Landroidx/compose/ui/unit/IntSize;", "getOutputMinFrameDuration", "Landroidx/compose/ui/unit/IntSize;", "getInputSizeshNQ4ISI", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;", "getHighSpeedVideoSizesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MagnifierNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.SemanticsModifierNode, androidx.compose.ui.node.ObserverModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.foundation.PlatformMagnifier getHighSpeedVideoFpsRanges;
    private boolean clippingEnabled;
    private float cornerRadius;
    private float elevation;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private kotlinx.coroutines.channels.Channel<kotlin.Unit> getHighSpeedVideoSizesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.unit.Density getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private long getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private android.view.View Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private androidx.compose.ui.unit.IntSize getInputSizeshNQ4ISI;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> magnifierCenter;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> onSizeChanged;
    private androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory;
    private long size;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> sourceCenter;
    private boolean useTextDefault;
    private float zoom;

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
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(null, androidx.compose.runtime.SnapshotStateKt.neverEqualPolicy());
        this.getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
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
        this(function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? androidx.compose.ui.unit.DpSize.INSTANCE.m8708getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : f2, (i & 128) != 0 ? androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM() : f3, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? androidx.compose.foundation.PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    /* renamed from: getSize-MYxV2XQ, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: setSize-EaSLcWc, reason: not valid java name */
    public final void m1344setSizeEaSLcWc(long j) {
        this.size = j;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: not valid java name and from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: setCornerRadius-0680j_4, reason: not valid java name */
    public final void m1342setCornerRadius0680j_4(float f) {
        this.cornerRadius = f;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name and from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: setElevation-0680j_4, reason: not valid java name */
    public final void m1343setElevation0680j_4(float f) {
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

    private final androidx.compose.ui.layout.LayoutCoordinates getHighResolutionOutputSizeshNQ4ISI() {
        return (androidx.compose.ui.layout.LayoutCoordinates) this.getHighResolutionOutputSizeshNQ4ISI.getValue();
    }

    private final void getHighSpeedVideoFpsRanges(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        this.getHighResolutionOutputSizeshNQ4ISI.setValue(layoutCoordinates);
    }

    private final long Camera2StreamConfigurationMap() {
        if (this.getHighSpeedVideoFpsRangesFor == null) {
            this.getHighSpeedVideoFpsRangesFor = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.MagnifierNode$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return androidx.compose.foundation.MagnifierNode.m1338$r8$lambda$_GYZLKefGXM5T7uDywDG7fUzvY(androidx.compose.foundation.MagnifierNode.this);
                }
            });
        }
        androidx.compose.runtime.State<androidx.compose.ui.geometry.Offset> state = this.getHighSpeedVideoFpsRangesFor;
        return state != null ? state.getValue().m5762unboximpl() : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
    }

    /* renamed from: update-5F03MCQ, reason: not valid java name */
    public final void m1345update5F03MCQ(kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> sourceCenter, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> onSizeChanged, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory) {
        float f = this.zoom;
        long j = this.size;
        float f2 = this.cornerRadius;
        boolean z = this.useTextDefault;
        float f3 = this.elevation;
        boolean z2 = this.clippingEnabled;
        androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        android.view.View view = this.Camera2StreamConfigurationMap;
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoSizes;
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
        androidx.compose.foundation.MagnifierNode magnifierNode = this;
        android.view.View requireView = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(magnifierNode);
        androidx.compose.ui.unit.Density requireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(magnifierNode);
        if (this.getHighSpeedVideoFpsRanges != null && ((!androidx.compose.foundation.Magnifier_androidKt.equalsIncludingNaN(zoom, f) && !platformMagnifierFactory.getCanUpdateZoom()) || !androidx.compose.ui.unit.DpSize.m8696equalsimpl0(size, j) || !androidx.compose.ui.unit.Dp.m8606equalsimpl0(cornerRadius, f2) || !androidx.compose.ui.unit.Dp.m8606equalsimpl0(elevation, f3) || useTextDefault != z || clippingEnabled != z2 || !kotlin.jvm.internal.Intrinsics.areEqual(platformMagnifierFactory, platformMagnifierFactory2) || !kotlin.jvm.internal.Intrinsics.areEqual(requireView, view) || !kotlin.jvm.internal.Intrinsics.areEqual(requireDensity, density))) {
            getHighSpeedVideoSizes();
        }
        getHighSpeedVideoFpsRanges();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        onObservedReadsChanged();
        this.getHighSpeedVideoSizesFor = kotlinx.coroutines.channels.ChannelKt.Channel$default(0, null, null, 7, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, kotlinx.coroutines.CoroutineStart.UNDISPATCHED, new androidx.compose.foundation.MagnifierNode$onAttach$1(this, null), 1, null);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.foundation.PlatformMagnifier platformMagnifier = this.getHighSpeedVideoFpsRanges;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.getHighSpeedVideoFpsRanges = null;
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.MagnifierNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.MagnifierNode.m1337$r8$lambda$VUctURvhkGZs5M8i8R_hfJcU3o(androidx.compose.foundation.MagnifierNode.this);
            }
        });
    }

    private final void getHighSpeedVideoSizes() {
        androidx.compose.foundation.PlatformMagnifier platformMagnifier = this.getHighSpeedVideoFpsRanges;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        android.view.View view = this.Camera2StreamConfigurationMap;
        if (view == null) {
            view = androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this);
        }
        android.view.View view2 = view;
        this.Camera2StreamConfigurationMap = view2;
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoSizes;
        if (density == null) {
            density = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
        }
        androidx.compose.ui.unit.Density density2 = density;
        this.getHighSpeedVideoSizes = density2;
        this.getHighSpeedVideoFpsRanges = this.platformMagnifierFactory.mo1363createnHHXs2Y(view2, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density2, this.zoom);
        getHighSpeedVideoFpsRangesFor();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getHighSpeedVideoFpsRanges() {
        long m5767getUnspecifiedF1C5BW0;
        androidx.compose.foundation.PlatformMagnifier platformMagnifier;
        androidx.compose.ui.unit.Density density = this.getHighSpeedVideoSizes;
        if (density == null) {
            density = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
            this.getHighSpeedVideoSizes = density;
        }
        long m5762unboximpl = this.sourceCenter.invoke(density).m5762unboximpl();
        if ((m5762unboximpl & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats && (Camera2StreamConfigurationMap() & 9223372034707292159L) != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.getOutputFormats = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(Camera2StreamConfigurationMap(), m5762unboximpl);
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.Density, androidx.compose.ui.geometry.Offset> function1 = this.magnifierCenter;
            if (function1 != null) {
                androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(function1.invoke(density).m5762unboximpl());
                if ((m5741boximpl.m5762unboximpl() & 9223372034707292159L) == androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
                    m5741boximpl = null;
                }
                if (m5741boximpl != null) {
                    m5767getUnspecifiedF1C5BW0 = androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(Camera2StreamConfigurationMap(), m5741boximpl.m5762unboximpl());
                    long j = m5767getUnspecifiedF1C5BW0;
                    if (this.getHighSpeedVideoFpsRanges == null) {
                        getHighSpeedVideoSizes();
                    }
                    platformMagnifier = this.getHighSpeedVideoFpsRanges;
                    if (platformMagnifier != null) {
                        platformMagnifier.mo1362updateWko1d7g(this.getOutputFormats, j, this.zoom);
                    }
                    getHighSpeedVideoFpsRangesFor();
                    return;
                }
            }
            m5767getUnspecifiedF1C5BW0 = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
            long j2 = m5767getUnspecifiedF1C5BW0;
            if (this.getHighSpeedVideoFpsRanges == null) {
            }
            platformMagnifier = this.getHighSpeedVideoFpsRanges;
            if (platformMagnifier != null) {
            }
            getHighSpeedVideoFpsRangesFor();
            return;
        }
        this.getOutputFormats = androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0();
        androidx.compose.foundation.PlatformMagnifier platformMagnifier2 = this.getHighSpeedVideoFpsRanges;
        if (platformMagnifier2 != null) {
            platformMagnifier2.dismiss();
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        androidx.compose.ui.unit.Density density;
        androidx.compose.foundation.PlatformMagnifier platformMagnifier = this.getHighSpeedVideoFpsRanges;
        if (platformMagnifier == null || (density = this.getHighSpeedVideoSizes) == null || androidx.compose.ui.unit.IntSize.m8769equalsimpl(platformMagnifier.mo1361getSizeYbymL2g(), this.getInputSizeshNQ4ISI)) {
            return;
        }
        kotlin.jvm.functions.Function1<? super androidx.compose.ui.unit.DpSize, kotlin.Unit> function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(androidx.compose.ui.unit.DpSize.m8687boximpl(density.mo1416toDpSizekrfVVM(androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(platformMagnifier.mo1361getSizeYbymL2g()))));
        }
        this.getInputSizeshNQ4ISI = androidx.compose.ui.unit.IntSize.m8764boximpl(platformMagnifier.mo1361getSizeYbymL2g());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        kotlinx.coroutines.channels.Channel<kotlin.Unit> channel = this.getHighSpeedVideoSizesFor;
        if (channel != null) {
            kotlinx.coroutines.channels.ChannelResult.m24079boximpl(channel.mo9266trySendJP2dKIU(kotlin.Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public final void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        getHighSpeedVideoFpsRanges(coordinates);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(androidx.compose.foundation.Magnifier_androidKt.getMagnifierPositionInRoot(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.MagnifierNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.ui.geometry.Offset m5741boximpl;
                m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(androidx.compose.foundation.MagnifierNode.this.getOutputFormats);
                return m5741boximpl;
            }
        });
    }

    /* renamed from: $r8$lambda$VUctURvhkGZs5M8i8R_hfJ-cU3o, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m1337$r8$lambda$VUctURvhkGZs5M8i8R_hfJcU3o(androidx.compose.foundation.MagnifierNode magnifierNode) {
        magnifierNode.getHighSpeedVideoFpsRanges();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_GYZLKefGXM-5T7uDywDG7fUzvY, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.geometry.Offset m1338$r8$lambda$_GYZLKefGXM5T7uDywDG7fUzvY(androidx.compose.foundation.MagnifierNode magnifierNode) {
        androidx.compose.ui.layout.LayoutCoordinates highResolutionOutputSizeshNQ4ISI = magnifierNode.getHighResolutionOutputSizeshNQ4ISI();
        return androidx.compose.ui.geometry.Offset.m5741boximpl(highResolutionOutputSizeshNQ4ISI != null ? androidx.compose.ui.layout.LayoutCoordinatesKt.positionInRoot(highResolutionOutputSizeshNQ4ISI) : androidx.compose.ui.geometry.Offset.INSTANCE.m5767getUnspecifiedF1C5BW0());
    }

    public /* synthetic */ MagnifierNode(kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, androidx.compose.foundation.PlatformMagnifierFactory platformMagnifierFactory, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }
}
