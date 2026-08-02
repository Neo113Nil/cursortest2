package com.paypal.oslo.feature.contacts.di;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000bH'¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u000fH'¢\u0006\u0004\b\u0011\u0010\u0012À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/contacts/di/ContactsDataModule;", "", "Lcom/paypal/oslo/feature/contacts/data/repository/RecentSearchesRepositoryImpl;", "impl", "Lcom/paypal/oslo/feature/contacts/domain/repository/RecentSearchesRepository;", "bindRecentSearchesRepository", "(Lcom/paypal/oslo/feature/contacts/data/repository/RecentSearchesRepositoryImpl;)Lcom/paypal/oslo/feature/contacts/domain/repository/RecentSearchesRepository;", "Lcom/paypal/oslo/feature/contacts/data/repository/CreateRecentSearchRepositoryImpl;", "Lcom/paypal/oslo/feature/contacts/domain/repository/CreateRecentSearchRepository;", "bindCreateRecentSearchRepository", "(Lcom/paypal/oslo/feature/contacts/data/repository/CreateRecentSearchRepositoryImpl;)Lcom/paypal/oslo/feature/contacts/domain/repository/CreateRecentSearchRepository;", "Lcom/paypal/oslo/feature/contacts/data/repository/DeleteRecentSearchRepositoryImpl;", "Lcom/paypal/oslo/feature/contacts/domain/repository/DeleteRecentSearchRepository;", "bindDeleteRecentSearchRepository", "(Lcom/paypal/oslo/feature/contacts/data/repository/DeleteRecentSearchRepositoryImpl;)Lcom/paypal/oslo/feature/contacts/domain/repository/DeleteRecentSearchRepository;", "Lcom/paypal/oslo/feature/contacts/data/repository/DeleteRecentSearchesRepositoryImpl;", "Lcom/paypal/oslo/feature/contacts/domain/repository/DeleteRecentSearchesRepository;", "bindDeleteRecentSearchesRepository", "(Lcom/paypal/oslo/feature/contacts/data/repository/DeleteRecentSearchesRepositoryImpl;)Lcom/paypal/oslo/feature/contacts/domain/repository/DeleteRecentSearchesRepository;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public interface ContactsDataModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository bindCreateRecentSearchRepository(com.paypal.oslo.feature.contacts.data.repository.CreateRecentSearchRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchRepository bindDeleteRecentSearchRepository(com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchesRepository bindDeleteRecentSearchesRepository(com.paypal.oslo.feature.contacts.data.repository.DeleteRecentSearchesRepositoryImpl impl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.feature.contacts.domain.repository.RecentSearchesRepository bindRecentSearchesRepository(com.paypal.oslo.feature.contacts.data.repository.RecentSearchesRepositoryImpl impl);
}
