package com.amazon.device.iap.internal.c;

/* compiled from: EntitlementTracker.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static com.amazon.device.iap.internal.c.c f3487a = new com.amazon.device.iap.internal.c.c();
    private static final java.lang.String b = "c";
    private static final java.lang.String c = com.amazon.device.iap.internal.c.c.class.getName() + "_PREFS_";

    public static com.amazon.device.iap.internal.c.c a() {
        return f3487a;
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.amazon.device.iap.internal.util.e.a(b, "enter saveEntitlementRecord for v1 Entitlement [" + str2 + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + str3 + "], user [" + str + com.ironsource.X3.j.e);
        try {
            com.amazon.device.iap.internal.util.d.a(str, "userId");
            com.amazon.device.iap.internal.util.d.a(str2, "receiptId");
            com.amazon.device.iap.internal.util.d.a(str3, org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU);
            android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(b2, "context");
            android.content.SharedPreferences.Editor edit = b2.getSharedPreferences(c + str, 0).edit();
            edit.putString(str3, str2);
            edit.commit();
        } catch (java.lang.Throwable th) {
            com.amazon.device.iap.internal.util.e.a(b, "error in saving v1 Entitlement:" + str2 + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + str3 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.e.a(b, "leaving saveEntitlementRecord for v1 Entitlement [" + str2 + com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING + str3 + "], user [" + str + com.ironsource.X3.j.e);
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2) {
        com.amazon.device.iap.internal.util.e.a(b, "enter getReceiptIdFromSku for sku [" + str2 + "], user [" + str + com.ironsource.X3.j.e);
        java.lang.String str3 = null;
        try {
            com.amazon.device.iap.internal.util.d.a(str, "userId");
            com.amazon.device.iap.internal.util.d.a(str2, org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.COLUMN_SKU);
            android.content.Context b2 = com.amazon.device.iap.internal.d.d().b();
            com.amazon.device.iap.internal.util.d.a(b2, "context");
            str3 = b2.getSharedPreferences(c + str, 0).getString(str2, null);
        } catch (java.lang.Throwable th) {
            com.amazon.device.iap.internal.util.e.a(b, "error in saving v1 Entitlement:" + str2 + ":" + th.getMessage());
        }
        com.amazon.device.iap.internal.util.e.a(b, "leaving saveEntitlementRecord for sku [" + str2 + "], user [" + str + com.ironsource.X3.j.e);
        return str3;
    }
}
