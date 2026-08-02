package com.paypal.oslo.feature.identity.userverification.domain.model.request;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "", "<init>", "()V", "EmailCredential", "PhoneCredential", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class PublicCredential {
    public static final int $stable = 0;

    private PublicCredential() {
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "", "email", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;", "source", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailCredential extends com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential {
        public static final int $stable = 0;
        private final java.lang.String email;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailCredential(java.lang.String str, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialSource, "");
            this.email = str;
            this.source = credentialSource;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public /* synthetic */ EmailCredential(java.lang.String str, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource.USER : credentialSource);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.email;
            com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailCredential(email=");
            sb.append(str);
            sb.append(", source=");
            sb.append(credentialSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.email.hashCode() * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential = (com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.email, emailCredential.email) && this.source == emailCredential.source;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential copy(java.lang.String email, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential(email, source);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource getSource() {
            return this.source;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential, java.lang.String str, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = emailCredential.email;
            }
            if ((i & 2) != 0) {
                credentialSource = emailCredential.source;
            }
            return emailCredential.copy(str, credentialSource);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "", "phoneNumber", "countryCode", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getPhoneNumber", "getCountryCode", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/CredentialSource;", "getSource"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class PhoneCredential extends com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final java.lang.String phoneNumber;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource source;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneCredential(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credentialSource, "");
            this.phoneNumber = str;
            this.countryCode = str2;
            this.source = credentialSource;
        }

        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public /* synthetic */ PhoneCredential(java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource.USER : credentialSource);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource getSource() {
            return this.source;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.phoneNumber;
            java.lang.String str2 = this.countryCode;
            com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource = this.source;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneCredential(phoneNumber=");
            sb.append(str);
            sb.append(", countryCode=");
            sb.append(str2);
            sb.append(", source=");
            sb.append(credentialSource);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((this.phoneNumber.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.source.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential = (com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, phoneCredential.phoneNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, phoneCredential.countryCode) && this.source == phoneCredential.source;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential copy(java.lang.String phoneNumber, java.lang.String countryCode, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource source) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential(phoneNumber, countryCode, source);
        }

        /* renamed from: component3, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential, java.lang.String str, java.lang.String str2, com.paypal.oslo.feature.identity.userverification.domain.model.request.CredentialSource credentialSource, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = phoneCredential.phoneNumber;
            }
            if ((i & 2) != 0) {
                str2 = phoneCredential.countryCode;
            }
            if ((i & 4) != 0) {
                credentialSource = phoneCredential.source;
            }
            return phoneCredential.copy(str, str2, credentialSource);
        }
    }

    public /* synthetic */ PublicCredential(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
