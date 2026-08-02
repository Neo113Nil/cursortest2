package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/TransferToWebUseCase;", "", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "identitySessionTransfer", "<init>", "(Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferError;", "Lcom/paypal/oslo/core/identity/domain/model/WebSessionTransferData;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/identity/domain/IdentitySessionTransfer;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class TransferToWebUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.identity.domain.IdentitySessionTransfer getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase.Companion Companion = new com.paypal.oslo.feature.xoom.domain.usecase.TransferToWebUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public TransferToWebUseCase(com.paypal.oslo.core.identity.domain.IdentitySessionTransfer identitySessionTransfer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identitySessionTransfer, "");
        this.getHighSpeedVideoFpsRanges = identitySessionTransfer;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/TransferToWebUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.WebSessionTransferError, com.paypal.oslo.core.identity.domain.model.WebSessionTransferData>> continuation) {
        return this.getHighSpeedVideoFpsRanges.transferSessionToWeb(new com.paypal.oslo.core.identity.domain.model.WebSessionTransferAuthenticationContext(com.paypal.oslo.core.identity.domain.model.Tenant.XOOM, new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.LOGGED_IN, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("xoom", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null)), "https://myapp.com/oauth/callback", com.paypal.oslo.core.identity.domain.model.SessionTransferIntent.XOOM_SINGLE_SIGN_ON), continuation);
    }
}
