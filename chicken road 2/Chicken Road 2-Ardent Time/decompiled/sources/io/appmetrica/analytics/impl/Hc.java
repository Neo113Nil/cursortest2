package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public interface Hc {
    void a(android.location.Location location);

    void a(java.lang.String str);

    void a(java.lang.String str, java.lang.String str2);

    void a(boolean z2);

    void a(boolean z2, boolean z3);

    void clearAppEnvironment();

    void putAppEnvironmentValue(java.lang.String str, java.lang.String str2);

    void setDataSendingEnabled(boolean z2);

    void setUserProfileID(java.lang.String str);
}
