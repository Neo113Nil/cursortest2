package com.unity3d.player;

import android.content.Context;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes7.dex */
class AndroidAppSetIdHelper {
    private static Class s_AppSetClass;
    private static Method s_GetClientMethod;
    private static Class s_OnFailureListenerClass;
    private static Class s_OnSuccessListenerClass;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeOnAndroidAppSetIdResult(String str);

    AndroidAppSetIdHelper() {
    }

    private static synchronized void ensureReflectionCache() {
        synchronized (AndroidAppSetIdHelper.class) {
            if (s_AppSetClass != null) {
                return;
            }
            Class<?> cls = Class.forName("com.google.android.gms.appset.AppSet");
            s_GetClientMethod = cls.getMethod("getClient", Context.class);
            s_OnSuccessListenerClass = OnSuccessListener.class;
            s_OnFailureListenerClass = OnFailureListener.class;
            s_AppSetClass = cls;
        }
    }

    public static void requestAppSetId(Context context) {
        try {
            ensureReflectionCache();
            Object invoke = s_GetClientMethod.invoke(s_AppSetClass, context);
            if (invoke == null) {
                nativeOnAndroidAppSetIdResult(null);
                return;
            }
            Object invoke2 = invoke.getClass().getMethod("getAppSetIdInfo", null).invoke(invoke, null);
            if (invoke2 == null) {
                nativeOnAndroidAppSetIdResult(null);
                return;
            }
            Object newProxyInstance = Proxy.newProxyInstance(AndroidAppSetIdHelper.class.getClassLoader(), new Class[]{s_OnSuccessListenerClass}, new C4871a());
            Object newProxyInstance2 = Proxy.newProxyInstance(AndroidAppSetIdHelper.class.getClassLoader(), new Class[]{s_OnFailureListenerClass}, new C4897b());
            Method method = invoke2.getClass().getMethod("addOnSuccessListener", s_OnSuccessListenerClass);
            Method method2 = invoke2.getClass().getMethod("addOnFailureListener", s_OnFailureListenerClass);
            method.invoke(invoke2, newProxyInstance);
            method2.invoke(invoke2, newProxyInstance2);
        } catch (Exception unused) {
            nativeOnAndroidAppSetIdResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object defaultProxyResult(Object obj, Method method, Object[] objArr) {
        if ("hashCode".equals(method.getName())) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
        if ("equals".equals(method.getName())) {
            boolean z = false;
            if (objArr != null && objArr.length > 0 && obj == objArr[0]) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (InAppPurchaseConstants.METHOD_TO_STRING.equals(method.getName())) {
            return "AndroidAppSetIdHelper$Proxy@" + Integer.toHexString(System.identityHashCode(obj));
        }
        return null;
    }
}
