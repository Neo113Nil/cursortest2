package sg.bigo.ads.b;

import android.content.Context;
import android.provider.Settings;
import org.json.JSONObject;
import sg.bigo.ads.a.AbstractC5015a;
import sg.bigo.ads.c.AbstractC5047m;

/* renamed from: sg.bigo.ads.b.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5022b implements g {
    @Override // sg.bigo.ads.b.g
    public final Object a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
                jSONObject.put("adb_enabled", 1);
            }
        } catch (Throwable unused) {
        }
        String str = AbstractC5015a.t0;
        String str2 = AbstractC5015a.M;
        if (str.equalsIgnoreCase(AbstractC5047m.a(str2))) {
            jSONObject.put(str2, 1);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return AbstractC5015a.p;
    }
}
