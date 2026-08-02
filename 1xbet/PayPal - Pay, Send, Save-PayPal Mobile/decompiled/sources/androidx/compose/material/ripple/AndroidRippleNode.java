package androidx.compose.material.ripple;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0011H\u0016¢\u0006\u0004\b!\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@CX\u0083\f¢\u0006\u0006\n\u0004\b%\u0010'"}, d2 = {"Landroidx/compose/material/ripple/AndroidRippleNode;", "Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/material/ripple/RippleHostKey;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "", "targetRadius", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "onDetach", "()V", "onResetRippleHostView", "Landroidx/compose/material/ripple/RippleContainer;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/material/ripple/RippleContainer;", "getHighSpeedVideoSizes", "Landroidx/compose/material/ripple/RippleHostView;", "Landroidx/compose/material/ripple/RippleHostView;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidRippleNode extends androidx.compose.material.ripple.RippleNode implements androidx.compose.material.ripple.RippleHostKey {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private androidx.compose.material.ripple.RippleContainer getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.material.ripple.RippleHostView getHighSpeedVideoFpsRangesFor;

    private AndroidRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0<androidx.compose.material.ripple.RippleAlpha> function0) {
        super(interactionSource, z, f, colorProducer, function0, null);
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void removeRipple(androidx.compose.foundation.interaction.PressInteraction.Press interaction) {
        androidx.compose.material.ripple.RippleHostView rippleHostView = this.getHighSpeedVideoFpsRangesFor;
        if (rippleHostView != null) {
            rippleHostView.removeRipple();
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onDetach() {
        androidx.compose.material.ripple.RippleContainer rippleContainer = this.getHighSpeedVideoSizes;
        if (rippleContainer != null) {
            rippleContainer.disposeRippleIfNeeded(this);
        }
    }

    @Override // androidx.compose.material.ripple.RippleNode
    public final void drawRipples(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        androidx.compose.material.ripple.RippleHostView rippleHostView = this.getHighSpeedVideoFpsRangesFor;
        if (rippleHostView != null) {
            rippleHostView.m2858setRipplePropertiesbiQXAtU(getRippleSize(), kotlin.math.MathKt.roundToInt(getTargetRadius()), m2863getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha());
            rippleHostView.draw(androidx.compose.ui.graphics.AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yl_wVRZ2KUOLRsFppMb1ckL7508(androidx.compose.material.ripple.AndroidRippleNode androidRippleNode) {
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(androidRippleNode);
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.material.ripple.RippleNode
    /* renamed from: addRipple-12SF9DM, reason: not valid java name */
    public final void mo2850addRipple12SF9DM(androidx.compose.foundation.interaction.PressInteraction.Press interaction, long size, float targetRadius) {
        androidx.compose.material.ripple.RippleContainer rippleContainer = this.getHighSpeedVideoSizes;
        if (rippleContainer != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(rippleContainer);
        } else {
            rippleContainer = androidx.compose.material.ripple.Ripple_androidKt.access$createAndAttachRippleContainerIfNeeded(androidx.compose.material.ripple.Ripple_androidKt.access$findNearestViewGroup((android.view.View) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView())));
            this.getHighSpeedVideoSizes = rippleContainer;
            kotlin.jvm.internal.Intrinsics.checkNotNull(rippleContainer);
        }
        androidx.compose.material.ripple.RippleHostView rippleHostView = rippleContainer.getRippleHostView(this);
        rippleHostView.m2857addRippleKOepWvA(interaction, getBounded(), size, kotlin.math.MathKt.roundToInt(targetRadius), m2863getRippleColor0d7_KjU(), getRippleAlpha().invoke().getPressedAlpha(), new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ripple.AndroidRippleNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.material.ripple.AndroidRippleNode.$r8$lambda$yl_wVRZ2KUOLRsFppMb1ckL7508(androidx.compose.material.ripple.AndroidRippleNode.this);
            }
        });
        this.getHighSpeedVideoFpsRangesFor = rippleHostView;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.material.ripple.RippleHostKey
    public final void onResetRippleHostView() {
        this.getHighSpeedVideoFpsRangesFor = null;
        androidx.compose.ui.node.DrawModifierNodeKt.invalidateDraw(this);
    }

    public /* synthetic */ AndroidRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.functions.Function0 function0, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z, f, colorProducer, function0);
    }
}
