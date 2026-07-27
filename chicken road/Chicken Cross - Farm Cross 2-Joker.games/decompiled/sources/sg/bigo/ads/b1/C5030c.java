package sg.bigo.ads.b1;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.b1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5030c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f12696a;

    public C5030c(JSONObject jSONObject) {
        this.f12696a = jSONObject;
    }

    public final void a(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f12696a.putOpt(str, obj);
        } catch (JSONException unused) {
        }
    }
}
