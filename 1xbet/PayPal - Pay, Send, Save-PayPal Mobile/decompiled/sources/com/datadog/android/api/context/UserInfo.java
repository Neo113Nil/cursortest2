package com.datadog.android.api.context;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001&BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u001e\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\fR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0007¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b#\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010!\u001a\u0004\b$\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b%\u0010\f"}, d2 = {"Lcom/datadog/android/api/context/UserInfo;", "", "", "anonymousId", "id", "name", "email", "", "additionalProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lcom/datadog/android/api/context/UserInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/google/gson/JsonElement;", "toJson$dd_sdk_android_core_release", "()Lcom/google/gson/JsonElement;", "toString", "Ljava/util/Map;", "getAdditionalProperties", "Ljava/lang/String;", "getAnonymousId", "getEmail", "getId", "getName", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UserInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.context.UserInfo.Companion INSTANCE = new com.datadog.android.api.context.UserInfo.Companion(null);
    private static final java.lang.String[] RESERVED_PROPERTIES = {"id", "name", "email"};
    private final java.util.Map<java.lang.String, java.lang.Object> additionalProperties;
    private final java.lang.String anonymousId;
    private final java.lang.String email;
    private final java.lang.String id;
    private final java.lang.String name;

    public UserInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.anonymousId = str;
        this.id = str2;
        this.name = str3;
        this.email = str4;
        this.additionalProperties = map;
    }

    public final java.lang.String getAnonymousId() {
        return this.anonymousId;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public /* synthetic */ UserInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) == 0 ? str4 : null, (i & 16) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final com.google.gson.JsonElement toJson$dd_sdk_android_core_release() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        java.lang.String str = this.anonymousId;
        if (str != null) {
            jsonObject.addProperty("anonymous_id", str);
        }
        java.lang.String str2 = this.id;
        if (str2 != null) {
            jsonObject.addProperty("id", str2);
        }
        java.lang.String str3 = this.name;
        if (str3 != null) {
            jsonObject.addProperty("name", str3);
        }
        java.lang.String str4 = this.email;
        if (str4 != null) {
            jsonObject.addProperty("email", str4);
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.additionalProperties.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.Object value = entry.getValue();
            if (!kotlin.collections.ArraysKt.contains(RESERVED_PROPERTIES, key)) {
                jsonObject.add(key, com.datadog.android.core.internal.utils.JsonSerializer.INSTANCE.toJsonElement(value));
            }
        }
        return jsonObject;
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/api/context/UserInfo$Companion;", "", "<init>", "()V", "", "jsonString", "Lcom/datadog/android/api/context/UserInfo;", "fromJson", "(Ljava/lang/String;)Lcom/datadog/android/api/context/UserInfo;", "Lcom/google/gson/JsonObject;", "jsonObject", "fromJsonObject", "(Lcom/google/gson/JsonObject;)Lcom/datadog/android/api/context/UserInfo;", "", "RESERVED_PROPERTIES", "[Ljava/lang/String;", "getRESERVED_PROPERTIES$dd_sdk_android_core_release", "()[Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.lang.String[] getRESERVED_PROPERTIES$dd_sdk_android_core_release() {
            return com.datadog.android.api.context.UserInfo.RESERVED_PROPERTIES;
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.api.context.UserInfo fromJson(java.lang.String jsonString) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonString, "");
            try {
                com.google.gson.JsonObject asJsonObject = com.google.gson.JsonParser.parseString(jsonString).getAsJsonObject();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
                return fromJsonObject(asJsonObject);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type UserInfo", e);
            }
        }

        @kotlin.jvm.JvmStatic
        public final com.datadog.android.api.context.UserInfo fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "");
            try {
                com.google.gson.JsonElement jsonElement = jsonObject.get("anonymous_id");
                java.lang.String asString = jsonElement != null ? jsonElement.getAsString() : null;
                com.google.gson.JsonElement jsonElement2 = jsonObject.get("id");
                java.lang.String asString2 = jsonElement2 != null ? jsonElement2.getAsString() : null;
                com.google.gson.JsonElement jsonElement3 = jsonObject.get("name");
                java.lang.String asString3 = jsonElement3 != null ? jsonElement3.getAsString() : null;
                com.google.gson.JsonElement jsonElement4 = jsonObject.get("email");
                java.lang.String asString4 = jsonElement4 != null ? jsonElement4.getAsString() : null;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.String, com.google.gson.JsonElement> entry : jsonObject.entrySet()) {
                    if (!kotlin.collections.ArraysKt.contains(getRESERVED_PROPERTIES$dd_sdk_android_core_release(), entry.getKey())) {
                        java.lang.String key = entry.getKey();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                        linkedHashMap.put(key, entry.getValue());
                    }
                }
                return new com.datadog.android.api.context.UserInfo(asString, asString2, asString3, asString4, linkedHashMap);
            } catch (java.lang.IllegalStateException e) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type UserInfo", e);
            } catch (java.lang.NullPointerException e2) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type UserInfo", e2);
            } catch (java.lang.NumberFormatException e3) {
                throw new com.google.gson.JsonParseException("Unable to parse json into type UserInfo", e3);
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.anonymousId;
        java.lang.String str2 = this.id;
        java.lang.String str3 = this.name;
        java.lang.String str4 = this.email;
        java.util.Map<java.lang.String, java.lang.Object> map = this.additionalProperties;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserInfo(anonymousId=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", email=");
        sb.append(str4);
        sb.append(", additionalProperties=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.anonymousId;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.id;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.name;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.email;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.additionalProperties.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.datadog.android.api.context.UserInfo)) {
            return false;
        }
        com.datadog.android.api.context.UserInfo userInfo = (com.datadog.android.api.context.UserInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.anonymousId, userInfo.anonymousId) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, userInfo.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, userInfo.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, userInfo.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalProperties, userInfo.additionalProperties);
    }

    public final com.datadog.android.api.context.UserInfo copy(java.lang.String anonymousId, java.lang.String id, java.lang.String name2, java.lang.String email, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
        return new com.datadog.android.api.context.UserInfo(anonymousId, id, name2, email, additionalProperties);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> component5() {
        return this.additionalProperties;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAnonymousId() {
        return this.anonymousId;
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.api.context.UserInfo fromJsonObject(com.google.gson.JsonObject jsonObject) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJsonObject(jsonObject);
    }

    @kotlin.jvm.JvmStatic
    public static final com.datadog.android.api.context.UserInfo fromJson(java.lang.String str) throws com.google.gson.JsonParseException {
        return INSTANCE.fromJson(str);
    }

    public static /* synthetic */ com.datadog.android.api.context.UserInfo copy$default(com.datadog.android.api.context.UserInfo userInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.anonymousId;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.id;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = userInfo.name;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = userInfo.email;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            map = userInfo.additionalProperties;
        }
        return userInfo.copy(str, str5, str6, str7, map);
    }

    public UserInfo() {
        this(null, null, null, null, null, 31, null);
    }
}
