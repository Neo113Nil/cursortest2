package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* loaded from: classes4.dex */
public abstract class q {
    public static void a(Context context, z zVar) {
        String str = null;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            r2 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
            if (!r2) {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (str != null) {
            synchronized (zVar) {
                y yVar = zVar.b;
                yVar.f5295a = str;
                yVar.b = r2;
                yVar.c = true;
            }
        }
    }
}
