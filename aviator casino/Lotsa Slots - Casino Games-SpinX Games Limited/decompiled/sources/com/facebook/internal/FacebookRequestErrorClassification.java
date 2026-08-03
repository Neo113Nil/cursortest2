package com.facebook.internal;

/* compiled from: FacebookRequestErrorClassification.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u007f\b\u0000\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\fJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012R'\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R'\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/facebook/internal/FacebookRequestErrorClassification;", "", "otherErrors", "", "", "", "transientErrors", "loginRecoverableErrors", "otherRecoveryMessage", "", "transientRecoveryMessage", "loginRecoverableRecoveryMessage", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLoginRecoverableErrors", "()Ljava/util/Map;", "getOtherErrors", "getTransientErrors", "classify", "Lcom/facebook/FacebookRequestError$Category;", "errorCode", "errorSubCode", "isTransient", "", "getRecoveryMessage", "category", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookRequestErrorClassification {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.internal.FacebookRequestErrorClassification.Companion INSTANCE = new com.facebook.internal.FacebookRequestErrorClassification.Companion(null);
    public static final int EC_APP_NOT_INSTALLED = 412;
    public static final int EC_APP_TOO_MANY_CALLS = 4;
    public static final int EC_INVALID_SESSION = 102;
    public static final int EC_INVALID_TOKEN = 190;
    public static final int EC_RATE = 9;
    public static final int EC_SERVICE_UNAVAILABLE = 2;
    public static final int EC_TOO_MANY_USER_ACTION_CALLS = 341;
    public static final int EC_USER_TOO_MANY_CALLS = 17;
    public static final int ESC_APP_INACTIVE = 493;
    public static final int ESC_APP_NOT_INSTALLED = 458;
    public static final java.lang.String KEY_LOGIN_RECOVERABLE = "login_recoverable";
    public static final java.lang.String KEY_NAME = "name";
    public static final java.lang.String KEY_OTHER = "other";
    public static final java.lang.String KEY_RECOVERY_MESSAGE = "recovery_message";
    public static final java.lang.String KEY_TRANSIENT = "transient";
    private static com.facebook.internal.FacebookRequestErrorClassification defaultInstance;
    private final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> loginRecoverableErrors;
    private final java.lang.String loginRecoverableRecoveryMessage;
    private final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> otherErrors;
    private final java.lang.String otherRecoveryMessage;
    private final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> transientErrors;
    private final java.lang.String transientRecoveryMessage;

    /* compiled from: FacebookRequestErrorClassification.kt */
    @kotlin.Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.facebook.FacebookRequestError.Category.valuesCustom().length];
            iArr[com.facebook.FacebookRequestError.Category.OTHER.ordinal()] = 1;
            iArr[com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[com.facebook.FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final com.facebook.internal.FacebookRequestErrorClassification createFromJSON(org.json.JSONArray jSONArray) {
        return INSTANCE.createFromJSON(jSONArray);
    }

    public static final synchronized com.facebook.internal.FacebookRequestErrorClassification getDefaultErrorClassification() {
        com.facebook.internal.FacebookRequestErrorClassification defaultErrorClassification;
        synchronized (com.facebook.internal.FacebookRequestErrorClassification.class) {
            defaultErrorClassification = INSTANCE.getDefaultErrorClassification();
        }
        return defaultErrorClassification;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FacebookRequestErrorClassification(java.util.Map<java.lang.Integer, ? extends java.util.Set<java.lang.Integer>> map, java.util.Map<java.lang.Integer, ? extends java.util.Set<java.lang.Integer>> map2, java.util.Map<java.lang.Integer, ? extends java.util.Set<java.lang.Integer>> map3, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.otherErrors = map;
        this.transientErrors = map2;
        this.loginRecoverableErrors = map3;
        this.otherRecoveryMessage = str;
        this.transientRecoveryMessage = str2;
        this.loginRecoverableRecoveryMessage = str3;
    }

    public final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> getOtherErrors() {
        return this.otherErrors;
    }

    public final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> getTransientErrors() {
        return this.transientErrors;
    }

    public final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> getLoginRecoverableErrors() {
        return this.loginRecoverableErrors;
    }

    public final java.lang.String getRecoveryMessage(com.facebook.FacebookRequestError.Category category) {
        int i = category == null ? -1 : com.facebook.internal.FacebookRequestErrorClassification.WhenMappings.$EnumSwitchMapping$0[category.ordinal()];
        if (i == 1) {
            return this.otherRecoveryMessage;
        }
        if (i == 2) {
            return this.loginRecoverableRecoveryMessage;
        }
        if (i != 3) {
            return null;
        }
        return this.transientRecoveryMessage;
    }

    public final com.facebook.FacebookRequestError.Category classify(int errorCode, int errorSubCode, boolean isTransient) {
        java.util.Set<java.lang.Integer> set;
        java.util.Set<java.lang.Integer> set2;
        java.util.Set<java.lang.Integer> set3;
        if (isTransient) {
            return com.facebook.FacebookRequestError.Category.TRANSIENT;
        }
        java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map = this.otherErrors;
        if (map != null && map.containsKey(java.lang.Integer.valueOf(errorCode)) && ((set3 = this.otherErrors.get(java.lang.Integer.valueOf(errorCode))) == null || set3.contains(java.lang.Integer.valueOf(errorSubCode)))) {
            return com.facebook.FacebookRequestError.Category.OTHER;
        }
        java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map2 = this.loginRecoverableErrors;
        if (map2 != null && map2.containsKey(java.lang.Integer.valueOf(errorCode)) && ((set2 = this.loginRecoverableErrors.get(java.lang.Integer.valueOf(errorCode))) == null || set2.contains(java.lang.Integer.valueOf(errorSubCode)))) {
            return com.facebook.FacebookRequestError.Category.LOGIN_RECOVERABLE;
        }
        java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map3 = this.transientErrors;
        if (map3 != null && map3.containsKey(java.lang.Integer.valueOf(errorCode)) && ((set = this.transientErrors.get(java.lang.Integer.valueOf(errorCode))) == null || set.contains(java.lang.Integer.valueOf(errorSubCode)))) {
            return com.facebook.FacebookRequestError.Category.TRANSIENT;
        }
        return com.facebook.FacebookRequestError.Category.OTHER;
    }

    /* compiled from: FacebookRequestErrorClassification.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J&\u0010\u001f\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010!\u0018\u00010 2\u0006\u0010\"\u001a\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/internal/FacebookRequestErrorClassification$Companion;", "", "()V", "EC_APP_NOT_INSTALLED", "", "EC_APP_TOO_MANY_CALLS", "EC_INVALID_SESSION", "EC_INVALID_TOKEN", "EC_RATE", "EC_SERVICE_UNAVAILABLE", "EC_TOO_MANY_USER_ACTION_CALLS", "EC_USER_TOO_MANY_CALLS", "ESC_APP_INACTIVE", "ESC_APP_NOT_INSTALLED", "KEY_LOGIN_RECOVERABLE", "", "KEY_NAME", "KEY_OTHER", "KEY_RECOVERY_MESSAGE", "KEY_TRANSIENT", "defaultErrorClassification", "Lcom/facebook/internal/FacebookRequestErrorClassification;", "getDefaultErrorClassification$annotations", "getDefaultErrorClassification", "()Lcom/facebook/internal/FacebookRequestErrorClassification;", "defaultErrorClassificationImpl", "getDefaultErrorClassificationImpl", "defaultInstance", "createFromJSON", "jsonArray", "Lorg/json/JSONArray;", "parseJSONDefinition", "", "", "definition", "Lorg/json/JSONObject;", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void getDefaultErrorClassification$annotations() {
        }

        private Companion() {
        }

        public final synchronized com.facebook.internal.FacebookRequestErrorClassification getDefaultErrorClassification() {
            com.facebook.internal.FacebookRequestErrorClassification facebookRequestErrorClassification;
            if (com.facebook.internal.FacebookRequestErrorClassification.defaultInstance == null) {
                com.facebook.internal.FacebookRequestErrorClassification.defaultInstance = getDefaultErrorClassificationImpl();
            }
            facebookRequestErrorClassification = com.facebook.internal.FacebookRequestErrorClassification.defaultInstance;
            if (facebookRequestErrorClassification == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return facebookRequestErrorClassification;
        }

        private final com.facebook.internal.FacebookRequestErrorClassification getDefaultErrorClassificationImpl() {
            return new com.facebook.internal.FacebookRequestErrorClassification(null, kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(2, null), kotlin.TuplesKt.to(4, null), kotlin.TuplesKt.to(9, null), kotlin.TuplesKt.to(17, null), kotlin.TuplesKt.to(java.lang.Integer.valueOf(com.facebook.internal.FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS), null)), kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to(102, null), kotlin.TuplesKt.to(java.lang.Integer.valueOf(com.facebook.internal.FacebookRequestErrorClassification.EC_INVALID_TOKEN), null), kotlin.TuplesKt.to(java.lang.Integer.valueOf(com.facebook.internal.FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED), null)), null, null, null);
        }

        private final java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> parseJSONDefinition(org.json.JSONObject definition) {
            int optInt;
            java.util.HashSet hashSet;
            org.json.JSONArray optJSONArray = definition.optJSONArray(com.google.firebase.analytics.FirebaseAnalytics.Param.ITEMS);
            if (optJSONArray == null || optJSONArray.length() == 0) {
                return null;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null && (optInt = optJSONObject.optInt("code")) != 0) {
                        org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new java.util.HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3 + 1;
                                    int optInt2 = optJSONArray2.optInt(i3);
                                    if (optInt2 != 0) {
                                        hashSet.add(java.lang.Integer.valueOf(optInt2));
                                    }
                                    if (i4 >= length2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                        }
                        hashMap.put(java.lang.Integer.valueOf(optInt), hashSet);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return hashMap;
        }

        @kotlin.jvm.JvmStatic
        public final com.facebook.internal.FacebookRequestErrorClassification createFromJSON(org.json.JSONArray jsonArray) {
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map;
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map2;
            java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map3;
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            java.lang.String optString;
            if (jsonArray == null) {
                return null;
            }
            int length = jsonArray.length();
            if (length > 0) {
                int i = 0;
                java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map4 = null;
                java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map5 = null;
                java.util.Map<java.lang.Integer, java.util.Set<java.lang.Integer>> map6 = null;
                java.lang.String str4 = null;
                java.lang.String str5 = null;
                java.lang.String str6 = null;
                while (true) {
                    int i2 = i + 1;
                    org.json.JSONObject optJSONObject = jsonArray.optJSONObject(i);
                    if (optJSONObject != null && (optString = optJSONObject.optString("name")) != null) {
                        if (kotlin.text.StringsKt.equals(optString, "other", true)) {
                            str4 = optJSONObject.optString(com.facebook.internal.FacebookRequestErrorClassification.KEY_RECOVERY_MESSAGE, null);
                            map4 = parseJSONDefinition(optJSONObject);
                        } else if (kotlin.text.StringsKt.equals(optString, com.facebook.internal.FacebookRequestErrorClassification.KEY_TRANSIENT, true)) {
                            str5 = optJSONObject.optString(com.facebook.internal.FacebookRequestErrorClassification.KEY_RECOVERY_MESSAGE, null);
                            map5 = parseJSONDefinition(optJSONObject);
                        } else if (kotlin.text.StringsKt.equals(optString, com.facebook.internal.FacebookRequestErrorClassification.KEY_LOGIN_RECOVERABLE, true)) {
                            str6 = optJSONObject.optString(com.facebook.internal.FacebookRequestErrorClassification.KEY_RECOVERY_MESSAGE, null);
                            map6 = parseJSONDefinition(optJSONObject);
                        }
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
                map = map4;
                map2 = map5;
                map3 = map6;
                str = str4;
                str2 = str5;
                str3 = str6;
            } else {
                map = null;
                map2 = null;
                map3 = null;
                str = null;
                str2 = null;
                str3 = null;
            }
            return new com.facebook.internal.FacebookRequestErrorClassification(map, map2, map3, str, str2, str3);
        }
    }
}
