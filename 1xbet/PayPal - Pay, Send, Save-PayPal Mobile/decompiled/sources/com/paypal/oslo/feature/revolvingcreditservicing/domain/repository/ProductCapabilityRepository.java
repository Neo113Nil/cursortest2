package com.paypal.oslo.feature.revolvingcreditservicing.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/repository/ProductCapabilityRepository;", "", "", "forceRemoteFetch", "Larrow/core/Ior;", "", "", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/capabilities/ProductCapability;", "capabilities", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface ProductCapabilityRepository {
    java.lang.Object capabilities(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends java.lang.Throwable, ? extends java.util.List<? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.capabilities.ProductCapability>>> continuation);
}
