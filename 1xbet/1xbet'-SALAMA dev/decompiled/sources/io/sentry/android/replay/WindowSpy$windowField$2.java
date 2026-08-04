package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowSpy$windowField$2 extends i implements s6.a {
    public static final WindowSpy$windowField$2 INSTANCE = new WindowSpy$windowField$2();

    public WindowSpy$windowField$2() {
        super(0);
    }

    @Override // s6.a
    public final Field invoke() {
        Class decorViewClass = WindowSpy.INSTANCE.getDecorViewClass();
        if (decorViewClass == null) {
            return null;
        }
        try {
            Field declaredField = decorViewClass.getDeclaredField("mWindow");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e7) {
            Log.d("WindowSpy", "Unexpected exception retrieving " + decorViewClass + "#mWindow on API " + Build.VERSION.SDK_INT, e7);
            return null;
        }
    }
}
