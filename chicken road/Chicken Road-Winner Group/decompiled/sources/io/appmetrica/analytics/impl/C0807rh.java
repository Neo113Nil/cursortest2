package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807rh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final C0986yf f8234b;

    /* renamed from: c, reason: collision with root package name */
    public final zo f8235c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f8236d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f8237e;

    public C0807rh(C0459e5 c0459e5) {
        this(c0459e5, c0459e5.u(), C0878ua.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0459e5 c0459e5 = this.f6796a;
        if (this.f8235c.d()) {
            return false;
        }
        W5 a3 = ((C0756ph) c0459e5.f7202k.a()).f8072e ? W5.a(w5, EnumC0569ib.EVENT_TYPE_APP_UPDATE) : W5.a(w5, EnumC0569ib.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f8236d.getInstallerPackageName(c0459e5.f7193a, c0459e5.f7194b.f6822a), ""));
            C0986yf c0986yf = this.f8234b;
            c0986yf.f6749h.a(c0986yf.f6743a);
            jSONObject.put("preloadInfo", ((C0909vf) c0986yf.c()).b());
        } catch (Throwable unused) {
        }
        a3.setValue(jSONObject.toString());
        C0799r9 c0799r9 = c0459e5.f7205n;
        c0799r9.a(a3, Wk.a(c0799r9.f8207c.b(a3), a3.f6782i));
        zo zoVar = this.f8235c;
        synchronized (zoVar) {
            Ao ao = zoVar.f8715a;
            ao.a(ao.a().put("init_event_done", true));
        }
        this.f8235c.a(this.f8237e.currentTimeMillis());
        return false;
    }

    public C0807rh(C0459e5 c0459e5, zo zoVar, C0986yf c0986yf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c0459e5);
        this.f8235c = zoVar;
        this.f8234b = c0986yf;
        this.f8236d = safePackageManager;
        this.f8237e = systemTimeProvider;
    }
}
