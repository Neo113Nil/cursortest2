package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class CompletionCallbacksManager {
    final java.util.concurrent.ConcurrentMap<java.lang.String, java.util.List<com.adobe.marketing.mobile.EdgeEventHandle>> Camera2StreamConfigurationMap;
    final java.util.concurrent.ConcurrentMap<java.lang.String, com.adobe.marketing.mobile.EdgeCallback> getHighResolutionOutputSizeshNQ4ISI;

    /* synthetic */ CompletionCallbacksManager(byte b) {
        this();
    }

    private CompletionCallbacksManager() {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.concurrent.ConcurrentHashMap();
        this.Camera2StreamConfigurationMap = new java.util.concurrent.ConcurrentHashMap();
    }

    static class SingletonHelper {
        private static final com.adobe.marketing.mobile.CompletionCallbacksManager getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.CompletionCallbacksManager(0);

        private SingletonHelper() {
        }
    }

    static com.adobe.marketing.mobile.CompletionCallbacksManager Camera2StreamConfigurationMap() {
        return com.adobe.marketing.mobile.CompletionCallbacksManager.SingletonHelper.getHighResolutionOutputSizeshNQ4ISI;
    }
}
