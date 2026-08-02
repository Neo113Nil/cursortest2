package com.paypal.oslo.feature.wallet.preferred.domain.model.instore;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentPreference;", "", "Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "balance", "", "Lcom/paypal/oslo/feature/wallet/common/model/PaymentMethod;", "paymentMethods", "", "useBalanceFirst", "", "currentPreferenceId", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/model/Balance;Ljava/util/List;ZLjava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/model/Balance;Ljava/util/List;ZLjava/lang/String;)Lcom/paypal/oslo/feature/wallet/preferred/domain/model/instore/InStorePaymentPreference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/common/model/Balance;", "getBalance", "Ljava/util/List;", "getPaymentMethods", "Z", "getUseBalanceFirst", "Ljava/lang/String;", "getCurrentPreferenceId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class InStorePaymentPreference {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.wallet.common.model.Balance balance;
    private final java.lang.String currentPreferenceId;
    private final java.util.List<com.paypal.oslo.feature.wallet.common.model.PaymentMethod> paymentMethods;
    private final boolean useBalanceFirst;

    /* JADX WARN: Multi-variable type inference failed */
    public InStorePaymentPreference(com.paypal.oslo.feature.wallet.common.model.Balance balance, java.util.List<? extends com.paypal.oslo.feature.wallet.common.model.PaymentMethod> list, boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.balance = balance;
        this.paymentMethods = list;
        this.useBalanceFirst = z;
        this.currentPreferenceId = str;
    }

    public /* synthetic */ InStorePaymentPreference(com.paypal.oslo.feature.wallet.common.model.Balance balance, java.util.List list, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(balance, list, z, (i & 8) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.wallet.common.model.Balance getBalance() {
        return this.balance;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final boolean getUseBalanceFirst() {
        return this.useBalanceFirst;
    }

    public final java.lang.String getCurrentPreferenceId() {
        return this.currentPreferenceId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.model.Balance balance = this.balance;
        java.util.List<com.paypal.oslo.feature.wallet.common.model.PaymentMethod> list = this.paymentMethods;
        boolean z = this.useBalanceFirst;
        java.lang.String str = this.currentPreferenceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InStorePaymentPreference(balance=");
        sb.append(balance);
        sb.append(", paymentMethods=");
        sb.append(list);
        sb.append(", useBalanceFirst=");
        sb.append(z);
        sb.append(", currentPreferenceId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.wallet.common.model.Balance balance = this.balance;
        int hashCode = balance == null ? 0 : balance.hashCode();
        int hashCode2 = this.paymentMethods.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.useBalanceFirst);
        java.lang.String str = this.currentPreferenceId;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference inStorePaymentPreference = (com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.balance, inStorePaymentPreference.balance) && kotlin.jvm.internal.Intrinsics.areEqual(this.paymentMethods, inStorePaymentPreference.paymentMethods) && this.useBalanceFirst == inStorePaymentPreference.useBalanceFirst && kotlin.jvm.internal.Intrinsics.areEqual(this.currentPreferenceId, inStorePaymentPreference.currentPreferenceId);
    }

    public final com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference copy(com.paypal.oslo.feature.wallet.common.model.Balance balance, java.util.List<? extends com.paypal.oslo.feature.wallet.common.model.PaymentMethod> paymentMethods, boolean useBalanceFirst, java.lang.String currentPreferenceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentMethods, "");
        return new com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference(balance, paymentMethods, useBalanceFirst, currentPreferenceId);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrentPreferenceId() {
        return this.currentPreferenceId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUseBalanceFirst() {
        return this.useBalanceFirst;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.common.model.PaymentMethod> component2() {
        return this.paymentMethods;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.model.Balance getBalance() {
        return this.balance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference copy$default(com.paypal.oslo.feature.wallet.preferred.domain.model.instore.InStorePaymentPreference inStorePaymentPreference, com.paypal.oslo.feature.wallet.common.model.Balance balance, java.util.List list, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            balance = inStorePaymentPreference.balance;
        }
        if ((i & 2) != 0) {
            list = inStorePaymentPreference.paymentMethods;
        }
        if ((i & 4) != 0) {
            z = inStorePaymentPreference.useBalanceFirst;
        }
        if ((i & 8) != 0) {
            str = inStorePaymentPreference.currentPreferenceId;
        }
        return inStorePaymentPreference.copy(balance, list, z, str);
    }
}
