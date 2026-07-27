package com.bytedance.sdk.component.adexpress.oo;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.tz;
import java.util.Locale;

/* loaded from: classes4.dex */
public class qf {
    public static int pcc(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static float pcc(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        return (f * oo(context)) + 0.5f;
    }

    public static int sf(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        float oo = oo(context);
        if (oo <= 0.0f) {
            oo = 1.0f;
        }
        return (int) ((f / oo) + 0.5f);
    }

    public static float gm(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        return f * oo(context);
    }

    private static float oo(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int pcc(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int sf(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm().sf();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String gm(Context context) {
        String str;
        try {
            Locale locale = tz.sf(context).getConfiguration().getLocales().get(0);
            str = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    str = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return pcc(str);
    }

    private static String pcc(String str) {
        str.hashCode();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
