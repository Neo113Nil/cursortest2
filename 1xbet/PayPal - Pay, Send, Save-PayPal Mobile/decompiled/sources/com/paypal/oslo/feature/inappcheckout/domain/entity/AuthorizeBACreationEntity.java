package com.paypal.oslo.feature.inappcheckout.domain.entity;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJn\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u0010R\u001a\u0010\f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b\f\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "", "", "returnURL", "merchantName", "", "status", "intent", "payerID", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "contingency", "selectedFundingInstrumentId", "isUseBalanceSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "component7", "component8", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/inappcheckout/domain/entity/AuthorizeBACreationEntity;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getReturnURL", "getMerchantName", "Ljava/lang/Boolean;", "getStatus", "getIntent", "getPayerID", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/ContingencyEntity;", "getContingency", "getSelectedFundingInstrumentId", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AuthorizeBACreationEntity {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency;
    private final java.lang.String intent;
    private final boolean isUseBalanceSelected;
    private final java.lang.String merchantName;
    private final java.lang.String payerID;
    private final java.lang.String returnURL;
    private final java.lang.String selectedFundingInstrumentId;
    private final java.lang.Boolean status;

    public AuthorizeBACreationEntity(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str5, boolean z) {
        this.returnURL = str;
        this.merchantName = str2;
        this.status = bool;
        this.intent = str3;
        this.payerID = str4;
        this.contingency = contingencyEntity;
        this.selectedFundingInstrumentId = str5;
        this.isUseBalanceSelected = z;
    }

    public /* synthetic */ AuthorizeBACreationEntity(java.lang.String str, java.lang.String str2, java.lang.Boolean bool, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity, java.lang.String str5, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, str3, str4, contingencyEntity, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? false : z);
    }

    public final java.lang.String getReturnURL() {
        return this.returnURL;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.Boolean getStatus() {
        return this.status;
    }

    public final java.lang.String getIntent() {
        return this.intent;
    }

    public final java.lang.String getPayerID() {
        return this.payerID;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
        return this.contingency;
    }

    public final java.lang.String getSelectedFundingInstrumentId() {
        return this.selectedFundingInstrumentId;
    }

    public final boolean isUseBalanceSelected() {
        return this.isUseBalanceSelected;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.returnURL;
        java.lang.String str2 = this.merchantName;
        java.lang.Boolean bool = this.status;
        java.lang.String str3 = this.intent;
        java.lang.String str4 = this.payerID;
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
        java.lang.String str5 = this.selectedFundingInstrumentId;
        boolean z = this.isUseBalanceSelected;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthorizeBACreationEntity(returnURL=");
        sb.append(str);
        sb.append(", merchantName=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(bool);
        sb.append(", intent=");
        sb.append(str3);
        sb.append(", payerID=");
        sb.append(str4);
        sb.append(", contingency=");
        sb.append(contingencyEntity);
        sb.append(", selectedFundingInstrumentId=");
        sb.append(str5);
        sb.append(", isUseBalanceSelected=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.returnURL;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.merchantName;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.Boolean bool = this.status;
        int hashCode3 = bool == null ? 0 : bool.hashCode();
        java.lang.String str3 = this.intent;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.payerID;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingencyEntity = this.contingency;
        int hashCode6 = contingencyEntity == null ? 0 : contingencyEntity.hashCode();
        java.lang.String str5 = this.selectedFundingInstrumentId;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.isUseBalanceSelected);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity authorizeBACreationEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.returnURL, authorizeBACreationEntity.returnURL) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, authorizeBACreationEntity.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, authorizeBACreationEntity.status) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, authorizeBACreationEntity.intent) && kotlin.jvm.internal.Intrinsics.areEqual(this.payerID, authorizeBACreationEntity.payerID) && kotlin.jvm.internal.Intrinsics.areEqual(this.contingency, authorizeBACreationEntity.contingency) && kotlin.jvm.internal.Intrinsics.areEqual(this.selectedFundingInstrumentId, authorizeBACreationEntity.selectedFundingInstrumentId) && this.isUseBalanceSelected == authorizeBACreationEntity.isUseBalanceSelected;
    }

    public final com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity copy(java.lang.String returnURL, java.lang.String merchantName, java.lang.Boolean status, java.lang.String intent, java.lang.String payerID, com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity contingency, java.lang.String selectedFundingInstrumentId, boolean isUseBalanceSelected) {
        return new com.paypal.oslo.feature.inappcheckout.domain.entity.AuthorizeBACreationEntity(returnURL, merchantName, status, intent, payerID, contingency, selectedFundingInstrumentId, isUseBalanceSelected);
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsUseBalanceSelected() {
        return this.isUseBalanceSelected;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getSelectedFundingInstrumentId() {
        return this.selectedFundingInstrumentId;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.domain.entity.ContingencyEntity getContingency() {
        return this.contingency;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getPayerID() {
        return this.payerID;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIntent() {
        return this.intent;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Boolean getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getReturnURL() {
        return this.returnURL;
    }
}
