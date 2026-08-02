package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J|\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b,\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletToken;", "", "", "fundingPrimaryAccountNumberLastDigits", "tokenPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceType;", "deviceType", "issuerName", "referenceId", "state", "deviceName", "walletProvider", "tokenReferenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceType;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/WalletToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingPrimaryAccountNumberLastDigits", "getTokenPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/feature/debitcard/pushprovisioning/domain/model/DeviceType;", "getDeviceType", "getIssuerName", "getReferenceId", "getState", "getDeviceName", "getWalletProvider", "getTokenReferenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WalletToken {
    public static final int $stable = 0;
    private final java.lang.String deviceName;
    private final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType;
    private final java.lang.String fundingPrimaryAccountNumberLastDigits;
    private final java.lang.String issuerName;
    private final java.lang.String referenceId;
    private final java.lang.String state;
    private final java.lang.String tokenPrimaryAccountNumberLastDigits;
    private final java.lang.String tokenReferenceId;
    private final java.lang.String walletProvider;

    public WalletToken(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.fundingPrimaryAccountNumberLastDigits = str;
        this.tokenPrimaryAccountNumberLastDigits = str2;
        this.deviceType = deviceType;
        this.issuerName = str3;
        this.referenceId = str4;
        this.state = str5;
        this.deviceName = str6;
        this.walletProvider = str7;
        this.tokenReferenceId = str8;
    }

    public /* synthetic */ WalletToken(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : deviceType, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? str8 : null);
    }

    public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
        return this.fundingPrimaryAccountNumberLastDigits;
    }

    public final java.lang.String getTokenPrimaryAccountNumberLastDigits() {
        return this.tokenPrimaryAccountNumberLastDigits;
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final java.lang.String getWalletProvider() {
        return this.walletProvider;
    }

    public final java.lang.String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fundingPrimaryAccountNumberLastDigits;
        java.lang.String str2 = this.tokenPrimaryAccountNumberLastDigits;
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType = this.deviceType;
        java.lang.String str3 = this.issuerName;
        java.lang.String str4 = this.referenceId;
        java.lang.String str5 = this.state;
        java.lang.String str6 = this.deviceName;
        java.lang.String str7 = this.walletProvider;
        java.lang.String str8 = this.tokenReferenceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletToken(fundingPrimaryAccountNumberLastDigits=");
        sb.append(str);
        sb.append(", tokenPrimaryAccountNumberLastDigits=");
        sb.append(str2);
        sb.append(", deviceType=");
        sb.append(deviceType);
        sb.append(", issuerName=");
        sb.append(str3);
        sb.append(", referenceId=");
        sb.append(str4);
        sb.append(", state=");
        sb.append(str5);
        sb.append(", deviceName=");
        sb.append(str6);
        sb.append(", walletProvider=");
        sb.append(str7);
        sb.append(", tokenReferenceId=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.fundingPrimaryAccountNumberLastDigits;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.tokenPrimaryAccountNumberLastDigits;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType = this.deviceType;
        int hashCode3 = deviceType == null ? 0 : deviceType.hashCode();
        java.lang.String str3 = this.issuerName;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.referenceId;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.state;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.deviceName;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.walletProvider;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.tokenReferenceId;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken walletToken = (com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberLastDigits, walletToken.fundingPrimaryAccountNumberLastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenPrimaryAccountNumberLastDigits, walletToken.tokenPrimaryAccountNumberLastDigits) && this.deviceType == walletToken.deviceType && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, walletToken.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, walletToken.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, walletToken.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.deviceName, walletToken.deviceName) && kotlin.jvm.internal.Intrinsics.areEqual(this.walletProvider, walletToken.walletProvider) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenReferenceId, walletToken.tokenReferenceId);
    }

    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken copy(java.lang.String fundingPrimaryAccountNumberLastDigits, java.lang.String tokenPrimaryAccountNumberLastDigits, com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType deviceType, java.lang.String issuerName, java.lang.String referenceId, java.lang.String state, java.lang.String deviceName, java.lang.String walletProvider, java.lang.String tokenReferenceId) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.WalletToken(fundingPrimaryAccountNumberLastDigits, tokenPrimaryAccountNumberLastDigits, deviceType, issuerName, referenceId, state, deviceName, walletProvider, tokenReferenceId);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getTokenReferenceId() {
        return this.tokenReferenceId;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getWalletProvider() {
        return this.walletProvider;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.model.DeviceType getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTokenPrimaryAccountNumberLastDigits() {
        return this.tokenPrimaryAccountNumberLastDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
        return this.fundingPrimaryAccountNumberLastDigits;
    }

    public WalletToken() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }
}
