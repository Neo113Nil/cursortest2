package com.knotapi.knot.utilities;

/* loaded from: classes9.dex */
public class SsoCookieHelper {
    java.lang.String disabledMerchantList;
    private java.lang.String emailIDFetcherPath;
    java.lang.String fbAuthPattern;
    java.lang.String fbLogoBitmap;
    java.lang.String fbReqCookie;
    java.lang.String fbSubtitle;
    java.lang.String fbTitle;
    java.lang.String firstBtnText;
    java.lang.String googleAuthPattern;
    java.lang.String googleLogoBitmap;
    java.lang.String googleReqCookie;
    java.lang.String googleSubtitle;
    java.lang.String googleTitle;
    boolean isFBDisabledMerchant;
    boolean isFbReuseCookiesEnabled;
    boolean isGoogleDisabledMerchant;
    boolean isGoogleReuseCookiesEnabled;
    java.lang.String secondBtnText;
    public static java.util.List<java.lang.String> interceptedUrls = new java.util.ArrayList();
    private static java.lang.String googleID = null;
    private static java.lang.String fbID = null;
    private static final java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newSingleThreadExecutor();
    public final java.lang.String TAG = "Knot:SsoCookieHelper";
    private final java.lang.String COOKIE_PREF_FILE_NAME = "knotapi_cookies";
    private final java.lang.String COOKIE_KEY = "cookies";
    public com.knotapi.knot.utilities.PreferenceManager preferenceManager = new com.knotapi.knot.utilities.PreferenceManager();
    public boolean ssoSessionActive = false;
    public boolean fromReusedCookies = false;
    public android.webkit.WebResourceRequest savedRequest = null;
    public boolean proceedWithoutCookies = false;
    public boolean dialogShown = false;
    public boolean shouldBlockRequest = false;
    public java.lang.String mimeType = com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
    public java.lang.String encoding = "UTF-8";
    com.knotapi.knot.utilities.WebAppJSFetcher emailFetcherJS = com.knotapi.knot.utilities.WebAppJSFetcher.getInstance();
    private long cookieExpirationTimeMs = 43200000;
    private org.json.JSONObject tempCookieData = new org.json.JSONObject();
    private final java.util.List<java.lang.String> cookieDomains = new java.util.ArrayList();

    /* renamed from: com.knotapi.knot.utilities.SsoCookieHelper$1, reason: invalid class name */
    public class AnonymousClass1 implements com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback {
        final /* synthetic */ java.lang.String val$currentUrl;
        final /* synthetic */ android.webkit.WebView val$webView;

        public AnonymousClass1(android.webkit.WebView webView, java.lang.String str) {
            this.val$webView = webView;
            this.val$currentUrl = str;
        }

        /* renamed from: lambda$onJSCodeFetched$0$com-knotapi-knot-utilities-SsoCookieHelper$1, reason: not valid java name */
        /* synthetic */ void m10847x3561575e(java.lang.String str, java.lang.String str2) {
            if (str2 == null || str2.equals("null") || str2.equals("{}")) {
                return;
            }
            java.lang.String replace = str2.replace("\"", "");
            if (str.contains("google.com")) {
                java.lang.String unused = com.knotapi.knot.utilities.SsoCookieHelper.googleID = replace;
                java.lang.String str3 = com.knotapi.knot.utilities.SsoCookieHelper.this.TAG;
                java.lang.String unused2 = com.knotapi.knot.utilities.SsoCookieHelper.googleID;
            } else if (str.contains("facebook.com")) {
                java.lang.String unused3 = com.knotapi.knot.utilities.SsoCookieHelper.fbID = replace;
                java.lang.String str4 = com.knotapi.knot.utilities.SsoCookieHelper.this.TAG;
                java.lang.String unused4 = com.knotapi.knot.utilities.SsoCookieHelper.fbID;
            }
        }

        @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
        public void onFetchFailed(java.lang.Exception exc) {
            java.lang.String str = com.knotapi.knot.utilities.SsoCookieHelper.this.TAG;
        }

