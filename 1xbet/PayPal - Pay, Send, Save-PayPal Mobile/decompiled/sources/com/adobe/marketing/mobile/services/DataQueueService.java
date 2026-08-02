package com.adobe.marketing.mobile.services;

/* loaded from: classes3.dex */
class DataQueueService implements com.adobe.marketing.mobile.services.DataQueuing {
    private final java.util.Map<java.lang.String, com.adobe.marketing.mobile.services.DataQueue> getHighSpeedVideoFpsRangesFor = new java.util.HashMap();

    DataQueueService() {
    }

    @Override // com.adobe.marketing.mobile.services.DataQueuing
    public com.adobe.marketing.mobile.services.DataQueue getDataQueue(java.lang.String str) {
        if (com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str)) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DataQueueService", "Failed to create DataQueue, database name is null", new java.lang.Object[0]);
            return null;
        }
        com.adobe.marketing.mobile.services.DataQueue dataQueue = this.getHighSpeedVideoFpsRangesFor.get(str);
        if (dataQueue != null) {
            return dataQueue;
        }
        synchronized (this) {
            com.adobe.marketing.mobile.services.DataQueue dataQueue2 = this.getHighSpeedVideoFpsRangesFor.get(str);
            if (dataQueue2 == null) {
                java.io.File highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str);
                if (highSpeedVideoFpsRanges == null) {
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DataQueueService", "Failed to create DataQueue for database (%s).", str);
                    return null;
                }
                com.adobe.marketing.mobile.services.SQLiteDataQueue sQLiteDataQueue = new com.adobe.marketing.mobile.services.SQLiteDataQueue(str, highSpeedVideoFpsRanges.getPath());
                this.getHighSpeedVideoFpsRangesFor.put(str, sQLiteDataQueue);
                dataQueue2 = sQLiteDataQueue;
            }
            return dataQueue2;
        }
    }

    private static java.io.File getHighSpeedVideoFpsRanges(java.lang.String str) {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DataQueueService", "Failed to create DataQueue for database (%s), the ApplicationContext is null", str);
            return null;
        }
        java.lang.String removeRelativePath = com.adobe.marketing.mobile.internal.util.FileUtils.removeRelativePath(str);
        java.io.File databasePath = applicationContext.getDatabasePath(removeRelativePath);
        if (!databasePath.exists()) {
            try {
                java.io.File applicationCacheDir = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
                if (applicationCacheDir != null) {
                    java.io.File file = new java.io.File(applicationCacheDir, removeRelativePath);
                    if (file.exists()) {
                        com.adobe.marketing.mobile.internal.util.FileUtils.moveFile(file, databasePath);
                        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DataQueueService", "Successfully moved DataQueue for database (%s) from cache directory to database directory", str);
                    }
                }
            } catch (java.lang.Exception unused) {
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, "DataQueueService", "Failed to move DataQueue for database (%s) from cache directory to database directory", str);
            }
        }
        return databasePath;
    }
}
