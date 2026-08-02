package com.paypal.oslo.feature.onboarding.signup.phone.data.util;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/data/util/OtpExtractor;", "", "<init>", "()V", "", "smsMessage", "Lcom/paypal/oslo/feature/onboarding/signup/domain/model/OtpCode;", "extractOtpCode-hSlSWII", "(Ljava/lang/String;)Ljava/lang/String;", "extractOtpCode", "Lkotlin/text/Regex;", "getHighSpeedVideoSizes", "Lkotlin/text/Regex;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtpExtractor {
    public static final com.paypal.oslo.feature.onboarding.signup.phone.data.util.OtpExtractor INSTANCE = new com.paypal.oslo.feature.onboarding.signup.phone.data.util.OtpExtractor();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("(\\d{6})");
    public static final int $stable = 8;

    private OtpExtractor() {
    }

    /* renamed from: extractOtpCode-hSlSWII, reason: not valid java name */
    public final java.lang.String m16391extractOtpCodehSlSWII(java.lang.String smsMessage) {
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smsMessage, "");
        kotlin.text.MatchResult find$default = kotlin.text.Regex.find$default(Camera2StreamConfigurationMap, smsMessage, 0, 2, null);
        if (find$default == null || (value = find$default.getValue()) == null) {
            return null;
        }
        return com.paypal.oslo.feature.onboarding.signup.domain.model.OtpCode.m16307constructorimpl(value);
    }
}
