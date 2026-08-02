package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnDebitInstrumentsComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/debit/DebitInstrumentsProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnDebitInstrumentsComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/debit/DebitInstrumentsProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$DebitInstrument;", "Lcom/paypal/oslo/feature/wallet/me/domain/debit/DebitInstrumentsOverview;", "asDebitInstrument", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$DebitInstrument;)Lcom/paypal/oslo/feature/wallet/me/domain/debit/DebitInstrumentsOverview;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class DebitInstrumentsComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnDebitInstrumentsComponent onDebitInstrumentsComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onDebitInstrumentsComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet6 wallet = onDebitInstrumentsComponent.getWallet();
        com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsOverview debitInstrumentsOverview = null;
        if (wallet == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.DebitInstrument> debitInstruments = wallet.getDebitInstruments();
        if (debitInstruments != null) {
            java.util.Iterator<T> it = debitInstruments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsOverview asDebitInstrument = asDebitInstrument((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.DebitInstrument) it.next());
                if (asDebitInstrument != null) {
                    debitInstrumentsOverview = asDebitInstrument;
                    break;
                }
            }
        }
        return new com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsProduct(true, debitInstrumentsOverview);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsOverview asDebitInstrument(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.DebitInstrument debitInstrument) {
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Front front;
        java.lang.Object referenceUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitInstrument, "");
        java.lang.Object lastNChars = debitInstrument.getLastNChars();
        java.lang.String str = null;
        java.lang.String obj = lastNChars != null ? lastNChars.toString() : null;
        com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName productName = debitInstrument.getProductName();
        java.lang.String rawValue = productName != null ? productName.getRawValue() : null;
        if (obj == null || rawValue == null) {
            return null;
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.SmallImage smallImage = debitInstrument.getSmallImage();
        if (smallImage != null && (front = smallImage.getFront()) != null && (referenceUrl = front.getReferenceUrl()) != null) {
            str = referenceUrl.toString();
        }
        return new com.paypal.oslo.feature.wallet.me.domain.debit.DebitInstrumentsOverview(rawValue, obj, str);
    }
}
