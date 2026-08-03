package com.google.firebase.installations.remote;

/* loaded from: classes3.dex */
public class FirebaseInstallationServiceClient {
    private static final java.lang.String ACCEPT_HEADER_KEY = "Accept";
    private static final java.lang.String API_KEY_HEADER = "x-goog-api-key";
    private static final java.lang.String CACHE_CONTROL_DIRECTIVE = "no-cache";
    private static final java.lang.String CACHE_CONTROL_HEADER_KEY = "Cache-Control";
    private static final java.lang.String CONTENT_ENCODING_HEADER_KEY = "Content-Encoding";
    private static final java.lang.String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final java.lang.String CREATE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations";
    private static final java.lang.String DELETE_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s";
    private static final java.lang.String FIREBASE_INSTALLATIONS_API_DOMAIN = "firebaseinstallations.googleapis.com";
    private static final java.lang.String FIREBASE_INSTALLATIONS_API_VERSION = "v1";
    private static final java.lang.String FIREBASE_INSTALLATIONS_ID_HEARTBEAT_TAG = "fire-installations-id";
    private static final java.lang.String FIREBASE_INSTALLATION_AUTH_VERSION = "FIS_v2";
    private static final java.lang.String FIS_TAG = "Firebase-Installations";
    private static final java.lang.String GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT = "projects/%s/installations/%s/authTokens:generate";
    private static final java.lang.String GZIP_CONTENT_ENCODING = "gzip";
    private static final java.lang.String HEART_BEAT_HEADER = "x-firebase-client";
    private static final java.lang.String JSON_CONTENT_TYPE = "application/json";
    private static final int MAX_RETRIES = 1;
    private static final int NETWORK_TIMEOUT_MILLIS = 10000;
    static final java.lang.String PARSING_EXPIRATION_TIME_ERROR_MESSAGE = "Invalid Expiration Timestamp.";
    private static final java.lang.String SDK_VERSION_PREFIX = "a:";
    private static final int TRAFFIC_STATS_CREATE_INSTALLATION_TAG = 32769;
    private static final int TRAFFIC_STATS_DELETE_INSTALLATION_TAG = 32770;
    private static final int TRAFFIC_STATS_FIREBASE_INSTALLATIONS_TAG = 32768;
    private static final int TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG = 32771;
    private static final java.lang.String X_ANDROID_CERT_HEADER_KEY = "X-Android-Cert";
    private static final java.lang.String X_ANDROID_IID_MIGRATION_KEY = "x-goog-fis-android-iid-migration-auth";
    private static final java.lang.String X_ANDROID_PACKAGE_HEADER_KEY = "X-Android-Package";
    private final android.content.Context context;
    private final com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatController> heartBeatProvider;
    private final com.google.firebase.installations.remote.RequestLimiter requestLimiter = new com.google.firebase.installations.remote.RequestLimiter();
    private boolean shouldServerErrorRetry;
    private static final java.util.regex.Pattern EXPIRATION_TIMESTAMP_PATTERN = java.util.regex.Pattern.compile("[0-9]+s");
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName("UTF-8");

    private static boolean isSuccessfulResponseCode(int i) {
        return i >= 200 && i < 300;
    }

    public FirebaseInstallationServiceClient(android.content.Context context, com.google.firebase.inject.Provider<com.google.firebase.heartbeatinfo.HeartBeatController> provider) {
        this.context = context;
        this.heartBeatProvider = provider;
    }

