package com.facetec.sdk;

/* loaded from: classes8.dex */
final class dl {
    private static java.util.HashMap<java.lang.Integer, java.lang.String> c;
    private static android.content.res.Resources d;

    dl() {
    }

    static void d(android.app.Activity activity) {
        if (d == null) {
            d = com.facetec.sdk.dp.a(activity.getApplicationContext());
        }
    }

    static java.lang.String d(int i) {
        if (i == 0) {
            return "";
        }
        java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = c;
        java.lang.String str = hashMap != null ? hashMap.get(java.lang.Integer.valueOf(i)) : null;
        return str != null ? str : d.getString(i);
    }

    static void d(android.widget.TextView textView, int i) {
        if (textView == null) {
            return;
        }
        textView.setText(d(i));
    }

    static void c(java.util.Map<java.lang.Integer, java.lang.String> map) {
        synchronized (com.facetec.sdk.dl.class) {
            c = new java.util.HashMap<>(map);
        }
    }

    private static java.lang.String b(android.app.Activity activity, int i, java.lang.String str) {
        android.content.res.Configuration configuration = new android.content.res.Configuration(com.facetec.sdk.dp.a((android.content.Context) activity).getConfiguration());
        configuration.setLocale(new java.util.Locale(str));
        return activity.createConfigurationContext(configuration).getResources().getString(i);
    }

    static boolean d(android.app.Activity activity, int i) {
        if (d.getConfiguration().locale != java.util.Locale.ENGLISH && !java.util.Locale.getDefault().getLanguage().equals("en")) {
            java.util.HashMap<java.lang.Integer, java.lang.String> hashMap = c;
            java.lang.String str = null;
            if ((hashMap != null ? hashMap.get(java.lang.Integer.valueOf(i)) : null) == null) {
                try {
                    if (!java.util.Objects.equals(b(activity, i, "en"), b(activity, i, java.util.Locale.getDefault().getLanguage()))) {
                        str = b(activity, i, java.util.Locale.getDefault().getLanguage());
                    }
                } catch (java.lang.Exception unused) {
                }
                return str != null;
            }
        }
        return true;
    }
}
