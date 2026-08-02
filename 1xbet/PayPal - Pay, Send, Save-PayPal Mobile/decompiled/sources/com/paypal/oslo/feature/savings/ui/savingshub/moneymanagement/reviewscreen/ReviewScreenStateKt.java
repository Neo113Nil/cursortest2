package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.reviewscreen;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)D", "DefaultFrequencyText", "Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ReviewScreenStateKt {
    public static final java.lang.String DefaultFrequencyText = "One-Time (Today)";

    /* JADX INFO: Access modifiers changed from: private */
    public static final double getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.String str2 = str;
        boolean contains$default = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) str2, (java.lang.CharSequence) "-", false, 2, (java.lang.Object) null);
        java.lang.String replace = new kotlin.text.Regex("[^0-9.]").replace(str2, "");
        double d = 0.0d;
        if (replace.length() == 0) {
            return 0.0d;
        }
        d = java.lang.Double.parseDouble(replace);
        if (contains$default) {
            return -d;
        }
        return d;
    }
}
