package com.paypal.oslo.feature.onboarding.signup.phone.domain.model;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/PhoneNumber;", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "internationalDialingCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-v-Cycbc", "()Ljava/lang/String;", "component1", "component2-ALGuh4w", "component2", "component3-WKAk_us", "()I", "component3", "copy-BtfQNMQ", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/Phone;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "Ljava/lang/String;", "getPhoneNumber-v-Cycbc", "getCountryCode-ALGuh4w", com.visa.cbp.getEncExpo.warmup, "getInternationalDialingCode-WKAk_us"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Phone {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final int internationalDialingCode;
    private final java.lang.String phoneNumber;

    private Phone(java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.phoneNumber = str;
        this.countryCode = str2;
        this.internationalDialingCode = i;
    }

    /* renamed from: getPhoneNumber-v-Cycbc, reason: not valid java name */
    public final java.lang.String m16399getPhoneNumbervCycbc() {
        return this.phoneNumber;
    }

    /* renamed from: getCountryCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m16397getCountryCodeALGuh4w() {
        return this.countryCode;
    }

    /* renamed from: getInternationalDialingCode-WKAk_us, reason: not valid java name */
    public final int m16398getInternationalDialingCodeWKAk_us() {
        return this.internationalDialingCode;
    }

    public final java.lang.String toString() {
        java.lang.String m15983toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15983toStringimpl(this.phoneNumber);
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.countryCode);
        java.lang.String m15965toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15965toStringimpl(this.internationalDialingCode);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Phone(phoneNumber=");
        sb.append(m15983toStringimpl);
        sb.append(", countryCode=");
        sb.append(m11368toStringimpl);
        sb.append(", internationalDialingCode=");
        sb.append(m15965toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15982hashCodeimpl(this.phoneNumber) * 31) + com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.countryCode)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15964hashCodeimpl(this.internationalDialingCode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone = (com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone) other;
        return com.paypal.oslo.feature.onboarding.api.signup.domain.model.PhoneNumber.m15981equalsimpl0(this.phoneNumber, phone.phoneNumber) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.countryCode, phone.countryCode) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15963equalsimpl0(this.internationalDialingCode, phone.internationalDialingCode);
    }

    /* renamed from: copy-BtfQNMQ, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone m16396copyBtfQNMQ(java.lang.String phoneNumber, java.lang.String countryCode, int internationalDialingCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone(phoneNumber, countryCode, internationalDialingCode, null);
    }

    /* renamed from: component3-WKAk_us, reason: not valid java name and from getter */
    public final int getInternationalDialingCode() {
        return this.internationalDialingCode;
    }

    /* renamed from: component2-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1-v-Cycbc, reason: not valid java name and from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: copy-BtfQNMQ$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone m16392copyBtfQNMQ$default(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.Phone phone, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = phone.phoneNumber;
        }
        if ((i2 & 2) != 0) {
            str2 = phone.countryCode;
        }
        if ((i2 & 4) != 0) {
            i = phone.internationalDialingCode;
        }
        return phone.m16396copyBtfQNMQ(str, str2, i);
    }

    public /* synthetic */ Phone(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i);
    }
}
