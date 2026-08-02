package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
class HttpConnection implements com.adobe.marketing.mobile.services.HttpConnecting {
    private static final java.lang.String Camera2StreamConfigurationMap = "HttpConnection";
    private final java.net.HttpURLConnection getHighResolutionOutputSizeshNQ4ISI;

    HttpConnection(java.net.HttpURLConnection httpURLConnection) {
        this.getHighResolutionOutputSizeshNQ4ISI = httpURLConnection;
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public java.io.InputStream getInputStream() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.getInputStream();
        } catch (java.lang.Error e) {
            e = e;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not get the input stream. (%s)", e), new java.lang.Object[0]);
            return null;
        } catch (java.net.UnknownServiceException e2) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not get the input stream, protocol does not support input. (%s)", e2), new java.lang.Object[0]);
            return null;
        } catch (java.lang.Exception e3) {
            e = e3;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not get the input stream. (%s)", e), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public java.io.InputStream getErrorStream() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.getErrorStream();
        } catch (java.lang.Error | java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not get the input stream. (%s)", e), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public int getResponseCode() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.getResponseCode();
        } catch (java.lang.Error | java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not get response code. (%s)", e), new java.lang.Object[0]);
            return -1;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public java.lang.String getResponseMessage() {
        try {
            return this.getHighResolutionOutputSizeshNQ4ISI.getResponseMessage();
        } catch (java.lang.Error | java.lang.Exception e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not get the response message. (%s)", e), new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public java.lang.String getResponsePropertyValue(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHeaderField(str);
    }

    @Override // com.adobe.marketing.mobile.services.HttpConnecting
    public void close() {
        java.io.InputStream inputStream = getInputStream();
        java.io.InputStream errorStream = getErrorStream();
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (java.lang.Error | java.lang.Exception e) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not close the input stream. (%s)", e), new java.lang.Object[0]);
            }
        }
        if (errorStream != null) {
            try {
                errorStream.close();
            } catch (java.lang.Error | java.lang.Exception e2) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, Camera2StreamConfigurationMap, java.lang.String.format("Could not close the error stream. (%s)", e2), new java.lang.Object[0]);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI.disconnect();
    }
}
