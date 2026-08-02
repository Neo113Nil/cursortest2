package com.paypal.android.threeds.data.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/android/threeds/data/model/Merchant;", "", "", "mcc", "merchantName", "acquirerMerchantId", "acquirerBin", "acquirerCountryCode", "merchantCountryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/android/threeds/data/model/Merchant;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMcc", "getMerchantName", "getAcquirerMerchantId", "getAcquirerBin", "getAcquirerCountryCode", "getMerchantCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Merchant {
    public static final int $stable = 0;

    @com.google.gson.annotations.SerializedName("acquirer_bin")
    private final java.lang.String acquirerBin;

    @com.google.gson.annotations.SerializedName("acquirer_country_code")
    private final java.lang.String acquirerCountryCode;

    @com.google.gson.annotations.SerializedName("acquirer_merchant_id")
    private final java.lang.String acquirerMerchantId;
    private final java.lang.String mcc;

    @com.google.gson.annotations.SerializedName("merchant_country_code")
    private final java.lang.String merchantCountryCode;

    @com.google.gson.annotations.SerializedName("merchant_name")
    private final java.lang.String merchantName;

    public Merchant(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        this.mcc = str;
        this.merchantName = str2;
        this.acquirerMerchantId = str3;
        this.acquirerBin = str4;
        this.acquirerCountryCode = str5;
        this.merchantCountryCode = str6;
    }

    public final java.lang.String getMcc() {
        return this.mcc;
    }

    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    public final java.lang.String getAcquirerMerchantId() {
        return this.acquirerMerchantId;
    }

    public final java.lang.String getAcquirerBin() {
        return this.acquirerBin;
    }

    public final java.lang.String getAcquirerCountryCode() {
        return this.acquirerCountryCode;
    }

    public final java.lang.String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.mcc;
        java.lang.String str2 = this.merchantName;
        java.lang.String str3 = this.acquirerMerchantId;
        java.lang.String str4 = this.acquirerBin;
        java.lang.String str5 = this.acquirerCountryCode;
        java.lang.String str6 = this.merchantCountryCode;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Merchant(mcc=");
        sb.append(str);
        sb.append(", merchantName=");
        sb.append(str2);
        sb.append(", acquirerMerchantId=");
        sb.append(str3);
        sb.append(", acquirerBin=");
        sb.append(str4);
        sb.append(", acquirerCountryCode=");
        sb.append(str5);
        sb.append(", merchantCountryCode=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((this.mcc.hashCode() * 31) + this.merchantName.hashCode()) * 31) + this.acquirerMerchantId.hashCode()) * 31) + this.acquirerBin.hashCode()) * 31) + this.acquirerCountryCode.hashCode()) * 31) + this.merchantCountryCode.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.threeds.data.model.Merchant)) {
            return false;
        }
        com.paypal.android.threeds.data.model.Merchant merchant = (com.paypal.android.threeds.data.model.Merchant) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.mcc, merchant.mcc) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantName, merchant.merchantName) && kotlin.jvm.internal.Intrinsics.areEqual(this.acquirerMerchantId, merchant.acquirerMerchantId) && kotlin.jvm.internal.Intrinsics.areEqual(this.acquirerBin, merchant.acquirerBin) && kotlin.jvm.internal.Intrinsics.areEqual(this.acquirerCountryCode, merchant.acquirerCountryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.merchantCountryCode, merchant.merchantCountryCode);
    }

    public final com.paypal.android.threeds.data.model.Merchant copy(java.lang.String mcc, java.lang.String merchantName, java.lang.String acquirerMerchantId, java.lang.String acquirerBin, java.lang.String acquirerCountryCode, java.lang.String merchantCountryCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mcc, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquirerMerchantId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquirerBin, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquirerCountryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(merchantCountryCode, "");
        return new com.paypal.android.threeds.data.model.Merchant(mcc, merchantName, acquirerMerchantId, acquirerBin, acquirerCountryCode, merchantCountryCode);
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getMerchantCountryCode() {
        return this.merchantCountryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAcquirerCountryCode() {
        return this.acquirerCountryCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getAcquirerBin() {
        return this.acquirerBin;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAcquirerMerchantId() {
        return this.acquirerMerchantId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getMerchantName() {
        return this.merchantName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMcc() {
        return this.mcc;
    }

    public static /* synthetic */ com.paypal.android.threeds.data.model.Merchant copy$default(com.paypal.android.threeds.data.model.Merchant merchant, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = merchant.mcc;
        }
        if ((i & 2) != 0) {
            str2 = merchant.merchantName;
        }
        java.lang.String str7 = str2;
        if ((i & 4) != 0) {
            str3 = merchant.acquirerMerchantId;
        }
        java.lang.String str8 = str3;
        if ((i & 8) != 0) {
            str4 = merchant.acquirerBin;
        }
        java.lang.String str9 = str4;
        if ((i & 16) != 0) {
            str5 = merchant.acquirerCountryCode;
        }
        java.lang.String str10 = str5;
        if ((i & 32) != 0) {
            str6 = merchant.merchantCountryCode;
        }
        return merchant.copy(str, str7, str8, str9, str10, str6);
    }
}
