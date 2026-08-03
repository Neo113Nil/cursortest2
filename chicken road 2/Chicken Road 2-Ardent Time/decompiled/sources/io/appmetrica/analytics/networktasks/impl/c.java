package io.appmetrica.analytics.networktasks.impl;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7369a;

    public c(java.lang.String str) {
        this.f7369a = a(str);
    }

    public static java.lang.String a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        return "http".equals(parse.getScheme()) ? parse.buildUpon().scheme("https").build().toString() : str;
    }
}
