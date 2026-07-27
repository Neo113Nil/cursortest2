package io.appmetrica.analytics.impl;

import com.onesignal.inAppMessages.internal.display.impl.WebViewManager;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Yg extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final IReporter f7747b;

    public Yg(C0608e5 c0608e5, IReporter iReporter) {
        super(c0608e5);
        this.f7747b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        Nc nc = (Nc) Nc.f7178c.get(w5.f7651d);
        HashMap hashMap = new HashMap();
        hashMap.put(WebViewManager.EVENT_TYPE_KEY, nc.f7179a);
        hashMap.put("delivery_method", nc.f7180b);
        this.f7747b.reportEvent("crash_saved", hashMap);
        return false;
    }
}
