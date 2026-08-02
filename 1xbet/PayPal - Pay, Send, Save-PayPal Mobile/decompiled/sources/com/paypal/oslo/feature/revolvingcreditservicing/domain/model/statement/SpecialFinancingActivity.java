package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b1\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingActivity;", "", "", "id", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "originalAmount", "remainingBalance", "Ljava/time/Instant;", "expirationDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingStatus;", "status", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingOfferType;", "offerType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingOfferType;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component4", "component5", "()Ljava/time/Instant;", "component6", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingStatus;", "component7", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingOfferType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/time/Instant;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingOfferType;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingActivity;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getDescription", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getOriginalAmount", "getRemainingBalance", "Ljava/time/Instant;", "getExpirationDate", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingStatus;", "getStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/statement/SpecialFinancingOfferType;", "getOfferType"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SpecialFinancingActivity {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final java.time.Instant expirationDate;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType offerType;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount originalAmount;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingBalance;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus status;

    public SpecialFinancingActivity(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.time.Instant instant, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(specialFinancingStatus, "");
        this.id = str;
        this.description = str2;
        this.originalAmount = currencyAmount;
        this.remainingBalance = currencyAmount2;
        this.expirationDate = instant;
        this.status = specialFinancingStatus;
        this.offerType = specialFinancingOfferType;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getOriginalAmount() {
        return this.originalAmount;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getRemainingBalance() {
        return this.remainingBalance;
    }

    public final java.time.Instant getExpirationDate() {
        return this.expirationDate;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType getOfferType() {
        return this.offerType;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.description;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.originalAmount;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.remainingBalance;
        java.time.Instant instant = this.expirationDate;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus = this.status;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType = this.offerType;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpecialFinancingActivity(id=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", originalAmount=");
        sb.append(currencyAmount);
        sb.append(", remainingBalance=");
        sb.append(currencyAmount2);
        sb.append(", expirationDate=");
        sb.append(instant);
        sb.append(", status=");
        sb.append(specialFinancingStatus);
        sb.append(", offerType=");
        sb.append(specialFinancingOfferType);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.description.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.originalAmount;
        int hashCode3 = currencyAmount == null ? 0 : currencyAmount.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.remainingBalance;
        int hashCode4 = currencyAmount2 == null ? 0 : currencyAmount2.hashCode();
        java.time.Instant instant = this.expirationDate;
        int hashCode5 = instant == null ? 0 : instant.hashCode();
        int hashCode6 = this.status.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType = this.offerType;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (specialFinancingOfferType != null ? specialFinancingOfferType.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity specialFinancingActivity = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, specialFinancingActivity.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, specialFinancingActivity.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.originalAmount, specialFinancingActivity.originalAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.remainingBalance, specialFinancingActivity.remainingBalance) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, specialFinancingActivity.expirationDate) && this.status == specialFinancingActivity.status && this.offerType == specialFinancingActivity.offerType;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity copy(java.lang.String id, java.lang.String description, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount originalAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount remainingBalance, java.time.Instant expirationDate, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus status, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType offerType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity(id, description, originalAmount, remainingBalance, expirationDate, status, offerType);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType getOfferType() {
        return this.offerType;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final java.time.Instant getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getRemainingBalance() {
        return this.remainingBalance;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getOriginalAmount() {
        return this.originalAmount;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity copy$default(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingActivity specialFinancingActivity, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, java.time.Instant instant, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingOfferType specialFinancingOfferType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = specialFinancingActivity.id;
        }
        if ((i & 2) != 0) {
            str2 = specialFinancingActivity.description;
        }
        java.lang.String str3 = str2;
        if ((i & 4) != 0) {
            currencyAmount = specialFinancingActivity.originalAmount;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = currencyAmount;
        if ((i & 8) != 0) {
            currencyAmount2 = specialFinancingActivity.remainingBalance;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount4 = currencyAmount2;
        if ((i & 16) != 0) {
            instant = specialFinancingActivity.expirationDate;
        }
        java.time.Instant instant2 = instant;
        if ((i & 32) != 0) {
            specialFinancingStatus = specialFinancingActivity.status;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.statement.SpecialFinancingStatus specialFinancingStatus2 = specialFinancingStatus;
        if ((i & 64) != 0) {
            specialFinancingOfferType = specialFinancingActivity.offerType;
        }
        return specialFinancingActivity.copy(str, str3, currencyAmount3, currencyAmount4, instant2, specialFinancingStatus2, specialFinancingOfferType);
    }
}
