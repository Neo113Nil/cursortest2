package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static com.dyneti.android.dyscan.i f3310a;

    public static com.dyneti.android.dyscan.i a() {
        if (f3310a == null) {
            synchronized (com.dyneti.android.dyscan.i.class) {
                if (f3310a == null) {
                    f3310a = new com.dyneti.android.dyscan.i();
                }
            }
        }
        return f3310a;
    }

    public static java.lang.String a(android.content.ContentResolver contentResolver) {
        if (android.os.Build.VERSION.SDK_INT <= 31) {
            return android.provider.Settings.Secure.getString(contentResolver, "bluetooth_name");
        }
        return "";
    }
}
