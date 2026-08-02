package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/android/threeds/data/model/AcsData;", "", "", "acsUrl", "Ljava/security/interfaces/ECPublicKey;", com.paypal.android.threeds.utils.ConstantUtil.FIELD_ACS_EPHEM_PUB_KEY, com.paypal.android.threeds.utils.ConstantUtil.FIELD_SDK_EPHEM_PUB_KEY, "<init>", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/security/interfaces/ECPublicKey;", "component3", "copy", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)Lcom/paypal/android/threeds/data/model/AcsData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAcsUrl", "Ljava/security/interfaces/ECPublicKey;", "getAcsEphemPubKey", "getSdkEphemPubKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AcsData {
    public static final int $stable = 8;
    private final java.security.interfaces.ECPublicKey acsEphemPubKey;
    private final java.lang.String acsUrl;
    private final java.security.interfaces.ECPublicKey sdkEphemPubKey;

    public AcsData(java.lang.String str, java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPublicKey eCPublicKey2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eCPublicKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eCPublicKey2, "");
        this.acsUrl = str;
        this.acsEphemPubKey = eCPublicKey;
        this.sdkEphemPubKey = eCPublicKey2;
    }

    public final java.lang.String getAcsUrl() {
        return this.acsUrl;
    }

    public final java.security.interfaces.ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    public final java.security.interfaces.ECPublicKey getSdkEphemPubKey() {
        return this.sdkEphemPubKey;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.acsUrl;
        java.security.interfaces.ECPublicKey eCPublicKey = this.acsEphemPubKey;
        java.security.interfaces.ECPublicKey eCPublicKey2 = this.sdkEphemPubKey;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AcsData(acsUrl=");
        sb.append(str);
        sb.append(", acsEphemPubKey=");
        sb.append(eCPublicKey);
        sb.append(", sdkEphemPubKey=");
        sb.append(eCPublicKey2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.acsUrl.hashCode() * 31) + this.acsEphemPubKey.hashCode()) * 31) + this.sdkEphemPubKey.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.AcsData)) {
            return false;
        }
        com.paypal.android.threeds.data.model.AcsData acsData = (com.paypal.android.threeds.data.model.AcsData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.acsUrl, acsData.acsUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.acsEphemPubKey, acsData.acsEphemPubKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.sdkEphemPubKey, acsData.sdkEphemPubKey);
    }

    public final com.paypal.android.threeds.data.model.AcsData copy(java.lang.String acsUrl, java.security.interfaces.ECPublicKey acsEphemPubKey, java.security.interfaces.ECPublicKey sdkEphemPubKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acsEphemPubKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkEphemPubKey, "");
        return new com.paypal.android.threeds.data.model.AcsData(acsUrl, acsEphemPubKey, sdkEphemPubKey);
    }

    /* renamed from: component3, reason: from getter */
    public final java.security.interfaces.ECPublicKey getSdkEphemPubKey() {
        return this.sdkEphemPubKey;
    }

    /* renamed from: component2, reason: from getter */
    public final java.security.interfaces.ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAcsUrl() {
        return this.acsUrl;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.AcsData copy$default(com.paypal.android.threeds.data.model.AcsData acsData, java.lang.String str, java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPublicKey eCPublicKey2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = acsData.acsUrl;
        }
        if ((i & 2) != 0) {
            eCPublicKey = acsData.acsEphemPubKey;
        }
        if ((i & 4) != 0) {
            eCPublicKey2 = acsData.sdkEphemPubKey;
        }
        return acsData.copy(str, eCPublicKey, eCPublicKey2);
    }
}
