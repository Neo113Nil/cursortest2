package io.sentry.android.replay;

import java.lang.reflect.Field;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowManagerSpy$mViewsField$2 extends i implements s6.a {
    public static final WindowManagerSpy$mViewsField$2 INSTANCE = new WindowManagerSpy$mViewsField$2();

    public WindowManagerSpy$mViewsField$2() {
        super(0);
    }

    @Override // s6.a
    public final Field invoke() throws NoSuchFieldException {
        Class windowManagerClass = WindowManagerSpy.INSTANCE.getWindowManagerClass();
        if (windowManagerClass == null) {
            return null;
        }
        Field declaredField = windowManagerClass.getDeclaredField("mViews");
        declaredField.setAccessible(true);
        return declaredField;
    }
}
