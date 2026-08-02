package com.paypal.oslo.feature.moneymovement.ui.shared.utils;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;", "currency", "", "countryCode", "Landroidx/compose/ui/graphics/painter/Painter;", "rememberCurrencyPainter", "(Lcom/paypal/oslo/feature/moneymovement/api/shared/domain/MoneyAmount;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CurrencyPainterKt {
    public static final androidx.compose.ui.graphics.painter.Painter rememberCurrencyPainter(com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount moneyAmount, java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberFlagPainter;
        java.lang.String str2;
        com.paypal.oslo.feature.moneymovement.api.shared.domain.MoneyAmount.CryptoDetails crypto;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1417549969, i, -1, "com.paypal.oslo.feature.moneymovement.ui.shared.utils.rememberCurrencyPainter (CurrencyPainter.kt:36)");
        }
        java.lang.String name2 = (moneyAmount == null || (crypto = moneyAmount.getCrypto()) == null) ? null : crypto.getName();
        if ((moneyAmount != null ? moneyAmount.getType() : null) == com.paypal.oslo.feature.moneymovement.api.shared.domain.CurrencyType.CRYPTO && (str2 = name2) != null && str2.length() != 0) {
            composer.startReplaceGroup(2112896773);
            com.paypal.oslo.core.commonui.components.AsyncImagePainter rememberAsyncImagePainter = com.paypal.oslo.core.commonui.components.AsyncImageKt.rememberAsyncImagePainter(com.paypal.oslo.feature.moneymovement.ui.shared.utils.CryptoLogoUtilsKt.cryptoLogoUrl(name2), null, null, null, null, composer, 0, 30);
            composer.endReplaceGroup();
            rememberFlagPainter = rememberAsyncImagePainter;
        } else {
            composer.startReplaceGroup(2112979915);
            if (str == null) {
                str = "";
            }
            rememberFlagPainter = com.paypal.pds.core.FlagKt.rememberFlagPainter(str, com.paypal.pds.core.FlagSize.XSmall.INSTANCE, composer, com.paypal.pds.core.FlagSize.XSmall.$stable << 3, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return rememberFlagPainter;
    }
}
