package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u001e\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012JH\u0010\u0013\u001a\u00020\u00002\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032 \b\u0002\u0010\b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R,\u0010\"\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 "}, d2 = {"Lcom/paypal/pds/analytics/ToggleableElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Lcom/paypal/pds/analytics/ToggleableNode;", "Lkotlin/Function1;", "", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/compose/ui/Modifier;", "producer", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "create", "()Lcom/paypal/pds/analytics/ToggleableNode;", "node", "update", "(Lcom/paypal/pds/analytics/ToggleableNode;)V", "Landroidx/compose/ui/platform/InspectorInfo;", "inspectableProperties", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "copy", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/paypal/pds/analytics/ToggleableElement;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ToggleableElement extends androidx.compose.ui.node.ModifierNodeElement<com.paypal.pds.analytics.ToggleableNode> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, androidx.compose.ui.Modifier> getHighSpeedVideoFpsRanges;
    private final kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ToggleableElement(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, ? extends androidx.compose.ui.Modifier> function12) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRanges = function12;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    /* renamed from: create, reason: avoid collision after fix types in other method */
    public final com.paypal.pds.analytics.ToggleableNode getGetHighResolutionOutputSizeshNQ4ISI() {
        return new com.paypal.pds.analytics.ToggleableNode(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void update(com.paypal.pds.analytics.ToggleableNode node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        node.update(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void inspectableProperties(androidx.compose.ui.platform.InspectorInfo inspectorInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inspectorInfo, "");
        inspectorInfo.setName("PdsToggleableElement");
    }

    public final java.lang.String toString() {
        kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = this.getHighSpeedVideoSizes;
        kotlin.jvm.functions.Function1<kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, androidx.compose.ui.Modifier> function12 = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ToggleableElement(getHighSpeedVideoSizes=");
        sb.append(function1);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(function12);
        sb.append(")");
        return sb.toString();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.pds.analytics.ToggleableElement)) {
            return false;
        }
        com.paypal.pds.analytics.ToggleableElement toggleableElement = (com.paypal.pds.analytics.ToggleableElement) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, toggleableElement.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, toggleableElement.getHighSpeedVideoFpsRanges);
    }

    public final com.paypal.pds.analytics.ToggleableElement copy(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> listener, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, ? extends androidx.compose.ui.Modifier> producer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(producer, "");
        return new com.paypal.pds.analytics.ToggleableElement(listener, producer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.pds.analytics.ToggleableElement copy$default(com.paypal.pds.analytics.ToggleableElement toggleableElement, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = toggleableElement.getHighSpeedVideoSizes;
        }
        if ((i & 2) != 0) {
            function12 = toggleableElement.getHighSpeedVideoFpsRanges;
        }
        return toggleableElement.copy(function1, function12);
    }
}
