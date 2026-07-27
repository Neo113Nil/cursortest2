package com.tiktok.appevents.edp.proxy;

import android.view.View;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class TouchProxyHelper {
    public static void proxy(WeakReference<View> v, ITouchListener clickListener) {
        if (clickListener == null) {
            return;
        }
        try {
            View view = v.get();
            if (view == null) {
                return;
            }
            Method declaredMethod = View.class.getDeclaredMethod("getListenerInfo", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(view, new Object[0]);
            Field declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
            declaredField.setAccessible(true);
            View.OnTouchListener onTouchListener = (View.OnTouchListener) declaredField.get(invoke);
            if (onTouchListener instanceof ProxyOnTouchListener) {
                return;
            }
            declaredField.set(invoke, new ProxyOnTouchListener(clickListener, onTouchListener));
        } catch (Throwable unused) {
        }
    }
}
