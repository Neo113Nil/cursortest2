package com.paypal.oslo.feature.businesscustomers.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;", "", "attemptId", "Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;", "toBusinessFlowContext", "(Lcom/paypal/oslo/feature/businesscustomers/navigation/CustomersPresentationMode;Ljava/lang/String;)Lcom/paypal/oslo/core/telemetry/analytics/schema/context/standard/BusinessFlowContext;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalDestinationsKt {
    public static /* synthetic */ com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext toBusinessFlowContext$default(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return toBusinessFlowContext(customersPresentationMode, str);
    }

    public static final com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext toBusinessFlowContext(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, java.lang.String str) {
        java.lang.String str2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersPresentationMode, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(customersPresentationMode, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.View.INSTANCE)) {
            str2 = "view_customers";
        } else {
            if (!(customersPresentationMode instanceof com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode.Select)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str2 = "select_customer";
        }
        return new com.paypal.oslo.core.telemetry.analytics.schema.context.standard.BusinessFlowContext(str2, str);
    }
}
