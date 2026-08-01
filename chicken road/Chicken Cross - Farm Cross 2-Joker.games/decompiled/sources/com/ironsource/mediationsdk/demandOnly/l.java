package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.C4345c1;
import com.ironsource.C4382e2;
import com.ironsource.C4385e5;
import com.ironsource.C4411fd;
import com.ironsource.C4412fe;
import com.ironsource.C4436h2;
import com.ironsource.C4474j5;
import com.ironsource.C4491k4;
import com.ironsource.C4561o2;
import com.ironsource.C4689v5;
import com.ironsource.EnumC4707w5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4346c2;
import com.ironsource.J8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.d;
import com.ironsource.mediationsdk.demandOnly.a;
import com.ironsource.mediationsdk.demandOnly.j;
import com.ironsource.mediationsdk.demandOnly.m;
import com.ironsource.mediationsdk.demandOnly.n;
import com.ironsource.mediationsdk.demandOnly.p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class l extends m implements n.b, RewardedVideoSmashListener, InterfaceC4346c2 {
    private C4385e5 n;
    private C4385e5 o;
    private ISDemandOnlyRewardedVideoListener p;
    private C4382e2 q;
    private com.ironsource.mediationsdk.e r;
    private p s;
    private final J8 t;
    private final J8.a u;

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("load timed out state=" + l.this.k());
            l.this.a(new IronSourceError(1055, "load timed out"));
        }
    }

    l(String str, String str2, NetworkSettings networkSettings, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener, long j, AbstractAdapter abstractAdapter, com.ironsource.mediationsdk.e eVar) {
        super(new C4345c1(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.a.REWARDED_VIDEO), abstractAdapter);
        this.s = new p.b();
        this.t = Ib.a0().s();
        this.u = Ib.R().i();
        this.p = iSDemandOnlyRewardedVideoListener;
        this.f = j;
        this.r = eVar;
        this.f8401a.initRewardedVideoForDemandOnly(str, str2, this.c, this);
    }

    private void c(o oVar) {
        this.n = new C4385e5();
        a(s());
        if (!n()) {
            a(new IronSourceError(j.a.k, "loadRewardedVideoWithAdm: must be called by bidder instance"));
            return;
        }
        try {
            d.a aVar = (d.a) oVar.a(new C4474j5());
            C4561o2 a2 = new a.C1332a(aVar.h()).a(h());
            if (a2 == null) {
                IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm invalid enriched adm");
                a(EnumC4707w5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
                a(buildLoadFailedError);
                return;
            }
            String k = a2.k();
            if (k == null) {
                IronLog.INTERNAL.error("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
                return;
            }
            b(k);
            a(aVar.a());
            a(aVar.f());
            a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
            this.q.a(a2.b());
            this.o = new C4385e5();
            this.f8401a.loadRewardedVideoForBidding(this.c, null, k, this);
        } catch (Exception e) {
            C4491k4.d().a(e);
            a(ErrorBuilder.buildLoadFailedError("loadRewardedVideoWithAdm: Exception= " + e.getMessage()));
        }
    }

    private IronSourceError q() {
        return a(m.a.SHOW_IN_PROGRESS) ? new IronSourceError(1067, "showRewardedVideo error: can't show ad while an ad is already showing") : a(m.a.LOAD_IN_PROGRESS) ? new IronSourceError(1068, "showRewardedVideo error: can't show ad while an ad is loading") : new IronSourceError(1069, "showRewardedVideo error: no available ads to show");
    }

    private com.ironsource.mediationsdk.h r() {
        String str = i() + h();
        com.ironsource.mediationsdk.h hVar = new com.ironsource.mediationsdk.h(this.m);
        hVar.b(IronSourceUtils.g());
        hVar.a(true);
        hVar.c(true);
        hVar.e(str);
        hVar.c(l());
        hVar.a(this.t.a(this.m));
        C4436h2 c4436h2 = new C4436h2(h(), false);
        c4436h2.a(this.s.value());
        Map<String, Object> rewardedVideoBiddingData = this.f8401a.getRewardedVideoBiddingData(this.c, new JSONObject());
        if (rewardedVideoBiddingData != null) {
            c4436h2.b(rewardedVideoBiddingData);
        }
        hVar.a(c4436h2);
        return hVar;
    }

    private TimerTask s() {
        return new a();
    }

    private void t() {
        this.o = new C4385e5();
        this.f8401a.loadRewardedVideo(this.c, null, this);
    }

    private void u() {
        if (!this.r.a()) {
            IronLog.INTERNAL.verbose("can't load the rewarded video the auction isn't enabled");
            a(new IronSourceError(1063, "Missing server configuration"));
            return;
        }
        a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST, (Object[][]) null);
        com.ironsource.mediationsdk.h r = r();
        IronLog.INTERNAL.verbose("auction waterfallString = " + r.s());
        a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_AUCTION_REQUEST_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, r.s()}});
        this.r.a(ContextProvider.getInstance().getApplicationContext(), r, this);
    }

    private void v() {
        this.g = null;
        this.h = null;
        this.j = null;
        this.q = new C4382e2();
    }

    private void w() {
        this.n = new C4385e5();
        a(s());
        if (n()) {
            IronSourceError buildLoadFailedError = ErrorBuilder.buildLoadFailedError("loadRewardedVideo must be called by non bidder instances");
            a(EnumC4707w5.RV_INSTANCE_LOAD_FAILED, (Object[][]) null);
            a(buildLoadFailedError);
        } else if (o()) {
            u();
        } else {
            t();
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public boolean a() {
        boolean z = false;
        if (!a(m.a.LOADED)) {
            a(EnumC4707w5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
            return false;
        }
        try {
            z = this.f8401a.isRewardedVideoAvailable(this.c);
            a(z ? EnumC4707w5.RV_INSTANCE_READY_TRUE : EnumC4707w5.RV_INSTANCE_READY_FALSE, (Object[][]) null);
        } catch (Exception e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error("exception=" + e.getMessage());
        }
        return z;
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void b(o oVar) {
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            a(new IronSourceError(1053, a2 == aVar3 ? "load already in progress" : "cannot load because show is in progress"));
            return;
        }
        v();
        a(EnumC4707w5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        c(oVar);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void d() {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", state=" + k());
        a(EnumC4707w5.RV_INSTANCE_SHOW, (Object[][]) null);
        if (a(m.a.LOADED, m.a.SHOW_IN_PROGRESS)) {
            this.f8401a.showRewardedVideo(this.c, this);
        } else {
            onRewardedVideoAdShowFailed(q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC4707w5.RV_BUSINESS_INSTANCE_CLICKED, new Object[0][]);
        this.p.onRewardedVideoAdClicked(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        b(m.a.NOT_LOADED);
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC4707w5.RV_INSTANCE_CLOSED, new Object[][]{new Object[]{"sessionDepth", Integer.valueOf(this.t.a(this.m))}});
        this.u.b(this.m);
        this.p.onRewardedVideoAdClosed(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC4707w5.RV_BUSINESS_INSTANCE_OPENED, new Object[0][]);
        a(this.q.a(), IronSourceUtils.a());
        this.p.onRewardedVideoAdOpened(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        Map<String, Object> j = j();
        if (!TextUtils.isEmpty(com.ironsource.mediationsdk.p.g().f())) {
            j.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, com.ironsource.mediationsdk.p.g().f());
        }
        if (com.ironsource.mediationsdk.p.g().l() != null) {
            for (String str : com.ironsource.mediationsdk.p.g().l().keySet()) {
                j.put("custom_" + str, com.ironsource.mediationsdk.p.g().l().get(str));
            }
        }
        C4411fd a2 = com.ironsource.mediationsdk.p.g().d().c().f().a();
        if (a2 != null) {
            j.put("placement", a2.c());
            j.put(IronSourceConstants.EVENTS_REWARD_NAME, a2.f());
            j.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(a2.e()));
        } else {
            IronLog.INTERNAL.error("defaultPlacement is null");
        }
        C4689v5 c4689v5 = new C4689v5(EnumC4707w5.RV_BUSINESS_INSTANCE_REWARDED, new JSONObject(j));
        c4689v5.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.a(c4689v5.d(), h()));
        C4412fe.i().a(c4689v5);
        this.p.onRewardedVideoAdRewarded(l());
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.toString() + " instance name= " + h() + " state=" + k());
        b(m.a.NOT_LOADED);
        a(EnumC4707w5.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        this.p.onRewardedVideoAdShowFailed(l(), ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h());
        a(EnumC4707w5.RV_INSTANCE_VISIBLE, new Object[0][]);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose("error=" + ironSourceError.getErrorMessage() + "instance name= " + h() + " state=" + k());
        a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4385e5.a(this.o))}});
        a(ironSourceError);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose("instance name= " + h() + " state=" + k());
        p();
        a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4385e5.a(this.o))}});
        if (a(m.a.LOAD_IN_PROGRESS, m.a.LOADED)) {
            a(EnumC4707w5.RV_BUSINESS_INSTANCE_LOAD_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(C4385e5.a(this.n))}});
            a(this.q.c(), IronSourceUtils.a());
            this.p.onRewardedVideoAdLoadSuccess(l());
        }
    }

    void a(IronSourceError ironSourceError) {
        IronLog.INTERNAL.verbose("instanceName = " + h() + ", error = " + ironSourceError.getErrorMessage());
        p();
        if (a(m.a.LOAD_IN_PROGRESS, m.a.NOT_LOADED)) {
            a(ironSourceError, C4385e5.a(this.n));
            a(this.q.b(), IronSourceUtils.a());
            this.p.onRewardedVideoAdLoadFailed(l(), ironSourceError);
        }
    }

    private void a(EnumC4707w5 enumC4707w5, Object[][] objArr) {
        Map<String, Object> j = j();
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    j.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                C4491k4.d().a(e);
                IronLog.INTERNAL.error("Exception: " + Log.getStackTraceString(e));
            }
        }
        C4412fe.i().a(new C4689v5(enumC4707w5, new JSONObject(j)));
    }

    private void a(IronSourceError ironSourceError, long j) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(EnumC4707w5.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}});
        } else {
            a(EnumC4707w5.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.n.b
    public void c() {
        String str;
        IronLog.INTERNAL.verbose("state=" + k());
        m.a aVar = m.a.NOT_LOADED;
        m.a aVar2 = m.a.LOADED;
        m.a aVar3 = m.a.LOAD_IN_PROGRESS;
        m.a a2 = a(new m.a[]{aVar, aVar2}, aVar3);
        if (a2 != aVar && a2 != aVar2) {
            if (a2 == aVar3) {
                str = "load already in progress";
            } else {
                str = "cannot load because show is in progress";
            }
            this.p.onRewardedVideoAdLoadFailed(l(), new IronSourceError(1053, str));
            return;
        }
        v();
        a(EnumC4707w5.RV_BUSINESS_INSTANCE_LOAD, (Object[][]) null);
        w();
    }

    private void a(List<String> list, String str) {
        a(list, h(), i(), this.j, str);
    }

    @Override // com.ironsource.InterfaceC4346c2
    public void a(d.a aVar, int i, long j, int i2, String str) {
        String str2;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        this.g = aVar.a();
        this.h = aVar.f();
        this.s = aVar.a(l());
        a.C1332a c1332a = new a.C1332a(aVar.h());
        if (c1332a.isEmpty()) {
            str2 = "";
        } else {
            C4561o2 c4561o2 = c1332a.get(0);
            this.q.a(c4561o2.b());
            this.q.c(c4561o2.h());
            this.q.b(c4561o2.g());
            str2 = c4561o2.k();
            b(str2);
        }
        if (!TextUtils.isEmpty(str)) {
            a(EnumC4707w5.TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str}});
        }
        a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_AUCTION_SUCCESS, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}});
        a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_AUCTION_RESPONSE_WATERFALL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, c1332a.b()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (c1332a.isEmpty()) {
                IronSourceError ironSourceError = new IronSourceError(1058, "There is no available ad to load");
                ironLog.error("rewardedVideo - empty waterfall");
                a(ironSourceError);
                return;
            }
            c(str2);
        }
    }

    private void c(String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (a(m.a.LOAD_IN_PROGRESS)) {
            if (str == null) {
                ironLog.verbose("serverData is null");
                a(new IronSourceError(1062, "No available ad to load"));
            } else {
                a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_LOAD_WITH_ADM, (Object[][]) null);
                this.f8401a.loadRewardedVideoForBidding(this.c, null, str, this);
            }
        }
    }

    @Override // com.ironsource.S1
    public void a(List<C4561o2> list, String str, C4561o2 c4561o2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.error("Deprecated: Please use onAuctionSuccess(AuctionDataUtils.AuctionData auctionData, int auctionTrial, long elapsedTime, int troubleshootingErrorCode, String troubleshootingErrorMessage)");
    }

    @Override // com.ironsource.S1
    public void a(int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose("Auction failed. error " + i + " - " + str);
        this.g = null;
        this.h = null;
        a(EnumC4707w5.TROUBLESHOOT_RV_INSTANCE_AUCTION_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(j)}, new Object[]{IronSourceConstants.EVENTS_EXT1, k()}});
        if (a(m.a.LOAD_IN_PROGRESS)) {
            a(new IronSourceError(j.a.j, "No available ad to load"));
        }
    }
}
