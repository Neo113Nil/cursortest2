package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Yg extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f6869b;

    public Yg(C0459e5 c0459e5, IReporter iReporter) {
        super(c0459e5);
        this.f6869b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Nc nc = (Nc) Nc.f6321c.get(w5.f6778d);
        HashMap hashMap = new HashMap();
        hashMap.put("type", nc.f6322a);
        hashMap.put("delivery_method", nc.f6323b);
        this.f6869b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
