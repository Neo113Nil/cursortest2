package com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/DeactivateAuthConsentUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;)V", "", "", "grantIds", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsError;", "", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeactivateAuthConsentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public DeactivateAuthConsentUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository connectedAppsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsRepository, "");
        this.getHighSpeedVideoFpsRanges = connectedAppsRepository;
    }

    public final java.lang.Object invoke(java.util.List<java.lang.String> list, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError, java.lang.Boolean>> continuation) {
        return this.getHighSpeedVideoFpsRanges.deactivateAuthConsent(list, continuation);
    }
}
