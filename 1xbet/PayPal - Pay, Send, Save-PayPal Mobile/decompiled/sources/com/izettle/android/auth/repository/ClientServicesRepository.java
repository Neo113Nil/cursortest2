package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b`\u0018\u0000 \t2\u00020\u0001:\u0001\tJ#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/repository/ClientServicesRepository;", "", "", "service", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/ServiceUrls;", "", "getServiceUrl", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ClientServicesRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.repository.ClientServicesRepository.Companion INSTANCE = com.izettle.android.auth.repository.ClientServicesRepository.Companion.$$INSTANCE;

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getServiceUrl(java.lang.String service);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/izettle/android/auth/repository/ClientServicesRepository$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/repository/BaseUriRepository;", "baseUriRepository", "Lcom/izettle/android/auth/repository/ServiceUriRepository;", "serviceUriRepository", "Lcom/izettle/android/auth/BackendEnvironment;", "backendEnvironment", "Lcom/izettle/android/auth/repository/ClientServicesRepositoryImpl;", "create", "(Lcom/izettle/android/auth/repository/BaseUriRepository;Lcom/izettle/android/auth/repository/ServiceUriRepository;Lcom/izettle/android/auth/BackendEnvironment;)Lcom/izettle/android/auth/repository/ClientServicesRepositoryImpl;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.repository.ClientServicesRepository.Companion $$INSTANCE = new com.izettle.android.auth.repository.ClientServicesRepository.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.repository.ClientServicesRepositoryImpl create(com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseUriRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceUriRepository, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
            return new com.izettle.android.auth.repository.ClientServicesRepositoryImpl(baseUriRepository, serviceUriRepository, backendEnvironment);
        }
    }
}
