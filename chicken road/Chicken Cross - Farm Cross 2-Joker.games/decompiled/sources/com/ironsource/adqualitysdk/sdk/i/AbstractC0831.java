package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.UUID;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓹ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0831 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2409 = StringFog.decrypt("unT9eAko3KysdfdnBD2Xr6B/\n", "yRuSFWVJ8ss=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5676(Context context) {
        String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), StringFog.decrypt("mxJQfir1NGGTGA==\n", "+nw0DEWcUD4=\n"));
        if (string != null) {
            return string;
        }
        AbstractC0544.m5502(StringFog.decrypt("jMUGMrxv/4SK9D4UjEvbwJb+LAWcXe7WoPAoBZxX3cG2\n", "xZZNd/k5vqQ=\n"), StringFog.decrypt("dsTU/PNoUsYVzcTk9G5V83vv89/eQir7cYWBxeRvG9UVzMT+8nQUxlDPgfnzKA==\n", "NauhkJcGdbI=\n"));
        SharedPreferences sharedPreferences = context.getSharedPreferences(StringFog.decrypt("BCGf9X/4gshZMZI=\n", "d1XwhxrW6b4=\n"), 0);
        String str = f2409;
        String string2 = sharedPreferences.getString(str, null);
        if (TextUtils.isEmpty(string2)) {
            string2 = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(str, string2).commit();
        }
        return string2;
    }
}
