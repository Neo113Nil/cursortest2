package com.facebook.appevents;

/* compiled from: AppEvent.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002'(BE\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB)\b\u0012\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0013J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\u0017J;\u0010 \u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0003H\u0016J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010%\u001a\u00020&H\u0002R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006)"}, d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "contextName", "", com.ironsource.X3.i.j0, "valueToSum", "", "parameters", "Landroid/os/Bundle;", "isImplicitlyLogged", "", "isInBackground", "currentSessionId", "Ljava/util/UUID;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;)V", "jsonString", "isImplicit", "inBackground", "checksum", "(Ljava/lang/String;ZZLjava/lang/String;)V", "isChecksumValid", "()Z", "jsonObject", "Lorg/json/JSONObject;", "getJsonObject", "()Lorg/json/JSONObject;", "name", "getName", "()Ljava/lang/String;", "calculateChecksum", "getIsImplicit", "getJSONObject", "getJSONObjectForAppEvent", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "toString", "validateParameters", "", "writeReplace", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "SerializationProxyV2", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AppEvent implements java.io.Serializable {
    private static final int MAX_IDENTIFIER_LENGTH = 40;
    private static final long serialVersionUID = 1;
    private final java.lang.String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final org.json.JSONObject jsonObject;
    private final java.lang.String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.facebook.appevents.AppEvent.Companion INSTANCE = new com.facebook.appevents.AppEvent.Companion(null);
    private static final java.util.HashSet<java.lang.String> validatedIdentifiers = new java.util.HashSet<>();

    public /* synthetic */ AppEvent(java.lang.String str, boolean z, boolean z2, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z, z2, str2);
    }

    public final org.json.JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final boolean isImplicit() {
        return this.isImplicit;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public AppEvent(java.lang.String contextName, java.lang.String eventName, java.lang.Double d, android.os.Bundle bundle, boolean z, boolean z2, java.util.UUID uuid) throws org.json.JSONException, com.facebook.FacebookException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contextName, "contextName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
        this.isImplicit = z;
        this.inBackground = z2;
        this.name = eventName;
        this.jsonObject = getJSONObjectForAppEvent(contextName, eventName, d, bundle, uuid);
        this.checksum = calculateChecksum();
    }

    private AppEvent(java.lang.String str, boolean z, boolean z2, java.lang.String str2) {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z;
        java.lang.String optString = jSONObject.optString(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str2;
        this.inBackground = z2;
    }

    public final boolean getIsImplicit() {
        return this.isImplicit;
    }

    /* renamed from: getJSONObject, reason: from getter */
    public final org.json.JSONObject getJsonObject() {
        return this.jsonObject;
    }

    public final boolean isChecksumValid() {
        if (this.checksum == null) {
            return true;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(calculateChecksum(), this.checksum);
    }

    private final org.json.JSONObject getJSONObjectForAppEvent(java.lang.String contextName, java.lang.String eventName, java.lang.Double valueToSum, android.os.Bundle parameters, java.util.UUID currentSessionId) {
        com.facebook.appevents.AppEvent.Companion companion = INSTANCE;
        companion.validateIdentifier(eventName);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager restrictiveDataManager = com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.INSTANCE;
        java.lang.String processEvent = com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.processEvent(eventName);
        if (kotlin.jvm.internal.Intrinsics.areEqual(processEvent, eventName)) {
            com.facebook.appevents.integrity.RedactedEventsManager redactedEventsManager = com.facebook.appevents.integrity.RedactedEventsManager.INSTANCE;
            processEvent = com.facebook.appevents.integrity.RedactedEventsManager.processEventsRedaction(eventName);
        }
        jSONObject.put(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY, processEvent);
        jSONObject.put(com.facebook.appevents.internal.Constants.EVENT_NAME_MD5_EVENT_KEY, companion.md5Checksum(processEvent));
        jSONObject.put(com.facebook.appevents.internal.Constants.LOG_TIME_APP_EVENT_KEY, java.lang.System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", contextName);
        if (currentSessionId != null) {
            jSONObject.put("_session_id", currentSessionId);
        }
        if (parameters != null) {
            java.util.Map<java.lang.String, java.lang.String> validateParameters = validateParameters(parameters);
            for (java.lang.String str : validateParameters.keySet()) {
                jSONObject.put(str, validateParameters.get(str));
            }
        }
        if (valueToSum != null) {
            jSONObject.put(com.facebook.appevents.AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM, valueToSum.doubleValue());
        }
        if (this.inBackground) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.isImplicit) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            com.facebook.internal.Logger.Companion companion2 = com.facebook.internal.Logger.INSTANCE;
            com.facebook.LoggingBehavior loggingBehavior = com.facebook.LoggingBehavior.APP_EVENTS;
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject2, "eventObject.toString()");
            companion2.log(loggingBehavior, "AppEvents", "Created app event '%s'", jSONObject2);
        }
        return jSONObject;
    }

    private final java.util.Map<java.lang.String, java.lang.String> validateParameters(android.os.Bundle parameters) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String key : parameters.keySet()) {
            com.facebook.appevents.AppEvent.Companion companion = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "key");
            companion.validateIdentifier(key);
            java.lang.Object obj = parameters.get(key);
            if (!(obj instanceof java.lang.String) && !(obj instanceof java.lang.Number)) {
                kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                java.lang.String format = java.lang.String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", java.util.Arrays.copyOf(new java.lang.Object[]{obj, key}, 2));
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                throw new com.facebook.FacebookException(format);
            }
            hashMap.put(key, obj.toString());
        }
        if (!com.facebook.appevents.integrity.ProtectedModeManager.INSTANCE.protectedModeIsApplied(parameters)) {
            com.facebook.appevents.integrity.SensitiveParamsManager sensitiveParamsManager = com.facebook.appevents.integrity.SensitiveParamsManager.INSTANCE;
            com.facebook.appevents.integrity.SensitiveParamsManager.processFilterSensitiveParams(hashMap, this.name);
        }
        com.facebook.appevents.integrity.IntegrityManager integrityManager = com.facebook.appevents.integrity.IntegrityManager.INSTANCE;
        com.facebook.appevents.integrity.IntegrityManager.processParameters(hashMap);
        com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager restrictiveDataManager = com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.INSTANCE;
        com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager.processParameters(hashMap, this.name);
        com.facebook.appevents.eventdeactivation.EventDeactivationManager eventDeactivationManager = com.facebook.appevents.eventdeactivation.EventDeactivationManager.INSTANCE;
        com.facebook.appevents.eventdeactivation.EventDeactivationManager.processDeprecatedParameters(hashMap, this.name);
        return hashMap;
    }

    /* compiled from: AppEvent.kt */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "jsonString", "", "isImplicit", "", "inBackground", "checksum", "(Ljava/lang/String;ZZLjava/lang/String;)V", "readResolve", "", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class SerializationProxyV2 implements java.io.Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final java.lang.String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final java.lang.String jsonString;

        public SerializationProxyV2(java.lang.String jsonString, boolean z, boolean z2, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            this.jsonString = jsonString;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str;
        }

        private final java.lang.Object readResolve() throws org.json.JSONException, java.io.ObjectStreamException {
            return new com.facebook.appevents.AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum, null);
        }
    }

    private final java.lang.Object writeReplace() throws java.io.ObjectStreamException {
        java.lang.String jSONObject = this.jsonObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return new com.facebook.appevents.AppEvent.SerializationProxyV2(jSONObject, this.isImplicit, this.inBackground, this.checksum);
    }

    public java.lang.String toString() {
        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
        java.lang.String format = java.lang.String.format("\"%s\", implicit: %b, json: %s", java.util.Arrays.copyOf(new java.lang.Object[]{this.jsonObject.optString(com.facebook.appevents.internal.Constants.EVENT_NAME_EVENT_KEY), java.lang.Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
        return format;
    }

    private final java.lang.String calculateChecksum() {
        com.facebook.appevents.AppEvent.Companion companion = INSTANCE;
        java.lang.String jSONObject = this.jsonObject.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonObject.toString()");
        return companion.md5Checksum(jSONObject);
    }

    /* compiled from: AppEvent.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/AppEvent$Companion;", "", "()V", "MAX_IDENTIFIER_LENGTH", "", "serialVersionUID", "", "validatedIdentifiers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "md5Checksum", "toHash", "validateIdentifier", "", "identifier", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateIdentifier(java.lang.String identifier) {
            boolean contains;
            if (identifier != null) {
                java.lang.String str = identifier;
                if (str.length() != 0 && identifier.length() <= 40) {
                    synchronized (com.facebook.appevents.AppEvent.validatedIdentifiers) {
                        contains = com.facebook.appevents.AppEvent.validatedIdentifiers.contains(identifier);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    if (contains) {
                        return;
                    }
                    if (new kotlin.text.Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matches(str)) {
                        synchronized (com.facebook.appevents.AppEvent.validatedIdentifiers) {
                            com.facebook.appevents.AppEvent.validatedIdentifiers.add(identifier);
                        }
                        return;
                    } else {
                        kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
                        java.lang.String format = java.lang.String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", java.util.Arrays.copyOf(new java.lang.Object[]{identifier}, 1));
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                        throw new com.facebook.FacebookException(format);
                    }
                }
            }
            if (identifier == null) {
                identifier = "<None Provided>";
            }
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject2 = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.String format2 = java.lang.String.format(java.util.Locale.ROOT, "Identifier '%s' must be less than %d characters", java.util.Arrays.copyOf(new java.lang.Object[]{identifier, 40}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
            throw new com.facebook.FacebookException(format2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final java.lang.String md5Checksum(java.lang.String toHash) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName("UTF-8");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(forName, "Charset.forName(charsetName)");
                if (toHash == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = toHash.getBytes(forName);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] digest = messageDigest.digest();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
                com.facebook.appevents.internal.AppEventUtility appEventUtility = com.facebook.appevents.internal.AppEventUtility.INSTANCE;
                return com.facebook.appevents.internal.AppEventUtility.bytesToHex(digest);
            } catch (java.io.UnsupportedEncodingException e) {
                com.facebook.internal.Utility utility = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd("Failed to generate checksum: ", e);
                return "1";
            } catch (java.security.NoSuchAlgorithmException e2) {
                com.facebook.internal.Utility utility2 = com.facebook.internal.Utility.INSTANCE;
                com.facebook.internal.Utility.logd("Failed to generate checksum: ", e2);
                return "0";
            }
        }
    }
}
