package com.bytedance.pcc.pcc.sf;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import io.ktor.sse.ServerSentEventKt;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class gm {
    private static String pcc;

    public static String pcc() {
        String sf = sf();
        return (TextUtils.isEmpty(sf) || !sf.contains(ServerSentEventKt.COLON)) ? sf : sf.replace(ServerSentEventKt.COLON, "_");
    }

    public static String sf() {
        if (!TextUtils.isEmpty(pcc)) {
            return pcc;
        }
        String gm = gm();
        pcc = gm;
        if (!TextUtils.isEmpty(gm)) {
            return pcc;
        }
        String oo = oo();
        pcc = oo;
        if (!TextUtils.isEmpty(oo)) {
            return pcc;
        }
        return pcc;
    }

    private static String gm() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String oo() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
