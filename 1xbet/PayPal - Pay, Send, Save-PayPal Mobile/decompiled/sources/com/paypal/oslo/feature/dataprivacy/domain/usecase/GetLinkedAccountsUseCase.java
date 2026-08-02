package com.paypal.oslo.feature.dataprivacy.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/usecase/GetLinkedAccountsUseCase;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/UserAccountRepository;", "userAccountRepository", "<init>", "(Lcom/paypal/oslo/feature/dataprivacy/domain/repository/UserAccountRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/LinkedAccount;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/UserAccountRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GetLinkedAccountsUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public GetLinkedAccountsUseCase(com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository userAccountRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccountRepository, "");
        this.getHighSpeedVideoSizes = userAccountRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, ? extends java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount>>> continuation) {
        return this.getHighSpeedVideoSizes.getLinkedAccounts(continuation);
    }
}
