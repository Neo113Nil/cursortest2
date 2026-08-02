package com.paypal.oslo.feature.onboarding.signup.domain.model;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010 \u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0013JX\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b1\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001cR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b6\u0010\u0013R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b7\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "phone", "Lcom/paypal/oslo/feature/onboarding/signup/password/domain/model/Password;", "password", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "name", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "signupCountryCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/GoogleToken;", "googleToken", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-BvNj-jI", "()Ljava/lang/String;", "component1", "component2", "()Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "component3-WarBkgA", "component3", "component4", "()Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "component5", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "component6-ALGuh4w", "component6", "component7-xvtux3A", "component7", "copy-EEBeQFU", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;Lcom/paypal/oslo/core/i18n/domain/model/Address;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "Ljava/lang/String;", "getEmail-BvNj-jI", "Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "getPhone", "getPassword-WarBkgA", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/Name;", "getName", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress", "getSignupCountryCode-ALGuh4w", "getGoogleToken-xvtux3A", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class SignupData {
    private final com.paypal.oslo.core.i18n.domain.model.Address address;
    private final java.lang.String email;
    private final java.lang.String googleToken;
    private final com.paypal.oslo.feature.onboarding.signup.domain.model.Name name;
    private final java.lang.String password;
    private final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone;
    private final java.lang.String signupCountryCode;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.Companion INSTANCE = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData.Companion(null);
    public static final int $stable = 8;

    private SignupData(java.lang.String str, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String str2, com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.email = str;
        this.phone = phone;
        this.password = str2;
        this.name = name2;
        this.address = address;
        this.signupCountryCode = str3;
        this.googleToken = str4;
    }

    public /* synthetic */ SignupData(java.lang.String str, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String str2, com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, phone, str2, name2, address, str3, (i & 64) != 0 ? null : str4, null);
    }

    /* renamed from: getEmail-BvNj-jI, reason: not valid java name */
    public final java.lang.String m16319getEmailBvNjjI() {
        return this.email;
    }

    public final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone getPhone() {
        return this.phone;
    }

    /* renamed from: getPassword-WarBkgA, reason: not valid java name */
    public final java.lang.String m16321getPasswordWarBkgA() {
        return this.password;
    }

    public final com.paypal.oslo.feature.onboarding.signup.domain.model.Name getName() {
        return this.name;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    /* renamed from: getSignupCountryCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m16322getSignupCountryCodeALGuh4w() {
        return this.signupCountryCode;
    }

    /* renamed from: getGoogleToken-xvtux3A, reason: not valid java name */
    public final java.lang.String m16320getGoogleTokenxvtux3A() {
        return this.googleToken;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;", "empty", "()Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData empty() {
            return new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData(com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15922constructorimpl(""), new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone(com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15979constructorimpl(""), com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US"), com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15961constructorimpl(1), null), com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16373constructorimpl(""), new com.paypal.oslo.feature.onboarding.signup.domain.model.Name(com.paypal.oslo.feature.onboarding.api.signup.domain.model.FirstName.m15931constructorimpl(""), com.paypal.oslo.feature.onboarding.api.signup.domain.model.LastName.m15970constructorimpl(""), null), new com.paypal.oslo.core.i18n.domain.model.Address(com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(""), null, null, null, null, null, null, null, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US"), null, 766, null), com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl("US"), null, null);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        java.lang.String m15926toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15926toStringimpl(this.email);
        com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone = this.phone;
        java.lang.String m16377toStringimpl = com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16377toStringimpl(this.password);
        com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2 = this.name;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.signupCountryCode);
        java.lang.String str = this.googleToken;
        java.lang.String m15956toStringimpl = str == null ? "null" : com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15956toStringimpl(str);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SignupData(email=");
        sb.append(m15926toStringimpl);
        sb.append(", phone=");
        sb.append(phone);
        sb.append(", password=");
        sb.append(m16377toStringimpl);
        sb.append(", name=");
        sb.append(name2);
        sb.append(", address=");
        sb.append(address);
        sb.append(", signupCountryCode=");
        sb.append(m11368toStringimpl);
        sb.append(", googleToken=");
        sb.append(m15956toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int m15925hashCodeimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15925hashCodeimpl(this.email);
        int hashCode = this.phone.hashCode();
        int m16376hashCodeimpl = com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16376hashCodeimpl(this.password);
        int hashCode2 = this.name.hashCode();
        int hashCode3 = this.address.hashCode();
        int m11367hashCodeimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.signupCountryCode);
        java.lang.String str = this.googleToken;
        return (((((((((((m15925hashCodeimpl * 31) + hashCode) * 31) + m16376hashCodeimpl) * 31) + hashCode2) * 31) + hashCode3) * 31) + m11367hashCodeimpl) * 31) + (str == null ? 0 : com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15955hashCodeimpl(str));
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData = (com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData) other;
        if (!com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email.m15924equalsimpl0(this.email, signupData.email) || !kotlin.jvm.internal.Intrinsics.areEqual(this.phone, signupData.phone) || !com.paypal.oslo.feature.onboarding.signup.password.domain.model.Password.m16375equalsimpl0(this.password, signupData.password) || !kotlin.jvm.internal.Intrinsics.areEqual(this.name, signupData.name) || !kotlin.jvm.internal.Intrinsics.areEqual(this.address, signupData.address) || !com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.signupCountryCode, signupData.signupCountryCode)) {
            return false;
        }
        java.lang.String str = this.googleToken;
        java.lang.String str2 = signupData.googleToken;
        return str != null ? str2 != null && com.paypal.oslo.feature.onboarding.api.signup.domain.model.GoogleToken.m15954equalsimpl0(str, str2) : str2 == null;
    }

    /* renamed from: copy-EEBeQFU, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData m16318copyEEBeQFU(java.lang.String email, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String password, com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String signupCountryCode, java.lang.String googleToken) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupCountryCode, "");
        return new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData(email, phone, password, name2, address, signupCountryCode, googleToken, null);
    }

    /* renamed from: component7-xvtux3A, reason: not valid java name and from getter */
    public final java.lang.String getGoogleToken() {
        return this.googleToken;
    }

    /* renamed from: component6-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getSignupCountryCode() {
        return this.signupCountryCode;
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.domain.model.Name getName() {
        return this.name;
    }

    /* renamed from: component3-WarBkgA, reason: not valid java name and from getter */
    public final java.lang.String getPassword() {
        return this.password;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone getPhone() {
        return this.phone;
    }

    /* renamed from: component1-BvNj-jI, reason: not valid java name and from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: copy-EEBeQFU$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData m16313copyEEBeQFU$default(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupData signupData, java.lang.String str, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String str2, com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = signupData.email;
        }
        if ((i & 2) != 0) {
            phone = signupData.phone;
        }
        com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone2 = phone;
        if ((i & 4) != 0) {
            str2 = signupData.password;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            name2 = signupData.name;
        }
        com.paypal.oslo.feature.onboarding.signup.domain.model.Name name3 = name2;
        if ((i & 16) != 0) {
            address = signupData.address;
        }
        com.paypal.oslo.core.i18n.domain.model.Address address2 = address;
        if ((i & 32) != 0) {
            str3 = signupData.signupCountryCode;
        }
        java.lang.String str6 = str3;
        if ((i & 64) != 0) {
            str4 = signupData.googleToken;
        }
        return signupData.m16318copyEEBeQFU(str, phone2, str5, name3, address2, str6, str4);
    }

    public /* synthetic */ SignupData(java.lang.String str, com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String str2, com.paypal.oslo.feature.onboarding.signup.domain.model.Name name2, com.paypal.oslo.core.i18n.domain.model.Address address, java.lang.String str3, java.lang.String str4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, phone, str2, name2, address, str3, str4);
    }
}
