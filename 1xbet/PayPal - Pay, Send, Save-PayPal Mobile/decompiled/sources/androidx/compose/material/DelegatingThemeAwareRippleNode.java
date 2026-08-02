package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/compose/material/DelegatingThemeAwareRippleNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "p0", "", "p1", "Landroidx/compose/ui/unit/Dp;", "p2", "Landroidx/compose/ui/graphics/ColorProducer;", "p3", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "onAttach", "()V", "onObservedReadsChanged", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/interaction/InteractionSource;", "Camera2StreamConfigurationMap", "Z", "getHighResolutionOutputSizeshNQ4ISI", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/ColorProducer;", "Landroidx/compose/ui/node/DelegatableNode;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/node/DelegatableNode;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class DelegatingThemeAwareRippleNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final float getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.node.DelegatableNode getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.graphics.ColorProducer getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.InteractionSource Camera2StreamConfigurationMap;

    private DelegatingThemeAwareRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer) {
        this.Camera2StreamConfigurationMap = interactionSource;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRangesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = colorProducer;
    }

    public static /* synthetic */ androidx.compose.material.ripple.RippleAlpha getHighSpeedVideoSizes(androidx.compose.material.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        androidx.compose.material.ripple.RippleAlpha rippleAlpha;
        androidx.compose.material.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode2 = delegatingThemeAwareRippleNode;
        androidx.compose.material.RippleConfiguration rippleConfiguration = (androidx.compose.material.RippleConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, androidx.compose.material.RippleKt.getLocalRippleConfiguration());
        return (rippleConfiguration == null || (rippleAlpha = rippleConfiguration.getRippleAlpha()) == null) ? androidx.compose.material.RippleDefaults.INSTANCE.m2710rippleAlphaDxMtmZc(((androidx.compose.ui.graphics.Color) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, androidx.compose.material.ContentColorKt.getLocalContentColor())).m6006unboximpl(), ((androidx.compose.material.Colors) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode2, androidx.compose.material.ColorsKt.getLocalColors())).isLight()) : rippleAlpha;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(final androidx.compose.material.DelegatingThemeAwareRippleNode delegatingThemeAwareRippleNode) {
        if (((androidx.compose.material.RippleConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareRippleNode, androidx.compose.material.RippleKt.getLocalRippleConfiguration())) != null) {
            if (delegatingThemeAwareRippleNode.getHighSpeedVideoFpsRanges == null) {
                delegatingThemeAwareRippleNode.getHighSpeedVideoFpsRanges = delegatingThemeAwareRippleNode.delegate(androidx.compose.material.ripple.RippleKt.m2861createRippleModifierNodeTDGSqEk(delegatingThemeAwareRippleNode.Camera2StreamConfigurationMap, delegatingThemeAwareRippleNode.getHighSpeedVideoSizes, delegatingThemeAwareRippleNode.getHighSpeedVideoFpsRangesFor, new androidx.compose.ui.graphics.ColorProducer() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$attachNewRipple$calculateColor$1
                    @Override // androidx.compose.ui.graphics.ColorProducer
                    /* renamed from: invoke-0d7_KjU, reason: not valid java name */
                    public final long getGetHighSpeedVideoFpsRanges() {
                        androidx.compose.ui.graphics.ColorProducer colorProducer;
                        colorProducer = androidx.compose.material.DelegatingThemeAwareRippleNode.this.getHighResolutionOutputSizeshNQ4ISI;
                        long getHighSpeedVideoFpsRanges = colorProducer.getGetHighSpeedVideoFpsRanges();
                        if (getHighSpeedVideoFpsRanges != 16) {
                            return getHighSpeedVideoFpsRanges;
                        }
                        androidx.compose.material.RippleConfiguration rippleConfiguration = (androidx.compose.material.RippleConfiguration) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.material.DelegatingThemeAwareRippleNode.this, androidx.compose.material.RippleKt.getLocalRippleConfiguration());
                        if (rippleConfiguration != null && rippleConfiguration.getColor() != 16) {
                            return rippleConfiguration.getColor();
                        }
                        return androidx.compose.material.RippleDefaults.INSTANCE.m2711rippleColor5vOe2sY(((androidx.compose.ui.graphics.Color) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.material.DelegatingThemeAwareRippleNode.this, androidx.compose.material.ContentColorKt.getLocalContentColor())).m6006unboximpl(), ((androidx.compose.material.Colors) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(androidx.compose.material.DelegatingThemeAwareRippleNode.this, androidx.compose.material.ColorsKt.getLocalColors())).isLight());
                    }
                }, new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return androidx.compose.material.DelegatingThemeAwareRippleNode.getHighSpeedVideoSizes(androidx.compose.material.DelegatingThemeAwareRippleNode.this);
                    }
                }));
            }
        } else {
            androidx.compose.ui.node.DelegatableNode delegatableNode = delegatingThemeAwareRippleNode.getHighSpeedVideoFpsRanges;
            if (delegatableNode != null) {
                delegatingThemeAwareRippleNode.undelegate(delegatableNode);
            }
            delegatingThemeAwareRippleNode.getHighSpeedVideoFpsRanges = null;
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new androidx.compose.material.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new androidx.compose.material.DelegatingThemeAwareRippleNode$$ExternalSyntheticLambda0(this));
    }

    public /* synthetic */ DelegatingThemeAwareRippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, boolean z, float f, androidx.compose.ui.graphics.ColorProducer colorProducer, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z, f, colorProducer);
    }
}
