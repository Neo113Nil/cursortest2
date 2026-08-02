package com.paypal.oslo.feature.bnplacquisition.domain.model.fundingInstrument;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0001\u0002\n\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrument;", "", "", "getId", "()Ljava/lang/String;", "id", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FundingInstrumentType;", "getFundingInstrumentType", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/enums/FundingInstrumentType;", "fundingInstrumentType", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentBank;", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/fundingInstrument/FundingInstrumentCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface FundingInstrument {
    com.paypal.oslo.feature.bnplacquisition.domain.model.enums.FundingInstrumentType getFundingInstrumentType();

    java.lang.String getId();
}
