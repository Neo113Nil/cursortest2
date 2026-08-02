package com.adobe.marketing.mobile.services;

/* loaded from: classes3.dex */
class NetworkService implements com.adobe.marketing.mobile.services.Networking {
    private static final java.lang.String getHighSpeedVideoFpsRanges = "NetworkService";
    private final java.util.concurrent.ExecutorService Camera2StreamConfigurationMap = new java.util.concurrent.ThreadPoolExecutor(0, 32, 60, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.SynchronousQueue());

    NetworkService() {
    }

    @Override // com.adobe.marketing.mobile.services.Networking
    public void connectAsync(final com.adobe.marketing.mobile.services.NetworkRequest networkRequest, final com.adobe.marketing.mobile.services.NetworkCallback networkCallback) {
        java.lang.String message;
        android.net.ConnectivityManager connectivityManager = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getConnectivityManager();
        if (connectivityManager == null) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoFpsRanges, "ConnectivityManager instance is null. Unable to the check the network condition.", new java.lang.Object[0]);
        } else if (!com.adobe.marketing.mobile.internal.util.NetworkUtils.isInternetAvailable(connectivityManager)) {
            com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoFpsRanges, "The Android device is offline.", new java.lang.Object[0]);
            networkCallback.call(null);
            return;
        }
        try {
            this.Camera2StreamConfigurationMap.submit(new java.lang.Runnable() { // from class: com.adobe.marketing.mobile.services.NetworkService$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.adobe.marketing.mobile.services.NetworkService networkService = com.adobe.marketing.mobile.services.NetworkService.this;
                    com.adobe.marketing.mobile.services.NetworkRequest networkRequest2 = networkRequest;
                    com.adobe.marketing.mobile.services.NetworkCallback networkCallback2 = networkCallback;
                    com.adobe.marketing.mobile.services.HttpConnecting highSpeedVideoSizes = networkService.getHighSpeedVideoSizes(networkRequest2);
                    if (networkCallback2 != null) {
                        networkCallback2.call(highSpeedVideoSizes);
                    } else if (highSpeedVideoSizes != null) {
                        highSpeedVideoSizes.close();
                    }
                }
            });
        } catch (java.lang.Exception e) {
            java.lang.String str = getHighSpeedVideoFpsRanges;
            java.lang.String url = networkRequest.getUrl();
            if (e.getLocalizedMessage() != null) {
                message = e.getLocalizedMessage();
            } else {
                message = e.getMessage();
            }
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, str, java.lang.String.format("Failed to send request for (%s) [%s]", url, message), new java.lang.Object[0]);
            if (networkCallback != null) {
                networkCallback.call(null);
            }
        }
    }

    final com.adobe.marketing.mobile.services.HttpConnecting getHighSpeedVideoSizes(com.adobe.marketing.mobile.services.NetworkRequest networkRequest) {
        java.lang.String message;
        if (networkRequest.getUrl() == null || !networkRequest.getUrl().contains("https")) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoFpsRanges, java.lang.String.format("Invalid URL (%s), only HTTPS protocol is supported", networkRequest.getUrl()), new java.lang.Object[0]);
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.adobe.marketing.mobile.services.DeviceInforming deviceInfoService = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService();
        if (deviceInfoService != null) {
            java.lang.String defaultUserAgent = deviceInfoService.getDefaultUserAgent();
            if (defaultUserAgent != null && !defaultUserAgent.trim().isEmpty()) {
                hashMap.put("User-Agent", defaultUserAgent);
            }
            java.lang.String localeString = deviceInfoService.getLocaleString();
            if (localeString != null && !localeString.trim().isEmpty()) {
                hashMap.put("Accept-Language", localeString);
            }
        }
        if (networkRequest.getHeaders() != null) {
            hashMap.putAll(networkRequest.getHeaders());
        }
        try {
            java.net.URL url = new java.net.URL(networkRequest.getUrl());
            java.lang.String protocol = url.getProtocol();
            if (protocol == null || !"https".equalsIgnoreCase(protocol)) {
                return null;
            }
            try {
                com.adobe.marketing.mobile.services.HttpConnectionHandler httpConnectionHandler = new com.adobe.marketing.mobile.services.HttpConnectionHandler(url);
                if (!httpConnectionHandler.getHighSpeedVideoFpsRanges(networkRequest.getMethod())) {
                    return null;
                }
                httpConnectionHandler.getHighSpeedVideoSizes(hashMap);
                httpConnectionHandler.getHighSpeedVideoSizes(networkRequest.getConnectTimeout() * 1000);
                httpConnectionHandler.getHighResolutionOutputSizeshNQ4ISI(networkRequest.getReadTimeout() * 1000);
                return httpConnectionHandler.getHighSpeedVideoFpsRanges(networkRequest.getBody());
            } catch (java.io.IOException | java.lang.SecurityException e) {
                java.lang.String str = getHighSpeedVideoFpsRanges;
                java.lang.String url2 = networkRequest.getUrl();
                if (e.getLocalizedMessage() != null) {
                    message = e.getLocalizedMessage();
                } else {
                    message = e.getMessage();
                }
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, str, java.lang.String.format("Could not create a connection to URL (%s) [%s]", url2, message), new java.lang.Object[0]);
                return null;
            }
        } catch (java.net.MalformedURLException e2) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoFpsRanges, java.lang.String.format("Could not connect, invalid URL (%s) [%s]!!", networkRequest.getUrl(), e2), new java.lang.Object[0]);
            return null;
        }
    }
}
