package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Ac implements K8 {

    /* renamed from: a, reason: collision with root package name */
    public final Vg f5693a;

    /* renamed from: b, reason: collision with root package name */
    public final C0392bf f5694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5695c = "activation_unlock_event_sending";

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f5696d;

    public Ac(Vg vg, C0898v4 c0898v4, C0392bf c0392bf) {
        this.f5693a = vg;
        this.f5694b = c0392bf;
        this.f5696d = new AtomicBoolean(c0392bf.a(false) || a(c0898v4));
    }

    public final void a(String str) {
        try {
            Vj vj = AbstractC0861tj.f8372a;
            String str2 = this.f5695c;
            JSONObject put = new JSONObject().put(AdRevenueConstants.SOURCE_KEY, str).put("framework", FrameworkDetector.framework());
            T9 i3 = C0878ua.f8414H.i();
            Bundle applicationMetaData = i3.f6655d.getApplicationMetaData(i3.f6652a);
            JSONObject put2 = put.put("appmetrica_plugin_id", applicationMetaData != null ? applicationMetaData.getString("io.appmetrica.analytics.plugin_id") : null);
            C0785qk c0785qk = C0878ua.f8414H.f8418D;
            String jSONObject = put2.put("activation_offset", TimeUnit.SECONDS.convert(c0785qk.f8170a.currentTimeMillis() - c0785qk.f8171b, TimeUnit.MILLISECONDS)).toString();
            vj.getClass();
            vj.a(new Tj(str2, jSONObject));
        } catch (Throwable unused) {
        }
    }

    @Override // io.appmetrica.analytics.impl.K8
    public final boolean b() {
        String str;
        if (!this.f5696d.get() && (str = ((C0756ph) this.f5693a.a()).f8079m) != null && !str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01") && this.f5696d.compareAndSet(false, true)) {
            this.f5694b.b(true);
            a("activation");
        }
        return this.f5696d.get();
    }

    public final void a() {
        if (this.f5696d.compareAndSet(false, true)) {
            this.f5694b.b(true);
            a("timer");
        }
    }

    public static boolean a(C0898v4 c0898v4) {
        String str = c0898v4.f8473a;
        return (str == null || str.equals("629a824d-c717-4ba5-bc0f-3f3968554d01")) ? false : true;
    }
}
