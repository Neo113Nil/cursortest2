package com.moloco.sdk.internal.error.api;

/* loaded from: classes5.dex */
public final class b implements com.moloco.sdk.internal.error.api.a {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.J f6956a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a b;
    public final java.lang.String c;

    public b(com.moloco.sdk.internal.services.J timeProviderService, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.a httpClient) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f6956a = timeProviderService;
        this.b = httpClient;
        this.c = "ErrorReportingApi";
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(java.lang.Throwable error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "SDK Crashed", error, false, 8, null);
    }

    @Override // com.moloco.sdk.internal.error.api.a
    public void a(java.lang.String error, java.lang.String url, com.moloco.sdk.internal.error.a errorMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        java.lang.String b = com.moloco.sdk.internal.utils.b.b(com.moloco.sdk.internal.utils.b.a(url, error, this.f6956a.invoke()), errorMetadata.b());
        com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Reporting error: " + error + " to url: " + b, null, false, 12, null);
        this.b.a(b);
    }
}
