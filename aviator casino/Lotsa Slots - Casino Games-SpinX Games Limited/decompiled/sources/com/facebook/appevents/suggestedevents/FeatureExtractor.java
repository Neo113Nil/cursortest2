package com.facebook.appevents.suggestedevents;

/* compiled from: FeatureExtractor.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002J \u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0012H\u0002J\b\u0010#\u001a\u00020\u000fH\u0007J)\u0010$\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060&2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060&H\u0002¢\u0006\u0002\u0010(J0\u0010)\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002J\u0010\u0010.\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0012H\u0002J\u0018\u0010/\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00122\u0006\u0010*\u001a\u00020+H\u0002J\u0018\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J(\u00100\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u00062\u0006\u00102\u001a\u00020\u0006H\u0002J\u0018\u00106\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u00152\u0006\u00108\u001a\u00020\u0015H\u0002J(\u00109\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00122\n\u0010:\u001a\u00060;j\u0002`<2\n\u0010=\u001a\u00060;j\u0002`<H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\rX\u0082.¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/facebook/appevents/suggestedevents/FeatureExtractor;", "", "()V", "NUM_OF_FEATURES", "", "REGEX_ADD_TO_CART_BUTTON_TEXT", "", "REGEX_ADD_TO_CART_PAGE_TITLE", "REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD", "REGEX_CR_HAS_LOG_IN_KEYWORDS", "REGEX_CR_HAS_SIGN_ON_KEYWORDS", "REGEX_CR_PASSWORD_FIELD", "eventInfo", "", "initialized", "", "languageInfo", "rules", "Lorg/json/JSONObject;", "textTypeInfo", "getDenseFeatures", "", "viewHierarchy", "appName", "getInteractedNode", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "getTextFeature", "buttonText", "activityName", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "file", "Ljava/io/File;", "isButton", "node", "isInitialized", "matchIndicators", "indicators", "", "values", "([Ljava/lang/String;[Ljava/lang/String;)Z", "nonparseFeatures", "siblings", "Lorg/json/JSONArray;", "screenName", "formFieldsJSON", "parseFeatures", "pruneTree", "regexMatched", "pattern", "matchText", "language", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "textType", "sum", "a", "b", "updateHintAndTextRecursively", "textSB", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "hintSB", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FeatureExtractor {
    public static final com.facebook.appevents.suggestedevents.FeatureExtractor INSTANCE = new com.facebook.appevents.suggestedevents.FeatureExtractor();
    private static final int NUM_OF_FEATURES = 30;
    private static final java.lang.String REGEX_ADD_TO_CART_BUTTON_TEXT = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart";
    private static final java.lang.String REGEX_ADD_TO_CART_PAGE_TITLE = "(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy";
    private static final java.lang.String REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD = "(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)";
    private static final java.lang.String REGEX_CR_HAS_LOG_IN_KEYWORDS = "(?i)(sign in)|login|signIn";
    private static final java.lang.String REGEX_CR_HAS_SIGN_ON_KEYWORDS = "(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)";
    private static final java.lang.String REGEX_CR_PASSWORD_FIELD = "password";
    private static java.util.Map<java.lang.String, java.lang.String> eventInfo;
    private static boolean initialized;
    private static java.util.Map<java.lang.String, java.lang.String> languageInfo;
    private static org.json.JSONObject rules;
    private static java.util.Map<java.lang.String, java.lang.String> textTypeInfo;

    private FeatureExtractor() {
    }

    @kotlin.jvm.JvmStatic
    public static final boolean isInitialized() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.FeatureExtractor.class)) {
            return false;
        }
        try {
            return initialized;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.FeatureExtractor.class);
            return false;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void initialize(java.io.File file) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.FeatureExtractor.class)) {
            return;
        }
        try {
            try {
                rules = new org.json.JSONObject();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                rules = new org.json.JSONObject(new java.lang.String(bArr, kotlin.text.Charsets.UTF_8));
                languageInfo = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, "1"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.GERMAN, "2"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.SPANISH, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.JAPANESE, "4"));
                eventInfo = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_CONTENT, "0"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.SEARCH, "1"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.ADD_TO_CART, "2"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.ADD_TO_WISHLIST, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.INITIATE_CHECKOUT, "4"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.ADD_PAYMENT_INFO, "5"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.PURCHASE, "6"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.LEAD, com.ironsource.Fc.e), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.COMPLETE_REGISTRATION, "8"));
                textTypeInfo = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.BUTTON_TEXT, "1"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.PAGE_TITLE, "2"), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.RESOLVED_DOCUMENT_LINK, androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D), kotlin.TuplesKt.to(com.facebook.appevents.internal.ViewHierarchyConstants.BUTTON_ID, "4"));
                initialized = true;
            } catch (java.lang.Throwable th) {
                com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.FeatureExtractor.class);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getTextFeature(java.lang.String buttonText, java.lang.String activityName, java.lang.String appName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.FeatureExtractor.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityName, "activityName");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
            java.lang.String str = appName + " | " + activityName + ", " + buttonText;
            if (str == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            java.lang.String lowerCase = str.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.FeatureExtractor.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final float[] getDenseFeatures(org.json.JSONObject viewHierarchy, java.lang.String appName) {
        java.lang.String lowerCase;
        org.json.JSONObject jSONObject;
        java.lang.String screenName;
        org.json.JSONArray jSONArray;
        com.facebook.appevents.suggestedevents.FeatureExtractor featureExtractor;
        org.json.JSONObject interactedNode;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.suggestedevents.FeatureExtractor.class)) {
            return null;
        }
        try {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewHierarchy, "viewHierarchy");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appName, "appName");
            if (!initialized) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            try {
                lowerCase = appName.toLowerCase();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
                jSONObject = new org.json.JSONObject(viewHierarchy.optJSONObject(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY).toString());
                screenName = viewHierarchy.optString(com.facebook.appevents.internal.ViewHierarchyConstants.SCREEN_NAME_KEY);
                jSONArray = new org.json.JSONArray();
                featureExtractor = INSTANCE;
                featureExtractor.pruneTree(jSONObject, jSONArray);
                featureExtractor.sum(fArr, featureExtractor.parseFeatures(jSONObject));
                interactedNode = featureExtractor.getInteractedNode(jSONObject);
            } catch (org.json.JSONException unused) {
            }
            if (interactedNode == null) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(screenName, "screenName");
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "viewTree.toString()");
            featureExtractor.sum(fArr, featureExtractor.nonparseFeatures(interactedNode, jSONArray, screenName, jSONObject2, lowerCase));
            return fArr;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.suggestedevents.FeatureExtractor.class);
            return null;
        }
    }

    private final float[] parseFeatures(org.json.JSONObject node) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            int i = 0;
            for (int i2 = 0; i2 < 30; i2++) {
                fArr[i2] = 0.0f;
            }
            java.lang.String optString = node.optString("text");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "node.optString(TEXT_KEY)");
            java.lang.String lowerCase = optString.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            java.lang.String optString2 = node.optString(com.facebook.appevents.internal.ViewHierarchyConstants.HINT_KEY);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "node.optString(HINT_KEY)");
            java.lang.String lowerCase2 = optString2.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            java.lang.String optString3 = node.optString(com.facebook.appevents.internal.ViewHierarchyConstants.CLASS_NAME_KEY);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString3, "node.optString(CLASS_NAME_KEY)");
            java.lang.String lowerCase3 = optString3.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase()");
            int optInt = node.optInt(com.facebook.appevents.internal.ViewHierarchyConstants.INPUT_TYPE_KEY, -1);
            java.lang.String[] strArr = {lowerCase, lowerCase2};
            if (matchIndicators(new java.lang.String[]{"$", com.ironsource.C3300u.l, "price", com.ironsource.X3.i.l}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (matchIndicators(new java.lang.String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (matchIndicators(new java.lang.String[]{"tel", androidx.autofill.HintConstants.AUTOFILL_HINT_PHONE}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (matchIndicators(new java.lang.String[]{com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 3 || optInt == 2) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || android.util.Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase3, (java.lang.CharSequence) "checkbox", false, 2, (java.lang.Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (matchIndicators(new java.lang.String[]{"complete", "confirm", "done", "submit"}, new java.lang.String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase3, (java.lang.CharSequence) "radio", false, 2, (java.lang.Object) null) && kotlin.text.StringsKt.contains$default((java.lang.CharSequence) lowerCase3, (java.lang.CharSequence) "button", false, 2, (java.lang.Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                org.json.JSONArray optJSONArray = node.optJSONArray(com.facebook.appevents.internal.ViewHierarchyConstants.CHILDREN_VIEW_KEY);
                int length = optJSONArray.length();
                if (length > 0) {
                    while (true) {
                        int i3 = i + 1;
                        org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "childViews.getJSONObject(i)");
                        sum(fArr, parseFeatures(jSONObject));
                        if (i3 >= length) {
                            break;
                        }
                        i = i3;
                    }
                }
            } catch (org.json.JSONException unused) {
            }
            return fArr;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final float[] nonparseFeatures(org.json.JSONObject node, org.json.JSONArray siblings, java.lang.String screenName, java.lang.String formFieldsJSON, java.lang.String appName) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i = 0; i < 30; i++) {
                fArr[i] = 0.0f;
            }
            int length = siblings.length();
            fArr[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = siblings.length();
                if (length2 > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        org.json.JSONObject jSONObject = siblings.getJSONObject(i2);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "siblings.getJSONObject(i)");
                        if (isButton(jSONObject)) {
                            fArr[9] = fArr[9] + 1.0f;
                        }
                        if (i3 >= length2) {
                            break;
                        }
                        i2 = i3;
                    }
                }
            } catch (org.json.JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            java.lang.String str = screenName + '|' + appName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            updateHintAndTextRecursively(node, sb2, sb);
            java.lang.String sb3 = sb.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb3, "hintSB.toString()");
            java.lang.String sb4 = sb2.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb4, "textSB.toString()");
            fArr[15] = regexMatched(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, com.facebook.appevents.internal.ViewHierarchyConstants.COMPLETE_REGISTRATION, com.facebook.appevents.internal.ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[16] = regexMatched(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, com.facebook.appevents.internal.ViewHierarchyConstants.COMPLETE_REGISTRATION, com.facebook.appevents.internal.ViewHierarchyConstants.PAGE_TITLE, str) ? 1.0f : 0.0f;
            fArr[17] = regexMatched(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, com.facebook.appevents.internal.ViewHierarchyConstants.COMPLETE_REGISTRATION, com.facebook.appevents.internal.ViewHierarchyConstants.BUTTON_ID, sb3) ? 1.0f : 0.0f;
            fArr[18] = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) formFieldsJSON, (java.lang.CharSequence) "password", false, 2, (java.lang.Object) null) ? 1.0f : 0.0f;
            fArr[19] = regexMatched(REGEX_CR_HAS_CONFIRM_PASSWORD_FIELD, formFieldsJSON) ? 1.0f : 0.0f;
            fArr[20] = regexMatched(REGEX_CR_HAS_LOG_IN_KEYWORDS, formFieldsJSON) ? 1.0f : 0.0f;
            fArr[21] = regexMatched(REGEX_CR_HAS_SIGN_ON_KEYWORDS, formFieldsJSON) ? 1.0f : 0.0f;
            fArr[22] = regexMatched(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, com.facebook.appevents.internal.ViewHierarchyConstants.PURCHASE, com.facebook.appevents.internal.ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[24] = regexMatched(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, com.facebook.appevents.internal.ViewHierarchyConstants.PURCHASE, com.facebook.appevents.internal.ViewHierarchyConstants.PAGE_TITLE, str) ? 1.0f : 0.0f;
            fArr[25] = regexMatched(REGEX_ADD_TO_CART_BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[27] = regexMatched(REGEX_ADD_TO_CART_PAGE_TITLE, str) ? 1.0f : 0.0f;
            fArr[28] = regexMatched(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, com.facebook.appevents.internal.ViewHierarchyConstants.LEAD, com.facebook.appevents.internal.ViewHierarchyConstants.BUTTON_TEXT, sb4) ? 1.0f : 0.0f;
            fArr[29] = regexMatched(com.facebook.appevents.internal.ViewHierarchyConstants.ENGLISH, com.facebook.appevents.internal.ViewHierarchyConstants.LEAD, com.facebook.appevents.internal.ViewHierarchyConstants.PAGE_TITLE, str) ? 1.0f : 0.0f;
            return fArr;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0068, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0069, B:35:0x006e, B:36:0x0017, B:38:0x001b, B:39:0x006f, B:40:0x0074, B:41:0x0075, B:42:0x007a), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0068, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0069, B:35:0x006e, B:36:0x0017, B:38:0x001b, B:39:0x006f, B:40:0x0074, B:41:0x0075, B:42:0x007a), top: B:5:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:6:0x0008, B:8:0x000d, B:18:0x005d, B:20:0x0043, B:23:0x004c, B:25:0x0050, B:26:0x0062, B:27:0x0068, B:28:0x0029, B:31:0x0032, B:33:0x0036, B:34:0x0069, B:35:0x006e, B:36:0x0017, B:38:0x001b, B:39:0x006f, B:40:0x0074, B:41:0x0075, B:42:0x007a), top: B:5:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean regexMatched(java.lang.String language, java.lang.String event, java.lang.String textType, java.lang.String matchText) {
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        org.json.JSONObject optJSONObject3;
        org.json.JSONObject optJSONObject4;
        java.util.Map<java.lang.String, java.lang.String> map;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = rules;
            java.lang.String str = null;
            if (jSONObject == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("rules");
                throw null;
            }
            org.json.JSONObject optJSONObject5 = jSONObject.optJSONObject("rulesForLanguage");
            if (optJSONObject5 == null) {
                optJSONObject = null;
            } else {
                java.util.Map<java.lang.String, java.lang.String> map2 = languageInfo;
                if (map2 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("languageInfo");
                    throw null;
                }
                optJSONObject = optJSONObject5.optJSONObject(map2.get(language));
            }
            if (optJSONObject != null && (optJSONObject2 = optJSONObject.optJSONObject("rulesForEvent")) != null) {
                java.util.Map<java.lang.String, java.lang.String> map3 = eventInfo;
                if (map3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("eventInfo");
                    throw null;
                }
                optJSONObject3 = optJSONObject2.optJSONObject(map3.get(event));
                if (optJSONObject3 != null && (optJSONObject4 = optJSONObject3.optJSONObject("positiveRules")) != null) {
                    map = textTypeInfo;
                    if (map != null) {
                        kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("textTypeInfo");
                        throw null;
                    }
                    str = optJSONObject4.optString(map.get(textType));
                }
                if (str != null) {
                    return false;
                }
                return regexMatched(str, matchText);
            }
            optJSONObject3 = null;
            if (optJSONObject3 != null) {
                map = textTypeInfo;
                if (map != null) {
                }
            }
            if (str != null) {
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean regexMatched(java.lang.String pattern, java.lang.String matchText) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return java.util.regex.Pattern.compile(pattern).matcher(matchText).find();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean matchIndicators(java.lang.String[] indicators, java.lang.String[] values) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            int length = indicators.length;
            int i = 0;
            while (i < length) {
                java.lang.String str = indicators[i];
                i++;
                int length2 = values.length;
                int i2 = 0;
                while (i2 < length2) {
                    java.lang.String str2 = values[i2];
                    i2++;
                    if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) str, false, 2, (java.lang.Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final boolean pruneTree(org.json.JSONObject node, org.json.JSONArray siblings) {
        boolean z;
        boolean z2;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            if (node.optBoolean(com.facebook.appevents.internal.ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                return true;
            }
            org.json.JSONArray optJSONArray = node.optJSONArray(com.facebook.appevents.internal.ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (optJSONArray.getJSONObject(i).optBoolean(com.facebook.appevents.internal.ViewHierarchyConstants.IS_INTERACTED_KEY)) {
                        z = true;
                        z2 = true;
                        break;
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            z = false;
            z2 = false;
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (z) {
                int length2 = optJSONArray.length();
                if (length2 > 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3 + 1;
                        siblings.put(optJSONArray.getJSONObject(i3));
                        if (i4 >= length2) {
                            break;
                        }
                        i3 = i4;
                    }
                }
            } else {
                int length3 = optJSONArray.length();
                if (length3 > 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        org.json.JSONObject child = optJSONArray.getJSONObject(i5);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(child, "child");
                        if (pruneTree(child, siblings)) {
                            jSONArray.put(child);
                            z2 = true;
                        }
                        if (i6 >= length3) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                node.put(com.facebook.appevents.internal.ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            }
            return z2;
        } catch (org.json.JSONException unused) {
            return false;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void sum(float[] a2, float[] b) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            int length = a2.length - 1;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                a2[i] = a2[i] + b[i];
                if (i2 > length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final boolean isButton(org.json.JSONObject node) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return ((node.optInt(com.facebook.appevents.internal.ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY) & 1) << 5) > 0;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    private final void updateHintAndTextRecursively(org.json.JSONObject view, java.lang.StringBuilder textSB, java.lang.StringBuilder hintSB) {
        int length;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            java.lang.String optString = view.optString("text", "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "view.optString(TEXT_KEY, \"\")");
            java.lang.String lowerCase = optString.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            java.lang.String optString2 = view.optString(com.facebook.appevents.internal.ViewHierarchyConstants.HINT_KEY, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString2, "view.optString(HINT_KEY, \"\")");
            java.lang.String lowerCase2 = optString2.toLowerCase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                textSB.append(lowerCase);
                textSB.append(io.ktor.sse.ServerSentEventKt.SPACE);
            }
            if (lowerCase2.length() > 0) {
                hintSB.append(lowerCase2);
                hintSB.append(io.ktor.sse.ServerSentEventKt.SPACE);
            }
            org.json.JSONArray optJSONArray = view.optJSONArray(com.facebook.appevents.internal.ViewHierarchyConstants.CHILDREN_VIEW_KEY);
            if (optJSONArray == null || (length = optJSONArray.length()) <= 0) {
                return;
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                try {
                    org.json.JSONObject currentChildView = optJSONArray.getJSONObject(i);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentChildView, "currentChildView");
                    updateHintAndTextRecursively(currentChildView, textSB, hintSB);
                } catch (org.json.JSONException unused) {
                }
                if (i2 >= length) {
                    return;
                } else {
                    i = i2;
                }
            }
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final org.json.JSONObject getInteractedNode(org.json.JSONObject view) {
        int length;
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
        } catch (org.json.JSONException unused) {
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
        }
        if (view.optBoolean(com.facebook.appevents.internal.ViewHierarchyConstants.IS_INTERACTED_KEY)) {
            return view;
        }
        org.json.JSONArray optJSONArray = view.optJSONArray(com.facebook.appevents.internal.ViewHierarchyConstants.CHILDREN_VIEW_KEY);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                org.json.JSONObject jSONObject = optJSONArray.getJSONObject(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "children.getJSONObject(i)");
                org.json.JSONObject interactedNode = getInteractedNode(jSONObject);
                if (interactedNode != null) {
                    return interactedNode;
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return null;
    }
}
