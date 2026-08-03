package com.helpshift.cache;

/* loaded from: classes4.dex */
public class HelpcenterCacheEvictionManager {
    private static final long CACHE_EVICTION_OPERATION_INTERVAL = 604800000;
    private static final long MAX_CACHE_INTERVAL = 2592000000L;
    private static final java.lang.String TAG = "HCCacheEvctnMngr";
    private final java.lang.String appFileDirPath;
    private final com.helpshift.storage.HSPersistentStorage persistentStorage;
    private final java.lang.String subdirPath;

    public HelpcenterCacheEvictionManager(com.helpshift.storage.HSPersistentStorage hSPersistentStorage, java.lang.String str, java.lang.String str2) {
        this.persistentStorage = hSPersistentStorage;
        this.appFileDirPath = str;
        this.subdirPath = str2;
    }

    public void deleteOlderHelpcenterCachedFiles() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long lastHCCacheEvictedTime = this.persistentStorage.getLastHCCacheEvictedTime();
        if (lastHCCacheEvictedTime == 0) {
            updateLastCacheEvictedTime(currentTimeMillis);
        } else {
            if (currentTimeMillis - lastHCCacheEvictedTime < 604800000) {
                return;
            }
            updateLastCacheEvictedTime(currentTimeMillis);
            com.helpshift.util.FileUtil.deleteOlderCachedFiles(this.appFileDirPath, this.subdirPath, MAX_CACHE_INTERVAL);
        }
    }

    private void updateLastCacheEvictedTime(long j) {
        this.persistentStorage.setLastHCCacheEvictedTime(j);
    }
}
