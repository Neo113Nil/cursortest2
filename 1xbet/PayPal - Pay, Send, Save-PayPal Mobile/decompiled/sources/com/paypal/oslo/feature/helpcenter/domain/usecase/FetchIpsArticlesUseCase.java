package com.paypal.oslo.feature.helpcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J:\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchIpsArticlesUseCase;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/IpsArticlesRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/repository/IpsArticlesRepository;)V", "", "productReferenceId", "pageReferenceId", "fieldReferenceId", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/IpsArticleData;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/IpsArticlesRepository;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FetchIpsArticlesUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public FetchIpsArticlesUseCase(com.paypal.oslo.feature.helpcenter.domain.repository.IpsArticlesRepository ipsArticlesRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ipsArticlesRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = ipsArticlesRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.IpsArticleData>>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.fetchIpsArticles(str, str2, str3, continuation);
    }
}
