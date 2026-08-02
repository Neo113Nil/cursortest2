package com.paypal.oslo.feature.home.di;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H'¢\u0006\u0004\b\u0019\u0010\u001aÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/di/SectionLoadingFactoryModule;", "", "Lcom/paypal/oslo/feature/home/domain/loading/DefaultSectionLoadingFactory;", "defaultSectionLoadingFactory", "Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "bindDefaultSectionLoadingFactory", "(Lcom/paypal/oslo/feature/home/domain/loading/DefaultSectionLoadingFactory;)Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/HeroProductSectionLoadingFactory;", "heroProductSectionPlaceholders", "bindHeroProductSectionPlaceholders", "(Lcom/paypal/oslo/feature/home/domain/loading/HeroProductSectionLoadingFactory;)Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/AccountSnapshotSectionLoadingFactory;", "accountSnapshotSectionPlaceholders", "bindAccountSnapshotSectionPlaceholders", "(Lcom/paypal/oslo/feature/home/domain/loading/AccountSnapshotSectionLoadingFactory;)Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/MerchantSectionLoadingFactory;", "merchantSectionPlaceholders", "bindMerchantSectionPlaceholders", "(Lcom/paypal/oslo/feature/home/domain/loading/MerchantSectionLoadingFactory;)Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/HomeFeedSectionLoadingFactory;", "homeFeedSectionPlaceholders", "bindHomeFeedSectionPlaceholders", "(Lcom/paypal/oslo/feature/home/domain/loading/HomeFeedSectionLoadingFactory;)Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/DeckSectionLoadingFactory;", "deckSectionLoadingFactory", "bindDeckSectionLoadingFactory", "(Lcom/paypal/oslo/feature/home/domain/loading/DeckSectionLoadingFactory;)Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface SectionLoadingFactoryModule {
    @dagger.Binds
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT)
    @javax.inject.Singleton
    @dagger.multibindings.IntoMap
    com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory bindAccountSnapshotSectionPlaceholders(com.paypal.oslo.feature.home.domain.loading.AccountSnapshotSectionLoadingFactory accountSnapshotSectionPlaceholders);

    @dagger.Binds
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.home.domain.model.SectionTypes.DECK_CARD)
    @javax.inject.Singleton
    @dagger.multibindings.IntoMap
    com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory bindDeckSectionLoadingFactory(com.paypal.oslo.feature.home.domain.loading.DeckSectionLoadingFactory deckSectionLoadingFactory);

    @dagger.Binds
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.home.domain.model.SectionTypes.DEFAULT_LOADING)
    @javax.inject.Singleton
    @dagger.multibindings.IntoMap
    com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory bindDefaultSectionLoadingFactory(com.paypal.oslo.feature.home.domain.loading.DefaultSectionLoadingFactory defaultSectionLoadingFactory);

    @dagger.Binds
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.home.domain.model.SectionTypes.HERO_PRODUCT)
    @javax.inject.Singleton
    @dagger.multibindings.IntoMap
    com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory bindHeroProductSectionPlaceholders(com.paypal.oslo.feature.home.domain.loading.HeroProductSectionLoadingFactory heroProductSectionPlaceholders);

    @dagger.Binds
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.home.domain.model.SectionTypes.HOME_FEED)
    @javax.inject.Singleton
    @dagger.multibindings.IntoMap
    com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory bindHomeFeedSectionPlaceholders(com.paypal.oslo.feature.home.domain.loading.HomeFeedSectionLoadingFactory homeFeedSectionPlaceholders);

    @dagger.Binds
    @dagger.multibindings.StringKey(com.paypal.oslo.feature.home.domain.model.SectionTypes.MERCHANT)
    @javax.inject.Singleton
    @dagger.multibindings.IntoMap
    com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory bindMerchantSectionPlaceholders(com.paypal.oslo.feature.home.domain.loading.MerchantSectionLoadingFactory merchantSectionPlaceholders);
}
