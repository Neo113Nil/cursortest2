package com.paypal.oslo.core.session.di;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/session/di/CacheClearerModule;", "", "Lcom/paypal/oslo/core/session/NetworkCacheClearerImpl;", "impl", "Lcom/paypal/oslo/core/session/NetworkCacheClearer;", "bindNetworkCacheClearer", "(Lcom/paypal/oslo/core/session/NetworkCacheClearerImpl;)Lcom/paypal/oslo/core/session/NetworkCacheClearer;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public interface CacheClearerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.session.di.CacheClearerModule.Companion INSTANCE = com.paypal.oslo.core.session.di.CacheClearerModule.Companion.Camera2StreamConfigurationMap;

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.session.NetworkCacheClearer bindNetworkCacheClearer(com.paypal.oslo.core.session.NetworkCacheClearerImpl impl);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/session/di/CacheClearerModule$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "provideCacheDir", "(Landroid/content/Context;)Ljava/io/File;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.paypal.oslo.core.session.di.CacheClearerModule.Companion Camera2StreamConfigurationMap = new com.paypal.oslo.core.session.di.CacheClearerModule.Companion();

        private Companion() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        public final java.io.File provideCacheDir(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            java.io.File cacheDir = context.getCacheDir();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cacheDir, "");
            return cacheDir;
        }
    }
}
