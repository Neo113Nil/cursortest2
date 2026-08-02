package com.paypal.oslo.feature.onboarding.signup.password.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult;", "", "Success", "Cancelled", "Failure", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Cancelled;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Failure;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface SaveCredentialResult {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Success;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success implements com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Success INSTANCE = new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Success();

        public final int hashCode() {
            return -619477834;
        }

        private Success() {
        }

        public final java.lang.String toString() {
            return "Success";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Success)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Cancelled;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult;", "Landroidx/credentials/exceptions/CreateCredentialCancellationException;", "e", "<init>", "(Landroidx/credentials/exceptions/CreateCredentialCancellationException;)V", "component1", "()Landroidx/credentials/exceptions/CreateCredentialCancellationException;", "copy", "(Landroidx/credentials/exceptions/CreateCredentialCancellationException;)Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Cancelled;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/credentials/exceptions/CreateCredentialCancellationException;", "getE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Cancelled implements com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult {
        public static final int $stable = 8;
        private final androidx.view.exceptions.CreateCredentialCancellationException e;

        public Cancelled(androidx.view.exceptions.CreateCredentialCancellationException createCredentialCancellationException) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createCredentialCancellationException, "");
            this.e = createCredentialCancellationException;
        }

        public final androidx.view.exceptions.CreateCredentialCancellationException getE() {
            return this.e;
        }

        public final java.lang.String toString() {
            androidx.view.exceptions.CreateCredentialCancellationException createCredentialCancellationException = this.e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cancelled(e=");
            sb.append(createCredentialCancellationException);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Cancelled) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, ((com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Cancelled) other).e);
        }

        public final com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Cancelled copy(androidx.view.exceptions.CreateCredentialCancellationException e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Cancelled(e);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.view.exceptions.CreateCredentialCancellationException getE() {
            return this.e;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Cancelled copy$default(com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Cancelled cancelled, androidx.view.exceptions.CreateCredentialCancellationException createCredentialCancellationException, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                createCredentialCancellationException = cancelled.e;
            }
            return cancelled.copy(createCredentialCancellationException);
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Failure;", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "e", "<init>", "(Ljava/lang/Exception;)V", "component1", "()Ljava/lang/Exception;", "copy", "(Ljava/lang/Exception;)Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/SaveCredentialResult$Failure;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Exception;", "getE"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Failure implements com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult {
        public static final int $stable = 8;
        private final java.lang.Exception e;

        public Failure(java.lang.Exception exc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
            this.e = exc;
        }

        public final java.lang.Exception getE() {
            return this.e;
        }

        public final java.lang.String toString() {
            java.lang.Exception exc = this.e;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failure(e=");
            sb.append(exc);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, ((com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure) other).e);
        }

        public final com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure copy(java.lang.Exception e) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
            return new com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure(e);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Exception getE() {
            return this.e;
        }

        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure copy$default(com.paypal.oslo.feature.onboarding.signup.password.domain.model.SaveCredentialResult.Failure failure, java.lang.Exception exc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                exc = failure.e;
            }
            return failure.copy(exc);
        }
    }
}
