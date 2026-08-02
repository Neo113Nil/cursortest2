package com.paypal.oslo.feature.contacts.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/usecase/CreateStringRecentSearchUseCaseImpl;", "Lcom/paypal/oslo/feature/contacts/api/usecase/AddStringRecentSearchUseCase;", "Lcom/paypal/oslo/feature/contacts/domain/repository/CreateRecentSearchRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/contacts/domain/repository/CreateRecentSearchRepository;)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/contacts/api/NetworkType;", "networkType", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/contacts/api/RecentSearchError;", "", "invoke", "(Ljava/lang/String;Lcom/paypal/oslo/feature/contacts/api/NetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/contacts/domain/repository/CreateRecentSearchRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CreateStringRecentSearchUseCaseImpl implements com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CreateStringRecentSearchUseCaseImpl(com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository createRecentSearchRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createRecentSearchRepository, "");
        this.getHighSpeedVideoFpsRangesFor = createRecentSearchRepository;
    }

    @Override // com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase
    public final java.lang.Object invoke(java.lang.String str, com.paypal.oslo.feature.contacts.api.NetworkType networkType, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.contacts.api.RecentSearchError, kotlin.Unit>> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.createStringRecentSearch(str, networkType, continuation);
    }
}
