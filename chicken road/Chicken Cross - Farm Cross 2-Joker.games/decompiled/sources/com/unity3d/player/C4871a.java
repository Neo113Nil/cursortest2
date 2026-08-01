package com.unity3d.player;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.player.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4871a implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        Object defaultProxyResult;
        if (!"onSuccess".equals(method.getName())) {
            defaultProxyResult = AndroidAppSetIdHelper.defaultProxyResult(obj, method, objArr);
            return defaultProxyResult;
        }
        if (objArr != null) {
            try {
                if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                    Object invoke = obj2.getClass().getMethod("getId", null).invoke(objArr[0], null);
                    String obj3 = invoke != null ? invoke.toString() : null;
                    if (!TextUtils.isEmpty(obj3)) {
                        AndroidAppSetIdHelper.nativeOnAndroidAppSetIdResult(obj3);
                        return null;
                    }
                }
            } catch (Exception e) {
                Log.w("Insights", "AndroidAppSetIdHelper: failed to extract app set ID: " + e);
            }
        }
        AndroidAppSetIdHelper.nativeOnAndroidAppSetIdResult(null);
        return null;
    }
}
