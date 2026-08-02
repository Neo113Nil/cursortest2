package com.paypal.oslo.feature.revolvingcreditservicing.utils;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u001a\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005"}, d2 = {"", "toAccessibleDigits", "(Ljava/lang/String;)Ljava/lang/String;", "", "isTelLink", "(Ljava/lang/String;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StringExtensionsKt {
    public static final boolean isTelLink(java.lang.String str) {
        return str != null && kotlin.text.StringsKt.startsWith(str, "tel:", true);
    }

    public static final java.lang.String toAccessibleDigits(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "");
        return kotlin.collections.ArraysKt.joinToString$default(charArray, (java.lang.CharSequence) " ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null);
    }
}
