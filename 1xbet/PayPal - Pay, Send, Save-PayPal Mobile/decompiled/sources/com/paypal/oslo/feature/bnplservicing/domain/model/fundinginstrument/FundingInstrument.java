package com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0003\f\r\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrument;", "", "", "getId", "()Ljava/lang/String;", "id", "getLogoUrl", "logoUrl", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;", "getFundingInstrumentType", "()Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/FundingInstrumentType;", "fundingInstrumentType", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/BankAccount;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/CardAccount;", "Lcom/paypal/oslo/feature/bnplservicing/domain/model/fundinginstrument/PaypalBalanceAccount;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FundingInstrument {
    com.paypal.oslo.feature.bnplservicing.domain.model.fundinginstrument.FundingInstrumentType getFundingInstrumentType();

    java.lang.String getId();

    java.lang.String getLogoUrl();
}
