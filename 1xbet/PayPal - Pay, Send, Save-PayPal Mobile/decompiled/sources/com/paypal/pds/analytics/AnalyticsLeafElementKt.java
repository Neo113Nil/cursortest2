package com.paypal.pds.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a+\u0010\u0005\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier$Node;", "", "", "Lcom/paypal/pds/analytics/TypedKey;", "", "buildAnalyticsChain", "(Landroidx/compose/ui/Modifier$Node;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AnalyticsLeafElementKt {
    public static final java.util.List<java.util.Map<? extends com.paypal.pds.analytics.TypedKey<?>, java.lang.Object>> buildAnalyticsChain(androidx.compose.ui.Modifier.Node node) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(node, "");
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        androidx.compose.ui.node.TraversableNodeKt.traverseAncestors(node, com.paypal.pds.analytics.AnalyticsNode.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.pds.analytics.AnalyticsLeafElementKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(com.paypal.pds.analytics.AnalyticsLeafElementKt.$r8$lambda$r9tVk8B2kmHJUWKwaLsMlUuk4sI(arrayList, (androidx.compose.ui.node.TraversableNode) obj));
            }
        });
        return arrayList;
    }

    public static /* synthetic */ boolean $r8$lambda$r9tVk8B2kmHJUWKwaLsMlUuk4sI(java.util.List list, androidx.compose.ui.node.TraversableNode traversableNode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traversableNode, "");
        list.add(((com.paypal.pds.analytics.AnalyticsNode) traversableNode).getParams());
        return true;
    }
}
