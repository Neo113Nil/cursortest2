package sg.bigo.ads.C1;

import android.text.TextUtils;

/* loaded from: classes3.dex */
public abstract class b {
    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static float b(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            return 0;
        }
    }
}
