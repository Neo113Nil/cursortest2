package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* loaded from: classes.dex */
public final class Ti {

    /* renamed from: a, reason: collision with root package name */
    public final Revenue f6671a;

    /* renamed from: b, reason: collision with root package name */
    public final Ym f6672b;

    /* renamed from: c, reason: collision with root package name */
    public final C0529gn f6673c;

    /* renamed from: d, reason: collision with root package name */
    public final C0529gn f6674d;

    /* renamed from: e, reason: collision with root package name */
    public final PublicLogger f6675e;

    public Ti(Revenue revenue, PublicLogger publicLogger) {
        this.f6675e = publicLogger;
        this.f6671a = revenue;
        this.f6672b = new Ym(30720, "revenue payload", publicLogger);
        this.f6673c = new C0529gn(new Ym(184320, "receipt data", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
        this.f6674d = new C0529gn(new C0374an(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, "receipt signature", publicLogger), "<truncated data was not sent, exceeded the limit of 180kb>");
    }
}
