package com.paypal.oslo.feature.userprofile.di;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/di/RepositoryModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/userprofile/data/repository/EmailRepositoryImpl;", "emailRepositoryImpl", "Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "provideEmailRepository$user_profile_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/data/repository/EmailRepositoryImpl;)Lcom/paypal/oslo/feature/userprofile/domain/repository/EmailRepository;", "Lcom/paypal/oslo/feature/userprofile/data/repository/PhoneRepositoryImpl;", "phoneRepositoryImpl", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "providePhoneRepository$user_profile_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/data/repository/PhoneRepositoryImpl;)Lcom/paypal/oslo/feature/userprofile/domain/repository/PhoneRepository;", "Lcom/paypal/oslo/feature/userprofile/data/repository/AddressRepositoryImpl;", "addressRepositoryImpl", "Lcom/paypal/oslo/feature/userprofile/domain/repository/AddressRepository;", "provideAddressRepository$user_profile_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/data/repository/AddressRepositoryImpl;)Lcom/paypal/oslo/feature/userprofile/domain/repository/AddressRepository;", "Lcom/paypal/oslo/feature/userprofile/data/repository/PhotoRepositoryImpl;", "photoRepositoryImpl", "Lcom/paypal/oslo/feature/userprofile/domain/repository/PhotoRepository;", "providePhotoRepository$user_profile_prodRelease", "(Lcom/paypal/oslo/feature/userprofile/data/repository/PhotoRepositoryImpl;)Lcom/paypal/oslo/feature/userprofile/domain/repository/PhotoRepository;", "Lretrofit2/Retrofit;", "retrofit", "Lcom/paypal/oslo/feature/userprofile/data/api/DmsApiService;", "provideDmsApiService$user_profile_prodRelease", "(Lretrofit2/Retrofit;)Lcom/paypal/oslo/feature/userprofile/data/api/DmsApiService;", "Lkotlinx/coroutines/CoroutineDispatcher;", "provideIoDispatcher$user_profile_prodRelease", "()Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class RepositoryModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.userprofile.di.RepositoryModule INSTANCE = new com.paypal.oslo.feature.userprofile.di.RepositoryModule();

    private RepositoryModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.userprofile.domain.repository.EmailRepository provideEmailRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.EmailRepositoryImpl emailRepositoryImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailRepositoryImpl, "");
        return emailRepositoryImpl;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.userprofile.domain.repository.PhoneRepository providePhoneRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.PhoneRepositoryImpl phoneRepositoryImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneRepositoryImpl, "");
        return phoneRepositoryImpl;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository provideAddressRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.AddressRepositoryImpl addressRepositoryImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepositoryImpl, "");
        return addressRepositoryImpl;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.userprofile.domain.repository.PhotoRepository providePhotoRepository$user_profile_prodRelease(com.paypal.oslo.feature.userprofile.data.repository.PhotoRepositoryImpl photoRepositoryImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoRepositoryImpl, "");
        return photoRepositoryImpl;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.paypal.oslo.feature.userprofile.data.api.DmsApiService provideDmsApiService$user_profile_prodRelease(retrofit2.Retrofit retrofit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(retrofit, "");
        java.lang.Object create = retrofit.create(com.paypal.oslo.feature.userprofile.data.api.DmsApiService.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        return (com.paypal.oslo.feature.userprofile.data.api.DmsApiService) create;
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher$user_profile_prodRelease() {
        return kotlinx.coroutines.Dispatchers.getIO();
    }
}
