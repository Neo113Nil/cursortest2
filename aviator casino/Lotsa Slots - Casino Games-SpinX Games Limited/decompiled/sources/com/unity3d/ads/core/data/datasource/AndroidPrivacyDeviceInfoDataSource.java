package com.unity3d.ads.core.data.datasource;

/* compiled from: AndroidPrivacyDeviceInfoDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidPrivacyDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "context", "Landroid/content/Context;", "fIdDataSource", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "appSetIdDataSource", "Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/FIdDataSource;Lcom/unity3d/ads/core/data/datasource/AndroidAppSetIdDataSource;)V", "idfaInitialized", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "allowed", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "getAdvertisingTrackingId", "", "getOpenAdvertisingTrackingId", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidPrivacyDeviceInfoDataSource implements com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource {
    private final com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource appSetIdDataSource;
    private final android.content.Context context;
    private final com.unity3d.ads.core.data.datasource.FIdDataSource fIdDataSource;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> idfaInitialized;

    public AndroidPrivacyDeviceInfoDataSource(android.content.Context context, com.unity3d.ads.core.data.datasource.FIdDataSource fIdDataSource, com.unity3d.ads.core.data.datasource.AndroidAppSetIdDataSource appSetIdDataSource) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fIdDataSource, "fIdDataSource");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSetIdDataSource, "appSetIdDataSource");
        this.context = context;
        this.fIdDataSource = fIdDataSource;
        this.appSetIdDataSource = appSetIdDataSource;
        this.idfaInitialized = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(false);
    }

    @Override // com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource
    public gatewayprotocol.v1.PiiOuterClass.Pii fetch(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowed) {
        java.lang.String appSetId;
        java.lang.String invoke;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowed, "allowed");
        if (!this.idfaInitialized.getValue().booleanValue()) {
            this.idfaInitialized.setValue(true);
            com.unity3d.services.core.device.AdvertisingId.init(this.context);
            com.unity3d.services.core.device.OpenAdvertisingId.init(this.context);
        }
        gatewayprotocol.v1.PiiKt.Dsl.Companion companion = gatewayprotocol.v1.PiiKt.Dsl.INSTANCE;
        gatewayprotocol.v1.PiiOuterClass.Pii.Builder newBuilder = gatewayprotocol.v1.PiiOuterClass.Pii.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        final gatewayprotocol.v1.PiiKt.Dsl _create = companion._create(newBuilder);
        if (allowed.getIdfa()) {
            java.lang.String advertisingTrackingId = getAdvertisingTrackingId();
            if (advertisingTrackingId.length() > 0) {
                java.util.UUID fromString = java.util.UUID.fromString(advertisingTrackingId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString, "fromString(adId)");
                _create.setAdvertisingId(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString));
            }
            java.lang.String openAdvertisingTrackingId = getOpenAdvertisingTrackingId();
            if (openAdvertisingTrackingId.length() > 0) {
                java.util.UUID fromString2 = java.util.UUID.fromString(openAdvertisingTrackingId);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(openAdId)");
                _create.setOpenAdvertisingTrackingId(com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(fromString2));
            }
        }
        if (allowed.getFid() && (invoke = this.fIdDataSource.invoke()) != null) {
            if (invoke.length() <= 0) {
                invoke = null;
            }
            if (invoke != null) {
                new kotlin.jvm.internal.MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$3
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                    public java.lang.Object get() {
                        return ((gatewayprotocol.v1.PiiKt.Dsl) this.receiver).getFid();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                    public void set(java.lang.Object obj) {
                        ((gatewayprotocol.v1.PiiKt.Dsl) this.receiver).setFid((java.lang.String) obj);
                    }
                }.set(invoke);
            }
        }
        if (allowed.getAppsetId() && (appSetId = this.appSetIdDataSource.getAppSetId()) != null) {
            java.lang.String str = appSetId.length() > 0 ? appSetId : null;
            if (str != null) {
                new kotlin.jvm.internal.MutablePropertyReference0Impl(_create) { // from class: com.unity3d.ads.core.data.datasource.AndroidPrivacyDeviceInfoDataSource$fetch$1$6
                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KProperty0
                    public java.lang.Object get() {
                        return ((gatewayprotocol.v1.PiiKt.Dsl) this.receiver).getAppsetId();
                    }

                    @Override // kotlin.jvm.internal.MutablePropertyReference0Impl, kotlin.reflect.KMutableProperty0
                    public void set(java.lang.Object obj) {
                        ((gatewayprotocol.v1.PiiKt.Dsl) this.receiver).setAppsetId((java.lang.String) obj);
                    }
                }.set(str);
            }
        }
        return _create._build();
    }

    private final java.lang.String getAdvertisingTrackingId() {
        java.lang.String advertisingTrackingId = com.unity3d.services.core.device.AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    private final java.lang.String getOpenAdvertisingTrackingId() {
        java.lang.String openAdvertisingTrackingId = com.unity3d.services.core.device.OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }
}
