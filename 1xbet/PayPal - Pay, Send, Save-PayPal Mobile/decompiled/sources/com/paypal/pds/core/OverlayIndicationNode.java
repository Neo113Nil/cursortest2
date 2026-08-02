package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0011X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0011X\u0091\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/pds/core/OverlayIndicationNode;", "Lcom/paypal/pds/core/IndicationNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lcom/paypal/pds/tokens/PDSTokens;", "tokens", "Lcom/paypal/pds/core/PDSIndication;", "indication", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;Lcom/paypal/pds/tokens/PDSTokens;Lcom/paypal/pds/core/PDSIndication;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource$pds_release", "()Landroidx/compose/foundation/interaction/InteractionSource;", "Lcom/paypal/pds/tokens/PDSTokens;", "getTokens$pds_release", "()Lcom/paypal/pds/tokens/PDSTokens;", "Lcom/paypal/pds/core/PDSIndication;", "getIndication$pds_release", "()Lcom/paypal/pds/core/PDSIndication;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class OverlayIndicationNode extends com.paypal.pds.core.IndicationNode {
    public static final int $stable = 8;
    private final com.paypal.pds.core.PDSIndication indication;
    private final androidx.compose.foundation.interaction.InteractionSource interactionSource;
    private final com.paypal.pds.tokens.PDSTokens tokens;

    public OverlayIndicationNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, com.paypal.pds.tokens.PDSTokens pDSTokens, com.paypal.pds.core.PDSIndication pDSIndication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSTokens, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSIndication, "");
        this.interactionSource = interactionSource;
        this.tokens = pDSTokens;
        this.indication = pDSIndication;
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
}
