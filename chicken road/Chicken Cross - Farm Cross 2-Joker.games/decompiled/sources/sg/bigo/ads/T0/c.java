package sg.bigo.ads.T0;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public n f12549a;
    public String b = "";
    public HashMap c = new HashMap();

    public final b a(String str) {
        n nVar;
        int i;
        Map map;
        if (TextUtils.isEmpty(str) || (nVar = this.f12549a) == null) {
            return null;
        }
        HashMap hashMap = nVar.e;
        p pVar = (hashMap == null || str == null) ? null : (p) hashMap.get(str);
        if (pVar == null) {
            return null;
        }
        int i2 = pVar.v;
        if (i2 == 0) {
            i2 = 1;
        }
        if (i2 == 3 || (i = pVar.b) == 2 || (map = (Map) this.c.get(Integer.valueOf(i2))) == null) {
            return null;
        }
        return (b) map.get(Integer.valueOf(i));
    }

    public final boolean b(String str) {
        b a2 = a(str);
        return a2 != null && a2.e == 1;
    }

    public final void c(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.c.isEmpty()) {
                return;
            }
            this.c = new HashMap();
            return;
        }
        this.b = str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    b bVar = new b();
                    bVar.f12548a = optJSONObject.optLong("tmax", 15L);
                    bVar.b = optJSONObject.optInt("cache_num", 2);
                    bVar.c = optJSONObject.optInt("single_ad", 0);
                    bVar.d = optJSONObject.optLong("single_tmax", 15L);
                    bVar.e = optJSONObject.optInt("tmax_switch", 0);
                    bVar.f = optJSONObject.optInt("tmax_strategy", 0);
                    bVar.g = optJSONObject.optInt("assign_strategy", 0);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("auc_type");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("ad_type");
                    if (optJSONArray != null && optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            int optInt = optJSONArray.optInt(i2);
                            if (optInt == 0) {
                                optInt = 1;
                            }
                            Map map = (Map) hashMap.get(Integer.valueOf(optInt));
                            if (map == null) {
                                map = new HashMap();
                                hashMap.put(Integer.valueOf(optInt), map);
                            }
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                int optInt2 = optJSONArray2.optInt(i3);
                                if (((b) map.get(Integer.valueOf(optInt2))) == null) {
                                    map.put(Integer.valueOf(optInt2), bVar);
                                }
                            }
                        }
                    }
                }
            }
            this.c = hashMap;
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.b);
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        c(parcel.readString());
    }
}
