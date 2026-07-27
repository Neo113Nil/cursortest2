package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes.dex */
public interface Oc {
    void a(Location location);

    void a(String str);

    void a(String str, String str2);

    void a(boolean z3);

    void a(boolean z3, boolean z4);

    void clearAppEnvironment();

    void putAppEnvironmentValue(String str, String str2);

    void setDataSendingEnabled(boolean z3);

    void setUserProfileID(String str);
}
