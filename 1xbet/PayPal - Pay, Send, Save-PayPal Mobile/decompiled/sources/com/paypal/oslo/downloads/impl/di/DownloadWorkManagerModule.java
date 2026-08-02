package com.paypal.oslo.downloads.impl.di;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/downloads/impl/di/DownloadWorkManagerModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/work/WorkManager;", "provideWorkManager", "(Landroid/content/Context;)Landroidx/work/WorkManager;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes5.dex */
public final class DownloadWorkManagerModule {
    public static final com.paypal.oslo.downloads.impl.di.DownloadWorkManagerModule INSTANCE = new com.paypal.oslo.downloads.impl.di.DownloadWorkManagerModule();

    private DownloadWorkManagerModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    public final androidx.work.WorkManager provideWorkManager(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return androidx.work.WorkManager.INSTANCE.getInstance(context);
    }
}
