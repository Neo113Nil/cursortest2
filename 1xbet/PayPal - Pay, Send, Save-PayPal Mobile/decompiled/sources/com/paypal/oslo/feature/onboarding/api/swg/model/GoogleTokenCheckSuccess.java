package com.paypal.oslo.feature.onboarding.api.swg.model;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess;", "", "ExistingAccount", "AvailableForSignup", "SuggestedCorrection", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$AvailableForSignup;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$ExistingAccount;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$SuggestedCorrection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface GoogleTokenCheckSuccess {

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$ExistingAccount;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/ChallengeInfo;", "challengeInfo", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/swg/model/ChallengeInfo;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/onboarding/api/swg/model/ChallengeInfo;", "copy-E4ilnuY", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/api/swg/model/ChallengeInfo;)Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$ExistingAccount;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/ChallengeInfo;", "getChallengeInfo"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ExistingAccount implements com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess {
        private final com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo challengeInfo;
        private final java.lang.String email;

        private ExistingAccount(java.lang.String str, com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo challengeInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeInfo, "");
            this.email = str;
            this.challengeInfo = challengeInfo;
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16060getEmailBvNjjI() {
            return this.email;
        }

        public final com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo getChallengeInfo() {
            return this.challengeInfo;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo challengeInfo = this.challengeInfo;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ExistingAccount(email=");
            sb.append(m15926toStringimpl);
            sb.append(", challengeInfo=");
            sb.append(challengeInfo);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email) * 31) + this.challengeInfo.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount existingAccount = (com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, existingAccount.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.challengeInfo, existingAccount.challengeInfo);
        }

        /* renamed from: copy-E4ilnuY, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount m16059copyE4ilnuY(java.lang.String email, com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo challengeInfo) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeInfo, "");
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount(email, challengeInfo, null);
        }

        /* renamed from: component2, reason: from getter */
        public final com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo getChallengeInfo() {
            return this.challengeInfo;
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-E4ilnuY$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount m16057copyE4ilnuY$default(com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount existingAccount, java.lang.String str, com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo challengeInfo, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = existingAccount.email;
            }
            if ((i & 2) != 0) {
                challengeInfo = existingAccount.challengeInfo;
            }
            return existingAccount.m16059copyE4ilnuY(str, challengeInfo);
        }

        public /* synthetic */ ExistingAccount(java.lang.String str, com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo challengeInfo, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, challengeInfo);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJ>\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010\rR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b&\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$AvailableForSignup;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/FirstName;", "firstName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/LastName;", "lastName", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/ProfileUrl;", "profilePictureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2-f_wG9To", "component2", "component3-b7a_E3E", "component3", "component4-nuj4skw", "component4", "copy-_SYLGpA", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$AvailableForSignup;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI", "getFirstName-f_wG9To", "getLastName-b7a_E3E", "getProfilePictureUrl-nuj4skw"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class AvailableForSignup implements com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess {
        private final java.lang.String email;
        private final java.lang.String firstName;
        private final java.lang.String lastName;
        private final java.lang.String profilePictureUrl;

        private AvailableForSignup(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.email = str;
            this.firstName = str2;
            this.lastName = str3;
            this.profilePictureUrl = str4;
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16053getEmailBvNjjI() {
            return this.email;
        }

        /* renamed from: getFirstName-f_wG9To, reason: not valid java name */
        public final java.lang.String m16054getFirstNamef_wG9To() {
            return this.firstName;
        }

        /* renamed from: getLastName-b7a_E3E, reason: not valid java name */
        public final java.lang.String m16055getLastNameb7a_E3E() {
            return this.lastName;
        }

        /* renamed from: getProfilePictureUrl-nuj4skw, reason: not valid java name */
        public final java.lang.String m16056getProfilePictureUrlnuj4skw() {
            return this.profilePictureUrl;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            java.lang.String str = this.firstName;
            java.lang.String m15935toStringimpl = str == null ? "null" : com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15935toStringimpl(str);
            java.lang.String str2 = this.lastName;
            java.lang.String m15974toStringimpl = str2 == null ? "null" : com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15974toStringimpl(str2);
            java.lang.String str3 = this.profilePictureUrl;
            java.lang.String m15992toStringimpl = str3 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15992toStringimpl(str3) : "null";
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AvailableForSignup(email=");
            sb.append(m15926toStringimpl);
            sb.append(", firstName=");
            sb.append(m15935toStringimpl);
            sb.append(", lastName=");
            sb.append(m15974toStringimpl);
            sb.append(", profilePictureUrl=");
            sb.append(m15992toStringimpl);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int m15925hashCodeimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email);
            java.lang.String str = this.firstName;
            int m15934hashCodeimpl = str == null ? 0 : com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15934hashCodeimpl(str);
            java.lang.String str2 = this.lastName;
            int m15973hashCodeimpl = str2 == null ? 0 : com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15973hashCodeimpl(str2);
            java.lang.String str3 = this.profilePictureUrl;
            return (((((m15925hashCodeimpl * 31) + m15934hashCodeimpl) * 31) + m15973hashCodeimpl) * 31) + (str3 != null ? com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15991hashCodeimpl(str3) : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup availableForSignup = (com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup) other;
            if (!com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, availableForSignup.email)) {
                return false;
            }
            java.lang.String str = this.firstName;
            java.lang.String str2 = availableForSignup.firstName;
            if (str != null ? !(str2 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15933equalsimpl0(str, str2)) : str2 != null) {
                return false;
            }
            java.lang.String str3 = this.lastName;
            java.lang.String str4 = availableForSignup.lastName;
            if (str3 != null ? !(str4 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15972equalsimpl0(str3, str4)) : str4 != null) {
                return false;
            }
            java.lang.String str5 = this.profilePictureUrl;
            java.lang.String str6 = availableForSignup.profilePictureUrl;
            return str5 != null ? str6 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.ProfileUrl.m15990equalsimpl0(str5, str6) : str6 == null;
        }

        /* renamed from: copy-_SYLGpA, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup m16052copy_SYLGpA(java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String profilePictureUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup(email, firstName, lastName, profilePictureUrl, null);
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

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-_SYLGpA$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup m16047copy_SYLGpA$default(com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup availableForSignup, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = availableForSignup.email;
            }
            if ((i & 2) != 0) {
                str2 = availableForSignup.firstName;
            }
            if ((i & 4) != 0) {
                str3 = availableForSignup.lastName;
            }
            if ((i & 8) != 0) {
                str4 = availableForSignup.profilePictureUrl;
            }
            return availableForSignup.m16052copy_SYLGpA(str, str2, str3, str4);
        }

        public /* synthetic */ AvailableForSignup(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$SuggestedCorrection;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "suggestedEmail", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2-BvNj-jI", "component2", "copy-o67mufw", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess$SuggestedCorrection;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI", "getSuggestedEmail-BvNj-jI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SuggestedCorrection implements com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess {
        private final java.lang.String email;
        private final java.lang.String suggestedEmail;

        private SuggestedCorrection(java.lang.String str, java.lang.String str2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
            this.email = str;
            this.suggestedEmail = str2;
        }

        /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16065getEmailBvNjjI() {
            return this.email;
        }

        /* renamed from: getSuggestedEmail-BvNj-jI, reason: not valid java name */
        public final java.lang.String m16066getSuggestedEmailBvNjjI() {
            return this.suggestedEmail;
        }

        public final java.lang.String toString() {
            java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
            java.lang.String m15926toStringimpl2 = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.suggestedEmail);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestedCorrection(email=");
            sb.append(m15926toStringimpl);
            sb.append(", suggestedEmail=");
            sb.append(m15926toStringimpl2);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.suggestedEmail);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection)) {
                return false;
            }
            com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection suggestedCorrection = (com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection) other;
            return com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, suggestedCorrection.email) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.suggestedEmail, suggestedCorrection.suggestedEmail);
        }

        /* renamed from: copy-o67mufw, reason: not valid java name */
        public final com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection m16064copyo67mufw(java.lang.String email, java.lang.String suggestedEmail) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suggestedEmail, "");
            return new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection(email, suggestedEmail, null);
        }

        /* renamed from: component2-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getSuggestedEmail() {
            return this.suggestedEmail;
        }

        /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
        public final java.lang.String getEmail() {
            return this.email;
        }

        /* renamed from: copy-o67mufw$default, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection m16061copyo67mufw$default(com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection suggestedCorrection, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = suggestedCorrection.email;
            }
            if ((i & 2) != 0) {
                str2 = suggestedCorrection.suggestedEmail;
            }
            return suggestedCorrection.m16064copyo67mufw(str, str2);
        }

        public /* synthetic */ SuggestedCorrection(java.lang.String str, java.lang.String str2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2);
        }
    }
}
