package com.ironsource;

/* renamed from: com.ironsource.da, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3007da {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f6201a = "_preferences";

    private C3007da() {
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + f6201a;
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (context == null) {
            return;
        }
        android.content.SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static java.lang.String a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        return a(context, a(context, ""), str, str2);
    }

    public static boolean a(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z) {
        return context == null ? z : context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    static int a(android.content.Context context, java.lang.String str, java.lang.String str2, int i) {
        return context == null ? i : context.getSharedPreferences(str, 0).getInt(str2, i);
    }

    public static int a(android.content.Context context, java.lang.String str, int i) {
        return a(context, a(context, ""), str, i);
    }
}
