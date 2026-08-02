package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0011J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jr\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b+\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b.\u0010\u0011R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b1\u0010\u0011"}, d2 = {"Lcom/paypal/android/threeds/data/model/SdkData;", "", "", "sdkAppId", "sdkReferenceNumber", "sdkTransactionId", "sdkEncryptedData", "sdkMaximumTimeout", "Lcom/paypal/android/threeds/data/model/SdkEphemeralPublicKey;", "sdkEphemeralPublicKey", "sdkInterface", "", "sdkUiType", "sdkMessageVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/SdkEphemeralPublicKey;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/paypal/android/threeds/data/model/SdkEphemeralPublicKey;", "component7", "component8", "()Ljava/util/List;", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/android/threeds/data/model/SdkEphemeralPublicKey;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/SdkData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getSdkAppId", "getSdkReferenceNumber", "getSdkTransactionId", "getSdkEncryptedData", "getSdkMaximumTimeout", "Lcom/paypal/android/threeds/data/model/SdkEphemeralPublicKey;", "getSdkEphemeralPublicKey", "getSdkInterface", "Ljava/util/List;", "getSdkUiType", "getSdkMessageVersion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SdkData {
    public static final int $stable = 8;

    @com.google.gson.annotations.SerializedName("sdk_app_id")
    private final java.lang.String sdkAppId;

    @com.google.gson.annotations.SerializedName("sdk_encrypted_data")
    private final java.lang.String sdkEncryptedData;

    @com.google.gson.annotations.SerializedName("sdk_ephemeral_public_key")
    private final com.paypal.android.threeds.data.model.SdkEphemeralPublicKey sdkEphemeralPublicKey;

    @com.google.gson.annotations.SerializedName("sdk_interface")
    private final java.lang.String sdkInterface;

    @com.google.gson.annotations.SerializedName("sdk_maximum_timeout")
    private final java.lang.String sdkMaximumTimeout;

    @com.google.gson.annotations.SerializedName("sdk_message_version")
    private final java.lang.String sdkMessageVersion;

    @com.google.gson.annotations.SerializedName("sdk_reference_number")
    private final java.lang.String sdkReferenceNumber;

    @com.google.gson.annotations.SerializedName("sdk_transaction_id")
    private final java.lang.String sdkTransactionId;

    @com.google.gson.annotations.SerializedName("sdk_ui_type")
    private final java.util.List<java.lang.String> sdkUiType;

    public SdkData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.paypal.android.threeds.data.model.SdkEphemeralPublicKey sdkEphemeralPublicKey, java.lang.String str6, java.util.List<java.lang.String> list, java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.sdkAppId = str;
        this.sdkReferenceNumber = str2;
        this.sdkTransactionId = str3;
        this.sdkEncryptedData = str4;
        this.sdkMaximumTimeout = str5;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.sdkInterface = str6;
        this.sdkUiType = list;
        this.sdkMessageVersion = str7;
    }

    public final java.lang.String getSdkAppId() {
        return this.sdkAppId;
    }

    public final java.lang.String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    public final java.lang.String getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public final java.lang.String getSdkEncryptedData() {
        return this.sdkEncryptedData;
    }

    public final java.lang.String getSdkMaximumTimeout() {
        return this.sdkMaximumTimeout;
    }

    public final com.paypal.android.threeds.data.model.SdkEphemeralPublicKey getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    public final java.lang.String getSdkInterface() {
        return this.sdkInterface;
    }

    public final java.util.List<java.lang.String> getSdkUiType() {
        return this.sdkUiType;
    }

    public final java.lang.String getSdkMessageVersion() {
        return this.sdkMessageVersion;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.sdkAppId;
        java.lang.String str2 = this.sdkReferenceNumber;
        java.lang.String str3 = this.sdkTransactionId;
        java.lang.String str4 = this.sdkEncryptedData;
        java.lang.String str5 = this.sdkMaximumTimeout;
        com.paypal.android.threeds.data.model.SdkEphemeralPublicKey sdkEphemeralPublicKey = this.sdkEphemeralPublicKey;
        java.lang.String str6 = this.sdkInterface;
        java.util.List<java.lang.String> list = this.sdkUiType;
        java.lang.String str7 = this.sdkMessageVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SdkData(sdkAppId=");
        sb.append(str);
        sb.append(", sdkReferenceNumber=");
        sb.append(str2);
        sb.append(", sdkTransactionId=");
        sb.append(str3);
        sb.append(", sdkEncryptedData=");
        sb.append(str4);
        sb.append(", sdkMaximumTimeout=");
        sb.append(str5);
        sb.append(", sdkEphemeralPublicKey=");
        sb.append(sdkEphemeralPublicKey);
        sb.append(", sdkInterface=");
        sb.append(str6);
        sb.append(", sdkUiType=");
        sb.append(list);
        sb.append(", sdkMessageVersion=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.sdkAppId.hashCode();
        int hashCode2 = this.sdkReferenceNumber.hashCode();
        int hashCode3 = this.sdkTransactionId.hashCode();
        int hashCode4 = this.sdkEncryptedData.hashCode();
        int hashCode5 = this.sdkMaximumTimeout.hashCode();
        com.paypal.android.threeds.data.model.SdkEphemeralPublicKey sdkEphemeralPublicKey = this.sdkEphemeralPublicKey;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (sdkEphemeralPublicKey == null ? 0 : sdkEphemeralPublicKey.hashCode())) * 31) + this.sdkInterface.hashCode()) * 31) + this.sdkUiType.hashCode()) * 31) + this.sdkMessageVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.SdkData)) {
            return false;
        }
        com.paypal.android.threeds.data.model.SdkData sdkData = (com.paypal.android.threeds.data.model.SdkData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.sdkAppId, sdkData.sdkAppId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkReferenceNumber, sdkData.sdkReferenceNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkTransactionId, sdkData.sdkTransactionId) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkEncryptedData, sdkData.sdkEncryptedData) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkMaximumTimeout, sdkData.sdkMaximumTimeout) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkEphemeralPublicKey, sdkData.sdkEphemeralPublicKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkInterface, sdkData.sdkInterface) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkUiType, sdkData.sdkUiType) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkMessageVersion, sdkData.sdkMessageVersion);
    }

    public final com.paypal.android.threeds.data.model.SdkData copy(java.lang.String sdkAppId, java.lang.String sdkReferenceNumber, java.lang.String sdkTransactionId, java.lang.String sdkEncryptedData, java.lang.String sdkMaximumTimeout, com.paypal.android.threeds.data.model.SdkEphemeralPublicKey sdkEphemeralPublicKey, java.lang.String sdkInterface, java.util.List<java.lang.String> sdkUiType, java.lang.String sdkMessageVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkAppId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkReferenceNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkTransactionId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkEncryptedData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkMaximumTimeout, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkUiType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkMessageVersion, "");
        return new com.paypal.android.threeds.data.model.SdkData(sdkAppId, sdkReferenceNumber, sdkTransactionId, sdkEncryptedData, sdkMaximumTimeout, sdkEphemeralPublicKey, sdkInterface, sdkUiType, sdkMessageVersion);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getSdkMessageVersion() {
        return this.sdkMessageVersion;
    }

    public final java.util.List<java.lang.String> component8() {
        return this.sdkUiType;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getSdkInterface() {
        return this.sdkInterface;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.android.threeds.data.model.SdkEphemeralPublicKey getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getSdkMaximumTimeout() {
        return this.sdkMaximumTimeout;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getSdkEncryptedData() {
        return this.sdkEncryptedData;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getSdkAppId() {
        return this.sdkAppId;
    }
}
