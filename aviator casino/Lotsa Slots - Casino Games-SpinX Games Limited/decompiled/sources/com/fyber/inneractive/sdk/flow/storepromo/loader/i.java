package com.fyber.inneractive.sdk.flow.storepromo.loader;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f3743a = b("app_screen_%d");
    public static final java.lang.String b = "document.getElementById(\"app_screen_%d\").src = app_screen_%d;\n";
    public static final java.lang.String c = b("app_video_url_%d");
    public static final java.lang.String d = "document.getElementById(\"app_video_url_%d\").src = app_video_url_%d;\n";
    public static final java.lang.String e = b("app_icon");
    public static final java.lang.String f = "document.getElementById(\"app_icon\").src = app_icon;\n";
    public static final java.lang.String g = b(com.facebook.internal.NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);
    public static final java.lang.String h = a(com.facebook.internal.NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);
    public static final java.lang.String i = b("app_pub_name");
    public static final java.lang.String j = a("app_pub_name");
    public static final java.lang.String k = b("app_label");
    public static final java.lang.String l = a("app_label");
    public static final java.lang.String m = b("app_size");
    public static final java.lang.String n = a("app_size");
    public static final java.lang.String o = b("app_rating");
    public static final java.lang.String p = a("app_rating");
    public static final java.lang.String q = b("app_rating_icon");
    public static final java.lang.String r = "document.getElementById(\"app_rating_icon\").src = app_rating_icon;\n";

    public static java.lang.String a(java.lang.String str) {
        return "document.getElementById(\"" + str + "\").innerHTML = `${" + str + "}`;\n";
    }

    public static java.lang.String b(java.lang.String str) {
        return "var " + str + " = `%s`;\n";
    }

    public static java.lang.String a(boolean z, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("document.getElementById(\"");
        sb.append(str);
        sb.append("\").style.display = ");
        sb.append(z ? "'block'" : "'none'");
        sb.append(";\n");
        return sb.toString();
    }
}
