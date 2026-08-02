package com.paypal.oslo.feature.identity.userverification.domain.model.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "", "<init>", "()V", "VerifyCredentialSuccess", "AvailableForSignUp", "SuggestedCorrection", "ConfirmationRequired", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$AvailableForSignUp;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$ConfirmationRequired;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$SuggestedCorrection;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$VerifyCredentialSuccess;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class VerifyCredentialResult {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ \u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$VerifyCredentialSuccess;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "<init>", "(Ljava/util/List;)V", "component1", "()Ljava/util/List;", "copy", "(Ljava/util/List;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$VerifyCredentialSuccess;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getAuthOptions"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class VerifyCredentialSuccess extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public VerifyCredentialSuccess(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.authOptions = list;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAuthOptions() {
            return this.authOptions;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.authOptions;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("VerifyCredentialSuccess(authOptions=");
            sb.append(list);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.authOptions.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess) && kotlin.jvm.internal.Intrinsics.areEqual(this.authOptions, ((com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess) other).authOptions);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess copy(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess(authOptions);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component1() {
            return this.authOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.VerifyCredentialSuccess verifyCredentialSuccess, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = verifyCredentialSuccess.authOptions;
            }
            return verifyCredentialSuccess.copy(list);
        }
    }

    private VerifyCredentialResult() {
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$AvailableForSignUp;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "publicCredential", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)V", "component1", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "copy", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$AvailableForSignUp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableForSignUp extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AvailableForSignUp(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            this.publicCredential = publicCredential;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableForSignUp(publicCredential=");
            sb.append(publicCredential);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp copy(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.AvailableForSignUp availableForSignUp, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicCredential = availableForSignUp.publicCredential;
            }
            return availableForSignUp.copy(publicCredential);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$SuggestedCorrection;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "", "originalEmail", "suggestedEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$SuggestedCorrection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOriginalEmail", "getSuggestedEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestedCorrection extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult {
        public static final int $stable = 0;
        private final java.lang.String originalEmail;
        private final java.lang.String suggestedEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestedCorrection(java.lang.String str, java.lang.String str2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.originalEmail = str;
            this.suggestedEmail = str2;
        }

        public final java.lang.String getOriginalEmail() {
            return this.originalEmail;
        }

        public final java.lang.String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.originalEmail;
            java.lang.String str2 = this.suggestedEmail;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedCorrection(originalEmail=");
            sb.append(str);
            sb.append(", suggestedEmail=");
            sb.append(str2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.originalEmail.hashCode() * 31) + this.suggestedEmail.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection suggestedCorrection = (com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.originalEmail, suggestedCorrection.originalEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestedEmail, suggestedCorrection.suggestedEmail);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection copy(java.lang.String originalEmail, java.lang.String suggestedEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalEmail, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedEmail, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection(originalEmail, suggestedEmail);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOriginalEmail() {
            return this.originalEmail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.SuggestedCorrection suggestedCorrection, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = suggestedCorrection.originalEmail;
            }
            if ((i & 2) != 0) {
                str2 = suggestedCorrection.suggestedEmail;
            }
            return suggestedCorrection.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$ConfirmationRequired;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "publicCredential", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)V", "component1", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "copy", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/VerifyCredentialResult$ConfirmationRequired;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmationRequired extends com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmationRequired(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            this.publicCredential = publicCredential;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmationRequired(publicCredential=");
            sb.append(publicCredential);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.publicCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired copy(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.VerifyCredentialResult.ConfirmationRequired confirmationRequired, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicCredential = confirmationRequired.publicCredential;
            }
            return confirmationRequired.copy(publicCredential);
        }
    }

    public /* synthetic */ VerifyCredentialResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
