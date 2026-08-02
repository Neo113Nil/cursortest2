package com.paypal.oslo.feature.onboarding.signup.swg.domain.model;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b-\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b\u000b\u0010\u001cR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b0\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u0010\u001f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/model/SwgCheckResult;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FirstName;", "firstName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/LastName;", "lastName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/ProfileUrl;", "profilePictureUrl", "", "isExistingAccount", "", "challengeCorrelationId", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;", "emailStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-OzvLBP0", "()Ljava/lang/String;", "component1", "component2-f_wG9To", "component2", "component3-b7a_E3E", "component3", "component4-nuj4skw", "component4", "component5", "()Z", "component6", "component7", "()Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;", "copy-cSc4SJU", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;)Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/model/SwgCheckResult;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getEmail-OzvLBP0", "getFirstName-f_wG9To", "getLastName-b7a_E3E", "getProfilePictureUrl-nuj4skw", "Z", "getChallengeCorrelationId", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/OnboardingEmailStatus;", "getEmailStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SwgCheckResult {
    public static final int $stable = 8;
    private final java.lang.String challengeCorrelationId;
    private final java.lang.String email;
    private final com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus emailStatus;
    private final java.lang.String firstName;
    private final boolean isExistingAccount;
    private final java.lang.String lastName;
    private final java.lang.String profilePictureUrl;

    private SwgCheckResult(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus) {
        this.email = str;
        this.firstName = str2;
        this.lastName = str3;
        this.profilePictureUrl = str4;
        this.isExistingAccount = z;
        this.challengeCorrelationId = str5;
        this.emailStatus = onboardingEmailStatus;
    }

    /* renamed from: getEmail-OzvLBP0, reason: not valid java name */
    public final java.lang.String m16434getEmailOzvLBP0() {
        return this.email;
    }

    /* renamed from: getFirstName-f_wG9To, reason: not valid java name */
    public final java.lang.String m16435getFirstNamef_wG9To() {
        return this.firstName;
    }

    /* renamed from: getLastName-b7a_E3E, reason: not valid java name */
    public final java.lang.String m16436getLastNameb7a_E3E() {
        return this.lastName;
    }

    /* renamed from: getProfilePictureUrl-nuj4skw, reason: not valid java name */
    public final java.lang.String m16437getProfilePictureUrlnuj4skw() {
        return this.profilePictureUrl;
    }

    public final boolean isExistingAccount() {
        return this.isExistingAccount;
    }

    public final java.lang.String getChallengeCorrelationId() {
        return this.challengeCorrelationId;
    }

    public final com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus getEmailStatus() {
        return this.emailStatus;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.email;
        java.lang.String m15926toStringimpl = str == null ? "null" : com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(str);
        java.lang.String str2 = this.firstName;
        java.lang.String m15935toStringimpl = str2 == null ? "null" : com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15935toStringimpl(str2);
        java.lang.String str3 = this.lastName;
        java.lang.String m15974toStringimpl = str3 == null ? "null" : com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15974toStringimpl(str3);
        java.lang.String str4 = this.profilePictureUrl;
        java.lang.String m15992toStringimpl = str4 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15992toStringimpl(str4) : "null";
        boolean z = this.isExistingAccount;
        java.lang.String str5 = this.challengeCorrelationId;
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus = this.emailStatus;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SwgCheckResult(email=");
        sb.append(m15926toStringimpl);
        sb.append(", firstName=");
        sb.append(m15935toStringimpl);
        sb.append(", lastName=");
        sb.append(m15974toStringimpl);
        sb.append(", profilePictureUrl=");
        sb.append(m15992toStringimpl);
        sb.append(", isExistingAccount=");
        sb.append(z);
        sb.append(", challengeCorrelationId=");
        sb.append(str5);
        sb.append(", emailStatus=");
        sb.append(onboardingEmailStatus);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.email;
        int m15925hashCodeimpl = str == null ? 0 : com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(str);
        java.lang.String str2 = this.firstName;
        int m15934hashCodeimpl = str2 == null ? 0 : com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15934hashCodeimpl(str2);
        java.lang.String str3 = this.lastName;
        int m15973hashCodeimpl = str3 == null ? 0 : com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15973hashCodeimpl(str3);
        java.lang.String str4 = this.profilePictureUrl;
        int m15991hashCodeimpl = str4 == null ? 0 : com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15991hashCodeimpl(str4);
        int hashCode = java.lang.Boolean.hashCode(this.isExistingAccount);
        java.lang.String str5 = this.challengeCorrelationId;
        int hashCode2 = str5 == null ? 0 : str5.hashCode();
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus = this.emailStatus;
        return (((((((((((m15925hashCodeimpl * 31) + m15934hashCodeimpl) * 31) + m15973hashCodeimpl) * 31) + m15991hashCodeimpl) * 31) + hashCode) * 31) + hashCode2) * 31) + (onboardingEmailStatus != null ? onboardingEmailStatus.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult swgCheckResult = (com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult) other;
        java.lang.String str = this.email;
        java.lang.String str2 = swgCheckResult.email;
        if (str != null ? !(str2 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(str, str2)) : str2 != null) {
            return false;
        }
        java.lang.String str3 = this.firstName;
        java.lang.String str4 = swgCheckResult.firstName;
        if (str3 != null ? !(str4 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15933equalsimpl0(str3, str4)) : str4 != null) {
            return false;
        }
        java.lang.String str5 = this.lastName;
        java.lang.String str6 = swgCheckResult.lastName;
        if (str5 != null ? !(str6 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15972equalsimpl0(str5, str6)) : str6 != null) {
            return false;
        }
        java.lang.String str7 = this.profilePictureUrl;
        java.lang.String str8 = swgCheckResult.profilePictureUrl;
        if (str7 != null ? str8 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15990equalsimpl0(str7, str8) : str8 == null) {
            return this.isExistingAccount == swgCheckResult.isExistingAccount && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeCorrelationId, swgCheckResult.challengeCorrelationId) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailStatus, swgCheckResult.emailStatus);
        }
        return false;
    }

    /* renamed from: copy-cSc4SJU, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult m16433copycSc4SJU(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String profilePictureUrl, boolean isExistingAccount, java.lang.String challengeCorrelationId, com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus emailStatus) {
        return new com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult(email, firstName, lastName, profilePictureUrl, isExistingAccount, challengeCorrelationId, emailStatus, null);
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus getEmailStatus() {
        return this.emailStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getChallengeCorrelationId() {
        return this.challengeCorrelationId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsExistingAccount() {
        return this.isExistingAccount;
    }

    /* renamed from: component4-nuj4skw, reason: not valid java name and from getter */
    public final java.lang.String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    /* renamed from: component3-b7a_E3E, reason: not valid java name and from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component2-f_wG9To, reason: not valid java name and from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component1-OzvLBP0, reason: not valid java name and from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: copy-cSc4SJU$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult m16428copycSc4SJU$default(com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult swgCheckResult, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = swgCheckResult.email;
        }
        if ((i & 2) != 0) {
            str2 = swgCheckResult.firstName;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = swgCheckResult.lastName;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = swgCheckResult.profilePictureUrl;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            z = swgCheckResult.isExistingAccount;
        }
        boolean z2 = z;
        if ((i & 32) != 0) {
            str5 = swgCheckResult.challengeCorrelationId;
        }
        java.lang.String str9 = str5;
        if ((i & 64) != 0) {
            onboardingEmailStatus = swgCheckResult.emailStatus;
        }
        return swgCheckResult.m16433copycSc4SJU(str, str6, str7, str8, z2, str9, onboardingEmailStatus);
    }

    public /* synthetic */ SwgCheckResult(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, java.lang.String str5, com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, str5, onboardingEmailStatus);
    }
}
