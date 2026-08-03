package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class K3 {
    public static final boolean a(java.lang.String str) {
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return false;
        }
        java.lang.String scheme = android.net.Uri.parse(str).getScheme();
        return !(scheme == null || scheme.length() == 0);
    }
}
