package com.amazon.device.iap.internal.util;

/* compiled from: CursorUtil.java */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final java.lang.String f3494a = com.amazon.device.iap.internal.util.b.class.getName() + "_PREFS";

    public static java.lang.String a(java.lang.String str) {
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) str, "userId");
        android.content.Context b = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b, "context");
        return b.getSharedPreferences(f3494a, 0).getString(str, null);
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        com.amazon.device.iap.internal.util.d.a((java.lang.Object) str, "userId");
        android.content.Context b = com.amazon.device.iap.internal.d.d().b();
        com.amazon.device.iap.internal.util.d.a(b, "context");
        android.content.SharedPreferences.Editor edit = b.getSharedPreferences(f3494a, 0).edit();
        edit.putString(str, str2);
        edit.commit();
    }
}
