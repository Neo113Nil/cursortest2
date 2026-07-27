package sg.bigo.ads.c1;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.K0.N;
import sg.bigo.ads.K0.O;

/* renamed from: sg.bigo.ads.c1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5054a {

    /* renamed from: a, reason: collision with root package name */
    public final int f12705a;
    public final String b;
    public final String c;
    public final HashMap d;

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        if (r6 > ((android.os.SystemClock.elapsedRealtime() - r4.b) + r4.f12346a)) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C5054a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c = jSONObject.optString("data");
            this.f12705a = jSONObject.optInt(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE);
            this.b = jSONObject.optString("msg");
            long optInt = jSONObject.optInt("timestamp", 0);
            if (optInt >= 1619452800) {
                long j = optInt * 1000;
                N n = new N(j);
                if (O.f12347a != null) {
                    long elapsedRealtime = (SystemClock.elapsedRealtime() - n.b) + j;
                    N n2 = O.f12347a;
                }
                O.f12347a = n;
            }
            this.d = new HashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("data", next) && !TextUtils.equals(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, next) && !TextUtils.equals("msg", next)) {
                    this.d.put(next, jSONObject.opt(next));
                }
            }
        } catch (JSONException unused) {
            this.c = "";
            this.f12705a = 1005;
            this.b = "Invalid response.";
        }
    }
}
