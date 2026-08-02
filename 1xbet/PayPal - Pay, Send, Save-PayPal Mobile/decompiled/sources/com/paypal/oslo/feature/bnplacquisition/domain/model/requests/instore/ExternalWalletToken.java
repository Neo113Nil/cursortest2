package com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u0012R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ExternalWalletToken;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "deviceType", "", "referenceId", "fundingPrimaryAccountNumberLastDigits", "fundingPrimaryAccountNumberReferenceId", "tokenPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;", "state", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceSupportedWallet;", "walletType", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceSupportedWallet;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;", "component7", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceSupportedWallet;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceSupportedWallet;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/ExternalWalletToken;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceType;", "getDeviceType", "Ljava/lang/String;", "getReferenceId", "getFundingPrimaryAccountNumberLastDigits", "getFundingPrimaryAccountNumberReferenceId", "getTokenPrimaryAccountNumberLastDigits", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/WalletState;", "getState", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/requests/instore/DeviceSupportedWallet;", "getWalletType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ExternalWalletToken {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType;
    private final java.lang.String fundingPrimaryAccountNumberLastDigits;
    private final java.lang.String fundingPrimaryAccountNumberReferenceId;
    private final java.lang.String referenceId;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState state;
    private final java.lang.String tokenPrimaryAccountNumberLastDigits;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet walletType;

    public ExternalWalletToken(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceSupportedWallet, "");
        this.deviceType = deviceType;
        this.referenceId = str;
        this.fundingPrimaryAccountNumberLastDigits = str2;
        this.fundingPrimaryAccountNumberReferenceId = str3;
        this.tokenPrimaryAccountNumberLastDigits = str4;
        this.state = walletState;
        this.walletType = deviceSupportedWallet;
    }

    public /* synthetic */ ExternalWalletToken(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(deviceType, (i & 2) != 0 ? null : str, str2, (i & 8) != 0 ? null : str3, str4, walletState, deviceSupportedWallet);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType getDeviceType() {
        return this.deviceType;
    }

    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
        return this.fundingPrimaryAccountNumberLastDigits;
    }

    public final java.lang.String getFundingPrimaryAccountNumberReferenceId() {
        return this.fundingPrimaryAccountNumberReferenceId;
    }

    public final java.lang.String getTokenPrimaryAccountNumberLastDigits() {
        return this.tokenPrimaryAccountNumberLastDigits;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState getState() {
        return this.state;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet getWalletType() {
        return this.walletType;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType = this.deviceType;
        java.lang.String str = this.referenceId;
        java.lang.String str2 = this.fundingPrimaryAccountNumberLastDigits;
        java.lang.String str3 = this.fundingPrimaryAccountNumberReferenceId;
        java.lang.String str4 = this.tokenPrimaryAccountNumberLastDigits;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState = this.state;
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet = this.walletType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExternalWalletToken(deviceType=");
        sb.append(deviceType);
        sb.append(", referenceId=");
        sb.append(str);
        sb.append(", fundingPrimaryAccountNumberLastDigits=");
        sb.append(str2);
        sb.append(", fundingPrimaryAccountNumberReferenceId=");
        sb.append(str3);
        sb.append(", tokenPrimaryAccountNumberLastDigits=");
        sb.append(str4);
        sb.append(", state=");
        sb.append(walletState);
        sb.append(", walletType=");
        sb.append(deviceSupportedWallet);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.deviceType.hashCode();
        java.lang.String str = this.referenceId;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.fundingPrimaryAccountNumberLastDigits.hashCode();
        java.lang.String str2 = this.fundingPrimaryAccountNumberReferenceId;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.tokenPrimaryAccountNumberLastDigits.hashCode()) * 31) + this.state.hashCode()) * 31) + this.walletType.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken externalWalletToken = (com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken) other;
        return this.deviceType == externalWalletToken.deviceType && kotlin.jvm.internal.Intrinsics.areEqual(this.referenceId, externalWalletToken.referenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberLastDigits, externalWalletToken.fundingPrimaryAccountNumberLastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingPrimaryAccountNumberReferenceId, externalWalletToken.fundingPrimaryAccountNumberReferenceId) && kotlin.jvm.internal.Intrinsics.areEqual(this.tokenPrimaryAccountNumberLastDigits, externalWalletToken.tokenPrimaryAccountNumberLastDigits) && this.state == externalWalletToken.state && this.walletType == externalWalletToken.walletType;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken copy(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType, java.lang.String referenceId, java.lang.String fundingPrimaryAccountNumberLastDigits, java.lang.String fundingPrimaryAccountNumberReferenceId, java.lang.String tokenPrimaryAccountNumberLastDigits, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState state, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet walletType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deviceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingPrimaryAccountNumberLastDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenPrimaryAccountNumberLastDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletType, "");
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken(deviceType, referenceId, fundingPrimaryAccountNumberLastDigits, fundingPrimaryAccountNumberReferenceId, tokenPrimaryAccountNumberLastDigits, state, walletType);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet getWalletType() {
        return this.walletType;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState getState() {
        return this.state;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getTokenPrimaryAccountNumberLastDigits() {
        return this.tokenPrimaryAccountNumberLastDigits;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFundingPrimaryAccountNumberReferenceId() {
        return this.fundingPrimaryAccountNumberReferenceId;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFundingPrimaryAccountNumberLastDigits() {
        return this.fundingPrimaryAccountNumberLastDigits;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getReferenceId() {
        return this.referenceId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType getDeviceType() {
        return this.deviceType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.ExternalWalletToken externalWalletToken, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceType deviceType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState, com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.DeviceSupportedWallet deviceSupportedWallet, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            deviceType = externalWalletToken.deviceType;
        }
        if ((i & 2) != 0) {
            str = externalWalletToken.referenceId;
        }
        java.lang.String str5 = str;
        if ((i & 4) != 0) {
            str2 = externalWalletToken.fundingPrimaryAccountNumberLastDigits;
        }
        java.lang.String str6 = str2;
        if ((i & 8) != 0) {
            str3 = externalWalletToken.fundingPrimaryAccountNumberReferenceId;
        }
        java.lang.String str7 = str3;
        if ((i & 16) != 0) {
            str4 = externalWalletToken.tokenPrimaryAccountNumberLastDigits;
        }
        java.lang.String str8 = str4;
        if ((i & 32) != 0) {
            walletState = externalWalletToken.state;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.requests.instore.WalletState walletState2 = walletState;
        if ((i & 64) != 0) {
            deviceSupportedWallet = externalWalletToken.walletType;
        }
        return externalWalletToken.copy(deviceType, str5, str6, str7, str8, walletState2, deviceSupportedWallet);
    }
}
