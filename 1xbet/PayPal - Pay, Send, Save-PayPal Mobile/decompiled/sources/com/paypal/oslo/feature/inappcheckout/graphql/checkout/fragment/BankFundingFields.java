package com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/BankFundingFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankSubType;", "subtype", "", "lastDigits", "backupInstrumentId", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankSubType;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankSubType;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankSubType;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/fragment/BankFundingFields;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/type/ExternalBankSubType;", "getSubtype", "Ljava/lang/String;", "getLastDigits", "getBackupInstrumentId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class BankFundingFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String backupInstrumentId;
    private final java.lang.String lastDigits;
    private final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType subtype;

    public BankFundingFields(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType externalBankSubType, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalBankSubType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.subtype = externalBankSubType;
        this.lastDigits = str;
        this.backupInstrumentId = str2;
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType getSubtype() {
        return this.subtype;
    }

    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    public final java.lang.String getBackupInstrumentId() {
        return this.backupInstrumentId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType externalBankSubType = this.subtype;
        java.lang.String str = this.lastDigits;
        java.lang.String str2 = this.backupInstrumentId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BankFundingFields(subtype=");
        sb.append(externalBankSubType);
        sb.append(", lastDigits=");
        sb.append(str);
        sb.append(", backupInstrumentId=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.subtype.hashCode();
        int hashCode2 = this.lastDigits.hashCode();
        java.lang.String str = this.backupInstrumentId;
        return (((hashCode * 31) + hashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.BankFundingFields)) {
            return false;
        }
        com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.BankFundingFields bankFundingFields = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.BankFundingFields) other;
        return this.subtype == bankFundingFields.subtype && kotlin.jvm.internal.Intrinsics.areEqual(this.lastDigits, bankFundingFields.lastDigits) && kotlin.jvm.internal.Intrinsics.areEqual(this.backupInstrumentId, bankFundingFields.backupInstrumentId);
    }

    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.BankFundingFields copy(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType subtype, java.lang.String lastDigits, java.lang.String backupInstrumentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subtype, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastDigits, "");
        return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.BankFundingFields(subtype, lastDigits, backupInstrumentId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBackupInstrumentId() {
        return this.backupInstrumentId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLastDigits() {
        return this.lastDigits;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType getSubtype() {
        return this.subtype;
    }

    public static /* synthetic */ com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.BankFundingFields copy$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.BankFundingFields bankFundingFields, com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType externalBankSubType, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            externalBankSubType = bankFundingFields.subtype;
        }
        if ((i & 2) != 0) {
            str = bankFundingFields.lastDigits;
        }
        if ((i & 4) != 0) {
            str2 = bankFundingFields.backupInstrumentId;
        }
        return bankFundingFields.copy(externalBankSubType, str, str2);
    }
}
