package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0007R$\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\u0005R$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\u0005R0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010!8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\u0005R$\u0010.\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\u0005R$\u00101\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u001b\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\u0005R0\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010!8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010#\u001a\u0004\b5\u0010%\"\u0004\b6\u0010'R0\u00107\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u0010#\u001a\u0004\b8\u0010%\"\u0004\b9\u0010'R$\u0010:\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010\u001b\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b=\u0010\u0007\"\u0004\b>\u0010\u0005"}, d2 = {"Lcom/statsig/androidsdk/StatsigUser;", "", "", "userID", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/statsig/androidsdk/StatsigUser;", "other", "", "equals", "(Ljava/lang/Object;)Z", "getCacheKey", "getCopyForEvaluation$android_sdk_release", "()Lcom/statsig/androidsdk/StatsigUser;", "getCopyForLogging$android_sdk_release", "", "hashCode", "()I", "Lcom/google/gson/Gson;", "gson", "toHashString$android_sdk_release", "(Lcom/google/gson/Gson;)Ljava/lang/String;", "toString", "appVersion", "Ljava/lang/String;", "getAppVersion", "setAppVersion", com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY, "getCountry", "setCountry", "", io.reactivex.annotations.SchedulerSupport.CUSTOM, "Ljava/util/Map;", "getCustom", "()Ljava/util/Map;", "setCustom", "(Ljava/util/Map;)V", "customIDs", "getCustomIDs", "setCustomIDs", "email", "getEmail", "setEmail", "ip", "getIp", "setIp", "locale", "getLocale", "setLocale", "privateAttributes", "getPrivateAttributes", "setPrivateAttributes", "statsigEnvironment", "getStatsigEnvironment$android_sdk_release", "setStatsigEnvironment$android_sdk_release", "userAgent", "getUserAgent", "setUserAgent", "getUserID", "setUserID"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatsigUser {

    @com.google.gson.annotations.SerializedName("appVersion")
    private java.lang.String appVersion;

    @com.google.gson.annotations.SerializedName(com.google.android.libraries.places.api.model.PlaceTypes.COUNTRY)
    private java.lang.String country;

    @com.google.gson.annotations.SerializedName(io.reactivex.annotations.SchedulerSupport.CUSTOM)
    private java.util.Map<java.lang.String, ? extends java.lang.Object> custom;

    @com.google.gson.annotations.SerializedName("customIDs")
    private java.util.Map<java.lang.String, java.lang.String> customIDs;

    @com.google.gson.annotations.SerializedName("email")
    private java.lang.String email;

    @com.google.gson.annotations.SerializedName("ip")
    private java.lang.String ip;

    @com.google.gson.annotations.SerializedName("locale")
    private java.lang.String locale;

    @com.google.gson.annotations.SerializedName("privateAttributes")
    private java.util.Map<java.lang.String, ? extends java.lang.Object> privateAttributes;

    @com.google.gson.annotations.SerializedName("statsigEnvironment")
    private java.util.Map<java.lang.String, java.lang.String> statsigEnvironment;

    @com.google.gson.annotations.SerializedName("userAgent")
    private java.lang.String userAgent;

    @com.google.gson.annotations.SerializedName("userID")
    private java.lang.String userID;

    public StatsigUser(java.lang.String str) {
        this.userID = str;
    }

    public /* synthetic */ StatsigUser(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public final java.lang.String getUserID() {
        return this.userID;
    }

    public final void setUserID(java.lang.String str) {
        this.userID = str;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final void setEmail(java.lang.String str) {
        this.email = str;
    }

    public final java.lang.String getIp() {
        return this.ip;
    }

    public final void setIp(java.lang.String str) {
        this.ip = str;
    }

    public final java.lang.String getUserAgent() {
        return this.userAgent;
    }

    public final void setUserAgent(java.lang.String str) {
        this.userAgent = str;
    }

    public final java.lang.String getCountry() {
        return this.country;
    }

    public final void setCountry(java.lang.String str) {
        this.country = str;
    }

    public final java.lang.String getLocale() {
        return this.locale;
    }

    public final void setLocale(java.lang.String str) {
        this.locale = str;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final void setAppVersion(java.lang.String str) {
        this.appVersion = str;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getCustom() {
        return this.custom;
    }

    public final void setCustom(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.custom = map;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getPrivateAttributes() {
        return this.privateAttributes;
    }

    public final void setPrivateAttributes(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.privateAttributes = map;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getCustomIDs() {
        return this.customIDs;
    }

    public final void setCustomIDs(java.util.Map<java.lang.String, java.lang.String> map) {
        this.customIDs = map;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getStatsigEnvironment$android_sdk_release() {
        return this.statsigEnvironment;
    }

    public final void setStatsigEnvironment$android_sdk_release(java.util.Map<java.lang.String, java.lang.String> map) {
        this.statsigEnvironment = map;
    }

    public final com.statsig.androidsdk.StatsigUser getCopyForEvaluation$android_sdk_release() {
        com.statsig.androidsdk.StatsigUser statsigUser = new com.statsig.androidsdk.StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map = this.custom;
        statsigUser.custom = map != null ? kotlin.collections.MapsKt.toMap(map) : null;
        java.util.Map<java.lang.String, java.lang.String> map2 = this.statsigEnvironment;
        statsigUser.statsigEnvironment = map2 != null ? kotlin.collections.MapsKt.toMap(map2) : null;
        java.util.Map<java.lang.String, java.lang.String> map3 = this.customIDs;
        statsigUser.customIDs = map3 != null ? kotlin.collections.MapsKt.toMap(map3) : null;
        java.util.Map<java.lang.String, ? extends java.lang.Object> map4 = this.privateAttributes;
        statsigUser.privateAttributes = map4 != null ? kotlin.collections.MapsKt.toMap(map4) : null;
        return statsigUser;
    }

    public final com.statsig.androidsdk.StatsigUser getCopyForLogging$android_sdk_release() {
        com.statsig.androidsdk.StatsigUser statsigUser = new com.statsig.androidsdk.StatsigUser(this.userID);
        statsigUser.email = this.email;
        statsigUser.ip = this.ip;
        statsigUser.userAgent = this.userAgent;
        statsigUser.country = this.country;
        statsigUser.locale = this.locale;
        statsigUser.appVersion = this.appVersion;
        statsigUser.custom = this.custom;
        statsigUser.statsigEnvironment = this.statsigEnvironment;
        statsigUser.customIDs = this.customIDs;
        statsigUser.privateAttributes = null;
        return statsigUser;
    }

    public final java.lang.String getCacheKey() {
        java.lang.String str = this.userID;
        if (str == null) {
            str = com.statsig.androidsdk.StatsigUserKt.STATSIG_NULL_USER;
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.customIDs;
        if (map == null) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(key);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append(value);
            str = sb.toString();
        }
        return str;
    }

    public final java.lang.String toHashString$android_sdk_release(com.google.gson.Gson gson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "");
        com.statsig.androidsdk.Hashing hashing = com.statsig.androidsdk.Hashing.INSTANCE;
        java.lang.String json = gson.toJson(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(json, "");
        return hashing.getHashedString(json, com.statsig.androidsdk.HashAlgorithm.DJB2);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.userID;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatsigUser(userID=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.userID;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.statsig.androidsdk.StatsigUser) && kotlin.jvm.internal.Intrinsics.areEqual(this.userID, ((com.statsig.androidsdk.StatsigUser) other).userID);
    }

    public final com.statsig.androidsdk.StatsigUser copy(java.lang.String userID) {
        return new com.statsig.androidsdk.StatsigUser(userID);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getUserID() {
        return this.userID;
    }

    public static /* synthetic */ com.statsig.androidsdk.StatsigUser copy$default(com.statsig.androidsdk.StatsigUser statsigUser, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = statsigUser.userID;
        }
        return statsigUser.copy(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StatsigUser() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
