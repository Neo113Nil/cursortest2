package com.zettle.sdk.analytics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\n8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001e"}, d2 = {"Lcom/zettle/sdk/analytics/HerdAdapterImpl;", "Lcom/zettle/sdk/analytics/Herd$Adapter;", "Lcom/zettle/sdk/core/user/UserModule;", "userModule", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "Lcom/zettle/sdk/meta/Platform;", com.paypal.oslo.feature.identity.passkey.management.enrollment.attestation.data.repository.PasskeyAttestationRepositoryImpl.DEFAULT_AUTHENTICATOR_ATTACHMENT, "Lkotlin/Function1;", "", "", "format", "<init>", "(Lcom/zettle/sdk/core/user/UserModule;Lcom/zettle/sdk/meta/AppInfo;Lcom/zettle/sdk/meta/Platform;Lkotlin/jvm/functions/Function1;)V", "Lcom/zettle/sdk/analytics/Analytics$Event;", "event", "Lorg/json/JSONObject;", "onCreateJson", "(Lcom/zettle/sdk/analytics/Analytics$Event;)Lorg/json/JSONObject;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/meta/AppInfo;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/meta/Platform;", "tag", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "Lcom/zettle/sdk/core/user/UserModule;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class HerdAdapterImpl implements com.zettle.sdk.analytics.Herd.Adapter {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.UserModule Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.Platform getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<java.lang.Long, java.lang.String> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public HerdAdapterImpl(com.zettle.sdk.core.user.UserModule userModule, com.zettle.sdk.meta.AppInfo appInfo, com.zettle.sdk.meta.Platform platform, kotlin.jvm.functions.Function1<? super java.lang.Long, java.lang.String> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platform, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        this.Camera2StreamConfigurationMap = userModule;
        this.getHighResolutionOutputSizeshNQ4ISI = appInfo;
        this.getHighSpeedVideoFpsRangesFor = platform;
        this.getHighSpeedVideoSizes = function1;
        this.tag = "herd";
    }

    @Override // com.zettle.sdk.analytics.Analytics.Adapter
    public final java.lang.String getTag() {
        return this.tag;
    }

    @Override // com.zettle.sdk.analytics.Analytics.Adapter
    public final org.json.JSONObject onCreateJson(com.zettle.sdk.analytics.Analytics.Event event) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (!(event instanceof com.zettle.sdk.analytics.Herd.Event)) {
            return null;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("clientPlatform", "ANDROID");
        jSONObject.put("clientIdiom", this.getHighSpeedVideoFpsRangesFor.getInfo().getDeviceLocale());
        jSONObject.put("clientModel", this.getHighSpeedVideoFpsRangesFor.getInfo().getDeviceModel());
        jSONObject.put("clientSystemVersion", this.getHighSpeedVideoFpsRangesFor.getInfo().getVersionCode());
        jSONObject.put("udid", this.getHighResolutionOutputSizeshNQ4ISI.getDeviceId());
        jSONObject.put("clientVersion", this.getHighResolutionOutputSizeshNQ4ISI.getAppVersion());
        jSONObject.put("applicationIdentifier", this.getHighResolutionOutputSizeshNQ4ISI.getAppId());
        jSONObject.put("sdkVersion", this.getHighResolutionOutputSizeshNQ4ISI.getSdkVersion());
        jSONObject.putOpt("userUuid", this.Camera2StreamConfigurationMap.getUserID());
        com.zettle.sdk.core.user.CountryCode countryId = this.Camera2StreamConfigurationMap.getCountryId();
        jSONObject.putOpt("countryId", countryId != null ? countryId.name() : null);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        com.zettle.sdk.analytics.Herd.Event event2 = (com.zettle.sdk.analytics.Herd.Event) event;
        com.zettle.sdk.analytics.Herd.Type type = event2.getType();
        if (type instanceof com.zettle.sdk.analytics.Herd.Type.Payment) {
            jSONObject3.put("transactionType", ((com.zettle.sdk.analytics.Herd.Type.Payment) type).getEntryMode());
            jSONObject3.put("tx", event2.getEnded() - event2.getStarted());
            str = "payment";
        } else if (type instanceof com.zettle.sdk.analytics.Herd.Type.Checkout) {
            jSONObject3.put("create-checkout", ((com.zettle.sdk.analytics.Herd.Type.Checkout) type).getCreateCheckout());
            str = "checkout";
        } else if (type instanceof com.zettle.sdk.analytics.Herd.Type.PayPalQrc) {
            str = ((com.zettle.sdk.analytics.Herd.Type.PayPalQrc) type).getVariant();
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.zettle.sdk.analytics.Herd.Type.TapToPayPayment.INSTANCE)) {
            str = "ttp_android_payment";
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.zettle.sdk.analytics.Herd.Type.TapToPayConfiguration.INSTANCE)) {
            str = "ttp_android_configuration";
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(type, com.zettle.sdk.analytics.Herd.Type.TapToPayAttestation.INSTANCE)) {
            str = "ttp_android_attestation";
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type, com.zettle.sdk.analytics.Herd.Type.TapToPayCVMLimits.INSTANCE)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            str = "ttp_android_cvm_limits";
        }
        jSONObject2.put("type", str);
        jSONObject2.put("extra", jSONObject3);
        jSONObject2.put(com.google.android.gms.fido.u2f.api.common.SignResponseData.JSON_RESPONSE_DATA_CLIENT_DATA, jSONObject);
        new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", java.util.Locale.ENGLISH).setTimeZone(java.util.TimeZone.getTimeZone(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_TIMEZONE_UTC));
        jSONObject2.put("started", this.getHighSpeedVideoSizes.invoke(java.lang.Long.valueOf(event2.getStarted())));
        jSONObject2.put("ended", this.getHighSpeedVideoSizes.invoke(java.lang.Long.valueOf(event2.getEnded())));
        jSONObject2.put("success", event2.getResult() instanceof com.zettle.sdk.analytics.Herd.Result.Success);
        if (event2.getResult() instanceof com.zettle.sdk.analytics.Herd.Result.Failure) {
            jSONObject2.put("failureReason", ((com.zettle.sdk.analytics.Herd.Result.Failure) event2.getResult()).getReason());
        }
        return jSONObject2;
    }
}
