package io.appmetrica.analytics;

/* loaded from: classes.dex */
public interface IModuleReporter {
    void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue, boolean z2);

    void reportEvent(io.appmetrica.analytics.ModuleEvent moduleEvent);

    void sendEventsBuffer();

    void setSessionExtra(java.lang.String str, byte[] bArr);
}
