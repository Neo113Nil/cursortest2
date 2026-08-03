package com.moloco.sdk.internal.error;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.internal.error.b {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.config.a f6957a;
    public final com.moloco.sdk.internal.error.api.a b;
    public final java.lang.String c;

    public c(com.moloco.sdk.internal.services.config.a configService, com.moloco.sdk.internal.error.api.a errorReportingApi) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configService, "configService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReportingApi, "errorReportingApi");
        this.f6957a = configService;
        this.b = errorReportingApi;
        this.c = "ErrorReportingServiceImpl";
    }

    @Override // com.moloco.sdk.internal.error.b
    public void a(java.lang.String error, com.moloco.sdk.internal.error.a errorMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorMetadata, "errorMetadata");
        if (this.f6957a.a(com.moloco.sdk.internal.error.d.f6962a)) {
            java.lang.String b = this.f6957a.b(com.moloco.sdk.internal.error.d.f6962a);
            if (b == null) {
                com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Error reporting is enabled but with invalid url", null, false, 12, null);
                return;
            } else {
                this.b.a(error, b, errorMetadata);
                return;
            }
        }
        com.moloco.sdk.internal.MolocoLogger.warn$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.c, "Error reporting is disabled. Tried to report error: " + error, null, false, 12, null);
    }
}
