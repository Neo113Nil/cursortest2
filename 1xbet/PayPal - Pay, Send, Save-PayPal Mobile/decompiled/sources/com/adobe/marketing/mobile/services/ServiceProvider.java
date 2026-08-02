package com.adobe.marketing.mobile.services;

/* loaded from: classes3.dex */
public class ServiceProvider {
    private com.adobe.marketing.mobile.services.DeviceInfoService Camera2StreamConfigurationMap;
    private com.adobe.marketing.mobile.services.DataQueuing getHighResolutionOutputSizeshNQ4ISI;
    private com.adobe.marketing.mobile.services.caching.CacheService getHighSpeedVideoFpsRanges;
    private com.adobe.marketing.mobile.services.DataStoring getHighSpeedVideoFpsRangesFor;
    private com.adobe.marketing.mobile.services.Logging getHighSpeedVideoSizes;
    private com.adobe.marketing.mobile.services.AppContextService getHighSpeedVideoSizesFor;
    private com.adobe.marketing.mobile.services.uri.UriOpening getInputFormats;
    private com.adobe.marketing.mobile.services.NetworkService getInputSizeshNQ4ISI;
    private com.adobe.marketing.mobile.services.ui.UIService getOutputFormats;
    private com.adobe.marketing.mobile.services.DeviceInforming getOutputMinFrameDuration;
    private com.adobe.marketing.mobile.services.Networking getOutputSizes;
    private com.adobe.marketing.mobile.services.Logging getOutputStallDurationlomOqCM;

    /* synthetic */ ServiceProvider(byte b) {
        this();
    }

    static class ServiceProviderSingleton {
        private static final com.adobe.marketing.mobile.services.ServiceProvider getHighSpeedVideoSizes = new com.adobe.marketing.mobile.services.ServiceProvider(0);

        private ServiceProviderSingleton() {
        }
    }

    public static com.adobe.marketing.mobile.services.ServiceProvider getInstance() {
        return com.adobe.marketing.mobile.services.ServiceProvider.ServiceProviderSingleton.getHighSpeedVideoSizes;
    }

    private ServiceProvider() {
        this.getInputSizeshNQ4ISI = new com.adobe.marketing.mobile.services.NetworkService();
        this.Camera2StreamConfigurationMap = new com.adobe.marketing.mobile.services.DeviceInfoService();
        this.getHighResolutionOutputSizeshNQ4ISI = new com.adobe.marketing.mobile.services.DataQueueService();
        this.getHighSpeedVideoFpsRangesFor = new com.adobe.marketing.mobile.services.LocalDataStoreService();
        this.getOutputFormats = new com.adobe.marketing.mobile.services.ui.AEPUIService();
        this.getHighSpeedVideoSizes = new com.adobe.marketing.mobile.services.AndroidLoggingService();
        this.getHighSpeedVideoFpsRanges = new com.adobe.marketing.mobile.services.internal.caching.FileCacheService();
        this.getInputFormats = new com.adobe.marketing.mobile.services.uri.UriService();
    }

    public com.adobe.marketing.mobile.services.Logging getLoggingService() {
        com.adobe.marketing.mobile.services.Logging logging = this.getOutputStallDurationlomOqCM;
        return logging != null ? logging : this.getHighSpeedVideoSizes;
    }

    public void setLoggingService(com.adobe.marketing.mobile.services.Logging logging) {
        this.getOutputStallDurationlomOqCM = logging;
    }

    public com.adobe.marketing.mobile.services.DataStoring getDataStoreService() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.adobe.marketing.mobile.services.DeviceInforming getDeviceInfoService() {
        com.adobe.marketing.mobile.services.DeviceInforming deviceInforming = this.getOutputMinFrameDuration;
        return deviceInforming != null ? deviceInforming : this.Camera2StreamConfigurationMap;
    }

    public com.adobe.marketing.mobile.services.Networking getNetworkService() {
        com.adobe.marketing.mobile.services.Networking networking = this.getOutputSizes;
        return networking != null ? networking : this.getInputSizeshNQ4ISI;
    }

    public void setNetworkService(com.adobe.marketing.mobile.services.Networking networking) {
        this.getOutputSizes = networking;
    }

    public com.adobe.marketing.mobile.services.DataQueuing getDataQueueService() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.adobe.marketing.mobile.services.ui.UIService getUIService() {
        return this.getOutputFormats;
    }

    public com.adobe.marketing.mobile.services.caching.CacheService getCacheService() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.adobe.marketing.mobile.services.AppContextService getAppContextService() {
        com.adobe.marketing.mobile.services.AppContextService appContextService = this.getHighSpeedVideoSizesFor;
        return appContextService != null ? appContextService : com.adobe.marketing.mobile.services.internal.context.App.INSTANCE;
    }

    public com.adobe.marketing.mobile.services.uri.UriOpening getUriService() {
        return this.getInputFormats;
    }
}
