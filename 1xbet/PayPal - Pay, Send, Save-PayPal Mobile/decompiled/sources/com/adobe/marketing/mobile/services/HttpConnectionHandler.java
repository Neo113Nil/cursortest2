package com.adobe.marketing.mobile.services;

/* loaded from: classes7.dex */
class HttpConnectionHandler {
    private static final java.lang.String getHighSpeedVideoSizes = "HttpConnectionHandler";
    protected com.adobe.marketing.mobile.services.HttpConnectionHandler.Command Camera2StreamConfigurationMap = com.adobe.marketing.mobile.services.HttpConnectionHandler.Command.GET;
    protected final javax.net.ssl.HttpsURLConnection getHighSpeedVideoFpsRangesFor;

    protected enum Command {
        GET(false),
        POST(true);

        private final boolean getHighResolutionOutputSizeshNQ4ISI;

        Command(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
        }

        public final boolean isDoOutput() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }

    HttpConnectionHandler(java.net.URL url) throws java.io.IOException {
        this.getHighSpeedVideoFpsRangesFor = (javax.net.ssl.HttpsURLConnection) url.openConnection();
    }

    final boolean getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.services.HttpMethod httpMethod) {
        if (httpMethod == null) {
            return false;
        }
        try {
            com.adobe.marketing.mobile.services.HttpConnectionHandler.Command valueOf = com.adobe.marketing.mobile.services.HttpConnectionHandler.Command.valueOf(httpMethod.name());
            this.getHighSpeedVideoFpsRangesFor.setRequestMethod(valueOf.name());
            this.getHighSpeedVideoFpsRangesFor.setDoOutput(valueOf.isDoOutput());
            this.getHighSpeedVideoFpsRangesFor.setUseCaches(false);
            this.Camera2StreamConfigurationMap = valueOf;
            return true;
        } catch (java.lang.Error e) {
            e = e;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set http command (%s)!", e), new java.lang.Object[0]);
            return false;
        } catch (java.lang.IllegalArgumentException e2) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("%s command is not supported (%s)!", httpMethod, e2), new java.lang.Object[0]);
            return false;
        } catch (java.lang.IllegalStateException e3) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Cannot set command after connect (%s)!", e3), new java.lang.Object[0]);
            return false;
        } catch (java.net.ProtocolException e4) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("%s is not a valid HTTP command (%s)!", httpMethod, e4), new java.lang.Object[0]);
            return false;
        } catch (java.lang.Exception e5) {
            e = e5;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set http command (%s)!", e), new java.lang.Object[0]);
            return false;
        }
    }

    final void getHighSpeedVideoSizes(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map.isEmpty()) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            try {
                this.getHighSpeedVideoFpsRangesFor.setRequestProperty(entry.getKey(), entry.getValue());
            } catch (java.lang.Error e) {
                e = e;
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set request property (%s)!", e), new java.lang.Object[0]);
            } catch (java.lang.IllegalStateException e2) {
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Cannot set header field after connect (%s)!", e2), new java.lang.Object[0]);
                return;
            } catch (java.lang.Exception e3) {
                e = e3;
                com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set request property (%s)!", e), new java.lang.Object[0]);
            }
        }
    }

    final void getHighSpeedVideoSizes(int i) {
        try {
            this.getHighSpeedVideoFpsRangesFor.setConnectTimeout(i);
        } catch (java.lang.Error e) {
            e = e;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set connection timeout (%s)!", e), new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.String str = getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(" is not valid timeout value (%s)");
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, str, java.lang.String.format(sb.toString(), e2), new java.lang.Object[0]);
        } catch (java.lang.Exception e3) {
            e = e3;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set connection timeout (%s)!", e), new java.lang.Object[0]);
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI(int i) {
        try {
            this.getHighSpeedVideoFpsRangesFor.setReadTimeout(i);
        } catch (java.lang.Error e) {
            e = e;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set read timeout (%s)!", e), new java.lang.Object[0]);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.String str = getHighSpeedVideoSizes;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(" is not valid timeout value (%s)");
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, str, java.lang.String.format(sb.toString(), e2), new java.lang.Object[0]);
        } catch (java.lang.Exception e3) {
            e = e3;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Failed to set read timeout (%s)!", e), new java.lang.Object[0]);
        }
    }

    final com.adobe.marketing.mobile.services.HttpConnecting getHighSpeedVideoFpsRanges(byte[] bArr) {
        java.lang.String obj;
        java.lang.String message;
        java.lang.String str = getHighSpeedVideoSizes;
        if (this.getHighSpeedVideoFpsRangesFor.getURL() == null) {
            obj = "";
        } else {
            obj = this.getHighSpeedVideoFpsRangesFor.getURL().toString();
        }
        com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, str, java.lang.String.format("Connecting to URL %s (%s)", obj, this.Camera2StreamConfigurationMap.toString()), new java.lang.Object[0]);
        if (this.Camera2StreamConfigurationMap == com.adobe.marketing.mobile.services.HttpConnectionHandler.Command.POST && bArr != null) {
            this.getHighSpeedVideoFpsRangesFor.setFixedLengthStreamingMode(bArr.length);
        }
        try {
            this.getHighSpeedVideoFpsRangesFor.connect();
            if (this.Camera2StreamConfigurationMap == com.adobe.marketing.mobile.services.HttpConnectionHandler.Command.POST && bArr != null) {
                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(this.getHighSpeedVideoFpsRangesFor.getOutputStream());
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            }
        } catch (java.net.SocketTimeoutException e) {
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Connection failure, socket timeout (%s)", e), new java.lang.Object[0]);
        } catch (java.io.IOException e2) {
            java.lang.String str2 = getHighSpeedVideoSizes;
            if (e2.getLocalizedMessage() != null) {
                message = e2.getLocalizedMessage();
            } else {
                message = e2.getMessage();
            }
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, str2, java.lang.String.format("Connection failure (%s)", message), new java.lang.Object[0]);
        } catch (java.lang.Error e3) {
            e = e3;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Connection failure (%s)", e), new java.lang.Object[0]);
        } catch (java.lang.Exception e4) {
            e = e4;
            com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.services.ServiceConstants.LOG_TAG, getHighSpeedVideoSizes, java.lang.String.format("Connection failure (%s)", e), new java.lang.Object[0]);
        }
        return new com.adobe.marketing.mobile.services.HttpConnection(this.getHighSpeedVideoFpsRangesFor);
    }
}
