package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/usecase/GetUserCountryCodeUseCase;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/UserCountry;", "invoke", "()Lcom/paypal/oslo/feature/subscriptions/updatefi/domain/model/UserCountry;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetUserCountryCodeUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public GetUserCountryCodeUseCase(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
    }

    public final com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry invoke() {
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighResolutionOutputSizeshNQ4ISI.getUserState().getValue();
        if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            return com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.INSTANCE.fromCountryCode(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser().getAccountCountryCode());
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.subscriptions.LoggerKt.log, "User profile not loaded, defaulting to US", null, null, 6, null);
        return com.paypal.oslo.feature.subscriptions.updatefi.domain.model.UserCountry.US;
    }
}
