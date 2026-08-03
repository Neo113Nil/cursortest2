package com.unity3d.services.core.cache;

/* loaded from: classes6.dex */
class CacheThreadHandler extends android.os.Handler {
    private com.unity3d.services.core.request.WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    CacheThreadHandler() {
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> hashMap;
        android.os.Bundle data = message.getData();
        java.lang.String string = data.getString("source");
        data.remove("source");
        java.lang.String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        com.unity3d.services.core.cache.CacheEventSender cacheEventSender = (com.unity3d.services.core.cache.CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            com.unity3d.services.core.log.DeviceLog.debug("There are headers left in data, reading them");
            java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> hashMap2 = new java.util.HashMap<>();
            for (java.lang.String str : data.keySet()) {
                hashMap2.put(str, java.util.Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        java.io.File file = new java.io.File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR, com.unity3d.services.core.cache.CacheError.FILE_STATE_WRONG, string, string2, java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, hashMap, z, cacheEventSender);
        }
    }

    public void setCancelStatus(boolean z) {
        com.unity3d.services.core.request.WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }

    public boolean isActive() {
        return this._active;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private void downloadFile(java.lang.String r25, java.lang.String r26, int r27, int r28, int r29, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r30, boolean r31, com.unity3d.services.core.cache.CacheEventSender r32) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.CacheThreadHandler.downloadFile(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean, com.unity3d.services.core.cache.CacheEventSender):void");
    }

    private void postProcessDownload(long j, java.lang.String str, java.io.File file, long j2, long j3, boolean z, int i, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, com.unity3d.services.core.cache.CacheEventSender cacheEventSender) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (!z) {
            com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + elapsedRealtime + "ms");
            cacheEventSender.sendEvent(com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_END, str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(i), com.unity3d.services.core.api.Request.getResponseHeadersMap(map));
            return;
        }
        com.unity3d.services.core.log.DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
        cacheEventSender.sendEvent(com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_STOPPED, str, java.lang.Long.valueOf(j2), java.lang.Long.valueOf(j3), java.lang.Long.valueOf(elapsedRealtime), java.lang.Integer.valueOf(i), com.unity3d.services.core.api.Request.getResponseHeadersMap(map));
    }

    private com.unity3d.services.core.request.WebRequest getWebRequest(java.lang.String str, int i, int i2, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> hashMap) throws java.net.MalformedURLException {
        java.util.HashMap hashMap2 = new java.util.HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new com.unity3d.services.core.request.WebRequest(str, "GET", hashMap2, i, i2);
    }
}
