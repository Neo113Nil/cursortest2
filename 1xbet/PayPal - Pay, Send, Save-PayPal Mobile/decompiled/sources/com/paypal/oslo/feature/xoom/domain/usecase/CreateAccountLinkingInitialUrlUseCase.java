package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateAccountLinkingInitialUrlUseCase;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "Lcom/paypal/oslo/feature/xoom/domain/encoder/Base64Encoder;", "base64Encoder", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;Lcom/paypal/oslo/feature/xoom/domain/encoder/Base64Encoder;)V", "", "invoke", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/xoom/domain/encoder/Base64Encoder;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CreateAccountLinkingInitialUrlUseCase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder Camera2StreamConfigurationMap;
    private static final com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase.Companion Companion = new com.paypal.oslo.feature.xoom.domain.usecase.CreateAccountLinkingInitialUrlUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public CreateAccountLinkingInitialUrlUseCase(com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.feature.xoom.domain.encoder.Base64Encoder base64Encoder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64Encoder, "");
        this.getHighSpeedVideoSizes = dynamicConfiguration;
        this.Camera2StreamConfigurationMap = base64Encoder;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateAccountLinkingInitialUrlUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String invoke() {
        java.lang.String str = (java.lang.String) this.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.xoom.domain.config.XoomConfigs.INSTANCE.getBaseWebsiteUrl());
        java.lang.String encodeUrlSafe = this.Camera2StreamConfigurationMap.encodeUrlSafe("redirect-destination=paypal-post-signin");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append("link-paypal-account/unified-login?state=");
        sb.append(encodeUrlSafe);
        return sb.toString();
    }
}
