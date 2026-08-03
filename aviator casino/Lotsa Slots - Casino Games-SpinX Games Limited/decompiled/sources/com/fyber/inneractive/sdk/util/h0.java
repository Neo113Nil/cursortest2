package com.fyber.inneractive.sdk.util;

/* loaded from: classes3.dex */
public abstract class h0 extends com.fyber.inneractive.sdk.util.o {
    public static boolean a(android.content.Context context, java.lang.String str) {
        try {
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse("googlechrome://navigate?url=" + str));
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
            return true;
        } catch (java.lang.Throwable unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Failed opening chrome for a special uri.", new java.lang.Object[0]);
            return false;
        }
    }

    public static boolean c(java.lang.String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F") || str.startsWith("%");
    }

    public static boolean d(java.lang.String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith(androidx.core.net.MailTo.MAILTO_SCHEME) && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new java.net.URL(str);
                return false;
            } catch (java.net.MalformedURLException unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    public static boolean e(java.lang.String str) {
        android.net.Uri uri;
        if (!com.fyber.inneractive.sdk.util.v.a(str)) {
            return false;
        }
        try {
            uri = android.net.Uri.parse(str);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("IAJavaUtil: getValidUri: Invalid url %s", str);
            uri = null;
        }
        if (uri != null && com.fyber.inneractive.sdk.util.v.a(uri.getScheme())) {
            return com.fyber.inneractive.sdk.util.v.a(uri.getHost());
        }
        return false;
    }

    public static boolean f(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        if (!com.fyber.inneractive.sdk.util.s.a() || com.fyber.inneractive.sdk.config.IAConfigManager.N.q) {
            return (str.startsWith("http://") || str.startsWith("http%3A%2F%2F")) ? false : true;
        }
        return true;
    }

    public static boolean a(android.content.Context context, android.content.Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof android.app.Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (java.lang.Throwable unused) {
            }
        }
        return false;
    }

    public static java.util.HashMap a(android.net.Uri uri) {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return hashMap;
    }
}
