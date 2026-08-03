package com.helpshift.notification;

/* loaded from: classes2.dex */
public class HelpshiftNotificationResourceCacheManager {
    private static final java.lang.String TAG = "HelpshiftNotificationResourceCacheManager";
    private final long MAX_CACHE_INTERVAL = com.helpshift.util.Utils.TIME_7DAYS_MILLIS;
    private final java.lang.String NOTIFICATIONS_CACHE_DIR = com.ironsource.C3232q2.x;
    private final java.lang.String cacheDirAbsolutePath;
    private final com.helpshift.network.HSDownloaderNetwork hsDownloaderNetwork;
    private final com.helpshift.concurrency.HSThreadingService threadingService;

    public HelpshiftNotificationResourceCacheManager(com.helpshift.network.HSDownloaderNetwork hSDownloaderNetwork, java.lang.String str, com.helpshift.concurrency.HSThreadingService hSThreadingService) {
        this.hsDownloaderNetwork = hSDownloaderNetwork;
        this.threadingService = hSThreadingService;
        this.cacheDirAbsolutePath = str;
    }

    public void queueDownloads(java.util.Set<java.lang.String> set, com.helpshift.util.ValueListener<java.util.Map<java.lang.String, java.io.File>> valueListener) {
        final java.util.HashMap hashMap = new java.util.HashMap();
        com.helpshift.util.Utils.removeEmptyValues(set);
        com.helpshift.log.HSLogger.d(TAG, "Queueing notification resource downloads, size: " + set.size());
        for (final java.lang.String str : set) {
            this.threadingService.getNetworkService().submit(new java.lang.Runnable() { // from class: com.helpshift.notification.HelpshiftNotificationResourceCacheManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.helpshift.notification.HelpshiftNotificationResourceCacheManager.this.m5681x435d8a1c(str, hashMap);
                }
            });
        }
        checkDownloadsComplete(20, set.size(), hashMap, valueListener);
    }

    /* renamed from: lambda$queueDownloads$0$com-helpshift-notification-HelpshiftNotificationResourceCacheManager, reason: not valid java name */
    /* synthetic */ void m5681x435d8a1c(java.lang.String str, java.util.Map map) {
        try {
            java.net.URL url = new java.net.URL(str);
            java.io.File file = new java.io.File(com.helpshift.util.Utils.getResourceCacheDirPath(this.cacheDirAbsolutePath, com.ironsource.C3232q2.x), com.helpshift.util.Utils.generateURLStorageKey(url.getPath(), url.getQuery()));
            if (!file.exists() || file.length() <= 0) {
                file.getParentFile().mkdirs();
                this.hsDownloaderNetwork.downloadResource(str, new java.util.HashMap(), file);
                map.put(str, file);
            } else {
                com.helpshift.log.HSLogger.d(TAG, "File exists in cache, skip network: " + str);
                map.put(str, file);
            }
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error downloading notification resource", e);
            map.put(str, null);
        }
    }

    private void checkDownloadsComplete(final int i, final int i2, final java.util.Map<java.lang.String, java.io.File> map, final com.helpshift.util.ValueListener<java.util.Map<java.lang.String, java.io.File>> valueListener) {
        com.helpshift.util.Utils.executeWithDelay(new java.lang.Runnable() { // from class: com.helpshift.notification.HelpshiftNotificationResourceCacheManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.notification.HelpshiftNotificationResourceCacheManager.this.m5680xb6959d39(i, i2, map, valueListener);
            }
        }, 1000L);
    }

    /* renamed from: lambda$checkDownloadsComplete$1$com-helpshift-notification-HelpshiftNotificationResourceCacheManager, reason: not valid java name */
    /* synthetic */ void m5680xb6959d39(int i, int i2, java.util.Map map, com.helpshift.util.ValueListener valueListener) {
        if (i == 0 || i2 == map.size()) {
            valueListener.update(map);
        } else {
            checkDownloadsComplete(i - 1, i2, map, valueListener);
        }
    }

    public void deleteOlderCachedFiles() {
        com.helpshift.util.FileUtil.deleteOlderCachedFiles(this.cacheDirAbsolutePath, com.ironsource.C3232q2.x, com.helpshift.util.Utils.TIME_7DAYS_MILLIS);
    }
}
