package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* loaded from: classes.dex */
public interface Ia {
    C0639l4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC0362ab interfaceC0362ab);

    Handler b();

    C0379b2 c();

    C0801rb d();

    ICommonExecutor getDefaultExecutor();
}
