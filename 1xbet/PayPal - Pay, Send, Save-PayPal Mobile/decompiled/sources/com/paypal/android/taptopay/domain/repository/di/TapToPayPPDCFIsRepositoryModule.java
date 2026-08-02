package com.paypal.android.taptopay.domain.repository.di;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\b2\"\u0010\t\u001a\u001e\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u0006\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\u00060\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/di/TapToPayPPDCFIsRepositoryModule;", "", "<init>", "()V", "", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Ljavax/inject/Provider;", "Lcom/paypal/android/taptopay/domain/repository/card/PPDCFIsRepository;", "repos", "providesPPDCFIsRepository", "(Ljava/util/Map;)Lcom/paypal/android/taptopay/domain/repository/card/PPDCFIsRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public final class TapToPayPPDCFIsRepositoryModule {
    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository providesPPDCFIsRepository(java.util.Map<java.lang.String, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository>> repos) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repos, "");
        javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository> provider = repos.get("mock");
        if (provider == null && (provider = repos.get("real")) == null && (provider = repos.get(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT)) == null && (provider = (javax.inject.Provider) kotlin.collections.CollectionsKt.firstOrNull(repos.values())) == null) {
            throw new java.lang.IllegalStateException("No PPDCFIsRepository implementation available");
        }
        com.paypal.android.taptopay.domain.repository.card.PPDCFIsRepository pPDCFIsRepository = provider.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(pPDCFIsRepository, "");
        return pPDCFIsRepository;
    }
}
