package com.paypal.oslo.feature.p2p.ui.review.composables.accordions;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a#\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0005\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"", "firstName", "lastName", "getDisplayName", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getInitials"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ContactDisplayHelpersKt {
    public static final java.lang.String getDisplayName(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        java.lang.String obj = kotlin.text.StringsKt.trim(str).toString();
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String obj2 = kotlin.text.StringsKt.trim(str2).toString();
        java.lang.String str3 = obj;
        if (str3.length() == 0 && obj2.length() == 0) {
            return "";
        }
        if (str3.length() == 0) {
            return obj2;
        }
        if (obj2.length() == 0) {
            return obj;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(obj);
        sb.append(" ");
        sb.append(obj2);
        return sb.toString();
    }

    public static final java.lang.String getInitials(java.lang.String str, java.lang.String str2) {
        if (str == null) {
            str = "";
        }
        java.lang.String obj = kotlin.text.StringsKt.trim(str).toString();
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String obj2 = kotlin.text.StringsKt.trim(str2).toString();
        java.lang.String str3 = obj;
        if (str3.length() == 0 && obj2.length() == 0) {
            return "";
        }
        if (str3.length() == 0) {
            return kotlin.text.StringsKt.take(obj2, 1);
        }
        java.lang.String str4 = obj2;
        if (str4.length() == 0) {
            return kotlin.text.StringsKt.take(obj, 2);
        }
        char first = kotlin.text.StringsKt.first(str3);
        char first2 = kotlin.text.StringsKt.first(str4);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(first);
        sb.append(first2);
        return sb.toString();
    }
}
