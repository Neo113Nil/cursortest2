package com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationResult;", "", "<init>", "()V", "Success", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class EmailConfirmationResult {
    public static final int $stable = 0;

    private EmailConfirmationResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationResult$Success;", "Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationResult;", "", "confirmedEmail", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/emailconfirmation/domain/model/result/EmailConfirmationResult$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getConfirmedEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult {
        public static final int $stable = 0;
        private final java.lang.String confirmedEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.confirmedEmail = str;
        }

        public final java.lang.String getConfirmedEmail() {
            return this.confirmedEmail;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.confirmedEmail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(confirmedEmail=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.confirmedEmail.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.confirmedEmail, ((com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success) other).confirmedEmail);
        }

        public final com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success copy(java.lang.String confirmedEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(confirmedEmail, "");
            return new com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success(confirmedEmail);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getConfirmedEmail() {
            return this.confirmedEmail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success copy$default(com.paypal.oslo.feature.identity.emailconfirmation.domain.model.result.EmailConfirmationResult.Success success, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = success.confirmedEmail;
            }
            return success.copy(str);
        }
    }

    public /* synthetic */ EmailConfirmationResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
