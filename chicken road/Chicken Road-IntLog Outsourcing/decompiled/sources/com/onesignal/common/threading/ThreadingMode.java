package com.onesignal.common.threading;

import com.onesignal.debug.internal.logging.Logging;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ThreadingMode {
    public static final ThreadingMode INSTANCE = new ThreadingMode();
    private static volatile boolean useBackgroundThreading;

    private ThreadingMode() {
    }

    public final boolean getUseBackgroundThreading() {
        return useBackgroundThreading;
    }

    public final void setUseBackgroundThreading(boolean z) {
        useBackgroundThreading = z;
    }

    public final void updateUseBackgroundThreading(boolean z, String source) {
        i.e(source, "source");
        boolean z5 = useBackgroundThreading;
        useBackgroundThreading = z;
        if (z5 != z) {
            Logging.info$default("OneSignal: ThreadingMode changed to useBackgroundThreading=" + z + " (source=" + source + ')', null, 2, null);
            return;
        }
        Logging.debug$default("OneSignal: ThreadingMode unchanged (useBackgroundThreading=" + z + ", source=" + source + ')', null, 2, null);
    }
}
