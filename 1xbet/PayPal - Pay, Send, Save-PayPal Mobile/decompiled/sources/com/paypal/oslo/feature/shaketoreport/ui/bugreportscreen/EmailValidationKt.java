package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "email", "", "isValidPayPalEmail", "(Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EmailValidationKt {
    public static final boolean isValidPayPalEmail(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return str.length() == 0 || kotlin.text.StringsKt.endsWith(str, com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.FormConstantsKt.PayPalEmailDomain, true);
    }
}
