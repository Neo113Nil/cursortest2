package com.unity3d.ads.core.domain;

/* compiled from: AndroidTestDataInfo.kt */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidTestDataInfo;", "Lcom/unity3d/ads/core/domain/GetTestDataInfo;", "androidManifestIntPropertyReader", "Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;", "(Lcom/unity3d/ads/core/configuration/AndroidManifestIntPropertyReader;)V", "invoke", "Lgatewayprotocol/v1/TestDataOuterClass$TestData;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AndroidTestDataInfo implements com.unity3d.ads.core.domain.GetTestDataInfo {
    public static final java.lang.String EXCHANGE_TEST_MODE = "ExchangeTestMode";
    private final com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader androidManifestIntPropertyReader;

    public AndroidTestDataInfo(com.unity3d.ads.core.configuration.AndroidManifestIntPropertyReader androidManifestIntPropertyReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(androidManifestIntPropertyReader, "androidManifestIntPropertyReader");
        this.androidManifestIntPropertyReader = androidManifestIntPropertyReader;
    }

    @Override // com.unity3d.ads.core.domain.GetTestDataInfo
    public gatewayprotocol.v1.TestDataOuterClass.TestData invoke() {
        gatewayprotocol.v1.TestDataKt.Dsl.Companion companion = gatewayprotocol.v1.TestDataKt.Dsl.INSTANCE;
        gatewayprotocol.v1.TestDataOuterClass.TestData.Builder newBuilder = gatewayprotocol.v1.TestDataOuterClass.TestData.newBuilder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder()");
        gatewayprotocol.v1.TestDataKt.Dsl _create = companion._create(newBuilder);
        java.lang.Integer propertyByName = this.androidManifestIntPropertyReader.getPropertyByName(EXCHANGE_TEST_MODE);
        if (propertyByName != null) {
            _create.setForceExchangeTestMode(propertyByName.intValue());
        }
        gatewayprotocol.v1.TestDataOuterClass.TestData _build = _create._build();
        if (_build.hasForceExchangeTestMode()) {
            return _build;
        }
        return null;
    }
}
