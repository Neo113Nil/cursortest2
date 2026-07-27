package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class O9 extends Wg {

    /* renamed from: b, reason: collision with root package name */
    public final P9 f7213b;

    public O9(C0608e5 c0608e5, TimeProvider timeProvider) {
        super(c0608e5);
        this.f7213b = new P9(c0608e5, timeProvider);
    }

    @Override // io.appmetrica.analytics.impl.Wg
    public final boolean a(W5 w5) {
        long optLong;
        P9 p9 = this.f7213b;
        I9 i9 = p9.f7273a.t().f8558B;
        Long valueOf = i9 != null ? Long.valueOf(i9.f6941a) : null;
        if (valueOf != null) {
            zo zoVar = p9.f7273a.f8104t;
            synchronized (zoVar) {
                optLong = zoVar.f9678a.a().optLong("external_attribution_window_start", -1L);
            }
            if (optLong < 0) {
                optLong = p9.f7274b.currentTimeMillis();
                p9.f7273a.f8104t.a(optLong);
            }
            if (p9.f7274b.currentTimeMillis() - optLong <= valueOf.longValue()) {
                H9 h9 = (H9) MessageNano.mergeFrom(new H9(), w5.getValueBytes());
                int i2 = h9.f6866a;
                String str = new String(h9.f6867b, B4.a.f287a);
                String str2 = this.f7213b.f7273a.f8087c.k().get(Integer.valueOf(i2));
                if (str2 != null) {
                    try {
                        if (JsonUtils.isEqualTo(new JSONObject(str), new JSONObject(str2))) {
                            this.f7670a.f8097m.info("Ignoring attribution of type `" + R9.a(i2) + "` with value `" + str + "` since it is not new", new Object[0]);
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
                P9 p92 = this.f7213b;
                Map<Integer, String> k3 = p92.f7273a.f8087c.k();
                k3.put(Integer.valueOf(i2), str);
                p92.f7273a.f8087c.b(k3);
                this.f7670a.f8097m.info("Handling attribution of type `" + R9.a(i2) + '`', new Object[0]);
                return false;
            }
        }
        this.f7670a.f8097m.info("Ignoring attribution since out of collecting interval", new Object[0]);
        return true;
    }
}
