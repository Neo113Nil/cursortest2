package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/domain/usecase/GetEmailLinkStatusUseCase;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "packageRepository", "<init>", "(Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;)V", "", "forceRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/packagetracking/domain/error/PackageTrackingError;", "", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailLink;", "invoke", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/PackageRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetEmailLinkStatusUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetEmailLinkStatusUseCase(com.paypal.oslo.feature.packagetracking.domain.repository.PackageRepository packageRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(packageRepository, "");
        this.Camera2StreamConfigurationMap = packageRepository;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.packagetracking.domain.usecase.GetEmailLinkStatusUseCase getEmailLinkStatusUseCase, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getEmailLinkStatusUseCase.invoke(z, continuation);
    }

    public final java.lang.Object invoke(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.packagetracking.domain.error.PackageTrackingError, ? extends java.util.List<com.paypal.oslo.feature.packagetracking.domain.model.EmailLink>>> continuation) {
        return this.Camera2StreamConfigurationMap.getEmailLinkStatus(z, continuation);
    }
}
