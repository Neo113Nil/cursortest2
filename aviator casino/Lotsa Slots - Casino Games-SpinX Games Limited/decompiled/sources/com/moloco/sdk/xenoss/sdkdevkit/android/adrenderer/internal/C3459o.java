package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3459o {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f7533a = "DEC_FAILED_TO_LOAD";
    public static final java.lang.String b = "DEC_LOADED_WITH_NO_APP_ICON";
    public static final java.lang.String c = "DECLoaderImpl";

    public static final void b(java.lang.String str) {
        com.moloco.sdk.internal.MolocoLogger.debug$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, c, str, false, 4, null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, com.moloco.sdk.internal.error.b errorReportingService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReportingService, "errorReportingService");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3458n(mediaCacheRepository, errorReportingService);
    }
}
