package com.paypal.oslo.feature.revolvingcreditservicing.api.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "path", "queryParam", "Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;", "parseCreditProductIdentifier", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/api/model/CreditProductIdentifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DestinationsKt {
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier parseCreditProductIdentifier$default(java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return parseCreditProductIdentifier(str, str2);
    }

    public static final com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier parseCreditProductIdentifier(java.lang.String str, java.lang.String str2) {
        com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier fromString = str2 != null ? com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.INSTANCE.fromString(str2) : null;
        return (fromString == null || fromString == com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN) ? (str == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "paypal-credit/us", false, 2, (java.lang.Object) null)) ? (str == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "cashback", false, 2, (java.lang.Object) null)) ? (str == null || !kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "rewards-card", false, 2, (java.lang.Object) null)) ? com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.UNKNOWN : com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US : com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US : com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier.PAYPAL_CREDIT_CARD_US : fromString;
    }
}
