package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;

/* compiled from: LoadUrlTool.java */
/* loaded from: classes6.dex */
public class d {
    public static String a(String str) {
        String b = b(str);
        return TextUtils.isEmpty(b) ? "" : c1.a(b);
    }

    public static String b(String str) {
        g d = i.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(str, TextUtils.isEmpty(str) ? d.v0() : d.D());
    }
}
