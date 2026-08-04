package p155w1;

import D1.a;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17886c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Serializable f17888e;

    public u2(String str, boolean z4) {
        super(2, (byte) 0);
        this.f17888e = str;
        this.f17887d = z4;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        switch (this.f17886c) {
            case 0:
                JSONObject jSONObjectA = super.a();
                String str = (String) this.f17888e;
                if (!TextUtils.isEmpty(str)) {
                    jSONObjectA.put("fl.notification.key", str);
                }
                jSONObjectA.put("fl.notification.enabled", this.f17887d);
                return jSONObjectA;
            default:
                JSONObject jSONObjectA2 = super.a();
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((HashMap) this.f17888e).entrySet()) {
                    jSONObject.put(((H) entry.getKey()).name(), entry.getValue());
                }
                jSONObjectA2.put("fl.reported.id", jSONObject);
                jSONObjectA2.put("fl.ad.tracking", this.f17887d);
                return jSONObjectA2;
        }
    }

    public u2(Map map, boolean z4) {
        super(2, (byte) 0);
        this.f17888e = new HashMap(map);
        this.f17887d = z4;
    }
}
