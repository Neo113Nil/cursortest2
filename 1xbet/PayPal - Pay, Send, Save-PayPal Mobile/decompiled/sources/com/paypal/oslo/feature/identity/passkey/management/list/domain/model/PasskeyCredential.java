package com.paypal.oslo.feature.identity.passkey.management.list.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001Bs\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013J\u0094\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b.\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b1\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b2\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b3\u0010\u0013R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b4\u0010\u0013R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b5\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b6\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b7\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyCredential;", "", "", "passkeyCredentialId", "rawPasskeyCredentialId", "deviceName", "deviceOperatingSystem", "Ljava/time/Instant;", "createdTime", "lastLoginTime", "lastLoginDevice", "lastLoginLocation", "authenticatorName", "authenticatorAttestationGuid", "authenticatorLightIconUrl", "authenticatorDarkIconUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/time/Instant;", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/passkey/management/list/domain/model/PasskeyCredential;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPasskeyCredentialId", "getRawPasskeyCredentialId", "getDeviceName", "getDeviceOperatingSystem", "Ljava/time/Instant;", "getCreatedTime", "getLastLoginTime", "getLastLoginDevice", "getLastLoginLocation", "getAuthenticatorName", "getAuthenticatorAttestationGuid", "getAuthenticatorLightIconUrl", "getAuthenticatorDarkIconUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PasskeyCredential {
    public static final int $stable = 8;
    private final java.lang.String authenticatorAttestationGuid;
    private final java.lang.String authenticatorDarkIconUrl;
    private final java.lang.String authenticatorLightIconUrl;
    private final java.lang.String authenticatorName;
    private final java.time.Instant createdTime;
    private final java.lang.String deviceName;
    private final java.lang.String deviceOperatingSystem;
    private final java.lang.String lastLoginDevice;
    private final java.lang.String lastLoginLocation;
    private final java.time.Instant lastLoginTime;
    private final java.lang.String passkeyCredentialId;
    private final java.lang.String rawPasskeyCredentialId;

    public PasskeyCredential(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.time.Instant instant, java.time.Instant instant2, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instant, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        this.passkeyCredentialId = str;
        this.rawPasskeyCredentialId = str2;
        this.deviceName = str3;
        this.deviceOperatingSystem = str4;
        this.createdTime = instant;
        this.lastLoginTime = instant2;
        this.lastLoginDevice = str5;
        this.lastLoginLocation = str6;
        this.authenticatorName = str7;
        this.authenticatorAttestationGuid = str8;
        this.authenticatorLightIconUrl = str9;
        this.authenticatorDarkIconUrl = str10;
    }

    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }

    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final java.lang.String getDeviceOperatingSystem() {
        return this.deviceOperatingSystem;
    }

    public final java.time.Instant getCreatedTime() {
        return this.createdTime;
    }

    public final java.time.Instant getLastLoginTime() {
        return this.lastLoginTime;
    }

    public final java.lang.String getLastLoginDevice() {
        return this.lastLoginDevice;
    }

    public final java.lang.String getLastLoginLocation() {
        return this.lastLoginLocation;
    }

    public final java.lang.String getAuthenticatorName() {
        return this.authenticatorName;
    }

    public final java.lang.String getAuthenticatorAttestationGuid() {
        return this.authenticatorAttestationGuid;
    }

    public final java.lang.String getAuthenticatorLightIconUrl() {
        return this.authenticatorLightIconUrl;
    }

    public final java.lang.String getAuthenticatorDarkIconUrl() {
        return this.authenticatorDarkIconUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.passkeyCredentialId;
        java.lang.String str2 = this.rawPasskeyCredentialId;
        java.lang.String str3 = this.deviceName;
        java.lang.String str4 = this.deviceOperatingSystem;
        java.time.Instant instant = this.createdTime;
        java.time.Instant instant2 = this.lastLoginTime;
        java.lang.String str5 = this.lastLoginDevice;
        java.lang.String str6 = this.lastLoginLocation;
        java.lang.String str7 = this.authenticatorName;
        java.lang.String str8 = this.authenticatorAttestationGuid;
        java.lang.String str9 = this.authenticatorLightIconUrl;
        java.lang.String str10 = this.authenticatorDarkIconUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PasskeyCredential(passkeyCredentialId=");
        sb.append(str);
        sb.append(", rawPasskeyCredentialId=");
        sb.append(str2);
        sb.append(", deviceName=");
        sb.append(str3);
        sb.append(", deviceOperatingSystem=");
        sb.append(str4);
        sb.append(", createdTime=");
        sb.append(instant);
        sb.append(", lastLoginTime=");
        sb.append(instant2);
        sb.append(", lastLoginDevice=");
        sb.append(str5);
        sb.append(", lastLoginLocation=");
        sb.append(str6);
        sb.append(", authenticatorName=");
        sb.append(str7);
        sb.append(", authenticatorAttestationGuid=");
        sb.append(str8);
        sb.append(", authenticatorLightIconUrl=");
        sb.append(str9);
        sb.append(", authenticatorDarkIconUrl=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.passkeyCredentialId.hashCode();
        java.lang.String str = this.rawPasskeyCredentialId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.deviceName.hashCode();
        int hashCode4 = this.deviceOperatingSystem.hashCode();
        int hashCode5 = this.createdTime.hashCode();
        java.time.Instant instant = this.lastLoginTime;
        int hashCode6 = instant == null ? 0 : instant.hashCode();
        java.lang.String str2 = this.lastLoginDevice;
        int hashCode7 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.lastLoginLocation;
        int hashCode8 = str3 == null ? 0 : str3.hashCode();
        int hashCode9 = this.authenticatorName.hashCode();
        int hashCode10 = this.authenticatorAttestationGuid.hashCode();
        java.lang.String str4 = this.authenticatorLightIconUrl;
        int hashCode11 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.authenticatorDarkIconUrl;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential)) {
            return false;
        }
        com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential passkeyCredential = (com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.passkeyCredentialId, passkeyCredential.passkeyCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.rawPasskeyCredentialId, passkeyCredential.rawPasskeyCredentialId) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, passkeyCredential.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceOperatingSystem, passkeyCredential.deviceOperatingSystem) && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, passkeyCredential.createdTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastLoginTime, passkeyCredential.lastLoginTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastLoginDevice, passkeyCredential.lastLoginDevice) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastLoginLocation, passkeyCredential.lastLoginLocation) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorName, passkeyCredential.authenticatorName) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorAttestationGuid, passkeyCredential.authenticatorAttestationGuid) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorLightIconUrl, passkeyCredential.authenticatorLightIconUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticatorDarkIconUrl, passkeyCredential.authenticatorDarkIconUrl);
    }

    public final com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential copy(java.lang.String passkeyCredentialId, java.lang.String rawPasskeyCredentialId, java.lang.String deviceName, java.lang.String deviceOperatingSystem, java.time.Instant createdTime, java.time.Instant lastLoginTime, java.lang.String lastLoginDevice, java.lang.String lastLoginLocation, java.lang.String authenticatorName, java.lang.String authenticatorAttestationGuid, java.lang.String authenticatorLightIconUrl, java.lang.String authenticatorDarkIconUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyCredentialId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceOperatingSystem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createdTime, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticatorAttestationGuid, "");
        return new com.paypal.oslo.feature.identity.passkey.management.list.domain.model.PasskeyCredential(passkeyCredentialId, rawPasskeyCredentialId, deviceName, deviceOperatingSystem, createdTime, lastLoginTime, lastLoginDevice, lastLoginLocation, authenticatorName, authenticatorAttestationGuid, authenticatorLightIconUrl, authenticatorDarkIconUrl);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getAuthenticatorName() {
        return this.authenticatorName;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getLastLoginLocation() {
        return this.lastLoginLocation;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLastLoginDevice() {
        return this.lastLoginDevice;
    }

    /* renamed from: component6, reason: from getter */
    public final java.time.Instant getLastLoginTime() {
        return this.lastLoginTime;
    }

    /* renamed from: component5, reason: from getter */
    public final java.time.Instant getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getDeviceOperatingSystem() {
        return this.deviceOperatingSystem;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRawPasskeyCredentialId() {
        return this.rawPasskeyCredentialId;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getAuthenticatorDarkIconUrl() {
        return this.authenticatorDarkIconUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getAuthenticatorLightIconUrl() {
        return this.authenticatorLightIconUrl;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getAuthenticatorAttestationGuid() {
        return this.authenticatorAttestationGuid;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPasskeyCredentialId() {
        return this.passkeyCredentialId;
    }
}
