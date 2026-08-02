package com.paypal.oslo.feature.identity.sna.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult;", "", "<init>", "()V", "Success", "UserConsentRequired", "MobileVerificationRequired", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult$MobileVerificationRequired;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult$Success;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult$UserConsentRequired;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class SNAConsentResult {
    public static final int $stable = 0;

    private SNAConsentResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult$Success;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.Success INSTANCE = new com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.Success();

        public final int hashCode() {
            return 388895214;
        }

        private Success() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult$UserConsentRequired;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UserConsentRequired extends com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.UserConsentRequired INSTANCE = new com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.UserConsentRequired();

        public final int hashCode() {
            return 1163344889;
        }

        private UserConsentRequired() {
            super(null);
        }

        public final java.lang.String toString() {
            return "UserConsentRequired";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.UserConsentRequired)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult$MobileVerificationRequired;", "Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult;", "", "mobileNumber", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/sna/domain/model/SNAConsentResult$MobileVerificationRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMobileNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class MobileVerificationRequired extends com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult {
        public static final int $stable = 0;
        private final java.lang.String mobileNumber;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MobileVerificationRequired(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.mobileNumber = str;
        }

        public final java.lang.String getMobileNumber() {
            return this.mobileNumber;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.mobileNumber;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MobileVerificationRequired(mobileNumber=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.mobileNumber.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.MobileVerificationRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.mobileNumber, ((com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.MobileVerificationRequired) other).mobileNumber);
        }

        public final com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.MobileVerificationRequired copy(java.lang.String mobileNumber) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mobileNumber, "");
            return new com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.MobileVerificationRequired(mobileNumber);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMobileNumber() {
            return this.mobileNumber;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.MobileVerificationRequired copy$default(com.paypal.oslo.feature.identity.sna.domain.model.SNAConsentResult.MobileVerificationRequired mobileVerificationRequired, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = mobileVerificationRequired.mobileNumber;
            }
            return mobileVerificationRequired.copy(str);
        }
    }

    public /* synthetic */ SNAConsentResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
