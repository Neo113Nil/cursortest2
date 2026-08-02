package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013Jª\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0013R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010.\u001a\u0004\b1\u0010\u0013\"\u0004\b2\u0010,R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010.\u001a\u0004\b3\u0010\u0013\"\u0004\b4\u0010,R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010.\u001a\u0004\b5\u0010\u0013\"\u0004\b6\u0010,R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010.\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u0010,R$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010.\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010,R$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010.\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010,R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u0010,R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b?\u0010\u0013\"\u0004\b@\u0010,R\"\u0010\u0006\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010,R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\bC\u0010\u0013\"\u0004\bD\u0010,R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010.\u001a\u0004\bE\u0010\u0013\"\u0004\bF\u0010,R$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010.\u001a\u0004\bG\u0010\u0013\"\u0004\bH\u0010,"}, d2 = {"Lcom/statsig/androidsdk/StatsigMetadata;", "", "", "stableID", "sdkType", "sdkVersion", "sessionID", "appIdentifier", "appVersion", "deviceManufacturer", "deviceModel", "deviceOS", "locale", com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY, "systemVersion", "systemName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/statsig/androidsdk/StatsigMetadata;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "overrideStableID", "", "overrideStableID$android_sdk_release", "(Ljava/lang/String;)V", "toString", "Ljava/lang/String;", "getAppIdentifier", "setAppIdentifier", "getAppVersion", "setAppVersion", "getDeviceManufacturer", "setDeviceManufacturer", "getDeviceModel", "setDeviceModel", "getDeviceOS", "setDeviceOS", "getLanguage", "setLanguage", "getLocale", "setLocale", "getSdkType", "setSdkType", "getSdkVersion", "setSdkVersion", "getSessionID", "setSessionID", "getStableID", "setStableID", "getSystemName", "setSystemName", "getSystemVersion", "setSystemVersion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatsigMetadata {

    @com.google.gson.annotations.SerializedName("appIdentifier")
    public java.lang.String appIdentifier;

    @com.google.gson.annotations.SerializedName("appVersion")
    public java.lang.String appVersion;

    @com.google.gson.annotations.SerializedName("deviceManufacturer")
    public java.lang.String deviceManufacturer;

    @com.google.gson.annotations.SerializedName("deviceModel")
    public java.lang.String deviceModel;

    @com.google.gson.annotations.SerializedName("deviceOS")
    public java.lang.String deviceOS;

    @com.google.gson.annotations.SerializedName(com.datadog.trace.api.DDTags.LANGUAGE_TAG_KEY)
    public java.lang.String language;

    @com.google.gson.annotations.SerializedName("locale")
    public java.lang.String locale;

    @com.google.gson.annotations.SerializedName("sdkType")
    public java.lang.String sdkType;

    @com.google.gson.annotations.SerializedName("sdkVersion")
    public java.lang.String sdkVersion;

    @com.google.gson.annotations.SerializedName("sessionID")
    public java.lang.String sessionID;

    @com.google.gson.annotations.SerializedName("stableID")
    public java.lang.String stableID;

    @com.google.gson.annotations.SerializedName("systemName")
    public java.lang.String systemName;

    @com.google.gson.annotations.SerializedName("systemVersion")
    public java.lang.String systemVersion;

    public StatsigMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.stableID = str;
        this.sdkType = str2;
        this.sdkVersion = str3;
        this.sessionID = str4;
        this.appIdentifier = str5;
        this.appVersion = str6;
        this.deviceManufacturer = str7;
        this.deviceModel = str8;
        this.deviceOS = str9;
        this.locale = str10;
        this.language = str11;
        this.systemVersion = str12;
        this.systemName = str13;
    }

    public final java.lang.String getStableID() {
        return this.stableID;
    }

    public final void setStableID(java.lang.String str) {
        this.stableID = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StatsigMetadata(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, java.lang.String str13, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r4, r5, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) == 0 ? str13 : null);
        java.lang.String str14;
        java.lang.String str15 = (i & 1) != 0 ? null : str;
        java.lang.String str16 = (i & 2) != 0 ? "android-client" : str2;
        java.lang.String str17 = (i & 4) != 0 ? com.statsig.androidsdk.BuildConfig.VERSION_NAME : str3;
        if ((i & 8) != 0) {
            str14 = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str14, "");
        } else {
            str14 = str4;
        }
    }

    public final java.lang.String getSdkType() {
        return this.sdkType;
    }

    public final void setSdkType(java.lang.String str) {
        this.sdkType = str;
    }

    public final java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    public final void setSdkVersion(java.lang.String str) {
        this.sdkVersion = str;
    }

    public final java.lang.String getSessionID() {
        return this.sessionID;
    }

    public final void setSessionID(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.sessionID = str;
    }

    public final java.lang.String getAppIdentifier() {
        return this.appIdentifier;
    }

    public final void setAppIdentifier(java.lang.String str) {
        this.appIdentifier = str;
    }

    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    public final void setAppVersion(java.lang.String str) {
        this.appVersion = str;
    }

    public final java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final void setDeviceManufacturer(java.lang.String str) {
        this.deviceManufacturer = str;
    }

    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    public final void setDeviceModel(java.lang.String str) {
        this.deviceModel = str;
    }

    public final java.lang.String getDeviceOS() {
        return this.deviceOS;
    }

    public final void setDeviceOS(java.lang.String str) {
        this.deviceOS = str;
    }

    public final java.lang.String getLocale() {
        return this.locale;
    }

    public final void setLocale(java.lang.String str) {
        this.locale = str;
    }

    public final java.lang.String getLanguage() {
        return this.language;
    }

    public final void setLanguage(java.lang.String str) {
        this.language = str;
    }

    public final java.lang.String getSystemVersion() {
        return this.systemVersion;
    }

    public final void setSystemVersion(java.lang.String str) {
        this.systemVersion = str;
    }

    public final java.lang.String getSystemName() {
        return this.systemName;
    }

    public final void setSystemName(java.lang.String str) {
        this.systemName = str;
    }

    public final void overrideStableID$android_sdk_release(java.lang.String overrideStableID) {
        if (overrideStableID == null || kotlin.jvm.internal.Intrinsics.areEqual(overrideStableID, this.stableID)) {
            return;
        }
        this.stableID = overrideStableID;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.stableID;
        java.lang.String str2 = this.sdkType;
        java.lang.String str3 = this.sdkVersion;
        java.lang.String str4 = this.sessionID;
        java.lang.String str5 = this.appIdentifier;
        java.lang.String str6 = this.appVersion;
        java.lang.String str7 = this.deviceManufacturer;
        java.lang.String str8 = this.deviceModel;
        java.lang.String str9 = this.deviceOS;
        java.lang.String str10 = this.locale;
        java.lang.String str11 = this.language;
        java.lang.String str12 = this.systemVersion;
        java.lang.String str13 = this.systemName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StatsigMetadata(stableID=");
        sb.append(str);
        sb.append(", sdkType=");
        sb.append(str2);
        sb.append(", sdkVersion=");
        sb.append(str3);
        sb.append(", sessionID=");
        sb.append(str4);
        sb.append(", appIdentifier=");
        sb.append(str5);
        sb.append(", appVersion=");
        sb.append(str6);
        sb.append(", deviceManufacturer=");
        sb.append(str7);
        sb.append(", deviceModel=");
        sb.append(str8);
        sb.append(", deviceOS=");
        sb.append(str9);
        sb.append(", locale=");
        sb.append(str10);
        sb.append(", language=");
        sb.append(str11);
        sb.append(", systemVersion=");
        sb.append(str12);
        sb.append(", systemName=");
        sb.append(str13);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.stableID;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.sdkType;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.sdkVersion;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        int hashCode4 = this.sessionID.hashCode();
        java.lang.String str4 = this.appIdentifier;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.appVersion;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.deviceManufacturer;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.deviceModel;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.deviceOS;
        int hashCode9 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.locale;
        int hashCode10 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.language;
        int hashCode11 = str10 == null ? 0 : str10.hashCode();
        java.lang.String str11 = this.systemVersion;
        int hashCode12 = str11 == null ? 0 : str11.hashCode();
        java.lang.String str12 = this.systemName;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str12 != null ? str12.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.statsig.androidsdk.StatsigMetadata)) {
            return false;
        }
        com.statsig.androidsdk.StatsigMetadata statsigMetadata = (com.statsig.androidsdk.StatsigMetadata) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.stableID, statsigMetadata.stableID) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkType, statsigMetadata.sdkType) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkVersion, statsigMetadata.sdkVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.sessionID, statsigMetadata.sessionID) && kotlin.jvm.internal.Intrinsics.areEqual(this.appIdentifier, statsigMetadata.appIdentifier) && kotlin.jvm.internal.Intrinsics.areEqual(this.appVersion, statsigMetadata.appVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceManufacturer, statsigMetadata.deviceManufacturer) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceModel, statsigMetadata.deviceModel) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceOS, statsigMetadata.deviceOS) && kotlin.jvm.internal.Intrinsics.areEqual(this.locale, statsigMetadata.locale) && kotlin.jvm.internal.Intrinsics.areEqual(this.language, statsigMetadata.language) && kotlin.jvm.internal.Intrinsics.areEqual(this.systemVersion, statsigMetadata.systemVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.systemName, statsigMetadata.systemName);
    }

    public final com.statsig.androidsdk.StatsigMetadata copy(java.lang.String stableID, java.lang.String sdkType, java.lang.String sdkVersion, java.lang.String sessionID, java.lang.String appIdentifier, java.lang.String appVersion, java.lang.String deviceManufacturer, java.lang.String deviceModel, java.lang.String deviceOS, java.lang.String locale, java.lang.String language, java.lang.String systemVersion, java.lang.String systemName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionID, "");
        return new com.statsig.androidsdk.StatsigMetadata(stableID, sdkType, sdkVersion, sessionID, appIdentifier, appVersion, deviceManufacturer, deviceModel, deviceOS, locale, language, systemVersion, systemName);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getDeviceOS() {
        return this.deviceOS;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getAppVersion() {
        return this.appVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAppIdentifier() {
        return this.appIdentifier;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSessionID() {
        return this.sessionID;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSdkVersion() {
        return this.sdkVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSdkType() {
        return this.sdkType;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getSystemName() {
        return this.systemName;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getSystemVersion() {
        return this.systemVersion;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getLanguage() {
        return this.language;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getLocale() {
        return this.locale;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getStableID() {
        return this.stableID;
    }

    public StatsigMetadata() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
