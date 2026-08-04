package com.google.android.gms.internal.ads;

import E2.o;
import io.sentry.ProfilingTraceData;
import io.sentry.SentryLockReason;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzboh {
    public final List zza;
    public final String zzb;
    public final String zzc;

    public zzboh(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            arrayList.add(jSONArray.getString(i7));
        }
        this.zza = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        o oVar = o.f1952C;
        zzboj zzbojVar = oVar.f1975v;
        zzboj.zza(jSONObject, "clickurl");
        zzboj zzbojVar2 = oVar.f1975v;
        zzboj.zza(jSONObject, "imp_urls");
        zzboj zzbojVar3 = oVar.f1975v;
        zzboj.zza(jSONObject, "downloaded_imp_urls");
        zzboj zzbojVar4 = oVar.f1975v;
        zzboj.zza(jSONObject, "fill_urls");
        zzboj zzbojVar5 = oVar.f1975v;
        zzboj.zza(jSONObject, "video_start_urls");
        zzboj zzbojVar6 = oVar.f1975v;
        zzboj.zza(jSONObject, "video_complete_urls");
        zzboj zzbojVar7 = oVar.f1975v;
        zzboj.zza(jSONObject, "video_reward_urls");
        jSONObject.optString(ProfilingTraceData.JsonKeys.TRANSACTION_ID);
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzboj zzbojVar8 = oVar.f1975v;
            zzboj.zza(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.zzb = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString(SentryLockReason.JsonKeys.CLASS_NAME);
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        zzboj zzbojVar9 = oVar.f1975v;
        zzboj.zza(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.zzc = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
