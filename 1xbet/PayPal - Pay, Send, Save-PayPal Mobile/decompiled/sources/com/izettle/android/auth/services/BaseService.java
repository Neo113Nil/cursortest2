package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\b`\u0018\u0000 \n2\u00020\u0001:\u0001\nJ3\u0010\b\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00040\u0003\u0012\u0004\u0012\u00020\u00070\u0002H&¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/izettle/android/auth/services/BaseService;", "", "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/Response;", "", "", "", "", "getBaseUrls", "()Lcom/izettle/android/core/data/result/Result;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface BaseService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.services.BaseService.Companion INSTANCE = com.izettle.android.auth.services.BaseService.Companion.$$INSTANCE;

    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<java.util.Map<java.lang.String, java.util.List<java.lang.String>>>, java.lang.Throwable> getBaseUrls();

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/services/BaseService$Companion;", "", "<init>", "()V", "Lcom/izettle/android/net/HttpClient;", "httpClient", "Lcom/izettle/android/auth/BackendEnvironment;", "backendEnvironment", "Lcom/izettle/android/auth/services/BaseService;", "create", "(Lcom/izettle/android/net/HttpClient;Lcom/izettle/android/auth/BackendEnvironment;)Lcom/izettle/android/auth/services/BaseService;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.services.BaseService.Companion $$INSTANCE = new com.izettle.android.auth.services.BaseService.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.services.BaseService create(com.izettle.android.net.HttpClient httpClient, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
            return new com.izettle.android.auth.services.BaseServiceImpl(httpClient, backendEnvironment);
        }
    }
}
