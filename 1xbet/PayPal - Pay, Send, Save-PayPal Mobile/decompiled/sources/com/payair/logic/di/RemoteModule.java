package com.payair.logic.di;

@kotlin.Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b#\u0010$Ji\u00108\u001a\u0002072\u0006\u0010%\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\"2\u0006\u00104\u001a\u0002032\u0006\u0010\u001e\u001a\u00020\u00022\b\b\u0001\u00106\u001a\u000205H\u0007¢\u0006\u0004\b8\u00109"}, d2 = {"Lcom/payair/logic/di/RemoteModule;", "", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDKInterface", "Lcom/payair/logic/remote/remoteServices/TokenService;", "provideTokenService", "(Lcom/payair/logic/implementation/HceSDKInterface;)Lcom/payair/logic/remote/remoteServices/TokenService;", "tokenService", "Lcom/payair/logic/storage/StorageService;", "storageService", "Lcom/payair/logic/remote/repositories/TokenRemoteRepository;", "provideTokenRemoteRepository", "(Lcom/payair/logic/remote/remoteServices/TokenService;Lcom/payair/logic/storage/StorageService;)Lcom/payair/logic/remote/repositories/TokenRemoteRepository;", "Lcom/payair/logic/remote/remoteServices/TransactionHistoryService;", "provideTransactionHistoryService", "(Lcom/payair/logic/implementation/HceSDKInterface;)Lcom/payair/logic/remote/remoteServices/TransactionHistoryService;", "transactionHistoryService", "Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;", "provideTransactionHistoryRepository", "(Lcom/payair/logic/remote/remoteServices/TransactionHistoryService;)Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;", "Lcom/payair/logic/remote/remoteServices/AssetsService;", "provideAssetsService", "(Lcom/payair/logic/implementation/HceSDKInterface;)Lcom/payair/logic/remote/remoteServices/AssetsService;", "Lcom/payair/logic/remote/remoteServices/ProvisioningService;", "provideProvisioningService", "(Lcom/payair/logic/implementation/HceSDKInterface;)Lcom/payair/logic/remote/remoteServices/ProvisioningService;", "assetsService", "Lcom/payair/logic/remote/repositories/UserRemoteRepository;", "provideUserRemoteRepository", "(Lcom/payair/logic/remote/remoteServices/AssetsService;)Lcom/payair/logic/remote/repositories/UserRemoteRepository;", "hceSDK", "Lcom/payair/logic/remote/repositories/PushRemoteRepository;", "providePushRemoteRepository", "(Lcom/payair/logic/implementation/HceSDKInterface;)Lcom/payair/logic/remote/repositories/PushRemoteRepository;", "Lcom/payair/hce/visa/tokenization/VisaTokenization;", "provideVisaTokenization", "()Lcom/payair/hce/visa/tokenization/VisaTokenization;", "provisioningService", "Lcom/payair/logic/storage/implementation/CertificateStorage;", "certificateStorage", "Lcom/payair/logic/implementation/CardEncryptionManager;", "cardEncryption", "Lcom/payair/logic/storage/TokenizationTimestampStorage;", "timestampStorage", "Lcom/payair/logic/storage/SchemeStorage;", "schemeStorage", "Lcom/payair/logic/storage/EnrollmentIdStorage;", "enrollmentIdStorage", "Lcom/payair/db/Database;", "database", "visaTokenization", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "Landroid/content/Context;", "context", "Lcom/payair/logic/remote/repositories/HceRemoteRepository;", "provideHceRemoteRepository", "(Lcom/payair/logic/remote/remoteServices/ProvisioningService;Lcom/payair/logic/storage/implementation/CertificateStorage;Lcom/payair/logic/implementation/CardEncryptionManager;Lcom/payair/logic/storage/TokenizationTimestampStorage;Lcom/payair/logic/storage/SchemeStorage;Lcom/payair/logic/storage/EnrollmentIdStorage;Lcom/payair/db/Database;Lcom/payair/hce/visa/tokenization/VisaTokenization;Lcom/payair/logic/managers/CoroutineDispatcherProvider;Lcom/payair/logic/implementation/HceSDKInterface;Landroid/content/Context;)Lcom/payair/logic/remote/repositories/HceRemoteRepository;"}, k = 1, mv = {1, 9, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class RemoteModule {
    public static final com.payair.logic.di.RemoteModule INSTANCE = new com.payair.logic.di.RemoteModule();

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.remoteServices.AssetsService provideAssetsService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        return new com.payair.logic.remote.remoteServices.AssetsServiceImpl(hceSDKInterface);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.repositories.HceRemoteRepository provideHceRemoteRepository(com.payair.logic.remote.remoteServices.ProvisioningService provisioningService, com.payair.logic.storage.implementation.CertificateStorage certificateStorage, com.payair.logic.implementation.CardEncryptionManager cardEncryption, com.payair.logic.storage.TokenizationTimestampStorage timestampStorage, com.payair.logic.storage.SchemeStorage schemeStorage, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, com.payair.db.Database database, com.payair.hce.visa.tokenization.VisaTokenization visaTokenization, com.payair.logic.managers.CoroutineDispatcherProvider dispatcherProvider, com.payair.logic.implementation.HceSDKInterface hceSDK, @dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificateStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardEncryption, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestampStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schemeStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentIdStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visaTokenization, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dispatcherProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDK, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return new com.payair.logic.remote.repositories.HceRemoteRepositoryImpl(provisioningService, certificateStorage, cardEncryption, timestampStorage, schemeStorage, enrollmentIdStorage, database, visaTokenization, dispatcherProvider, hceSDK, context);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.remoteServices.ProvisioningService provideProvisioningService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        return new com.payair.logic.remote.remoteServices.ProvisioningServiceImpl(hceSDKInterface);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.repositories.PushRemoteRepository providePushRemoteRepository(com.payair.logic.implementation.HceSDKInterface hceSDK) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDK, "");
        return new com.payair.logic.remote.repositories.PushRemoteRepositoryImpl(hceSDK);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.repositories.TokenRemoteRepository provideTokenRemoteRepository(com.payair.logic.remote.remoteServices.TokenService tokenService, com.payair.logic.storage.StorageService storageService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        return new com.payair.logic.remote.repositories.TokenRemoteRepositoryImpl(tokenService, storageService);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.remoteServices.TokenService provideTokenService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        return new com.payair.logic.remote.remoteServices.TokenServiceImpl(hceSDKInterface);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.repositories.TransactionHistoryRepository provideTransactionHistoryRepository(com.payair.logic.remote.remoteServices.TransactionHistoryService transactionHistoryService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryService, "");
        return new com.payair.logic.remote.repositories.TransactionHistoryRepositoryImpl(transactionHistoryService);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.remoteServices.TransactionHistoryService provideTransactionHistoryService(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        return new com.payair.logic.remote.remoteServices.TransactionHistoryServiceImpl(hceSDKInterface);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.logic.remote.repositories.UserRemoteRepository provideUserRemoteRepository(com.payair.logic.remote.remoteServices.AssetsService assetsService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetsService, "");
        return new com.payair.logic.remote.repositories.UserRemoteRepositoryImpl(assetsService);
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final com.payair.hce.visa.tokenization.VisaTokenization provideVisaTokenization() {
        return com.payair.hce.visa.tokenization.VisaTokenizationInitializer.create();
    }
}
