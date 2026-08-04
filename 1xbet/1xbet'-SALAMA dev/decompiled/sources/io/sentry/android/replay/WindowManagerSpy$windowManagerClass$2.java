package io.sentry.android.replay;

import android.util.Log;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class WindowManagerSpy$windowManagerClass$2 extends i implements s6.a {
    public static final WindowManagerSpy$windowManagerClass$2 INSTANCE = new WindowManagerSpy$windowManagerClass$2();

    public WindowManagerSpy$windowManagerClass$2() {
        super(0);
    }

    @Override // s6.a
    public final Class<?> invoke() {
        try {
            return Class.forName("android.view.WindowManagerGlobal");
        } catch (Throwable th) {
            Log.w("WindowManagerSpy", th);
            return null;
        }
    }
}
