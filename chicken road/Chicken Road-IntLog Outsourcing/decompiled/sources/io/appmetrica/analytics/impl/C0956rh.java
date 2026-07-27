package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956rh extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final C1135yf f9178b;

    /* renamed from: c, reason: collision with root package name */
    public final zo f9179c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f9180d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeProvider f9181e;

    public C0956rh(C0608e5 c0608e5) {
        this(c0608e5, c0608e5.u(), C1027ua.k().t(), new SafePackageManager(), new SystemTimeProvider());
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        C0608e5 c0608e5 = this.f7670a;
        if (this.f9179c.d()) {
            return false;
        }
        W5 a6 = ((C0905ph) c0608e5.f8095k.a()).f9008e ? W5.a(w5, EnumC0718ib.EVENT_TYPE_APP_UPDATE) : W5.a(w5, EnumC0718ib.EVENT_TYPE_INIT);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appInstaller", (String) WrapUtils.getOrDefault(this.f9180d.getInstallerPackageName(c0608e5.f8085a, c0608e5.f8086b.f7697a), ""));
            C1135yf c1135yf = this.f9178b;
            c1135yf.f7623h.a(c1135yf.f7616a);
            jSONObject.put("preloadInfo", ((C1058vf) c1135yf.c()).b());
        } catch (Throwable unused) {
        }
        a6.setValue(jSONObject.toString());
        C0948r9 c0948r9 = c0608e5.f8098n;
        c0948r9.a(a6, Wk.a(c0948r9.f9150c.b(a6), a6.f7656i));
        zo zoVar = this.f9179c;
        synchronized (zoVar) {
            Ao ao = zoVar.f9678a;
            ao.a(ao.a().put("init_event_done", true));
        }
        this.f9179c.a(this.f9181e.currentTimeMillis());
        return false;
    }

    public C0956rh(C0608e5 c0608e5, zo zoVar, C1135yf c1135yf, SafePackageManager safePackageManager, SystemTimeProvider systemTimeProvider) {
        super(c0608e5);
        this.f9179c = zoVar;
        this.f9178b = c1135yf;
        this.f9180d = safePackageManager;
        this.f9181e = systemTimeProvider;
    }
}
