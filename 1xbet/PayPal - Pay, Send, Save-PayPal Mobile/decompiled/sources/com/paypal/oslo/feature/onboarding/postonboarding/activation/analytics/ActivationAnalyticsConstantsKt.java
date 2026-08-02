package com.paypal.oslo.feature.onboarding.postonboarding.activation.analytics;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/paypal/oslo/feature/onboarding/api/steps/nav/domain/FlowData;", "flowData", "", "resolveCommsTierFeature", "(Ljava/util/List;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ActivationAnalyticsConstantsKt {
    public static final java.lang.String resolveCommsTierFeature(java.util.List<com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData> list) {
        java.lang.Object obj;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj).getKey(), "COMMS_TIER")) {
                break;
            }
        }
        com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData flowData = (com.paypal.oslo.feature.onboarding.api.steps.nav.domain.FlowData) obj;
        return (flowData == null || (value = flowData.getValue()) == null) ? "unknown" : value;
    }
}
