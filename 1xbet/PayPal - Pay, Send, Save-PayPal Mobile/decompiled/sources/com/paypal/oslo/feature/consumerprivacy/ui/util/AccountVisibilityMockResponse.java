package com.paypal.oslo.feature.consumerprivacy.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/ui/util/AccountVisibilityMockResponse;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;", "getAccountVisibilityMockData", "()Lcom/paypal/oslo/feature/consumerprivacy/domain/model/AccountVisibilityData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccountVisibilityMockResponse {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.consumerprivacy.ui.util.AccountVisibilityMockResponse INSTANCE = new com.paypal.oslo.feature.consumerprivacy.ui.util.AccountVisibilityMockResponse();

    private AccountVisibilityMockResponse() {
    }

    public final com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData getAccountVisibilityMockData() {
        com.paypal.oslo.api.graphql.schema.type.SearchPolicyType searchPolicyType = com.paypal.oslo.api.graphql.schema.type.SearchPolicyType.SIMPLIFIED;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        return new com.paypal.oslo.feature.consumerprivacy.domain.model.AccountVisibilityData(searchPolicyType, bool, bool, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType.CONTACTS_ONLY, bool, null, null, null, null, null, null, null, null, null, null);
    }
}
