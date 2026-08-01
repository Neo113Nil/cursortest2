package sg.bigo.ads.Y0;

import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f12641a;

    public o(x xVar) {
        this.f12641a = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x xVar = this.f12641a;
        if (xVar.R || xVar.h == null || xVar.B == null) {
            return;
        }
        String str = null;
        HashMap a2 = sg.bigo.ads.s1.b.a(xVar, xVar.H.isEmpty() ? null : (sg.bigo.ads.Q.f) xVar.H.get(0), System.currentTimeMillis() - xVar.D, xVar.x, xVar.B, xVar.A, xVar.L, xVar.c(false));
        if (!sg.bigo.ads.K0.A.a(a2)) {
            try {
                str = new JSONObject(a2).toString();
            } catch (Exception unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        sg.bigo.ads.F0.b.b("sp_ads", "landing_webview_close_info", str, 3);
    }
}
