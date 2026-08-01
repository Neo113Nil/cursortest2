package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ς, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0482 {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Handler f929;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0839 f930;

    public C0482(Context context, String str, String str2) {
        this.f930 = new C0839(context, str, str2);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m5466() {
        Handler handler;
        synchronized (C0482.class) {
            if (f929 == null) {
                HandlerThread handlerThread = new HandlerThread(StringFog.decrypt("ptaaMrsUrHi+x4wWux+8\n", "7bPjZNp42R0=\n"));
                handlerThread.start();
                f929 = new Handler(handlerThread.getLooper());
            }
            handler = f929;
        }
        return handler;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m5467(String str) {
        C0839 c0839 = this.f930;
        c0839.getClass();
        try {
            C0834 c0834 = c0839.f2447;
            synchronized (c0834) {
                c0834.f2443.delete(C0834.f2442, StringFog.decrypt("VgwLiRU=\n", "PWlytCop0D4=\n"), new String[]{str});
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String m5468(String str) {
        C0839 c0839 = this.f930;
        c0839.getClass();
        try {
            String m5678 = c0839.f2447.m5678(str);
            if (m5678 == null || TextUtils.isEmpty(m5678)) {
                return m5678;
            }
            try {
                return c0839.f2448.m5684(m5678);
            } catch (C0879 unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5469(String str, String str2) {
        C0839 c0839 = this.f930;
        c0839.getClass();
        try {
            c0839.f2447.m5680(str, c0839.f2448.m5685(str2));
        } catch (Throwable unused) {
        }
    }
}
