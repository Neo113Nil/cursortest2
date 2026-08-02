package com.izettle.android.auth.services;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0003\b`\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ;\u0010\t\u001a&\u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u00060\u0005\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/services/MobileService;", "", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.ACCESS_TOKEN, "Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/net/Response;", "", "", "", "getServiceUrls", "(Ljava/lang/String;)Lcom/izettle/android/core/data/result/Result;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface MobileService {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.izettle.android.auth.services.MobileService.Companion INSTANCE = com.izettle.android.auth.services.MobileService.Companion.$$INSTANCE;

    com.izettle.android.core.data.result.Result<com.izettle.android.net.Response<java.util.Map<java.lang.String, java.util.List<java.lang.String>>>, java.lang.Throwable> getServiceUrls(java.lang.String accessToken);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/izettle/android/auth/services/MobileService$Companion;", "", "<init>", "()V", "Lcom/izettle/android/net/HttpClient;", "httpClient", "Lcom/izettle/android/auth/BackendEnvironment;", "backendEnvironment", "Lcom/izettle/android/auth/services/MobileService;", "create", "(Lcom/izettle/android/net/HttpClient;Lcom/izettle/android/auth/BackendEnvironment;)Lcom/izettle/android/auth/services/MobileService;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.izettle.android.auth.services.MobileService.Companion $$INSTANCE = new com.izettle.android.auth.services.MobileService.Companion();

        private Companion() {
        }

        public final com.izettle.android.auth.services.MobileService create(com.izettle.android.net.HttpClient httpClient, com.izettle.android.auth.BackendEnvironment backendEnvironment) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backendEnvironment, "");
            return new com.izettle.android.auth.services.MobileServiceImpl(httpClient, backendEnvironment);
        }
    }
}
