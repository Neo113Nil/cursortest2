package com.facebook;

/* compiled from: GraphResponse.kt */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 '2\u00020\u0001:\u0002'(B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rB!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010BA\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0012J\b\u0010!\u001a\u0004\u0018\u00010\fJ\b\u0010\"\u001a\u0004\u0018\u00010\tJ\u0010\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010$\u001a\u00020%J\b\u0010&\u001a\u00020\u0007H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006)"}, d2 = {"Lcom/facebook/GraphResponse;", "", "request", "Lcom/facebook/GraphRequest;", "connection", "Ljava/net/HttpURLConnection;", "rawResponse", "", "graphObject", "Lorg/json/JSONObject;", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;)V", "graphObjects", "Lorg/json/JSONArray;", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONArray;)V", "error", "Lcom/facebook/FacebookRequestError;", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookRequestError;)V", "graphObjectArray", "(Lcom/facebook/GraphRequest;Ljava/net/HttpURLConnection;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONArray;Lcom/facebook/FacebookRequestError;)V", "getConnection", "()Ljava/net/HttpURLConnection;", "getError", "()Lcom/facebook/FacebookRequestError;", "jsonArray", "getJsonArray", "()Lorg/json/JSONArray;", "jsonObject", "getJsonObject", "()Lorg/json/JSONObject;", "getRawResponse", "()Ljava/lang/String;", "getRequest", "()Lcom/facebook/GraphRequest;", "getJSONArray", "getJSONObject", "getRequestForPagedResults", "direction", "Lcom/facebook/GraphResponse$PagingDirection;", "toString", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "PagingDirection", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GraphResponse {
    private static final java.lang.String BODY_KEY = "body";
    private static final java.lang.String CODE_KEY = "code";
    public static final java.lang.String NON_JSON_RESPONSE_PROPERTY = "FACEBOOK_NON_JSON_RESULT";
    private static final java.lang.String RESPONSE_LOG_TAG = "Response";
    public static final java.lang.String SUCCESS_KEY = "success";
    private final java.net.HttpURLConnection connection;
    private final com.facebook.FacebookRequestError error;
    private final org.json.JSONObject graphObject;
    private final org.json.JSONArray graphObjectArray;
    private final org.json.JSONArray jsonArray;
    private final org.json.JSONObject jsonObject;
    private final java.lang.String rawResponse;
    private final com.facebook.GraphRequest request;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.GraphResponse.Companion INSTANCE = new com.facebook.GraphResponse.Companion(null);
    private static final java.lang.String TAG = com.facebook.GraphResponse.class.getCanonicalName();

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.GraphResponse> constructErrorResponses(java.util.List<com.facebook.GraphRequest> list, java.net.HttpURLConnection httpURLConnection, com.facebook.FacebookException facebookException) {
        return INSTANCE.constructErrorResponses(list, httpURLConnection, facebookException);
    }

    public GraphResponse(com.facebook.GraphRequest request, java.net.HttpURLConnection httpURLConnection, java.lang.String str, org.json.JSONObject jSONObject, org.json.JSONArray jSONArray, com.facebook.FacebookRequestError facebookRequestError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        this.request = request;
        this.connection = httpURLConnection;
        this.rawResponse = str;
        this.graphObject = jSONObject;
        this.graphObjectArray = jSONArray;
        this.error = facebookRequestError;
        this.jsonObject = jSONObject;
        this.jsonArray = jSONArray;
    }

    public final com.facebook.GraphRequest getRequest() {
        return this.request;
    }

    public final java.net.HttpURLConnection getConnection() {
        return this.connection;
    }

    public final java.lang.String getRawResponse() {
        return this.rawResponse;
    }

    public final com.facebook.FacebookRequestError getError() {
        return this.error;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(com.facebook.GraphRequest request, java.net.HttpURLConnection httpURLConnection, java.lang.String rawResponse, org.json.JSONObject jSONObject) {
        this(request, httpURLConnection, rawResponse, jSONObject, null, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(com.facebook.GraphRequest request, java.net.HttpURLConnection httpURLConnection, java.lang.String rawResponse, org.json.JSONArray graphObjects) {
        this(request, httpURLConnection, rawResponse, null, graphObjects, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphObjects, "graphObjects");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GraphResponse(com.facebook.GraphRequest request, java.net.HttpURLConnection httpURLConnection, com.facebook.FacebookRequestError error) {
        this(request, httpURLConnection, null, null, null, error);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
    }

    /* compiled from: GraphResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/GraphResponse$PagingDirection;", "", "(Ljava/lang/String;I)V", "NEXT", "PREVIOUS", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum PagingDirection {
        NEXT,
        PREVIOUS;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static com.facebook.GraphResponse.PagingDirection[] valuesCustom() {
            com.facebook.GraphResponse.PagingDirection[] valuesCustom = values();
            return (com.facebook.GraphResponse.PagingDirection[]) java.util.Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* renamed from: getJSONObject, reason: from getter */
    public final org.json.JSONObject getGraphObject() {
        return this.graphObject;
    }

    public final org.json.JSONObject getJsonObject() {
        return this.jsonObject;
    }

    /* renamed from: getJSONArray, reason: from getter */
    public final org.json.JSONArray getGraphObjectArray() {
        return this.graphObjectArray;
    }

    public final org.json.JSONArray getJsonArray() {
        return this.jsonArray;
    }

    public final com.facebook.GraphRequest getRequestForPagedResults(com.facebook.GraphResponse.PagingDirection direction) {
        java.lang.String str;
        org.json.JSONObject optJSONObject;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(direction, "direction");
        org.json.JSONObject jSONObject = this.graphObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("paging")) == null) {
            str = null;
        } else if (direction == com.facebook.GraphResponse.PagingDirection.NEXT) {
            str = optJSONObject.optString(io.ktor.http.LinkHeader.Rel.Next);
        } else {
            str = optJSONObject.optString("previous");
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        if (com.facebook.internal.Utility.isNullOrEmpty(str)) {
            return null;
        }
        if (str != null && kotlin.jvm.internal.Intrinsics.areEqual(str, this.request.getUrlForSingleRequest())) {
            return null;
        }
        try {
            return new com.facebook.GraphRequest(this.request.getAccessToken(), new java.net.URL(str));
        } catch (java.net.MalformedURLException unused) {
            return null;
        }
    }

    public java.lang.String toString() {
        java.lang.String str;
        try {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.net.HttpURLConnection httpURLConnection = this.connection;
            objArr[0] = java.lang.Integer.valueOf(httpURLConnection == null ? 200 : httpURLConnection.getResponseCode());
            str = java.lang.String.format(locale, "%d", java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (java.io.IOException unused) {
            str = "unknown";
        }
        java.lang.String str2 = "{Response:  responseCode: " + str + ", graphObject: " + this.graphObject + ", error: " + this.error + "}";
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return str2;
    }

    /* compiled from: GraphResponse.kt */
    @kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J*\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0002J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0015\u001a\u00020\u0001H\u0002J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001cJ-\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u001e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0001¢\u0006\u0002\b\u001fJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u001bH\u0001¢\u0006\u0002\b!R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/facebook/GraphResponse$Companion;", "", "()V", "BODY_KEY", "", "CODE_KEY", "NON_JSON_RESPONSE_PROPERTY", "RESPONSE_LOG_TAG", "SUCCESS_KEY", "TAG", "constructErrorResponses", "", "Lcom/facebook/GraphResponse;", "requests", "Lcom/facebook/GraphRequest;", "connection", "Ljava/net/HttpURLConnection;", "error", "Lcom/facebook/FacebookException;", "createResponseFromObject", "request", "sourceObject", "originalResult", "createResponsesFromObject", "createResponsesFromStream", "stream", "Ljava/io/InputStream;", "Lcom/facebook/GraphRequestBatch;", "createResponsesFromStream$facebook_core_release", "createResponsesFromString", "responseString", "createResponsesFromString$facebook_core_release", "fromHttpConnection", "fromHttpConnection$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> fromHttpConnection$facebook_core_release(java.net.HttpURLConnection connection, com.facebook.GraphRequestBatch requests) {
            java.util.List<com.facebook.GraphResponse> constructErrorResponses;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            java.io.InputStream inputStream = null;
            try {
                try {
                    com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                } catch (com.facebook.FacebookException e) {
                    com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.REQUESTS, com.facebook.GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e);
                    constructErrorResponses = constructErrorResponses(requests, connection, e);
                } catch (java.lang.Exception e2) {
                    com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.REQUESTS, com.facebook.GraphResponse.RESPONSE_LOG_TAG, "Response <Error>: %s", e2);
                    constructErrorResponses = constructErrorResponses(requests, connection, new com.facebook.FacebookException(e2));
                }
                if (!com.facebook.FacebookSdk.isFullyInitialized()) {
                    android.util.Log.e(com.facebook.GraphResponse.TAG, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new com.facebook.FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                if (connection.getResponseCode() >= 400) {
                    inputStream = connection.getErrorStream();
                } else {
                    inputStream = connection.getInputStream();
                }
                constructErrorResponses = createResponsesFromStream$facebook_core_release(inputStream, connection, requests);
                return constructErrorResponses;
            } finally {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.closeQuietly((java.io.Closeable) null);
            }
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> createResponsesFromStream$facebook_core_release(java.io.InputStream stream, java.net.HttpURLConnection connection, com.facebook.GraphRequestBatch requests) throws com.facebook.FacebookException, org.json.JSONException, java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            java.lang.String readStreamToString = com.facebook.internal.Utility.readStreamToString(stream);
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.INCLUDE_RAW_RESPONSES, com.facebook.GraphResponse.RESPONSE_LOG_TAG, "Response (raw)\n  Size: %d\n  Response:\n%s\n", java.lang.Integer.valueOf(readStreamToString.length()), readStreamToString);
            return createResponsesFromString$facebook_core_release(readStreamToString, connection, requests);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> createResponsesFromString$facebook_core_release(java.lang.String responseString, java.net.HttpURLConnection connection, com.facebook.GraphRequestBatch requests) throws com.facebook.FacebookException, org.json.JSONException, java.io.IOException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseString, "responseString");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            java.lang.Object resultObject = new org.json.JSONTokener(responseString).nextValue();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resultObject, "resultObject");
            java.util.List<com.facebook.GraphResponse> createResponsesFromObject = createResponsesFromObject(connection, requests, resultObject);
            com.facebook.internal.Logger.INSTANCE.log(com.facebook.LoggingBehavior.REQUESTS, com.facebook.GraphResponse.RESPONSE_LOG_TAG, "Response\n  Id: %s\n  Size: %d\n  Responses:\n%s\n", requests.getId(), java.lang.Integer.valueOf(responseString.length()), createResponsesFromObject);
            return createResponsesFromObject;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final java.util.List<com.facebook.GraphResponse> createResponsesFromObject(java.net.HttpURLConnection connection, java.util.List<com.facebook.GraphRequest> requests, java.lang.Object sourceObject) throws com.facebook.FacebookException, org.json.JSONException {
            java.lang.Object obj;
            int size = requests.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            int i = 0;
            if (size == 1) {
                com.facebook.GraphRequest graphRequest = requests.get(0);
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("body", sourceObject);
                    jSONObject.put(com.facebook.GraphResponse.CODE_KEY, connection == null ? 200 : connection.getResponseCode());
                    org.json.JSONArray jSONArray = new org.json.JSONArray();
                    jSONArray.put(jSONObject);
                    obj = jSONArray;
                } catch (java.io.IOException e) {
                    arrayList.add(new com.facebook.GraphResponse(graphRequest, connection, new com.facebook.FacebookRequestError(connection, e)));
                } catch (org.json.JSONException e2) {
                    arrayList.add(new com.facebook.GraphResponse(graphRequest, connection, new com.facebook.FacebookRequestError(connection, e2)));
                }
                if (obj instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj;
                    if (jSONArray2.length() == size) {
                        int length = jSONArray2.length();
                        if (length > 0) {
                            while (true) {
                                int i2 = i + 1;
                                com.facebook.GraphRequest graphRequest2 = requests.get(i);
                                try {
                                    java.lang.Object obj2 = ((org.json.JSONArray) obj).get(i);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "obj");
                                    arrayList.add(createResponseFromObject(graphRequest2, connection, obj2, sourceObject));
                                } catch (com.facebook.FacebookException e3) {
                                    arrayList.add(new com.facebook.GraphResponse(graphRequest2, connection, new com.facebook.FacebookRequestError(connection, e3)));
                                } catch (org.json.JSONException e4) {
                                    arrayList.add(new com.facebook.GraphResponse(graphRequest2, connection, new com.facebook.FacebookRequestError(connection, e4)));
                                }
                                if (i2 >= length) {
                                    break;
                                }
                                i = i2;
                            }
                        }
                        return arrayList;
                    }
                }
                throw new com.facebook.FacebookException("Unexpected number of results");
            }
            obj = sourceObject;
            if (obj instanceof org.json.JSONArray) {
            }
            throw new com.facebook.FacebookException("Unexpected number of results");
        }

        private final com.facebook.GraphResponse createResponseFromObject(com.facebook.GraphRequest request, java.net.HttpURLConnection connection, java.lang.Object sourceObject, java.lang.Object originalResult) throws org.json.JSONException {
            if (sourceObject instanceof org.json.JSONObject) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) sourceObject;
                com.facebook.FacebookRequestError checkResponseAndCreateError = com.facebook.FacebookRequestError.INSTANCE.checkResponseAndCreateError(jSONObject, originalResult, connection);
                if (checkResponseAndCreateError != null) {
                    android.util.Log.e(com.facebook.GraphResponse.TAG, checkResponseAndCreateError.toString());
                    if (checkResponseAndCreateError.getErrorCode() == 190) {
                        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                        if (com.facebook.internal.Utility.isCurrentAccessToken(request.getAccessToken())) {
                            if (checkResponseAndCreateError.getSubErrorCode() != 493) {
                                com.facebook.AccessToken.INSTANCE.setCurrentAccessToken(null);
                            } else {
                                com.facebook.AccessToken currentAccessToken = com.facebook.AccessToken.INSTANCE.getCurrentAccessToken();
                                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) (currentAccessToken != null ? java.lang.Boolean.valueOf(currentAccessToken.isExpired()) : null), (java.lang.Object) false)) {
                                    com.facebook.AccessToken.INSTANCE.expireCurrentAccessToken();
                                }
                            }
                        }
                    }
                    return new com.facebook.GraphResponse(request, connection, checkResponseAndCreateError);
                }
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                java.lang.Object stringPropertyAsJSON = com.facebook.internal.Utility.getStringPropertyAsJSON(jSONObject, "body", com.facebook.GraphResponse.NON_JSON_RESPONSE_PROPERTY);
                if (stringPropertyAsJSON instanceof org.json.JSONObject) {
                    org.json.JSONObject jSONObject2 = (org.json.JSONObject) stringPropertyAsJSON;
                    return new com.facebook.GraphResponse(request, connection, jSONObject2.toString(), jSONObject2);
                }
                if (stringPropertyAsJSON instanceof org.json.JSONArray) {
                    org.json.JSONArray jSONArray = (org.json.JSONArray) stringPropertyAsJSON;
                    return new com.facebook.GraphResponse(request, connection, jSONArray.toString(), jSONArray);
                }
                sourceObject = org.json.JSONObject.NULL;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sourceObject, "NULL");
            }
            if (sourceObject == org.json.JSONObject.NULL) {
                return new com.facebook.GraphResponse(request, connection, sourceObject.toString(), (org.json.JSONObject) null);
            }
            throw new com.facebook.FacebookException(kotlin.jvm.internal.Intrinsics.stringPlus("Got unexpected object type in response, class: ", sourceObject.getClass().getSimpleName()));
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> constructErrorResponses(java.util.List<com.facebook.GraphRequest> requests, java.net.HttpURLConnection connection, com.facebook.FacebookException error) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            java.util.List<com.facebook.GraphRequest> list = requests;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.facebook.GraphResponse((com.facebook.GraphRequest) it.next(), connection, new com.facebook.FacebookRequestError(connection, error)));
            }
            return arrayList;
        }
    }
}
