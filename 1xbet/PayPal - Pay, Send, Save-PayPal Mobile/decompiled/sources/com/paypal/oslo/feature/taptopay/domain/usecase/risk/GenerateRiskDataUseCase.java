package com.paypal.oslo.feature.taptopay.domain.usecase.risk;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/risk/GenerateRiskDataUseCase;", "", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "riskDataProvider", "<init>", "(Lcom/paypal/oslo/core/security/RiskDataProvider;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/model/risk/GenerateRiskPairingError;", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/security/RiskDataProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GenerateRiskDataUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.security.RiskDataProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GenerateRiskDataUseCase(com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(riskDataProvider, "");
        this.Camera2StreamConfigurationMap = riskDataProvider;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.taptopay.domain.model.risk.GenerateRiskPairingError, java.lang.String>> continuation) {
        try {
            return arrow.core.EitherKt.right(com.paypal.oslo.core.security.RiskDataProvider.generateFreshDeviceRiskData$default(this.Camera2StreamConfigurationMap, null, null, 3, null).getClientMetadataId());
        } catch (java.lang.Exception e) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.taptopay.domain.model.risk.GenerateRiskPairingError.DefaultError("Failed to generate risk pairing ID", e));
        }
    }
}
