package com.paypal.oslo.feature.wallet.fifo.transfer.domain.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016Jh\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0016R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b*\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b+\u0010\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b,\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsResult;", "", "", "id", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "amount", "", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalOption;", "options", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/WithdrawalPreference;", "preferences", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/PotentialInstrument;", "potentialInstruments", "Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/DestinationInstrument;", "ineligibleInstruments", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/fifo/transfer/domain/model/GetWithdrawalOptionsResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getAmount", "Ljava/util/List;", "getOptions", "getPreferences", "getPotentialInstruments", "getIneligibleInstruments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class GetWithdrawalOptionsResult {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money amount;
    private final java.lang.String id;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument> ineligibleInstruments;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> options;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> potentialInstruments;
    private final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference> preferences;

    /* JADX WARN: Multi-variable type inference failed */
    public GetWithdrawalOptionsResult(java.lang.String str, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> list, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference> list2, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> list3, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument> list4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
        this.id = str;
        this.amount = money;
        this.options = list;
        this.preferences = list2;
        this.potentialInstruments = list3;
        this.ineligibleInstruments = list4;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
        return this.amount;
    }

    public /* synthetic */ GetWithdrawalOptionsResult(java.lang.String str, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, money, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 32) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> getOptions() {
        return this.options;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference> getPreferences() {
        return this.preferences;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> getPotentialInstruments() {
        return this.potentialInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument> getIneligibleInstruments() {
        return this.ineligibleInstruments;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.amount;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> list = this.options;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference> list2 = this.preferences;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> list3 = this.potentialInstruments;
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument> list4 = this.ineligibleInstruments;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GetWithdrawalOptionsResult(id=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(money);
        sb.append(", options=");
        sb.append(list);
        sb.append(", preferences=");
        sb.append(list2);
        sb.append(", potentialInstruments=");
        sb.append(list3);
        sb.append(", ineligibleInstruments=");
        sb.append(list4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.id;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.amount.hashCode();
        int hashCode3 = this.options.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference> list = this.preferences;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.potentialInstruments.hashCode()) * 31) + this.ineligibleInstruments.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult getWithdrawalOptionsResult = (com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, getWithdrawalOptionsResult.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.amount, getWithdrawalOptionsResult.amount) && kotlin.jvm.internal.Intrinsics.areEqual(this.options, getWithdrawalOptionsResult.options) && kotlin.jvm.internal.Intrinsics.areEqual(this.preferences, getWithdrawalOptionsResult.preferences) && kotlin.jvm.internal.Intrinsics.areEqual(this.potentialInstruments, getWithdrawalOptionsResult.potentialInstruments) && kotlin.jvm.internal.Intrinsics.areEqual(this.ineligibleInstruments, getWithdrawalOptionsResult.ineligibleInstruments);
    }

    public final com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult copy(java.lang.String id, com.paypal.oslo.feature.wallet.common.domain.model.Money amount, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> options, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference> preferences, java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> potentialInstruments, java.util.List<? extends com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument> ineligibleInstruments) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amount, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(potentialInstruments, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ineligibleInstruments, "");
        return new com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult(id, amount, options, preferences, potentialInstruments, ineligibleInstruments);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.DestinationInstrument> component6() {
        return this.ineligibleInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.PotentialInstrument> component5() {
        return this.potentialInstruments;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalPreference> component4() {
        return this.preferences;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.WithdrawalOption> component3() {
        return this.options;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getAmount() {
        return this.amount;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult copy$default(com.paypal.oslo.feature.wallet.fifo.transfer.domain.model.GetWithdrawalOptionsResult getWithdrawalOptionsResult, java.lang.String str, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = getWithdrawalOptionsResult.id;
        }
        if ((i & 2) != 0) {
            money = getWithdrawalOptionsResult.amount;
        }
        com.paypal.oslo.feature.wallet.common.domain.model.Money money2 = money;
        if ((i & 4) != 0) {
            list = getWithdrawalOptionsResult.options;
        }
        java.util.List list5 = list;
        if ((i & 8) != 0) {
            list2 = getWithdrawalOptionsResult.preferences;
        }
        java.util.List list6 = list2;
        if ((i & 16) != 0) {
            list3 = getWithdrawalOptionsResult.potentialInstruments;
        }
        java.util.List list7 = list3;
        if ((i & 32) != 0) {
            list4 = getWithdrawalOptionsResult.ineligibleInstruments;
        }
        return getWithdrawalOptionsResult.copy(str, money2, list5, list6, list7, list4);
    }
}
