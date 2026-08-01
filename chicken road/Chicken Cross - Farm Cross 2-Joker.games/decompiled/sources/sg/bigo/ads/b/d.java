package sg.bigo.ads.b;

import android.content.Context;
import android.os.Process;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;

/* loaded from: classes3.dex */
public final class d implements g {
    @Override // sg.bigo.ads.b.g
    public final Object a(Context context) {
        JSONObject jSONObject = new JSONObject();
        int myUid = Process.myUid();
        if (myUid / 100000 == 0) {
            myUid = 0;
        }
        if (myUid > 0) {
            jSONObject.put(AbstractC5015a.v, myUid);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.r;
    }
}
