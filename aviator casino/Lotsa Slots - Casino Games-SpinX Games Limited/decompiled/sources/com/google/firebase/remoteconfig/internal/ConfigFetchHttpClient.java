package com.google.firebase.remoteconfig.internal;

/* loaded from: classes3.dex */
public class ConfigFetchHttpClient {
    private static final java.lang.String API_KEY_HEADER = "X-Goog-Api-Key";
    private static final java.lang.String ETAG_HEADER = "ETag";
    private static final java.util.regex.Pattern GMP_APP_ID_PATTERN = java.util.regex.Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final java.lang.String IF_NONE_MATCH_HEADER = "If-None-Match";
    private static final java.lang.String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final java.lang.String ISO_DATE_PATTERN = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final java.lang.String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final java.lang.String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final java.lang.String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    private final java.lang.String apiKey;
    private final java.lang.String appId;
    private final long connectTimeoutInSeconds;
    private final android.content.Context context;
    private final java.lang.String namespace;
    private final java.lang.String projectNumber;
    private final long readTimeoutInSeconds;

    public ConfigFetchHttpClient(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j, long j2) {
        this.context = context;
        this.appId = str;
        this.apiKey = str2;
        this.projectNumber = extractProjectNumberFromAppId(str);
        this.namespace = str3;
        this.connectTimeoutInSeconds = j;
        this.readTimeoutInSeconds = j2;
    }

    public long getConnectTimeoutInSeconds() {
        return this.connectTimeoutInSeconds;
    }

    public long getReadTimeoutInSeconds() {
        return this.readTimeoutInSeconds;
    }

    private static java.lang.String extractProjectNumberFromAppId(java.lang.String str) {
        java.util.regex.Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    java.net.HttpURLConnection createHttpURLConnection() throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        try {
            return (java.net.HttpURLConnection) new java.net.URL(getFetchUrl(this.projectNumber, this.namespace)).openConnection();
        } catch (java.io.IOException e) {
            throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigException(e.getMessage());
        }
    }

