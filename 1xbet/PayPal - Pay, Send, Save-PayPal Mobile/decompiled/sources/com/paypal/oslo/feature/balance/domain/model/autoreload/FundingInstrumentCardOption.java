package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0010\u0010 \u001a\u00020\rHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b%\u0010\u0017J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010\u0017J\u008e\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b0\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b4\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b5\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b:\u0010\u0017R\u001a\u0010\u000e\u001a\u00020\r8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b\u000e\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u00101\u001a\u0004\b>\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00101\u001a\u0004\b?\u0010\u0017R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00101\u001a\u0004\b@\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentCardOption;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentDepositOption;", "", "id", "instrumentId", "name", "last4Digits", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "mode", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "type", "imageUrl", "", "isMostRecentlyUsed", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "maximumLimit", "formattedLimit", "brand", "productClass", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;Ljava/lang/String;ZLcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "component6", "()Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "component7", "component8", "()Z", "component9", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;Ljava/lang/String;ZLcom/paypal/oslo/feature/balance/domain/model/Money;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentCardOption;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getInstrumentId", "getName", "getLast4Digits", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "getMode", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "getType", "getImageUrl", "Z", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getMaximumLimit", "getFormattedLimit", "getBrand", "getProductClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FundingInstrumentCardOption implements com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption, com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentDepositOption {
    public static final int $stable = 0;
    private final java.lang.String brand;
    private final java.lang.String formattedLimit;
    private final java.lang.String id;
    private final java.lang.String imageUrl;
    private final java.lang.String instrumentId;
    private final boolean isMostRecentlyUsed;
    private final java.lang.String last4Digits;
    private final com.paypal.oslo.feature.balance.domain.model.Money maximumLimit;
    private final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode mode;
    private final java.lang.String name;
    private final java.lang.String productClass;
    private final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType type;

    public FundingInstrumentCardOption(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType, java.lang.String str5, boolean z, com.paypal.oslo.feature.balance.domain.model.Money money, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.id = str;
        this.instrumentId = str2;
        this.name = str3;
        this.last4Digits = str4;
        this.mode = fundingInstrumentMode;
        this.type = fundingInstrumentType;
        this.imageUrl = str5;
        this.isMostRecentlyUsed = z;
        this.maximumLimit = money;
        this.formattedLimit = str6;
        this.brand = str7;
        this.productClass = str8;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final java.lang.String getId() {
        return this.id;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final java.lang.String getName() {
        return this.name;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final java.lang.String getLast4Digits() {
        return this.last4Digits;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode getMode() {
        return this.mode;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType getType() {
        return this.type;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption
    public final boolean isMostRecentlyUsed() {
        return this.isMostRecentlyUsed;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentDepositOption
    public final com.paypal.oslo.feature.balance.domain.model.Money getMaximumLimit() {
        return this.maximumLimit;
    }

    @Override // com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentDepositOption
    public final java.lang.String getFormattedLimit() {
        return this.formattedLimit;
    }

    public final java.lang.String getBrand() {
        return this.brand;
    }

    public final java.lang.String getProductClass() {
        return this.productClass;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.instrumentId;
        java.lang.String str3 = this.name;
        java.lang.String str4 = this.last4Digits;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode = this.mode;
        com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType = this.type;
        java.lang.String str5 = this.imageUrl;
        boolean z = this.isMostRecentlyUsed;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.maximumLimit;
        java.lang.String str6 = this.formattedLimit;
        java.lang.String str7 = this.brand;
        java.lang.String str8 = this.productClass;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentCardOption(id=");
        sb.append(str);
        sb.append(", instrumentId=");
        sb.append(str2);
        sb.append(", name=");
        sb.append(str3);
        sb.append(", last4Digits=");
        sb.append(str4);
        sb.append(", mode=");
        sb.append(fundingInstrumentMode);
        sb.append(", type=");
        sb.append(fundingInstrumentType);
        sb.append(", imageUrl=");
        sb.append(str5);
        sb.append(", isMostRecentlyUsed=");
        sb.append(z);
        sb.append(", maximumLimit=");
        sb.append(money);
        sb.append(", formattedLimit=");
        sb.append(str6);
        sb.append(", brand=");
        sb.append(str7);
        sb.append(", productClass=");
        sb.append(str8);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.instrumentId.hashCode();
        int hashCode3 = this.name.hashCode();
        int hashCode4 = this.last4Digits.hashCode();
        int hashCode5 = this.mode.hashCode();
        int hashCode6 = this.type.hashCode();
        int hashCode7 = this.imageUrl.hashCode();
        int hashCode8 = java.lang.Boolean.hashCode(this.isMostRecentlyUsed);
        com.paypal.oslo.feature.balance.domain.model.Money money = this.maximumLimit;
        int hashCode9 = money == null ? 0 : money.hashCode();
        java.lang.String str = this.formattedLimit;
        int hashCode10 = str == null ? 0 : str.hashCode();
        int hashCode11 = this.brand.hashCode();
        java.lang.String str2 = this.productClass;
        return (((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption fundingInstrumentCardOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingInstrumentCardOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, fundingInstrumentCardOption.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrumentCardOption.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.last4Digits, fundingInstrumentCardOption.last4Digits) && this.mode == fundingInstrumentCardOption.mode && this.type == fundingInstrumentCardOption.type && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, fundingInstrumentCardOption.imageUrl) && this.isMostRecentlyUsed == fundingInstrumentCardOption.isMostRecentlyUsed && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumLimit, fundingInstrumentCardOption.maximumLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.formattedLimit, fundingInstrumentCardOption.formattedLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.brand, fundingInstrumentCardOption.brand) && kotlin.jvm.internal.Intrinsics.areEqual(this.productClass, fundingInstrumentCardOption.productClass);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption copy(java.lang.String id, java.lang.String instrumentId, java.lang.String name2, java.lang.String last4Digits, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode mode, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType type, java.lang.String imageUrl, boolean isMostRecentlyUsed, com.paypal.oslo.feature.balance.domain.model.Money maximumLimit, java.lang.String formattedLimit, java.lang.String brand, java.lang.String productClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(last4Digits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(brand, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentCardOption(id, instrumentId, name2, last4Digits, mode, type, imageUrl, isMostRecentlyUsed, maximumLimit, formattedLimit, brand, productClass);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getMaximumLimit() {
        return this.maximumLimit;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsMostRecentlyUsed() {
        return this.isMostRecentlyUsed;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode getMode() {
        return this.mode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLast4Digits() {
        return this.last4Digits;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getInstrumentId() {
        return this.instrumentId;
    }

    /* renamed from: component12, reason: from getter */
    public final java.lang.String getProductClass() {
        return this.productClass;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getBrand() {
        return this.brand;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getFormattedLimit() {
        return this.formattedLimit;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
