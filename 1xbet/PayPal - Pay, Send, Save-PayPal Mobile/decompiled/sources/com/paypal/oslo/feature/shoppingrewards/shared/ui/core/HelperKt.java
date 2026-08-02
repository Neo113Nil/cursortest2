package com.paypal.oslo.feature.shoppingrewards.shared.ui.core;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "getCurrentMonth", "()Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class HelperKt {
    public static final java.lang.String getCurrentMonth() {
        java.lang.String format = java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_SUB_HEADER_MONTH_DATE_FORMAT, java.util.Locale.ENGLISH));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return format;
    }
}