    com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse fetch(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map2, java.lang.Long l, java.util.Date date, java.util.Map<java.lang.String, java.lang.String> map3) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigException {
        setUpUrlConnection(httpURLConnection, str3, str2, map2);
        try {
            try {
                setFetchRequestBody(httpURLConnection, createFetchRequestBody(str, str2, map, l, map3).toString().getBytes(com.ironsource.B5.O));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException(responseCode, httpURLConnection.getResponseMessage());
                }
                java.lang.String headerField = httpURLConnection.getHeaderField("ETag");
                org.json.JSONObject fetchResponseBody = getFetchResponseBody(httpURLConnection);
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException unused) {
                }
                com.google.firebase.remoteconfig.internal.ConfigContainer extractConfigs = extractConfigs(fetchResponseBody, date);
                if (!backendHasUpdates(fetchResponseBody)) {
                    return com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse.forBackendHasNoUpdates(date, extractConfigs);
                }
                return com.google.firebase.remoteconfig.internal.ConfigFetchHandler.FetchResponse.forBackendUpdatesFetched(extractConfigs, headerField);
            } finally {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (java.io.IOException unused2) {
                }
            }
        } catch (java.io.IOException | org.json.JSONException e) {
            throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("The client had an error while calling the backend!", e);
        }
    }

    private void setUpUrlConnection(java.net.HttpURLConnection httpURLConnection, java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) java.util.concurrent.TimeUnit.SECONDS.toMillis(this.connectTimeoutInSeconds));
        httpURLConnection.setReadTimeout((int) java.util.concurrent.TimeUnit.SECONDS.toMillis(this.readTimeoutInSeconds));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        setCommonRequestHeaders(httpURLConnection, str2);
        setCustomRequestHeaders(httpURLConnection, map);
    }

    private java.lang.String getFetchUrl(java.lang.String str, java.lang.String str2) {
        return java.lang.String.format(com.google.firebase.remoteconfig.RemoteConfigConstants.FETCH_REGEX_URL, str, str2);
    }

    private void setCommonRequestHeaders(java.net.HttpURLConnection httpURLConnection, java.lang.String str) {
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.apiKey);
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, "yes");
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty("Content-Type", com.ironsource.B5.M);
        httpURLConnection.setRequestProperty(com.google.common.net.HttpHeaders.ACCEPT, com.ironsource.B5.M);
    }

    private void setCustomRequestHeaders(java.net.HttpURLConnection httpURLConnection, java.util.Map<java.lang.String, java.lang.String> map) {
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    private java.lang.String getFingerprintHashForPackage() {
        try {
            android.content.Context context = this.context;
            byte[] packageCertificateHashBytes = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return com.google.android.gms.common.util.Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            android.util.Log.e(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Could not get fingerprint hash for package: " + this.context.getPackageName());
            return null;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            android.util.Log.e(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "No such package: " + this.context.getPackageName(), e);
            return null;
        }
    }

    private org.json.JSONObject createFetchRequestBody(java.lang.String str, java.lang.String str2, java.util.Map<java.lang.String, java.lang.String> map, java.lang.Long l, java.util.Map<java.lang.String, java.lang.String> map2) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str == null) {
            throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Fetch failed: Firebase installation id is null.");
        }
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.INSTANCE_ID_TOKEN, str2);
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, this.appId);
        java.util.Locale locale = this.context.getResources().getConfiguration().locale;
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, locale.getCountry());
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.LANGUAGE_CODE, locale.toLanguageTag());
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.PLATFORM_VERSION, java.lang.Integer.toString(android.os.Build.VERSION.SDK_INT));
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.TIME_ZONE, java.util.TimeZone.getDefault().getID());
        try {
            android.content.pm.PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0);
            if (packageInfo != null) {
                hashMap.put("appVersion", packageInfo.versionName);
                hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_BUILD, java.lang.Long.toString(androidx.core.content.pm.PackageInfoCompat.getLongVersionCode(packageInfo)));
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        hashMap.put("packageName", this.context.getPackageName());
        hashMap.put("sdkVersion", com.google.firebase.remoteconfig.BuildConfig.VERSION_NAME);
        hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.ANALYTICS_USER_PROPERTIES, new org.json.JSONObject(map));
        if (!map2.isEmpty()) {
            hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.CUSTOM_SIGNALS, new org.json.JSONObject(map2));
            android.util.Log.d(com.google.firebase.remoteconfig.FirebaseRemoteConfig.TAG, "Keys of custom signals during fetch: " + map2.keySet());
        }
        if (l != null) {
            hashMap.put(com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.FIRST_OPEN_TIME, convertToISOString(l.longValue()));
        }
        return new org.json.JSONObject(hashMap);
    }

    private java.lang.String convertToISOString(long j) {
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(ISO_DATE_PATTERN, java.util.Locale.US);
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(java.lang.Long.valueOf(j));
    }

    private void setFetchRequestBody(java.net.HttpURLConnection httpURLConnection, byte[] bArr) throws java.io.IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private org.json.JSONObject getFetchResponseBody(java.net.URLConnection uRLConnection) throws java.io.IOException, org.json.JSONException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(uRLConnection.getInputStream(), com.ironsource.B5.O));
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb.append((char) read);
            } else {
                return new org.json.JSONObject(sb.toString());
            }
        }
    }

    private boolean backendHasUpdates(org.json.JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (org.json.JSONException unused) {
            return true;
        }
    }

    private static com.google.firebase.remoteconfig.internal.ConfigContainer extractConfigs(org.json.JSONObject jSONObject, java.util.Date date) throws com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException {
        org.json.JSONObject jSONObject2;
        org.json.JSONArray jSONArray;
        org.json.JSONObject jSONObject3;
        try {
            com.google.firebase.remoteconfig.internal.ConfigContainer.Builder withFetchTime = com.google.firebase.remoteconfig.internal.ConfigContainer.newBuilder().withFetchTime(date);
            org.json.JSONArray jSONArray2 = null;
            try {
                jSONObject2 = jSONObject.getJSONObject(com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ENTRIES);
            } catch (org.json.JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                withFetchTime = withFetchTime.replaceConfigsWith(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray(com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.EXPERIMENT_DESCRIPTIONS);
            } catch (org.json.JSONException unused2) {
                jSONArray = null;
            }
            if (jSONArray != null) {
                withFetchTime = withFetchTime.withAbtExperiments(jSONArray);
            }
            try {
                jSONObject3 = jSONObject.getJSONObject(com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.PERSONALIZATION_METADATA);
            } catch (org.json.JSONException unused3) {
                jSONObject3 = null;
            }
            if (jSONObject3 != null) {
                withFetchTime = withFetchTime.withPersonalizationMetadata(jSONObject3);
            }
            java.lang.String string = jSONObject.has(com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) ? jSONObject.getString(com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER) : null;
            if (string != null) {
                withFetchTime.withTemplateVersionNumber(java.lang.Long.parseLong(string));
            }
            try {
                jSONArray2 = jSONObject.getJSONArray(com.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.ROLLOUT_METADATA);
            } catch (org.json.JSONException unused4) {
            }
            if (jSONArray2 != null) {
                withFetchTime = withFetchTime.withRolloutMetadata(jSONArray2);
            }
            return withFetchTime.build();
        } catch (org.json.JSONException e) {
            throw new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException("Fetch failed: fetch response could not be parsed.", e);
        }
    }
}
