package io.sentry.android.replay;

import android.os.Build;
import android.util.Log;
import t6.i;

/* loaded from: classes2.dex */
public final class WindowSpy$decorViewClass$2 extends i implements s6.a {
    public static final WindowSpy$decorViewClass$2 INSTANCE = new WindowSpy$decorViewClass$2();

    public WindowSpy$decorViewClass$2() {
        super(0);
    }

    @Override // s6.a
    public final Class<?> invoke() {
        try {
            return Class.forName("com.android.internal.policy.DecorView");
        } catch (Throwable th) {
            Log.d("WindowSpy", "Unexpected exception loading DecorView on API " + Build.VERSION.SDK_INT, th);
            return null;
        }
    }
}
