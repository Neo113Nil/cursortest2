package com.facebook.applinks;

/* loaded from: classes2.dex */
public class FacebookAppLinkResolver implements com.facebook.bolts.AppLinkResolver {
    private static final java.lang.String APP_LINK_ANDROID_TARGET_KEY = "android";
    private static final java.lang.String APP_LINK_KEY = "app_links";
    private static final java.lang.String APP_LINK_TARGET_APP_NAME_KEY = "app_name";
    private static final java.lang.String APP_LINK_TARGET_CLASS_KEY = "class";
    private static final java.lang.String APP_LINK_TARGET_PACKAGE_KEY = "package";
    private static final java.lang.String APP_LINK_TARGET_SHOULD_FALLBACK_KEY = "should_fallback";
    private static final java.lang.String APP_LINK_TARGET_URL_KEY = "url";
    private static final java.lang.String APP_LINK_WEB_TARGET_KEY = "web";
    private final java.util.HashMap<android.net.Uri, com.facebook.bolts.AppLink> cachedAppLinks = new java.util.HashMap<>();

    static /* synthetic */ com.facebook.bolts.AppLink.Target access$000(org.json.JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return getAndroidTargetFromJson(jSONObject);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.FacebookAppLinkResolver.class);
            return null;
        }
    }

    static /* synthetic */ android.net.Uri access$100(android.net.Uri uri, org.json.JSONObject jSONObject) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return getWebFallbackUriFromJson(uri, jSONObject);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.FacebookAppLinkResolver.class);
            return null;
        }
    }

    static /* synthetic */ java.util.HashMap access$200(com.facebook.applinks.FacebookAppLinkResolver facebookAppLinkResolver) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return facebookAppLinkResolver.cachedAppLinks;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.FacebookAppLinkResolver.class);
            return null;
        }
    }

    @Override // com.facebook.bolts.AppLinkResolver
    public com.facebook.bolts.Task<com.facebook.bolts.AppLink> getAppLinkFromUrlInBackground(final android.net.Uri uri) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(uri);
            return getAppLinkFromUrlsInBackground(arrayList).onSuccess(new com.facebook.bolts.Continuation<java.util.Map<android.net.Uri, com.facebook.bolts.AppLink>, com.facebook.bolts.AppLink>() { // from class: com.facebook.applinks.FacebookAppLinkResolver.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.facebook.bolts.Continuation
                public com.facebook.bolts.AppLink then(com.facebook.bolts.Task<java.util.Map<android.net.Uri, com.facebook.bolts.AppLink>> resolveUrisTask) throws java.lang.Exception {
                    return resolveUrisTask.getResult().get(uri);
                }
            });
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public com.facebook.bolts.Task<java.util.Map<android.net.Uri, com.facebook.bolts.AppLink>> getAppLinkFromUrlsInBackground(java.util.List<android.net.Uri> uris) {
        com.facebook.bolts.AppLink appLink;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            final java.util.HashMap hashMap = new java.util.HashMap();
            final java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (android.net.Uri uri : uris) {
                synchronized (this.cachedAppLinks) {
                    appLink = this.cachedAppLinks.get(uri);
                }
                if (appLink != null) {
                    hashMap.put(uri, appLink);
                } else {
                    if (!hashSet.isEmpty()) {
                        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
                    }
                    sb.append(uri.toString());
                    hashSet.add(uri);
                }
            }
            if (hashSet.isEmpty()) {
                return com.facebook.bolts.Task.forResult(hashMap);
            }
            final com.facebook.bolts.TaskCompletionSource taskCompletionSource = new com.facebook.bolts.TaskCompletionSource();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("ids", sb.toString());
            bundle.putString(com.facebook.GraphRequest.FIELDS_PARAM, java.lang.String.format("%s.fields(%s,%s)", APP_LINK_KEY, "android", "web"));
            new com.facebook.GraphRequest(com.facebook.AccessToken.getCurrentAccessToken(), "", bundle, null, new com.facebook.GraphRequest.Callback() { // from class: com.facebook.applinks.FacebookAppLinkResolver.2
                @Override // com.facebook.GraphRequest.Callback
                public void onCompleted(com.facebook.GraphResponse response) {
                    if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
                        return;
                    }
                    try {
                        com.facebook.FacebookRequestError error = response.getError();
                        if (error != null) {
                            taskCompletionSource.setError(error.getException());
                            return;
                        }
                        org.json.JSONObject graphObject = response.getGraphObject();
                        if (graphObject == null) {
                            taskCompletionSource.setResult(hashMap);
                            return;
                        }
                        java.util.Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            android.net.Uri uri2 = (android.net.Uri) it.next();
                            if (graphObject.has(uri2.toString())) {
                                try {
                                    org.json.JSONObject jSONObject = graphObject.getJSONObject(uri2.toString()).getJSONObject(com.facebook.applinks.FacebookAppLinkResolver.APP_LINK_KEY);
                                    org.json.JSONArray jSONArray = jSONObject.getJSONArray("android");
                                    int length = jSONArray.length();
                                    java.util.ArrayList arrayList = new java.util.ArrayList(length);
                                    for (int i = 0; i < length; i++) {
                                        com.facebook.bolts.AppLink.Target access$000 = com.facebook.applinks.FacebookAppLinkResolver.access$000(jSONArray.getJSONObject(i));
                                        if (access$000 != null) {
                                            arrayList.add(access$000);
                                        }
                                    }
                                    com.facebook.bolts.AppLink appLink2 = new com.facebook.bolts.AppLink(uri2, arrayList, com.facebook.applinks.FacebookAppLinkResolver.access$100(uri2, jSONObject));
                                    hashMap.put(uri2, appLink2);
                                    synchronized (com.facebook.applinks.FacebookAppLinkResolver.access$200(com.facebook.applinks.FacebookAppLinkResolver.this)) {
                                        com.facebook.applinks.FacebookAppLinkResolver.access$200(com.facebook.applinks.FacebookAppLinkResolver.this).put(uri2, appLink2);
                                    }
                                } catch (org.json.JSONException unused) {
                                    continue;
                                }
                            }
                        }
                        taskCompletionSource.setResult(hashMap);
                    } catch (java.lang.Throwable th) {
                        com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
                    }
                }
            }).executeAsync();
            return taskCompletionSource.getTask();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private static com.facebook.bolts.AppLink.Target getAndroidTargetFromJson(org.json.JSONObject targetJson) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            java.lang.String tryGetStringFromJson = tryGetStringFromJson(targetJson, APP_LINK_TARGET_PACKAGE_KEY, null);
            if (tryGetStringFromJson == null) {
                return null;
            }
            java.lang.String tryGetStringFromJson2 = tryGetStringFromJson(targetJson, APP_LINK_TARGET_CLASS_KEY, null);
            java.lang.String tryGetStringFromJson3 = tryGetStringFromJson(targetJson, "app_name", null);
            java.lang.String tryGetStringFromJson4 = tryGetStringFromJson(targetJson, "url", null);
            return new com.facebook.bolts.AppLink.Target(tryGetStringFromJson, tryGetStringFromJson2, tryGetStringFromJson4 != null ? android.net.Uri.parse(tryGetStringFromJson4) : null, tryGetStringFromJson3);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static android.net.Uri getWebFallbackUriFromJson(android.net.Uri sourceUrl, org.json.JSONObject urlData) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            org.json.JSONObject jSONObject = urlData.getJSONObject("web");
            if (!tryGetBooleanFromJson(jSONObject, APP_LINK_TARGET_SHOULD_FALLBACK_KEY, true)) {
                return null;
            }
            java.lang.String tryGetStringFromJson = tryGetStringFromJson(jSONObject, "url", null);
            android.net.Uri parse = tryGetStringFromJson != null ? android.net.Uri.parse(tryGetStringFromJson) : null;
            return parse != null ? parse : sourceUrl;
        } catch (org.json.JSONException unused) {
            return sourceUrl;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static java.lang.String tryGetStringFromJson(org.json.JSONObject json, java.lang.String propertyName, java.lang.String defaultValue) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return json.getString(propertyName);
        } catch (org.json.JSONException unused) {
            return defaultValue;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static boolean tryGetBooleanFromJson(org.json.JSONObject json, java.lang.String propertyName, boolean defaultValue) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.applinks.FacebookAppLinkResolver.class)) {
            return false;
        }
        try {
            return json.getBoolean(propertyName);
        } catch (org.json.JSONException unused) {
            return defaultValue;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.applinks.FacebookAppLinkResolver.class);
            return false;
        }
    }
}
