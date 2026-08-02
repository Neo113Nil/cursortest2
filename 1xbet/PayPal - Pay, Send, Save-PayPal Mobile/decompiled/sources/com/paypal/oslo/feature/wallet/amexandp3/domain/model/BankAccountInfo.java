package com.paypal.oslo.feature.wallet.amexandp3.domain.model;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "", "", "id", "lastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "type", "issuerName", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "instrumentArt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "component4", "component5", "()Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;)Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/BankAccountInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getLastNChars", "Lcom/paypal/oslo/feature/wallet/api/domain/model/BankAccountType;", "getType", "getIssuerName", "Lcom/paypal/oslo/feature/wallet/amexandp3/domain/model/InstrumentArt;", "getInstrumentArt"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BankAccountInfo {
    public static final int $stable = 0;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt;
    private final java.lang.String issuerName;
    private final java.lang.String lastNChars;
    private final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type;

    public BankAccountInfo(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str3, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankAccountType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentArt, "");
        this.id = str;
        this.lastNChars = str2;
        this.type = bankAccountType;
        this.issuerName = str3;
        this.instrumentArt = instrumentArt;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.lastNChars;
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType = this.type;
        java.lang.String str3 = this.issuerName;
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt = this.instrumentArt;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankAccountInfo(id=");
        sb.append(str);
        sb.append(", lastNChars=");
        sb.append(str2);
        sb.append(", type=");
        sb.append(bankAccountType);
        sb.append(", issuerName=");
        sb.append(str3);
        sb.append(", instrumentArt=");
        sb.append(instrumentArt);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.lastNChars.hashCode()) * 31) + this.type.hashCode()) * 31) + this.issuerName.hashCode()) * 31) + this.instrumentArt.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo = (com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, bankAccountInfo.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastNChars, bankAccountInfo.lastNChars) && this.type == bankAccountInfo.type && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerName, bankAccountInfo.issuerName) && kotlin.jvm.internal.Intrinsics.areEqual(this.instrumentArt, bankAccountInfo.instrumentArt);
    }

    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo copy(java.lang.String id, java.lang.String lastNChars, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType type, java.lang.String issuerName, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastNChars, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(issuerName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentArt, "");
        return new com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo(id, lastNChars, type, issuerName, instrumentArt);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt getInstrumentArt() {
        return this.instrumentArt;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIssuerName() {
        return this.issuerName;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastNChars() {
        return this.lastNChars;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo copy$default(com.paypal.oslo.feature.wallet.amexandp3.domain.model.BankAccountInfo bankAccountInfo, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType, java.lang.String str3, com.paypal.oslo.feature.wallet.amexandp3.domain.model.InstrumentArt instrumentArt, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = bankAccountInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = bankAccountInfo.lastNChars;
        }
        java.lang.String str4 = str2;
        if ((i & 4) != 0) {
            bankAccountType = bankAccountInfo.type;
        }
        com.paypal.oslo.feature.wallet.api.domain.model.BankAccountType bankAccountType2 = bankAccountType;
        if ((i & 8) != 0) {
            str3 = bankAccountInfo.issuerName;
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            instrumentArt = bankAccountInfo.instrumentArt;
        }
        return bankAccountInfo.copy(str, str4, bankAccountType2, str5, instrumentArt);
    }
}
