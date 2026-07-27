package sg.bigo.ads.T0;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.provider.FontsContractCompat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class n extends sg.bigo.ads.U.e {
    public HashMap e;
    public String f;

    public n(Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.U.e
    public final String a() {
        return "bigoad_slots.dat";
    }

    @Override // sg.bigo.ads.U.e
    public final String b() {
        return "SlotData";
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = this.e;
        if (hashMap != null) {
            for (p pVar : hashMap.values()) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(pVar);
            }
        }
        return "SlotData[" + sb.toString() + AbstractJsonLexerKt.END_LIST;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(JSONArray jSONArray, String str) {
        int i;
        int i2;
        int i3;
        int i4;
        HashMap hashMap = new HashMap();
        int i5 = 0;
        int i6 = 0;
        while (i6 < jSONArray.length()) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i6);
            p pVar = new p();
            if (optJSONObject == null) {
                AbstractC5496a.a("Slot", "parseData error, jsonObject is null.");
                i = i6;
                i2 = i5;
            } else {
                pVar.c = optJSONObject.optInt("countdown", 5);
                pVar.b = optJSONObject.optInt("ad_type", -1);
                pVar.f12557a = optJSONObject.optString("strategy_id", "");
                pVar.d = optJSONObject.optInt("req_once_load_timeout", 15);
                pVar.e = optJSONObject.optInt("media_strategy", i5);
                pVar.f = optJSONObject.optInt("webview_enforce_duration", i5) * 1000;
                pVar.g = optJSONObject.optInt("video_direction", i5);
                pVar.h = (sg.bigo.ads.P.a.b(pVar.b) || optJSONObject.optInt("video_replay", 1) == 1) ? 1 : i5;
                pVar.i = (sg.bigo.ads.P.a.b(pVar.b) || optJSONObject.optInt("video_mute", i5) == 0) ? 1 : i5;
                pVar.j = optJSONObject.optInt("banner_auto_refresh", i5) == 1 ? 1 : i5;
                pVar.k = optJSONObject.optInt("banner_refresh_interval", 20);
                pVar.l = optJSONObject.optString("slot", "");
                pVar.m = optJSONObject.optInt("state", 1) == 1 ? 1 : i5;
                pVar.n = optJSONObject.optString("placement_id", "");
                JSONArray optJSONArray = optJSONObject.optJSONArray("express_list");
                pVar.o = new ArrayList();
                if (optJSONArray != null) {
                    int i7 = i5;
                    while (i7 < optJSONArray.length()) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i7);
                        a aVar = new a();
                        if (optJSONObject2 == null) {
                            AbstractC5496a.a("AdExpress", "parseData error, jsonObject is null.");
                            i3 = i6;
                            i4 = i7;
                        } else {
                            i3 = i6;
                            i4 = i7;
                            aVar.f12547a = optJSONObject2.optLong("id", 0L);
                            aVar.b = optJSONObject2.optString("name", "");
                            aVar.c = optJSONObject2.optString("url", "");
                            aVar.d = optJSONObject2.optString("md5", "");
                            aVar.e = optJSONObject2.optString("style", "");
                            aVar.f = optJSONObject2.optString("ad_types", "");
                            aVar.g = optJSONObject2.optString(FontsContractCompat.Columns.FILE_ID, "");
                            if (aVar.f12547a != 0 && !TextUtils.isEmpty(aVar.b) && !TextUtils.isEmpty(aVar.c) && !TextUtils.isEmpty(aVar.d) && !TextUtils.isEmpty(aVar.f) && !TextUtils.isEmpty(aVar.g)) {
                                pVar.o.add(aVar);
                            }
                        }
                        i7 = i4 + 1;
                        i6 = i3;
                    }
                }
                i = i6;
                pVar.p = optJSONObject.optString("abflags");
                pVar.s = optJSONObject.optInt("playable", 0);
                pVar.q = optJSONObject.optString("style_id");
                pVar.a(optJSONObject.optString("interstitial_style_config"));
                pVar.u = optJSONObject.optInt("banner_multiple_click", 1) == 1;
                i2 = 0;
                pVar.t = optJSONObject.optInt("companion_render", 0);
                pVar.v = optJSONObject.optInt("auc_mode", 0);
                l lVar = pVar.w;
                lVar.getClass();
                lVar.f12556a = optJSONObject.optInt("video_click_mode", 1) == 1;
                lVar.b = optJSONObject.optInt("native_ad_view_clickable", 0) == 1;
                lVar.c = optJSONObject.optInt("native_ad_click_type", 0);
                if (!pVar.m || (!TextUtils.isEmpty(pVar.l) && !TextUtils.isEmpty(pVar.n))) {
                    hashMap.put(pVar.l, pVar);
                }
            }
            int i8 = i2;
            i6 = i + 1;
            i5 = i8;
        }
        this.e = hashMap;
        this.f = str;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = this.e;
        if (hashMap != null) {
            arrayList.addAll(hashMap.values());
        }
        sg.bigo.ads.U.n.a(parcel, arrayList);
        parcel.writeString(this.f);
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        ArrayList b = sg.bigo.ads.U.n.b(parcel, new m());
        HashMap hashMap = new HashMap();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            hashMap.put(pVar.l, pVar);
        }
        this.e = hashMap;
        this.f = parcel.dataAvail() > 0 ? parcel.readString() : "";
    }
}
