package com.payair.logic.di;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/payair/logic/di/CacheModule;", "", "Landroid/content/Context;", "context", "Lcom/payair/logic/storage/implementation/CertificateStorage;", "provideCertificateStorage", "(Landroid/content/Context;)Lcom/payair/logic/storage/implementation/CertificateStorage;", "Lcom/payair/logic/storage/StorageService;", "provideStorageService", "(Landroid/content/Context;)Lcom/payair/logic/storage/StorageService;", "Lcom/payair/logic/storage/TokenizationTimestampStorage;", "provideTokenizationTimestampStorage", "(Landroid/content/Context;)Lcom/payair/logic/storage/TokenizationTimestampStorage;", "Lcom/payair/logic/storage/SchemeStorage;", "provideSchemeStorage", "(Landroid/content/Context;)Lcom/payair/logic/storage/SchemeStorage;", "Lcom/payair/logic/storage/EnrollmentIdStorage;", "provideEnrollmentIdStorage", "(Landroid/content/Context;)Lcom/payair/logic/storage/EnrollmentIdStorage;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class CacheModule {
    public static final com.payair.logic.di.CacheModule INSTANCE = new com.payair.logic.di.CacheModule();

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.storage.implementation.CertificateStorage provideCertificateStorage(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.payair.logic.storage.implementation.FileCertificateStorage(context);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.storage.EnrollmentIdStorage provideEnrollmentIdStorage(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.payair.logic.storage.DataStoreEnrollmentIdStorage(context);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.storage.SchemeStorage provideSchemeStorage(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.payair.logic.storage.DataStoreSchemeStorage(context);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.storage.StorageService provideStorageService(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.payair.logic.storage.StorageServiceImpl(context);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.storage.TokenizationTimestampStorage provideTokenizationTimestampStorage(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.payair.logic.storage.DataStoreTokenizationTimestampStorage(context);
    }
}
