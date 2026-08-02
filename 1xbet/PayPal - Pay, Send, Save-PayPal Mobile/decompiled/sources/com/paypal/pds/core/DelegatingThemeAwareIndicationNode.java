package com.paypal.pds.core;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010!\u001a\u0004\u0018\u00010 8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&"}, d2 = {"Lcom/paypal/pds/core/DelegatingThemeAwareIndicationNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Lcom/paypal/pds/core/PDSIndication;", "pdsIndication", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;Lcom/paypal/pds/core/PDSIndication;)V", "", "onAttach", "()V", "onObservedReadsChanged", "copy", "(Landroidx/compose/foundation/interaction/InteractionSource;Lcom/paypal/pds/core/PDSIndication;)Lcom/paypal/pds/core/DelegatingThemeAwareIndicationNode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/interaction/InteractionSource;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/pds/core/PDSIndication;", "Landroidx/compose/ui/node/DelegatableNode;", "indicationNode", "Landroidx/compose/ui/node/DelegatableNode;", "getIndicationNode$pds_release", "()Landroidx/compose/ui/node/DelegatableNode;", "setIndicationNode$pds_release", "(Landroidx/compose/ui/node/DelegatableNode;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DelegatingThemeAwareIndicationNode extends androidx.compose.ui.node.DelegatingNode implements androidx.compose.ui.node.CompositionLocalConsumerModifierNode, androidx.compose.ui.node.ObserverModifierNode {
    public static final int $stable = 8;
    private final com.paypal.pds.core.PDSIndication getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.interaction.InteractionSource getHighSpeedVideoFpsRangesFor;
    private androidx.compose.ui.node.DelegatableNode indicationNode;

    public DelegatingThemeAwareIndicationNode(androidx.compose.foundation.interaction.InteractionSource interactionSource, com.paypal.pds.core.PDSIndication pDSIndication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pDSIndication, "");
        this.getHighSpeedVideoFpsRangesFor = interactionSource;
        this.getHighSpeedVideoFpsRanges = pDSIndication;
    }

    /* renamed from: getIndicationNode$pds_release, reason: from getter */
    public final androidx.compose.ui.node.DelegatableNode getIndicationNode() {
        return this.indicationNode;
    }

    public final void setIndicationNode$pds_release(androidx.compose.ui.node.DelegatableNode delegatableNode) {
        this.indicationNode = delegatableNode;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9XQzZcjcNE9KykYzmyIoMajViys(com.paypal.pds.core.DelegatingThemeAwareIndicationNode delegatingThemeAwareIndicationNode) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(delegatingThemeAwareIndicationNode.getHighSpeedVideoFpsRanges, com.paypal.pds.core.PDSIndication.None.INSTANCE)) {
            return kotlin.Unit.INSTANCE;
        }
        com.paypal.pds.core.DelegatingThemeAwareIndicationNode delegatingThemeAwareIndicationNode2 = delegatingThemeAwareIndicationNode;
        kotlin.jvm.functions.Function3<androidx.compose.foundation.interaction.InteractionSource, com.paypal.pds.tokens.PDSTokens, com.paypal.pds.core.PDSIndication, androidx.compose.ui.node.DelegatableNode> creator$pds_release = ((com.paypal.pds.core.IndicationCreator) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(delegatingThemeAwareIndicationNode2, com.paypal.pds.core.PDSIndicationKt.getLocalIndicationCreator())).getCreator$pds_release();
        com.paypal.pds.tokens.PDSTokens localTokens = com.paypal.pds.core.ThemeKt.localTokens(delegatingThemeAwareIndicationNode2);
        androidx.compose.ui.node.DelegatableNode delegatableNode = delegatingThemeAwareIndicationNode.indicationNode;
        if (delegatableNode != null) {
            delegatingThemeAwareIndicationNode.undelegate(delegatableNode);
        }
        delegatingThemeAwareIndicationNode.indicationNode = delegatingThemeAwareIndicationNode.delegate(creator$pds_release.invoke(delegatingThemeAwareIndicationNode.getHighSpeedVideoFpsRangesFor, localTokens, delegatingThemeAwareIndicationNode.getHighSpeedVideoFpsRanges));
        return kotlin.Unit.INSTANCE;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void onAttach() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new com.paypal.pds.core.DelegatingThemeAwareIndicationNode$$ExternalSyntheticLambda0(this));
    }

    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void onObservedReadsChanged() {
        androidx.compose.ui.node.ObserverModifierNodeKt.observeReads(this, new com.paypal.pds.core.DelegatingThemeAwareIndicationNode$$ExternalSyntheticLambda0(this));
    }

    public final java.lang.String toString() {
        androidx.compose.foundation.interaction.InteractionSource interactionSource = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.pds.core.PDSIndication pDSIndication = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DelegatingThemeAwareIndicationNode(getHighSpeedVideoFpsRangesFor=");
        sb.append(interactionSource);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(pDSIndication);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.core.DelegatingThemeAwareIndicationNode)) {
            return false;
        }
        com.paypal.pds.core.DelegatingThemeAwareIndicationNode delegatingThemeAwareIndicationNode = (com.paypal.pds.core.DelegatingThemeAwareIndicationNode) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, delegatingThemeAwareIndicationNode.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, delegatingThemeAwareIndicationNode.getHighSpeedVideoFpsRanges);
    }

    public final com.paypal.pds.core.DelegatingThemeAwareIndicationNode copy(androidx.compose.foundation.interaction.InteractionSource interactionSource, com.paypal.pds.core.PDSIndication pdsIndication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interactionSource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pdsIndication, "");
        return new com.paypal.pds.core.DelegatingThemeAwareIndicationNode(interactionSource, pdsIndication);
    }

    public static /* synthetic */ com.paypal.pds.core.DelegatingThemeAwareIndicationNode copy$default(com.paypal.pds.core.DelegatingThemeAwareIndicationNode delegatingThemeAwareIndicationNode, androidx.compose.foundation.interaction.InteractionSource interactionSource, com.paypal.pds.core.PDSIndication pDSIndication, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            interactionSource = delegatingThemeAwareIndicationNode.getHighSpeedVideoFpsRangesFor;
        }
        if ((i & 2) != 0) {
            pDSIndication = delegatingThemeAwareIndicationNode.getHighSpeedVideoFpsRanges;
        }
        return delegatingThemeAwareIndicationNode.copy(interactionSource, pDSIndication);
    }
}
