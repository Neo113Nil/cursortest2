package com.paypal.oslo.core.userstore.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "orthography", "Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment$PersonName;", androidx.autofill.HintConstants.AUTOFILL_HINT_PERSON_NAME, "<init>", "(Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment$PersonName;)V", "component1", "()Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "component2", "()Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment$PersonName;", "copy", "(Lcom/paypal/oslo/api/graphql/schema/type/Orthography;Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment$PersonName;)Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/api/graphql/schema/type/Orthography;", "getOrthography", "Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment$PersonName;", "getPersonName", "PersonName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class PersonNameFragment implements com.apollographql.apollo.api.Fragment.Data {
    private final com.paypal.oslo.api.graphql.schema.type.Orthography orthography;
    private final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName;

    public PersonNameFragment(com.paypal.oslo.api.graphql.schema.type.Orthography orthography, com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        this.orthography = orthography;
        this.personName = personName;
    }

    public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
        return this.orthography;
    }

    public final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName getPersonName() {
        return this.personName;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJd\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\rR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\"\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b#\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b$\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b%\u0010\r"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment$PersonName;", "", "", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "secondSurname", "surname", "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/userstore/graphql/fragment/PersonNameFragment$PersonName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPrefix", "getGivenName", "getMiddleName", "getSecondSurname", "getSurname", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PersonName {
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String secondSurname;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public PersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
            this.prefix = str;
            this.givenName = str2;
            this.middleName = str3;
            this.secondSurname = str4;
            this.surname = str5;
            this.suffix = str6;
            this.fullName = str7;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.prefix;
            java.lang.String str2 = this.givenName;
            java.lang.String str3 = this.middleName;
            java.lang.String str4 = this.secondSurname;
            java.lang.String str5 = this.surname;
            java.lang.String str6 = this.suffix;
            java.lang.String str7 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonName(prefix=");
            sb.append(str);
            sb.append(", givenName=");
            sb.append(str2);
            sb.append(", middleName=");
            sb.append(str3);
            sb.append(", secondSurname=");
            sb.append(str4);
            sb.append(", surname=");
            sb.append(str5);
            sb.append(", suffix=");
            sb.append(str6);
            sb.append(", fullName=");
            sb.append(str7);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.prefix;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.givenName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.middleName;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.secondSurname;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.surname;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.suffix;
            int hashCode6 = str6 == null ? 0 : str6.hashCode();
            java.lang.String str7 = this.fullName;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName)) {
                return false;
            }
            com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName = (com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, personName.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, personName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, personName.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.secondSurname, personName.secondSurname) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, personName.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, personName.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, personName.fullName);
        }

        public final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName copy(java.lang.String prefix, java.lang.String givenName, java.lang.String middleName, java.lang.String secondSurname, java.lang.String surname, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName(prefix, givenName, middleName, secondSurname, surname, suffix, fullName);
        }

        /* renamed from: component7, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getSecondSurname() {
            return this.secondSurname;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName copy$default(com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = personName.prefix;
            }
            if ((i & 2) != 0) {
                str2 = personName.givenName;
            }
            java.lang.String str8 = str2;
            if ((i & 4) != 0) {
                str3 = personName.middleName;
            }
            java.lang.String str9 = str3;
            if ((i & 8) != 0) {
                str4 = personName.secondSurname;
            }
            java.lang.String str10 = str4;
            if ((i & 16) != 0) {
                str5 = personName.surname;
            }
            java.lang.String str11 = str5;
            if ((i & 32) != 0) {
                str6 = personName.suffix;
            }
            java.lang.String str12 = str6;
            if ((i & 64) != 0) {
                str7 = personName.fullName;
            }
            return personName.copy(str, str8, str9, str10, str11, str12, str7);
        }
    }

    public final java.lang.String toString() {
        com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
        com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName = this.personName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonNameFragment(orthography=");
        sb.append(orthography);
        sb.append(", personName=");
        sb.append(personName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.api.graphql.schema.type.Orthography orthography = this.orthography;
        return ((orthography == null ? 0 : orthography.hashCode()) * 31) + this.personName.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment)) {
            return false;
        }
        com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment = (com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment) other;
        return this.orthography == personNameFragment.orthography && kotlin.jvm.internal.Intrinsics.areEqual(this.personName, personNameFragment.personName);
    }

    public final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment copy(com.paypal.oslo.api.graphql.schema.type.Orthography orthography, com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(personName, "");
        return new com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment(orthography, personName);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName getPersonName() {
        return this.personName;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.Orthography getOrthography() {
        return this.orthography;
    }

    public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment copy$default(com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment personNameFragment, com.paypal.oslo.api.graphql.schema.type.Orthography orthography, com.paypal.oslo.core.userstore.graphql.fragment.PersonNameFragment.PersonName personName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            orthography = personNameFragment.orthography;
        }
        if ((i & 2) != 0) {
            personName = personNameFragment.personName;
        }
        return personNameFragment.copy(orthography, personName);
    }
}
