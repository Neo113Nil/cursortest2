package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.validation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0007\"\u0014\u0010\t\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007\"\u0014\u0010\f\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0007"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "containsUrl", "(Ljava/lang/String;)Z", "", "MaxQuantity", com.visa.cbp.getEncExpo.warmup, "MaxCustomAmount", "ItemNameMaxLength", "ItemDescriptionMaxLength", "PaymentNoteMaxLength", "MaxDiscountPercentage"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ValidationUtilsKt {
    public static final int ItemDescriptionMaxLength = 1000;
    public static final int ItemNameMaxLength = 80;
    public static final int MaxCustomAmount = 1000000;
    public static final int MaxDiscountPercentage = 100;
    public static final int MaxQuantity = 1000000;
    public static final int PaymentNoteMaxLength = 4000;

    public static final boolean containsUrl(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.util.regex.Matcher matcher = androidx.core.util.PatternsCompat.WEB_URL.matcher(str);
        while (matcher.find()) {
            int start = matcher.start();
            if (start == 0 || str.charAt(start - 1) != '@') {
                return true;
            }
        }
        return false;
    }
}
