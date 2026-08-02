package w1;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u2 extends D1.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17880c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17881d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f17882e;

    public u2(String str, boolean z4) {
        super(2, (byte) 0);
        this.f17882e = str;
        this.f17881d = z4;
    }

    @Override // D1.a
    public final JSONObject a() {
        switch (this.f17880c) {
            case 0:
                JSONObject a2 = super.a();
                String str = (String) this.f17882e;
                if (!TextUtils.isEmpty(str)) {
                    a2.put("fl.notification.key", str);
                }
                a2.put("fl.notification.enabled", this.f17881d);
                return a2;
            default:
                JSONObject a4 = super.a();
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : ((HashMap) this.f17882e).entrySet()) {
                    jSONObject.put(((H) entry.getKey()).name(), entry.getValue());
                }
                a4.put("fl.reported.id", jSONObject);
                a4.put("fl.ad.tracking", this.f17881d);
                return a4;
        }
    }

    public u2(Map map, boolean z4) {
        super(2, (byte) 0);
        this.f17882e = new HashMap(map);
        this.f17881d = z4;
    }
}
