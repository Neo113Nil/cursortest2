package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0396bj extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final C0986yf f7062b;

    public C0396bj(C0459e5 c0459e5) {
        this(c0459e5, C0878ua.k().t());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(w5.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.f7062b.b(C0909vf.a(jSONObject));
        return false;
    }

    public C0396bj(C0459e5 c0459e5, C0986yf c0986yf) {
        super(c0459e5);
        this.f7062b = c0986yf;
    }
}
