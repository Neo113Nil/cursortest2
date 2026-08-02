package com.paypal.oslo.feature.debitcard.servicing.ui.showcard.util;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "formatCardNumber", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowDebitCardStringExtensionsKt {
    public static final java.lang.String formatCardNumber(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new kotlin.text.Regex("....").replace(str, "$0 ");
    }
}
