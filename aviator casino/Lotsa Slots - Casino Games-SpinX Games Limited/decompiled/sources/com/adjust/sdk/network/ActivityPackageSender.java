package com.adjust.sdk.network;

/* loaded from: classes2.dex */
public class ActivityPackageSender implements com.adjust.sdk.network.IActivityPackageSender {
    private java.lang.String basePath;
    private java.lang.String clientSdk;
    private int connectionTimeout;
    private android.content.Context context;
    private java.lang.String gdprPath;
    private java.lang.String purchaseVerificationPath;
    private java.lang.String subscriptionPath;
    private com.adjust.sdk.network.UrlStrategy urlStrategy;
    private com.adjust.sdk.ILogger logger = com.adjust.sdk.AdjustFactory.getLogger();
    private com.adjust.sdk.scheduler.ThreadExecutor executor = new com.adjust.sdk.scheduler.SingleThreadCachedScheduler("ActivityPackageSender");
    private com.adjust.sdk.network.UtilNetworking.IHttpsURLConnectionProvider httpsURLConnectionProvider = com.adjust.sdk.AdjustFactory.getHttpsURLConnectionProvider();
    private com.adjust.sdk.network.UtilNetworking.IConnectionOptions connectionOptions = com.adjust.sdk.AdjustFactory.getConnectionOptions();

    public ActivityPackageSender(java.util.List<java.lang.String> list, boolean z, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, android.content.Context context) {
        this.basePath = str;
        this.gdprPath = str2;
        this.subscriptionPath = str3;
        this.purchaseVerificationPath = str4;
        this.clientSdk = str5;
        this.connectionTimeout = i;
        this.context = context;
        this.urlStrategy = new com.adjust.sdk.network.UrlStrategy(com.adjust.sdk.AdjustFactory.getBaseUrl(), com.adjust.sdk.AdjustFactory.getGdprUrl(), com.adjust.sdk.AdjustFactory.getSubscriptionUrl(), com.adjust.sdk.AdjustFactory.getPurchaseVerificationUrl(), list, z);
    }

    private java.io.DataOutputStream configConnectionForGET(javax.net.ssl.HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
        return null;
    }

    private java.io.DataOutputStream configConnectionForPOST(javax.net.ssl.HttpsURLConnection httpsURLConnection, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        java.lang.String generatePOSTBodyString = generatePOSTBodyString(map, map2, map3);
        if (generatePOSTBodyString == null) {
            return null;
        }
        java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(httpsURLConnection.getOutputStream());
        dataOutputStream.writeBytes(generatePOSTBodyString);
        return dataOutputStream;
    }

    private java.lang.String errorMessage(java.lang.Throwable th, java.lang.String str, com.adjust.sdk.ActivityPackage activityPackage) {
        return com.adjust.sdk.Util.formatString("%s. (%s)", activityPackage.getFailureMessage(), com.adjust.sdk.Util.getReasonString(str, th));
    }

    private static java.lang.String extractAuthorizationHeader(java.util.Map<java.lang.String, java.lang.String> map) {
        return map.remove("authorization");
    }

    private static java.lang.String extractTargetUrl(java.util.Map<java.lang.String, java.lang.String> map, com.adjust.sdk.ActivityKind activityKind, com.adjust.sdk.network.UrlStrategy urlStrategy) {
        java.lang.String remove = map.remove(com.ironsource.B5.r);
        return remove != null ? remove : urlStrategy.targetUrlByActivityKind(activityKind);
    }

