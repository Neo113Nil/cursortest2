package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/GetUsersMeUseCase;", "", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase;", "executeWithAuthRetry", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase;Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserError;", "Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/xoom/domain/usecase/ExecuteWithAuthRetryUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/xoom/domain/repository/XoomRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class GetUsersMeUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.xoom.domain.repository.XoomRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetUsersMeUseCase(com.paypal.oslo.feature.xoom.domain.usecase.ExecuteWithAuthRetryUseCase executeWithAuthRetryUseCase, com.paypal.oslo.feature.xoom.domain.repository.XoomRepository xoomRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executeWithAuthRetryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(xoomRepository, "");
        this.getHighSpeedVideoFpsRangesFor = executeWithAuthRetryUseCase;
        this.getHighSpeedVideoFpsRanges = xoomRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.xoom.domain.model.UserError, com.paypal.oslo.feature.xoom.domain.model.UserInfo>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.invoke(new com.paypal.oslo.feature.xoom.domain.usecase.GetUsersMeUseCase$invoke$2(this, null), continuation);
    }
}
