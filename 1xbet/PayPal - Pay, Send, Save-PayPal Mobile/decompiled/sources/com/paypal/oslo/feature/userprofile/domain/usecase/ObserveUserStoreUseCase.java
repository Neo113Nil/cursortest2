package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/ObserveUserStoreUseCase;", "", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ObserveUserStoreUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ObserveUserStoreUseCase(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighSpeedVideoFpsRanges = userStore;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> invoke() {
        return kotlinx.coroutines.flow.FlowKt.onEach(this.getHighSpeedVideoFpsRanges.getUserState(), new com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase$invoke$1(this, null));
    }

    public static final /* synthetic */ void access$logUserState(com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.paypal.oslo.core.userstore.model.UserState userState) {
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded profileLoaded = (com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) userState;
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User profile loaded", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("userId", profileLoaded.getUser().getId()), kotlin.TuplesKt.to("accountCountryCode", profileLoaded.getUser().getAccountCountryCode()), kotlin.TuplesKt.to("accountType", profileLoaded.getUser().getAccountType()), kotlin.TuplesKt.to("userEmail", profileLoaded.getUser().getPrimaryEmailAddress())), null, 4, null);
            return;
        }
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedOut) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User logged out", null, null, 6, null);
            return;
        }
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggingIn) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User logging in", null, null, 6, null);
            return;
        }
        if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.LoggedIn) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User logged in, profile not loaded yet", null, null, 6, null);
        } else if (userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoading) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User profile loading", null, null, 6, null);
        } else {
            if (!(userState instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileError)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "User profile error", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", ((com.paypal.oslo.core.userstore.model.UserState.ProfileError) userState).getCause())), null, 4, null);
        }
    }
}
