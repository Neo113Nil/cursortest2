package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class Fl {
    public static final boolean a(java.lang.String str) {
        if (str == null || kotlin.text.StringsKt.contains$default((java.lang.CharSequence) kotlin.text.StringsKt.trim((java.lang.CharSequence) str).toString(), ' ', false, 2, (java.lang.Object) null)) {
            return false;
        }
        return android.webkit.URLUtil.isHttpsUrl(str) || android.webkit.URLUtil.isHttpUrl(str);
    }

    public static final java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        java.lang.String obj = str.subSequence(i, length + 1).toString();
        return obj == null ? "" : obj;
    }
}
