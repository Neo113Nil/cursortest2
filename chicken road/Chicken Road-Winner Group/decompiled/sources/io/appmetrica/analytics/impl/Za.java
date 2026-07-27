package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public interface Za extends InterfaceC0362ab {
    Pa a(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0635l0 c0635l0);

    @Override // io.appmetrica.analytics.impl.InterfaceC0362ab
    /* synthetic */ Za a();

    InterfaceC0388bb a(AppMetricaConfig appMetricaConfig);

    void a(ReporterConfig reporterConfig);

    Pa b(AppMetricaConfig appMetricaConfig, PublicLogger publicLogger, C0635l0 c0635l0);

    Ya b(ReporterConfig reporterConfig);
}
