package com.paypal.oslo.feature.home.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J6\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/usecase/RetrySectionUseCase;", "", "Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;", "homeFeedRepository", "<init>", "(Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;)V", "", "sectionId", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SECTION_TYPE, "Larrow/core/Ior;", "Lcom/paypal/oslo/core/network/graphql/error/CallError;", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "invoke", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/domain/repository/HomeFeedRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RetrySectionUseCase {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public RetrySectionUseCase(com.paypal.oslo.feature.home.domain.repository.HomeFeedRepository homeFeedRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(homeFeedRepository, "");
        this.getHighResolutionOutputSizeshNQ4ISI = homeFeedRepository;
    }

    public final java.lang.Object invoke(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>> continuation) {
        return this.getHighResolutionOutputSizeshNQ4ISI.retrySection(str, str2, continuation);
    }
}
