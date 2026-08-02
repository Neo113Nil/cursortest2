package com.paypal.oslo.feature.consumerprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/usecase/UpdatePaymentRequestsFromUseCase;", "", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;)V", "", "allowFindByIdentifiers", "allowPaymentRequests", "Lcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;", "paymentRequestsFrom", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "invoke", "(ZZLcom/paypal/oslo/api/graphql/schema/type/PaymentRequestsFromType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/AccountVisibilityRepository;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UpdatePaymentRequestsFromUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public UpdatePaymentRequestsFromUseCase(com.paypal.oslo.feature.consumerprivacy.domain.repository.AccountVisibilityRepository accountVisibilityRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountVisibilityRepository, "");
        this.Camera2StreamConfigurationMap = accountVisibilityRepository;
    }

    public final java.lang.Object invoke(boolean z, boolean z2, com.paypal.oslo.api.graphql.schema.type.PaymentRequestsFromType paymentRequestsFromType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation) {
        return this.Camera2StreamConfigurationMap.updatePaymentRequestsFrom(z, z2, paymentRequestsFromType, continuation);
    }
}
