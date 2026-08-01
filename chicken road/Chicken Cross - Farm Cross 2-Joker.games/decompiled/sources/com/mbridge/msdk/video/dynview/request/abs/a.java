package com.mbridge.msdk.video.dynview.request.abs;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AbsMoreOfferResponseHandler.java */
/* loaded from: classes6.dex */
public abstract class a extends c<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private int f10114a;
    private String b;

    private void a(List<g> list, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("status");
        if (1 != optInt) {
            a(optInt, jSONObject.optString("msg"));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        String optString = jSONObject.optString("version");
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        CampaignUnit parseV5CampaignUnit = "v5".equals(optString) ? b.parseV5CampaignUnit(optJSONObject, this.b) : b.parseCampaignUnit(optJSONObject, this.b);
        if (parseV5CampaignUnit != null && parseV5CampaignUnit.getAds() != null && parseV5CampaignUnit.getAds().size() > 0) {
            a(list, parseV5CampaignUnit);
            saveRequestTime(parseV5CampaignUnit.getAds().size());
        } else {
            String msg = parseV5CampaignUnit != null ? parseV5CampaignUnit.getMsg() : null;
            if (TextUtils.isEmpty(msg)) {
                msg = jSONObject.optString("msg");
            }
            a(optInt, msg);
        }
    }

    public abstract void a(int i, String str);

    public abstract void a(List<g> list, CampaignUnit campaignUnit);

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
        if (eVar == null || (aVar = eVar.b) == null || this.f10114a != 0) {
            return;
        }
        a(aVar.b, eVar.c);
    }
}
