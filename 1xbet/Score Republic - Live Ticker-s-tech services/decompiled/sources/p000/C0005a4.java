package p000;

import android.content.Context;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: a4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0005a4 {

    /* JADX INFO: renamed from: a */
    public final FirebaseAnalytics f33a;

    public C0005a4(Context context) {
        this.f33a = FirebaseAnalytics.getInstance(context);
    }

    @JavascriptInterface
    public void logEvent(String str, String str2) {
        Bundle bundle = new Bundle();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof Integer) {
                    bundle.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(next, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                } else if (obj instanceof String) {
                    bundle.putString(next, (String) obj);
                }
            }
        } catch (JSONException unused) {
        }
        mw1 mw1Var = this.f33a.f1354a;
        mw1Var.getClass();
        mw1Var.m3434b(new yv1(mw1Var, (String) null, str, bundle, false));
    }

    @JavascriptInterface
    public void setUserProperty(String str, String str2) {
        mw1 mw1Var = this.f33a.f1354a;
        mw1Var.getClass();
        mw1Var.m3434b(new yv1(mw1Var, (String) null, str, (Object) str2, false));
    }
}
