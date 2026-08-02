package com.paypal.android.taptopay.domain.repository.payment;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001d\u0010\u000b"}, d2 = {"Lcom/paypal/android/taptopay/domain/repository/payment/FundingOption;", "", "", "name", "lastDigits", "", "isContingent", "fundingSrcId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/android/taptopay/domain/repository/payment/FundingOption;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFundingSrcId", "Z", "getLastDigits", "getName"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FundingOption {
    private final java.lang.String fundingSrcId;
    private final boolean isContingent;
    private final java.lang.String lastDigits;
    private final java.lang.String name;

    public FundingOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.name = str;
        this.lastDigits = str2;
        this.isContingent = z;
        this.fundingSrcId = str3;
    }

    public /* synthetic */ FundingOption(java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str3);
    }

    public final java.lang.String getFundingSrcId() {
        return this.fundingSrcId;
    }

    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final boolean isContingent() {
        return this.isContingent;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.lastDigits;
        boolean z = this.isContingent;
        java.lang.String str3 = this.fundingSrcId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingOption(name=");
        sb.append(str);
        sb.append(", lastDigits=");
        sb.append(str2);
        sb.append(", isContingent=");
        sb.append(z);
        sb.append(", fundingSrcId=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.name.hashCode() * 31) + this.lastDigits.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isContingent)) * 31) + this.fundingSrcId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.android.taptopay.domain.repository.payment.FundingOption)) {
            return false;
        }
        com.paypal.android.taptopay.domain.repository.payment.FundingOption fundingOption = (com.paypal.android.taptopay.domain.repository.payment.FundingOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingOption.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, fundingOption.lastDigits) && this.isContingent == fundingOption.isContingent && kotlin.jvm.internal.Intrinsics.areEqual(this.fundingSrcId, fundingOption.fundingSrcId);
    }

    public final com.paypal.android.taptopay.domain.repository.payment.FundingOption copy(java.lang.String name2, java.lang.String lastDigits, boolean isContingent, java.lang.String fundingSrcId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSrcId, "");
        return new com.paypal.android.taptopay.domain.repository.payment.FundingOption(name2, lastDigits, isContingent, fundingSrcId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFundingSrcId() {
        return this.fundingSrcId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsContingent() {
        return this.isContingent;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.android.taptopay.domain.repository.payment.FundingOption copy$default(com.paypal.android.taptopay.domain.repository.payment.FundingOption fundingOption, java.lang.String str, java.lang.String str2, boolean z, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = fundingOption.name;
        }
        if ((i & 2) != 0) {
            str2 = fundingOption.lastDigits;
        }
        if ((i & 4) != 0) {
            z = fundingOption.isContingent;
        }
        if ((i & 8) != 0) {
            str3 = fundingOption.fundingSrcId;
        }
        return fundingOption.copy(str, str2, z, str3);
    }
}
