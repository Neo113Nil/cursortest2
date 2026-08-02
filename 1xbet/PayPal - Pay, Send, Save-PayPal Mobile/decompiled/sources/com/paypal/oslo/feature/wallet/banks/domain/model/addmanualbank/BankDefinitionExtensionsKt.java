package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\" \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;", "", "getIssuerCountryName", "(Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDefinition;)Ljava/lang/String;", "issuerCountryName", "", "Camera2StreamConfigurationMap", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDefinitionExtensionsKt {
    private static final java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("USD", "United States"), kotlin.TuplesKt.to("CAD", "Canada"), kotlin.TuplesKt.to("MXN", "Mexico"), kotlin.TuplesKt.to(com.paypal.oslo.feature.savings.constants.SavingsConstants.Currency.EUR, "European Union"), kotlin.TuplesKt.to("GBP", "United Kingdom"), kotlin.TuplesKt.to("CHF", "Switzerland"), kotlin.TuplesKt.to("NOK", "Norway"), kotlin.TuplesKt.to("SEK", "Sweden"), kotlin.TuplesKt.to("DKK", "Denmark"), kotlin.TuplesKt.to("PLN", "Poland"), kotlin.TuplesKt.to("CZK", "Czech Republic"), kotlin.TuplesKt.to("HUF", "Hungary"), kotlin.TuplesKt.to("RON", "Romania"), kotlin.TuplesKt.to("JPY", "Japan"), kotlin.TuplesKt.to("CNY", "China"), kotlin.TuplesKt.to("HKD", "Hong Kong"), kotlin.TuplesKt.to("SGD", "Singapore"), kotlin.TuplesKt.to("KRW", "South Korea"), kotlin.TuplesKt.to("INR", "India"), kotlin.TuplesKt.to("AUD", "Australia"), kotlin.TuplesKt.to("NZD", "New Zealand"), kotlin.TuplesKt.to("THB", "Thailand"), kotlin.TuplesKt.to("MYR", "Malaysia"), kotlin.TuplesKt.to("PHP", "Philippines"), kotlin.TuplesKt.to("IDR", "Indonesia"), kotlin.TuplesKt.to("VND", "Vietnam"), kotlin.TuplesKt.to("AED", "United Arab Emirates"), kotlin.TuplesKt.to("SAR", "Saudi Arabia"), kotlin.TuplesKt.to("ILS", "Israel"), kotlin.TuplesKt.to("ZAR", "South Africa"), kotlin.TuplesKt.to("EGP", "Egypt"), kotlin.TuplesKt.to("BRL", "Brazil"), kotlin.TuplesKt.to("ARS", "Argentina"), kotlin.TuplesKt.to("CLP", "Chile"), kotlin.TuplesKt.to("COP", "Colombia"), kotlin.TuplesKt.to("PEN", "Peru"));

    public static final java.lang.String getIssuerCountryName(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDefinition bankDefinition) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDefinition, "");
        java.lang.String currencyCode = bankDefinition.getCurrencyCode();
        java.util.Map<java.lang.String, java.lang.String> map = Camera2StreamConfigurationMap;
        java.lang.String upperCase = currencyCode.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        java.lang.String str = map.get(upperCase);
        if (str != null) {
            return str;
        }
        java.lang.String upperCase2 = currencyCode.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
        return upperCase2;
    }
}
