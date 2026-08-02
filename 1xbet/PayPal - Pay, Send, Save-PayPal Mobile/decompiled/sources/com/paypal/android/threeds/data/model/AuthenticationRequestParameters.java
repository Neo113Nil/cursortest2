package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/android/threeds/data/model/AuthenticationRequestParameters;", "", "", "deviceData", "sdkTransactionId", "sdkAppId", "sdkReferenceNumber", "sdkEphemeralPublicKey", "messageVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/AuthenticationRequestParameters;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDeviceData", "getSdkTransactionId", "getSdkAppId", "getSdkReferenceNumber", "getSdkEphemeralPublicKey", "getMessageVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AuthenticationRequestParameters {
    public static final int $stable = 0;
    private final java.lang.String deviceData;
    private final java.lang.String messageVersion;
    private final java.lang.String sdkAppId;
    private final java.lang.String sdkEphemeralPublicKey;
    private final java.lang.String sdkReferenceNumber;
    private final java.lang.String sdkTransactionId;

    public AuthenticationRequestParameters(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.deviceData = str;
        this.sdkTransactionId = str2;
        this.sdkAppId = str3;
        this.sdkReferenceNumber = str4;
        this.sdkEphemeralPublicKey = str5;
        this.messageVersion = str6;
    }

    public final java.lang.String getDeviceData() {
        return this.deviceData;
    }

    public final java.lang.String getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final java.lang.String getSdkAppId() {
        return this.sdkAppId;
    }

    public final java.lang.String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    public final java.lang.String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    public final java.lang.String getMessageVersion() {
        return this.messageVersion;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.deviceData;
        java.lang.String str2 = this.sdkTransactionId;
        java.lang.String str3 = this.sdkAppId;
        java.lang.String str4 = this.sdkReferenceNumber;
        java.lang.String str5 = this.sdkEphemeralPublicKey;
        java.lang.String str6 = this.messageVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationRequestParameters(deviceData=");
        sb.append(str);
        sb.append(", sdkTransactionId=");
        sb.append(str2);
        sb.append(", sdkAppId=");
        sb.append(str3);
        sb.append(", sdkReferenceNumber=");
        sb.append(str4);
        sb.append(", sdkEphemeralPublicKey=");
        sb.append(str5);
        sb.append(", messageVersion=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.deviceData.hashCode() * 31) + this.sdkTransactionId.hashCode()) * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.AuthenticationRequestParameters)) {
            return false;
        }
        com.paypal.android.threeds.data.model.AuthenticationRequestParameters authenticationRequestParameters = (com.paypal.android.threeds.data.model.AuthenticationRequestParameters) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.deviceData, authenticationRequestParameters.deviceData) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkTransactionId, authenticationRequestParameters.sdkTransactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkAppId, authenticationRequestParameters.sdkAppId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkReferenceNumber, authenticationRequestParameters.sdkReferenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkEphemeralPublicKey, authenticationRequestParameters.sdkEphemeralPublicKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.messageVersion, authenticationRequestParameters.messageVersion);
    }

    public final com.paypal.android.threeds.data.model.AuthenticationRequestParameters copy(java.lang.String deviceData, java.lang.String sdkTransactionId, java.lang.String sdkAppId, java.lang.String sdkReferenceNumber, java.lang.String sdkEphemeralPublicKey, java.lang.String messageVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTransactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkAppId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkEphemeralPublicKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageVersion, "");
        return new com.paypal.android.threeds.data.model.AuthenticationRequestParameters(deviceData, sdkTransactionId, sdkAppId, sdkReferenceNumber, sdkEphemeralPublicKey, messageVersion);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMessageVersion() {
        return this.messageVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSdkAppId() {
        return this.sdkAppId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDeviceData() {
        return this.deviceData;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.AuthenticationRequestParameters copy$default(com.paypal.android.threeds.data.model.AuthenticationRequestParameters authenticationRequestParameters, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = authenticationRequestParameters.deviceData;
        }
        if ((i & 2) != 0) {
            str2 = authenticationRequestParameters.sdkTransactionId;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = authenticationRequestParameters.sdkAppId;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = authenticationRequestParameters.sdkReferenceNumber;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = authenticationRequestParameters.sdkEphemeralPublicKey;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = authenticationRequestParameters.messageVersion;
        }
        return authenticationRequestParameters.copy(str, str7, str8, str9, str10, str6);
    }
}
