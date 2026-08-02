package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/repository/ProductCapabilityRepositoryImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductCapabilityRepository;", "<init>", "()V", "", "forceRemoteFetch", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;", "capabilities", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ProductCapabilityRepositoryImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductCapabilityRepository {
    public static final int $stable = 0;

    @javax.inject.Inject
    public ProductCapabilityRepositoryImpl() {
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.ProductCapabilityRepository
    public final java.lang.Object capabilities(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability>>> continuation) {
        return arrow.core.IorKt.rightIor(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability.getEntries());
    }
}
