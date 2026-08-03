package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public interface A1 {
    /* synthetic */ void a(android.content.Intent intent);

    /* synthetic */ void a(android.content.Intent intent, int i2);

    /* synthetic */ void a(android.content.Intent intent, int i2, int i3);

    /* synthetic */ void b(android.content.Intent intent);

    /* synthetic */ void c(android.content.Intent intent);

    /* synthetic */ void onConfigurationChanged(android.content.res.Configuration configuration);

    /* synthetic */ void onCreate();

    /* synthetic */ void onDestroy();

    void pauseUserSession(android.os.Bundle bundle);

    void reportData(int i2, android.os.Bundle bundle);

    void resumeUserSession(android.os.Bundle bundle);
}
