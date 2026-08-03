package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class F4 extends io.appmetrica.analytics.impl.Fh {
    public F4(io.appmetrica.analytics.impl.Bf bf) {
        super(bf, new io.appmetrica.analytics.internal.CounterConfiguration(), new io.appmetrica.analytics.impl.D8(new io.appmetrica.analytics.impl.C0674rl(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getMainPublicOrAnonymousLogger(), "Crash Environment")));
        b().setReporterType(io.appmetrica.analytics.internal.CounterConfigurationReporterType.COMMUTATION);
    }

    @Override // io.appmetrica.analytics.impl.Fh
    public final boolean f() {
        return true;
    }
}
