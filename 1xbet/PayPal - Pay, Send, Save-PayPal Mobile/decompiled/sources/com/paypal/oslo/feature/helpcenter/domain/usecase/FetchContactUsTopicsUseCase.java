package com.paypal.oslo.feature.helpcenter.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0006H\u0086B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/domain/usecase/FetchContactUsTopicsUseCase;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/ContactUsRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/helpcenter/domain/repository/ContactUsRepository;)V", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/helpcenter/domain/models/HelpCenterDomainError;", "", "Lcom/paypal/oslo/feature/helpcenter/domain/models/ContactTopic;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/helpcenter/domain/repository/ContactUsRepository;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FetchContactUsTopicsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public FetchContactUsTopicsUseCase(com.paypal.oslo.feature.helpcenter.domain.repository.ContactUsRepository contactUsRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactUsRepository, "");
        this.getHighSpeedVideoSizes = contactUsRepository;
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.helpcenter.domain.models.HelpCenterDomainError, ? extends java.util.List<com.paypal.oslo.feature.helpcenter.domain.models.ContactTopic>>> continuation) {
        return this.getHighSpeedVideoSizes.fetchContactUsTopics(continuation);
    }
}
