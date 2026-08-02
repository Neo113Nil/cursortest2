package com.paypal.oslo.feature.balance.domain.model.autoreload;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0014\u0010$\u001a\u00060\u000fj\u0002`\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0012HÆ\u0003¢\u0006\u0004\b(\u0010'J\u008c\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\f\b\u0002\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0012HÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b6\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b7\u0010\u0018R\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b9\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0018R\u001a\u0010\r\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b\r\u0010\"R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b>\u0010\u0018R\u001e\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010%R\u001a\u0010\u0013\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bB\u0010'R\u001a\u0010\u0014\u001a\u00020\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bC\u0010'"}, d2 = {"Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentSavingsOption;", "Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentOption;", "", "id", "instrumentId", "name", "last4Digits", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "mode", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "type", "imageUrl", "", "isMostRecentlyUsed", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "Lcom/paypal/oslo/feature/balance/graphql/type/SavingsAccountStatus;", "accountStatus", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "currentBalance", "totalBalance", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "component6", "()Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "component7", "component8", "()Z", "component9", "component10", "()Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "component11", "()Lcom/paypal/oslo/feature/balance/domain/model/Money;", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;Lcom/paypal/oslo/feature/balance/domain/model/Money;Lcom/paypal/oslo/feature/balance/domain/model/Money;)Lcom/paypal/oslo/feature/balance/domain/model/autoreload/FundingInstrumentSavingsOption;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getInstrumentId", "getName", "getLast4Digits", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentMode;", "getMode", "Lcom/paypal/oslo/feature/balance/domain/model/FundingInstrumentType;", "getType", "getImageUrl", "Z", "getDescription", "Lcom/paypal/oslo/api/graphql/schema/type/SavingsAccountStatus;", "getAccountStatus", "Lcom/paypal/oslo/feature/balance/domain/model/Money;", "getCurrentBalance", "getTotalBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FundingInstrumentSavingsOption implements com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentOption {
    public static final int $stable = 0;
    private final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus;
    private final com.paypal.oslo.feature.balance.domain.model.Money currentBalance;
    private final java.lang.String description;
    private final java.lang.String id;
    private final java.lang.String imageUrl;
    private final java.lang.String instrumentId;
    private final boolean isMostRecentlyUsed;
    private final java.lang.String last4Digits;
    private final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode mode;
    private final java.lang.String name;
    private final com.paypal.oslo.feature.balance.domain.model.Money totalBalance;
    private final com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType type;

    public FundingInstrumentSavingsOption(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode fundingInstrumentMode, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType fundingInstrumentType, java.lang.String str5, boolean z, java.lang.String str6, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus, com.paypal.oslo.feature.balance.domain.model.Money money, com.paypal.oslo.feature.balance.domain.model.Money money2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentMode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fundingInstrumentType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money2, "");
        this.id = str;
        this.instrumentId = str2;
        this.name = str3;
        this.last4Digits = str4;
        this.mode = fundingInstrumentMode;
        this.type = fundingInstrumentType;
        this.imageUrl = str5;
        this.isMostRecentlyUsed = z;
        this.description = str6;
        this.accountStatus = savingsAccountStatus;
        this.currentBalance = money;
        this.totalBalance = money2;
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

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getCurrentBalance() {
        return this.currentBalance;
    }

    public final com.paypal.oslo.feature.balance.domain.model.Money getTotalBalance() {
        return this.totalBalance;
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
        java.lang.String str6 = this.description;
        com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus savingsAccountStatus = this.accountStatus;
        com.paypal.oslo.feature.balance.domain.model.Money money = this.currentBalance;
        com.paypal.oslo.feature.balance.domain.model.Money money2 = this.totalBalance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FundingInstrumentSavingsOption(id=");
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
        sb.append(", description=");
        sb.append(str6);
        sb.append(", accountStatus=");
        sb.append(savingsAccountStatus);
        sb.append(", currentBalance=");
        sb.append(money);
        sb.append(", totalBalance=");
        sb.append(money2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((((((((((((((((this.id.hashCode() * 31) + this.instrumentId.hashCode()) * 31) + this.name.hashCode()) * 31) + this.last4Digits.hashCode()) * 31) + this.mode.hashCode()) * 31) + this.type.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isMostRecentlyUsed)) * 31) + this.description.hashCode()) * 31) + this.accountStatus.hashCode()) * 31) + this.currentBalance.hashCode()) * 31) + this.totalBalance.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption)) {
            return false;
        }
        com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption fundingInstrumentSavingsOption = (com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, fundingInstrumentSavingsOption.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentId, fundingInstrumentSavingsOption.instrumentId) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, fundingInstrumentSavingsOption.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.last4Digits, fundingInstrumentSavingsOption.last4Digits) && this.mode == fundingInstrumentSavingsOption.mode && this.type == fundingInstrumentSavingsOption.type && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, fundingInstrumentSavingsOption.imageUrl) && this.isMostRecentlyUsed == fundingInstrumentSavingsOption.isMostRecentlyUsed && kotlin.jvm.internal.Intrinsics.areEqual(this.description, fundingInstrumentSavingsOption.description) && this.accountStatus == fundingInstrumentSavingsOption.accountStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.currentBalance, fundingInstrumentSavingsOption.currentBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.totalBalance, fundingInstrumentSavingsOption.totalBalance);
    }

    public final com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption copy(java.lang.String id, java.lang.String instrumentId, java.lang.String name2, java.lang.String last4Digits, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentMode mode, com.paypal.oslo.feature.balance.domain.model.FundingInstrumentType type, java.lang.String imageUrl, boolean isMostRecentlyUsed, java.lang.String description, com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus accountStatus, com.paypal.oslo.feature.balance.domain.model.Money currentBalance, com.paypal.oslo.feature.balance.domain.model.Money totalBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(last4Digits, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountStatus, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentBalance, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalBalance, "");
        return new com.paypal.oslo.feature.balance.domain.model.autoreload.FundingInstrumentSavingsOption(id, instrumentId, name2, last4Digits, mode, type, imageUrl, isMostRecentlyUsed, description, accountStatus, currentBalance, totalBalance);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
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
    public final com.paypal.oslo.feature.balance.domain.model.Money getTotalBalance() {
        return this.totalBalance;
    }

    /* renamed from: component11, reason: from getter */
    public final com.paypal.oslo.feature.balance.domain.model.Money getCurrentBalance() {
        return this.currentBalance;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }
}
