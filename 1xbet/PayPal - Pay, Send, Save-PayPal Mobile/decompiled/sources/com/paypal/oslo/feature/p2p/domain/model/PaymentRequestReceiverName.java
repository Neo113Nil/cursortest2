package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName;", "", "<init>", "()V", "", "getDisplayName", "()Ljava/lang/String;", "displayName", "Person", "Business", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName$Business;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName$Person;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PaymentRequestReceiverName {
    public static final int $stable = 0;

    public abstract java.lang.String getDisplayName();

    private PaymentRequestReceiverName() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName$Person;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName;", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName$Person;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getFullName", "getDisplayName", "displayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Person extends com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;

        public Person(java.lang.String str, java.lang.String str2) {
            super(null);
            this.givenName = str;
            this.fullName = str2;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        @Override // com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName
        public final java.lang.String getDisplayName() {
            java.lang.String str = this.fullName;
            if (str != null) {
                return str;
            }
            java.lang.String str2 = this.givenName;
            return str2 == null ? "" : str2;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Person(givenName=");
            sb.append(str);
            sb.append(", fullName=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.fullName;
            return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person person = (com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, person.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, person.fullName);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person copy(java.lang.String givenName, java.lang.String fullName) {
            return new com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person(givenName, fullName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person copy$default(com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Person person, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = person.givenName;
            }
            if ((i & 2) != 0) {
                str2 = person.fullName;
            }
            return person.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName$Business;", "Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName;", "", "businessName", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/PaymentRequestReceiverName$Business;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "getDisplayName", "displayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Business extends com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName {
        public static final int $stable = 0;
        private final java.lang.String businessName;

        public Business(java.lang.String str) {
            super(null);
            this.businessName = str;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        @Override // com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName
        public final java.lang.String getDisplayName() {
            java.lang.String str = this.businessName;
            return str == null ? "" : str;
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
            return (other instanceof com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business) && kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, ((com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business) other).businessName);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business copy(java.lang.String businessName) {
            return new com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business(businessName);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business copy$default(com.paypal.oslo.feature.p2p.domain.model.PaymentRequestReceiverName.Business business, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = business.businessName;
            }
            return business.copy(str);
        }
    }

    public /* synthetic */ PaymentRequestReceiverName(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
