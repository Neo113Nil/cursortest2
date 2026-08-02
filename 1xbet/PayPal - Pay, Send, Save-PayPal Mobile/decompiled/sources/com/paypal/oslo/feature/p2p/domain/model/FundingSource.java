package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJv\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b/\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b0\u0010\u0012R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b1\u0010\u0012R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b2\u0010\u0012R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "", "", "id", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSourceType;", "type", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "amount", "nickname", "brand", "issuerName", "lastNChars", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;", "bankAccountType", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/FundingSourceType;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/p2p/domain/model/FundingSourceType;", "component3", "()Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "component4", "component5", "component6", "component7", "component8", "component9", "()Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/FundingSourceType;Lcom/paypal/oslo/feature/p2p/domain/model/Amount;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;)Lcom/paypal/oslo/feature/p2p/domain/model/FundingSource;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/p2p/domain/model/FundingSourceType;", "getType", "Lcom/paypal/oslo/feature/p2p/domain/model/Amount;", "getAmount", "getNickname", "getBrand", "getIssuerName", "getLastNChars", "getValue", "Lcom/paypal/oslo/feature/p2p/domain/model/BankAccountType;", "getBankAccountType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class FundingSource {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.p2p.domain.model.Amount amount;
    private final com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType;
    private final java.lang.String brand;
    private final java.lang.String id;
    private final java.lang.String issuerName;
    private final java.lang.String lastNChars;
    private final java.lang.String nickname;
    private final com.paypal.oslo.feature.p2p.domain.model.FundingSourceType type;
    private final java.lang.String value;

    public FundingSource(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.FundingSourceType fundingSourceType, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingSourceType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        this.id = str;
        this.type = fundingSourceType;
        this.amount = amount;
        this.nickname = str2;
        this.brand = str3;
        this.issuerName = str4;
        this.lastNChars = str5;
        this.value = str6;
        this.bankAccountType = bankAccountType;
    }

    public /* synthetic */ FundingSource(java.lang.String str, com.paypal.oslo.feature.p2p.domain.model.FundingSourceType fundingSourceType, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fundingSourceType, amount, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : bankAccountType);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FundingSourceType getType() {
        return this.type;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
        return this.amount;
    }

    public final java.lang.String getNickname() {
        return this.nickname;
    }

    public final java.lang.String getBrand() {
        return this.brand;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.BankAccountType getBankAccountType() {
        return this.bankAccountType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.p2p.domain.model.FundingSourceType fundingSourceType = this.type;
        com.paypal.oslo.feature.p2p.domain.model.Amount amount = this.amount;
        java.lang.String str2 = this.nickname;
        java.lang.String str3 = this.brand;
        java.lang.String str4 = this.issuerName;
        java.lang.String str5 = this.lastNChars;
        java.lang.String str6 = this.value;
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType = this.bankAccountType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingSource(id=");
        sb.append(str);
        sb.append(", type=");
        sb.append(fundingSourceType);
        sb.append(", amount=");
        sb.append(amount);
        sb.append(", nickname=");
        sb.append(str2);
        sb.append(", brand=");
        sb.append(str3);
        sb.append(", issuerName=");
        sb.append(str4);
        sb.append(", lastNChars=");
        sb.append(str5);
        sb.append(", value=");
        sb.append(str6);
        sb.append(", bankAccountType=");
        sb.append(bankAccountType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.type.hashCode();
        int hashCode3 = this.amount.hashCode();
        java.lang.String str = this.nickname;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.brand;
        int hashCode5 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.issuerName;
        int hashCode6 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.lastNChars;
        int hashCode7 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.value;
        int hashCode8 = str5 == null ? 0 : str5.hashCode();
        com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType = this.bankAccountType;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + (bankAccountType != null ? bankAccountType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.FundingSource)) {
            return false;
        }
        com.paypal.oslo.feature.p2p.domain.model.FundingSource fundingSource = (com.paypal.oslo.feature.p2p.domain.model.FundingSource) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingSource.id) && this.type == fundingSource.type && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, fundingSource.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.nickname, fundingSource.nickname) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, fundingSource.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, fundingSource.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, fundingSource.lastNChars) && kotlin.jvm.internal.Intrinsics.areEqual(this.value, fundingSource.value) && this.bankAccountType == fundingSource.bankAccountType;
    }

    public final com.paypal.oslo.feature.p2p.domain.model.FundingSource copy(java.lang.String id, com.paypal.oslo.feature.p2p.domain.model.FundingSourceType type, com.paypal.oslo.feature.p2p.domain.model.Amount amount, java.lang.String nickname, java.lang.String brand, java.lang.String issuerName, java.lang.String lastNChars, java.lang.String value, com.paypal.oslo.feature.p2p.domain.model.BankAccountType bankAccountType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        return new com.paypal.oslo.feature.p2p.domain.model.FundingSource(id, type, amount, nickname, brand, issuerName, lastNChars, value, bankAccountType);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.BankAccountType getBankAccountType() {
        return this.bankAccountType;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getValue() {
        return this.value;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getBrand() {
        return this.brand;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.Amount getAmount() {
        return this.amount;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.p2p.domain.model.FundingSourceType getType() {
        return this.type;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
