package com.paypal.oslo.feature.onboarding.signup.phone.ui.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/model/PhoneOtpVerificationResult;", "", "", "phoneNumber", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/InternationalDialingCode;", "dialingCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2-ALGuh4w", "component2", "component3-WKAk_us", "()I", "component3", "copy-LOc3nCM", "(Ljava/lang/String;Ljava/lang/String;I)Lcom/paypal/oslo/feature/onboarding/signup/phone/ui/model/PhoneOtpVerificationResult;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "toString", "Ljava/lang/String;", "getPhoneNumber", "getCountryCode-ALGuh4w", com.visa.cbp.getEncExpo.warmup, "getDialingCode-WKAk_us"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PhoneOtpVerificationResult {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final int dialingCode;
    private final java.lang.String phoneNumber;

    private PhoneOtpVerificationResult(java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.phoneNumber = str;
        this.countryCode = str2;
        this.dialingCode = i;
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: getCountryCode-ALGuh4w, reason: not valid java name */
    public final java.lang.String m16425getCountryCodeALGuh4w() {
        return this.countryCode;
    }

    /* renamed from: getDialingCode-WKAk_us, reason: not valid java name */
    public final int m16426getDialingCodeWKAk_us() {
        return this.dialingCode;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.phoneNumber;
        java.lang.String m11368toStringimpl = com.paypal.oslo.core.i18n.domain.model.CountryCode.m11368toStringimpl(this.countryCode);
        java.lang.String m15965toStringimpl = com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15965toStringimpl(this.dialingCode);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneOtpVerificationResult(phoneNumber=");
        sb.append(str);
        sb.append(", countryCode=");
        sb.append(m11368toStringimpl);
        sb.append(", dialingCode=");
        sb.append(m15965toStringimpl);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.phoneNumber.hashCode() * 31) + com.paypal.oslo.core.i18n.domain.model.CountryCode.m11367hashCodeimpl(this.countryCode)) * 31) + com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15964hashCodeimpl(this.dialingCode);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult phoneOtpVerificationResult = (com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, phoneOtpVerificationResult.phoneNumber) && com.paypal.oslo.core.i18n.domain.model.CountryCode.m11366equalsimpl0(this.countryCode, phoneOtpVerificationResult.countryCode) && com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15963equalsimpl0(this.dialingCode, phoneOtpVerificationResult.dialingCode);
    }

    /* renamed from: copy-LOc3nCM, reason: not valid java name */
    public final com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult m16424copyLOc3nCM(java.lang.String phoneNumber, java.lang.String countryCode, int dialingCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        return new com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult(phoneNumber, countryCode, dialingCode, null);
    }

    /* renamed from: component3-WKAk_us, reason: not valid java name and from getter */
    public final int getDialingCode() {
        return this.dialingCode;
    }

    /* renamed from: component2-ALGuh4w, reason: not valid java name and from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: copy-LOc3nCM$default, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult m16421copyLOc3nCM$default(com.paypal.oslo.feature.onboarding.signup.phone.ui.model.PhoneOtpVerificationResult phoneOtpVerificationResult, java.lang.String str, java.lang.String str2, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = phoneOtpVerificationResult.phoneNumber;
        }
        if ((i2 & 2) != 0) {
            str2 = phoneOtpVerificationResult.countryCode;
        }
        if ((i2 & 4) != 0) {
            i = phoneOtpVerificationResult.dialingCode;
        }
        return phoneOtpVerificationResult.m16424copyLOc3nCM(str, str2, i);
    }

    public /* synthetic */ PhoneOtpVerificationResult(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i);
    }
}
