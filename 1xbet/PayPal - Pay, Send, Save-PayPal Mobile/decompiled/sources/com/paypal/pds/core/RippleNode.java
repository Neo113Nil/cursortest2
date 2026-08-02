package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/pds/core/RippleNode;", "Lcom/paypal/pds/core/IndicationNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lcom/paypal/pds/tokens/PDSTokens;", "tokens", "Lcom/paypal/pds/core/PDSIndication;", "indication", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;Lcom/paypal/pds/tokens/PDSTokens;Lcom/paypal/pds/core/PDSIndication;)V", "", "onAttach", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource$pds_release", "()Landroidx/compose/foundation/interaction/InteractionSource;", "Lcom/paypal/pds/tokens/PDSTokens;", "getTokens$pds_release", "()Lcom/paypal/pds/tokens/PDSTokens;", "Lcom/paypal/pds/core/PDSIndication;", "getIndication$pds_release", "()Lcom/paypal/pds/core/PDSIndication;", "Landroidx/compose/ui/node/DelegatableNode;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/node/DelegatableNode;", "getHighSpeedVideoSizes", "ColorHolder"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class RippleNode extends com.paypal.pds.core.IndicationNode {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.compose.ui.node.DelegatableNode getHighSpeedVideoSizes;
    private final com.paypal.pds.core.PDSIndication indication;
    private final androidx.compose.foundation.interaction.InteractionSource interactionSource;
    private final com.paypal.pds.tokens.PDSTokens tokens;

    public RippleNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, com.paypal.pds.tokens.PDSTokens pDSTokens, com.paypal.pds.core.PDSIndication pDSIndication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSIndication, "");
        this.interactionSource = interactionSource;
        this.tokens = pDSTokens;
        this.indication = pDSIndication;
        com.paypal.pds.core.RippleNode.ColorHolder colorHolder = new com.paypal.pds.core.RippleNode.ColorHolder(getIndication().getPressed().getColor().value(getTokens()), null);
        this.getHighSpeedVideoSizes = androidx.compose.material.ripple.RippleKt.m2861createRippleModifierNodeTDGSqEk(getInteractionSource(), true, androidx.compose.ui.unit.Dp.INSTANCE.m8621getUnspecifiedD9Ej5fM(), colorHolder, new com.paypal.pds.core.RippleNode$rippleDelegate$1$1(colorHolder));
    }

    @Override // com.paypal.pds.core.IndicationNode
    /* renamed from: getInteractionSource$pds_release, reason: from getter */
    public final androidx.compose.foundation.interaction.InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // com.paypal.pds.core.IndicationNode
    /* renamed from: getTokens$pds_release, reason: from getter */
    public final com.paypal.pds.tokens.PDSTokens getTokens() {
        return this.tokens;
    }

    @Override // com.paypal.pds.core.IndicationNode
    /* renamed from: getIndication$pds_release, reason: from getter */
    public final com.paypal.pds.core.PDSIndication getIndication() {
        return this.indication;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/pds/core/RippleNode$ColorHolder;", "Landroidx/compose/ui/graphics/ColorProducer;", "Landroidx/compose/ui/graphics/Color;", "p0", "<init>", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "invoke-0d7_KjU", "()J", "invoke", "Landroidx/compose/material/ripple/RippleAlpha;", "getHighSpeedVideoFpsRanges", "()Landroidx/compose/material/ripple/RippleAlpha;", "getHighSpeedVideoSizes", "J", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/material/ripple/RippleAlpha;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class ColorHolder implements androidx.compose.ui.graphics.ColorProducer {
        private final androidx.compose.material.ripple.RippleAlpha getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private final long getHighSpeedVideoFpsRanges;

        private ColorHolder(long j) {
            this.getHighSpeedVideoFpsRanges = j;
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.material.ripple.RippleAlpha(0.0f, 0.0f, 0.0f, androidx.compose.ui.graphics.Color.m5998getAlphaimpl(j));
        }

        @Override // androidx.compose.ui.graphics.ColorProducer
        /* renamed from: invoke-0d7_KjU, reason: from getter */
        public final long getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from getter */
        public final androidx.compose.material.ripple.RippleAlpha getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public /* synthetic */ ColorHolder(long j, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(j);
        }
    }

    @Override // com.paypal.pds.core.IndicationNode, androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        super.onAttach();
        delegate(this.getHighSpeedVideoSizes);
    }

    @Override // com.paypal.pds.core.IndicationNode, androidx.compose.ui.node.DrawModifierNode
    public final void draw(androidx.compose.ui.graphics.drawscope.ContentDrawScope contentDrawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentDrawScope, "");
        androidx.compose.ui.node.DelegatableNode delegatableNode = this.getHighSpeedVideoSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(delegatableNode, "");
        ((androidx.compose.ui.node.DrawModifierNode) delegatableNode).draw(contentDrawScope);
        if (getIsPressed()) {
            return;
        }
        if (getIsFocused()) {
            drawStyleState$pds_release(contentDrawScope, getIndication().getFocused());
        } else if (getIsHovered()) {
            drawStyleState$pds_release(contentDrawScope, getIndication().getHovered());
        }
    }
}
