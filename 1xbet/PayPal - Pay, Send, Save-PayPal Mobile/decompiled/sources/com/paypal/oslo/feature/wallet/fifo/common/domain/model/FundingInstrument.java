package com.paypal.oslo.feature.wallet.fifo.common.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u0082\u0001\u0002\u000e\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrument;", "", "", "getId", "()Ljava/lang/String;", "id", "getName", "name", "getLogoUrl", "logoUrl", "Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "getFundingInstrumentType", "()Lcom/paypal/oslo/feature/wallet/common/model/FundingInstrumentType;", "fundingInstrumentType", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentBank;", "Lcom/paypal/oslo/feature/wallet/fifo/common/domain/model/FundingInstrumentCard;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface FundingInstrument {
    com.paypal.oslo.feature.wallet.common.model.FundingInstrumentType getFundingInstrumentType();

    java.lang.String getId();

    java.lang.String getLogoUrl();

    java.lang.String getName();
}
