package com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0014J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0014Jz\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b/\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b\f\u0010\u001dR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010+\u001a\u0004\b5\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b6\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010+\u001a\u0004\b7\u0010\u0014R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b8\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageData;", "", "", "creditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "currentCreditLimit", "newCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;", "status", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;", "statusReason", "", "isCreditLimitNotificationsEnabled", "offerId", "maximumProjectedMinimumPaymentDue", "expirationDate", "privacyStatementUrl", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;ZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "component3", "component4", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;", "component5", "()Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;", "component6", "()Z", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;ZLjava/lang/String;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIManageData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCreditAccountId", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/core/CurrencyAmount;", "getCurrentCreditLimit", "getNewCreditLimit", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatus;", "getStatus", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/cli/CLIOfferStatusReason;", "getStatusReason", "Z", "getOfferId", "getMaximumProjectedMinimumPaymentDue", "getExpirationDate", "getPrivacyStatementUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CLIManageData {
    public static final int $stable = 0;
    private final java.lang.String creditAccountId;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit;
    private final java.lang.String expirationDate;
    private final boolean isCreditLimitNotificationsEnabled;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount maximumProjectedMinimumPaymentDue;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit;
    private final java.lang.String offerId;
    private final java.lang.String privacyStatementUrl;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus status;
    private final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason statusReason;

    public CLIManageData(java.lang.String str, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason, boolean z, java.lang.String str2, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyAmount3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.creditAccountId = str;
        this.currentCreditLimit = currencyAmount;
        this.newCreditLimit = currencyAmount2;
        this.status = cLIOfferStatus;
        this.statusReason = cLIOfferStatusReason;
        this.isCreditLimitNotificationsEnabled = z;
        this.offerId = str2;
        this.maximumProjectedMinimumPaymentDue = currencyAmount3;
        this.expirationDate = str3;
        this.privacyStatementUrl = str4;
    }

    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
        return this.currentCreditLimit;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewCreditLimit() {
        return this.newCreditLimit;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus getStatus() {
        return this.status;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason getStatusReason() {
        return this.statusReason;
    }

    public final boolean isCreditLimitNotificationsEnabled() {
        return this.isCreditLimitNotificationsEnabled;
    }

    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMaximumProjectedMinimumPaymentDue() {
        return this.maximumProjectedMinimumPaymentDue;
    }

    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    public final java.lang.String getPrivacyStatementUrl() {
        return this.privacyStatementUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.creditAccountId;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount = this.currentCreditLimit;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount2 = this.newCreditLimit;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus = this.status;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason = this.statusReason;
        boolean z = this.isCreditLimitNotificationsEnabled;
        java.lang.String str2 = this.offerId;
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currencyAmount3 = this.maximumProjectedMinimumPaymentDue;
        java.lang.String str3 = this.expirationDate;
        java.lang.String str4 = this.privacyStatementUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CLIManageData(creditAccountId=");
        sb.append(str);
        sb.append(", currentCreditLimit=");
        sb.append(currencyAmount);
        sb.append(", newCreditLimit=");
        sb.append(currencyAmount2);
        sb.append(", status=");
        sb.append(cLIOfferStatus);
        sb.append(", statusReason=");
        sb.append(cLIOfferStatusReason);
        sb.append(", isCreditLimitNotificationsEnabled=");
        sb.append(z);
        sb.append(", offerId=");
        sb.append(str2);
        sb.append(", maximumProjectedMinimumPaymentDue=");
        sb.append(currencyAmount3);
        sb.append(", expirationDate=");
        sb.append(str3);
        sb.append(", privacyStatementUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.creditAccountId.hashCode();
        int hashCode2 = this.currentCreditLimit.hashCode();
        int hashCode3 = this.newCreditLimit.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus cLIOfferStatus = this.status;
        int hashCode4 = cLIOfferStatus == null ? 0 : cLIOfferStatus.hashCode();
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason cLIOfferStatusReason = this.statusReason;
        int hashCode5 = cLIOfferStatusReason == null ? 0 : cLIOfferStatusReason.hashCode();
        int hashCode6 = java.lang.Boolean.hashCode(this.isCreditLimitNotificationsEnabled);
        int hashCode7 = this.offerId.hashCode();
        int hashCode8 = this.maximumProjectedMinimumPaymentDue.hashCode();
        int hashCode9 = this.expirationDate.hashCode();
        java.lang.String str = this.privacyStatementUrl;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData)) {
            return false;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData cLIManageData = (com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.creditAccountId, cLIManageData.creditAccountId) && kotlin.jvm.internal.Intrinsics.areEqual(this.currentCreditLimit, cLIManageData.currentCreditLimit) && kotlin.jvm.internal.Intrinsics.areEqual(this.newCreditLimit, cLIManageData.newCreditLimit) && this.status == cLIManageData.status && this.statusReason == cLIManageData.statusReason && this.isCreditLimitNotificationsEnabled == cLIManageData.isCreditLimitNotificationsEnabled && kotlin.jvm.internal.Intrinsics.areEqual(this.offerId, cLIManageData.offerId) && kotlin.jvm.internal.Intrinsics.areEqual(this.maximumProjectedMinimumPaymentDue, cLIManageData.maximumProjectedMinimumPaymentDue) && kotlin.jvm.internal.Intrinsics.areEqual(this.expirationDate, cLIManageData.expirationDate) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacyStatementUrl, cLIManageData.privacyStatementUrl);
    }

    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData copy(java.lang.String creditAccountId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount currentCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount newCreditLimit, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus status, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason statusReason, boolean isCreditLimitNotificationsEnabled, java.lang.String offerId, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount maximumProjectedMinimumPaymentDue, java.lang.String expirationDate, java.lang.String privacyStatementUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(creditAccountId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentCreditLimit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newCreditLimit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(offerId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maximumProjectedMinimumPaymentDue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(expirationDate, "");
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIManageData(creditAccountId, currentCreditLimit, newCreditLimit, status, statusReason, isCreditLimitNotificationsEnabled, offerId, maximumProjectedMinimumPaymentDue, expirationDate, privacyStatementUrl);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: component8, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getMaximumProjectedMinimumPaymentDue() {
        return this.maximumProjectedMinimumPaymentDue;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCreditLimitNotificationsEnabled() {
        return this.isCreditLimitNotificationsEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatusReason getStatusReason() {
        return this.statusReason;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.cli.CLIOfferStatus getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getNewCreditLimit() {
        return this.newCreditLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.core.CurrencyAmount getCurrentCreditLimit() {
        return this.currentCreditLimit;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getPrivacyStatementUrl() {
        return this.privacyStatementUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCreditAccountId() {
        return this.creditAccountId;
    }
}
