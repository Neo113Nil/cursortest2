package com.ironsource.adqualitysdk.sdk.i;

import android.util.Log;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ӟ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public abstract class AbstractC0544 {
    static {
        StringFog.decrypt("CUOTYAR1tOwjVNxPM0u0/yxYiHc=\n", "QDH8DlcawZ4=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m5502(String str, String str2) {
        m5511(str, str, str2, null, null, false);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m5503(String str, String str2) {
        m5510(str, str, str2, null, false);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m5506() {
        boolean z;
        C0932 m5751 = C0932.m5751();
        synchronized (m5751) {
            z = m5751.f2617;
        }
        return z;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ISAdQualityLogLevel m5507() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        C0932 m5751 = C0932.m5751();
        synchronized (m5751) {
            iSAdQualityLogLevel = m5751.f2616;
        }
        return iSAdQualityLogLevel;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5504(String str, String str2) {
        m5511(str, str, str2, null, null, true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5513(String str, String str2, boolean z) {
        m5511(str, str, str2, null, null, z);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m5505(String str, String str2, String str3, boolean z) {
        if (m5506()) {
            Log.v(m5508(str), str3);
        } else if (z && m5507().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            Log.v(m5508(str2), str3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5511(String str, String str2, String str3, Throwable th, AbstractC0587 abstractC0587, boolean z) {
        if (m5506()) {
            String m5508 = m5508(str);
            if (abstractC0587 != null) {
                str3 = str3 + "\n" + abstractC0587;
            }
            Log.e(m5508, str3, th);
            return;
        }
        if (z && m5507().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
            String m55082 = m5508(str2);
            if (abstractC0587 != null) {
                str3 = str3 + "\n" + abstractC0587;
            }
            Log.e(m55082, str3, th);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5512(String str, String str2, String str3, boolean z) {
        if (m5506()) {
            Log.i(m5508(str), str3);
        } else if (z && m5507().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            Log.i(m5508(str2), str3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5509(String str, String str2) {
        m5510(str, str, str2, null, true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m5510(String str, String str2, String str3, Object obj, boolean z) {
        if (obj != null) {
            str3 = str3 + "\n" + obj.toString();
        }
        if (m5506()) {
            Log.d(m5508(str), str3);
        } else if (z && m5507().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
            Log.d(m5508(str2), str3);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m5508(String str) {
        return AbstractC0548.m5514("rC52kiHPbwyGOTm9FvFvH4k1bYVIgA==\n", "5VwZ/HKgGn4=\n", new StringBuilder(), str);
    }
}
