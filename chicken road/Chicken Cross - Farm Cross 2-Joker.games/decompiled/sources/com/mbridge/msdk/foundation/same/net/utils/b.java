package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: HttpUtils.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9357a = "b";

    public static void a(e eVar, String str, String str2) {
        if (eVar != null) {
            try {
                if (!a1.a(str) && !a1.a(str2)) {
                    eVar.a(str, str2);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.startsWith(ProxyConfig.MATCH_HTTP)) {
                str = c1.a(str);
            }
            TextUtils.isEmpty(str);
        } catch (Throwable th) {
            q0.b(f9357a, th.getMessage());
        }
    }
}
