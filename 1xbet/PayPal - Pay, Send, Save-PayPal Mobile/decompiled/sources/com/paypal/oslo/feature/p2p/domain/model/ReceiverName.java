package com.paypal.oslo.feature.p2p.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;", "", "<init>", "()V", "PersonName", "BusinessName", "Unknown", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$BusinessName;", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$PersonName;", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$Unknown;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class ReceiverName {
    public static final int $stable = 0;

    private ReceiverName() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\"\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b#\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$PersonName;", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;", "", com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.VerificationConstants.GivenName, "surname", "prefix", com.microblink.blinkid.entities.recognizers.blinkid.usdl.UsdlCombinedRecognizer.VerificationConstants.MiddleName, "suffix", "fullName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$PersonName;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getGivenName", "getSurname", "getPrefix", "getMiddleName", "getSuffix", "getFullName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class PersonName extends com.paypal.oslo.feature.p2p.domain.model.ReceiverName {
        public static final int $stable = 0;
        private final java.lang.String fullName;
        private final java.lang.String givenName;
        private final java.lang.String middleName;
        private final java.lang.String prefix;
        private final java.lang.String suffix;
        private final java.lang.String surname;

        public PersonName(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
            super(null);
            this.givenName = str;
            this.surname = str2;
            this.prefix = str3;
            this.middleName = str4;
            this.suffix = str5;
            this.fullName = str6;
        }

        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public final java.lang.String getSurname() {
            return this.surname;
        }

        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        public final java.lang.String getFullName() {
            return this.fullName;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.givenName;
            java.lang.String str2 = this.surname;
            java.lang.String str3 = this.prefix;
            java.lang.String str4 = this.middleName;
            java.lang.String str5 = this.suffix;
            java.lang.String str6 = this.fullName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PersonName(givenName=");
            sb.append(str);
            sb.append(", surname=");
            sb.append(str2);
            sb.append(", prefix=");
            sb.append(str3);
            sb.append(", middleName=");
            sb.append(str4);
            sb.append(", suffix=");
            sb.append(str5);
            sb.append(", fullName=");
            sb.append(str6);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.String str = this.givenName;
            int hashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.surname;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            java.lang.String str3 = this.prefix;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            java.lang.String str4 = this.middleName;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            java.lang.String str5 = this.suffix;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            java.lang.String str6 = this.fullName;
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (str6 != null ? str6.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName personName = (com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.givenName, personName.givenName) && kotlin.jvm.internal.Intrinsics.areEqual(this.surname, personName.surname) && kotlin.jvm.internal.Intrinsics.areEqual(this.prefix, personName.prefix) && kotlin.jvm.internal.Intrinsics.areEqual(this.middleName, personName.middleName) && kotlin.jvm.internal.Intrinsics.areEqual(this.suffix, personName.suffix) && kotlin.jvm.internal.Intrinsics.areEqual(this.fullName, personName.fullName);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName copy(java.lang.String givenName, java.lang.String surname, java.lang.String prefix, java.lang.String middleName, java.lang.String suffix, java.lang.String fullName) {
            return new com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName(givenName, surname, prefix, middleName, suffix, fullName);
        }

        /* renamed from: component6, reason: from getter */
        public final java.lang.String getFullName() {
            return this.fullName;
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getSuffix() {
            return this.suffix;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getMiddleName() {
            return this.middleName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getPrefix() {
            return this.prefix;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSurname() {
            return this.surname;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getGivenName() {
            return this.givenName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName copy$default(com.paypal.oslo.feature.p2p.domain.model.ReceiverName.PersonName personName, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = personName.givenName;
            }
            if ((i & 2) != 0) {
                str2 = personName.surname;
            }
            java.lang.String str7 = str2;
            if ((i & 4) != 0) {
                str3 = personName.prefix;
            }
            java.lang.String str8 = str3;
            if ((i & 8) != 0) {
                str4 = personName.middleName;
            }
            java.lang.String str9 = str4;
            if ((i & 16) != 0) {
                str5 = personName.suffix;
            }
            java.lang.String str10 = str5;
            if ((i & 32) != 0) {
                str6 = personName.fullName;
            }
            return personName.copy(str, str7, str8, str9, str10, str6);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$BusinessName;", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;", "", "businessName", "orthography", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$BusinessName;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getBusinessName", "getOrthography"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class BusinessName extends com.paypal.oslo.feature.p2p.domain.model.ReceiverName {
        public static final int $stable = 0;
        private final java.lang.String businessName;
        private final java.lang.String orthography;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BusinessName(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.businessName = str;
            this.orthography = str2;
        }

        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public final java.lang.String getOrthography() {
            return this.orthography;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.businessName;
            java.lang.String str2 = this.orthography;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BusinessName(businessName=");
            sb.append(str);
            sb.append(", orthography=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.businessName.hashCode();
            java.lang.String str = this.orthography;
            return (hashCode * 31) + (str == null ? 0 : str.hashCode());
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName)) {
                return false;
            }
            com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName businessName = (com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.businessName, businessName.businessName) && kotlin.jvm.internal.Intrinsics.areEqual(this.orthography, businessName.orthography);
        }

        public final com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName copy(java.lang.String businessName, java.lang.String orthography) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessName, "");
            return new com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName(businessName, orthography);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getOrthography() {
            return this.orthography;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getBusinessName() {
            return this.businessName;
        }

        public static /* synthetic */ com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName copy$default(com.paypal.oslo.feature.p2p.domain.model.ReceiverName.BusinessName businessName, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = businessName.businessName;
            }
            if ((i & 2) != 0) {
                str2 = businessName.orthography;
            }
            return businessName.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName$Unknown;", "Lcom/paypal/oslo/feature/p2p/domain/model/ReceiverName;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* data */ class Unknown extends com.paypal.oslo.feature.p2p.domain.model.ReceiverName {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.p2p.domain.model.ReceiverName.Unknown INSTANCE = new com.paypal.oslo.feature.p2p.domain.model.ReceiverName.Unknown();

        public final int hashCode() {
            return -1294428684;
        }

        private Unknown() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Unknown";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.p2p.domain.model.ReceiverName.Unknown)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ ReceiverName(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
