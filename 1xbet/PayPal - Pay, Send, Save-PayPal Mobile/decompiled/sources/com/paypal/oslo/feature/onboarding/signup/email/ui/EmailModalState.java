package com.paypal.oslo.feature.onboarding.signup.email.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;", "", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE, "EmailSuggestion", "EmailConfirmation", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$EmailConfirmation;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$EmailSuggestion;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$None;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface EmailModalState {

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$None;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class None implements com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.None INSTANCE = new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.None();

        public final int hashCode() {
            return 1878945818;
        }

        private None() {
        }

        public final java.lang.String toString() {
            return com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Name.NONE;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.None)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$EmailSuggestion;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "suggestedEmail", "originalEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2-BvNj-jI", "component2", "copy-o67mufw", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$EmailSuggestion;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getSuggestedEmail-BvNj-jI", "getOriginalEmail-BvNj-jI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailSuggestion implements com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState {
        public static final int $stable = 0;
        private final java.lang.String originalEmail;
        private final java.lang.String suggestedEmail;

        private EmailSuggestion(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.suggestedEmail = str;
            this.originalEmail = str2;
        }

        /* renamed from: getSuggestedEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16359getSuggestedEmailBvNjjI() {
            return this.suggestedEmail;
        }

        /* renamed from: getOriginalEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16358getOriginalEmailBvNjjI() {
            return this.originalEmail;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.suggestedEmail);
            java.lang.String m15926toStringimpl2 = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.originalEmail);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailSuggestion(suggestedEmail=");
            sb.append(m15926toStringimpl);
            sb.append(", originalEmail=");
            sb.append(m15926toStringimpl2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.suggestedEmail) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.originalEmail);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion emailSuggestion = (com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.suggestedEmail, emailSuggestion.suggestedEmail) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.originalEmail, emailSuggestion.originalEmail);
        }

        /* renamed from: copy-o67mufw, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion m16357copyo67mufw(java.lang.String suggestedEmail, java.lang.String originalEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedEmail, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(originalEmail, "");
            return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion(suggestedEmail, originalEmail, null);
        }

        /* renamed from: component2-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getOriginalEmail() {
            return this.originalEmail;
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        /* renamed from: copy-o67mufw$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion m16354copyo67mufw$default(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailSuggestion emailSuggestion, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = emailSuggestion.suggestedEmail;
            }
            if ((i & 2) != 0) {
                str2 = emailSuggestion.originalEmail;
            }
            return emailSuggestion.m16357copyo67mufw(str, str2);
        }

        public /* synthetic */ EmailSuggestion(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$EmailConfirmation;", "Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "<init>", "(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "copy-RQoNrjY", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/email/ui/EmailModalState$EmailConfirmation;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class EmailConfirmation implements com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState {
        public static final int $stable = 0;
        private final java.lang.String email;

        private EmailConfirmation(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16353getEmailBvNjjI() {
            return this.email;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailConfirmation(email=");
            sb.append(m15926toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, ((com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation) other).email);
        }

        /* renamed from: copy-RQoNrjY, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation m16352copyRQoNrjY(java.lang.String email) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation(email, null);
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-RQoNrjY$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation m16350copyRQoNrjY$default(com.paypal.oslo.feature.onboarding.signup.email.ui.EmailModalState.EmailConfirmation emailConfirmation, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = emailConfirmation.email;
            }
            return emailConfirmation.m16352copyRQoNrjY(str);
        }

        public /* synthetic */ EmailConfirmation(java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }
}
