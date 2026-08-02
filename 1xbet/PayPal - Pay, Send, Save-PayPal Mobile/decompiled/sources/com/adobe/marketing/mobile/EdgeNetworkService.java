package com.adobe.marketing.mobile;

/* loaded from: classes7.dex */
class EdgeNetworkService {
    static final java.util.Set<java.lang.Integer> Camera2StreamConfigurationMap;
    private final com.adobe.marketing.mobile.services.Networking getHighSpeedVideoFpsRanges;

    interface ResponseCallback {
        void getHighSpeedVideoFpsRangesFor(java.lang.String str);

        void getHighSpeedVideoSizes();

        void getHighSpeedVideoSizes(java.lang.String str);
    }

    public enum RequestType {
        INTERACT("interact"),
        CONSENT("privacy/set-consent");

        public final java.lang.String type;

        RequestType(java.lang.String str) {
            this.type = str;
        }
    }

    public enum Retry {
        YES(org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_YES),
        NO(org.apache.commons.imaging.formats.pnm.PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO);

        public final java.lang.String retryString;

        Retry(java.lang.String str) {
            this.retryString = str;
        }
    }

    static {
        java.util.ArrayList<java.lang.Integer> arrayList = com.adobe.marketing.mobile.services.NetworkingConstants.RECOVERABLE_ERROR_CODES;
        java.util.List asList = java.util.Arrays.asList(-1, 429, 507, 502);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(arrayList);
        hashSet.addAll(asList);
        Camera2StreamConfigurationMap = hashSet;
    }

    EdgeNetworkService(com.adobe.marketing.mobile.services.Networking networking) {
        if (networking == null) {
            throw new java.lang.IllegalArgumentException("NetworkService cannot be null.");
        }
        this.getHighSpeedVideoFpsRanges = networking;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int getHighSpeedVideoFpsRanges(com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
        int i;
        java.lang.String responsePropertyValue = httpConnecting.getResponsePropertyValue("Retry-After");
        if (responsePropertyValue != null && responsePropertyValue.matches("\\d+")) {
            try {
                i = java.lang.Integer.parseInt(responsePropertyValue);
            } catch (java.lang.NumberFormatException e) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Failed to parse Retry-After header with value of '%s' to an int with error: %s", responsePropertyValue, e.getLocalizedMessage());
            }
            if (i <= 0) {
                return i;
            }
            return 5;
        }
        i = 5;
        if (i <= 0) {
        }
    }

    public static java.lang.String getHighResolutionOutputSizeshNQ4ISI(com.adobe.marketing.mobile.EdgeEndpoint edgeEndpoint, java.lang.String str, java.lang.String str2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(edgeEndpoint.getHighSpeedVideoFpsRanges);
        sb.append("?configId=");
        sb.append(str);
        if (str2 != null && !str2.isEmpty()) {
            sb.append("&requestId=");
            sb.append(str2);
        }
        return sb.toString();
    }

    static /* synthetic */ void getHighSpeedVideoSizes(com.adobe.marketing.mobile.services.HttpConnecting[] httpConnectingArr, java.util.concurrent.CountDownLatch countDownLatch, com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
        httpConnectingArr[0] = httpConnecting;
        countDownLatch.countDown();
    }

