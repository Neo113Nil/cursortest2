package com.paypal.oslo.feature.bnplservicing.data.mapper.common;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;", "Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;", "Lcom/paypal/oslo/feature/bnplservicing/graphql/type/BNPLCreditProductIdentifier;", "toBNPLCreditProductIdentifier", "(Lcom/paypal/oslo/feature/bnplservicing/domain/model/common/CreditProductIdentifier;)Lcom/paypal/oslo/api/graphql/schema/type/BNPLCreditProductIdentifier;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreditProductIdentifierMapperKt {
    public static final com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier toBNPLCreditProductIdentifier(com.paypal.oslo.feature.bnplservicing.domain.model.common.CreditProductIdentifier creditProductIdentifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditProductIdentifier, "");
        return com.paypal.oslo.api.graphql.schema.type.BNPLCreditProductIdentifier.INSTANCE.safeValueOf(creditProductIdentifier.name());
    }
}
