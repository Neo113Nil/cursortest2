package com.paypal.oslo.feature.helpcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchRecommendedArticlesUseCase;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/HelpCenterRecommendedArticlesRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/repository/HelpCenterRecommendedArticlesRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/RecommendedArticleData;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/HelpCenterRecommendedArticlesRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FetchRecommendedArticlesUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FetchRecommendedArticlesUseCase(com.paypal.oslo.feature.helpcenter.domain.repository.HelpCenterRecommendedArticlesRepository helpCenterRecommendedArticlesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterRecommendedArticlesRepository, "");
        this.getHighSpeedVideoSizes = helpCenterRecommendedArticlesRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.RecommendedArticleData>>> continuation) {
        return this.getHighSpeedVideoSizes.fetchRecommendedArticles(continuation);
    }
}
