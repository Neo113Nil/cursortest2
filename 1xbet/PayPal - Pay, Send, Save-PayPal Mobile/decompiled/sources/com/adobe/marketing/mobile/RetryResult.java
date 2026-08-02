package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class RetryResult {
    int Camera2StreamConfigurationMap;
    final com.adobe.marketing.mobile.EdgeNetworkService.Retry getHighResolutionOutputSizeshNQ4ISI;

    RetryResult(com.adobe.marketing.mobile.EdgeNetworkService.Retry retry) {
        this.Camera2StreamConfigurationMap = 5;
        this.getHighResolutionOutputSizeshNQ4ISI = retry;
    }

    RetryResult(com.adobe.marketing.mobile.EdgeNetworkService.Retry retry, int i) {
        this.Camera2StreamConfigurationMap = 5;
        this.getHighResolutionOutputSizeshNQ4ISI = retry;
        this.Camera2StreamConfigurationMap = i <= 0 ? 5 : i;
    }
}
