package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c"}, d2 = {"Landroidx/compose/material3/DelegatingThemeAwareRippleNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "p0", "", "p1", "Landroidx/compose/ui/unit/Dp;", "p2", "Landroidx/compose/ui/graphics/ColorProducer;", "p3", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "onAttach", "()V", "onObservedReadsChanged", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/interaction/InteractionSource;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRangesFor", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/ColorProducer;", "Landroidx/compose/ui/node/DelegatableNode;", "Landroidx/compose/ui/node/DelegatableNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DelegatingThemeAwareRippleNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.node.DelegatableNode getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.ColorProducer Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.InteractionSource getHighResolutionOutputSizeshNQ4ISI;

    private DelegatingThemeAwareRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer) {
        this.getHighResolutionOutputSizeshNQ4ISI = interactionSource;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoFpsRanges = f;
        this.Camera2StreamConfigurationMap = colorProducer;
    }

    public static /* synthetic */ androidx.compose.material.ripple.RippleAlpha getHighSpeedVideoSizes(androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        androidx.compose.material.ripple.RippleAlpha rippleAlpha;
        androidx.compose.material3.RippleConfiguration rippleConfiguration = (androidx.compose.material3.RippleConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, androidx.compose.material3.RippleKt.getLocalRippleConfiguration());
        return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? androidx.compose.material3.RippleDefaults.INSTANCE.getRippleAlpha() : rippleAlpha;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(final androidx.compose.material3.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((androidx.compose.material3.RippleConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, androidx.compose.material3.RippleKt.getLocalRippleConfiguration())) != null) {
            if (delegatingThemeAwareRippleNode.getHighSpeedVideoSizes == null) {
                delegatingThemeAwareRippleNode.getHighSpeedVideoSizes = delegatingThemeAwareRippleNode.delegate(androidx.compose.material.ripple.RippleKt.m2861createRippleModifierNodeTDGSqEk(delegatingThemeAwareRippleNode.getHighResolutionOutputSizeshNQ4ISI, delegatingThemeAwareRippleNode.getHighSpeedVideoFpsRangesFor, delegatingThemeAwareRippleNode.getHighSpeedVideoFpsRanges, new androidx.compose.ui.graphics.ColorProducer() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
                    @Override // androidx.compose.ui.graphics.ColorProducer
                    /* renamed from: invoke-0d7_KjU */
                    public final long getGetHighSpeedVideoFpsRanges() {
                        androidx.compose.ui.graphics.ColorProducer colorProducer;
                        colorProducer = androidx.compose.material3.DelegatingThemeAwareRippleNode.this.Camera2StreamConfigurationMap;
                        long getHighSpeedVideoFpsRanges = colorProducer.getGetHighSpeedVideoFpsRanges();
                        if (getHighSpeedVideoFpsRanges != 16) {
                            return getHighSpeedVideoFpsRanges;
                        }
                        androidx.compose.material3.RippleConfiguration rippleConfiguration = (androidx.compose.material3.RippleConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.material3.DelegatingThemeAwareRippleNode.this, androidx.compose.material3.RippleKt.getLocalRippleConfiguration());
                        if (rippleConfiguration != null && rippleConfiguration.getColor() != 16) {
                            return rippleConfiguration.getColor();
                        }
                        return ((androidx.compose.ui.graphics.Color) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.material3.DelegatingThemeAwareRippleNode.this, androidx.compose.material3.ContentColorKt.getLocalContentColor())).m6006unboximpl();
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material3.DelegatingThemeAwareRippleNode.getHighSpeedVideoSizes(androidx.compose.material3.DelegatingThemeAwareRippleNode.this);
                    }
                }));
            }
        } else {
            androidx.compose.ui.node.DelegatableNode delegatableNode = delegatingThemeAwareRippleNode.getHighSpeedVideoSizes;
            if (delegatableNode != null) {
                delegatingThemeAwareRippleNode.undelegate(delegatableNode);
            }
            delegatingThemeAwareRippleNode.getHighSpeedVideoSizes = null;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new androidx.compose.material3.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new androidx.compose.material3.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this));
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z, f, colorProducer);
    }
}
