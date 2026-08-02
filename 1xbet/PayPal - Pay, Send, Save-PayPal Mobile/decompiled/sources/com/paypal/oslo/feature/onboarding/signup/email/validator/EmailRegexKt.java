package com.paypal.oslo.feature.onboarding.signup.email.validator;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u001a\u0010\u0001\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"", "EmailFormatRegex", "Ljava/lang/String;", "getEmailFormatRegex", "()Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailRegexKt {
    private static final java.lang.String EmailFormatRegex = kotlin.text.StringsKt.replace$default("^(?:[\\w!#$%&'*+\\-/=?^`{|}~]+\\.)*\n[\\w!#$%&'*+\\-/=?^`{|}~]+@\n(?:(?:(?:[a-zA-Z0-9](?:[a-zA-Z0-9\\-](?!\\.)){0,61}[a-zA-Z0-9]?\\.)+\n[a-zA-Z0-9](?:[a-zA-Z0-9\\-](?!$)){0,61}[a-zA-Z0-9]?)\n|(?:\\[(?:(?:[01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.){3}(?:[01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\]))$", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "", false, 4, (java.lang.Object) null);

    public static final java.lang.String getEmailFormatRegex() {
        return EmailFormatRegex;
    }
}
