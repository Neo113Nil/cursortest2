package com.startapp.sdk.internal;

import android.content.Context;
import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class vc {
    public static void a(Context context, WebView webView, wc wcVar) {
        if (wcVar == null) {
            wcVar = new wc(context);
        }
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.CALENDAR", Boolean.valueOf(wcVar.f4608b.contains("calendar") && p0.a(wcVar.f4607a, "android.permission.WRITE_CALENDAR")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.INLINEVIDEO", Boolean.valueOf(wcVar.f4608b.contains("inlineVideo")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.SMS", Boolean.valueOf(wcVar.f4608b.contains("sms") && p0.a(wcVar.f4607a, "android.permission.SEND_SMS")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.STOREPICTURE", Boolean.valueOf(wcVar.f4608b.contains("storePicture")));
        si.a(webView, false, "mraid.setSupports", "mraid.SUPPORTED_FEATURES.TEL", Boolean.valueOf(wcVar.f4608b.contains("tel") && p0.a(wcVar.f4607a, "android.permission.CALL_PHONE")));
    }
}
