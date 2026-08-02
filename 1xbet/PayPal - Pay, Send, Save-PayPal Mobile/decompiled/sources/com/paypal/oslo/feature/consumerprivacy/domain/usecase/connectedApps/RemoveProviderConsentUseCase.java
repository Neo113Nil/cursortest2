package com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/connectedApps/RemoveProviderConsentUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;)V", "", "provider", "consentId", "", "deleteData", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/ConnectedAppsError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/RemoveProviderResult;", "invoke", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/ConnectedAppsRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RemoveProviderConsentUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public RemoveProviderConsentUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository connectedAppsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectedAppsRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = connectedAppsRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.ConnectedAppsError, com.paypal.oslo.feature.consumerprivacy.domain.model.RemoveProviderResult>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.removeProviderConsentWithData(str, str2, z, continuation);
    }
}
