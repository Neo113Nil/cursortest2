package com.facebook.appevents.aam;

/* compiled from: MetadataRule.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058F¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/facebook/appevents/aam/MetadataRule;", "", "name", "", "keyRules", "", "valRule", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getKeyRules", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getValRule", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class MetadataRule {
    private static final java.lang.String FIELD_K = "k";
    private static final java.lang.String FIELD_K_DELIMITER = ",";
    private static final java.lang.String FIELD_V = "v";
    private final java.util.List<java.lang.String> keyRules;
    private final java.lang.String name;
    private final java.lang.String valRule;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.aam.MetadataRule.Companion INSTANCE = new com.facebook.appevents.aam.MetadataRule.Companion(null);
    private static final java.util.Set<com.facebook.appevents.aam.MetadataRule> rules = new java.util.concurrent.CopyOnWriteArraySet();

    public /* synthetic */ MetadataRule(java.lang.String str, java.util.List list, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, str2);
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<java.lang.String> getEnabledRuleNames() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataRule.class)) {
            return null;
        }
        try {
            return INSTANCE.getEnabledRuleNames();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataRule.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<com.facebook.appevents.aam.MetadataRule> getRules() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataRule.class)) {
            return null;
        }
        try {
            return INSTANCE.getRules();
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataRule.class);
            return null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void updateRules(java.lang.String str) {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataRule.class)) {
            return;
        }
        try {
            INSTANCE.updateRules(str);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataRule.class);
        }
    }

    private MetadataRule(java.lang.String str, java.util.List<java.lang.String> list, java.lang.String str2) {
        this.name = str;
        this.valRule = str2;
        this.keyRules = list;
    }

    public static final /* synthetic */ java.util.Set access$getRules$cp() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(com.facebook.appevents.aam.MetadataRule.class)) {
            return null;
        }
        try {
            return rules;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, com.facebook.appevents.aam.MetadataRule.class);
            return null;
        }
    }

    public final java.lang.String getName() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.name;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public final java.lang.String getValRule() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return this.valRule;
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    /* compiled from: MetadataRule.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0007J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fH\u0007J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/facebook/appevents/aam/MetadataRule$Companion;", "", "()V", "FIELD_K", "", "FIELD_K_DELIMITER", "FIELD_V", "rules", "", "Lcom/facebook/appevents/aam/MetadataRule;", "constructRules", "", "jsonObject", "Lorg/json/JSONObject;", "getEnabledRuleNames", "", "getRules", "updateRules", "rulesFromServer", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Set<com.facebook.appevents.aam.MetadataRule> getRules() {
            return new java.util.HashSet(com.facebook.appevents.aam.MetadataRule.access$getRules$cp());
        }

        @kotlin.jvm.JvmStatic
        public final void updateRules(java.lang.String rulesFromServer) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rulesFromServer, "rulesFromServer");
            try {
                com.facebook.appevents.aam.MetadataRule.access$getRules$cp().clear();
                constructRules(new org.json.JSONObject(rulesFromServer));
            } catch (org.json.JSONException unused) {
            }
        }

        @kotlin.jvm.JvmStatic
        public final java.util.Set<java.lang.String> getEnabledRuleNames() {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = com.facebook.appevents.aam.MetadataRule.access$getRules$cp().iterator();
            while (it.hasNext()) {
                hashSet.add(((com.facebook.appevents.aam.MetadataRule) it.next()).getName());
            }
            return hashSet;
        }

        private final void constructRules(org.json.JSONObject jsonObject) {
            java.util.Iterator<java.lang.String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                java.lang.String key = keys.next();
                org.json.JSONObject optJSONObject = jsonObject.optJSONObject(key);
                if (optJSONObject != null) {
                    java.lang.String k = optJSONObject.optString(com.facebook.appevents.aam.MetadataRule.FIELD_K);
                    java.lang.String v = optJSONObject.optString("v");
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(k, "k");
                    java.lang.String str = k;
                    if (str.length() != 0) {
                        java.util.Set access$getRules$cp = com.facebook.appevents.aam.MetadataRule.access$getRules$cp();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
                        java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{com.facebook.appevents.aam.MetadataRule.FIELD_K_DELIMITER}, false, 0, 6, (java.lang.Object) null);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(v, "v");
                        access$getRules$cp.add(new com.facebook.appevents.aam.MetadataRule(key, split$default, v, null));
                    }
                }
            }
        }
    }

    public final java.util.List<java.lang.String> getKeyRules() {
        if (com.facebook.internal.instrument.crashshield.CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return new java.util.ArrayList(this.keyRules);
        } catch (java.lang.Throwable th) {
            com.facebook.internal.instrument.crashshield.CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
