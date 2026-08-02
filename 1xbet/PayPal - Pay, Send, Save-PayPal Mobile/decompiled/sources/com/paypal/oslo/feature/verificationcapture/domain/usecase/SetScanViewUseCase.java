package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/usecase/SetScanViewUseCase;", "", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "idCaptureRepository", "<init>", "(Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;)V", "scanView", "", "invoke", "(Ljava/lang/Object;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/verificationcapture/domain/repository/IdCaptureRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SetScanViewUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public SetScanViewUseCase(com.paypal.oslo.feature.verificationcapture.domain.repository.IdCaptureRepository idCaptureRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idCaptureRepository, "");
        this.Camera2StreamConfigurationMap = idCaptureRepository;
    }

    public final void invoke(java.lang.Object scanView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scanView, "");
        this.Camera2StreamConfigurationMap.setScanView(scanView);
    }
}
