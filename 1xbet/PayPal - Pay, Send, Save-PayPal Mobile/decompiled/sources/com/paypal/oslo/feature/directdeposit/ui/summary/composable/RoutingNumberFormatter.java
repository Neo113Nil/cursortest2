package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/directdeposit/ui/summary/composable/RoutingNumberFormatter;", "", "<init>", "()V", "", "routingNumber", "formatRoutingNumber", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoutingNumberFormatter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.directdeposit.ui.summary.composable.RoutingNumberFormatter INSTANCE = new com.paypal.oslo.feature.directdeposit.ui.summary.composable.RoutingNumberFormatter();

    private RoutingNumberFormatter() {
    }

    public final java.lang.String formatRoutingNumber(java.lang.String routingNumber) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
        return routingNumber.length() == 0 ? routingNumber : kotlin.collections.CollectionsKt.joinToString$default(kotlin.text.StringsKt.chunked(kotlin.text.StringsKt.replace$default(routingNumber, " ", "", false, 4, (java.lang.Object) null), 3), " ", null, null, 0, null, null, 62, null);
    }
}
