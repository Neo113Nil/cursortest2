package com.zettle.sdk.core.log;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitor;", "", "", "tag", "", "report", "(Ljava/lang/String;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface HealthMonitor {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.log.HealthMonitor.Companion INSTANCE = com.zettle.sdk.core.log.HealthMonitor.Companion.getHighSpeedVideoFpsRangesFor;

    void report(java.lang.String tag);

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/log/HealthMonitor$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "", "isDebug", "Lcom/zettle/sdk/core/log/HealthMonitor;", "create", "(Landroid/content/Context;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/meta/AppInfo;Z)Lcom/zettle/sdk/core/log/HealthMonitor;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.zettle.sdk.core.log.HealthMonitor.Companion getHighSpeedVideoFpsRangesFor = new com.zettle.sdk.core.log.HealthMonitor.Companion();

        private Companion() {
        }

        public final com.zettle.sdk.core.log.HealthMonitor create(android.content.Context context, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.meta.AppInfo appInfo, final boolean isDebug) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
            java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
            java.io.File filesDir = context.getFilesDir();
            com.zettle.sdk.io.RoundFileWriter create = com.zettle.sdk.io.RoundFileWriter.INSTANCE.create(new java.io.File(filesDir, "izettle-health-monitor-rolling-logs.log"));
            com.zettle.sdk.io.FileWriter create2 = com.zettle.sdk.io.FileWriter.INSTANCE.create(new java.io.File(filesDir, "izettle-health-monitor-flags.bin"));
            java.io.File file = new java.io.File(filesDir, "izettle-health-monitor-records");
            kotlin.jvm.functions.Function2 uploaderDebug = isDebug ? new com.zettle.sdk.core.log.UploaderDebug() : new com.zettle.sdk.core.log.UploaderProd(networkModule);
            com.zettle.sdk.meta.Platform.Companion companion = com.zettle.sdk.meta.Platform.INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
            final com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl = new com.zettle.sdk.core.log.HealthMonitorImpl(networkModule, create, create2, file, appInfo, companion, newSingleThreadExecutor, new com.zettle.sdk.core.log.HealthMonitor$Companion$create$healthMonitor$1(com.zettle.sdk.io.FileWriter.INSTANCE), uploaderDebug, null, 512, null);
            newSingleThreadExecutor.execute(new java.lang.Runnable() { // from class: com.zettle.sdk.core.log.HealthMonitor$Companion$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.zettle.sdk.core.log.HealthMonitor.Companion.$r8$lambda$gavGPS6sKLtXsXSV7NIy3VqkmH0(com.zettle.sdk.core.log.HealthMonitorImpl.this, isDebug);
                }
            });
            return healthMonitorImpl;
        }

        public static /* synthetic */ void $r8$lambda$gavGPS6sKLtXsXSV7NIy3VqkmH0(com.zettle.sdk.core.log.HealthMonitorImpl healthMonitorImpl, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(healthMonitorImpl, "");
            healthMonitorImpl.start();
            com.zettle.sdk.commons.util.Log.INSTANCE.setStrategy(new com.zettle.sdk.core.log.CombinedLogStrategy(kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.zettle.sdk.commons.util.Log.Strategy[]{z ? new com.zettle.sdk.commons.util.LogcatStrategy() : new com.zettle.sdk.commons.util.EmptyStrategy(), healthMonitorImpl})));
            com.zettle.sdk.commons.thread.MonitoredThreads.INSTANCE.addExceptionHandler(healthMonitorImpl);
            com.zettle.sdk.core.ZettleScope.INSTANCE.setMonitor$core_publicRelease(healthMonitorImpl);
        }
    }
}
