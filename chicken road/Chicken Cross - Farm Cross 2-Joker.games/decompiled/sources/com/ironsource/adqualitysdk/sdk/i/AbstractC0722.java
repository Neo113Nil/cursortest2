package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⴡ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0722 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f1996 = StringFog.decrypt("MHZP9bpesJM=\n", "cQY/oM433OA=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1995 = StringFog.decrypt("Odk=\n", "Sbf5vKjyv/M=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1994 = StringFog.decrypt("jcE=\n", "7qfEt8x976M=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1993 = StringFog.decrypt("SwA=\n", "PWO0gbPQn9w=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1992 = StringFog.decrypt("Gs0=\n", "bKOv9avZArs=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1991 = StringFog.decrypt("NpA=\n", "Uv68Ismxwk8=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f1990 = StringFog.decrypt("Sg==\n", "P5jBghr/qBs=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f1989 = StringFog.decrypt("ZA==\n", "Ba7Nu9JPR6U=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f1988 = StringFog.decrypt("mA==\n", "9jyEVvyVixg=\n");

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5640(Context context, JSONObject jSONObject) {
        String packageName = context.getPackageName();
        try {
            jSONObject.put(f1995, packageName);
        } catch (JSONException e) {
            String str = f1996;
            AbstractC0544.m5511(str, str, StringFog.decrypt("KXPzd6/VAJZKfeJ/69lSjA5w41Kvm06MDHOmb6SbTZEFcg==\n", "ahyGG8u7J+I=\n"), e, null, false);
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            jSONObject.put(f1994, packageManager.getInstallerPackageName(packageName));
        } catch (JSONException e2) {
            AbstractC0544.m5503(f1996, StringFog.decrypt("dM7p7wXyOscXwPjnQfVzwEPA8O8E7j3DVsL34gb5Pd1WzPmjFfM92UTO8q1B+W/BWNOmow==\n", "N6Gcg2GcHbM=\n") + e2.getLocalizedMessage());
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            jSONObject.put(f1993, Integer.toString(packageInfo.versionCode));
            jSONObject.put(f1992, packageInfo.versionName);
        } catch (PackageManager.NameNotFoundException e3) {
            AbstractC0544.m5503(f1996, AbstractC1196.m5920("GVP0EyOPmxR6W+QLZ5HdAzFd5hpnjN0OO1vkDWeH0xJ6\n", "WjyBf0fhvGA=\n", new StringBuilder(), packageName).append(StringFog.decrypt("KxW4cKMezLoxGA==\n", "CziYFdFso8g=\n")).append(e3.getLocalizedMessage()).toString());
        } catch (JSONException e4) {
            AbstractC0544.m5503(f1996, StringFog.decrypt("DppwglVwvt9tlGGKEX/p222DYJxCd/bFbZxriF4+7cRtn3aBXzC5zj+HapwLPg==\n", "TfUF7jEemas=\n") + e4.getLocalizedMessage());
        }
        try {
            jSONObject.put(f1991, packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0)).toString());
        } catch (PackageManager.NameNotFoundException e5) {
            AbstractC0544.m5503(f1996, AbstractC1196.m5920("Vuat9ByqJeY17r3sWLRj8X7ov/1YqWP8dO696liibeA1\n", "FYnYmHjEApI=\n", new StringBuilder(), packageName).append(StringFog.decrypt("P5TibjBW4AElmQ==\n", "H7nCC0Ikj3M=\n")).append(e5.getLocalizedMessage()).toString());
        } catch (JSONException e6) {
            AbstractC0544.m5503(f1996, StringFog.decrypt("gtyoKx/gra3h0rkjW+/6qeHdvCoeruO3p9z9MxSu4Kqu3fNnHvz4trOJ/Q==\n", "wbPdR3uOitk=\n") + e6.getLocalizedMessage());
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5639(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            return packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AbstractC0544.m5503(f1996, AbstractC1196.m5920("44zsfIT0eluAhPxkwOo8TMuC/nXA9zxBwYT8YsD8Ml2A\n", "oOOZEOCaXS8=\n", new StringBuilder(), packageName).append(StringFog.decrypt("eXT3cCK8wKtjeQ==\n", "WVnXFVDOr9k=\n")).append(e.getLocalizedMessage()).toString());
            return null;
        }
    }
}
