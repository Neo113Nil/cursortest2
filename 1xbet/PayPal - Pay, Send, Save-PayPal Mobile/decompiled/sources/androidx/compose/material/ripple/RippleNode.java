package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\u0014*\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020\u0014*\u00020!H&¢\u0006\u0004\b\"\u0010#J'\u0010+\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020&2\u0006\u0010(\u001a\u00020'H&¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010%\u001a\u00020$H&¢\u0006\u0004\b,\u0010-R\u0014\u0010\u001c\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u0010\b\u001a\u00020\u00078\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u00102R\u0014\u0010.\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0014\u00104\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0005X\u0085\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u001a\u00109\u001a\u00020\u00078\u0007X\u0087D¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\"\u0010(\u001a\u00020'8\u0005@\u0005X\u0085\u000e¢\u0006\u0012\n\u0004\b(\u00103\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010C\u001a\u00020&2\u0006\u0010\u001b\u001a\u00020&8\u0005@BX\u0085\u000e¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0011\u0010I\u001a\u00020G8G¢\u0006\u0006\u001a\u0004\bH\u0010FR\u0016\u0010J\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u00100R\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001a0K8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010L"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/IntSize;", io.ktor.http.ContentDisposition.Parameters.Size, "", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onAttach", "()V", "Landroidx/compose/foundation/interaction/PressInteraction;", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/interaction/PressInteraction;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", "", "targetRadius", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/foundation/interaction/InteractionSource;", "Z", "getBounded", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/ColorProducer;", "Lkotlin/jvm/functions/Function0;", "getRippleAlpha", "()Lkotlin/jvm/functions/Function0;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "Landroidx/compose/material/ripple/StateLayer;", "getInputFormats", "Landroidx/compose/material/ripple/StateLayer;", "getHighSpeedVideoSizes", "getTargetRadius", "()F", "setTargetRadius", "(F)V", "rippleSize", "J", "getRippleSize-NH-jbRc", "()J", "Landroidx/compose/ui/graphics/Color;", "getRippleColor-0d7_KjU", "rippleColor", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/collection/MutableObjectList;", "Landroidx/collection/MutableObjectList;", "getOutputFormats"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RippleNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.DrawModifierNode, androidx.compose.ui.node.LayoutAwareModifierNode {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;
    private final boolean bounded;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.compose.ui.graphics.ColorProducer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.InteractionSource Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.collection.MutableObjectList<androidx.compose.foundation.interaction.PressInteraction> getOutputFormats;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private androidx.compose.material.ripple.StateLayer getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private float targetRadius;

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo2850addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press interaction, long size, float targetRadius);

    public abstract void drawRipples(androidx.compose.ui.graphics.drawscope.DrawScope drawScope);

    public abstract void removeRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction);

    private RippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> function0) {
        this.Camera2StreamConfigurationMap = interactionSource;
        this.bounded = z;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighSpeedVideoFpsRanges = colorProducer;
        this.rippleAlpha = function0;
        this.rippleSize = androidx.compose.ui.geometry.Size.INSTANCE.m5830getZeroNHjbRc();
        this.getOutputFormats = new androidx.collection.MutableObjectList<>(0, 1, null);
    }

    protected final boolean getBounded() {
        return this.bounded;
    }

    protected final kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> getRippleAlpha() {
        return this.rippleAlpha;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    protected final float getTargetRadius() {
        return this.targetRadius;
    }

    protected final void setTargetRadius(float f) {
        this.targetRadius = f;
    }

    /* renamed from: getRippleSize-NH-jbRc, reason: not valid java name and from getter */
    protected final long getRippleSize() {
        return this.rippleSize;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m2863getRippleColor0d7_KjU() {
        return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRanges();
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo1407onRemeasuredozmzZPI(long size) {
        float mo1418toPx0680j_4;
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        androidx.compose.ui.unit.Density requireDensity = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(this);
        this.rippleSize = androidx.compose.ui.unit.IntSizeKt.m8784toSizeozmzZPI(size);
        if (java.lang.Float.isNaN(this.getHighSpeedVideoFpsRangesFor)) {
            mo1418toPx0680j_4 = androidx.compose.material.ripple.RippleAnimationKt.m2854getRippleEndRadiuscSwnlzA(requireDensity, this.bounded, this.rippleSize);
        } else {
            mo1418toPx0680j_4 = requireDensity.mo1418toPx0680j_4(this.getHighSpeedVideoFpsRangesFor);
        }
        this.targetRadius = mo1418toPx0680j_4;
        androidx.collection.MutableObjectList<androidx.compose.foundation.interaction.PressInteraction> mutableObjectList = this.getOutputFormats;
        java.lang.Object[] objArr = mutableObjectList.content;
        int i = mutableObjectList._size;
        for (int i2 = 0; i2 < i; i2++) {
            Camera2StreamConfigurationMap((androidx.compose.foundation.interaction.PressInteraction) objArr[i2]);
        }
        this.getOutputFormats.clear();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new androidx.compose.material.ripple.RippleNode$onAttach$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Camera2StreamConfigurationMap(androidx.compose.foundation.interaction.PressInteraction p0) {
        if (p0 instanceof androidx.compose.foundation.interaction.PressInteraction.Press) {
            mo2850addRipple12SF9DM((androidx.compose.foundation.interaction.PressInteraction.Press) p0, this.rippleSize, this.targetRadius);
        } else if (p0 instanceof androidx.compose.foundation.interaction.PressInteraction.Release) {
            removeRipple(((androidx.compose.foundation.interaction.PressInteraction.Release) p0).getPress());
        } else if (p0 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel) {
            removeRipple(((androidx.compose.foundation.interaction.PressInteraction.Cancel) p0).getPress());
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        androidx.compose.material.ripple.StateLayer stateLayer = this.getHighSpeedVideoSizes;
        if (stateLayer != null) {
            stateLayer.getHighSpeedVideoSizes(contentDrawScope, this.targetRadius, m2863getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public static final /* synthetic */ void access$updateStateLayer(androidx.compose.material.ripple.RippleNode rippleNode, androidx.compose.foundation.interaction.Interaction interaction, kotlinx.coroutines.CoroutineScope coroutineScope) {
        androidx.compose.material.ripple.StateLayer stateLayer = rippleNode.getHighSpeedVideoSizes;
        if (stateLayer == null) {
            stateLayer = new androidx.compose.material.ripple.StateLayer(rippleNode.bounded, rippleNode.rippleAlpha);
            androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(rippleNode);
            rippleNode.getHighSpeedVideoSizes = stateLayer;
        }
        stateLayer.getHighSpeedVideoFpsRangesFor(interaction, coroutineScope);
    }

    public /* synthetic */ RippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z, f, colorProducer, function0);
    }
}
