package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: BannerResponseHandler.java */
/* loaded from: classes6.dex */
public abstract class a extends c<JSONObject> {
    private static final String b = "a";

    /* renamed from: a, reason: collision with root package name */
    private String f9531a = "";

    /* compiled from: BannerResponseHandler.java */
    /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    class RunnableC1392a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f9532a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        /* compiled from: BannerResponseHandler.java */
        /* renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        class RunnableC1393a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f9533a;

            RunnableC1393a(CampaignUnit campaignUnit) {
                this.f9533a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f9533a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f9533a.getAds().size() > 0) {
                    a.this.a(this.f9533a);
                    if (!TextUtils.isEmpty(a.this.f9531a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f9533a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f9533a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC1392a.this.f9532a.optString("msg");
                }
                RunnableC1392a runnableC1392a = RunnableC1392a.this;
                a.this.a(runnableC1392a.c, msg);
            }
        }

        RunnableC1392a(JSONObject jSONObject, String str, int i) {
            this.f9532a = jSONObject;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject optJSONObject = this.f9532a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC1393a("v5".equals(this.b) ? b.parseV5CampaignUnit(optJSONObject, a.this.f9531a) : b.parseCampaignUnit(optJSONObject, a.this.f9531a)));
        }
    }

    public abstract void a(int i, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        q0.c(b, "onFailed errorCode = " + aVar.f9348a);
        a(aVar.f9348a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.b.b, eVar.c);
    }

    public void a(String str) {
        this.f9531a = str;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        q0.c(b, "parseLoad content = " + jSONObject);
        int optInt = jSONObject.optInt("status");
        if (1 == optInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC1392a(jSONObject, jSONObject.optString("version"), optInt));
            return;
        }
        a(optInt, jSONObject.optString("msg"));
    }
}
