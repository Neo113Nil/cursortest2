package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import java.io.File;
import java.util.List;

/* compiled from: ResourceManager.java */
/* loaded from: classes6.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private String f10338a;

    /* compiled from: ResourceManager.java */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public static i f10339a = new i(null);
    }

    /* synthetic */ i(h hVar) {
        this();
    }

    public static i a() {
        return a.f10339a;
    }

    public void b() {
        this.f10338a = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES);
    }

    private i() {
        b();
    }

    public String a(String str) {
        String str2;
        try {
            String str3 = this.f10338a + "/" + SameMD5.getMD5(c1.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (!o0.e(str5)) {
                return null;
            }
            try {
                com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (f != null && !TextUtils.isEmpty(f.V())) {
                    com.mbridge.msdk.foundation.same.d.a(str, new File(str5));
                }
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            return "file://" + str5 + (TextUtils.isEmpty(str2) ? "" : "?" + str2);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
