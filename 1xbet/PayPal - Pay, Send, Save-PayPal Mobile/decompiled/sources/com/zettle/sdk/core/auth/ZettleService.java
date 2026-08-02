package com.zettle.sdk.core.auth;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/ZettleService;", "Lcom/zettle/sdk/core/Module;", "Lokhttp3/OkHttpClient;", "client", "", com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ACTION_REFRESH, "(Lokhttp3/OkHttpClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshServices", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface ZettleService extends com.zettle.sdk.core.Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.auth.ZettleService.Companion INSTANCE = com.zettle.sdk.core.auth.ZettleService.Companion.getHighSpeedVideoFpsRanges;

    java.lang.Object refresh(okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object refreshServices(okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void start(com.zettle.sdk.core.auth.ZettleService zettleService) {
            com.zettle.sdk.core.Module.DefaultImpls.start(zettleService);
        }

        public static void stop(com.zettle.sdk.core.auth.ZettleService zettleService) {
            com.zettle.sdk.core.Module.DefaultImpls.stop(zettleService);
        }

        public static java.lang.Object refresh(com.zettle.sdk.core.auth.ZettleService zettleService, okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return kotlin.Unit.INSTANCE;
        }

        public static java.lang.Object refreshServices(com.zettle.sdk.core.auth.ZettleService zettleService, okhttp3.OkHttpClient okHttpClient, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lcom/zettle/sdk/core/auth/ZettleService$Companion;", "", "<init>", "()V", "Ljava/lang/Class;", "Lcom/zettle/sdk/core/auth/ZettleService;", "TYPE", "Ljava/lang/Class;", "getTYPE$core_publicRelease", "()Ljava/lang/Class;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.auth.ZettleService.Companion getHighSpeedVideoFpsRanges = new com.zettle.sdk.core.auth.ZettleService.Companion();
        private static final java.lang.Class<com.zettle.sdk.core.auth.ZettleService> TYPE = com.zettle.sdk.core.auth.ZettleService.class;

        private Companion() {
        }

        public final java.lang.Class<com.zettle.sdk.core.auth.ZettleService> getTYPE$core_publicRelease() {
            return TYPE;
        }
    }
}
