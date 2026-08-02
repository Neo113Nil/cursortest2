package com.paypal.oslo.feature.cryptocurrency.ui.common.util;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/CryptoAssetSymbol;", "", "getLogoUrl", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/common/util/CryptoAssetSymbol;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CryptoAssetSymbolKt {
    public static final java.lang.String getLogoUrl(com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol cryptoAssetSymbol, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoAssetSymbol, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2114059309, i, -1, "com.paypal.oslo.feature.cryptocurrency.ui.common.util.getLogoUrl (CryptoAssetSymbol.kt:86)");
        }
        java.lang.String str = com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbolKt.WhenMappings.$EnumSwitchMapping$0[cryptoAssetSymbol.ordinal()] == 1 ? "https://www.paypalobjects.com/cryptocurrency/coin-paypal-coin.png" : "";
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return str;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.values().length];
            try {
                iArr[com.paypal.oslo.feature.cryptocurrency.ui.common.util.CryptoAssetSymbol.PYUSD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
