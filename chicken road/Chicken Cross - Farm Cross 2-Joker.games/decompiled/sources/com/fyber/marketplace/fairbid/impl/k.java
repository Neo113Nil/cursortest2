package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.g0;
import com.fyber.inneractive.sdk.flow.i0;
import com.fyber.inneractive.sdk.flow.r0;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class k implements i0, r0 {

    /* renamed from: a, reason: collision with root package name */
    public InneractiveUnitController f6032a;
    public x b;
    public boolean d = false;
    public final String c = UUID.randomUUID().toString();

    public k(InneractiveUnitController inneractiveUnitController, x xVar) {
        this.f6032a = inneractiveUnitController;
        this.b = xVar;
    }

    @Override // com.fyber.inneractive.sdk.flow.r0
    public final void a(g0 g0Var) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void addUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void destroy() {
        InneractiveUnitController inneractiveUnitController = this.f6032a;
        if (inneractiveUnitController != null) {
            inneractiveUnitController.destroy();
        }
        a();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final x getAdContent() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveAdRequest getCurrentProcessedRequest() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getLocalUniqueId() {
        return this.c;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveMediationName getMediationName() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationNameString() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getMediationVersion() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final String getRequestedSpotId() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final InneractiveUnitController getSelectedUnitController() {
        return this.f6032a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isReady() {
        boolean z;
        x xVar = this.b;
        if (xVar == null) {
            return false;
        }
        com.fyber.inneractive.sdk.response.e eVar = xVar.b;
        if (eVar != null) {
            if (eVar.f5908a < System.currentTimeMillis()) {
                z = true;
                if (z) {
                    x xVar2 = this.b;
                    com.fyber.inneractive.sdk.response.e eVar2 = xVar2.b;
                    if (!this.d && eVar2 != null && eVar2.c != 0) {
                        long currentTimeMillis = System.currentTimeMillis();
                        long j = eVar2.f5908a;
                        if (j < currentTimeMillis) {
                            long minutes = TimeUnit.MILLISECONDS.toMinutes(j - System.currentTimeMillis());
                            long j2 = eVar2.b;
                            IAlog.a("Firing Event 802 - AdExpired - time passed- " + minutes + ", sessionTimeOut - " + j2, new Object[0]);
                            t tVar = t.IA_AD_EXPIRED;
                            InneractiveAdRequest inneractiveAdRequest = xVar2.f5418a;
                            JSONArray b = xVar2.c.b();
                            w wVar = new w(eVar2);
                            wVar.b = tVar;
                            wVar.f5514a = inneractiveAdRequest;
                            wVar.d = b;
                            JSONObject jSONObject = new JSONObject();
                            Long valueOf = Long.valueOf(minutes);
                            try {
                                jSONObject.put("time_passed", valueOf);
                            } catch (Exception unused) {
                                IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", valueOf);
                            }
                            Long valueOf2 = Long.valueOf(j2);
                            try {
                                jSONObject.put("timeout", valueOf2);
                            } catch (Exception unused2) {
                                IAlog.f("Got exception adding param to json object: %s, %s", "timeout", valueOf2);
                            }
                            wVar.f.put(jSONObject);
                            wVar.a((String) null);
                            this.d = true;
                        }
                    }
                }
                return !z;
            }
        }
        z = false;
        if (z) {
        }
        return !z;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void loadAd(String str, String str2) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void removeUnitController(InneractiveUnitController inneractiveUnitController) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void requestAd(InneractiveAdRequest inneractiveAdRequest) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(InneractiveMediationName inneractiveMediationName) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationName(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setMediationVersion(String str) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot
    public final void setRequestListener(InneractiveAdSpot.RequestListener requestListener) {
    }

    @Override // com.fyber.inneractive.sdk.flow.i0
    public final void a() {
        x xVar = this.b;
        if (xVar != null) {
            xVar.destroy();
        }
        this.b = null;
        this.f6032a = null;
        InneractiveAdSpotManager.get().removeSpot(this);
    }
}
