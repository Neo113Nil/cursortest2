package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J1\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/izettle/android/auth/repository/ServiceUriRepository;", "", "", "forceSync", "Lcom/izettle/android/core/data/result/Result;", "", "", "Lcom/izettle/android/auth/model/ServiceUrls;", "", "getServiceUrls", "(Z)Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/HttpUrl;", "url", "", "invalidateUrl", "(Lcom/izettle/android/net/HttpUrl;)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ServiceUriRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.repository.ServiceUriRepository.Companion INSTANCE = com.izettle.android.auth.repository.ServiceUriRepository.Companion.$$INSTANCE;

    com.izettle.android.core.data.result.Result<java.util.Map<java.lang.String, com.izettle.android.auth.model.ServiceUrls>, java.lang.Throwable> getServiceUrls(boolean forceSync);

    void invalidateUrl(com.izettle.android.net.HttpUrl url);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ com.izettle.android.core.data.result.Result getServiceUrls$default(com.izettle.android.auth.repository.ServiceUriRepository serviceUriRepository, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getServiceUrls");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return serviceUriRepository.getServiceUrls(z);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/izettle/android/auth/repository/ServiceUriRepository$Companion;", "", "<init>", "()V", "Lcom/izettle/android/auth/services/MobileService;", "mobileService", "Lkotlin/Function0;", "", "accessTokenResolver", "Lcom/izettle/android/auth/repository/ServiceUriRepositoryImpl;", "create", "(Lcom/izettle/android/auth/services/MobileService;Lkotlin/jvm/functions/Function0;)Lcom/izettle/android/auth/repository/ServiceUriRepositoryImpl;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.repository.ServiceUriRepository.Companion $$INSTANCE = new com.izettle.android.auth.repository.ServiceUriRepository.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.repository.ServiceUriRepositoryImpl create(com.izettle.android.auth.services.MobileService mobileService, kotlin.jvm.functions.Function0<java.lang.String> accessTokenResolver) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileService, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessTokenResolver, "");
            return new com.izettle.android.auth.repository.ServiceUriRepositoryImpl(mobileService, accessTokenResolver);
        }
    }
}
