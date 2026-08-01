package sg.bigo.ads.k1;

import android.graphics.Rect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.k1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5261b {

    /* renamed from: a, reason: collision with root package name */
    public final float f13028a;
    public final Rect b;

    public C5261b(float f, Rect rect) {
        this.f13028a = f;
        this.b = rect;
    }

    public static JSONObject a(Rect rect) {
        if (rect == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", rect.left);
            jSONObject.put("y", rect.top);
            jSONObject.put("width", rect.width());
            jSONObject.put("height", rect.height());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
