package com.paypal.oslo.feature.savings.domain.model.transfers;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0010J\u0010\u0010\u0017\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010JZ\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b+\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0018R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/transfers/TransferMoneyboxRequest;", "", "", "fromFiID", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.TRANSFER_TYPE, "toFiID", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "amount", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "frequency", "startDate", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;", "component3", "component4", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "component5", "component6", "()Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "component7", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/TransferMoneyboxRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getFromFiID", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferType;", "getTransferType", "getToFiID", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/Money;", "getAmount", "getDescription", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/FrequencyType;", "getFrequency", "getStartDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class TransferMoneyboxRequest {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.Money amount;
    private final java.lang.String description;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency;
    private final java.lang.String fromFiID;
    private final java.lang.String startDate;
    private final java.lang.String toFiID;
    private final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType transferType;

    public TransferMoneyboxRequest(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxTransferType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequencyType, "");
        this.fromFiID = str;
        this.transferType = moneyboxTransferType;
        this.toFiID = str2;
        this.amount = money;
        this.description = str3;
        this.frequency = frequencyType;
        this.startDate = str4;
    }

    public final java.lang.String getFromFiID() {
        return this.fromFiID;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType getTransferType() {
        return this.transferType;
    }

    public final java.lang.String getToFiID() {
        return this.toFiID;
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.Money getAmount() {
        return this.amount;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public /* synthetic */ TransferMoneyboxRequest(java.lang.String str, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, moneyboxTransferType, str2, money, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType.ONE_TIME : frequencyType, (i & 64) != 0 ? null : str4);
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
        return this.frequency;
    }

    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.fromFiID;
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType = this.transferType;
        java.lang.String str2 = this.toFiID;
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money = this.amount;
        java.lang.String str3 = this.description;
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType = this.frequency;
        java.lang.String str4 = this.startDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransferMoneyboxRequest(fromFiID=");
        sb.append(str);
        sb.append(", transferType=");
        sb.append(moneyboxTransferType);
        sb.append(", toFiID=");
        sb.append(str2);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", frequency=");
        sb.append(frequencyType);
        sb.append(", startDate=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.fromFiID.hashCode();
        int hashCode2 = this.transferType.hashCode();
        int hashCode3 = this.toFiID.hashCode();
        int hashCode4 = this.amount.hashCode();
        java.lang.String str = this.description;
        int hashCode5 = str == null ? 0 : str.hashCode();
        int hashCode6 = this.frequency.hashCode();
        java.lang.String str2 = this.startDate;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest transferMoneyboxRequest = (com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.fromFiID, transferMoneyboxRequest.fromFiID) && this.transferType == transferMoneyboxRequest.transferType && kotlin.jvm.internal.Intrinsics.areEqual(this.toFiID, transferMoneyboxRequest.toFiID) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, transferMoneyboxRequest.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, transferMoneyboxRequest.description) && this.frequency == transferMoneyboxRequest.frequency && kotlin.jvm.internal.Intrinsics.areEqual(this.startDate, transferMoneyboxRequest.startDate);
    }

    public final com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest copy(java.lang.String fromFiID, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType transferType, java.lang.String toFiID, com.paypal.oslo.feature.savings.domain.model.transfers.Money amount, java.lang.String description, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequency, java.lang.String startDate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fromFiID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(toFiID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frequency, "");
        return new com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest(fromFiID, transferType, toFiID, amount, description, frequency, startDate);
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getStartDate() {
        return this.startDate;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType getFrequency() {
        return this.frequency;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getToFiID() {
        return this.toFiID;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType getTransferType() {
        return this.transferType;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getFromFiID() {
        return this.fromFiID;
    }

    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest copy$default(com.paypal.oslo.feature.savings.domain.model.transfers.TransferMoneyboxRequest transferMoneyboxRequest, java.lang.String str, com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType, java.lang.String str2, com.paypal.oslo.feature.savings.domain.model.transfers.Money money, java.lang.String str3, com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = transferMoneyboxRequest.fromFiID;
        }
        if ((i & 2) != 0) {
            moneyboxTransferType = transferMoneyboxRequest.transferType;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType moneyboxTransferType2 = moneyboxTransferType;
        if ((i & 4) != 0) {
            str2 = transferMoneyboxRequest.toFiID;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            money = transferMoneyboxRequest.amount;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.Money money2 = money;
        if ((i & 16) != 0) {
            str3 = transferMoneyboxRequest.description;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            frequencyType = transferMoneyboxRequest.frequency;
        }
        com.paypal.oslo.feature.savings.domain.model.transfers.FrequencyType frequencyType2 = frequencyType;
        if ((i & 64) != 0) {
            str4 = transferMoneyboxRequest.startDate;
        }
        return transferMoneyboxRequest.copy(str, moneyboxTransferType2, str5, money2, str6, frequencyType2, str4);
    }
}
