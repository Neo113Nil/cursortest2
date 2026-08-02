package com.paypal.oslo.feature.cashin.domain.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011JJ\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationDetails;", "", "", "code", "codeActivationTime", "codeExpirationTime", "codeType", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationRetailer;", "retailer", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationRetailer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationRetailer;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationRetailer;)Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCode", "getCodeActivationTime", "getCodeExpirationTime", "getCodeType", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInActivationRetailer;", "getRetailer"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CashInActivationDetails {
    public static final int $stable = 8;
    private final java.lang.String code;
    private final java.lang.String codeActivationTime;
    private final java.lang.String codeExpirationTime;
    private final java.lang.String codeType;
    private final com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer retailer;

    public CashInActivationDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer cashInActivationRetailer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.code = str;
        this.codeActivationTime = str2;
        this.codeExpirationTime = str3;
        this.codeType = str4;
        this.retailer = cashInActivationRetailer;
    }

    public final java.lang.String getCode() {
        return this.code;
    }

    public final java.lang.String getCodeActivationTime() {
        return this.codeActivationTime;
    }

    public final java.lang.String getCodeExpirationTime() {
        return this.codeExpirationTime;
    }

    public final java.lang.String getCodeType() {
        return this.codeType;
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer getRetailer() {
        return this.retailer;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.code;
        java.lang.String str2 = this.codeActivationTime;
        java.lang.String str3 = this.codeExpirationTime;
        java.lang.String str4 = this.codeType;
        com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer cashInActivationRetailer = this.retailer;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CashInActivationDetails(code=");
        sb.append(str);
        sb.append(", codeActivationTime=");
        sb.append(str2);
        sb.append(", codeExpirationTime=");
        sb.append(str3);
        sb.append(", codeType=");
        sb.append(str4);
        sb.append(", retailer=");
        sb.append(cashInActivationRetailer);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.code.hashCode();
        java.lang.String str = this.codeActivationTime;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.codeExpirationTime;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.codeType;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer cashInActivationRetailer = this.retailer;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (cashInActivationRetailer != null ? cashInActivationRetailer.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails)) {
            return false;
        }
        com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails cashInActivationDetails = (com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.code, cashInActivationDetails.code) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeActivationTime, cashInActivationDetails.codeActivationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeExpirationTime, cashInActivationDetails.codeExpirationTime) && kotlin.jvm.internal.Intrinsics.areEqual(this.codeType, cashInActivationDetails.codeType) && kotlin.jvm.internal.Intrinsics.areEqual(this.retailer, cashInActivationDetails.retailer);
    }

    public final com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails copy(java.lang.String code, java.lang.String codeActivationTime, java.lang.String codeExpirationTime, java.lang.String codeType, com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer retailer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(code, "");
        return new com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails(code, codeActivationTime, codeExpirationTime, codeType, retailer);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer getRetailer() {
        return this.retailer;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCodeType() {
        return this.codeType;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCodeExpirationTime() {
        return this.codeExpirationTime;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCodeActivationTime() {
        return this.codeActivationTime;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCode() {
        return this.code;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails copy$default(com.paypal.oslo.feature.cashin.domain.model.CashInActivationDetails cashInActivationDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.cashin.domain.model.CashInActivationRetailer cashInActivationRetailer, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = cashInActivationDetails.code;
        }
        if ((i & 2) != 0) {
            str2 = cashInActivationDetails.codeActivationTime;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = cashInActivationDetails.codeExpirationTime;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = cashInActivationDetails.codeType;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            cashInActivationRetailer = cashInActivationDetails.retailer;
        }
        return cashInActivationDetails.copy(str, str5, str6, str7, cashInActivationRetailer);
    }
}
