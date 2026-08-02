package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName;", "", "<init>", "()V", "Person", "Business", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName$Business;", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName$Person;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ClaimReceiverName {
    public static final int $stable = 0;

    private ClaimReceiverName() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName$Person;", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName;", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "fullName", "initials", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName$Person;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getFullName", "getInitials"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Person extends com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String initials;

        public Person(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            super(null);
            this.givenName = str;
            this.fullName = str2;
            this.initials = str3;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getInitials() {
            return this.initials;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.fullName;
            java.lang.String str3 = this.initials;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Person(givenName=");
            sb.append(str);
            sb.append(", fullName=");
            sb.append(str2);
            sb.append(", initials=");
            sb.append(str3);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.fullName;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.initials;
            return (((hashCode * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person person = (com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, person.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, person.fullName) && kotlin.jvm.internal.Intrinsics.areEqual(this.initials, person.initials);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person copy(java.lang.String givenName, java.lang.String fullName, java.lang.String initials) {
            return new com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person(givenName, fullName, initials);
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getInitials() {
            return this.initials;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person copy$default(com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Person person, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = person.givenName;
            }
            if ((i & 2) != 0) {
                str2 = person.fullName;
            }
            if ((i & 4) != 0) {
                str3 = person.initials;
            }
            return person.copy(str, str2, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName$Business;", "Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName;", "", "businessName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ClaimReceiverName$Business;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Business extends com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName {
        public static final int $stable = 0;
        private final java.lang.String businessName;

        public Business(java.lang.String str) {
            super(null);
            this.businessName = str;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Business(businessName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.businessName;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, ((com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business) other).businessName);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business copy(java.lang.String businessName) {
            return new com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business(businessName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business copy$default(com.paypal.oslo.feature.p2p.domain.model.ClaimReceiverName.Business business, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = business.businessName;
            }
            return business.copy(str);
        }
    }

    public /* synthetic */ ClaimReceiverName(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
