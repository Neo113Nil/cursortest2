package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.u5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873u5 {

    /* renamed from: a, reason: collision with root package name */
    public final PublicLogger f8387a;

    public C0873u5(String str) {
        this.f8387a = LoggerStorage.getOrCreatePublicLogger(str);
    }

    public final int a(int i3) {
        if (i3 < 100) {
            this.f8387a.warning(B0.c.i(i3, "Value passed as maxReportsInDatabaseCount is invalid. Should be greater than or equal to 100, but was: ", ". Default value (100) will be used"), new Object[0]);
            return 100;
        }
        if (i3 <= 10000) {
            return i3;
        }
        this.f8387a.warning(B0.c.i(i3, "Value passed as maxReportsInDatabaseCount is invalid. Should be less than or equal to 10000, but was: ", ". Default value (10000) will be used"), new Object[0]);
        return AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND;
    }
}
