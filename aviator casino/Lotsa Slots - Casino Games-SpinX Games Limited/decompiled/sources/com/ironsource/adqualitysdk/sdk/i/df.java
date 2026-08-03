package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class df extends com.ironsource.adqualitysdk.sdk.i.cw {
    /* renamed from: ﾒ, reason: contains not printable characters */
    public static android.webkit.WebView m7469(java.util.List<java.lang.Object> list) {
        int i;
        android.app.Activity activity = (android.app.Activity) m7362(list, 0, android.app.Activity.class);
        java.util.List arrayList = new java.util.ArrayList();
        java.lang.String str = null;
        if (list.size() > 1) {
            i = ((java.lang.Integer) m7362(list, 1, java.lang.Integer.class)).intValue();
            if (list.size() > 2) {
                str = (java.lang.String) m7362(list, 2, java.lang.String.class);
                if (list.size() > 3) {
                    arrayList = (java.util.List) m7362(list, 3, java.util.List.class);
                }
            }
        } else {
            i = -1;
        }
        return (android.webkit.WebView) com.ironsource.adqualitysdk.sdk.i.kq.m8502(activity, android.webkit.WebView.class, i, arrayList, str);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m7467(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.kq.m8504((android.view.View) m7362(list, 0, android.view.View.class));
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static <E extends android.view.View> E m7466(java.util.List<java.lang.Object> list) {
        return (E) com.ironsource.adqualitysdk.sdk.i.kq.m8503((android.view.View) m7362(list, 0, android.view.View.class), (java.lang.Class) m7362(list, 1, java.lang.Class.class), ((java.lang.Boolean) m7362(list, 2, java.lang.Boolean.class)).booleanValue());
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static android.view.View m7468(java.util.List<java.lang.Object> list) {
        return com.ironsource.adqualitysdk.sdk.i.kq.m8510((android.app.Activity) m7362(list, 0, android.app.Activity.class));
    }
}
