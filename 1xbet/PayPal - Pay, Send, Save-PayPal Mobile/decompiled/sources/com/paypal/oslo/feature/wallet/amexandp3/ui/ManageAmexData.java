package com.paypal.oslo.feature.wallet.amexandp3.ui;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ManageAmexData;", "", "", "displayName", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "instrumentArt", "balance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "component3", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/amexandp3/ui/ManageAmexData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayName", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "getInstrumentArt", "getBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ManageAmexData {
    public static final int $stable = 0;
    private final java.lang.String balance;
    private final java.lang.String displayName;
    private final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt;

    public ManageAmexData(java.lang.String str, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentArt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.displayName = str;
        this.instrumentArt = instrumentArt;
        this.balance = str2;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    public final java.lang.String getBalance() {
        return this.balance;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.displayName;
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt = this.instrumentArt;
        java.lang.String str2 = this.balance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ManageAmexData(displayName=");
        sb.append(str);
        sb.append(", instrumentArt=");
        sb.append(instrumentArt);
        sb.append(", balance=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.displayName.hashCode() * 31) + this.instrumentArt.hashCode()) * 31) + this.balance.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexData)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexData manageAmexData = (com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, manageAmexData.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentArt, manageAmexData.instrumentArt) && kotlin.jvm.internal.Intrinsics.areEqual(this.balance, manageAmexData.balance);
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexData copy(java.lang.String displayName, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, java.lang.String balance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentArt, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balance, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexData(displayName, instrumentArt, balance);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBalance() {
        return this.balance;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexData copy$default(com.paypal.oslo.feature.wallet.amexandp3.ui.ManageAmexData manageAmexData, java.lang.String str, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = manageAmexData.displayName;
        }
        if ((i & 2) != 0) {
            instrumentArt = manageAmexData.instrumentArt;
        }
        if ((i & 4) != 0) {
            str2 = manageAmexData.balance;
        }
        return manageAmexData.copy(str, instrumentArt, str2);
    }
}
