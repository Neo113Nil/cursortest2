package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class Bi {

    /* renamed from: a, reason: collision with root package name */
    public final M4 f5772a;

    /* renamed from: b, reason: collision with root package name */
    public final Un f5773b;

    /* renamed from: c, reason: collision with root package name */
    public final Di f5774c;

    /* renamed from: d, reason: collision with root package name */
    public final C0739p0 f5775d;

    /* renamed from: e, reason: collision with root package name */
    public Tl f5776e;
    public final C0449dk f;

    public Bi(C0739p0 c0739p0, Un un, M4 m4, C0449dk c0449dk) {
        this(c0739p0, un, m4, c0449dk, new Di(c0739p0, c0449dk));
    }

    public final void a(Ah ah) {
        Kh kh = ah.f5703e;
        Tl tl = this.f5776e;
        if (tl != null) {
            kh.f6383b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        this.f5774c.a(ah);
    }

    public final void b(String str) {
        Gf gf = this.f5772a.f6382a;
        synchronized (gf) {
            gf.f5992a.put("PROCESS_CFG_INSTALL_REFERRER_SOURCE", str);
        }
    }

    public Bi(C0739p0 c0739p0, Un un, M4 m4, C0449dk c0449dk, Di di) {
        this.f5775d = c0739p0;
        this.f5772a = m4;
        this.f5773b = un;
        this.f = c0449dk;
        this.f5774c = di;
    }

    public final void a(Sl sl) {
        this.f5776e = sl;
        this.f5772a.f6383b.setUuid(sl.g());
    }

    public final void a(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        if (AbstractC0711no.a(bool)) {
            this.f5772a.f6383b.setLocationTracking(bool.booleanValue());
        }
        if (AbstractC0711no.a(bool2)) {
            this.f5772a.f6383b.setDataSendingEnabled(bool2.booleanValue());
        }
        if (AbstractC0711no.a(bool3)) {
            this.f5772a.f6383b.setAdvIdentifiersTracking(bool3.booleanValue(), bool4.booleanValue());
        }
        W5 a3 = W5.a();
        M4 m4 = this.f5772a;
        a(a(a3, m4), m4, 1, (Map) null);
    }

    public final void a(W5 w5, Kh kh, int i3, Map map) {
        String str;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        this.f5775d.b();
        if (!AbstractC0711no.a(map)) {
            w5.setValue(AbstractC0698nb.b(map));
            a(w5, kh);
        }
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str = kh.f;
        }
        a(new Ah(w5, false, i3, null, new Kh(gf, counterConfiguration, i8, str)));
    }

    public static W5 a(W5 w5, Kh kh) {
        if (D9.f5834a.contains(Integer.valueOf(w5.f6778d))) {
            w5.f6777c = kh.d();
        }
        return w5;
    }

    public final void a(List list) {
        Gf gf = this.f5772a.f6382a;
        synchronized (gf) {
            gf.f5992a.put("PROCESS_CFG_CUSTOM_HOSTS", AbstractC0711no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
        }
    }

    public final void a(HashMap hashMap) {
        Gf gf = this.f5772a.f6382a;
        synchronized (gf) {
            gf.f5992a.put("PROCESS_CFG_CLIDS", AbstractC0698nb.b(hashMap));
        }
    }

    public final void a(String str) {
        Gf gf = this.f5772a.f6382a;
        synchronized (gf) {
            gf.f5992a.put("PROCESS_CFG_DISTRIBUTION_REFERRER", str);
        }
    }

    public final Ah a(Sn sn, Kh kh) {
        String str;
        String str2;
        this.f5775d.b();
        Un un = this.f5773b;
        un.getClass();
        In in = sn.f6621a;
        if (in == null) {
            str = "";
        } else {
            str = (String) WrapUtils.getOrDefault(in.f6126a, "");
        }
        byte[] fromModel = un.f6731a.fromModel(sn);
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.f6383b.getApiKey());
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(fromModel, str, 5891, orCreatePublicLogger);
        u3.f6777c = kh.d();
        HashMap hashMap = u3.f6705q;
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str2 = kh.f;
        }
        return new Ah(u3, true, 1, hashMap, new Kh(gf, counterConfiguration, i8, str2));
    }
}
