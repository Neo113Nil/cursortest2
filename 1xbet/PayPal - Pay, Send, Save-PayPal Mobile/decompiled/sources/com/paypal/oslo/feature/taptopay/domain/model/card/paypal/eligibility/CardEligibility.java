package com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/eligibility/CardEligibility;", "", "", "isEligible", "()Z", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "getId", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "id", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "getType", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "type", "", "getBrand", "()Ljava/lang/String;", "brand", "getDescription", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "getLast4", "last4", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "getCardArtCollection", "()Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/art/CardArtCollection;", "cardArtCollection"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface CardEligibility {
    java.lang.String getBrand();

    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.art.CardArtCollection getCardArtCollection();

    java.lang.String getDescription();

    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId getId();

    java.lang.String getLast4();

    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType getType();

    boolean isEligible();
}
