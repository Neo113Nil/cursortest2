package com.unity3d.ads.core.data.datasource;

/* compiled from: PrivacyDeviceInfoDataSource.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/PrivacyDeviceInfoDataSource;", "", com.google.firebase.remoteconfig.RemoteConfigComponent.FETCH_FILE_NAME, "Lgatewayprotocol/v1/PiiOuterClass$Pii;", "allowed", "Lgatewayprotocol/v1/AllowedPiiOuterClass$AllowedPii;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PrivacyDeviceInfoDataSource {
    gatewayprotocol.v1.PiiOuterClass.Pii fetch(gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowed);

    /* compiled from: PrivacyDeviceInfoDataSource.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ gatewayprotocol.v1.PiiOuterClass.Pii fetch$default(com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource, gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii allowedPii, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetch");
            }
            if ((i & 1) != 0) {
                allowedPii = gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPii.getDefaultInstance();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allowedPii, "getDefaultInstance()");
            }
            return privacyDeviceInfoDataSource.fetch(allowedPii);
        }
    }
}
