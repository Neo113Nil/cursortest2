package io.appmetrica.analytics.adrevenue.admob.v23.impl;

/* loaded from: classes.dex */
public final class b {
    public static io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue a(com.google.android.gms.ads.AdValue adValue, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType moduleAdType, java.lang.String str, com.google.android.gms.ads.ResponseInfo responseInfo, java.lang.String str2) {
        com.google.android.gms.ads.AdapterResponseInfo loadedAdapterResponseInfo;
        double finiteDoubleOrDefault = io.appmetrica.analytics.coreutils.internal.WrapUtils.getFiniteDoubleOrDefault(adValue.getValueMicros() / 1000000.0d, com.yandex.varioqub.config.model.ConfigValue.DOUBLE_DEFAULT_VALUE);
        java.lang.String str3 = "PUBLISHER_PROVIDED";
        if (responseInfo != null && (loadedAdapterResponseInfo = responseInfo.getLoadedAdapterResponseInfo()) != null) {
            java.math.BigDecimal valueOf = java.math.BigDecimal.valueOf(finiteDoubleOrDefault);
            java.util.Currency currency = java.util.Currency.getInstance(adValue.getCurrencyCode());
            java.lang.String adapterClassName = loadedAdapterResponseInfo.getAdapterClassName();
            java.lang.String adSourceInstanceId = loadedAdapterResponseInfo.getAdSourceInstanceId();
            java.lang.String adSourceInstanceName = loadedAdapterResponseInfo.getAdSourceInstanceName();
            int precisionType = adValue.getPrecisionType();
            java.lang.String str4 = precisionType == 0 ? "UNKNOWN" : precisionType == 1 ? "ESTIMATED" : precisionType == 2 ? "PUBLISHER_PROVIDED" : precisionType == 3 ? "PRECISE" : "";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str);
            hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-admob-v23");
            hashMap.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, "admob");
            return new io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue(valueOf, currency, moduleAdType, adapterClassName, str2, null, adSourceInstanceId, adSourceInstanceName, str4, hashMap, false);
        }
        java.math.BigDecimal valueOf2 = java.math.BigDecimal.valueOf(finiteDoubleOrDefault);
        java.util.Currency currency2 = java.util.Currency.getInstance(adValue.getCurrencyCode());
        int precisionType2 = adValue.getPrecisionType();
        if (precisionType2 == 0) {
            str3 = "UNKNOWN";
        } else if (precisionType2 == 1) {
            str3 = "ESTIMATED";
        } else if (precisionType2 != 2) {
            str3 = precisionType2 == 3 ? "PRECISE" : "";
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str);
        hashMap2.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-admob-v23");
        hashMap2.put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, "admob");
        return new io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue(valueOf2, currency2, moduleAdType, null, str2, null, null, null, str3, hashMap2, false);
    }
}
