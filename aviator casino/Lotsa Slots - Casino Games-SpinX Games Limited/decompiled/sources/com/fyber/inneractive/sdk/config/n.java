package com.fyber.inneractive.sdk.config;

/* loaded from: classes3.dex */
public abstract class n {
    public static void a(android.content.Context context, com.fyber.inneractive.sdk.config.w wVar) {
        java.lang.String str = null;
        try {
            android.content.ContentResolver contentResolver = context.getContentResolver();
            r2 = android.provider.Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
            if (!r2) {
                str = android.provider.Settings.Secure.getString(contentResolver, "advertising_id");
            }
        } catch (android.provider.Settings.SettingNotFoundException unused) {
        }
        if (str != null) {
            synchronized (wVar) {
                com.fyber.inneractive.sdk.config.v vVar = wVar.b;
                vVar.f3641a = str;
                vVar.b = r2;
                vVar.c = true;
            }
        }
    }
}
