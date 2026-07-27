package com.unity3d.player;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.unity3d.player.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4897b implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object defaultProxyResult;
        if (!"onFailure".equals(method.getName())) {
            defaultProxyResult = AndroidAppSetIdHelper.defaultProxyResult(obj, method, objArr);
            return defaultProxyResult;
        }
        AndroidAppSetIdHelper.nativeOnAndroidAppSetIdResult(null);
        return null;
    }
}
