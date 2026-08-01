package com.bytedance.sdk.component.utils;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import io.ktor.sse.ServerSentEventKt;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class fum {
    private static String pcc;

    public static boolean pcc(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return false;
        }
        return TextUtils.equals(context.getApplicationContext().getPackageName(), sf(context));
    }

    public static String sf(Context context) {
        if (!TextUtils.isEmpty(pcc)) {
            return pcc;
        }
        String pcc2 = pcc();
        pcc = pcc2;
        if (!TextUtils.isEmpty(pcc2)) {
            return pcc;
        }
        String sf = sf();
        pcc = sf;
        if (!TextUtils.isEmpty(sf)) {
            return pcc;
        }
        return pcc;
    }

    private static String pcc() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception unused) {
            return null;
        }
    }

    private static String sf() {
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

    public static String gm(Context context) {
        String sf = sf(context);
        return (TextUtils.isEmpty(sf) || !sf.contains(ServerSentEventKt.COLON)) ? sf : sf.replace(ServerSentEventKt.COLON, "_");
    }
}
