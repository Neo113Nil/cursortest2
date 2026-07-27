package sg.bigo.ads.P;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n {
    public o[] e;
    public o f;

    /* renamed from: a, reason: collision with root package name */
    public long f12486a = 0;
    public String b = "en";
    public String c = "";
    public String d = "";
    public String g = "";
    public String h = "";
    public int i = 0;
    public int j = 0;
    public final sg.bigo.ads.O.d l = new sg.bigo.ads.O.d();
    public final sg.bigo.ads.O.c m = new sg.bigo.ads.O.c();
    public sg.bigo.ads.O.e[] k = new sg.bigo.ads.O.e[0];

    public final void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new o(optJSONObject));
                }
            }
            o[] oVarArr = new o[arrayList.size()];
            this.e = oVarArr;
            this.e = (o[]) arrayList.toArray(oVarArr);
        }
    }
}