        @Override // com.knotapi.knot.utilities.WebAppJSFetcher.JSFetchCallback
        public void onJSCodeFetched(java.lang.String str) {
            if (str == null || str.isEmpty()) {
                return;
            }
            android.webkit.WebView webView = this.val$webView;
            final java.lang.String str2 = this.val$currentUrl;
            webView.evaluateJavascript(str, new android.webkit.ValueCallback() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$1$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(java.lang.Object obj) {
                    com.knotapi.knot.utilities.SsoCookieHelper.AnonymousClass1.this.m10847x3561575e(str2, (java.lang.String) obj);
                }
            });
        }
    }

    private void addCookiesToMap(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        if (str == null || str.isEmpty()) {
            return;
        }
        java.lang.String[] split = str.split(";");
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : split) {
            java.lang.String[] split2 = str2.split("=", 2);
            if (split2.length == 2) {
                java.lang.String trim = split2[0].trim();
                map.put(trim, split2[1].trim());
                hashSet.add(trim);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: checkAndPromptForDialog, reason: merged with bridge method [inline-methods] */
    public void m10845lambda$handleDialog$0$comknotapiknotutilitiesSsoCookieHelper(final com.knotapi.knot.webview.KnotView knotView, final android.webkit.WebView webView, final android.app.Activity activity, java.lang.String str, java.lang.String str2, final java.lang.String str3, final java.lang.String str4, java.lang.String str5) {
        if (this.dialogShown) {
            android.webkit.WebResourceRequest webResourceRequest = this.savedRequest;
            if (webResourceRequest != null) {
                webView.loadUrl(webResourceRequest.getUrl().toString());
                this.savedRequest = null;
                return;
            }
            return;
        }
        this.dialogShown = true;
        final com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog = new com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog(knotView.webViewDelegate);
        final java.lang.String str6 = "Reuse Google Account Overlay";
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.utilities.SsoCookieHelper.this.m10842x3f543896(knotView, str3, str6, webView, knotBottomSheetDialog, view);
            }
        };
        final java.lang.String str7 = "Reuse Google Account Overlay";
        final java.lang.String str8 = "Reuse Google Account Overlay";
        com.knotapi.knot.models.DialogOptions dialogOptions = new com.knotapi.knot.models.DialogOptions(str, str2, str3, str4, onClickListener, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.utilities.SsoCookieHelper.this.m10843x240a1f5(knotView, str4, str7, activity, webView, knotBottomSheetDialog, view);
            }
        }, new android.view.View.OnClickListener() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.knotapi.knot.utilities.SsoCookieHelper.this.m10844xc52d0b54(knotView, str8, webView, knotBottomSheetDialog, view);
            }
        }, "");
        knotBottomSheetDialog.setBitmap(convertBase64ToBitmap(str5));
        knotBottomSheetDialog.setNonDismissible(true);
        knotBottomSheetDialog.setDialogOptions(dialogOptions);
        if (activity instanceof androidx.appcompat.app.AppCompatActivity) {
            knotBottomSheetDialog.show(((androidx.appcompat.app.AppCompatActivity) activity).getSupportFragmentManager(), knotBottomSheetDialog.getTag());
        } else {
            if (!(activity instanceof androidx.fragment.app.FragmentActivity)) {
                throw new java.lang.IllegalStateException("Activity must be an instance of FragmentActivity or AppCompatActivity");
            }
            knotBottomSheetDialog.show(((androidx.fragment.app.FragmentActivity) activity).getSupportFragmentManager(), knotBottomSheetDialog.getTag());
        }
    }

    private boolean checkRequiredCookies(java.lang.String str, java.lang.String str2) {
        if (str != null && !str.isEmpty()) {
            java.util.HashSet hashSet = new java.util.HashSet();
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(str2);
                for (int i = 0; i < jSONArray.length(); i++) {
                    hashSet.add(jSONArray.getString(i).trim());
                }
                java.util.HashSet hashSet2 = new java.util.HashSet();
                if (com.knotapi.knot.utilities.Helper.isValidJson(str)) {
                    try {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            for (java.lang.String str3 : jSONObject.getJSONObject(keys.next()).getString("cookies").trim().split(";")) {
                                java.lang.String[] split = str3.split("=", 2);
                                if (split.length == 2) {
                                    java.lang.String trim = split[0].trim();
                                    if (hashSet.contains(trim)) {
                                        hashSet2.add(trim);
                                    }
                                }
                            }
                        }
                    } catch (org.json.JSONException unused) {
                        return false;
                    }
                } else {
                    for (java.lang.String str4 : str.split(";")) {
                        java.lang.String[] split2 = str4.split("=", 2);
                        if (split2.length == 2) {
                            java.lang.String trim2 = split2[0].trim();
                            if (hashSet.contains(trim2)) {
                                hashSet2.add(trim2);
                            }
                        }
                    }
                }
                return hashSet2.containsAll(hashSet);
            } catch (org.json.JSONException unused2) {
            }
        }
        return false;
    }

    private java.lang.String cleanUpCookies(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        addCookiesToMap(str, hashMap);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            if (sb.length() > 0) {
                sb.append("; ");
            }
            sb.append((java.lang.String) entry.getKey());
            sb.append("=");
            sb.append((java.lang.String) entry.getValue());
        }
        return sb.toString();
    }

    public static android.graphics.Bitmap convertBase64ToBitmap(java.lang.String str) {
        try {
            byte[] decode = android.util.Base64.decode(str, 0);
            return android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    private java.lang.String determineJSPath(java.lang.String str, com.knotapi.knot.webview.KnotView knotView) {
        if (str.contains("google.com")) {
            return this.emailIDFetcherPath;
        }
        if (str.contains("facebook.com") && knotView.getBot().getGlobalSettings().has("facebook_fetch_email") && knotView.getBot().getGlobalSettings().get("facebook_fetch_email").isJsonPrimitive()) {
            return knotView.getBot().getGlobalSettings().get("facebook_fetch_email").getAsString();
        }
        return null;
    }

    private void fetchCookieDomain(java.lang.String str) {
        this.cookieDomains.clear();
        if (str == null || !com.knotapi.knot.utilities.Helper.isValidJson(str)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                java.lang.String trim = jSONArray.getString(i).trim();
                if (!trim.isEmpty()) {
                    this.cookieDomains.add(trim);
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }

    private boolean getBoolean(com.google.gson.JsonObject jsonObject, java.lang.String str, boolean z) {
        return jsonObject.has(str) ? jsonObject.get(str).getAsBoolean() : z;
    }

    private int getInt(com.google.gson.JsonObject jsonObject, java.lang.String str, int i) {
        return jsonObject.has(str) ? jsonObject.get(str).getAsInt() : i;
    }

    private java.lang.String getString(com.google.gson.JsonObject jsonObject, java.lang.String str, java.lang.String str2) {
        return jsonObject.has(str) ? jsonObject.get(str).getAsString() : str2;
    }

    private void getWebResourceRequestSettings(com.knotapi.knot.webview.KnotView knotView) {
        if (knotView != null) {
            try {
                if (knotView.getBot().getAllSettings().has("web_request_mime")) {
                    this.mimeType = knotView.getBot().getAllSettings().get("web_request_mime").getAsString();
                } else {
                    this.mimeType = com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM;
                }
                if (knotView.getBot().getAllSettings().has("web_request_encoding")) {
                    this.encoding = knotView.getBot().getAllSettings().get("web_request_encoding").getAsString();
                } else {
                    this.encoding = "UTF-8";
                }
            } catch (java.lang.Exception unused) {
            }
        }
    }

    private void handleDialog(final com.knotapi.knot.webview.KnotView knotView, final android.webkit.WebView webView, final android.app.Activity activity, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, android.webkit.WebResourceRequest webResourceRequest) {
        this.savedRequest = webResourceRequest;
        new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.knotapi.knot.utilities.SsoCookieHelper.this.m10845lambda$handleDialog$0$comknotapiknotutilitiesSsoCookieHelper(knotView, webView, activity, str, str2, str3, str4, str5);
            }
        });
        this.shouldBlockRequest = true;
    }

    private boolean matchesPattern(java.lang.String str, java.lang.String str2) {
        return java.util.regex.Pattern.compile(str2).matcher(str).find();
    }

    private void saveCookiesToTempStorage(java.lang.String str, java.lang.String str2) {
        try {
            java.lang.String host = android.net.Uri.parse(str).getHost();
            org.json.JSONObject optJSONObject = this.tempCookieData.optJSONObject(host);
            if (optJSONObject == null) {
                optJSONObject = new org.json.JSONObject();
            }
            java.lang.String optString = optJSONObject.optString("cookies", "");
            java.lang.String cleanUpCookies = cleanUpCookies(str2);
            java.util.HashMap hashMap = new java.util.HashMap();
            addCookiesToMap(optString, hashMap);
            addCookiesToMap(cleanUpCookies, hashMap);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (java.util.Map.Entry entry : hashMap.entrySet()) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append((java.lang.String) entry.getKey());
                sb.append("=");
                sb.append((java.lang.String) entry.getValue());
            }
            optJSONObject.put("cookies", sb.toString());
            optJSONObject.put("timestamp", java.lang.System.currentTimeMillis());
            this.tempCookieData.put(host, optJSONObject);
        } catch (java.lang.Exception unused) {
        }
    }

    private void saveEmailToSharedPreferences(java.lang.String str, java.lang.String str2, android.content.Context context) {
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences("merchantEmails", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00fb, code lost:
    
        if (r3.equals(r8) == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void checkDisabledMerchants(com.knotapi.knot.webview.KnotView knotView) {
        boolean z;
        java.lang.StringBuilder sb;
        if (knotView == null || knotView.getBot() == null || knotView.getBot().getGlobalSettings() == null) {
            return;
        }
        java.lang.String asString = knotView.getBot().getGlobalSettings().get("disabled_merchants") != null ? knotView.getBot().getGlobalSettings().get("disabled_merchants").getAsString() : null;
        if (asString == null || asString.isEmpty()) {
            return;
        }
        boolean z2 = false;
        java.lang.String str = asString.contains("google_disabled_merchants") ? asString.split("\"google_disabled_merchants\":\"\\{")[1].split("\\}")[0] : "";
        java.lang.String str2 = asString.contains("fb_disabled_merchants") ? asString.split("\"fb_disabled_merchants\":\"\\{")[1].split("\\}")[0] : "";
        java.lang.String valueOf = java.lang.String.valueOf(knotView.bot.getMerchantId());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(",");
        sb2.append(valueOf);
        sb2.append(",");
        if (!str.contains(sb2.toString())) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(valueOf);
            sb3.append(",");
            if (!str.startsWith(sb3.toString()) && !str.endsWith(",".concat(java.lang.String.valueOf(valueOf))) && !str.equals(valueOf)) {
                z = false;
                this.isGoogleDisabledMerchant = z;
                sb = new java.lang.StringBuilder(",");
                sb.append(valueOf);
                sb.append(",");
                if (!str2.contains(sb.toString())) {
                    java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                    sb4.append(valueOf);
                    sb4.append(",");
                    if (!str2.startsWith(sb4.toString())) {
                        if (!str2.endsWith(",".concat(java.lang.String.valueOf(valueOf)))) {
                        }
                    }
                }
                z2 = true;
                this.isFBDisabledMerchant = z2;
            }
        }
        z = true;
        this.isGoogleDisabledMerchant = z;
        sb = new java.lang.StringBuilder(",");
        sb.append(valueOf);
        sb.append(",");
        if (!str2.contains(sb.toString())) {
        }
        z2 = true;
        this.isFBDisabledMerchant = z2;
    }

    public boolean checkShouldIntercept(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.app.Activity activity, com.knotapi.knot.webview.KnotView knotView) {
        getSettings(knotView);
        java.lang.String obj = webResourceRequest.getUrl().toString();
        getWebResourceRequestSettings(knotView);
        boolean matchesPattern = matchesPattern(obj, this.googleAuthPattern);
        boolean matchesPattern2 = matchesPattern(obj, this.fbAuthPattern);
        interceptedUrls.add(obj);
        if ((matchesPattern || matchesPattern2) && !this.dialogShown && !this.proceedWithoutCookies) {
            java.lang.String cookies = getCookies(activity);
            android.content.SharedPreferences sharedPreferences = activity.getSharedPreferences("merchantEmails", 0);
            java.lang.String string = sharedPreferences.getString("googleEmail", null);
            java.lang.String string2 = sharedPreferences.getString("facebookEmail", null);
            if (matchesPattern && this.isGoogleReuseCookiesEnabled && !this.isGoogleDisabledMerchant && checkRequiredCookies(cookies, this.googleReqCookie)) {
                if (string == null || string.isEmpty()) {
                    this.googleSubtitle = "You logged in earlier with your Google account for a different merchant";
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(this.googleSubtitle);
                    sb.append(" <b>");
                    sb.append(string);
                    sb.append("</b>");
                    this.googleSubtitle = sb.toString();
                }
                handleDialog(knotView, webView, activity, this.googleTitle, this.googleSubtitle, this.firstBtnText, this.secondBtnText, this.googleLogoBitmap, webResourceRequest);
                return true;
            }
            if (matchesPattern2 && this.isFbReuseCookiesEnabled && !this.isFBDisabledMerchant && checkRequiredCookies(cookies, this.fbReqCookie)) {
                if (string2 == null || string2.isEmpty()) {
                    this.fbSubtitle = "You logged in earlier with your Facebook account for a different merchant";
                } else {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(this.fbSubtitle);
                    sb2.append(" <b>");
                    sb2.append(string2);
                    sb2.append("</b>");
                    this.fbSubtitle = sb2.toString();
                }
                handleDialog(knotView, webView, activity, this.fbTitle, this.fbSubtitle, this.firstBtnText, this.secondBtnText, this.fbLogoBitmap, webResourceRequest);
                return true;
            }
        }
        return false;
    }

    public void fetchEmailFromWebView(android.webkit.WebView webView, com.knotapi.knot.webview.KnotView knotView, android.app.Activity activity) {
        java.lang.String url;
        java.lang.String determineJSPath;
        if (webView == null || webView.getUrl() == null || knotView == null || (determineJSPath = determineJSPath((url = webView.getUrl()), knotView)) == null || determineJSPath.isEmpty()) {
            return;
        }
        this.emailFetcherJS.fetchJS(determineJSPath, new com.knotapi.knot.utilities.SsoCookieHelper.AnonymousClass1(webView, url));
    }

    public java.lang.String getCookies(android.content.Context context) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(com.knotapi.knot.utilities.EncryptionHelper.getEncryptedString(context, "knotapi_cookies", "cookies", "{}"));
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                long optLong = jSONObject.getJSONObject(next).optLong("timestamp", 0L);
                if (optLong == 0 || currentTimeMillis - optLong > this.cookieExpirationTimeMs) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                jSONObject.remove((java.lang.String) it.next());
            }
            if (!arrayList.isEmpty()) {
                com.knotapi.knot.utilities.EncryptionHelper.putEncryptedString(context, "knotapi_cookies", "cookies", jSONObject.toString());
            }
            return jSONObject.toString();
        } catch (org.json.JSONException unused) {
            return "{}";
        }
    }

    public void getSettings(com.knotapi.knot.webview.KnotView knotView) {
        java.lang.String str;
        com.google.gson.JsonElement parseString;
        if (knotView == null || knotView.getBot() == null || knotView.getBot().getGlobalSettings() == null) {
            str = null;
        } else {
            checkDisabledMerchants(knotView);
            str = getString(knotView.getBot().getGlobalSettings(), "sso_cookies", null);
            this.disabledMerchantList = getString(knotView.getBot().getGlobalSettings(), "disabled_merchants", null);
        }
        if (str == null || (parseString = com.google.gson.JsonParser.parseString(str)) == null || !parseString.isJsonObject()) {
            return;
        }
        com.google.gson.JsonObject asJsonObject = parseString.getAsJsonObject();
        this.firstBtnText = getString(asJsonObject, "first_button", "No thanks");
        this.secondBtnText = getString(asJsonObject, "second_button", "Continue");
        this.googleAuthPattern = getString(asJsonObject, "google_auth_pattern", com.knotapi.knot.utilities.Constants.google_auth_pattern);
        this.googleReqCookie = getString(asJsonObject, "google_req_cookie", "[\"NID\",\"LSID\",\"SSID\"]");
        this.isGoogleReuseCookiesEnabled = getBoolean(asJsonObject, "google_enable_dialog", true);
        this.googleTitle = getString(asJsonObject, "google_title", "Do you want to reuse your Google account login?");
        this.googleSubtitle = getString(asJsonObject, "google_subheading", "You logged in earlier with your Google account for ");
        this.googleLogoBitmap = getString(asJsonObject, "google_logo_bitmap", null);
        this.fbAuthPattern = getString(asJsonObject, "fb_auth_pattern", "https?:\\/\\/([a-z]+\\.)?facebook\\.com\\/(v\\d+\\.\\d+\\/dialog\\/oauth|login\\.php).*");
        this.fbReqCookie = getString(asJsonObject, "fb_req_cookie", "fr");
        this.isFbReuseCookiesEnabled = getBoolean(asJsonObject, "fb_enable_dialog", true);
        this.fbTitle = getString(asJsonObject, "fb_title", "Do you want to reuse your Facebook account login?");
        this.fbSubtitle = getString(asJsonObject, "fb_subheading", "You logged in earlier with your Facebook account for ");
        this.fbLogoBitmap = getString(asJsonObject, "fb_logo_bitmap", null);
        this.cookieExpirationTimeMs = getInt(asJsonObject, "cookie_expiration_hours", 12) * 3600000;
        this.emailIDFetcherPath = getString(asJsonObject, "emailIdFetcherPath", "/bots/google-sso/emailIdFetcher.js");
        fetchCookieDomain(getString(asJsonObject, "cookie_domains", null));
    }

    public void injectCookies(android.app.Activity activity) {
        java.lang.String cookies = getCookies(activity);
        if (cookies == null || cookies.isEmpty()) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(cookies);
            android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                for (java.lang.String str : jSONObject.getJSONObject(next).getString("cookies").split(";")) {
                    java.lang.String[] split = str.split("=", 2);
                    if (split.length == 2) {
                        java.lang.String trim = split[0].trim();
                        java.lang.String trim2 = split[1].trim();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(trim);
                        sb.append("=");
                        sb.append(trim2);
                        sb.append("; domain=");
                        sb.append(next);
                        sb.append("; path=/;");
                        java.lang.String obj = sb.toString();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        sb2.append("https://");
                        sb2.append(next);
                        cookieManager.setCookie(sb2.toString(), obj);
                    }
                }
            }
            cookieManager.flush();
        } catch (java.lang.Exception unused) {
        }
    }

    /* renamed from: lambda$checkAndPromptForDialog$1$com-knotapi-knot-utilities-SsoCookieHelper, reason: not valid java name */
    /* synthetic */ void m10842x3f543896(com.knotapi.knot.webview.KnotView knotView, java.lang.String str, java.lang.String str2, android.webkit.WebView webView, com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog, android.view.View view) {
        knotView.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(knotView.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, str, str2);
        if (this.fromReusedCookies) {
            knotView.clearCookies();
        }
        this.proceedWithoutCookies = true;
        this.dialogShown = false;
        android.webkit.WebResourceRequest webResourceRequest = this.savedRequest;
        if (webResourceRequest != null) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            this.savedRequest = null;
        }
        knotBottomSheetDialog.closeSheet();
    }

    /* renamed from: lambda$checkAndPromptForDialog$2$com-knotapi-knot-utilities-SsoCookieHelper, reason: not valid java name */
    /* synthetic */ void m10843x240a1f5(com.knotapi.knot.webview.KnotView knotView, java.lang.String str, java.lang.String str2, android.app.Activity activity, android.webkit.WebView webView, com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog, android.view.View view) {
        knotView.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(knotView.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, str, str2);
        injectCookies(activity);
        this.fromReusedCookies = true;
        android.webkit.WebResourceRequest webResourceRequest = this.savedRequest;
        if (webResourceRequest != null) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            this.savedRequest = null;
        }
        knotBottomSheetDialog.closeSheet();
    }

    /* renamed from: lambda$checkAndPromptForDialog$3$com-knotapi-knot-utilities-SsoCookieHelper, reason: not valid java name */
    /* synthetic */ void m10844xc52d0b54(com.knotapi.knot.webview.KnotView knotView, java.lang.String str, android.webkit.WebView webView, com.knotapi.knot.ui.dialogs.KnotBottomSheetDialog knotBottomSheetDialog, android.view.View view) {
        knotView.webViewDelegate.sendNativeLogEvent(java.lang.Integer.valueOf(knotView.bot.getBotId()), com.knotapi.knot.utilities.Constants.META_BUTTON_CLICKED, com.knotapi.knot.utilities.Constants.META_CLOSE, str);
        if (this.fromReusedCookies) {
            knotView.clearCookies();
        }
        this.proceedWithoutCookies = true;
        this.dialogShown = false;
        android.webkit.WebResourceRequest webResourceRequest = this.savedRequest;
        if (webResourceRequest != null) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            this.savedRequest = null;
        }
        knotBottomSheetDialog.closeSheet();
    }

    /* renamed from: lambda$saveTempCookiesToSharedPreferencesAsync$4$com-knotapi-knot-utilities-SsoCookieHelper, reason: not valid java name */
    /* synthetic */ void m10846xabcd662f(android.content.Context context, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2 = "";
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(com.knotapi.knot.utilities.EncryptionHelper.getEncryptedString(context, "knotapi_cookies", "cookies", "{}"));
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                org.json.JSONObject jSONObject3 = jSONObject.getJSONObject(next);
                org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                if (optJSONObject == null) {
                    optJSONObject = new org.json.JSONObject();
                }
                java.lang.String optString = optJSONObject.optString("cookies", str2);
                java.lang.String optString2 = jSONObject3.optString("cookies", str2);
                java.util.HashMap hashMap = new java.util.HashMap();
                addCookiesToMap(optString, hashMap);
                addCookiesToMap(optString2, hashMap);
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    if (sb.length() > 0) {
                        str = str2;
                        sb.append("; ");
                    } else {
                        str = str2;
                    }
                    sb.append((java.lang.String) entry.getKey());
                    sb.append("=");
                    sb.append((java.lang.String) entry.getValue());
                    str2 = str;
                }
                java.lang.String str3 = str2;
                optJSONObject.put("cookies", sb.toString());
                java.util.Iterator<java.lang.String> it = keys;
                optJSONObject.put("timestamp", java.lang.Math.max(jSONObject3.optLong("timestamp", 0L), optJSONObject.optLong("timestamp", 0L)));
                jSONObject2.put(next, optJSONObject);
                if (checkRequiredCookies(optString2, this.googleReqCookie)) {
                    saveEmail(context);
                }
                keys = it;
                str2 = str3;
            }
            com.knotapi.knot.utilities.EncryptionHelper.putEncryptedString(context, "knotapi_cookies", "cookies", jSONObject2.toString());
            this.tempCookieData = new org.json.JSONObject();
        } catch (java.lang.Exception unused) {
        }
    }

    public void saveCookiesForDomain(android.content.Context context, java.lang.String str) {
        try {
            java.util.List<java.lang.String> list = this.cookieDomains;
            if (list == null || list.isEmpty()) {
                return;
            }
            android.webkit.CookieManager cookieManager = android.webkit.CookieManager.getInstance();
            for (java.lang.String str2 : this.cookieDomains) {
                java.lang.String cookie = cookieManager.getCookie(str2);
                if (cookie != null && !cookie.isEmpty()) {
                    saveCookiesToTempStorage(str2, cookie);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public void saveEmail(android.content.Context context) {
        java.lang.String str = googleID;
        if (str != null && !str.isEmpty()) {
            saveEmailToSharedPreferences("googleEmail", googleID, context);
            googleID = null;
        }
        java.lang.String str2 = fbID;
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        saveEmailToSharedPreferences("facebookEmail", fbID, context);
        fbID = null;
    }

    public void saveTempCookiesToSharedPreferencesAsync(final android.content.Context context) {
        try {
            final org.json.JSONObject jSONObject = new org.json.JSONObject(this.tempCookieData.toString());
            executorService.execute(new java.lang.Runnable() { // from class: com.knotapi.knot.utilities.SsoCookieHelper$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.knotapi.knot.utilities.SsoCookieHelper.this.m10846xabcd662f(context, jSONObject);
                }
            });
        } catch (java.lang.Exception unused) {
        }
    }

    public void ssoSessionInActive(java.lang.String str, com.knotapi.knot.webview.KnotView knotView) {
        if (!this.ssoSessionActive || str.equals("about:blank")) {
            return;
        }
        this.proceedWithoutCookies = false;
        this.ssoSessionActive = false;
        this.dialogShown = false;
        if (this.fromReusedCookies) {
            knotView.clearCookies();
        }
    }
}
