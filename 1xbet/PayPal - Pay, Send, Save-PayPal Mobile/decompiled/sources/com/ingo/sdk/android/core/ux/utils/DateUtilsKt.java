package com.ingo.sdk.android.core.ux.utils;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "input", "", "isDobValid", "(Ljava/lang/String;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class DateUtilsKt {
    public static final boolean isDobValid(java.lang.String str) {
        if (str == null) {
            return false;
        }
        try {
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.DOB_DEFAULT_VALIDATION_PATTERN, java.util.Locale.US);
            simpleDateFormat.setLenient(false);
            java.util.Date parse = simpleDateFormat.parse(str);
            java.util.Date parse2 = simpleDateFormat.parse("01011899");
            java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
            calendar.set(1, calendar.get(1) - 18);
            java.util.Date time = calendar.getTime();
            if (parse.after(parse2)) {
                if (parse.before(time)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.Throwable th) {
            com.ingo.sdk.kotlin.common.core.logging.IngoLogger.e$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Error parsing Date of Birth", null, th, 2, null);
            return false;
        }
    }
}
