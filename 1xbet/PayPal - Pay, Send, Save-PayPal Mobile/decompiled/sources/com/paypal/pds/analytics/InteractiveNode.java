package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00028\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00028\u00008\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/pds/analytics/InteractiveNode;", com.visa.cbp.getEncExpo.warmup, "Lcom/paypal/pds/analytics/AnalyticsLeafNode;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "producer", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "", "update", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/ui/Modifier$Node;", "createDelegator", "()Landroidx/compose/ui/node/ModifierNodeElement;", "Ljava/lang/Object;", "getListener$analytics_release", "()Ljava/lang/Object;", "setListener$analytics_release", "(Ljava/lang/Object;)V", "Lkotlin/jvm/functions/Function1;", "getProducer$analytics_release", "()Lkotlin/jvm/functions/Function1;", "setProducer$analytics_release", "(Lkotlin/jvm/functions/Function1;)V", "nestedNode", "Landroidx/compose/ui/Modifier$Node;", "getNestedNode", "()Landroidx/compose/ui/Modifier$Node;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public abstract class InteractiveNode<I> extends com.paypal.pds.analytics.AnalyticsLeafNode {
    public static final int $stable = 8;
    private I listener;
    private final androidx.compose.ui.Modifier.Node nestedNode;
    private kotlin.jvm.functions.Function1<? super I, ? extends androidx.compose.ui.Modifier> producer;

    public abstract androidx.compose.ui.node.ModifierNodeElement<androidx.compose.ui.Modifier.Node> createDelegator();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveNode(I i, kotlin.jvm.functions.Function1<? super I, ? extends androidx.compose.ui.Modifier> function1) {
        super(null, null, 3, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.listener = i;
        this.producer = function1;
        androidx.compose.ui.Modifier.Node getHighResolutionOutputSizeshNQ4ISI = createDelegator().getGetHighResolutionOutputSizeshNQ4ISI();
        delegate(getHighResolutionOutputSizeshNQ4ISI);
        this.nestedNode = getHighResolutionOutputSizeshNQ4ISI;
    }

    public final I getListener$analytics_release() {
        return this.listener;
    }

    public final void setListener$analytics_release(I i) {
        this.listener = i;
    }

    public final kotlin.jvm.functions.Function1<I, androidx.compose.ui.Modifier> getProducer$analytics_release() {
        return this.producer;
    }

    public final void setProducer$analytics_release(kotlin.jvm.functions.Function1<? super I, ? extends androidx.compose.ui.Modifier> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.producer = function1;
    }

    public final androidx.compose.ui.Modifier.Node getNestedNode() {
        return this.nestedNode;
    }

    public final void update(I listener, kotlin.jvm.functions.Function1<? super I, ? extends androidx.compose.ui.Modifier> producer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(producer, "");
        this.listener = listener;
        this.producer = producer;
        createDelegator().update(this.nestedNode);
    }
}
