package com.paypal.oslo.feature.identity.login.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/identity/login/domain/usecase/IsInContextLoginEnabledUseCase;", "", "Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;", "inContextLoginProvider", "<init>", "(Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;)V", "", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/identity/login/domain/repository/InContextLoginProvider;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IsInContextLoginEnabledUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public IsInContextLoginEnabledUseCase(com.paypal.oslo.feature.identity.login.domain.repository.InContextLoginProvider inContextLoginProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inContextLoginProvider, "");
        this.getHighSpeedVideoFpsRanges = inContextLoginProvider;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighSpeedVideoFpsRanges.isInContextLoginEnabled(continuation);
    }
}
