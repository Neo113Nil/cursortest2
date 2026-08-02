package com.paypal.oslo.feature.dataprivacy.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0096@¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/data/repository/FakeUserAccountRepository;", "Lcom/paypal/oslo/feature/dataprivacy/domain/repository/UserAccountRepository;", "<init>", "()V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/dataprivacy/domain/error/DataPrivacyError;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/LinkedAccount;", "getLinkedAccounts", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FakeUserAccountRepository implements com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount> getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount[]{com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.XOOM, com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.HONEY, com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount.ZETTLE});

    @javax.inject.Inject
    public FakeUserAccountRepository() {
    }

    @Override // com.paypal.oslo.feature.dataprivacy.domain.repository.UserAccountRepository
    public final java.lang.Object getLinkedAccounts(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.dataprivacy.domain.error.DataPrivacyError, ? extends java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.LinkedAccount>>> continuation) {
        return new arrow.core.Ior.Right(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
