package com.paypal.oslo.feature.oneonboarding.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "toErrorMessage", "(Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;Landroid/content/Context;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContextualErrorMapperKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        if (r4.equals(com.paypal.oslo.feature.oneonboarding.domain.error.FlowStepError.GENERIC_ERROR) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0072, code lost:
    
        r4 = r5.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_api_error_title);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0086, code lost:
    
        return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(r4, r5.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_api_error_description));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r4.equals("GRAPHQL_ERROR") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage toErrorMessage(com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String issue = contextualInfo.getIssue();
        switch (issue.hashCode()) {
            case -1372995086:
                break;
            case -879828873:
                if (issue.equals("NETWORK_ERROR")) {
                    java.lang.String string = context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_network_title);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(string, context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_network_description));
                }
                return null;
            case 170159456:
                break;
            case 494083863:
                if (issue.equals(com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorIssues.ACCOUNT_SSN_ALREADY_IN_USE)) {
                    java.lang.String string2 = context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_ssn_error_description);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                    return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(string2, null, 2, null);
                }
                return null;
            case 1249598412:
                if (issue.equals(com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorIssues.CIP_VERIFICATION_FAILED)) {
                    java.lang.String string3 = context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_cip_error_description);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                    return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(string3, null, 2, null);
                }
                return null;
            default:
                return null;
        }
    }
}
