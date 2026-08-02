package com.paypal.oslo.feature.cryptocurrency.ui.common.formatter;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/formatter/CryptoAmountFormatter;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/AssetQuantity;", "assetQuantity", "", "formatCryptoAmount", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/common/AssetQuantity;)Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAmountFormatter {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CryptoAmountFormatter() {
    }

    public final java.lang.String formatCryptoAmount(com.paypal.oslo.feature.cryptocurrency.domain.model.common.AssetQuantity assetQuantity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
        java.lang.String quantity = assetQuantity.getQuantity();
        java.lang.String assetSymbol = assetQuantity.getAssetSymbol();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(quantity);
        sb.append(" ");
        sb.append(assetSymbol);
        return sb.toString();
    }
}
