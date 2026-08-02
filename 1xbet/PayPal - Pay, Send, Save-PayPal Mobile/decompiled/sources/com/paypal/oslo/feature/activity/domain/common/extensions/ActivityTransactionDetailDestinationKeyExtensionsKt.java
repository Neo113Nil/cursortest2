package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u00020\u0004*\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;", "Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "toActivityTransactionDto", "(Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;)Lcom/paypal/oslo/feature/activity/api/models/ActivityTransactionDto;", "", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/activity/api/navigation/PayPalActivityTransactionDetailScreenDestinationKey;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityTransactionDetailDestinationKeyExtensionsKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
    
        if (r4 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto toActivityTransactionDto(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String paymentType;
        java.lang.String type;
        java.lang.String highSpeedVideoSizes = getHighSpeedVideoSizes(payPalActivityTransactionDetailScreenDestinationKey);
        java.lang.String sourcePage = payPalActivityTransactionDetailScreenDestinationKey != null ? payPalActivityTransactionDetailScreenDestinationKey.getSourcePage() : null;
        java.lang.String str3 = sourcePage;
        if (str3 == null || kotlin.text.StringsKt.isBlank(str3)) {
            sourcePage = null;
        }
        if (sourcePage == null) {
            sourcePage = payPalActivityTransactionDetailScreenDestinationKey != null ? payPalActivityTransactionDetailScreenDestinationKey.getSource() : null;
            java.lang.String str4 = sourcePage;
            if (str4 == null || kotlin.text.StringsKt.isBlank(str4)) {
                sourcePage = null;
            }
            if (sourcePage == null) {
                sourcePage = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_DEEP_LINK;
            }
        }
        java.lang.String str5 = sourcePage;
        if (payPalActivityTransactionDetailScreenDestinationKey != null && (type = payPalActivityTransactionDetailScreenDestinationKey.getType()) != null && (str = kotlin.text.StringsKt.trim(type).toString()) != null) {
            if (kotlin.text.StringsKt.isBlank(str)) {
                str = null;
            }
        }
        if (payPalActivityTransactionDetailScreenDestinationKey == null || (paymentType = payPalActivityTransactionDetailScreenDestinationKey.getPaymentType()) == null || (str = kotlin.text.StringsKt.trim(paymentType).toString()) == null || kotlin.text.StringsKt.isBlank(str)) {
            str = null;
        }
        if (str == null) {
            java.lang.String groupId = payPalActivityTransactionDetailScreenDestinationKey != null ? payPalActivityTransactionDetailScreenDestinationKey.getGroupId() : null;
            if (groupId != null && !kotlin.text.StringsKt.isBlank(groupId)) {
                str2 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.MONEY_REQUEST;
            } else if (!kotlin.text.StringsKt.startsWith(getHighSpeedVideoSizes(payPalActivityTransactionDetailScreenDestinationKey), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, true)) {
                str2 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT;
            } else {
                str2 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER;
            }
            java.lang.String groupId2 = payPalActivityTransactionDetailScreenDestinationKey == null ? payPalActivityTransactionDetailScreenDestinationKey.getGroupId() : null;
            if (payPalActivityTransactionDetailScreenDestinationKey != null || (r6 = payPalActivityTransactionDetailScreenDestinationKey.getTransactionShortDescription()) == null) {
                java.lang.String str6 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT;
            }
            return new com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto(highSpeedVideoSizes, groupId2, str2, str6, str5, payPalActivityTransactionDetailScreenDestinationKey == null ? payPalActivityTransactionDetailScreenDestinationKey.isShipmentAvailable() : null, payPalActivityTransactionDetailScreenDestinationKey == null ? payPalActivityTransactionDetailScreenDestinationKey.getSubdomainId() : null, payPalActivityTransactionDetailScreenDestinationKey == null ? payPalActivityTransactionDetailScreenDestinationKey.getSubdomainType() : null);
        }
        str2 = str;
        if (payPalActivityTransactionDetailScreenDestinationKey == null) {
        }
        if (payPalActivityTransactionDetailScreenDestinationKey != null) {
        }
        java.lang.String str62 = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.PAYMENT;
        return new com.paypal.oslo.feature.activity.api.models.ActivityTransactionDto(highSpeedVideoSizes, groupId2, str2, str62, str5, payPalActivityTransactionDetailScreenDestinationKey == null ? payPalActivityTransactionDetailScreenDestinationKey.isShipmentAvailable() : null, payPalActivityTransactionDetailScreenDestinationKey == null ? payPalActivityTransactionDetailScreenDestinationKey.getSubdomainId() : null, payPalActivityTransactionDetailScreenDestinationKey == null ? payPalActivityTransactionDetailScreenDestinationKey.getSubdomainType() : null);
    }

    private static final java.lang.String getHighSpeedVideoSizes(com.paypal.oslo.feature.activity.api.navigation.PayPalActivityTransactionDetailScreenDestinationKey payPalActivityTransactionDetailScreenDestinationKey) {
        java.lang.String myAccountPathTransactionId = payPalActivityTransactionDetailScreenDestinationKey != null ? payPalActivityTransactionDetailScreenDestinationKey.getMyAccountPathTransactionId() : null;
        java.lang.String str = myAccountPathTransactionId;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            myAccountPathTransactionId = null;
        }
        if (myAccountPathTransactionId == null) {
            myAccountPathTransactionId = payPalActivityTransactionDetailScreenDestinationKey != null ? payPalActivityTransactionDetailScreenDestinationKey.getId() : null;
            java.lang.String str2 = myAccountPathTransactionId;
            if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
                myAccountPathTransactionId = null;
            }
            if (myAccountPathTransactionId == null) {
                java.lang.String activityItemId = payPalActivityTransactionDetailScreenDestinationKey != null ? payPalActivityTransactionDetailScreenDestinationKey.getActivityItemId() : null;
                java.lang.String str3 = activityItemId;
                java.lang.String str4 = str3 == null || kotlin.text.StringsKt.isBlank(str3) ? null : activityItemId;
                return str4 == null ? "" : str4;
            }
        }
        return myAccountPathTransactionId;
    }
}
