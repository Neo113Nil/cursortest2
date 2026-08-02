package com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;", "toAddressErrorMessage", "(Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;Landroid/content/Context;)Lcom/paypal/oslo/feature/oneonboarding/domain/error/ContextualErrorMessage;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressContextualErrorMapperKt {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00a7, code lost:
    
        r4 = r5.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_could_not_validate_address_description);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b5, code lost:
    
        return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(r4, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
    
        if (r4.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressPostalCodeFormat) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r4.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressAdminArea2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0068, code lost:
    
        if (r4.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressAdminArea1) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if (r4.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddressPostalCode) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001d, code lost:
    
        if (r4.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.AddressFieldRegexMismatch) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x004a, code lost:
    
        r4 = r5.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_invalid_pattern_error);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0058, code lost:
    
        return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(r4, null, 2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.InvalidAddress) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage toAddressErrorMessage(com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo contextualInfo, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextualInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String issue = contextualInfo.getIssue();
        switch (issue.hashCode()) {
            case -998091122:
                break;
            case -654580241:
                if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.AddressContainsRuralRoute)) {
                    java.lang.String string = context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_contains_rural_route_error);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
                    return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(string, null, 2, null);
                }
                return null;
            case -641415693:
                if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.IncompleteAddress)) {
                    java.lang.String string2 = context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_incomplete_address_title);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "");
                    return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(string2, context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_error_incomplete_address_description));
                }
                return null;
            case -620378110:
                break;
            case -620378109:
                break;
            case -426068280:
                break;
            case 225296160:
                if (issue.equals(com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.AddressContextualIssuesKt.AddressContainsPoBox)) {
                    java.lang.String string3 = context.getString(com.paypal.oslo.feature.oneonboarding.R.string.feature_one_onboarding_address_contains_po_box_error);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "");
                    return new com.paypal.oslo.feature.oneonboarding.domain.error.ContextualErrorMessage(string3, null, 2, null);
                }
                return null;
            case 926582124:
                break;
            case 1886817398:
                break;
            default:
                return null;
        }
    }
}
