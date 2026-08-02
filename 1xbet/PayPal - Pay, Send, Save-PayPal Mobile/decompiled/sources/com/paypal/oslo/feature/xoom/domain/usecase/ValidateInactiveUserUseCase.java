package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateInactiveUserUseCase;", "", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase;", "executeWithAuthRetry", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase;Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;)V", "Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;", "userInfo", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "Lcom/paypal/oslo/feature/xoom/domain/model/FailedPaymentInfo;", "invoke", "(Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ValidateInactiveUserUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.repository.XoomRepository getHighSpeedVideoSizes;
    private final com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase getHighSpeedVideoFpsRanges;
    private static final com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase.Companion Companion = new com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public ValidateInactiveUserUseCase(com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase executeWithAuthRetryUseCase, com.paypal.oslo.feature.xoom.domain.repository.XoomRepository xoomRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeWithAuthRetryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xoomRepository, "");
        this.getHighSpeedVideoFpsRanges = executeWithAuthRetryUseCase;
        this.getHighSpeedVideoSizes = xoomRepository;
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/ValidateInactiveUserUseCase$Companion;", "", "<init>", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.Object invoke(com.paypal.oslo.feature.xoom.domain.model.UserInfo userInfo, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, com.paypal.oslo.feature.xoom.domain.model.FailedPaymentInfo>> continuation) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(userInfo.getStatus(), "inactive-collections")) {
            return arrow.core.EitherKt.right(null);
        }
        return this.getHighSpeedVideoFpsRanges.invoke(new com.paypal.oslo.feature.xoom.domain.usecase.ValidateInactiveUserUseCase$invoke$2(this, null), continuation);
    }
}
