package com.facebook;

/* compiled from: GraphRequest.kt */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 `2\u00020\u0001:\t^_`abcdefBO\b\u0017\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rB\u0019\b\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\b\u0010F\u001a\u00020GH\u0002J\u0018\u0010H\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u00052\u0006\u0010J\u001a\u00020\u001eH\u0002J\u0006\u0010K\u001a\u00020LJ\u0006\u0010M\u001a\u00020NJ\n\u0010O\u001a\u0004\u0018\u00010\u0005H\u0002J\n\u0010P\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010Q\u001a\u00020\u00052\u0006\u0010I\u001a\u00020\u0005H\u0002J\b\u0010R\u001a\u00020\u001eH\u0002J\b\u0010S\u001a\u00020\u001eH\u0002J$\u0010T\u001a\u00020G2\u0006\u0010U\u001a\u00020V2\u0012\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020Y0XH\u0002J\u000e\u0010Z\u001a\u00020G2\u0006\u0010[\u001a\u00020\u001eJ\b\u0010\\\u001a\u00020\u001eH\u0002J\b\u0010]\u001a\u00020\u0005H\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0017\"\u0004\b/\u0010\u0019R\u0016\u00100\u001a\u0004\u0018\u00010\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0017R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u00102\u001a\u0004\u0018\u00010\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0011\u0010;\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u001c\u0010=\u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bC\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0017\"\u0004\bE\u0010\u0019¨\u0006g"}, d2 = {"Lcom/facebook/GraphRequest;", "", "accessToken", "Lcom/facebook/AccessToken;", "graphPath", "", "parameters", "Landroid/os/Bundle;", "httpMethod", "Lcom/facebook/HttpMethod;", "callback", "Lcom/facebook/GraphRequest$Callback;", "version", "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/HttpMethod;Lcom/facebook/GraphRequest$Callback;Ljava/lang/String;)V", "overriddenURL", "Ljava/net/URL;", "(Lcom/facebook/AccessToken;Ljava/net/URL;)V", "getAccessToken", "()Lcom/facebook/AccessToken;", "setAccessToken", "(Lcom/facebook/AccessToken;)V", "batchEntryDependsOn", "getBatchEntryDependsOn", "()Ljava/lang/String;", "setBatchEntryDependsOn", "(Ljava/lang/String;)V", "batchEntryName", "getBatchEntryName", "setBatchEntryName", "batchEntryOmitResultOnSuccess", "", "getBatchEntryOmitResultOnSuccess", "()Z", "setBatchEntryOmitResultOnSuccess", "(Z)V", "getCallback", "()Lcom/facebook/GraphRequest$Callback;", "setCallback", "(Lcom/facebook/GraphRequest$Callback;)V", "forceApplicationRequest", "graphObject", "Lorg/json/JSONObject;", "getGraphObject", "()Lorg/json/JSONObject;", "setGraphObject", "(Lorg/json/JSONObject;)V", "getGraphPath", "setGraphPath", "graphPathWithVersion", "getGraphPathWithVersion", "value", "getHttpMethod", "()Lcom/facebook/HttpMethod;", "setHttpMethod", "(Lcom/facebook/HttpMethod;)V", "getParameters", "()Landroid/os/Bundle;", "setParameters", "(Landroid/os/Bundle;)V", "relativeUrlForBatchedRequest", "getRelativeUrlForBatchedRequest", com.facebook.appevents.internal.ViewHierarchyConstants.TAG_KEY, "getTag", "()Ljava/lang/Object;", "setTag", "(Ljava/lang/Object;)V", "urlForSingleRequest", "getUrlForSingleRequest", "getVersion", "setVersion", "addCommonParameters", "", "appendParametersToBaseUrl", "baseUrl", "isBatch", "executeAndWait", "Lcom/facebook/GraphResponse;", "executeAsync", "Lcom/facebook/GraphRequestAsyncTask;", "getAccessTokenToUseForRequest", "getClientTokenForRequest", "getUrlWithGraphPath", "isApplicationRequest", "isValidGraphRequestForDomain", "serializeToBatch", com.facebook.GraphRequest.BATCH_PARAM, "Lorg/json/JSONArray;", com.helpshift.HelpshiftEvent.DATA_ATTACHMENTS, "", "Lcom/facebook/GraphRequest$Attachment;", "setForceApplicationRequest", "forceOverride", "shouldForceClientTokenForRequest", "toString", "Attachment", "Callback", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "GraphJSONArrayCallback", "GraphJSONObjectCallback", "KeyValueSerializer", "OnProgressCallback", "ParcelableResourceWithMimeType", "Serializer", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class GraphRequest {
    private static final java.lang.String ACCEPT_LANGUAGE_HEADER = "Accept-Language";
    public static final java.lang.String ACCESS_TOKEN_PARAM = "access_token";
    private static final java.lang.String ATTACHED_FILES_PARAM = "attached_files";
    private static final java.lang.String ATTACHMENT_FILENAME_PREFIX = "file";
    private static final java.lang.String BATCH_APP_ID_PARAM = "batch_app_id";
    private static final java.lang.String BATCH_BODY_PARAM = "body";
    private static final java.lang.String BATCH_ENTRY_DEPENDS_ON_PARAM = "depends_on";
    private static final java.lang.String BATCH_ENTRY_NAME_PARAM = "name";
    private static final java.lang.String BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM = "omit_response_on_success";
    private static final java.lang.String BATCH_METHOD_PARAM = "method";
    private static final java.lang.String BATCH_PARAM = "batch";
    private static final java.lang.String BATCH_RELATIVE_URL_PARAM = "relative_url";
    private static final java.lang.String CAPTION_PARAM = "caption";
    private static final java.lang.String CONTENT_ENCODING_HEADER = "Content-Encoding";
    private static final java.lang.String CONTENT_TYPE_HEADER = "Content-Type";
    private static final java.lang.String DEBUG_KEY = "__debug__";
    private static final java.lang.String DEBUG_MESSAGES_KEY = "messages";
    private static final java.lang.String DEBUG_MESSAGE_KEY = "message";
    private static final java.lang.String DEBUG_MESSAGE_LINK_KEY = "link";
    private static final java.lang.String DEBUG_MESSAGE_TYPE_KEY = "type";
    private static final java.lang.String DEBUG_PARAM = "debug";
    private static final java.lang.String DEBUG_SEVERITY_INFO = "info";
    private static final java.lang.String DEBUG_SEVERITY_WARNING = "warning";
    public static final java.lang.String FIELDS_PARAM = "fields";
    private static final java.lang.String FORMAT_JSON = "json";
    private static final java.lang.String FORMAT_PARAM = "format";
    private static final java.lang.String ISO_8601_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ssZ";
    public static final int MAXIMUM_BATCH_SIZE = 50;
    private static final java.lang.String ME = "me";
    private static final java.lang.String MIME_BOUNDARY;
    private static final java.lang.String MY_FRIENDS = "me/friends";
    private static final java.lang.String MY_PHOTOS = "me/photos";
    private static final java.lang.String PICTURE_PARAM = "picture";
    private static final java.lang.String SDK_ANDROID = "android";
    private static final java.lang.String SDK_PARAM = "sdk";
    private static final java.lang.String SEARCH = "search";
    private static final java.lang.String USER_AGENT_BASE = "FBAndroidSDK";
    private static final java.lang.String USER_AGENT_HEADER = "User-Agent";
    private static final java.lang.String VIDEOS_SUFFIX = "/videos";
    private static java.lang.String defaultBatchApplicationId;
    private static volatile java.lang.String userAgent;
    private static final java.util.regex.Pattern versionPattern;
    private com.facebook.AccessToken accessToken;
    private java.lang.String batchEntryDependsOn;
    private java.lang.String batchEntryName;
    private boolean batchEntryOmitResultOnSuccess;
    private com.facebook.GraphRequest.Callback callback;
    private boolean forceApplicationRequest;
    private org.json.JSONObject graphObject;
    private java.lang.String graphPath;
    private com.facebook.HttpMethod httpMethod;
    private java.lang.String overriddenURL;
    private android.os.Bundle parameters;
    private java.lang.Object tag;
    private java.lang.String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.GraphRequest.Companion INSTANCE = new com.facebook.GraphRequest.Companion(null);
    public static final java.lang.String TAG = "GraphRequest";

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/facebook/GraphRequest$Callback;", "", "onCompleted", "", com.ironsource.Ve.n, "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void onCompleted(com.facebook.GraphResponse response);
    }

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "", "onCompleted", "", "objects", "Lorg/json/JSONArray;", com.ironsource.Ve.n, "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface GraphJSONArrayCallback {
        void onCompleted(org.json.JSONArray objects, com.facebook.GraphResponse response);
    }

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "", "onCompleted", "", "obj", "Lorg/json/JSONObject;", com.ironsource.Ve.n, "Lcom/facebook/GraphResponse;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface GraphJSONObjectCallback {
        void onCompleted(org.json.JSONObject obj, com.facebook.GraphResponse response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bâ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$KeyValueSerializer;", "", "writeString", "", com.ironsource.X3.i.W, "", "value", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    interface KeyValueSerializer {
        void writeString(java.lang.String key, java.lang.String value);
    }

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/facebook/GraphRequest$OnProgressCallback;", "Lcom/facebook/GraphRequest$Callback;", "onProgress", "", "current", "", com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnProgressCallback extends com.facebook.GraphRequest.Callback {
        void onProgress(long current, long max);
    }

    public GraphRequest() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GraphRequest(com.facebook.AccessToken accessToken) {
        this(accessToken, null, null, null, null, null, 62, null);
    }

    public GraphRequest(com.facebook.AccessToken accessToken, java.lang.String str) {
        this(accessToken, str, null, null, null, null, 60, null);
    }

    public GraphRequest(com.facebook.AccessToken accessToken, java.lang.String str, android.os.Bundle bundle) {
        this(accessToken, str, bundle, null, null, null, 56, null);
    }

    public GraphRequest(com.facebook.AccessToken accessToken, java.lang.String str, android.os.Bundle bundle, com.facebook.HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null, null, 48, null);
    }

    public GraphRequest(com.facebook.AccessToken accessToken, java.lang.String str, android.os.Bundle bundle, com.facebook.HttpMethod httpMethod, com.facebook.GraphRequest.Callback callback) {
        this(accessToken, str, bundle, httpMethod, callback, null, 32, null);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphResponse executeAndWait(com.facebook.GraphRequest graphRequest) {
        return INSTANCE.executeAndWait(graphRequest);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.GraphResponse> executeBatchAndWait(com.facebook.GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeBatchAndWait(graphRequestBatch);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.GraphResponse> executeBatchAndWait(java.util.Collection<com.facebook.GraphRequest> collection) {
        return INSTANCE.executeBatchAndWait(collection);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.GraphResponse> executeBatchAndWait(com.facebook.GraphRequest... graphRequestArr) {
        return INSTANCE.executeBatchAndWait(graphRequestArr);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequestAsyncTask executeBatchAsync(com.facebook.GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeBatchAsync(graphRequestBatch);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequestAsyncTask executeBatchAsync(java.util.Collection<com.facebook.GraphRequest> collection) {
        return INSTANCE.executeBatchAsync(collection);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequestAsyncTask executeBatchAsync(com.facebook.GraphRequest... graphRequestArr) {
        return INSTANCE.executeBatchAsync(graphRequestArr);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.GraphResponse> executeConnectionAndWait(java.net.HttpURLConnection httpURLConnection, com.facebook.GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAndWait(httpURLConnection, graphRequestBatch);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.List<com.facebook.GraphResponse> executeConnectionAndWait(java.net.HttpURLConnection httpURLConnection, java.util.Collection<com.facebook.GraphRequest> collection) {
        return INSTANCE.executeConnectionAndWait(httpURLConnection, collection);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequestAsyncTask executeConnectionAsync(android.os.Handler handler, java.net.HttpURLConnection httpURLConnection, com.facebook.GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAsync(handler, httpURLConnection, graphRequestBatch);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequestAsyncTask executeConnectionAsync(java.net.HttpURLConnection httpURLConnection, com.facebook.GraphRequestBatch graphRequestBatch) {
        return INSTANCE.executeConnectionAsync(httpURLConnection, graphRequestBatch);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getDefaultBatchApplicationId() {
        return INSTANCE.getDefaultBatchApplicationId();
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newCustomAudienceThirdPartyIdRequest(com.facebook.AccessToken accessToken, android.content.Context context, com.facebook.GraphRequest.Callback callback) {
        return INSTANCE.newCustomAudienceThirdPartyIdRequest(accessToken, context, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newCustomAudienceThirdPartyIdRequest(com.facebook.AccessToken accessToken, android.content.Context context, java.lang.String str, com.facebook.GraphRequest.Callback callback) {
        return INSTANCE.newCustomAudienceThirdPartyIdRequest(accessToken, context, str, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newDeleteObjectRequest(com.facebook.AccessToken accessToken, java.lang.String str, com.facebook.GraphRequest.Callback callback) {
        return INSTANCE.newDeleteObjectRequest(accessToken, str, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newGraphPathRequest(com.facebook.AccessToken accessToken, java.lang.String str, com.facebook.GraphRequest.Callback callback) {
        return INSTANCE.newGraphPathRequest(accessToken, str, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newMeRequest(com.facebook.AccessToken accessToken, com.facebook.GraphRequest.GraphJSONObjectCallback graphJSONObjectCallback) {
        return INSTANCE.newMeRequest(accessToken, graphJSONObjectCallback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newMyFriendsRequest(com.facebook.AccessToken accessToken, com.facebook.GraphRequest.GraphJSONArrayCallback graphJSONArrayCallback) {
        return INSTANCE.newMyFriendsRequest(accessToken, graphJSONArrayCallback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newPlacesSearchRequest(com.facebook.AccessToken accessToken, android.location.Location location, int i, int i2, java.lang.String str, com.facebook.GraphRequest.GraphJSONArrayCallback graphJSONArrayCallback) {
        return INSTANCE.newPlacesSearchRequest(accessToken, location, i, i2, str, graphJSONArrayCallback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newPostRequest(com.facebook.AccessToken accessToken, java.lang.String str, org.json.JSONObject jSONObject, com.facebook.GraphRequest.Callback callback) {
        return INSTANCE.newPostRequest(accessToken, str, jSONObject, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newPostRequestWithBundle(com.facebook.AccessToken accessToken, java.lang.String str, android.os.Bundle bundle, com.facebook.GraphRequest.Callback callback) {
        return INSTANCE.newPostRequestWithBundle(accessToken, str, bundle, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newUploadPhotoRequest(com.facebook.AccessToken accessToken, java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2, android.os.Bundle bundle, com.facebook.GraphRequest.Callback callback) {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, bitmap, str2, bundle, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newUploadPhotoRequest(com.facebook.AccessToken accessToken, java.lang.String str, android.net.Uri uri, java.lang.String str2, android.os.Bundle bundle, com.facebook.GraphRequest.Callback callback) throws java.io.FileNotFoundException, com.facebook.FacebookException {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, uri, str2, bundle, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.GraphRequest newUploadPhotoRequest(com.facebook.AccessToken accessToken, java.lang.String str, java.io.File file, java.lang.String str2, android.os.Bundle bundle, com.facebook.GraphRequest.Callback callback) throws java.io.FileNotFoundException {
        return INSTANCE.newUploadPhotoRequest(accessToken, str, file, str2, bundle, callback);
    }

    @kotlin.jvm.JvmStatic
    public static final void setDefaultBatchApplicationId(java.lang.String str) {
        INSTANCE.setDefaultBatchApplicationId(str);
    }

    @kotlin.jvm.JvmStatic
    public static final java.net.HttpURLConnection toHttpConnection(com.facebook.GraphRequestBatch graphRequestBatch) {
        return INSTANCE.toHttpConnection(graphRequestBatch);
    }

    @kotlin.jvm.JvmStatic
    public static final java.net.HttpURLConnection toHttpConnection(java.util.Collection<com.facebook.GraphRequest> collection) {
        return INSTANCE.toHttpConnection(collection);
    }

    @kotlin.jvm.JvmStatic
    public static final java.net.HttpURLConnection toHttpConnection(com.facebook.GraphRequest... graphRequestArr) {
        return INSTANCE.toHttpConnection(graphRequestArr);
    }

    public final com.facebook.AccessToken getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(com.facebook.AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public final java.lang.String getGraphPath() {
        return this.graphPath;
    }

    public final void setGraphPath(java.lang.String str) {
        this.graphPath = str;
    }

    public final org.json.JSONObject getGraphObject() {
        return this.graphObject;
    }

    public final void setGraphObject(org.json.JSONObject jSONObject) {
        this.graphObject = jSONObject;
    }

    public final java.lang.String getBatchEntryName() {
        return this.batchEntryName;
    }

    public final void setBatchEntryName(java.lang.String str) {
        this.batchEntryName = str;
    }

    public final java.lang.String getBatchEntryDependsOn() {
        return this.batchEntryDependsOn;
    }

    public final void setBatchEntryDependsOn(java.lang.String str) {
        this.batchEntryDependsOn = str;
    }

    public final boolean getBatchEntryOmitResultOnSuccess() {
        return this.batchEntryOmitResultOnSuccess;
    }

    public final void setBatchEntryOmitResultOnSuccess(boolean z) {
        this.batchEntryOmitResultOnSuccess = z;
    }

    public final android.os.Bundle getParameters() {
        return this.parameters;
    }

    public final void setParameters(android.os.Bundle bundle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "<set-?>");
        this.parameters = bundle;
    }

    public final java.lang.Object getTag() {
        return this.tag;
    }

    public final void setTag(java.lang.Object obj) {
        this.tag = obj;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final void setVersion(java.lang.String str) {
        this.version = str;
    }

    public final com.facebook.GraphRequest.Callback getCallback() {
        return this.callback;
    }

    public final void setCallback(final com.facebook.GraphRequest.Callback callback) {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (!com.facebook.FacebookSdk.isLoggingBehaviorEnabled(com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
            if (!com.facebook.FacebookSdk.isLoggingBehaviorEnabled(com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
                this.callback = callback;
                return;
            }
        }
        this.callback = new com.facebook.GraphRequest.Callback() { // from class: com.facebook.GraphRequest$$ExternalSyntheticLambda0
            @Override // com.facebook.GraphRequest.Callback
            public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                com.facebook.GraphRequest.m5066_set_callback_$lambda0(com.facebook.GraphRequest.Callback.this, graphResponse);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _set_callback_$lambda-0, reason: not valid java name */
    public static final void m5066_set_callback_$lambda0(com.facebook.GraphRequest.Callback callback, com.facebook.GraphResponse response) {
        int length;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
        org.json.JSONObject graphObject = response.getGraphObject();
        org.json.JSONObject optJSONObject = graphObject == null ? null : graphObject.optJSONObject(DEBUG_KEY);
        org.json.JSONArray optJSONArray = optJSONObject == null ? null : optJSONObject.optJSONArray(DEBUG_MESSAGES_KEY);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                java.lang.String optString = optJSONObject2 == null ? null : optJSONObject2.optString("message");
                java.lang.String optString2 = optJSONObject2 == null ? null : optJSONObject2.optString("type");
                java.lang.String optString3 = optJSONObject2 == null ? null : optJSONObject2.optString("link");
                if (optString != null && optString2 != null) {
                    com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO;
                    if (kotlin.jvm.internal.Intrinsics.areEqual(optString2, DEBUG_SEVERITY_WARNING)) {
                        loggingBehavior = com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING;
                    }
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    if (!com.facebook.internal.Utility.isNullOrEmpty(optString3)) {
                        optString = ((java.lang.Object) optString) + " Link: " + ((java.lang.Object) optString3);
                    }
                    com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                    java.lang.String TAG2 = TAG;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                    companion.log(loggingBehavior, TAG2, optString);
                }
                if (i2 >= length) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        if (callback == null) {
            return;
        }
        callback.onCompleted(response);
    }

    public final com.facebook.HttpMethod getHttpMethod() {
        return this.httpMethod;
    }

    public final void setHttpMethod(com.facebook.HttpMethod httpMethod) {
        if (this.overriddenURL != null && httpMethod != com.facebook.HttpMethod.GET) {
            throw new com.facebook.FacebookException("Can't change HTTP method on request with overridden URL.");
        }
        if (httpMethod == null) {
            httpMethod = com.facebook.HttpMethod.GET;
        }
        this.httpMethod = httpMethod;
    }

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0007J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010A\u001a\u00020BH\u0007J'\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0002\u0010DJ\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020<0@2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u0010\u0010F\u001a\u00020G2\u0006\u0010A\u001a\u00020BH\u0007J!\u0010F\u001a\u00020G2\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0002\u0010HJ\u0016\u0010F\u001a\u00020G2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u001e\u0010I\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J$\u0010I\u001a\b\u0012\u0004\u0012\u00020<0@2\u0006\u0010J\u001a\u0002082\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\"\u0010K\u001a\u00020G2\b\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J\u0018\u0010K\u001a\u00020G2\u0006\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J\u0010\u0010N\u001a\u00020\u00042\u0006\u0010O\u001a\u00020BH\u0002J\n\u0010P\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010Q\u001a\u00020\u00042\b\u0010R\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010S\u001a\u00020T2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010U\u001a\u00020T2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010V\u001a\u00020T2\u0006\u0010W\u001a\u00020\u0004H\u0002J\u0012\u0010X\u001a\u00020T2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J\u0012\u0010Z\u001a\u00020T2\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010[\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J.\u0010[\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\b\u0010b\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J&\u0010c\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010d\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J&\u0010e\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J\u001c\u0010f\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010gH\u0007J\u001c\u0010h\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010`\u001a\u0004\u0018\u00010iH\u0007J@\u0010j\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010k\u001a\u0004\u0018\u00010l2\u0006\u0010m\u001a\u00020 2\u0006\u0010n\u001a\u00020 2\b\u0010o\u001a\u0004\u0018\u00010\u00042\b\u0010`\u001a\u0004\u0018\u00010iH\u0007J0\u0010p\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010q\u001a\u0004\u0018\u00010r2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J0\u0010s\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\b\u0010t\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010w\u001a\u00020x2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010{\u001a\u00020|2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007JB\u0010v\u001a\u00020>2\b\u0010\\\u001a\u0004\u0018\u00010]2\b\u0010R\u001a\u0004\u0018\u00010\u00042\u0006\u0010}\u001a\u00020~2\b\u0010y\u001a\u0004\u0018\u00010\u00042\b\u0010z\u001a\u0004\u0018\u00010u2\b\u0010`\u001a\u0004\u0018\u00010aH\u0007J\u0012\u0010\u007f\u001a\u00020\u00042\b\u0010Y\u001a\u0004\u0018\u00010\u0001H\u0002J$\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0006\u0010q\u001a\u00020r2\u0006\u0010W\u001a\u00020\u00042\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J.\u0010\u0084\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0085\u0001\u001a\u00020\u00042\u0006\u0010Y\u001a\u00020\u00012\b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\u0007\u0010\u0086\u0001\u001a\u00020TH\u0002JB\u0010\u0087\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\n\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u008a\u0001\u001a\u00020 2\u0006\u00109\u001a\u00020:2\b\u0010\u008b\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008d\u0001\u001a\u00020TH\u0002J'\u0010\u008e\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\r\u0010\u008f\u0001\u001a\b\u0012\u0004\u0012\u00020<0@H\u0001¢\u0006\u0003\b\u0090\u0001J+\u0010\u0091\u0001\u001a\u00030\u0081\u00012\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u0001H\u0002J%\u0010\u0096\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0097\u0001\u001a\u00020u2\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\u0006\u0010=\u001a\u00020>H\u0002J9\u0010\u0098\u0001\u001a\u00030\u0081\u00012\b\u0010\u0082\u0001\u001a\u00030\u0095\u00012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0E2\u0015\u0010\u0092\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0005\u0012\u00030\u0094\u00010\u0099\u0001H\u0002J \u0010\u009a\u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020B2\u0006\u0010J\u001a\u000208H\u0001¢\u0006\u0003\b\u009b\u0001J\u001b\u0010\u009c\u0001\u001a\u00030\u0081\u00012\u0006\u0010J\u001a\u0002082\u0007\u0010\u008d\u0001\u001a\u00020TH\u0002J\u0014\u0010\u009d\u0001\u001a\u00030\u0081\u00012\b\u0010b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0011\u0010\u009e\u0001\u001a\u0002082\u0006\u0010A\u001a\u00020BH\u0007J#\u0010\u009e\u0001\u001a\u0002082\u0012\u0010A\u001a\n\u0012\u0006\b\u0001\u0012\u00020>0C\"\u00020>H\u0007¢\u0006\u0003\u0010\u009f\u0001J\u0017\u0010\u009e\u0001\u001a\u0002082\f\u0010A\u001a\b\u0012\u0004\u0012\u00020>0EH\u0007J\u0018\u0010 \u0001\u001a\u00030\u0081\u00012\u0006\u0010A\u001a\u00020BH\u0001¢\u0006\u0003\b¡\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\n **\u0004\u0018\u00010\u00040\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b+\u0010\u0002R\u000e\u0010,\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00048BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0016\u00105\u001a\n **\u0004\u0018\u00010606X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¢\u0001"}, d2 = {"Lcom/facebook/GraphRequest$Companion;", "", "()V", "ACCEPT_LANGUAGE_HEADER", "", "ACCESS_TOKEN_PARAM", "ATTACHED_FILES_PARAM", "ATTACHMENT_FILENAME_PREFIX", "BATCH_APP_ID_PARAM", "BATCH_BODY_PARAM", "BATCH_ENTRY_DEPENDS_ON_PARAM", "BATCH_ENTRY_NAME_PARAM", "BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM", "BATCH_METHOD_PARAM", "BATCH_PARAM", "BATCH_RELATIVE_URL_PARAM", "CAPTION_PARAM", "CONTENT_ENCODING_HEADER", "CONTENT_TYPE_HEADER", "DEBUG_KEY", "DEBUG_MESSAGES_KEY", "DEBUG_MESSAGE_KEY", "DEBUG_MESSAGE_LINK_KEY", "DEBUG_MESSAGE_TYPE_KEY", "DEBUG_PARAM", "DEBUG_SEVERITY_INFO", "DEBUG_SEVERITY_WARNING", "FIELDS_PARAM", "FORMAT_JSON", "FORMAT_PARAM", "ISO_8601_FORMAT_STRING", "MAXIMUM_BATCH_SIZE", "", "ME", "MIME_BOUNDARY", "MY_FRIENDS", "MY_PHOTOS", "PICTURE_PARAM", "SDK_ANDROID", "SDK_PARAM", com.facebook.appevents.internal.ViewHierarchyConstants.SEARCH, "TAG", "kotlin.jvm.PlatformType", "getTAG$facebook_core_release$annotations", "USER_AGENT_BASE", "USER_AGENT_HEADER", "VIDEOS_SUFFIX", "defaultBatchApplicationId", "mimeContentType", "getMimeContentType", "()Ljava/lang/String;", "userAgent", "getUserAgent", "versionPattern", "Ljava/util/regex/Pattern;", "createConnection", "Ljava/net/HttpURLConnection;", "url", "Ljava/net/URL;", "executeAndWait", "Lcom/facebook/GraphResponse;", "request", "Lcom/facebook/GraphRequest;", "executeBatchAndWait", "", "requests", "Lcom/facebook/GraphRequestBatch;", "", "([Lcom/facebook/GraphRequest;)Ljava/util/List;", "", "executeBatchAsync", "Lcom/facebook/GraphRequestAsyncTask;", "([Lcom/facebook/GraphRequest;)Lcom/facebook/GraphRequestAsyncTask;", "executeConnectionAndWait", "connection", "executeConnectionAsync", "callbackHandler", "Landroid/os/Handler;", "getBatchAppId", com.facebook.GraphRequest.BATCH_PARAM, "getDefaultBatchApplicationId", "getDefaultPhotoPathIfNull", "graphPath", "hasOnProgressCallbacks", "", "isGzipCompressible", "isMeRequest", "path", "isSupportedAttachmentType", "value", "isSupportedParameterType", "newCustomAudienceThirdPartyIdRequest", "accessToken", "Lcom/facebook/AccessToken;", "context", "Landroid/content/Context;", "callback", "Lcom/facebook/GraphRequest$Callback;", "applicationId", "newDeleteObjectRequest", "id", "newGraphPathRequest", "newMeRequest", "Lcom/facebook/GraphRequest$GraphJSONObjectCallback;", "newMyFriendsRequest", "Lcom/facebook/GraphRequest$GraphJSONArrayCallback;", "newPlacesSearchRequest", com.google.firebase.analytics.FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "radiusInMeters", "resultsLimit", "searchText", "newPostRequest", "graphObject", "Lorg/json/JSONObject;", "newPostRequestWithBundle", "parameters", "Landroid/os/Bundle;", "newUploadPhotoRequest", "image", "Landroid/graphics/Bitmap;", "caption", "params", "photoUri", "Landroid/net/Uri;", "file", "Ljava/io/File;", "parameterToString", "processGraphObject", "", "serializer", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "processGraphObjectProperty", com.ironsource.X3.i.W, "passByValue", "processRequest", "logger", "Lcom/facebook/internal/Logger;", "numRequests", "outputStream", "Ljava/io/OutputStream;", "shouldUseGzip", "runCallbacks", "responses", "runCallbacks$facebook_core_release", "serializeAttachments", com.helpshift.HelpshiftEvent.DATA_ATTACHMENTS, "", "Lcom/facebook/GraphRequest$Attachment;", "Lcom/facebook/GraphRequest$Serializer;", "serializeParameters", "bundle", "serializeRequestsAsJSON", "", "serializeToUrlConnection", "serializeToUrlConnection$facebook_core_release", "setConnectionContentType", "setDefaultBatchApplicationId", "toHttpConnection", "([Lcom/facebook/GraphRequest;)Ljava/net/HttpURLConnection;", "validateFieldsParamForGetRequests", "validateFieldsParamForGetRequests$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getTAG$facebook_core_release$annotations() {
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.lang.String getDefaultBatchApplicationId() {
            return com.facebook.GraphRequest.defaultBatchApplicationId;
        }

        @kotlin.jvm.JvmStatic
        public final void setDefaultBatchApplicationId(java.lang.String applicationId) {
            com.facebook.GraphRequest.defaultBatchApplicationId = applicationId;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newDeleteObjectRequest(com.facebook.AccessToken accessToken, java.lang.String id, com.facebook.GraphRequest.Callback callback) {
            return new com.facebook.GraphRequest(accessToken, id, null, com.facebook.HttpMethod.DELETE, callback, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newMeRequest(com.facebook.AccessToken accessToken, final com.facebook.GraphRequest.GraphJSONObjectCallback callback) {
            return new com.facebook.GraphRequest(accessToken, com.facebook.GraphRequest.ME, null, null, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda1
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                    com.facebook.GraphRequest.Companion.m5069newMeRequest$lambda0(com.facebook.GraphRequest.GraphJSONObjectCallback.this, graphResponse);
                }
            }, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newMeRequest$lambda-0, reason: not valid java name */
        public static final void m5069newMeRequest$lambda0(com.facebook.GraphRequest.GraphJSONObjectCallback graphJSONObjectCallback, com.facebook.GraphResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONObjectCallback == null) {
                return;
            }
            graphJSONObjectCallback.onCompleted(response.getGraphObject(), response);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newPostRequest(com.facebook.AccessToken accessToken, java.lang.String graphPath, org.json.JSONObject graphObject, com.facebook.GraphRequest.Callback callback) {
            com.facebook.GraphRequest graphRequest = new com.facebook.GraphRequest(accessToken, graphPath, null, com.facebook.HttpMethod.POST, callback, null, 32, null);
            graphRequest.setGraphObject(graphObject);
            return graphRequest;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newPostRequestWithBundle(com.facebook.AccessToken accessToken, java.lang.String graphPath, android.os.Bundle parameters, com.facebook.GraphRequest.Callback callback) {
            return new com.facebook.GraphRequest(accessToken, graphPath, parameters, com.facebook.HttpMethod.POST, callback, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newMyFriendsRequest(com.facebook.AccessToken accessToken, final com.facebook.GraphRequest.GraphJSONArrayCallback callback) {
            return new com.facebook.GraphRequest(accessToken, com.facebook.GraphRequest.MY_FRIENDS, null, null, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.GraphRequest$Companion$newMyFriendsRequest$wrapper$1
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(com.facebook.GraphResponse response) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
                    if (com.facebook.GraphRequest.GraphJSONArrayCallback.this != null) {
                        org.json.JSONObject graphObject = response.getGraphObject();
                        com.facebook.GraphRequest.GraphJSONArrayCallback.this.onCompleted(graphObject == null ? null : graphObject.optJSONArray("data"), response);
                    }
                }
            }, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newGraphPathRequest(com.facebook.AccessToken accessToken, java.lang.String graphPath, com.facebook.GraphRequest.Callback callback) {
            return new com.facebook.GraphRequest(accessToken, graphPath, null, null, callback, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newPlacesSearchRequest(com.facebook.AccessToken accessToken, android.location.Location location, int radiusInMeters, int resultsLimit, java.lang.String searchText, final com.facebook.GraphRequest.GraphJSONArrayCallback callback) {
            if (location == null) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (com.facebook.internal.Utility.isNullOrEmpty(searchText)) {
                    throw new com.facebook.FacebookException("Either location or searchText must be specified.");
                }
            }
            android.os.Bundle bundle = new android.os.Bundle(5);
            bundle.putString("type", "place");
            bundle.putInt("limit", resultsLimit);
            if (location != null) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format(java.util.Locale.US, "%f,%f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(location.getLatitude()), java.lang.Double.valueOf(location.getLongitude())}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                bundle.putString("center", format);
                bundle.putInt("distance", radiusInMeters);
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isNullOrEmpty(searchText)) {
                bundle.putString("q", searchText);
            }
            return new com.facebook.GraphRequest(accessToken, "search", bundle, com.facebook.HttpMethod.GET, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda0
                @Override // com.facebook.GraphRequest.Callback
                public final void onCompleted(com.facebook.GraphResponse graphResponse) {
                    com.facebook.GraphRequest.Companion.m5070newPlacesSearchRequest$lambda1(com.facebook.GraphRequest.GraphJSONArrayCallback.this, graphResponse);
                }
            }, null, 32, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: newPlacesSearchRequest$lambda-1, reason: not valid java name */
        public static final void m5070newPlacesSearchRequest$lambda1(com.facebook.GraphRequest.GraphJSONArrayCallback graphJSONArrayCallback, com.facebook.GraphResponse response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "response");
            if (graphJSONArrayCallback != null) {
                org.json.JSONObject graphObject = response.getGraphObject();
                graphJSONArrayCallback.onCompleted(graphObject == null ? null : graphObject.optJSONArray("data"), response);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newUploadPhotoRequest(com.facebook.AccessToken accessToken, java.lang.String graphPath, android.graphics.Bitmap image, java.lang.String caption, android.os.Bundle params, com.facebook.GraphRequest.Callback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "image");
            android.os.Bundle bundle = new android.os.Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", image);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new com.facebook.GraphRequest(accessToken, getDefaultPhotoPathIfNull(graphPath), bundle, com.facebook.HttpMethod.POST, callback, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newUploadPhotoRequest(com.facebook.AccessToken accessToken, java.lang.String graphPath, java.io.File file, java.lang.String caption, android.os.Bundle params, com.facebook.GraphRequest.Callback callback) throws java.io.FileNotFoundException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "file");
            android.os.ParcelFileDescriptor open = android.os.ParcelFileDescriptor.open(file, 268435456);
            android.os.Bundle bundle = new android.os.Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", open);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new com.facebook.GraphRequest(accessToken, getDefaultPhotoPathIfNull(graphPath), bundle, com.facebook.HttpMethod.POST, callback, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newUploadPhotoRequest(com.facebook.AccessToken accessToken, java.lang.String graphPath, android.net.Uri photoUri, java.lang.String caption, android.os.Bundle params, com.facebook.GraphRequest.Callback callback) throws java.io.FileNotFoundException, com.facebook.FacebookException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUri, "photoUri");
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            if (com.facebook.internal.Utility.isFileUri(photoUri)) {
                return newUploadPhotoRequest(accessToken, graphPath, new java.io.File(photoUri.getPath()), caption, params, callback);
            }
            com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
            if (!com.facebook.internal.Utility.isContentUri(photoUri)) {
                throw new com.facebook.FacebookException("The photo Uri must be either a file:// or content:// Uri");
            }
            android.os.Bundle bundle = new android.os.Bundle();
            if (params != null) {
                bundle.putAll(params);
            }
            bundle.putParcelable("picture", photoUri);
            if (caption != null && caption.length() > 0) {
                bundle.putString("caption", caption);
            }
            return new com.facebook.GraphRequest(accessToken, getDefaultPhotoPathIfNull(graphPath), bundle, com.facebook.HttpMethod.POST, callback, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newCustomAudienceThirdPartyIdRequest(com.facebook.AccessToken accessToken, android.content.Context context, java.lang.String applicationId, com.facebook.GraphRequest.Callback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            if (applicationId == null && accessToken != null) {
                applicationId = accessToken.getApplicationId();
            }
            if (applicationId == null) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                applicationId = com.facebook.internal.Utility.getMetadataApplicationId(context);
            }
            if (applicationId == null) {
                throw new com.facebook.FacebookException("Facebook App ID cannot be determined");
            }
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus(applicationId, "/custom_audience_third_party_id");
            com.facebook.internal.AttributionIdentifiers attributionIdentifiers = com.facebook.internal.AttributionIdentifiers.INSTANCE.getAttributionIdentifiers(context);
            android.os.Bundle bundle = new android.os.Bundle();
            if (accessToken == null) {
                if (attributionIdentifiers == null) {
                    throw new com.facebook.FacebookException("There is no access token and attribution identifiers could not be retrieved");
                }
                java.lang.String attributionId = attributionIdentifiers.getAttributionId() != null ? attributionIdentifiers.getAttributionId() : attributionIdentifiers.getAndroidAdvertiserId();
                if (attributionId != null) {
                    bundle.putString("udid", attributionId);
                }
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.FacebookSdk.getLimitEventAndDataUsage(context) || (attributionIdentifiers != null && attributionIdentifiers.getIsTrackingLimited())) {
                bundle.putString("limit_event_usage", "1");
            }
            return new com.facebook.GraphRequest(accessToken, stringPlus, bundle, com.facebook.HttpMethod.GET, callback, null, 32, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequest newCustomAudienceThirdPartyIdRequest(com.facebook.AccessToken accessToken, android.content.Context context, com.facebook.GraphRequest.Callback callback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return newCustomAudienceThirdPartyIdRequest(accessToken, context, null, callback);
        }

        @kotlin.jvm.JvmStatic
        public final java.net.HttpURLConnection toHttpConnection(com.facebook.GraphRequest... requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            return toHttpConnection(kotlin.collections.ArraysKt.toList(requests));
        }

        @kotlin.jvm.JvmStatic
        public final java.net.HttpURLConnection toHttpConnection(java.util.Collection<com.facebook.GraphRequest> requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.notEmpty(requests, "requests");
            return toHttpConnection(new com.facebook.GraphRequestBatch(requests));
        }

        @kotlin.jvm.JvmStatic
        public final java.net.HttpURLConnection toHttpConnection(com.facebook.GraphRequestBatch requests) {
            java.net.URL url;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            validateFieldsParamForGetRequests$facebook_core_release(requests);
            try {
                if (requests.size() == 1) {
                    url = new java.net.URL(requests.get(0).getUrlForSingleRequest());
                } else {
                    com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
                    url = new java.net.URL(com.facebook.internal.ServerProtocol.getGraphUrlBase());
                }
                java.net.HttpURLConnection httpURLConnection = null;
                try {
                    httpURLConnection = createConnection(url);
                    serializeToUrlConnection$facebook_core_release(requests, httpURLConnection);
                    return httpURLConnection;
                } catch (java.io.IOException e) {
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.disconnectQuietly(httpURLConnection);
                    throw new com.facebook.FacebookException("could not construct request body", e);
                } catch (org.json.JSONException e2) {
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.disconnectQuietly(httpURLConnection);
                    throw new com.facebook.FacebookException("could not construct request body", e2);
                }
            } catch (java.net.MalformedURLException e3) {
                throw new com.facebook.FacebookException("could not construct URL for request", e3);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphResponse executeAndWait(com.facebook.GraphRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            java.util.List<com.facebook.GraphResponse> executeBatchAndWait = executeBatchAndWait(request);
            if (executeBatchAndWait.size() != 1) {
                throw new com.facebook.FacebookException("invalid state: expected a single response");
            }
            return executeBatchAndWait.get(0);
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> executeBatchAndWait(com.facebook.GraphRequest... requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(kotlin.collections.ArraysKt.toList(requests));
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> executeBatchAndWait(java.util.Collection<com.facebook.GraphRequest> requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAndWait(new com.facebook.GraphRequestBatch(requests));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.net.URLConnection] */
        /* JADX WARN: Type inference failed for: r6v0, types: [com.facebook.GraphRequest$Companion] */
        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> executeBatchAndWait(com.facebook.GraphRequestBatch requests) {
            java.lang.Exception exc;
            ?? r1;
            java.util.List<com.facebook.GraphResponse> list;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.notEmptyAndContainsNoNulls(requests, "requests");
            java.net.URLConnection uRLConnection = null;
            try {
                try {
                    exc = null;
                    r1 = toHttpConnection(requests);
                } catch (java.lang.Exception e) {
                    exc = e;
                    r1 = 0;
                }
                try {
                    if (r1 != 0) {
                        list = executeConnectionAndWait(r1, requests);
                    } else {
                        java.util.List<com.facebook.GraphResponse> constructErrorResponses = com.facebook.GraphResponse.INSTANCE.constructErrorResponses(requests.getRequests(), null, new com.facebook.FacebookException(exc));
                        runCallbacks$facebook_core_release(requests, constructErrorResponses);
                        list = constructErrorResponses;
                    }
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    r1 = (java.net.URLConnection) r1;
                    com.facebook.internal.Utility.disconnectQuietly(r1);
                    return list;
                } catch (java.lang.Throwable th) {
                    th = th;
                    uRLConnection = r1;
                    com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.disconnectQuietly(uRLConnection);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                com.facebook.internal.Utility utility22 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.disconnectQuietly(uRLConnection);
                throw th;
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequestAsyncTask executeBatchAsync(com.facebook.GraphRequest... requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(kotlin.collections.ArraysKt.toList(requests));
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequestAsyncTask executeBatchAsync(java.util.Collection<com.facebook.GraphRequest> requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            return executeBatchAsync(new com.facebook.GraphRequestBatch(requests));
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequestAsyncTask executeBatchAsync(com.facebook.GraphRequestBatch requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.internal.Validate validate = com.facebook.internal.Validate.INSTANCE;
            com.facebook.internal.Validate.notEmptyAndContainsNoNulls(requests, "requests");
            com.facebook.GraphRequestAsyncTask graphRequestAsyncTask = new com.facebook.GraphRequestAsyncTask(requests);
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            graphRequestAsyncTask.executeOnExecutor(com.facebook.FacebookSdk.getExecutor(), new java.lang.Void[0]);
            return graphRequestAsyncTask;
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> executeConnectionAndWait(java.net.HttpURLConnection connection, java.util.Collection<com.facebook.GraphRequest> requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAndWait(connection, new com.facebook.GraphRequestBatch(requests));
        }

        @kotlin.jvm.JvmStatic
        public final java.util.List<com.facebook.GraphResponse> executeConnectionAndWait(java.net.HttpURLConnection connection, com.facebook.GraphRequestBatch requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            java.util.List<com.facebook.GraphResponse> fromHttpConnection$facebook_core_release = com.facebook.GraphResponse.INSTANCE.fromHttpConnection$facebook_core_release(connection, requests);
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.internal.Utility.disconnectQuietly(connection);
            int size = requests.size();
            if (size != fromHttpConnection$facebook_core_release.size()) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format(java.util.Locale.US, "Received %d responses while expecting %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(fromHttpConnection$facebook_core_release.size()), java.lang.Integer.valueOf(size)}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new com.facebook.FacebookException(format);
            }
            runCallbacks$facebook_core_release(requests, fromHttpConnection$facebook_core_release);
            com.facebook.AccessTokenManager.INSTANCE.getInstance().extendAccessTokenIfNeeded();
            return fromHttpConnection$facebook_core_release;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequestAsyncTask executeConnectionAsync(java.net.HttpURLConnection connection, com.facebook.GraphRequestBatch requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            return executeConnectionAsync(null, connection, requests);
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.GraphRequestAsyncTask executeConnectionAsync(android.os.Handler callbackHandler, java.net.HttpURLConnection connection, com.facebook.GraphRequestBatch requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            com.facebook.GraphRequestAsyncTask graphRequestAsyncTask = new com.facebook.GraphRequestAsyncTask(connection, requests);
            requests.setCallbackHandler(callbackHandler);
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            graphRequestAsyncTask.executeOnExecutor(com.facebook.FacebookSdk.getExecutor(), new java.lang.Void[0]);
            return graphRequestAsyncTask;
        }

        @kotlin.jvm.JvmStatic
        public final void runCallbacks$facebook_core_release(final com.facebook.GraphRequestBatch requests, java.util.List<com.facebook.GraphResponse> responses) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responses, "responses");
            int size = requests.size();
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            if (size > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    com.facebook.GraphRequest graphRequest = requests.get(i);
                    if (graphRequest.getCallback() != null) {
                        arrayList.add(new android.util.Pair(graphRequest.getCallback(), responses.get(i)));
                    }
                    if (i2 >= size) {
                        break;
                    } else {
                        i = i2;
                    }
                }
            }
            if (arrayList.size() > 0) {
                java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.facebook.GraphRequest$Companion$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.facebook.GraphRequest.Companion.m5071runCallbacks$lambda2(arrayList, requests);
                    }
                };
                android.os.Handler callbackHandler = requests.getCallbackHandler();
                if ((callbackHandler == null ? null : java.lang.Boolean.valueOf(callbackHandler.post(runnable))) == null) {
                    runnable.run();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: runCallbacks$lambda-2, reason: not valid java name */
        public static final void m5071runCallbacks$lambda2(java.util.ArrayList callbacks, com.facebook.GraphRequestBatch requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbacks, "$callbacks");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "$requests");
            java.util.Iterator it = callbacks.iterator();
            while (it.hasNext()) {
                android.util.Pair pair = (android.util.Pair) it.next();
                com.facebook.GraphRequest.Callback callback = (com.facebook.GraphRequest.Callback) pair.first;
                java.lang.Object obj = pair.second;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "pair.second");
                callback.onCompleted((com.facebook.GraphResponse) obj);
            }
            java.util.Iterator<com.facebook.GraphRequestBatch.Callback> it2 = requests.getCallbacks().iterator();
            while (it2.hasNext()) {
                it2.next().onBatchCompleted(requests);
            }
        }

        private final java.lang.String getDefaultPhotoPathIfNull(java.lang.String graphPath) {
            return graphPath == null ? com.facebook.GraphRequest.MY_PHOTOS : graphPath;
        }

        private final java.net.HttpURLConnection createConnection(java.net.URL url) throws java.io.IOException {
            java.net.URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) openConnection;
            httpURLConnection.setRequestProperty("User-Agent", getUserAgent());
            httpURLConnection.setRequestProperty("Accept-Language", java.util.Locale.getDefault().toString());
            httpURLConnection.setChunkedStreamingMode(0);
            return httpURLConnection;
        }

        private final boolean hasOnProgressCallbacks(com.facebook.GraphRequestBatch requests) {
            java.util.Iterator<com.facebook.GraphRequestBatch.Callback> it = requests.getCallbacks().iterator();
            while (it.hasNext()) {
                if (it.next() instanceof com.facebook.GraphRequestBatch.OnProgressCallback) {
                    return true;
                }
            }
            java.util.Iterator<com.facebook.GraphRequest> it2 = requests.iterator();
            while (it2.hasNext()) {
                if (it2.next().getCallback() instanceof com.facebook.GraphRequest.OnProgressCallback) {
                    return true;
                }
            }
            return false;
        }

        private final void setConnectionContentType(java.net.HttpURLConnection connection, boolean shouldUseGzip) {
            if (shouldUseGzip) {
                connection.setRequestProperty("Content-Type", androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_URL_ENCODED);
                connection.setRequestProperty("Content-Encoding", "gzip");
            } else {
                connection.setRequestProperty("Content-Type", getMimeContentType());
            }
        }

        private final boolean isGzipCompressible(com.facebook.GraphRequestBatch requests) {
            java.util.Iterator<com.facebook.GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                com.facebook.GraphRequest next = it.next();
                java.util.Iterator<java.lang.String> it2 = next.getParameters().keySet().iterator();
                while (it2.hasNext()) {
                    if (isSupportedAttachmentType(next.getParameters().get(it2.next()))) {
                        return false;
                    }
                }
            }
            return true;
        }

        @kotlin.jvm.JvmStatic
        public final void validateFieldsParamForGetRequests$facebook_core_release(com.facebook.GraphRequestBatch requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            java.util.Iterator<com.facebook.GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                com.facebook.GraphRequest next = it.next();
                if (com.facebook.HttpMethod.GET == next.getHttpMethod()) {
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    if (com.facebook.internal.Utility.isNullOrEmpty(next.getParameters().getString(com.facebook.GraphRequest.FIELDS_PARAM))) {
                        com.facebook.internal.Logger.Companion companion = com.facebook.internal.Logger.INSTANCE;
                        com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.DEVELOPER_ERRORS;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("GET requests for /");
                        java.lang.String graphPath = next.getGraphPath();
                        if (graphPath == null) {
                            graphPath = "";
                        }
                        sb.append(graphPath);
                        sb.append(" should contain an explicit \"fields\" parameter.");
                        companion.log(loggingBehavior, 5, "Request", sb.toString());
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void serializeToUrlConnection$facebook_core_release(com.facebook.GraphRequestBatch requests, java.net.HttpURLConnection connection) throws java.io.IOException, org.json.JSONException {
            com.facebook.ProgressOutputStream progressOutputStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connection, "connection");
            com.facebook.internal.Logger logger = new com.facebook.internal.Logger(com.facebook.LoggingBehavior.REQUESTS, "Request");
            int size = requests.size();
            boolean isGzipCompressible = isGzipCompressible(requests);
            java.io.OutputStream outputStream = null;
            com.facebook.HttpMethod httpMethod = size == 1 ? requests.get(0).getHttpMethod() : null;
            if (httpMethod == null) {
                httpMethod = com.facebook.HttpMethod.POST;
            }
            connection.setRequestMethod(httpMethod.name());
            setConnectionContentType(connection, isGzipCompressible);
            java.net.URL url = connection.getURL();
            logger.append("Request:\n");
            logger.appendKeyValue("Id", requests.getId());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(url, "url");
            logger.appendKeyValue("URL", url);
            java.lang.String requestMethod = connection.getRequestMethod();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestMethod, "connection.requestMethod");
            logger.appendKeyValue("Method", requestMethod);
            java.lang.String requestProperty = connection.getRequestProperty("User-Agent");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestProperty, "connection.getRequestProperty(\"User-Agent\")");
            logger.appendKeyValue("User-Agent", requestProperty);
            java.lang.String requestProperty2 = connection.getRequestProperty("Content-Type");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(requestProperty2, "connection.getRequestProperty(\"Content-Type\")");
            logger.appendKeyValue("Content-Type", requestProperty2);
            connection.setConnectTimeout(requests.getTimeoutInMilliseconds());
            connection.setReadTimeout(requests.getTimeoutInMilliseconds());
            if (httpMethod != com.facebook.HttpMethod.POST) {
                logger.log();
                return;
            }
            connection.setDoOutput(true);
            try {
                java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(connection.getOutputStream());
                if (isGzipCompressible) {
                    try {
                        outputStream = new java.util.zip.GZIPOutputStream(bufferedOutputStream);
                    } catch (java.lang.Throwable th) {
                        th = th;
                        outputStream = bufferedOutputStream;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        throw th;
                    }
                } else {
                    outputStream = bufferedOutputStream;
                }
                if (hasOnProgressCallbacks(requests)) {
                    com.facebook.ProgressNoopOutputStream progressNoopOutputStream = new com.facebook.ProgressNoopOutputStream(requests.getCallbackHandler());
                    processRequest(requests, null, size, url, progressNoopOutputStream, isGzipCompressible);
                    progressOutputStream = new com.facebook.ProgressOutputStream(outputStream, requests, progressNoopOutputStream.getProgressMap(), progressNoopOutputStream.getMaxProgress());
                } else {
                    progressOutputStream = outputStream;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
            try {
                processRequest(requests, logger, size, url, progressOutputStream, isGzipCompressible);
                progressOutputStream.close();
                logger.log();
            } catch (java.lang.Throwable th3) {
                th = th3;
                outputStream = progressOutputStream;
                if (outputStream != null) {
                }
                throw th;
            }
        }

        private final void processRequest(com.facebook.GraphRequestBatch requests, com.facebook.internal.Logger logger, int numRequests, java.net.URL url, java.io.OutputStream outputStream, boolean shouldUseGzip) {
            com.facebook.GraphRequest.Serializer serializer = new com.facebook.GraphRequest.Serializer(outputStream, logger, shouldUseGzip);
            if (numRequests == 1) {
                com.facebook.GraphRequest graphRequest = requests.get(0);
                java.util.HashMap hashMap = new java.util.HashMap();
                for (java.lang.String key : graphRequest.getParameters().keySet()) {
                    java.lang.Object obj = graphRequest.getParameters().get(key);
                    if (isSupportedAttachmentType(obj)) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                        hashMap.put(key, new com.facebook.GraphRequest.Attachment(graphRequest, obj));
                    }
                }
                if (logger != null) {
                    logger.append("  Parameters:\n");
                }
                serializeParameters(graphRequest.getParameters(), serializer, graphRequest);
                if (logger != null) {
                    logger.append("  Attachments:\n");
                }
                serializeAttachments(hashMap, serializer);
                org.json.JSONObject graphObject = graphRequest.getGraphObject();
                if (graphObject != null) {
                    java.lang.String path = url.getPath();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "url.path");
                    processGraphObject(graphObject, path, serializer);
                    return;
                }
                return;
            }
            java.lang.String batchAppId = getBatchAppId(requests);
            if (batchAppId.length() == 0) {
                throw new com.facebook.FacebookException("App ID was not specified at the request or Settings.");
            }
            serializer.writeString(com.facebook.GraphRequest.BATCH_APP_ID_PARAM, batchAppId);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            serializeRequestsAsJSON(serializer, requests, hashMap2);
            if (logger != null) {
                logger.append("  Attachments:\n");
            }
            serializeAttachments(hashMap2, serializer);
        }

        private final boolean isMeRequest(java.lang.String path) {
            java.util.regex.Matcher matcher = com.facebook.GraphRequest.versionPattern.matcher(path);
            if (matcher.matches()) {
                path = matcher.group(1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(path, "matcher.group(1)");
            }
            return kotlin.text.StringsKt.startsWith$default(path, "me/", false, 2, (java.lang.Object) null) || kotlin.text.StringsKt.startsWith$default(path, "/me/", false, 2, (java.lang.Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void processGraphObject(org.json.JSONObject graphObject, java.lang.String path, com.facebook.GraphRequest.KeyValueSerializer serializer) {
            boolean z;
            java.util.Iterator<java.lang.String> keys;
            if (isMeRequest(path)) {
                java.lang.String str = path;
                int indexOf$default = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, ":", 0, false, 6, (java.lang.Object) null);
                int indexOf$default2 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) str, "?", 0, false, 6, (java.lang.Object) null);
                if (indexOf$default > 3 && (indexOf$default2 == -1 || indexOf$default < indexOf$default2)) {
                    z = true;
                    keys = graphObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String key = keys.next();
                        java.lang.Object value = graphObject.opt(key);
                        boolean z2 = z && kotlin.text.StringsKt.equals(key, "image", true);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
                        processGraphObjectProperty(key, value, serializer, z2);
                    }
                }
            }
            z = false;
            keys = graphObject.keys();
            while (keys.hasNext()) {
            }
        }

        private final void processGraphObjectProperty(java.lang.String key, java.lang.Object value, com.facebook.GraphRequest.KeyValueSerializer serializer, boolean passByValue) {
            java.lang.Class<?> cls = value.getClass();
            if (org.json.JSONObject.class.isAssignableFrom(cls)) {
                org.json.JSONObject jSONObject = (org.json.JSONObject) value;
                if (passByValue) {
                    java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String format = java.lang.String.format("%s[%s]", java.util.Arrays.copyOf(new java.lang.Object[]{key, next}, 2));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        java.lang.Object opt = jSONObject.opt(next);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(opt, "jsonObject.opt(propertyName)");
                        processGraphObjectProperty(format, opt, serializer, passByValue);
                    }
                    return;
                }
                if (jSONObject.has("id")) {
                    java.lang.String optString = jSONObject.optString("id");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(\"id\")");
                    processGraphObjectProperty(key, optString, serializer, passByValue);
                    return;
                } else if (jSONObject.has("url")) {
                    java.lang.String optString2 = jSONObject.optString("url");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "jsonObject.optString(\"url\")");
                    processGraphObjectProperty(key, optString2, serializer, passByValue);
                    return;
                } else {
                    if (jSONObject.has(com.facebook.internal.NativeProtocol.OPEN_GRAPH_CREATE_OBJECT_KEY)) {
                        java.lang.String jSONObject2 = jSONObject.toString();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "jsonObject.toString()");
                        processGraphObjectProperty(key, jSONObject2, serializer, passByValue);
                        return;
                    }
                    return;
                }
            }
            if (org.json.JSONArray.class.isAssignableFrom(cls)) {
                org.json.JSONArray jSONArray = (org.json.JSONArray) value;
                int length = jSONArray.length();
                if (length <= 0) {
                    return;
                }
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format2 = java.lang.String.format(java.util.Locale.ROOT, "%s[%d]", java.util.Arrays.copyOf(new java.lang.Object[]{key, java.lang.Integer.valueOf(i)}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    java.lang.Object opt2 = jSONArray.opt(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(opt2, "jsonArray.opt(i)");
                    processGraphObjectProperty(format2, opt2, serializer, passByValue);
                    if (i2 >= length) {
                        return;
                    } else {
                        i = i2;
                    }
                }
            } else {
                if (java.lang.String.class.isAssignableFrom(cls) || java.lang.Number.class.isAssignableFrom(cls) || java.lang.Boolean.class.isAssignableFrom(cls)) {
                    serializer.writeString(key, value.toString());
                    return;
                }
                if (java.util.Date.class.isAssignableFrom(cls)) {
                    java.lang.String format3 = new java.text.SimpleDateFormat(com.facebook.GraphRequest.ISO_8601_FORMAT_STRING, java.util.Locale.US).format((java.util.Date) value);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "iso8601DateFormat.format(date)");
                    serializer.writeString(key, format3);
                } else {
                    com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                    com.facebook.internal.Utility.logd(com.facebook.GraphRequest.TAG, "The type of property " + key + " in the graph object is unknown. It won't be sent in the request.");
                }
            }
        }

        private final void serializeParameters(android.os.Bundle bundle, com.facebook.GraphRequest.Serializer serializer, com.facebook.GraphRequest request) {
            for (java.lang.String key : bundle.keySet()) {
                java.lang.Object obj = bundle.get(key);
                if (isSupportedParameterType(obj)) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                    serializer.writeObject(key, obj, request);
                }
            }
        }

        private final void serializeRequestsAsJSON(com.facebook.GraphRequest.Serializer serializer, java.util.Collection<com.facebook.GraphRequest> requests, java.util.Map<java.lang.String, com.facebook.GraphRequest.Attachment> attachments) {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator<com.facebook.GraphRequest> it = requests.iterator();
            while (it.hasNext()) {
                it.next().serializeToBatch(jSONArray, attachments);
            }
            serializer.writeRequestsAsJson(com.facebook.GraphRequest.BATCH_PARAM, jSONArray, requests);
        }

        private final java.lang.String getMimeContentType() {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("multipart/form-data; boundary=%s", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.GraphRequest.MIME_BOUNDARY}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            return format;
        }

        private final java.lang.String getUserAgent() {
            if (com.facebook.GraphRequest.userAgent == null) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format("%s.%s", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.GraphRequest.USER_AGENT_BASE, com.facebook.FacebookSdkVersion.BUILD}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                com.facebook.GraphRequest.userAgent = format;
                com.facebook.internal.InternalSettings internalSettings = com.facebook.internal.InternalSettings.INSTANCE;
                java.lang.String customUserAgent = com.facebook.internal.InternalSettings.getCustomUserAgent();
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                if (!com.facebook.internal.Utility.isNullOrEmpty(customUserAgent)) {
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format2 = java.lang.String.format(java.util.Locale.ROOT, "%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{com.facebook.GraphRequest.userAgent, customUserAgent}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    com.facebook.GraphRequest.userAgent = format2;
                }
            }
            return com.facebook.GraphRequest.userAgent;
        }

        private final java.lang.String getBatchAppId(com.facebook.GraphRequestBatch batch) {
            java.lang.String batchApplicationId = batch.getBatchApplicationId();
            if (batchApplicationId != null && (!batch.isEmpty())) {
                return batchApplicationId;
            }
            java.util.Iterator<com.facebook.GraphRequest> it = batch.iterator();
            while (it.hasNext()) {
                com.facebook.AccessToken accessToken = it.next().getAccessToken();
                if (accessToken != null) {
                    return accessToken.getApplicationId();
                }
            }
            java.lang.String str = com.facebook.GraphRequest.defaultBatchApplicationId;
            if (str != null && str.length() > 0) {
                return str;
            }
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            return com.facebook.FacebookSdk.getApplicationId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedAttachmentType(java.lang.Object value) {
            return (value instanceof android.graphics.Bitmap) || (value instanceof byte[]) || (value instanceof android.net.Uri) || (value instanceof android.os.ParcelFileDescriptor) || (value instanceof com.facebook.GraphRequest.ParcelableResourceWithMimeType);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isSupportedParameterType(java.lang.Object value) {
            return (value instanceof java.lang.String) || (value instanceof java.lang.Boolean) || (value instanceof java.lang.Number) || (value instanceof java.util.Date);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String parameterToString(java.lang.Object value) {
            if (value instanceof java.lang.String) {
                return (java.lang.String) value;
            }
            if ((value instanceof java.lang.Boolean) || (value instanceof java.lang.Number)) {
                return value.toString();
            }
            if (value instanceof java.util.Date) {
                java.lang.String format = new java.text.SimpleDateFormat(com.facebook.GraphRequest.ISO_8601_FORMAT_STRING, java.util.Locale.US).format((java.util.Date) value);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "iso8601DateFormat.format(value)");
                return format;
            }
            throw new java.lang.IllegalArgumentException("Unsupported parameter type.");
        }

        private final void serializeAttachments(java.util.Map<java.lang.String, com.facebook.GraphRequest.Attachment> attachments, com.facebook.GraphRequest.Serializer serializer) {
            for (java.util.Map.Entry<java.lang.String, com.facebook.GraphRequest.Attachment> entry : attachments.entrySet()) {
                if (com.facebook.GraphRequest.INSTANCE.isSupportedAttachmentType(entry.getValue().getValue())) {
                    serializer.writeObject(entry.getKey(), entry.getValue().getValue(), entry.getValue().getRequest());
                }
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "(this as java.lang.String).toCharArray()");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.security.SecureRandom secureRandom = new java.security.SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i = 0;
            do {
                i++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i < nextInt);
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "buffer.toString()");
        MIME_BOUNDARY = sb2;
        versionPattern = java.util.regex.Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public /* synthetic */ GraphRequest(com.facebook.AccessToken accessToken, java.lang.String str, android.os.Bundle bundle, com.facebook.HttpMethod httpMethod, com.facebook.GraphRequest.Callback callback, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : accessToken, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? null : httpMethod, (i & 16) != 0 ? null : callback, (i & 32) != 0 ? null : str2);
    }

    public GraphRequest(com.facebook.AccessToken accessToken, java.lang.String str, android.os.Bundle bundle, com.facebook.HttpMethod httpMethod, com.facebook.GraphRequest.Callback callback, java.lang.String str2) {
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.graphPath = str;
        this.version = str2;
        setCallback(callback);
        setHttpMethod(httpMethod);
        if (bundle != null) {
            this.parameters = new android.os.Bundle(bundle);
        } else {
            this.parameters = new android.os.Bundle();
        }
        if (this.version == null) {
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            this.version = com.facebook.FacebookSdk.getGraphApiVersion();
        }
    }

    public GraphRequest(com.facebook.AccessToken accessToken, java.net.URL overriddenURL) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(overriddenURL, "overriddenURL");
        this.batchEntryOmitResultOnSuccess = true;
        this.accessToken = accessToken;
        this.overriddenURL = overriddenURL.toString();
        setHttpMethod(com.facebook.HttpMethod.GET);
        this.parameters = new android.os.Bundle();
    }

    public final void setForceApplicationRequest(boolean forceOverride) {
        this.forceApplicationRequest = forceOverride;
    }

    public final com.facebook.GraphResponse executeAndWait() {
        return INSTANCE.executeAndWait(this);
    }

    public final com.facebook.GraphRequestAsyncTask executeAsync() {
        return INSTANCE.executeBatchAsync(this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{Request:  accessToken: ");
        java.lang.Object obj = this.accessToken;
        if (obj == null) {
            obj = kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL;
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.graphPath);
        sb.append(", graphObject: ");
        sb.append(this.graphObject);
        sb.append(", httpMethod: ");
        sb.append(this.httpMethod);
        sb.append(", parameters: ");
        sb.append(this.parameters);
        sb.append("}");
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    private final void addCommonParameters() {
        android.os.Bundle bundle = this.parameters;
        if (shouldForceClientTokenForRequest()) {
            bundle.putString("access_token", getClientTokenForRequest());
        } else {
            java.lang.String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
            if (accessTokenToUseForRequest != null) {
                bundle.putString("access_token", accessTokenToUseForRequest);
            }
        }
        if (!bundle.containsKey("access_token")) {
            com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            if (com.facebook.internal.Utility.isNullOrEmpty(com.facebook.FacebookSdk.getClientToken())) {
                android.util.Log.w(TAG, "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change.");
            }
        }
        bundle.putString("sdk", "android");
        bundle.putString(FORMAT_PARAM, FORMAT_JSON);
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.isLoggingBehaviorEnabled(com.facebook.LoggingBehavior.GRAPH_API_DEBUG_INFO)) {
            bundle.putString("debug", DEBUG_SEVERITY_INFO);
            return;
        }
        com.facebook.FacebookSdk facebookSdk3 = com.facebook.FacebookSdk.INSTANCE;
        if (com.facebook.FacebookSdk.isLoggingBehaviorEnabled(com.facebook.LoggingBehavior.GRAPH_API_DEBUG_WARNING)) {
            bundle.putString("debug", DEBUG_SEVERITY_WARNING);
        }
    }

    private final java.lang.String getAccessTokenToUseForRequest() {
        com.facebook.AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            if (!this.parameters.containsKey("access_token")) {
                java.lang.String token = accessToken.getToken();
                com.facebook.internal.Logger.INSTANCE.registerAccessToken(token);
                return token;
            }
        } else if (!this.parameters.containsKey("access_token")) {
            return getClientTokenForRequest();
        }
        return this.parameters.getString("access_token");
    }

    private final java.lang.String getClientTokenForRequest() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String applicationId = com.facebook.FacebookSdk.getApplicationId();
        com.facebook.FacebookSdk facebookSdk2 = com.facebook.FacebookSdk.INSTANCE;
        java.lang.String clientToken = com.facebook.FacebookSdk.getClientToken();
        if (applicationId.length() > 0 && clientToken.length() > 0) {
            return applicationId + '|' + clientToken;
        }
        com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
        com.facebook.internal.Utility.logd(TAG, "Warning: Request without access token missing application ID or client token.");
        return null;
    }

    private final java.lang.String appendParametersToBaseUrl(java.lang.String baseUrl, boolean isBatch) {
        if (!isBatch && this.httpMethod == com.facebook.HttpMethod.POST) {
            return baseUrl;
        }
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(baseUrl).buildUpon();
        for (java.lang.String str : this.parameters.keySet()) {
            java.lang.Object obj = this.parameters.get(str);
            if (obj == null) {
                obj = "";
            }
            com.facebook.GraphRequest.Companion companion = INSTANCE;
            if (!companion.isSupportedParameterType(obj)) {
                if (this.httpMethod != com.facebook.HttpMethod.GET) {
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format = java.lang.String.format(java.util.Locale.US, "Unsupported parameter type for GET request: %s", java.util.Arrays.copyOf(new java.lang.Object[]{obj.getClass().getSimpleName()}, 1));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                    throw new java.lang.IllegalArgumentException(format);
                }
            } else {
                buildUpon.appendQueryParameter(str, companion.parameterToString(obj).toString());
            }
        }
        java.lang.String builder = buildUpon.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    public final java.lang.String getRelativeUrlForBatchedRequest() {
        if (this.overriddenURL != null) {
            throw new com.facebook.FacebookException("Can't override URL for a batch request");
        }
        com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
        java.lang.String urlWithGraphPath = getUrlWithGraphPath(com.facebook.internal.ServerProtocol.getGraphUrlBase());
        addCommonParameters();
        android.net.Uri parse = android.net.Uri.parse(appendParametersToBaseUrl(urlWithGraphPath, true));
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%s?%s", java.util.Arrays.copyOf(new java.lang.Object[]{parse.getPath(), parse.getQuery()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    public final java.lang.String getUrlForSingleRequest() {
        java.lang.String graphUrlBaseForSubdomain;
        java.lang.String str = this.overriddenURL;
        if (str != null) {
            return java.lang.String.valueOf(str);
        }
        java.lang.String str2 = this.graphPath;
        if (this.httpMethod == com.facebook.HttpMethod.POST && str2 != null && kotlin.text.StringsKt.endsWith$default(str2, VIDEOS_SUFFIX, false, 2, (java.lang.Object) null)) {
            com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
            graphUrlBaseForSubdomain = com.facebook.internal.ServerProtocol.getGraphVideoUrlBase();
        } else {
            com.facebook.internal.ServerProtocol serverProtocol2 = com.facebook.internal.ServerProtocol.INSTANCE;
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            graphUrlBaseForSubdomain = com.facebook.internal.ServerProtocol.getGraphUrlBaseForSubdomain(com.facebook.FacebookSdk.getGraphDomain());
        }
        java.lang.String urlWithGraphPath = getUrlWithGraphPath(graphUrlBaseForSubdomain);
        addCommonParameters();
        return appendParametersToBaseUrl(urlWithGraphPath, false);
    }

    private final java.lang.String getGraphPathWithVersion() {
        if (versionPattern.matcher(this.graphPath).matches()) {
            return this.graphPath;
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{this.version, this.graphPath}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final java.lang.String getUrlWithGraphPath(java.lang.String baseUrl) {
        if (!isValidGraphRequestForDomain()) {
            com.facebook.internal.ServerProtocol serverProtocol = com.facebook.internal.ServerProtocol.INSTANCE;
            baseUrl = com.facebook.internal.ServerProtocol.getFacebookGraphUrlBase();
        }
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("%s/%s", java.util.Arrays.copyOf(new java.lang.Object[]{baseUrl, getGraphPathWithVersion()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final boolean shouldForceClientTokenForRequest() {
        java.lang.String accessTokenToUseForRequest = getAccessTokenToUseForRequest();
        boolean contains$default = accessTokenToUseForRequest == null ? false : kotlin.text.StringsKt.contains$default((java.lang.CharSequence) accessTokenToUseForRequest, (java.lang.CharSequence) "|", false, 2, (java.lang.Object) null);
        if (accessTokenToUseForRequest == null || !kotlin.text.StringsKt.startsWith$default(accessTokenToUseForRequest, "IG", false, 2, (java.lang.Object) null) || contains$default || !isApplicationRequest()) {
            return (isValidGraphRequestForDomain() || contains$default) ? false : true;
        }
        return true;
    }

    private final boolean isValidGraphRequestForDomain() {
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        if (kotlin.jvm.internal.Intrinsics.areEqual(com.facebook.FacebookSdk.getGraphDomain(), com.facebook.FacebookSdk.INSTAGRAM_COM)) {
            return !isApplicationRequest();
        }
        return true;
    }

    private final boolean isApplicationRequest() {
        if (this.graphPath == null) {
            return false;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("^/?");
        com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
        sb.append(com.facebook.FacebookSdk.getApplicationId());
        sb.append("/?.*");
        return this.forceApplicationRequest || java.util.regex.Pattern.matches(sb.toString(), this.graphPath) || java.util.regex.Pattern.matches("^/?app/?.*", this.graphPath);
    }

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/facebook/GraphRequest$Attachment;", "", "request", "Lcom/facebook/GraphRequest;", "value", "(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V", "getRequest", "()Lcom/facebook/GraphRequest;", "getValue", "()Ljava/lang/Object;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class Attachment {
        private final com.facebook.GraphRequest request;
        private final java.lang.Object value;

        public Attachment(com.facebook.GraphRequest request, java.lang.Object obj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "request");
            this.request = request;
            this.value = obj;
        }

        public final com.facebook.GraphRequest getRequest() {
            return this.request;
        }

        public final java.lang.Object getValue() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void serializeToBatch(org.json.JSONArray batch, java.util.Map<java.lang.String, com.facebook.GraphRequest.Attachment> attachments) throws org.json.JSONException, java.io.IOException {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str = this.batchEntryName;
        if (str != null) {
            jSONObject.put("name", str);
            jSONObject.put(BATCH_ENTRY_OMIT_RESPONSE_ON_SUCCESS_PARAM, this.batchEntryOmitResultOnSuccess);
        }
        java.lang.String str2 = this.batchEntryDependsOn;
        if (str2 != null) {
            jSONObject.put(BATCH_ENTRY_DEPENDS_ON_PARAM, str2);
        }
        java.lang.String relativeUrlForBatchedRequest = getRelativeUrlForBatchedRequest();
        jSONObject.put(BATCH_RELATIVE_URL_PARAM, relativeUrlForBatchedRequest);
        jSONObject.put("method", this.httpMethod);
        com.facebook.AccessToken accessToken = this.accessToken;
        if (accessToken != null) {
            com.facebook.internal.Logger.INSTANCE.registerAccessToken(accessToken.getToken());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = this.parameters.keySet().iterator();
        while (it.hasNext()) {
            java.lang.Object obj = this.parameters.get(it.next());
            if (INSTANCE.isSupportedAttachmentType(obj)) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "%s%d", java.util.Arrays.copyOf(new java.lang.Object[]{"file", java.lang.Integer.valueOf(attachments.size())}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                arrayList.add(format);
                attachments.put(format, new com.facebook.GraphRequest.Attachment(this, obj));
            }
        }
        if (!arrayList.isEmpty()) {
            jSONObject.put(ATTACHED_FILES_PARAM, android.text.TextUtils.join(",", arrayList));
        }
        org.json.JSONObject jSONObject2 = this.graphObject;
        if (jSONObject2 != null) {
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            INSTANCE.processGraphObject(jSONObject2, relativeUrlForBatchedRequest, new com.facebook.GraphRequest.KeyValueSerializer() { // from class: com.facebook.GraphRequest$serializeToBatch$1
                @Override // com.facebook.GraphRequest.KeyValueSerializer
                public void writeString(java.lang.String key, java.lang.String value) throws java.io.IOException {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
                    java.util.ArrayList<java.lang.String> arrayList3 = arrayList2;
                    kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                    java.lang.String format2 = java.lang.String.format(java.util.Locale.US, "%s=%s", java.util.Arrays.copyOf(new java.lang.Object[]{key, java.net.URLEncoder.encode(value, "UTF-8")}, 2));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
                    arrayList3.add(format2);
                }
            });
            jSONObject.put("body", android.text.TextUtils.join(com.ironsource.X3.j.c, arrayList2));
        }
        batch.put(jSONObject);
    }

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ+\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001dJ$\u0010\u001e\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010 \u001a\u0004\u0018\u00010\u00122\b\u0010!\u001a\u0004\u0018\u00010\u0012J \u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0012J \u0010&\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010'\u001a\u00020(2\b\u0010%\u001a\u0004\u0018\u00010\u0012J+\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00150\u0014\"\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\"\u0010*\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010-J\u0006\u0010.\u001a\u00020\u0010J$\u0010/\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00100\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020-03J\u0018\u00104\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\u00060\u000bj\u0002`\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lcom/facebook/GraphRequest$Serializer;", "Lcom/facebook/GraphRequest$KeyValueSerializer;", "outputStream", "Ljava/io/OutputStream;", "logger", "Lcom/facebook/internal/Logger;", "useUrlEncode", "", "(Ljava/io/OutputStream;Lcom/facebook/internal/Logger;Z)V", "firstWrite", "invalidTypeError", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "getInvalidTypeError", "()Ljava/lang/RuntimeException;", "write", "", com.facebook.GraphRequest.FORMAT_PARAM, "", "args", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "writeBitmap", com.ironsource.X3.i.W, "bitmap", "Landroid/graphics/Bitmap;", "writeBytes", "bytes", "", "writeContentDisposition", "name", io.ktor.http.ContentDisposition.Parameters.FileName, com.helpshift.HelpshiftEvent.DATA_CONTENT_TYPE, "writeContentUri", "contentUri", "Landroid/net/Uri;", "mimeType", "writeFile", "descriptor", "Landroid/os/ParcelFileDescriptor;", "writeLine", "writeObject", "value", "request", "Lcom/facebook/GraphRequest;", "writeRecordBoundary", "writeRequestsAsJson", "requestJsonArray", "Lorg/json/JSONArray;", "requests", "", "writeString", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    private static final class Serializer implements com.facebook.GraphRequest.KeyValueSerializer {
        private boolean firstWrite;
        private final com.facebook.internal.Logger logger;
        private final java.io.OutputStream outputStream;
        private final boolean useUrlEncode;

        public Serializer(java.io.OutputStream outputStream, com.facebook.internal.Logger logger, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputStream, "outputStream");
            this.outputStream = outputStream;
            this.logger = logger;
            this.firstWrite = true;
            this.useUrlEncode = z;
        }

        public final void writeObject(java.lang.String key, java.lang.Object value, com.facebook.GraphRequest request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            java.io.Closeable closeable = this.outputStream;
            if (closeable instanceof com.facebook.RequestOutputStream) {
                ((com.facebook.RequestOutputStream) closeable).setCurrentRequest(request);
            }
            if (com.facebook.GraphRequest.INSTANCE.isSupportedParameterType(value)) {
                writeString(key, com.facebook.GraphRequest.INSTANCE.parameterToString(value));
                return;
            }
            if (value instanceof android.graphics.Bitmap) {
                writeBitmap(key, (android.graphics.Bitmap) value);
                return;
            }
            if (value instanceof byte[]) {
                writeBytes(key, (byte[]) value);
                return;
            }
            if (value instanceof android.net.Uri) {
                writeContentUri(key, (android.net.Uri) value, null);
                return;
            }
            if (value instanceof android.os.ParcelFileDescriptor) {
                writeFile(key, (android.os.ParcelFileDescriptor) value, null);
                return;
            }
            if (value instanceof com.facebook.GraphRequest.ParcelableResourceWithMimeType) {
                com.facebook.GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = (com.facebook.GraphRequest.ParcelableResourceWithMimeType) value;
                android.os.Parcelable resource = parcelableResourceWithMimeType.getResource();
                java.lang.String mimeType = parcelableResourceWithMimeType.getMimeType();
                if (resource instanceof android.os.ParcelFileDescriptor) {
                    writeFile(key, (android.os.ParcelFileDescriptor) resource, mimeType);
                    return;
                } else {
                    if (resource instanceof android.net.Uri) {
                        writeContentUri(key, (android.net.Uri) resource, mimeType);
                        return;
                    }
                    throw getInvalidTypeError();
                }
            }
            throw getInvalidTypeError();
        }

        private final java.lang.RuntimeException getInvalidTypeError() {
            return new java.lang.IllegalArgumentException("value is not a supported type.");
        }

        public final void writeRequestsAsJson(java.lang.String key, org.json.JSONArray requestJsonArray, java.util.Collection<com.facebook.GraphRequest> requests) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestJsonArray, "requestJsonArray");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requests, "requests");
            java.io.Closeable closeable = this.outputStream;
            if (!(closeable instanceof com.facebook.RequestOutputStream)) {
                java.lang.String jSONArray = requestJsonArray.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray, "requestJsonArray.toString()");
                writeString(key, jSONArray);
                return;
            }
            com.facebook.RequestOutputStream requestOutputStream = (com.facebook.RequestOutputStream) closeable;
            writeContentDisposition(key, null, null);
            write(com.ironsource.X3.j.d, new java.lang.Object[0]);
            int i = 0;
            for (com.facebook.GraphRequest graphRequest : requests) {
                int i2 = i + 1;
                org.json.JSONObject jSONObject = requestJsonArray.getJSONObject(i);
                requestOutputStream.setCurrentRequest(graphRequest);
                if (i > 0) {
                    write(",%s", jSONObject.toString());
                } else {
                    write("%s", jSONObject.toString());
                }
                i = i2;
            }
            write(com.ironsource.X3.j.e, new java.lang.Object[0]);
            com.facebook.internal.Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus("    ", key);
            java.lang.String jSONArray2 = requestJsonArray.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONArray2, "requestJsonArray.toString()");
            logger.appendKeyValue(stringPlus, jSONArray2);
        }

        @Override // com.facebook.GraphRequest.KeyValueSerializer
        public void writeString(java.lang.String key, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            writeContentDisposition(key, null, null);
            writeLine("%s", value);
            writeRecordBoundary();
            com.facebook.internal.Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            logger.appendKeyValue(kotlin.jvm.internal.Intrinsics.stringPlus("    ", key), value);
        }

        public final void writeBitmap(java.lang.String key, android.graphics.Bitmap bitmap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            writeContentDisposition(key, key, androidx.media3.common.MimeTypes.IMAGE_PNG);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, this.outputStream);
            writeLine("", new java.lang.Object[0]);
            writeRecordBoundary();
            com.facebook.internal.Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            logger.appendKeyValue(kotlin.jvm.internal.Intrinsics.stringPlus("    ", key), "<Image>");
        }

        public final void writeBytes(java.lang.String key, byte[] bytes) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
            writeContentDisposition(key, key, "content/unknown");
            this.outputStream.write(bytes);
            writeLine("", new java.lang.Object[0]);
            writeRecordBoundary();
            com.facebook.internal.Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus("    ", key);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "<Data: %d>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(bytes.length)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeContentUri(java.lang.String key, android.net.Uri contentUri, java.lang.String mimeType) {
            int copyAndCloseInputStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            writeContentDisposition(key, key, mimeType);
            if (this.outputStream instanceof com.facebook.ProgressNoopOutputStream) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                ((com.facebook.ProgressNoopOutputStream) this.outputStream).addProgress(com.facebook.internal.Utility.getContentSize(contentUri));
                copyAndCloseInputStream = 0;
            } else {
                com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
                java.io.InputStream openInputStream = com.facebook.FacebookSdk.getApplicationContext().getContentResolver().openInputStream(contentUri);
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                copyAndCloseInputStream = com.facebook.internal.Utility.copyAndCloseInputStream(openInputStream, this.outputStream);
            }
            writeLine("", new java.lang.Object[0]);
            writeRecordBoundary();
            com.facebook.internal.Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus("    ", key);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "<Data: %d>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(copyAndCloseInputStream)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeFile(java.lang.String key, android.os.ParcelFileDescriptor descriptor, java.lang.String mimeType) {
            int copyAndCloseInputStream;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            if (mimeType == null) {
                mimeType = "content/unknown";
            }
            writeContentDisposition(key, key, mimeType);
            java.io.OutputStream outputStream = this.outputStream;
            if (outputStream instanceof com.facebook.ProgressNoopOutputStream) {
                ((com.facebook.ProgressNoopOutputStream) outputStream).addProgress(descriptor.getStatSize());
                copyAndCloseInputStream = 0;
            } else {
                android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(descriptor);
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                copyAndCloseInputStream = com.facebook.internal.Utility.copyAndCloseInputStream(autoCloseInputStream, this.outputStream);
            }
            writeLine("", new java.lang.Object[0]);
            writeRecordBoundary();
            com.facebook.internal.Logger logger = this.logger;
            if (logger == null) {
                return;
            }
            java.lang.String stringPlus = kotlin.jvm.internal.Intrinsics.stringPlus("    ", key);
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format(java.util.Locale.ROOT, "<Data: %d>", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(copyAndCloseInputStream)}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
            logger.appendKeyValue(stringPlus, format);
        }

        public final void writeRecordBoundary() {
            if (!this.useUrlEncode) {
                writeLine("--%s", com.facebook.GraphRequest.MIME_BOUNDARY);
                return;
            }
            java.io.OutputStream outputStream = this.outputStream;
            byte[] bytes = com.ironsource.X3.j.c.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void writeContentDisposition(java.lang.String name, java.lang.String filename, java.lang.String contentType) {
            if (!this.useUrlEncode) {
                write("Content-Disposition: form-data; name=\"%s\"", name);
                if (filename != null) {
                    write("; filename=\"%s\"", filename);
                }
                writeLine("", new java.lang.Object[0]);
                if (contentType != null) {
                    writeLine("%s: %s", "Content-Type", contentType);
                }
                writeLine("", new java.lang.Object[0]);
                return;
            }
            java.io.OutputStream outputStream = this.outputStream;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format = java.lang.String.format("%s=", java.util.Arrays.copyOf(new java.lang.Object[]{name}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
            java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
            if (format == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            byte[] bytes = format.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
        }

        public final void write(java.lang.String format, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            if (!this.useUrlEncode) {
                if (this.firstWrite) {
                    java.io.OutputStream outputStream = this.outputStream;
                    byte[] bytes = "--".getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    java.io.OutputStream outputStream2 = this.outputStream;
                    java.lang.String str = com.facebook.GraphRequest.MIME_BOUNDARY;
                    java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
                    if (str == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    byte[] bytes2 = str.getBytes(charset);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "(this as java.lang.String).getBytes(charset)");
                    outputStream2.write(bytes2);
                    java.io.OutputStream outputStream3 = this.outputStream;
                    byte[] bytes3 = io.ktor.sse.ServerSentEventKt.END_OF_LINE.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "(this as java.lang.String).getBytes(charset)");
                    outputStream3.write(bytes3);
                    this.firstWrite = false;
                }
                java.io.OutputStream outputStream4 = this.outputStream;
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.Object[] copyOf = java.util.Arrays.copyOf(args, args.length);
                java.lang.String format2 = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(format, *args)");
                java.nio.charset.Charset charset2 = kotlin.text.Charsets.UTF_8;
                if (format2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes4 = format2.getBytes(charset2);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes4, "(this as java.lang.String).getBytes(charset)");
                outputStream4.write(bytes4);
                return;
            }
            java.io.OutputStream outputStream5 = this.outputStream;
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.util.Locale locale = java.util.Locale.US;
            java.lang.Object[] copyOf2 = java.util.Arrays.copyOf(args, args.length);
            java.lang.String format3 = java.lang.String.format(locale, format, java.util.Arrays.copyOf(copyOf2, copyOf2.length));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format3, "java.lang.String.format(locale, format, *args)");
            java.lang.String encode = java.net.URLEncoder.encode(format3, "UTF-8");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encode, "encode(String.format(Locale.US, format, *args), \"UTF-8\")");
            byte[] bytes5 = encode.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes5, "(this as java.lang.String).getBytes(charset)");
            outputStream5.write(bytes5);
        }

        public final void writeLine(java.lang.String format, java.lang.Object... args) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
            write(format, java.util.Arrays.copyOf(args, args.length));
            if (this.useUrlEncode) {
                return;
            }
            write(io.ktor.sse.ServerSentEventKt.END_OF_LINE, new java.lang.Object[0]);
        }
    }

    /* compiled from: GraphRequest.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u0015*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u00022\u00020\u0002:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0012\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0010H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;", "RESOURCE", "Landroid/os/Parcelable;", "resource", "mimeType", "", "(Landroid/os/Parcelable;Ljava/lang/String;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getMimeType", "()Ljava/lang/String;", "getResource", "()Landroid/os/Parcelable;", "Landroid/os/Parcelable;", "describeContents", "", "writeToParcel", "", "out", "flags", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class ParcelableResourceWithMimeType<RESOURCE extends android.os.Parcelable> implements android.os.Parcelable {
        private final java.lang.String mimeType;
        private final RESOURCE resource;
        public static final android.os.Parcelable.Creator<com.facebook.GraphRequest.ParcelableResourceWithMimeType<?>> CREATOR = new android.os.Parcelable.Creator<com.facebook.GraphRequest.ParcelableResourceWithMimeType<?>>() { // from class: com.facebook.GraphRequest$ParcelableResourceWithMimeType$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.GraphRequest.ParcelableResourceWithMimeType<?> createFromParcel(android.os.Parcel source) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "source");
                return new com.facebook.GraphRequest.ParcelableResourceWithMimeType<>(source, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public com.facebook.GraphRequest.ParcelableResourceWithMimeType<?>[] newArray(int size) {
                return new com.facebook.GraphRequest.ParcelableResourceWithMimeType[size];
            }
        };

        public /* synthetic */ ParcelableResourceWithMimeType(android.os.Parcel parcel, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public final java.lang.String getMimeType() {
            return this.mimeType;
        }

        public final RESOURCE getResource() {
            return this.resource;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel out, int flags) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.mimeType);
            out.writeParcelable(this.resource, flags);
        }

        public ParcelableResourceWithMimeType(RESOURCE resource, java.lang.String str) {
            this.mimeType = str;
            this.resource = resource;
        }

        private ParcelableResourceWithMimeType(android.os.Parcel parcel) {
            this.mimeType = parcel.readString();
            com.facebook.FacebookSdk facebookSdk = com.facebook.FacebookSdk.INSTANCE;
            this.resource = (RESOURCE) parcel.readParcelable(com.facebook.FacebookSdk.getApplicationContext().getClassLoader());
        }
    }
}
