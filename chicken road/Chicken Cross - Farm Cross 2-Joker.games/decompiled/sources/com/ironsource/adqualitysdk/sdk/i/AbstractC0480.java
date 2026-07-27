package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ν, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0480 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static WeakReference f926;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5464(String str, String str2, Throwable th, boolean z) {
        try {
            m5465(str, str2, th, z, false, false);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5465(String str, String str2, Throwable th, boolean z, boolean z2, boolean z3) {
        try {
            if (z) {
                AbstractC0544.m5513(str, str2, z3);
                if (th != null) {
                    AbstractC0544.m5511(str, str, StringFog.decrypt("X4UpCUOtaEU=\n", "G+BdaCrBG38=\n"), th, null, z3);
                }
            } else {
                AbstractC0544.m5511(str, str, str2, th, null, z3);
            }
            m5463(str, str2, StringFog.decrypt("4qw/IOKeIEvd5A==\n", "tt5eQ4f8QSg=\n") + str, th, null, null, false, z2, z3);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5463(String str, String str2, String str3, Throwable th, AbstractC0587 abstractC0587, JSONObject jSONObject, boolean z, boolean z2, boolean z3) {
        String str4;
        String stackTraceString;
        if (z) {
            try {
                String str5 = str3 + StringFog.decrypt("UA==\n", "aq5SYdZ4Hj4=\n") + str;
                AbstractC0544.m5511(str, str, str2 + StringFog.decrypt("j7qBl5JLWw==\n", "r5Li+PYue9o=\n") + str5 + StringFog.decrypt("qA==\n", "gZ2D//XXMxw=\n"), th, abstractC0587, z3);
                str4 = str5;
            } catch (Throwable unused) {
                return;
            }
        } else {
            str4 = str3;
        }
        C0422 c0422 = (C0422) f926.get();
        if (c0422 != null) {
            if (abstractC0587 != null) {
                stackTraceString = abstractC0587.toString();
            } else if (th instanceof AbstractC0587) {
                stackTraceString = th.toString();
            } else {
                stackTraceString = Log.getStackTraceString(th);
            }
            c0422.m5430(str, str2, str4, stackTraceString, jSONObject, z2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5462(String str, String str2, String str3, String str4) {
        try {
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            String str5 = str3 + StringFog.decrypt("bw==\n", "VctkSxP3+Bw=\n") + str;
            AbstractC0544.m5513(str, StringFog.decrypt("HwuJV04G2AcuEds=\n", "Wnn7ODwmr24=\n") + str5 + StringFog.decrypt("BuhDBxuLTBZS6EIdUA==\n", "JoEtc37sPnc=\n"), false);
            AbstractC0544.m5513(str, str2 + (str4 != null ? "\n".concat(str4) : ""), false);
            C0422 c0422 = (C0422) f926.get();
            if (c0422 != null) {
                c0422.m5430(str, str2, str5, str4, null, false);
            }
        } catch (Throwable unused) {
        }
    }
}
