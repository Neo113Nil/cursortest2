package com.startapp.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class cb {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f3542c;
    public final Context f;

    /* renamed from: g, reason: collision with root package name */
    public final TrackingParams f3545g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3540a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3541b = true;

    /* renamed from: d, reason: collision with root package name */
    public la f3543d = null;

    /* renamed from: e, reason: collision with root package name */
    public ma f3544e = null;

    public cb(Context context, Runnable runnable, TrackingParams trackingParams) {
        this.f3542c = runnable;
        this.f = context;
        this.f3545g = trackingParams;
    }

    @JavascriptInterface
    public void closeAd() {
        if (this.f3540a) {
            return;
        }
        this.f3540a = true;
        this.f3542c.run();
    }

    @JavascriptInterface
    public void enableScroll(String str) {
        ma maVar = this.f3544e;
        if (maVar != null) {
            maVar.run();
        }
    }

    @JavascriptInterface
    public void externalLinks(String str) {
        if (!this.f3541b) {
            g0.b(this.f, str);
        } else {
            WeakHashMap weakHashMap = si.f4343a;
            g0.a(this.f, str);
        }
    }

    @JavascriptInterface
    public void openApp(String str, String str2, String str3) {
        if (str != null && !TextUtils.isEmpty(str)) {
            g0.a(this.f, str, this.f3545g);
        }
        Intent b3 = si.b(this.f, str2);
        if (b3 != null && str3 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String valueOf = String.valueOf(keys.next());
                    b3.putExtra(valueOf, String.valueOf(jSONObject.get(valueOf)));
                }
            } catch (JSONException unused) {
            }
        }
        if (b3 != null) {
            try {
                this.f.startActivity(b3);
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        la laVar = this.f3543d;
        if (laVar != null) {
            laVar.f3985a.i();
            laVar.f3985a.b();
        }
    }
}
