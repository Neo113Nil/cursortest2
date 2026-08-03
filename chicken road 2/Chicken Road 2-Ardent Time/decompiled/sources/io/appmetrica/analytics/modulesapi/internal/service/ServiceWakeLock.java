package io.appmetrica.analytics.modulesapi.internal.service;

/* loaded from: classes.dex */
public interface ServiceWakeLock {
    boolean acquireWakeLock(java.lang.String str);

    void releaseWakeLock(java.lang.String str);
}
