package io.sentry.android.replay;

import java.lang.reflect.Method;
import t6.i;

/* loaded from: classes2.dex */
public final class WindowManagerSpy$windowManagerInstance$2 extends i implements s6.a {
    public static final WindowManagerSpy$windowManagerInstance$2 INSTANCE = new WindowManagerSpy$windowManagerInstance$2();

    public WindowManagerSpy$windowManagerInstance$2() {
        super(0);
    }

    @Override // s6.a
    public final Object invoke() {
        Class windowManagerClass;
        Method method;
        windowManagerClass = WindowManagerSpy.INSTANCE.getWindowManagerClass();
        if (windowManagerClass == null || (method = windowManagerClass.getMethod("getInstance", null)) == null) {
            return null;
        }
        return method.invoke(null, null);
    }
}
