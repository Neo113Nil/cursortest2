package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\t\u001a\u00020\b*\u00020\u00042\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a+\u0010\t\u001a\u00020\f*\u00020\u000b2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\r\u001a+\u0010\t\u001a\u00020\u000f*\u00020\u000e2\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo;", "Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument;", "toResult", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo;)Lcom/paypal/oslo/feature/wallet/api/domain/model/ProvisionedInstrument;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;", "", "", com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY, "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$Card;", "toInstrumentInfo", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/CardInfo;Ljava/util/Map;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$Card;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$BankAccount;", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;Ljava/util/Map;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$BankAccount;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$PaymentToken;", "(Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/PaymentTokenInfo;Ljava/util/Map;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/ProvisionInstrumentInfo$PaymentToken;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProvisionInstrumentsViewModelKt {
    public static final com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument toResult(com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo provisionInstrumentInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisionInstrumentInfo, "");
        if (provisionInstrumentInfo instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount) {
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount bankAccount = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount) provisionInstrumentInfo;
            return new com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.BankAccount(bankAccount.getBankAccountInfo().getIssuerName(), bankAccount.getBankAccountInfo().getLastNChars(), bankAccount.getBankAccountInfo().getType());
        }
        if (provisionInstrumentInfo instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card) {
            com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card card = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card) provisionInstrumentInfo;
            java.lang.String issuerName = card.getCardInfo().getIssuerName();
            if (issuerName == null) {
                issuerName = "";
            }
            java.lang.String lastNChars = card.getCardInfo().getLastNChars();
            return new com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.Card(issuerName, lastNChars != null ? lastNChars : "", card.getCardInfo().getProductClass().name());
        }
        if (!(provisionInstrumentInfo instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken paymentToken = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken) provisionInstrumentInfo;
        return new com.paypal.oslo.feature.wallet.api.domain.model.ProvisionedInstrument.PaymentToken(paymentToken.getPaymentTokenInfo().getProductDisplayName(), paymentToken.getPaymentTokenInfo().getIssuerName(), "");
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card toInstrumentInfo$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        return toInstrumentInfo(cardInfo, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card toInstrumentInfo(com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo cardInfo, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardInfo, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.Card(new com.paypal.oslo.feature.wallet.amexandp3.domain.model.CardInfo(cardInfo.getId(), cardInfo.getLastNChars(), cardInfo.getProductClass(), cardInfo.getIssuerName(), null, cardInfo.getInstrumentArt(), 16, null), map != null ? map.get(cardInfo.getId()) : null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount toInstrumentInfo$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        return toInstrumentInfo(bankAccountInfo, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount toInstrumentInfo(com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountInfo, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.BankAccount(new com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo(bankAccountInfo.getId(), bankAccountInfo.getLastNChars(), bankAccountInfo.getType(), bankAccountInfo.getIssuerName(), bankAccountInfo.getInstrumentArt()), map != null ? map.get(bankAccountInfo.getId()) : null);
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken toInstrumentInfo$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            map = null;
        }
        return toInstrumentInfo(paymentTokenInfo, (java.util.Map<java.lang.String, java.lang.String>) map);
    }

    public static final com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken toInstrumentInfo(com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo paymentTokenInfo, java.util.Map<java.lang.String, java.lang.String> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentTokenInfo, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.ProvisionInstrumentInfo.PaymentToken(new com.paypal.oslo.feature.wallet.amexandp3.domain.model.PaymentTokenInfo(paymentTokenInfo.getId(), null, paymentTokenInfo.getIssuerName(), paymentTokenInfo.getProductDisplayName(), null, null, paymentTokenInfo.getInstrumentArt(), paymentTokenInfo.getCurrencyCode(), paymentTokenInfo.getBalanceValue(), 50, null), map != null ? map.get(paymentTokenInfo.getId()) : null);
    }
}
