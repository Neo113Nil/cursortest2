package com.paypal.oslo.feature.identity.accountswitch.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/domain/usecase/SwitchAccountUseCase;", "", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/UserAccountSwitchRepository;", "repository", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;", "authConfigProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/UserAccountSwitchRepository;Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;)V", "", "targetPartyId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/model/SwitchAccountResult;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/UserAccountSwitchRepository;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/identity/config/AuthConfigProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SwitchAccountUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.core.identity.config.AuthConfigProvider getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SwitchAccountUseCase(com.paypal.oslo.feature.identity.accountswitch.domain.repository.UserAccountSwitchRepository userAccountSwitchRepository, com.paypal.oslo.core.identity.config.AuthConfigProvider authConfigProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountSwitchRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authConfigProvider, "");
        this.getHighSpeedVideoFpsRanges = userAccountSwitchRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = authConfigProvider;
    }

    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.DataResultError, ? extends com.paypal.oslo.feature.identity.accountswitch.domain.model.SwitchAccountResult>> continuation) {
        return this.getHighSpeedVideoFpsRanges.switchAccount(this.getHighResolutionOutputSizeshNQ4ISI.getConfig().getFirstPartyClientId(), str, continuation);
    }
}