    private java.lang.String generatePOSTBodyString(java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (map3 == null || map3.isEmpty()) {
            if (map != null && !map.isEmpty()) {
                injectParametersToPOSTStringBuilder(map, sb);
            }
            if (map2 != null && !map2.isEmpty()) {
                injectParametersToPOSTStringBuilder(map2, sb);
            }
        } else {
            injectParametersToPOSTStringBuilder(map3, sb);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '&') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private java.lang.String generateUrlStringForGET(com.adjust.sdk.ActivityKind activityKind, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.util.Map<java.lang.String, java.lang.String> map2, java.util.Map<java.lang.String, java.lang.String> map3) {
        java.net.URL url = new java.net.URL(urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map3, activityKind, this.urlStrategy)));
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme(url.getProtocol());
        builder.encodedAuthority(url.getAuthority());
        builder.path(url.getPath());
        builder.appendPath(str);
        this.logger.debug("Making request to url: %s", builder.toString());
        if (map3 == null || map3.isEmpty()) {
            if (map != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
                    builder.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            if (map2 != null) {
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry2 : map2.entrySet()) {
                    builder.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
        } else {
            for (java.util.Map.Entry<java.lang.String, java.lang.String> entry3 : map3.entrySet()) {
                builder.appendQueryParameter(entry3.getKey(), entry3.getValue());
            }
        }
        return builder.build().toString();
    }

    private java.lang.String generateUrlStringForPOST(com.adjust.sdk.ActivityKind activityKind, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String formatString = com.adjust.sdk.Util.formatString("%s%s", urlWithExtraPathByActivityKind(activityKind, extractTargetUrl(map, activityKind, this.urlStrategy)), str);
        this.logger.debug("Making request to url : %s", formatString);
        return formatString;
    }

    private void injectParametersToPOSTStringBuilder(java.util.Map<java.lang.String, java.lang.String> map, java.lang.StringBuilder sb) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String encode = java.net.URLEncoder.encode(entry.getKey(), "UTF-8");
            java.lang.String value = entry.getValue();
            java.lang.String encode2 = value != null ? java.net.URLEncoder.encode(value, "UTF-8") : "";
            sb.append(encode);
            sb.append(com.ironsource.X3.j.b);
            sb.append(encode2);
            sb.append(com.ironsource.X3.j.c);
        }
    }

    private void localError(java.lang.Throwable th, java.lang.String str, com.adjust.sdk.ResponseData responseData, int i) {
        java.lang.String errorMessage = errorMessage(th, str, responseData.activityPackage);
        this.logger.error(errorMessage, new java.lang.Object[0]);
        responseData.message = errorMessage;
        responseData.willRetry = false;
        responseData.activityPackage.addError(i);
    }

    private void parseResponse(com.adjust.sdk.ResponseData responseData, java.lang.String str) {
        org.json.JSONObject jSONObject;
        if (str.length() == 0) {
            this.logger.error("Empty response string", new java.lang.Object[0]);
            return;
        }
        try {
            jSONObject = new org.json.JSONObject(str);
        } catch (org.json.JSONException e) {
            this.logger.error(errorMessage(e, "Failed to parse JSON response", responseData.activityPackage), new java.lang.Object[0]);
            jSONObject = null;
        }
        if (jSONObject == null) {
            return;
        }
        responseData.jsonResponse = jSONObject;
        responseData.message = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "message");
        responseData.adid = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "adid");
        responseData.timestamp = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, com.ironsource.C4.a.d);
        java.lang.String extractJsonString = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "tracking_state");
        if (extractJsonString != null && extractJsonString.equals("opted_out")) {
            responseData.trackingState = com.adjust.sdk.TrackingState.OPTED_OUT;
        }
        responseData.askIn = com.adjust.sdk.network.UtilNetworking.extractJsonLong(jSONObject, "ask_in");
        responseData.retryIn = com.adjust.sdk.network.UtilNetworking.extractJsonLong(jSONObject, "retry_in");
        responseData.continueIn = com.adjust.sdk.network.UtilNetworking.extractJsonLong(jSONObject, "continue_in");
        responseData.attribution = com.adjust.sdk.Util.attributionFromJson(jSONObject.optJSONObject(com.ironsource.Y3.c), com.adjust.sdk.Util.getSdkPrefixPlatform(this.clientSdk));
        responseData.resolvedDeeplink = com.adjust.sdk.network.UtilNetworking.extractJsonString(jSONObject, "resolved_click_url");
        responseData.controlParams = jSONObject.optJSONObject("control_params");
    }

    private void remoteError(java.lang.Throwable th, java.lang.String str, com.adjust.sdk.ResponseData responseData, java.lang.Integer num) {
        java.lang.String str2 = errorMessage(th, str, responseData.activityPackage) + " Will retry later";
        this.logger.error(str2, new java.lang.Object[0]);
        responseData.message = str2;
        responseData.willRetry = true;
        responseData.activityPackage.addError(num.intValue());
    }

    private boolean shouldRetryToSendWithUrlStrategy(com.adjust.sdk.ResponseData responseData) {
        if (responseData.jsonResponse != null) {
            this.logger.debug("Will not retry with current url strategy, already got a valid json response", new java.lang.Object[0]);
            this.urlStrategy.resetAfterSuccess();
            return false;
        }
        if (this.urlStrategy.shouldRetryAfterFailure(responseData.activityKind)) {
            this.logger.error("Failed with current url strategy, but it will retry with new", new java.lang.Object[0]);
            return true;
        }
        this.logger.error("Failed with current url strategy and it will not retry", new java.lang.Object[0]);
        return false;
    }

    private java.util.Map<java.lang.String, java.lang.String> signParameters(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap(activityPackage.getParameters());
        if (map != null) {
            hashMap.putAll(map);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("client_sdk", activityPackage.getClientSdk());
        hashMap2.put("activity_kind", activityPackage.getActivityKind().toString());
        hashMap2.put(com.ironsource.B5.r, this.urlStrategy.targetUrlByActivityKind(activityPackage.getActivityKind()));
        org.json.JSONObject controlParamsJson = com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.context).getControlParamsJson();
        if (controlParamsJson != null) {
            java.util.Iterator<java.lang.String> keys = controlParamsJson.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                try {
                    if (controlParamsJson.get(next) instanceof java.lang.String) {
                        hashMap2.put(next, (java.lang.String) controlParamsJson.get(next));
                    }
                } catch (org.json.JSONException unused) {
                    this.logger.error("JSONException while iterating control params", new java.lang.Object[0]);
                }
            }
        }
        return com.adjust.sdk.AdjustSigner.sign(hashMap, hashMap2, this.context, this.logger);
    }

    private void tryToGetResponse(com.adjust.sdk.ResponseData responseData) {
        java.io.DataOutputStream dataOutputStream = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                java.lang.String extractAuthorizationHeader = extractAuthorizationHeader(responseData.signedParameters);
                                boolean z = true;
                                this.logger.verbose("authorizationHeader: %s", extractAuthorizationHeader);
                                boolean z2 = responseData.activityPackage.getActivityKind() == com.adjust.sdk.ActivityKind.ATTRIBUTION;
                                javax.net.ssl.HttpsURLConnection generateHttpsURLConnection = this.httpsURLConnectionProvider.generateHttpsURLConnection(new java.net.URL(z2 ? generateUrlStringForGET(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters) : generateUrlStringForPOST(responseData.activityPackage.getActivityKind(), responseData.activityPackage.getPath(), responseData.signedParameters)));
                                this.connectionOptions.applyConnectionOptions(generateHttpsURLConnection, this.clientSdk, this.connectionTimeout);
                                if (extractAuthorizationHeader != null) {
                                    generateHttpsURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.AUTHORIZATION, extractAuthorizationHeader);
                                }
                                java.io.DataOutputStream configConnectionForGET = z2 ? configConnectionForGET(generateHttpsURLConnection) : configConnectionForPOST(generateHttpsURLConnection, responseData.activityPackage.getParameters(), responseData.sendingParameters, responseData.signedParameters);
                                java.lang.Integer readConnectionResponse = readConnectionResponse(generateHttpsURLConnection, responseData);
                                responseData.success = responseData.jsonResponse != null && responseData.retryIn == null && readConnectionResponse != null && readConnectionResponse.intValue() == 200;
                                org.json.JSONObject jSONObject = responseData.jsonResponse;
                                if (jSONObject != null && responseData.retryIn == null) {
                                    z = false;
                                }
                                responseData.willRetry = z;
                                if (jSONObject == null) {
                                    responseData.activityPackage.addError(1000);
                                } else if (responseData.retryIn != null) {
                                    responseData.activityPackage.addError(1001);
                                }
                                if (configConnectionForGET != null) {
                                    try {
                                        configConnectionForGET.flush();
                                        configConnectionForGET.close();
                                    } catch (java.io.IOException e) {
                                        this.logger.error(errorMessage(e, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                                    }
                                }
                            } catch (java.lang.Throwable th) {
                                if (0 != 0) {
                                    try {
                                        dataOutputStream.flush();
                                        dataOutputStream.close();
                                    } catch (java.io.IOException e2) {
                                        this.logger.error(errorMessage(e2, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                                    }
                                }
                                throw th;
                            }
                        } catch (java.lang.Throwable th2) {
                            localError(th2, "Sending SDK package", responseData, com.adjust.sdk.network.ErrorCodes.THROWABLE);
                            if (0 != 0) {
                                try {
                                    dataOutputStream.flush();
                                    dataOutputStream.close();
                                } catch (java.io.IOException e3) {
                                    this.logger.error(errorMessage(e3, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                                }
                            }
                        }
                    } catch (java.net.ProtocolException e4) {
                        localError(e4, "Protocol Error", responseData, 1004);
                        if (0 != 0) {
                            try {
                                dataOutputStream.flush();
                                dataOutputStream.close();
                            } catch (java.io.IOException e5) {
                                this.logger.error(errorMessage(e5, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                            }
                        }
                    }
                } catch (javax.net.ssl.SSLHandshakeException e6) {
                    remoteError(e6, "Certificate failed", responseData, 1006);
                    if (0 != 0) {
                        try {
                            dataOutputStream.flush();
                            dataOutputStream.close();
                        } catch (java.io.IOException e7) {
                            this.logger.error(errorMessage(e7, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                        }
                    }
                }
            } catch (java.net.MalformedURLException e8) {
                localError(e8, "Malformed URL", responseData, 1003);
                if (0 != 0) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (java.io.IOException e9) {
                        this.logger.error(errorMessage(e9, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                    }
                }
            } catch (java.io.IOException e10) {
                remoteError(e10, "Request failed", responseData, 1007);
                if (0 != 0) {
                    try {
                        dataOutputStream.flush();
                        dataOutputStream.close();
                    } catch (java.io.IOException e11) {
                        this.logger.error(errorMessage(e11, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.io.UnsupportedEncodingException e12) {
            localError(e12, "Failed to encode parameters", responseData, 1002);
            if (0 != 0) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (java.io.IOException e13) {
                    this.logger.error(errorMessage(e13, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                }
            }
        } catch (java.net.SocketTimeoutException e14) {
            remoteError(e14, "Request timed out", responseData, 1005);
            if (0 != 0) {
                try {
                    dataOutputStream.flush();
                    dataOutputStream.close();
                } catch (java.io.IOException e15) {
                    this.logger.error(errorMessage(e15, "Flushing and closing connection output stream", responseData.activityPackage), new java.lang.Object[0]);
                }
            }
        }
    }

    private java.util.Map<java.lang.String, java.lang.String> updateSendingParameters(java.util.Map<java.lang.String, java.lang.String> map) {
        if (map == null) {
            map = new java.util.HashMap<>();
        }
        com.adjust.sdk.PackageBuilder.addString(map, "sent_at", com.adjust.sdk.Util.dateFormatter.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis())));
        return map;
    }

    private java.lang.String urlWithExtraPathByActivityKind(com.adjust.sdk.ActivityKind activityKind, java.lang.String str) {
        if (activityKind == com.adjust.sdk.ActivityKind.GDPR) {
            if (this.gdprPath != null) {
                return str + this.gdprPath;
            }
        } else if (activityKind == com.adjust.sdk.ActivityKind.SUBSCRIPTION) {
            if (this.subscriptionPath != null) {
                return str + this.subscriptionPath;
            }
        } else if (activityKind == com.adjust.sdk.ActivityKind.PURCHASE_VERIFICATION) {
            if (this.purchaseVerificationPath != null) {
                return str + this.purchaseVerificationPath;
            }
        } else if (this.basePath != null) {
            return str + this.basePath;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0046, code lost:
    
        if (r7 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Integer readConnectionResponse(javax.net.ssl.HttpsURLConnection httpsURLConnection, com.adjust.sdk.ResponseData responseData) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Integer num = null;
        try {
            try {
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                num = java.lang.Integer.valueOf(responseCode);
                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(responseCode >= 400 ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream()));
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                }
            } catch (java.io.IOException e) {
                this.logger.error(errorMessage(e, "Connecting and reading response", responseData.activityPackage), new java.lang.Object[0]);
            }
            httpsURLConnection.disconnect();
            if (sb.length() == 0) {
                this.logger.error("Empty response string buffer", new java.lang.Object[0]);
                return num;
            }
            if (num.intValue() == 429) {
                this.logger.error("Too frequent requests to the endpoint (429)", new java.lang.Object[0]);
                return num;
            }
            java.lang.String sb2 = sb.toString();
            this.logger.debug("Response string: %s", sb2);
            parseResponse(responseData, sb2);
            if (responseData.controlParams != null) {
                com.adjust.sdk.SharedPreferencesManager.getDefaultInstance(this.context).saveControlParams(responseData.controlParams);
            }
            java.lang.String str = responseData.message;
            if (str != null) {
                if (num.intValue() == 200) {
                    this.logger.info("Response message: %s", str);
                } else {
                    this.logger.error("Response message: %s", str);
                }
            }
            return num;
        } catch (java.lang.Throwable th) {
            if (httpsURLConnection != null) {
                httpsURLConnection.disconnect();
            }
            throw th;
        }
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public void sendActivityPackage(final com.adjust.sdk.ActivityPackage activityPackage, final java.util.Map<java.lang.String, java.lang.String> map, final com.adjust.sdk.network.IActivityPackageSender.ResponseDataCallbackSubscriber responseDataCallbackSubscriber) {
        this.executor.submit(new java.lang.Runnable() { // from class: com.adjust.sdk.network.ActivityPackageSender.1
            @Override // java.lang.Runnable
            public final void run() {
                responseDataCallbackSubscriber.onResponseDataCallback(com.adjust.sdk.network.ActivityPackageSender.this.sendActivityPackageSync(activityPackage, map));
            }
        });
    }

    @Override // com.adjust.sdk.network.IActivityPackageSender
    public com.adjust.sdk.ResponseData sendActivityPackageSync(com.adjust.sdk.ActivityPackage activityPackage, java.util.Map<java.lang.String, java.lang.String> map) {
        com.adjust.sdk.ResponseData buildResponseData;
        do {
            java.util.Map<java.lang.String, java.lang.String> updateSendingParameters = updateSendingParameters(map);
            buildResponseData = com.adjust.sdk.ResponseData.buildResponseData(activityPackage, updateSendingParameters, signParameters(activityPackage, updateSendingParameters));
            tryToGetResponse(buildResponseData);
        } while (shouldRetryToSendWithUrlStrategy(buildResponseData));
        return buildResponseData;
    }
}