    public com.google.firebase.installations.remote.InstallationResponse createFirebaseInstallation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) throws com.google.firebase.installations.FirebaseInstallationsException {
        int responseCode;
        com.google.firebase.installations.remote.InstallationResponse readCreateResponse;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        java.net.URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(java.lang.String.format(CREATE_REQUEST_RESOURCE_NAME_FORMAT, str3));
        for (int i = 0; i <= 1; i++) {
            android.net.TrafficStats.setThreadStatsTag(TRAFFIC_STATS_CREATE_INSTALLATION_TAG);
            java.net.HttpURLConnection openHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    openHttpURLConnection.setRequestMethod("POST");
                    openHttpURLConnection.setDoOutput(true);
                    if (str5 != null) {
                        openHttpURLConnection.addRequestProperty(X_ANDROID_IID_MIGRATION_KEY, str5);
                    }
                    writeFIDCreateRequestBodyToOutputStream(openHttpURLConnection, str2, str4);
                    responseCode = openHttpURLConnection.getResponseCode();
                    this.requestLimiter.setNextRequestTime(responseCode);
                } catch (java.io.IOException | java.lang.AssertionError unused) {
                }
                if (isSuccessfulResponseCode(responseCode)) {
                    readCreateResponse = readCreateResponse(openHttpURLConnection);
                } else {
                    logFisCommunicationError(openHttpURLConnection, str4, str, str3);
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        logBadConfigError();
                        readCreateResponse = com.google.firebase.installations.remote.InstallationResponse.builder().setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG).build();
                    } else {
                        openHttpURLConnection.disconnect();
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                }
                return readCreateResponse;
            } finally {
                openHttpURLConnection.disconnect();
                android.net.TrafficStats.clearThreadStatsTag();
            }
        }
        throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private void writeFIDCreateRequestBodyToOutputStream(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2) throws java.io.IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildCreateFirebaseInstallationRequestBody(str, str2)));
    }

    private static byte[] getJsonBytes(org.json.JSONObject jSONObject) throws java.io.IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static void writeRequestBodyToOutputStream(java.net.URLConnection uRLConnection, byte[] bArr) throws java.io.IOException {
        java.io.OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new java.io.IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    private static org.json.JSONObject buildCreateFirebaseInstallationRequestBody(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, str2);
            jSONObject.put("authVersion", FIREBASE_INSTALLATION_AUTH_VERSION);
            jSONObject.put("sdkVersion", "a:18.0.0");
            return jSONObject;
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    private void writeGenerateAuthTokenRequestBodyToOutputStream(java.net.HttpURLConnection httpURLConnection) throws java.io.IOException {
        writeRequestBodyToOutputStream(httpURLConnection, getJsonBytes(buildGenerateAuthTokenRequestBody()));
    }

    private static org.json.JSONObject buildGenerateAuthTokenRequestBody() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("sdkVersion", "a:18.0.0");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (org.json.JSONException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public void deleteFirebaseInstallation(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws com.google.firebase.installations.FirebaseInstallationsException {
        int responseCode;
        int i = 0;
        java.net.URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(java.lang.String.format(DELETE_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        while (i <= 1) {
            android.net.TrafficStats.setThreadStatsTag(TRAFFIC_STATS_DELETE_INSTALLATION_TAG);
            java.net.HttpURLConnection openHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                openHttpURLConnection.setRequestMethod("DELETE");
                openHttpURLConnection.addRequestProperty(com.google.common.net.HttpHeaders.AUTHORIZATION, "FIS_v2 " + str4);
                responseCode = openHttpURLConnection.getResponseCode();
            } catch (java.io.IOException unused) {
            } catch (java.lang.Throwable th) {
                openHttpURLConnection.disconnect();
                android.net.TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                logFisCommunicationError(openHttpURLConnection, null, str, str3);
                if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                    logBadConfigError();
                    throw new com.google.firebase.installations.FirebaseInstallationsException("Bad config while trying to delete FID", com.google.firebase.installations.FirebaseInstallationsException.Status.BAD_CONFIG);
                }
                i++;
                openHttpURLConnection.disconnect();
                android.net.TrafficStats.clearThreadStatsTag();
            }
            openHttpURLConnection.disconnect();
            android.net.TrafficStats.clearThreadStatsTag();
            return;
        }
        throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private java.net.URL getFullyQualifiedRequestUri(java.lang.String str) throws com.google.firebase.installations.FirebaseInstallationsException {
        try {
            return new java.net.URL(java.lang.String.format("https://%s/%s/%s", FIREBASE_INSTALLATIONS_API_DOMAIN, "v1", str));
        } catch (java.net.MalformedURLException e) {
            throw new com.google.firebase.installations.FirebaseInstallationsException(e.getMessage(), com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    public com.google.firebase.installations.remote.TokenResult generateAuthToken(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) throws com.google.firebase.installations.FirebaseInstallationsException {
        int responseCode;
        com.google.firebase.installations.remote.TokenResult readGenerateAuthTokenResponse;
        if (!this.requestLimiter.isRequestAllowed()) {
            throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        java.net.URL fullyQualifiedRequestUri = getFullyQualifiedRequestUri(java.lang.String.format(GENERATE_AUTH_TOKEN_REQUEST_RESOURCE_NAME_FORMAT, str3, str2));
        for (int i = 0; i <= 1; i++) {
            android.net.TrafficStats.setThreadStatsTag(TRAFFIC_STATS_GENERATE_AUTH_TOKEN_TAG);
            java.net.HttpURLConnection openHttpURLConnection = openHttpURLConnection(fullyQualifiedRequestUri, str);
            try {
                try {
                    openHttpURLConnection.setRequestMethod("POST");
                    openHttpURLConnection.addRequestProperty(com.google.common.net.HttpHeaders.AUTHORIZATION, "FIS_v2 " + str4);
                    openHttpURLConnection.setDoOutput(true);
                    writeGenerateAuthTokenRequestBodyToOutputStream(openHttpURLConnection);
                    responseCode = openHttpURLConnection.getResponseCode();
                    this.requestLimiter.setNextRequestTime(responseCode);
                } finally {
                    openHttpURLConnection.disconnect();
                    android.net.TrafficStats.clearThreadStatsTag();
                }
            } catch (java.io.IOException | java.lang.AssertionError unused) {
            }
            if (isSuccessfulResponseCode(responseCode)) {
                readGenerateAuthTokenResponse = readGenerateAuthTokenResponse(openHttpURLConnection);
            } else {
                logFisCommunicationError(openHttpURLConnection, null, str, str3);
                if (responseCode != 401 && responseCode != 404) {
                    if (responseCode == 429) {
                        throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        logBadConfigError();
                        readGenerateAuthTokenResponse = com.google.firebase.installations.remote.TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.BAD_CONFIG).build();
                    } else {
                        openHttpURLConnection.disconnect();
                        android.net.TrafficStats.clearThreadStatsTag();
                    }
                }
                readGenerateAuthTokenResponse = com.google.firebase.installations.remote.TokenResult.builder().setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.AUTH_ERROR).build();
            }
            return readGenerateAuthTokenResponse;
        }
        throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    private static void logBadConfigError() {
        android.util.Log.e(FIS_TAG, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private java.net.HttpURLConnection openHttpURLConnection(java.net.URL url, java.lang.String str) throws com.google.firebase.installations.FirebaseInstallationsException {
        try {
            java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", GZIP_CONTENT_ENCODING);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty(X_ANDROID_PACKAGE_HEADER_KEY, this.context.getPackageName());
            com.google.firebase.heartbeatinfo.HeartBeatController heartBeatController = this.heartBeatProvider.get();
            if (heartBeatController != null) {
                try {
                    httpURLConnection.addRequestProperty(HEART_BEAT_HEADER, (java.lang.String) com.google.android.gms.tasks.Tasks.await(heartBeatController.getHeartBeatsHeader()));
                } catch (java.lang.InterruptedException e) {
                    java.lang.Thread.currentThread().interrupt();
                    android.util.Log.w("ContentValues", "Failed to get heartbeats header", e);
                } catch (java.util.concurrent.ExecutionException e2) {
                    android.util.Log.w("ContentValues", "Failed to get heartbeats header", e2);
                }
            }
            httpURLConnection.addRequestProperty(X_ANDROID_CERT_HEADER_KEY, getFingerprintHashForPackage());
            httpURLConnection.addRequestProperty(API_KEY_HEADER, str);
            return httpURLConnection;
        } catch (java.io.IOException unused) {
            throw new com.google.firebase.installations.FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", com.google.firebase.installations.FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private com.google.firebase.installations.remote.InstallationResponse readCreateResponse(java.net.HttpURLConnection httpURLConnection) throws java.lang.AssertionError, java.io.IOException {
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream, UTF_8));
        com.google.firebase.installations.remote.TokenResult.Builder builder = com.google.firebase.installations.remote.TokenResult.builder();
        com.google.firebase.installations.remote.InstallationResponse.Builder builder2 = com.google.firebase.installations.remote.InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                builder2.setUri(jsonReader.nextString());
            } else if (nextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (nextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (nextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK).build();
    }

    private com.google.firebase.installations.remote.TokenResult readGenerateAuthTokenResponse(java.net.HttpURLConnection httpURLConnection) throws java.lang.AssertionError, java.io.IOException {
        java.io.InputStream inputStream = httpURLConnection.getInputStream();
        android.util.JsonReader jsonReader = new android.util.JsonReader(new java.io.InputStreamReader(inputStream, UTF_8));
        com.google.firebase.installations.remote.TokenResult.Builder builder = com.google.firebase.installations.remote.TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (nextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(parseTokenExpirationTimestamp(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(com.google.firebase.installations.remote.TokenResult.ResponseCode.OK).build();
    }

    private java.lang.String getFingerprintHashForPackage() {
        try {
            android.content.Context context = this.context;
            byte[] packageCertificateHashBytes = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return com.google.android.gms.common.util.Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            android.util.Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e("ContentValues", "No such package: " + this.context.getPackageName(), e);
            return null;
        }
    }

    static long parseTokenExpirationTimestamp(java.lang.String str) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(EXPIRATION_TIMESTAMP_PATTERN.matcher(str).matches(), PARSING_EXPIRATION_TIME_ERROR_MESSAGE);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return java.lang.Long.parseLong(str.substring(0, str.length() - 1));
    }

    private static void logFisCommunicationError(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String readErrorResponse = readErrorResponse(httpURLConnection);
        if (android.text.TextUtils.isEmpty(readErrorResponse)) {
            return;
        }
        android.util.Log.w(FIS_TAG, readErrorResponse);
        android.util.Log.w(FIS_TAG, availableFirebaseOptions(str, str2, str3));
    }

    private static java.lang.String availableFirebaseOptions(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (android.text.TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return java.lang.String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static java.lang.String readErrorResponse(java.net.HttpURLConnection httpURLConnection) {
        java.io.InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(errorStream, UTF_8));
        try {
            try {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (true) {
                    java.lang.String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                java.lang.String format = java.lang.String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", java.lang.Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (java.io.IOException unused) {
                }
                return format;
            } catch (java.io.IOException unused2) {
                return null;
            }
        } catch (java.io.IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (java.lang.Throwable th) {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused4) {
            }
            throw th;
        }
    }
}
