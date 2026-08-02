package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\r\u0010\u0006J\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u000e\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/izettle/android/auth/repository/BaseUriRepository;", "", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/model/ServiceUrls;", "", "getApiServiceUrls", "()Lcom/izettle/android/core/data/result/Result;", "", "forceSync", "", "", "getBaseUrls", "(Z)Lcom/izettle/android/core/data/result/Result;", "getOAuth2ServiceUrls", "getOAuthServiceUrls", "Lcom/izettle/android/net/HttpUrl;", "url", "", "invalidateUrl", "(Lcom/izettle/android/net/HttpUrl;)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BaseUriRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.repository.BaseUriRepository.Companion INSTANCE = com.izettle.android.auth.repository.BaseUriRepository.Companion.$$INSTANCE;

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getApiServiceUrls();

    com.izettle.android.core.data.result.Result<java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls>, java.lang.Throwable> getBaseUrls(boolean forceSync);

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getOAuth2ServiceUrls();

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.ServiceUrls, java.lang.Throwable> getOAuthServiceUrls();

    void invalidateUrl(com.izettle.android.net.HttpUrl url);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ com.izettle.android.core.data.result.Result getBaseUrls$default(com.izettle.android.auth.repository.BaseUriRepository baseUriRepository, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBaseUrls");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return baseUriRepository.getBaseUrls(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/izettle/android/auth/repository/BaseUriRepository$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/services/BaseService;", "baseService", "Lcom/izettle/android/auth/repository/BaseUriRepositoryImpl;", "create", "(Lcom/izettle/android/auth/services/BaseService;)Lcom/izettle/android/auth/repository/BaseUriRepositoryImpl;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.repository.BaseUriRepository.Companion $$INSTANCE = new com.izettle.android.auth.repository.BaseUriRepository.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.repository.BaseUriRepositoryImpl create(com.izettle.android.auth.services.BaseService baseService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseService, "");
            return new com.izettle.android.auth.repository.BaseUriRepositoryImpl(baseService);
        }
    }
}
