package com.paypal.android.taptopay.domain.repository.di;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/di/CardRepositoryWrapperModule;", "", "<init>", "()V", "PayairCardRepository", "ThalesCardRepository"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes2.dex */
public final class CardRepositoryWrapperModule {

    @javax.inject.Qualifier
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/di/CardRepositoryWrapperModule$PayairCardRepository;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface PayairCardRepository {
    }

    @javax.inject.Qualifier
    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/di/CardRepositoryWrapperModule$ThalesCardRepository;", ""}, k = 1, mv = {1, 9, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.BINARY)
    public @interface ThalesCardRepository {
    }
}
