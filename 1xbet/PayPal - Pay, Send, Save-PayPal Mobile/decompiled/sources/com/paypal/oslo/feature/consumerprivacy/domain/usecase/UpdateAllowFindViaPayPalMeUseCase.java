package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdateAllowFindViaPayPalMeUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;)V", "", "allowFindViaPayPalMe", "", "profileId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "invoke", "(ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdateAllowFindViaPayPalMeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public UpdateAllowFindViaPayPalMeUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository accountVisibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityRepository, "");
        this.getHighSpeedVideoFpsRangesFor = accountVisibilityRepository;
    }

    public final java.lang.Object invoke(boolean z, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.updateAllowFindViaPayPalMe(z, str, continuation);
    }
}
