package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O9 extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final P9 f6354b;

    public O9(C0459e5 c0459e5, TimeProvider timeProvider) {
        super(c0459e5);
        this.f6354b = new P9(c0459e5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        long optLong;
        P9 p9 = this.f6354b;
        I9 i9 = p9.f6416a.t().f7641B;
        Long valueOf = i9 != null ? Long.valueOf(i9.f6092a) : null;
        if (valueOf != null) {
            zo zoVar = p9.f6416a.f7211t;
            synchronized (zoVar) {
                optLong = zoVar.f8715a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = p9.f6417b.currentTimeMillis();
                p9.f6416a.f7211t.a(optLong);
            }
            if (p9.f6417b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                H9 h9 = (H9) MessageNano.mergeFrom(new H9(), w5.getValueBytes());
                int i3 = h9.f6020a;
                String str = new String(h9.f6021b, v2.a.f10417a);
                String str2 = this.f6354b.f6416a.f7195c.k().get(Integer.valueOf(i3));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f6796a.f7204m.info("Ignoring attribution of type `" + R9.a(i3) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                P9 p92 = this.f6354b;
                Map<Integer, String> k3 = p92.f6416a.f7195c.k();
                k3.put(Integer.valueOf(i3), str);
                p92.f6416a.f7195c.b(k3);
                this.f6796a.f7204m.info("Handling attribution of type `" + R9.a(i3) + '`', new Object[0]);
                return false;
            }
        }
        this.f6796a.f7204m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
