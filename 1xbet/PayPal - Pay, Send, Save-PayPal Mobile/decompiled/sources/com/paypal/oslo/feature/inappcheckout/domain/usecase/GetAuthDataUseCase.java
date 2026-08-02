package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetAuthDataUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;", "authRepository", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthenticationXOResponse;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/AuthRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetAuthDataUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetAuthDataUseCase(com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository authRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authRepository, "");
        this.getHighSpeedVideoSizes = authRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.AuthenticationXOResponse>> continuation) {
        return this.getHighSpeedVideoSizes.getAuthData(continuation);
    }
}