    final void Camera2StreamConfigurationMap(java.io.InputStream inputStream, java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback responseCallback) {
        if (inputStream == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Network response contains no data, InputStream is null.", new java.lang.Object[0]);
        } else if (str != null && str2 != null) {
            getHighResolutionOutputSizeshNQ4ISI(inputStream, str, str2, responseCallback);
        } else {
            getHighSpeedVideoFpsRangesFor(inputStream, responseCallback);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.io.InputStream inputStream, java.lang.String str, java.lang.String str2, com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback responseCallback) {
        if (inputStream == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Network response contains no data, InputStream is null.", new java.lang.Object[0]);
            return;
        }
        if (str == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "record separator is null, processing of response content aborted.", new java.lang.Object[0]);
            return;
        }
        if (str2 == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "line feed is null, processing of response content aborted.", new java.lang.Object[0]);
            return;
        }
        if (responseCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Callback is null, processing of response content aborted.", new java.lang.Object[0]);
            return;
        }
        java.util.Scanner scanner = new java.util.Scanner(inputStream, "UTF-8");
        scanner.useDelimiter(str2);
        int length = str.length();
        while (scanner.hasNext()) {
            java.lang.String next = scanner.next();
            if (next.length() - length < 0) {
                com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Unexpected network response chunk is shorter than record separator '%s'. Ignoring response '%s'.", str, next);
            } else {
                responseCallback.getHighSpeedVideoFpsRangesFor(next.substring(length));
            }
        }
    }

    private void getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream, com.adobe.marketing.mobile.EdgeNetworkService.ResponseCallback responseCallback) {
        if (responseCallback == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Callback is null, processing of response content aborted.", new java.lang.Object[0]);
        } else if (inputStream == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Network response contains no data, InputStream is null.", new java.lang.Object[0]);
        } else {
            responseCallback.getHighSpeedVideoFpsRangesFor(getHighSpeedVideoSizes(inputStream));
        }
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String trim = com.adobe.marketing.mobile.util.StringUtils.isNullOrEmpty(str) ? "Request to Edge Network failed with an unknown exception" : str.trim();
        java.lang.String str2 = trim.isEmpty() ? "Request to Edge Network failed with an unknown exception" : trim;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("title", str2);
            jSONObject.put("type", "global");
        } catch (org.json.JSONException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to create the generic error json ");
            sb.append(e.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", sb.toString(), new java.lang.Object[0]);
        }
        return jSONObject.toString();
    }

    static java.lang.String getHighSpeedVideoSizes(java.io.InputStream inputStream) {
        if (inputStream == null) {
            com.adobe.marketing.mobile.services.Log.debug("Edge", "EdgeNetworkService", "Network response contains no data, InputStream is null.", new java.lang.Object[0]);
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
        try {
            java.lang.String property = java.lang.System.getProperty("line.separator");
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            boolean z = false;
            while (true) {
                java.lang.String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(z ? property : "");
                    sb.append(readLine);
                    z = true;
                } else {
                    return sb.toString();
                }
            }
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Exception reading network error response: ");
            sb2.append(e.getLocalizedMessage());
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeNetworkService", sb2.toString(), new java.lang.Object[0]);
            return getHighSpeedVideoFpsRangesFor(e.getMessage());
        }
    }

    final com.adobe.marketing.mobile.services.HttpConnecting getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("accept", "application/json");
        hashMap.put("Content-Type", "application/json");
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        com.adobe.marketing.mobile.services.Log.trace("Edge", "EdgeNetworkService", "HTTP Headers: ".concat(java.lang.String.valueOf(hashMap)), new java.lang.Object[0]);
        com.adobe.marketing.mobile.services.NetworkRequest networkRequest = new com.adobe.marketing.mobile.services.NetworkRequest(str, com.adobe.marketing.mobile.services.HttpMethod.POST, str2.getBytes(), hashMap, 5, 5);
        final java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        final com.adobe.marketing.mobile.services.HttpConnecting[] httpConnectingArr = new com.adobe.marketing.mobile.services.HttpConnecting[1];
        this.getHighSpeedVideoFpsRanges.connectAsync(networkRequest, new com.adobe.marketing.mobile.services.NetworkCallback() { // from class: com.adobe.marketing.mobile.EdgeNetworkService$$ExternalSyntheticLambda0
            @Override // com.adobe.marketing.mobile.services.NetworkCallback
            public final void call(com.adobe.marketing.mobile.services.HttpConnecting httpConnecting) {
                com.adobe.marketing.mobile.EdgeNetworkService.getHighSpeedVideoSizes(httpConnectingArr, countDownLatch, httpConnecting);
            }
        });
        try {
            countDownLatch.await();
            return httpConnectingArr[0];
        } catch (java.lang.IllegalArgumentException | java.lang.InterruptedException e) {
            com.adobe.marketing.mobile.services.Log.warning("Edge", "EdgeNetworkService", "Connection failure for url (%s), error: (%s)", str, e);
            return null;
        }
    }
}
