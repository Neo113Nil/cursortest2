package sg.bigo.ads.E1;

import android.os.SystemClock;
import android.webkit.JavascriptInterface;
import com.ironsource.U3;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f12278a;
    public final d b;

    public c(f fVar, d dVar) {
        this.f12278a = fVar;
        this.b = dVar;
    }

    @JavascriptInterface
    public void onCustomJSEventCallback(String str, String str2) {
        g customWebChromeClient = this.f12278a.getCustomWebChromeClient();
        if (customWebChromeClient != null) {
            customWebChromeClient.a(str, str2);
        }
    }

    @JavascriptInterface
    public void webCollect(String str) {
        d dVar = this.b;
        if (dVar.f12279a == null) {
            dVar.f12279a = new ArrayList();
        }
        if (str.contains("notify") && !str.startsWith(U3.j.d)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put(BidResponsed.KEY_CUR, SystemClock.elapsedRealtime());
                str = jSONObject.toString();
            } catch (Exception unused) {
            }
        }
        dVar.f12279a.add(str);
    }

    @JavascriptInterface
    public void webStat(String str, String str2) {
    }
}
