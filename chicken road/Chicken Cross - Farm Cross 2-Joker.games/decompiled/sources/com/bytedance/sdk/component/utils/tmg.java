package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.res.Configuration;
import java.util.Locale;

/* loaded from: classes4.dex */
public class tmg {
    private static Context pcc;

    public static void pcc(Context context, String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        try {
            pcc = context.createConfigurationContext(sf(context, str, str2));
        } catch (Throwable th) {
            th.getMessage();
        }
        tz.pcc(pcc);
    }

    private static Configuration sf(Context context, String str, String str2) {
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(new Locale(str, str2));
        return configuration;
    }
}
