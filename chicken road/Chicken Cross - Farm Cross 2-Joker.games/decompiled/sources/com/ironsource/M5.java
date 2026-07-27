package com.ironsource;

import android.content.Context;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class M5 implements Kc {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7789a = true;
    private String b = N5.j;

    public static final class a implements InterfaceC4351c7 {
        a() {
        }

        @Override // com.ironsource.InterfaceC4351c7
        public void a(boolean z) {
            if (z) {
                return;
            }
            IronLog.API.error("failed to send impression data");
        }
    }

    private final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Ta.o, "android");
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            jSONObject.put("deviceType", IronSourceUtils.b(applicationContext));
            P9 d = IronSourceUtils.d(applicationContext);
            if (d != null) {
                jSONObject.put("advId", d.c());
                jSONObject.put("advIdType", d.d());
            }
        }
        String h = com.ironsource.mediationsdk.p.g().h();
        if (h != null) {
            jSONObject.put(U3.j.g, h);
        }
        return jSONObject;
    }

    @Override // com.ironsource.Kc
    public void a() {
    }

    public final void a(String dataSource, JSONObject impressionData) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        if (!this.f7789a) {
            IronLog.INTERNAL.verbose("disabled from server");
            return;
        }
        try {
            JSONObject b = b();
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("externalMediationSource", dataSource);
            jSONObject.putOpt("externalMediationData", impressionData);
            jSONObject.putOpt("clientParams", b);
            IronLog.API.info("impressionData: " + jSONObject);
            C4333b7.a(this.b, jSONObject.toString(), new a());
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.API.error("exception " + e.getMessage() + " sending impression data");
        }
    }

    @Override // com.ironsource.Kc
    public void g(String str) {
    }

    @Override // com.ironsource.Kc
    public void a(List<IronSource.a> list, boolean z, K3 k3) {
        if (k3 != null) {
            A1 b = k3.b();
            K1 f = b != null ? b.f() : null;
            Intrinsics.checkNotNull(f);
            this.f7789a = f.m();
            this.b = k3.b().f().d();
        }
    }
}
