package com.paypal.oslo.feature.p2p.navigation;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasAmexCard", "", "screenTitle", "Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config;", "createAddFIConfig", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/wallet/api/ui/fi/add/config/AddFI$Config;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddFINavigationUtilsKt {
    public static final com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config createAddFIConfig(boolean z, java.lang.String str) {
        java.util.Map emptyMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.BANK, new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.ItemConfig((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.DEBIT_CARD, new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.ItemConfig((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)), kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.CREDIT_CARD, new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.ItemConfig((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        if (!z) {
            emptyMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.FiType.AMEX_SEND, new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.ItemConfig((java.lang.String) null, (java.lang.String) null, 3, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        } else {
            emptyMap = kotlin.collections.MapsKt.emptyMap();
        }
        return new com.paypal.oslo.feature.wallet.api.ui.fi.add.config.AddFI.Config((java.lang.String) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, (com.paypal.oslo.feature.wallet.api.ui.config.WalletUIModels.NavAction) null, str, (java.lang.String) null, kotlin.collections.MapsKt.plus(mapOf, emptyMap), 23, (kotlin.jvm.internal.DefaultConstructorMarker) null);
    }
}
