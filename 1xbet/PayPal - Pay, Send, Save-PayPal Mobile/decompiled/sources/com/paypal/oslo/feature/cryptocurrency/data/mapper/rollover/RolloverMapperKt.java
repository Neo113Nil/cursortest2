package com.paypal.oslo.feature.cryptocurrency.data.mapper.rollover;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$Data;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rollover/ClaimRolloverResult;", "toDomain", "(Lcom/paypal/oslo/feature/cryptocurrency/graphql/CreateCryptocurrencyRolloverMutation$Data;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/rollover/ClaimRolloverResult;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RolloverMapperKt {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult toDomain(com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.cryptocurrency.graphql.CreateCryptocurrencyRolloverMutation.RolloverCryptocurrency rolloverCryptocurrency = data.getRolloverCryptocurrency();
        if (rolloverCryptocurrency == null) {
            throw new java.lang.IllegalStateException("Rollover data is null".toString());
        }
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.rollover.ClaimRolloverResult(rolloverCryptocurrency.getId());
    }
}
