package com.paypal.oslo.feature.searchandintelligence.domain.repository;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u000b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "surfaces", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "getPrompts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "getStarters"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface StartersRepository {
    java.lang.Object getPrompts(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>>> continuation);

    java.lang.Object getStarters(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.searchandintelligence.domain.model.Starters>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object getPrompts$default(com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository startersRepository, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPrompts");
        }
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ANY);
        }
        return startersRepository.getPrompts(list, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ java.lang.Object getStarters$default(com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository startersRepository, java.util.List list, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStarters");
        }
        if ((i & 1) != 0) {
            list = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface.ANY);
        }
        return startersRepository.getStarters(list, continuation);
    }
}
