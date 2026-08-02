package com.paypal.oslo.feature.businesscustomers.graphql.fragment;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002!\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnPersonName;", "onPersonName", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnBusinessName;", "onBusinessName", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnPersonName;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnBusinessName;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnPersonName;", "component3", "()Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnBusinessName;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnPersonName;Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnBusinessName;)Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnPersonName;", "getOnPersonName", "Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnBusinessName;", "getOnBusinessName", "OnPersonName", "OnBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ContactNameFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String __typename;
    private final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName;
    private final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName;

    public ContactNameFragment(java.lang.String str, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.onPersonName = onPersonName;
        this.onBusinessName = onBusinessName;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName getOnPersonName() {
        return this.onPersonName;
    }

    public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName getOnBusinessName() {
        return this.onBusinessName;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnPersonName;", "", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnPersonName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname", "getMiddleName", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnPersonName {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String surname;

        public OnPersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            this.givenName = str;
            this.surname = str2;
            this.middleName = str3;
            this.fullName = str4;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.String str3 = this.middleName;
            java.lang.String str4 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnPersonName(givenName=");
            sb.append(str);
            sb.append(", surname=");
            sb.append(str2);
            sb.append(", middleName=");
            sb.append(str3);
            sb.append(", fullName=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.surname;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.middleName;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.fullName;
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName)) {
                return false;
            }
            com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName = (com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, onPersonName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, onPersonName.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, onPersonName.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, onPersonName.fullName);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName copy(java.lang.String givenName, java.lang.String surname, java.lang.String middleName, java.lang.String fullName) {
            return new com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName(givenName, surname, middleName, fullName);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName copy$default(com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onPersonName.givenName;
            }
            if ((i & 2) != 0) {
                str2 = onPersonName.surname;
            }
            if ((i & 4) != 0) {
                str3 = onPersonName.middleName;
            }
            if ((i & 8) != 0) {
                str4 = onPersonName.fullName;
            }
            return onPersonName.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnBusinessName;", "", "", "businessName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactNameFragment$OnBusinessName;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class OnBusinessName {
        public static final int $stable = 0;
        private final java.lang.String businessName;

        public OnBusinessName(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OnBusinessName(businessName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.businessName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, ((com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName) other).businessName);
        }

        public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName copy(java.lang.String businessName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName(businessName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName copy$default(com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = onBusinessName.businessName;
            }
            return onBusinessName.copy(str);
        }
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName = this.onPersonName;
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName = this.onBusinessName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactNameFragment(__typename=");
        sb.append(str);
        sb.append(", onPersonName=");
        sb.append(onPersonName);
        sb.append(", onBusinessName=");
        sb.append(onBusinessName);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName = this.onPersonName;
        int hashCode2 = onPersonName == null ? 0 : onPersonName.hashCode();
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName = this.onBusinessName;
        return (((hashCode * 31) + hashCode2) * 31) + (onBusinessName != null ? onBusinessName.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment contactNameFragment = (com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, contactNameFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.onPersonName, contactNameFragment.onPersonName) && kotlin.jvm.internal.Intrinsics.areEqual(this.onBusinessName, contactNameFragment.onBusinessName);
    }

    public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment copy(java.lang.String __typename, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment(__typename, onPersonName, onBusinessName);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName getOnBusinessName() {
        return this.onBusinessName;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName getOnPersonName() {
        return this.onPersonName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment copy$default(com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment contactNameFragment, java.lang.String str, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnPersonName onPersonName, com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactNameFragment.OnBusinessName onBusinessName, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contactNameFragment.__typename;
        }
        if ((i & 2) != 0) {
            onPersonName = contactNameFragment.onPersonName;
        }
        if ((i & 4) != 0) {
            onBusinessName = contactNameFragment.onBusinessName;
        }
        return contactNameFragment.copy(str, onPersonName, onBusinessName);
    }
}
