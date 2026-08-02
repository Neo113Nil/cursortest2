package com.paypal.oslo.feature.merchantbanking.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "", "", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "routingNumber", "deepLinkSource", "", "showAccountCreationToast", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/paypal/oslo/feature/merchantbanking/domain/model/AccountRoutingInfoData;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountNumber", "getRoutingNumber", "getDeepLinkSource", "Z", "getShowAccountCreationToast"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AccountRoutingInfoData {
    public static final int $stable = 0;
    private final java.lang.String accountNumber;
    private final java.lang.String deepLinkSource;
    private final java.lang.String routingNumber;
    private final boolean showAccountCreationToast;

    public AccountRoutingInfoData(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.accountNumber = str;
        this.routingNumber = str2;
        this.deepLinkSource = str3;
        this.showAccountCreationToast = z;
    }

    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    public final java.lang.String getRoutingNumber() {
        return this.routingNumber;
    }

    public final java.lang.String getDeepLinkSource() {
        return this.deepLinkSource;
    }

    public final boolean getShowAccountCreationToast() {
        return this.showAccountCreationToast;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accountNumber;
        java.lang.String str2 = this.routingNumber;
        java.lang.String str3 = this.deepLinkSource;
        boolean z = this.showAccountCreationToast;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AccountRoutingInfoData(accountNumber=");
        sb.append(str);
        sb.append(", routingNumber=");
        sb.append(str2);
        sb.append(", deepLinkSource=");
        sb.append(str3);
        sb.append(", showAccountCreationToast=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.accountNumber.hashCode() * 31) + this.routingNumber.hashCode()) * 31) + this.deepLinkSource.hashCode()) * 31) + java.lang.Boolean.hashCode(this.showAccountCreationToast);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData)) {
            return false;
        }
        com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData = (com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accountNumber, accountRoutingInfoData.accountNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.routingNumber, accountRoutingInfoData.routingNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.deepLinkSource, accountRoutingInfoData.deepLinkSource) && this.showAccountCreationToast == accountRoutingInfoData.showAccountCreationToast;
    }

    public final com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData copy(java.lang.String accountNumber, java.lang.String routingNumber, java.lang.String deepLinkSource, boolean showAccountCreationToast) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(routingNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deepLinkSource, "");
        return new com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData(accountNumber, routingNumber, deepLinkSource, showAccountCreationToast);
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getShowAccountCreationToast() {
        return this.showAccountCreationToast;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDeepLinkSource() {
        return this.deepLinkSource;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getRoutingNumber() {
        return this.routingNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccountNumber() {
        return this.accountNumber;
    }

    public static /* synthetic */ com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData copy$default(com.paypal.oslo.feature.merchantbanking.domain.model.AccountRoutingInfoData accountRoutingInfoData, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = accountRoutingInfoData.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = accountRoutingInfoData.routingNumber;
        }
        if ((i & 4) != 0) {
            str3 = accountRoutingInfoData.deepLinkSource;
        }
        if ((i & 8) != 0) {
            z = accountRoutingInfoData.showAccountCreationToast;
        }
        return accountRoutingInfoData.copy(str, str2, str3, z);
    }
}
