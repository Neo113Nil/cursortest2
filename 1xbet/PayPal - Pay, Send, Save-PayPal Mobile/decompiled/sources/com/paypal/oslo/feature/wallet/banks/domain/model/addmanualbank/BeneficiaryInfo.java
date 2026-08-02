package com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;", "", "PersonalName", "BusinessName", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo$BusinessName;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo$PersonalName;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface BeneficiaryInfo {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo$PersonalName;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo$PersonalName;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PersonalName implements com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo {
        public static final int $stable = 0;
        private final java.lang.String givenName;
        private final java.lang.String surname;

        public PersonalName(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.givenName = str;
            this.surname = str2;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonalName(givenName=");
            sb.append(str);
            sb.append(", surname=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.givenName.hashCode() * 31) + this.surname.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName)) {
                return false;
            }
            com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName personalName = (com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, personalName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, personalName.surname);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName copy(java.lang.String givenName, java.lang.String surname) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(givenName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surname, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName(givenName, surname);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.PersonalName personalName, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = personalName.givenName;
            }
            if ((i & 2) != 0) {
                str2 = personalName.surname;
            }
            return personalName.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo$BusinessName;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BeneficiaryInfo$BusinessName;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class BusinessName implements com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo {
        public static final int $stable = 0;
        private final java.lang.String name;

        public BusinessName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.name;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessName(name=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName) other).name);
        }

        public final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName copy(java.lang.String name2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
            return new com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName(name2);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getName() {
            return this.name;
        }

        public static /* synthetic */ com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName copy$default(com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BeneficiaryInfo.BusinessName businessName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = businessName.name;
            }
            return businessName.copy(str);
        }
    }
}
