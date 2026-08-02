package com.paypal.oslo.feature.wallet.cards.ui.scan;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;", "toCardScanError", "(I)Lcom/paypal/oslo/feature/wallet/cards/ui/scan/CardScanError;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardScanErrorKt {
    public static final com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError toCardScanError(int i) {
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Cancelled.INSTANCE;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.ApiFailure.INSTANCE;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.CameraError.INSTANCE;
        }
        return new com.paypal.oslo.feature.wallet.cards.ui.scan.CardScanError.Unknown(i);
    }
}
