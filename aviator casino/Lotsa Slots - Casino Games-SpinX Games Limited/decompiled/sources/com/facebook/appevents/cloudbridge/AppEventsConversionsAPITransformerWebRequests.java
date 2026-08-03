package com.facebook.appevents.cloudbridge;

/* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001@B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010 \u001a\u00020!2\u001a\u0010\"\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b\u0018\u00010#H\u0000¢\u0006\u0002\b$J \u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0007J\n\u0010)\u001a\u0004\u0018\u00010\fH\u0007J=\u0010*\u001a\u00020!2\b\u0010+\u001a\u0004\u0018\u00010\u00052\u0018\u0010,\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b0#2\b\b\u0002\u0010-\u001a\u00020\u0005H\u0000¢\u0006\u0004\b.\u0010/J\u0085\u0001\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020\f2\u0006\u00102\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010\f2\u0014\u00104\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u001b2\b\b\u0002\u00105\u001a\u00020\u00052<\u00106\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020!\u0018\u000107H\u0000¢\u0006\u0002\b;J$\u0010<\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b\u0018\u00010#2\u0006\u0010=\u001a\u00020>H\u0002J\u0010\u0010?\u001a\u00020!2\u0006\u0010=\u001a\u00020>H\u0007R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0005X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R,\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u001b0\u001aX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006A"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests;", "", "()V", "ACCEPTABLE_HTTP_RESPONSE", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "MAX_CACHED_TRANSFORMED_EVENTS", "MAX_PROCESSED_TRANSFORMED_EVENTS", "MAX_RETRY_COUNT", "RETRY_EVENTS_HTTP_RESPONSE", "TAG", "", "TIMEOUT_INTERVAL", "credentials", "Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "getCredentials$facebook_core_release", "()Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "setCredentials$facebook_core_release", "(Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;)V", "currentRetryCount", "getCurrentRetryCount$facebook_core_release", "()I", "setCurrentRetryCount$facebook_core_release", "(I)V", "transformedEvents", "", "", "getTransformedEvents$facebook_core_release", "()Ljava/util/List;", "setTransformedEvents$facebook_core_release", "(Ljava/util/List;)V", "appendEvents", "", "events", "", "appendEvents$facebook_core_release", "configure", "datasetID", "url", "accessKey", "getCredentials", "handleError", "responseCode", "processedEvents", "maxRetryCount", "handleError$facebook_core_release", "(Ljava/lang/Integer;Ljava/util/List;I)V", "makeHttpRequest", "urlStr", "requestMethod", "jsonBodyStr", "requestProperties", "timeOutInterval", "requestCallback", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "requestResult", "makeHttpRequest$facebook_core_release", "transformAppEventRequestForCAPIG", "request", "Lcom/facebook/GraphRequest;", "transformGraphRequestAndSendToCAPIGEndPoint", "CloudBridgeCredentials", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEventsConversionsAPITransformerWebRequests {
    public static final int MAX_CACHED_TRANSFORMED_EVENTS = 1000;
    private static final int MAX_PROCESSED_TRANSFORMED_EVENTS = 10;
    public static final int MAX_RETRY_COUNT = 5;
    private static final java.lang.String TAG = "CAPITransformerWebRequests";
    private static final int TIMEOUT_INTERVAL = 60000;
    public static com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials credentials;
    private static int currentRetryCount;
    public static java.util.List<java.util.Map<java.lang.String, java.lang.Object>> transformedEvents;
    public static final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests INSTANCE = new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests();
    private static final java.util.HashSet<java.lang.Integer> ACCEPTABLE_HTTP_RESPONSE = kotlin.collections.SetsKt.hashSetOf(200, 202);
    private static final java.util.HashSet<java.lang.Integer> RETRY_EVENTS_HTTP_RESPONSE = kotlin.collections.SetsKt.hashSetOf(503, 504, java.lang.Integer.valueOf(com.unity3d.ads.gatewayclient.CommonGatewayClient.CODE_TOO_MANY_REQUESTS));

    private AppEventsConversionsAPITransformerWebRequests() {
    }

    /* compiled from: AppEventsConversionsAPITransformerWebRequests.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventsConversionsAPITransformerWebRequests$CloudBridgeCredentials;", "", "datasetID", "", "cloudBridgeURL", "accessKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccessKey", "()Ljava/lang/String;", "getCloudBridgeURL", "getDatasetID", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final /* data */ class CloudBridgeCredentials {
        private final java.lang.String accessKey;
        private final java.lang.String cloudBridgeURL;
        private final java.lang.String datasetID;

        public static /* synthetic */ com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials copy$default(com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials cloudBridgeCredentials, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cloudBridgeCredentials.datasetID;
            }
            if ((i & 2) != 0) {
                str2 = cloudBridgeCredentials.cloudBridgeURL;
            }
            if ((i & 4) != 0) {
                str3 = cloudBridgeCredentials.accessKey;
            }
            return cloudBridgeCredentials.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getDatasetID() {
            return this.datasetID;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAccessKey() {
            return this.accessKey;
        }

        public final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials copy(java.lang.String datasetID, java.lang.String cloudBridgeURL, java.lang.String accessKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            return new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials(datasetID, cloudBridgeURL, accessKey);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials)) {
                return false;
            }
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials cloudBridgeCredentials = (com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.datasetID, cloudBridgeCredentials.datasetID) && kotlin.jvm.internal.Intrinsics.areEqual(this.cloudBridgeURL, cloudBridgeCredentials.cloudBridgeURL) && kotlin.jvm.internal.Intrinsics.areEqual(this.accessKey, cloudBridgeCredentials.accessKey);
        }

        public int hashCode() {
            return (((this.datasetID.hashCode() * 31) + this.cloudBridgeURL.hashCode()) * 31) + this.accessKey.hashCode();
        }

        public java.lang.String toString() {
            return "CloudBridgeCredentials(datasetID=" + this.datasetID + ", cloudBridgeURL=" + this.cloudBridgeURL + ", accessKey=" + this.accessKey + ')';
        }

        public CloudBridgeCredentials(java.lang.String datasetID, java.lang.String cloudBridgeURL, java.lang.String accessKey) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datasetID, "datasetID");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudBridgeURL, "cloudBridgeURL");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessKey, "accessKey");
            this.datasetID = datasetID;
            this.cloudBridgeURL = cloudBridgeURL;
            this.accessKey = accessKey;
        }

        public final java.lang.String getDatasetID() {
            return this.datasetID;
        }

        public final java.lang.String getCloudBridgeURL() {
            return this.cloudBridgeURL;
        }

        public final java.lang.String getAccessKey() {
            return this.accessKey;
        }
    }

    public final com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials getCredentials$facebook_core_release() {
        com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials cloudBridgeCredentials = credentials;
        if (cloudBridgeCredentials != null) {
            return cloudBridgeCredentials;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("credentials");
        throw null;
    }

    public final void setCredentials$facebook_core_release(com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials cloudBridgeCredentials) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cloudBridgeCredentials, "<set-?>");
        credentials = cloudBridgeCredentials;
    }

    public final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> getTransformedEvents$facebook_core_release() {
        java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list = transformedEvents;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("transformedEvents");
        throw null;
    }

    public final void setTransformedEvents$facebook_core_release(java.util.List<java.util.Map<java.lang.String, java.lang.Object>> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "<set-?>");
        transformedEvents = list;
    }

    public final int getCurrentRetryCount$facebook_core_release() {
        return currentRetryCount;
    }

    public final void setCurrentRetryCount$facebook_core_release(int i) {
        currentRetryCount = i;
    }

    @kotlin.jvm.JvmStatic
    public static final void configure(java.lang.String datasetID, java.lang.String url, java.lang.String accessKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datasetID, "datasetID");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accessKey, "accessKey");
        com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
        com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
        com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
        companion.log(loggingBehavior, TAG, " \n\nCloudbridge Configured: \n================\ndatasetID: %s\nurl: %s\naccessKey: %s\n\n", datasetID, url, accessKey);
        appEventsConversionsAPITransformerWebRequests.setCredentials$facebook_core_release(new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials(datasetID, url, accessKey));
        appEventsConversionsAPITransformerWebRequests.setTransformedEvents$facebook_core_release(new java.util.ArrayList());
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getCredentials() {
        try {
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.CloudBridgeCredentials credentials$facebook_core_release = INSTANCE.getCredentials$facebook_core_release();
            if (credentials$facebook_core_release == null) {
                return null;
            }
            return credentials$facebook_core_release.toString();
        } catch (kotlin.UninitializedPropertyAccessException unused) {
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void transformGraphRequestAndSendToCAPIGEndPoint(final com.facebook.GraphRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.runOnNonUiThread(new java.lang.Runnable() { // from class: com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests.m5114transformGraphRequestAndSendToCAPIGEndPoint$lambda0(com.facebook.GraphRequest.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: transformGraphRequestAndSendToCAPIGEndPoint$lambda-0, reason: not valid java name */
    public static final void m5114transformGraphRequestAndSendToCAPIGEndPoint$lambda0(com.facebook.GraphRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "$request");
        java.lang.String graphPath = request.getGraphPath();
        java.util.List split$default = graphPath == null ? null : kotlin.text.StringsKt.split$default((java.lang.CharSequence) graphPath, new java.lang.String[]{com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (java.lang.Object) null);
        if (split$default == null || split$default.size() != 2) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n GraphPathComponents Error when logging: \n%s", request);
            return;
        }
        try {
            com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = INSTANCE;
            java.lang.String str = appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getCloudBridgeURL() + "/capi/" + appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getDatasetID() + "/events";
            java.util.List<java.util.Map<java.lang.String, java.lang.Object>> transformAppEventRequestForCAPIG = appEventsConversionsAPITransformerWebRequests.transformAppEventRequestForCAPIG(request);
            if (transformAppEventRequestForCAPIG == null) {
                return;
            }
            appEventsConversionsAPITransformerWebRequests.appendEvents$facebook_core_release(transformAppEventRequestForCAPIG);
            int min = java.lang.Math.min(appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().size(), 10);
            java.util.List slice = kotlin.collections.CollectionsKt.slice((java.util.List) appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release(), new kotlin.ranges.IntRange(0, min - 1));
            appEventsConversionsAPITransformerWebRequests.getTransformedEvents$facebook_core_release().subList(0, min).clear();
            org.json.JSONArray jSONArray = new org.json.JSONArray((java.util.Collection) slice);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("data", jSONArray);
            linkedHashMap.put("accessKey", appEventsConversionsAPITransformerWebRequests.getCredentials$facebook_core_release().getAccessKey());
            org.json.JSONObject jSONObject = new org.json.JSONObject(linkedHashMap);
            com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
            java.lang.String jSONObject2 = jSONObject.toString(2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonBodyStr.toString(2)");
            companion.log(loggingBehavior, TAG, "\nTransformed_CAPI_JSON:\nURL: %s\nFROM=========\n%s\n>>>>>>TO>>>>>>\n%s\n=============\n", str, request, jSONObject2);
            appEventsConversionsAPITransformerWebRequests.makeHttpRequest$facebook_core_release(str, "POST", jSONObject.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("Content-Type", com.ironsource.B5.M)), 60000, new com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests$transformGraphRequestAndSendToCAPIGEndPoint$1$1(slice));
        } catch (kotlin.UninitializedPropertyAccessException e) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.DEVELOPER_ERRORS, TAG, "\n Credentials not initialized Error when logging: \n%s", e);
        }
    }

    private final java.util.List<java.util.Map<java.lang.String, java.lang.Object>> transformAppEventRequestForCAPIG(com.facebook.GraphRequest request) {
        org.json.JSONObject graphObject = request.getGraphObject();
        if (graphObject == null) {
            return null;
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        java.util.Map<java.lang.String, ? extends java.lang.Object> mutableMap = kotlin.collections.MapsKt.toMutableMap(com.facebook.internal.Utility.convertJSONObjectToHashMap(graphObject));
        java.lang.Object tag = request.getTag();
        if (tag == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Any");
        }
        mutableMap.put("custom_events", tag);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str : mutableMap.keySet()) {
            sb.append(str);
            sb.append(" : ");
            sb.append(mutableMap.get(str));
            sb.append(java.lang.System.getProperty("line.separator"));
        }
        com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "\nGraph Request data: \n\n%s \n\n", sb);
        return com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformer.INSTANCE.conversionsAPICompatibleEvent$facebook_core_release(mutableMap);
    }

    public static /* synthetic */ void handleError$facebook_core_release$default(com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests, java.lang.Integer num, java.util.List list, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 5;
        }
        appEventsConversionsAPITransformerWebRequests.handleError$facebook_core_release(num, list, i);
    }

    public final void handleError$facebook_core_release(java.lang.Integer responseCode, java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> processedEvents, int maxRetryCount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processedEvents, "processedEvents");
        if (kotlin.collections.CollectionsKt.contains(RETRY_EVENTS_HTTP_RESPONSE, responseCode)) {
            if (currentRetryCount >= maxRetryCount) {
                getTransformedEvents$facebook_core_release().clear();
                currentRetryCount = 0;
            } else {
                getTransformedEvents$facebook_core_release().addAll(0, processedEvents);
                currentRetryCount++;
            }
        }
    }

    public final void appendEvents$facebook_core_release(java.util.List<? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> events) {
        if (events != null) {
            getTransformedEvents$facebook_core_release().addAll(events);
        }
        int max = java.lang.Math.max(0, getTransformedEvents$facebook_core_release().size() - 1000);
        if (max > 0) {
            setTransformedEvents$facebook_core_release(kotlin.jvm.internal.TypeIntrinsics.asMutableList(kotlin.collections.CollectionsKt.drop(getTransformedEvents$facebook_core_release(), max)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2 A[Catch: IOException -> 0x0108, UnknownHostException -> 0x011b, TRY_LEAVE, TryCatch #4 {UnknownHostException -> 0x011b, IOException -> 0x0108, blocks: (B:3:0x0012, B:5:0x001d, B:8:0x0048, B:10:0x0054, B:14:0x0064, B:16:0x00a2, B:24:0x00c6, B:31:0x00cd, B:32:0x00d0, B:34:0x00d1, B:36:0x00f4, B:40:0x0025, B:43:0x002c, B:44:0x0032, B:46:0x0038, B:48:0x0100, B:49:0x0107), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4 A[Catch: IOException -> 0x0108, UnknownHostException -> 0x011b, TryCatch #4 {UnknownHostException -> 0x011b, IOException -> 0x0108, blocks: (B:3:0x0012, B:5:0x001d, B:8:0x0048, B:10:0x0054, B:14:0x0064, B:16:0x00a2, B:24:0x00c6, B:31:0x00cd, B:32:0x00d0, B:34:0x00d1, B:36:0x00f4, B:40:0x0025, B:43:0x002c, B:44:0x0032, B:46:0x0038, B:48:0x0100, B:49:0x0107), top: B:2:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void makeHttpRequest$facebook_core_release(java.lang.String urlStr, java.lang.String requestMethod, java.lang.String jsonBodyStr, java.util.Map<java.lang.String, java.lang.String> requestProperties, int timeOutInterval, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> requestCallback) {
        java.util.Set<java.lang.String> keySet;
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(urlStr, "urlStr");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestMethod, "requestMethod");
        try {
            java.net.URLConnection openConnection = new java.net.URL(urlStr).openConnection();
            if (openConnection == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setRequestMethod(requestMethod);
            if (requestProperties != null && (keySet = requestProperties.keySet()) != null) {
                for (java.lang.String str : keySet) {
                    httpURLConnection.setRequestProperty(str, requestProperties.get(str));
                }
            }
            if (!httpURLConnection.getRequestMethod().equals("POST") && !httpURLConnection.getRequestMethod().equals("PUT")) {
                z = false;
                httpURLConnection.setDoOutput(z);
                httpURLConnection.setConnectTimeout(timeOutInterval);
                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
                java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(bufferedOutputStream, "UTF-8"));
                bufferedWriter.write(jsonBodyStr);
                bufferedWriter.flush();
                bufferedWriter.close();
                bufferedOutputStream.close();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (ACCEPTABLE_HTTP_RESPONSE.contains(java.lang.Integer.valueOf(httpURLConnection.getResponseCode()))) {
                    java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        java.io.BufferedReader bufferedReader2 = bufferedReader;
                        while (true) {
                            java.lang.String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            } else {
                                sb.append(readLine);
                            }
                        }
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                    } catch (java.lang.Throwable th) {
                        try {
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            kotlin.io.CloseableKt.closeFinally(bufferedReader, th);
                            throw th2;
                        }
                    }
                }
                java.lang.String sb2 = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "connResponseSB.toString()");
                com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "\nResponse Received: \n%s\n%s", sb2, java.lang.Integer.valueOf(httpURLConnection.getResponseCode()));
                if (requestCallback == null) {
                    requestCallback.invoke(sb2, java.lang.Integer.valueOf(httpURLConnection.getResponseCode()));
                    return;
                }
                return;
            }
            z = true;
            httpURLConnection.setDoOutput(z);
            httpURLConnection.setConnectTimeout(timeOutInterval);
            java.io.BufferedOutputStream bufferedOutputStream2 = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
            java.io.BufferedWriter bufferedWriter2 = new java.io.BufferedWriter(new java.io.OutputStreamWriter(bufferedOutputStream2, "UTF-8"));
            bufferedWriter2.write(jsonBodyStr);
            bufferedWriter2.flush();
            bufferedWriter2.close();
            bufferedOutputStream2.close();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            if (ACCEPTABLE_HTTP_RESPONSE.contains(java.lang.Integer.valueOf(httpURLConnection.getResponseCode()))) {
            }
            java.lang.String sb22 = sb3.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb22, "connResponseSB.toString()");
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "\nResponse Received: \n%s\n%s", sb22, java.lang.Integer.valueOf(httpURLConnection.getResponseCode()));
            if (requestCallback == null) {
            }
        } catch (java.net.UnknownHostException e) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.APP_EVENTS, TAG, "Connection failed, retrying: \n%s", e.toString());
            if (requestCallback != null) {
                requestCallback.invoke(null, 503);
            }
        } catch (java.io.IOException e2) {
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.DEVELOPER_ERRORS, TAG, "Send to server failed: \n%s", e2.toString());
        }
    }
}
