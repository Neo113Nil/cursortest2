package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\""}, d2 = {"Lcom/zettle/sdk/analytics/GdpAdapterImpl;", "Lcom/zettle/sdk/analytics/Gdp$Adapter;", "Lcom/zettle/sdk/core/user/MerchantProvider;", "merchantProvider", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/core/user/MerchantProvider;Lcom/zettle/sdk/meta/AppInfo;)V", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Lcom/zettle/sdk/analytics/Gdp$Session;", "session", "Lcom/zettle/sdk/analytics/Gdp$DataFormatter;", "formatter", "(Lcom/zettle/sdk/core/user/MerchantProvider;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/Platform;Lcom/zettle/sdk/analytics/Gdp$Session;Lcom/zettle/sdk/analytics/Gdp$DataFormatter;)V", "Lcom/zettle/sdk/analytics/Analytics$Event;", "event", "Lorg/json/JSONObject;", "onCreateJson", "(Lcom/zettle/sdk/analytics/Analytics$Event;)Lorg/json/JSONObject;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/analytics/Gdp$DataFormatter;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/user/MerchantProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/meta/Platform;", "Lcom/zettle/sdk/analytics/Gdp$Session;", "", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GdpAdapterImpl implements com.zettle.sdk.analytics.Gdp.Adapter {
    private final com.zettle.sdk.core.user.MerchantProvider Camera2StreamConfigurationMap;
    private final com.zettle.sdk.meta.Platform getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Gdp.Session getHighSpeedVideoSizes;
    private final com.zettle.sdk.analytics.Gdp.DataFormatter getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRanges;
    private final java.lang.String tag;

    public GdpAdapterImpl(com.zettle.sdk.core.user.MerchantProvider merchantProvider, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.Platform platform, com.zettle.sdk.analytics.Gdp.Session session, com.zettle.sdk.analytics.Gdp.DataFormatter dataFormatter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(session, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataFormatter, "");
        this.Camera2StreamConfigurationMap = merchantProvider;
        this.getHighSpeedVideoFpsRanges = appInfo;
        this.getHighResolutionOutputSizeshNQ4ISI = platform;
        this.getHighSpeedVideoSizes = session;
        this.getHighSpeedVideoFpsRangesFor = dataFormatter;
        this.tag = "gdp";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GdpAdapterImpl(com.zettle.sdk.core.user.MerchantProvider merchantProvider, com.zettle.sdk.meta.AppInfo appInfo) {
        this(merchantProvider, appInfo, com.zettle.sdk.meta.Platform.INSTANCE, com.zettle.sdk.analytics.Gdp.Session.INSTANCE, com.zettle.sdk.analytics.Gdp.DataFormatter.INSTANCE.create());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
    }

    @Override // com.zettle.sdk.analytics.Analytics.Adapter
    public final java.lang.String getTag() {
        return this.tag;
    }

    @Override // com.zettle.sdk.analytics.Analytics.Adapter
    public final org.json.JSONObject onCreateJson(com.zettle.sdk.analytics.Analytics.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.zettle.sdk.analytics.Gdp.Event)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("id", this.getHighSpeedVideoFpsRanges.getDeviceId());
        jSONObject.put("appVersion", this.getHighSpeedVideoFpsRanges.getAppVersion());
        jSONObject.put("locale", this.getHighSpeedVideoFpsRanges.getAppLocale());
        jSONObject.put("systemVersion", this.getHighResolutionOutputSizeshNQ4ISI.getInfo().getVersionCode());
        jSONObject.put("manufacturer", this.getHighResolutionOutputSizeshNQ4ISI.getInfo().getDeviceManufacturer());
        jSONObject.put("model", this.getHighResolutionOutputSizeshNQ4ISI.getInfo().getDeviceModel());
        jSONObject.put("applicationIdentifier", this.getHighSpeedVideoFpsRanges.getAppId());
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("device", jSONObject);
        com.zettle.sdk.analytics.Gdp.Event event2 = (com.zettle.sdk.analytics.Gdp.Event) event;
        jSONObject2.put("action", event2.getAction());
        jSONObject2.put("domain", event2.getDomain());
        jSONObject2.put("subdomain", event2.getSubdomain());
        jSONObject2.put("page", event2.getPage());
        jSONObject2.put("payload", event2.getPayload());
        jSONObject2.put(com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "ANDROID");
        long currentWallTime = this.getHighResolutionOutputSizeshNQ4ISI.getClock().getCurrentWallTime();
        jSONObject2.put("timestamp", this.getHighSpeedVideoFpsRangesFor.format(currentWallTime));
        jSONObject2.put("session", this.getHighSpeedVideoSizes.next(currentWallTime));
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant = this.Camera2StreamConfigurationMap.getCurrentLoggedInMerchant();
        java.lang.String userId = currentLoggedInMerchant != null ? currentLoggedInMerchant.getUserId() : null;
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant2 = this.Camera2StreamConfigurationMap.getCurrentLoggedInMerchant();
        java.lang.String organizationId = currentLoggedInMerchant2 != null ? currentLoggedInMerchant2.getOrganizationId() : null;
        if (kotlin.jvm.internal.Intrinsics.areEqual(userId, organizationId) && userId != null) {
            jSONObject2.putOpt("accountId", userId);
            return jSONObject2;
        }
        jSONObject2.putOpt("userUuid", userId);
        jSONObject2.putOpt("organizationUuid", organizationId);
        return jSONObject2;
    }
}
