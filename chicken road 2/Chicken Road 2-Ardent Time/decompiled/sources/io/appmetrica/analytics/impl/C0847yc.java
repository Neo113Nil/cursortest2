package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0847yc extends io.appmetrica.analytics.impl.I2 {
    public C0847yc(android.content.Context context, io.appmetrica.analytics.impl.Bf bf, io.appmetrica.analytics.ReporterConfig reporterConfig, io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.M9 m9) {
        this(context, c0801wi, new io.appmetrica.analytics.impl.Fh(bf, new io.appmetrica.analytics.internal.CounterConfiguration(reporterConfig), new io.appmetrica.analytics.impl.D8(new io.appmetrica.analytics.impl.C0674rl(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(reporterConfig.apiKey), "Crash Environment")), reporterConfig.userProfileID), m9, io.appmetrica.analytics.impl.C0244b4.l().n(), new io.appmetrica.analytics.impl.Rn(), new io.appmetrica.analytics.impl.Eg(), new io.appmetrica.analytics.impl.C0763v6(), new io.appmetrica.analytics.impl.C0292d0(), new io.appmetrica.analytics.impl.Je(m9));
    }

    @Override // io.appmetrica.analytics.impl.I2
    public final java.lang.String j() {
        return "[ManualReporter]";
    }

    public C0847yc(android.content.Context context, io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Fh fh, io.appmetrica.analytics.impl.M9 m9, io.appmetrica.analytics.impl.C0659r6 c0659r6, io.appmetrica.analytics.impl.Rn rn, io.appmetrica.analytics.impl.Eg eg, io.appmetrica.analytics.impl.C0763v6 c0763v6, io.appmetrica.analytics.impl.C0292d0 c0292d0, io.appmetrica.analytics.impl.Je je) {
        super(context, c0801wi, fh, m9, c0659r6, rn, eg, c0763v6, c0292d0, je);
        io.appmetrica.analytics.impl.C0244b4.l().getClass();
    }
}
