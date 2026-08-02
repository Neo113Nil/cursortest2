package com.paypal.oslo.feature.businesscustomers.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\b\u001a\u0006*\u00020\u00050\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"", "email", "", "isValidEmail", "(Ljava/lang/String;)Z", "Ljava/util/regex/Pattern;", "getHighSpeedVideoFpsRanges", "Ljava/util/regex/Pattern;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class EmailUtilsKt {
    private static final java.util.regex.Pattern getHighSpeedVideoFpsRanges = java.util.regex.Pattern.compile(kotlin.text.StringsKt.replace$default("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\n\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\n\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@\n(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\n\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}\n(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|\n[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\n\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "", false, 4, (java.lang.Object) null));

    public static final boolean isValidEmail(java.lang.String str) {
        java.lang.String str2 = str;
        if (str2 == null || kotlin.text.StringsKt.isBlank(str2)) {
            return false;
        }
        return getHighSpeedVideoFpsRanges.matcher(str2).matches();
    }
}
