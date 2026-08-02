package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "", "<init>", "()V", "Idle", "Loading", "SignUp", "SignUpWithGoogleCredential", "SignUpCompleted", "SuggestedEmailCorrection", "ForgotEmail", "Success", "Error", "ConfirmEmail", "ConfirmPhoneNumber", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ConfirmEmail;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ConfirmPhoneNumber;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ForgotEmail;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Idle;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUp;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpCompleted;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpWithGoogleCredential;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Success;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SuggestedEmailCorrection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class UserVerificationUiState {
    public static final int $stable = 0;

    private UserVerificationUiState() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Idle;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Idle extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Idle INSTANCE = new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Idle();

        public final int hashCode() {
            return -1738833828;
        }

        private Idle() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Idle";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Idle)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Loading;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Loading extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Loading INSTANCE = new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Loading();

        public final int hashCode() {
            return -1325632588;
        }

        private Loading() {
            super(null);
        }

        public final java.lang.String toString() {
            return "Loading";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Loading)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUp;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "publicCredential", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)V", "component1", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "copy", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUp;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential;", "getPublicCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SignUp extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignUp(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            this.publicCredential = publicCredential;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
            return this.publicCredential;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential = this.publicCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignUp(publicCredential=");
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
            return (other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp) && kotlin.jvm.internal.Intrinsics.areEqual(this.publicCredential, ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp) other).publicCredential);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp copy(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(publicCredential, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp(publicCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential getPublicCredential() {
            return this.publicCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUp signUp, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential publicCredential, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                publicCredential = signUp.publicCredential;
            }
            return signUp.copy(publicCredential);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpWithGoogleCredential;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "", "email", "googleIdToken", "firstName", "lastName", "profileUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpWithGoogleCredential;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail", "getGoogleIdToken", "getFirstName", "getLastName", "getProfileUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SignUpWithGoogleCredential extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String email;
        private final java.lang.String firstName;
        private final java.lang.String googleIdToken;
        private final java.lang.String lastName;
        private final java.lang.String profileUrl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignUpWithGoogleCredential(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
            this.email = str;
            this.googleIdToken = str2;
            this.firstName = str3;
            this.lastName = str4;
            this.profileUrl = str5;
        }

        public final java.lang.String getEmail() {
            return this.email;
        }

        public final java.lang.String getGoogleIdToken() {
            return this.googleIdToken;
        }

        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        public final java.lang.String getLastName() {
            return this.lastName;
        }

        public final java.lang.String getProfileUrl() {
            return this.profileUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.email;
            java.lang.String str2 = this.googleIdToken;
            java.lang.String str3 = this.firstName;
            java.lang.String str4 = this.lastName;
            java.lang.String str5 = this.profileUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignUpWithGoogleCredential(email=");
            sb.append(str);
            sb.append(", googleIdToken=");
            sb.append(str2);
            sb.append(", firstName=");
            sb.append(str3);
            sb.append(", lastName=");
            sb.append(str4);
            sb.append(", profileUrl=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (((((((this.email.hashCode() * 31) + this.googleIdToken.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.profileUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential signUpWithGoogleCredential = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.email, signUpWithGoogleCredential.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.googleIdToken, signUpWithGoogleCredential.googleIdToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, signUpWithGoogleCredential.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, signUpWithGoogleCredential.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.profileUrl, signUpWithGoogleCredential.profileUrl);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential copy(java.lang.String email, java.lang.String googleIdToken, java.lang.String firstName, java.lang.String lastName, java.lang.String profileUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(googleIdToken, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profileUrl, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential(email, googleIdToken, firstName, lastName, profileUrl);
        }

        /* renamed from: component5, reason: from getter */
        public final java.lang.String getProfileUrl() {
            return this.profileUrl;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getLastName() {
            return this.lastName;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getFirstName() {
            return this.firstName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getGoogleIdToken() {
            return this.googleIdToken;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpWithGoogleCredential signUpWithGoogleCredential, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = signUpWithGoogleCredential.email;
            }
            if ((i & 2) != 0) {
                str2 = signUpWithGoogleCredential.googleIdToken;
            }
            java.lang.String str6 = str2;
            if ((i & 4) != 0) {
                str3 = signUpWithGoogleCredential.firstName;
            }
            java.lang.String str7 = str3;
            if ((i & 8) != 0) {
                str4 = signUpWithGoogleCredential.lastName;
            }
            java.lang.String str8 = str4;
            if ((i & 16) != 0) {
                str5 = signUpWithGoogleCredential.profileUrl;
            }
            return signUpWithGoogleCredential.copy(str, str6, str7, str8, str5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpCompleted;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "userAccessTokenData", "", "requestId", "<init>", "(Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SignUpCompleted;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "getUserAccessTokenData", "Ljava/lang/String;", "getRequestId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SignUpCompleted extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String requestId;
        private final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignUpCompleted(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.userAccessTokenData = userAccessTokenData;
            this.requestId = str;
        }

        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        public final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData getUserAccessTokenData() {
            return this.userAccessTokenData;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData = this.userAccessTokenData;
            java.lang.String str = this.requestId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SignUpCompleted(userAccessTokenData=");
            sb.append(userAccessTokenData);
            sb.append(", requestId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.userAccessTokenData.hashCode() * 31) + this.requestId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted signUpCompleted = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.userAccessTokenData, signUpCompleted.userAccessTokenData) && kotlin.jvm.internal.Intrinsics.areEqual(this.requestId, signUpCompleted.requestId);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted copy(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, java.lang.String requestId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userAccessTokenData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestId, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted(userAccessTokenData, requestId);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getRequestId() {
            return this.requestId;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData getUserAccessTokenData() {
            return this.userAccessTokenData;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SignUpCompleted signUpCompleted, com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                userAccessTokenData = signUpCompleted.userAccessTokenData;
            }
            if ((i & 2) != 0) {
                str = signUpCompleted.requestId;
            }
            return signUpCompleted.copy(userAccessTokenData, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SuggestedEmailCorrection;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "", "originalEmail", "suggestedEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$SuggestedEmailCorrection;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getOriginalEmail", "getSuggestedEmail"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestedEmailCorrection extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String originalEmail;
        private final java.lang.String suggestedEmail;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SuggestedEmailCorrection(java.lang.String str, java.lang.String str2) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedEmailCorrection(originalEmail=");
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
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection suggestedEmailCorrection = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.originalEmail, suggestedEmailCorrection.originalEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.suggestedEmail, suggestedEmailCorrection.suggestedEmail);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection copy(java.lang.String originalEmail, java.lang.String suggestedEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalEmail, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedEmail, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection(originalEmail, suggestedEmail);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getOriginalEmail() {
            return this.originalEmail;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.SuggestedEmailCorrection suggestedEmailCorrection, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = suggestedEmailCorrection.originalEmail;
            }
            if ((i & 2) != 0) {
                str2 = suggestedEmailCorrection.suggestedEmail;
            }
            return suggestedEmailCorrection.copy(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ForgotEmail;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ForgotEmail extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ForgotEmail INSTANCE = new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ForgotEmail();

        public final int hashCode() {
            return 171740337;
        }

        private ForgotEmail() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ForgotEmail";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ForgotEmail)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0017\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Success;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "authOptions", "", "displayName", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getAuthOptions", "Ljava/lang/String;", "getDisplayName"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Success extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 8;
        private final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions;
        private final java.lang.String displayName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Success(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.authOptions = list;
            this.displayName = str;
        }

        public /* synthetic */ Success(java.util.List list, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? "" : str);
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> getAuthOptions() {
            return this.authOptions;
        }

        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.lang.String toString() {
            java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> list = this.authOptions;
            java.lang.String str = this.displayName;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(authOptions=");
            sb.append(list);
            sb.append(", displayName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.authOptions.hashCode() * 31) + this.displayName.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success success = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.authOptions, success.authOptions) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, success.displayName);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success copy(java.util.List<? extends com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> authOptions, java.lang.String displayName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authOptions, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success(authOptions, displayName);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getDisplayName() {
            return this.displayName;
        }

        public final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> component1() {
            return this.authOptions;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Success success, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = success.authOptions;
            }
            if ((i & 2) != 0) {
                str = success.displayName;
            }
            return success.copy(list, str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Error;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getMessage"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Error extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.message = str;
        }

        public final java.lang.String getMessage() {
            return this.message;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.message;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(message=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.message.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Error) && kotlin.jvm.internal.Intrinsics.areEqual(this.message, ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Error) other).message);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Error copy(java.lang.String message) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Error(message);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getMessage() {
            return this.message;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Error copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.Error error, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ConfirmEmail;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "emailCredential", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;)V", "component1", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "copy", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ConfirmEmail;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$EmailCredential;", "getEmailCredential"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmEmail extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmEmail(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailCredential, "");
            this.emailCredential = emailCredential;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential getEmailCredential() {
            return this.emailCredential;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential = this.emailCredential;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmEmail(emailCredential=");
            sb.append(emailCredential);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.emailCredential.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailCredential, ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail) other).emailCredential);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail copy(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailCredential, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail(emailCredential);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential getEmailCredential() {
            return this.emailCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmEmail confirmEmail, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.EmailCredential emailCredential, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                emailCredential = confirmEmail.emailCredential;
            }
            return confirmEmail.copy(emailCredential);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ConfirmPhoneNumber;", "Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState;", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;", "phoneCredential", "", "countryCode", "<init>", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/ui/UserVerificationUiState$ConfirmPhoneNumber;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/identity/userverification/domain/model/request/PublicCredential$PhoneCredential;", "getPhoneCredential", "Ljava/lang/String;", "getCountryCode"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ConfirmPhoneNumber extends com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState {
        public static final int $stable = 0;
        private final java.lang.String countryCode;
        private final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConfirmPhoneNumber(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.phoneCredential = phoneCredential;
            this.countryCode = str;
        }

        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential getPhoneCredential() {
            return this.phoneCredential;
        }

        public /* synthetic */ ConfirmPhoneNumber(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(phoneCredential, (i & 2) != 0 ? "US" : str);
        }

        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential = this.phoneCredential;
            java.lang.String str = this.countryCode;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfirmPhoneNumber(phoneCredential=");
            sb.append(phoneCredential);
            sb.append(", countryCode=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (this.phoneCredential.hashCode() * 31) + this.countryCode.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber)) {
                return false;
            }
            com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber confirmPhoneNumber = (com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneCredential, confirmPhoneNumber.phoneCredential) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, confirmPhoneNumber.countryCode);
        }

        public final com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber copy(com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential, java.lang.String countryCode) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneCredential, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
            return new com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber(phoneCredential, countryCode);
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getCountryCode() {
            return this.countryCode;
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential getPhoneCredential() {
            return this.phoneCredential;
        }

        public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber copy$default(com.paypal.oslo.feature.identity.userverification.ui.UserVerificationUiState.ConfirmPhoneNumber confirmPhoneNumber, com.paypal.oslo.feature.identity.userverification.domain.model.request.PublicCredential.PhoneCredential phoneCredential, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                phoneCredential = confirmPhoneNumber.phoneCredential;
            }
            if ((i & 2) != 0) {
                str = confirmPhoneNumber.countryCode;
            }
            return confirmPhoneNumber.copy(phoneCredential, str);
        }
    }

    public /* synthetic */ UserVerificationUiState(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
