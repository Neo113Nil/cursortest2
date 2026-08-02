package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "getName", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyName;", "name", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "getOriginApi", "()Lcom/paypal/oslo/feature/inappcheckout/domain/model/ApiName;", "originApi", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentLevelContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/TransactionLevelContingency;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ContingencyEntity {
    com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyName getName();

    com.paypal.oslo.feature.inappcheckout.domain.model.ApiName getOriginApi();
}
