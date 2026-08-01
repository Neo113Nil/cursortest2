package sg.bigo.ads.n0;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.P.n;
import sg.bigo.ads.R;
import sg.bigo.ads.common.view.PrivacyCheckBox;
import sg.bigo.ads.m0.C5353f;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13202a;
    public final Map c;
    public final n d;
    public final sg.bigo.ads.O.e[] e;
    public View f;
    public PrivacyCheckBox g;
    public final C5353f i;
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final ArrayList h = new ArrayList();

    public e(n nVar, Map map, Context context, C5353f c5353f) {
        this.f13202a = context;
        this.d = nVar;
        this.c = map;
        this.e = nVar.k;
        this.i = c5353f;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : this.b.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    jSONObject.putOpt((String) entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    public final void a(String str, String str2) {
        Button button;
        this.b.put(str, str2);
        C5353f c5353f = this.i;
        if (c5353f == null || (button = c5353f.d) == null || c5353f.f) {
            return;
        }
        button.setEnabled(true);
        c5353f.d.setBackgroundResource(R.drawable.bigo_ad_btn_background);
        c5353f.d.setTextColor(-1);
        c5353f.f = true;
        c5353f.a(2, c5353f.i, System.currentTimeMillis() - c5353f.h);
    }
}
