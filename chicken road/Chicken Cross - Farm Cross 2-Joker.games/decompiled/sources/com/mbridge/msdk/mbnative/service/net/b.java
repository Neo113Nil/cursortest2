package com.mbridge.msdk.mbnative.service.net;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NativeResponseHandler.java */
/* loaded from: classes6.dex */
public abstract class b extends c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private int f9586a;
    private String b;

    /* compiled from: NativeResponseHandler.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JSONObject f9587a;
        final /* synthetic */ String b;
        final /* synthetic */ List c;
        final /* synthetic */ int d;

        /* compiled from: NativeResponseHandler.java */
        /* renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        class RunnableC1402a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f9588a;

            RunnableC1402a(CampaignUnit campaignUnit) {
                this.f9588a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f9588a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f9588a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.d, aVar.f9587a.optString("msg"));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.c, this.f9588a);
                    b.this.saveRequestTime(this.f9588a.getAds().size());
                }
            }
        }

        a(JSONObject jSONObject, String str, List list, int i) {
            this.f9587a = jSONObject;
            this.b = str;
            this.c = list;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject optJSONObject = this.f9587a.optJSONObject("data");
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC1402a("v5".equals(this.b) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(optJSONObject) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(optJSONObject)));
        }
    }

    public abstract void a(int i, String str);

    public void a(String str) {
        this.b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

    public String b() {
        return this.b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f9348a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.b) == null) {
            return;
        }
        int i = this.f9586a;
        if (i == 0) {
            b(aVar.b, eVar.c);
        } else if (i == 1) {
            a(aVar.b, eVar.c);
        }
    }

    private void b(List<g> list, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("status");
        if (1 != optInt) {
            a(optInt, jSONObject.optString("msg"));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject, jSONObject.optString("version"), list, optInt));
    }

    public void a(int i) {
        this.f9586a = i;
    }

    public int a() {
        return this.f9586a;
    }

    private void a(List<g> list, JSONObject jSONObject) {
        CampaignUnit parseCampaignUnit;
        int optInt = jSONObject.optInt("status");
        if (1 == optInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
            } else {
                parseCampaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"));
            }
            if (parseCampaignUnit != null && parseCampaignUnit.getListFrames() != null && parseCampaignUnit.getListFrames().size() > 0) {
                a(parseCampaignUnit.getListFrames());
                saveRequestTime(parseCampaignUnit.getListFrames().size());
                return;
            } else {
                a(optInt, jSONObject.optString("msg"));
                return;
            }
        }
        a(optInt, jSONObject.optString("msg"));
    }
}
