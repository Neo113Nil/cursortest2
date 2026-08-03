package com.fyber.marketplace.fairbid.bridge;

/* loaded from: classes3.dex */
public interface MarketplaceAuctionParameters {
    java.lang.String getAdvertisingId();

    java.lang.String getAmazonAdvertisingId();

    java.lang.String getAppVersion();

    java.lang.String getBundleId();

    java.lang.String getCarrier();

    java.lang.String getDeviceModel();

    com.fyber.inneractive.sdk.config.global.r getFeatureProvider(java.lang.String str);

    int getHeight();

    @java.lang.Deprecated
    java.lang.String getHorizontalAccuracy();

    java.util.List<java.lang.String> getInputLanguages();

    java.lang.String getLanguage();

    @java.lang.Deprecated
    java.lang.String getLatitudeLongitude();

    org.json.JSONObject getMarketplaceEntry();

    java.lang.String getMobileCountryCode();

    java.lang.String getMobileNetworkCode();

    java.lang.String getNetwork();

    java.util.List<java.lang.Integer> getSupportedApis();

    java.util.List<java.lang.Integer> getSupportedProtocols();

    int getSupportedTypesBitwise();

    @java.lang.Deprecated
    java.lang.String getTimeAccuracy();

    @java.lang.Deprecated
    java.lang.String getVerticalAccuracy();

    int getWidth();

    boolean hasAmazonAdvertisingId();

    java.lang.Boolean isLimitTrackingEnabled();
}
