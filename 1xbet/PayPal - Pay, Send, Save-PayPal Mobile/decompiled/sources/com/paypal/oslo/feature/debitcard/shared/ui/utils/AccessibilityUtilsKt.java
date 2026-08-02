package com.paypal.oslo.feature.debitcard.shared.ui.utils;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "digits", "formatCardDigitsForAccessibility", "(Ljava/lang/String;)Ljava/lang/String;", "cardDigits", "replaceCardDigitsForAccessibility", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccessibilityUtilsKt {
    public static final java.lang.String formatCardDigitsForAccessibility(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "");
        return kotlin.collections.ArraysKt.joinToString$default(charArray, (java.lang.CharSequence) " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
    }

    public static final java.lang.String replaceCardDigitsForAccessibility(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.text.StringsKt.replace$default(str, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants.SSN_MASK_CHAR.concat(java.lang.String.valueOf(str2)), formatCardDigitsForAccessibility(str2), false, 4, (java.lang.Object) null);
    }
}
