package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B;\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00060\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/pds/analytics/ToggleableNode;", "Lcom/paypal/pds/analytics/InteractiveNode;", "Lkotlin/Function1;", "", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroidx/compose/ui/Modifier;", "producer", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "createDelegator", "()Landroidx/compose/ui/node/ModifierNodeElement;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ToggleableNode extends com.paypal.pds.analytics.InteractiveNode<kotlin.jvm.functions.Function1<? super java.lang.Boolean, ? extends kotlin.Unit>> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleableNode(kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit>, ? extends androidx.compose.ui.Modifier> function12) {
        super(function1, function12);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
    }

    @Override // com.paypal.pds.analytics.InteractiveNode
    public final androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.Modifier.Node> createDelegator() {
        androidx.compose.ui.Modifier invoke = getProducer$analytics_release().invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.ToggleableNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.analytics.ToggleableNode.m21554$r8$lambda$Yt7flifGijx1x0qN46n7djD7oU(com.paypal.pds.analytics.ToggleableNode.this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return (androidx.compose.ui.node.ModifierNodeElement) invoke;
    }

    /* renamed from: $r8$lambda$Yt7flifGij-x1x0qN46n7djD7oU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21554$r8$lambda$Yt7flifGijx1x0qN46n7djD7oU(com.paypal.pds.analytics.ToggleableNode toggleableNode, boolean z) {
        toggleableNode.getListener$analytics_release().invoke(java.lang.Boolean.valueOf(z));
        toggleableNode.track(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.ToggleableNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.analytics.ToggleableNode.$r8$lambda$ZJR6yZxXLk4lvp7GkW8wLR4YLcw((com.paypal.pds.analytics.AnalyticsEventScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.analytics.AnalyticsEvent $r8$lambda$ZJR6yZxXLk4lvp7GkW8wLR4YLcw(com.paypal.pds.analytics.AnalyticsEventScope analyticsEventScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventScope, "");
        return com.paypal.pds.analytics.AnalyticsEventKt.click(analyticsEventScope);
    }
}
