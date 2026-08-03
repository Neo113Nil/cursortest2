package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class An implements io.appmetrica.analytics.impl.Cn {
    @Override // io.appmetrica.analytics.impl.Cn
    public final java.lang.Thread a() {
        return android.os.Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final java.lang.StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.Cn
    public final java.util.Map c() {
        return java.lang.Thread.getAllStackTraces();
    }
}
