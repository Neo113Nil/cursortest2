package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0555n5 {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f6458a;

    public C0555n5(java.lang.String str) {
        this.f6458a = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i2) {
        if (i2 < 100) {
            this.f6458a.warning(B1.a.g(i2, "Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", ". Default value (100) will be used"), new java.lang.Object[0]);
            return 100;
        }
        if (i2 <= 10000) {
            return i2;
        }
        this.f6458a.warning(B1.a.g(i2, "Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", ". Default value (10000) will be used"), new java.lang.Object[0]);
        return io.appmetrica.analytics.AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
