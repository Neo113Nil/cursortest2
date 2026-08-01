package com.mbridge.msdk.foundation.same.net;

import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.k0;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class Aa {
    private static final String C_END = "_mv_end";
    private static final String C_START = "mv_channel_";

    /* renamed from: a, reason: collision with root package name */
    private static String f9344a = "";

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.killProcess(Process.myPid());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String a() {
        return f9344a;
    }

    public static String b() {
        return null;
    }

    private static void b(String str) {
        String str2;
        Integer c;
        if (!TextUtils.isEmpty(str)) {
            try {
                str2 = k0.a(str);
            } catch (Throwable th) {
                th.printStackTrace();
                str2 = null;
            }
            if (!TextUtils.isEmpty(str2) && str2.startsWith(C_START) && str2.endsWith(C_END) && (c = c(str2)) != null) {
                f9344a = String.valueOf(c);
            } else {
                if (MBridgeConstans.DEBUG) {
                    g();
                    throw new RuntimeException("please don't update this value");
                }
                f9344a = "";
            }
        }
        if (com.mbridge.msdk.config.manager.a.c().d()) {
            HashMap hashMap = new HashMap();
            hashMap.put("channel", a());
            com.mbridge.msdk.config.manager.a.c().a(com.mbridge.msdk.config.component.common.util.c.a(), "c22", hashMap);
        }
    }

    private static Integer c(String str) {
        Throwable th;
        Integer num;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(C_START);
        int indexOf2 = str.indexOf(C_END);
        if (indexOf == -1 || indexOf2 == -1 || indexOf2 <= indexOf) {
            return null;
        }
        try {
            num = Integer.valueOf(str.substring(indexOf + 11, indexOf2));
            try {
                if (num.intValue() > 0) {
                    return num;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
                return num;
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
        }
    }

    private static void g() {
        new Handler().postDelayed(new a(), 500L);
    }
}
