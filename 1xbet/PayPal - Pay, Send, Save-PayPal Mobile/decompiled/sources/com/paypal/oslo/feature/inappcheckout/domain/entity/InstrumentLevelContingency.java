package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\u0006\u0007\b\t\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentLevelContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "", "getFundingInstrument", "()Ljava/lang/String;", "fundingInstrument", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/BankAccountBalanceRequiredContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/InstrumentLevelUnknownContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/PreAuthRequiredContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ThreeDsContingency;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/UserConsentForBankAccountInfoContingency;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface InstrumentLevelContingency extends com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity {
    java.lang.String getFundingInstrument();
}
