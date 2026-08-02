package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/pds/analytics/ClickableNode;", "Lcom/paypal/pds/analytics/InteractiveNode;", "Lkotlin/Function0;", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "producer", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "createDelegator", "()Landroidx/compose/ui/node/ModifierNodeElement;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ClickableNode extends com.paypal.pds.analytics.InteractiveNode<kotlin.jvm.functions.Function0<? extends kotlin.Unit>> {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickableNode(kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, ? extends androidx.compose.ui.Modifier> function1) {
        super(function0, function1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
    }

    @Override // com.paypal.pds.analytics.InteractiveNode
    public final androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.Modifier.Node> createDelegator() {
        androidx.compose.ui.Modifier invoke = getProducer$analytics_release().invoke(new kotlin.jvm.functions.Function0() { // from class: com.paypal.pds.analytics.ClickableNode$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.pds.analytics.ClickableNode.m21549$r8$lambda$UXL73ZW1gmb9rCsCI_mZlCTPc(com.paypal.pds.analytics.ClickableNode.this);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNull(invoke, "");
        return (androidx.compose.ui.node.ModifierNodeElement) invoke;
    }

    /* renamed from: $r8$lambda$-UXL73ZW1gmb9-rCsCI_mZlCTPc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21549$r8$lambda$UXL73ZW1gmb9rCsCI_mZlCTPc(com.paypal.pds.analytics.ClickableNode clickableNode) {
        clickableNode.getListener$analytics_release().invoke();
        clickableNode.track(new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.ClickableNode$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.pds.analytics.ClickableNode.$r8$lambda$uKhfWRBfixdBKCSudpZyaYLXf2s((com.paypal.pds.analytics.AnalyticsEventScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.analytics.AnalyticsEvent $r8$lambda$uKhfWRBfixdBKCSudpZyaYLXf2s(com.paypal.pds.analytics.AnalyticsEventScope analyticsEventScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analyticsEventScope, "");
        return com.paypal.pds.analytics.AnalyticsEventKt.click(analyticsEventScope);
    }
}
