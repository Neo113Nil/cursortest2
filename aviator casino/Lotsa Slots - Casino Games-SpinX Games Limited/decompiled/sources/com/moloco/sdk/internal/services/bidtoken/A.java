package com.moloco.sdk.internal.services.bidtoken;

/* loaded from: classes5.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy f7214a = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.internal.services.bidtoken.A$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.internal.services.bidtoken.A.a();
        }
    });

    public static final com.moloco.sdk.internal.services.bidtoken.z a() {
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, "ServerBidTokenService", "Creating BidTokenService instance", null, false, 12, null);
        com.moloco.sdk.service_locator.a.e eVar = com.moloco.sdk.service_locator.a.e.f7346a;
        io.ktor.client.HttpClient a2 = com.moloco.sdk.internal.http.a.a(eVar.h().invoke(), eVar.l().invoke());
        com.moloco.sdk.internal.services.bidtoken.j jVar = new com.moloco.sdk.internal.services.bidtoken.j(2800L, 3, 200L);
        java.lang.String language = java.util.Locale.getDefault().getLanguage();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        java.lang.String RELEASE = android.os.Build.VERSION.RELEASE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        java.lang.String str = android.os.Build.MANUFACTURER;
        java.lang.String str2 = str == null ? "" : str;
        java.lang.String str3 = android.os.Build.MODEL;
        java.lang.String str4 = str3 == null ? "" : str3;
        java.lang.String str5 = android.os.Build.HARDWARE;
        return new com.moloco.sdk.internal.services.bidtoken.z(new com.moloco.sdk.internal.services.bidtoken.c(com.moloco.sdk.BuildConfig.SDK_VERSION_NAME, a2, jVar, new com.moloco.sdk.internal.services.bidtoken.g(language, RELEASE, str2, str4, str5 == null ? "" : str5)), kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null).plus(com.moloco.sdk.internal.scheduling.b.a().getIo())), com.moloco.sdk.internal.services.bidtoken.v.f7251a.a(new com.moloco.sdk.internal.bidtoken.c(), new com.moloco.sdk.internal.services.K()));
    }

    public static final com.moloco.sdk.internal.services.bidtoken.z c() {
        return (com.moloco.sdk.internal.services.bidtoken.z) f7214a.getValue();
    }
}
