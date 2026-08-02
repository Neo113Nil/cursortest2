package com.paypal.oslo.feature.wallet.banks.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams;", "", "<init>", "()V", "", "getCountryCode", "()Ljava/lang/String;", "countryCode", "ByBankCode", "ByIban", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams$ByBankCode;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams$ByIban;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class BankDetailsParams {
    public static final int $stable = 0;

    public abstract java.lang.String getCountryCode();

    private BankDetailsParams() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams$ByBankCode;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams;", "", "bankCode", "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams$ByBankCode;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBankCode", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ByBankCode extends com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams {
        public static final int $stable = 0;
        private final java.lang.String bankCode;
        private final java.lang.String countryCode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByBankCode(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.bankCode = str;
            this.countryCode = str2;
        }

        public final java.lang.String getBankCode() {
            return this.bankCode;
        }

        @Override // com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.bankCode;
            java.lang.String str2 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ByBankCode(bankCode=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.bankCode.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode byBankCode = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.bankCode, byBankCode.bankCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, byBankCode.countryCode);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode copy(java.lang.String bankCode, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode(bankCode, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBankCode() {
            return this.bankCode;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByBankCode byBankCode, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = byBankCode.bankCode;
            }
            if ((i & 2) != 0) {
                str2 = byBankCode.countryCode;
            }
            return byBankCode.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams$ByIban;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams;", "", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Iban, "countryCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/BankDetailsParams$ByIban;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIban", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ByIban extends com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String iban;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByIban(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.iban = str;
            this.countryCode = str2;
        }

        public final java.lang.String getIban() {
            return this.iban;
        }

        @Override // com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.iban;
            java.lang.String str2 = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ByIban(iban=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.iban.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban byIban = (com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.iban, byIban.iban) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, byIban.countryCode);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban copy(java.lang.String iban, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iban, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban(iban, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIban() {
            return this.iban;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.BankDetailsParams.ByIban byIban, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = byIban.iban;
            }
            if ((i & 2) != 0) {
                str2 = byIban.countryCode;
            }
            return byIban.copy(str, str2);
        }
    }

    public /* synthetic */ BankDetailsParams(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
