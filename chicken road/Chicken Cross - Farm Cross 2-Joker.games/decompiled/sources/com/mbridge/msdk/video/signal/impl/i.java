package com.mbridge.msdk.video.signal.impl;

import android.content.res.Configuration;
import android.util.Base64;
import android.webkit.WebView;
import com.ironsource.U3;
import org.json.JSONObject;

/* compiled from: JSActivityProxy.java */
/* loaded from: classes6.dex */
public class i extends b {

    /* renamed from: a, reason: collision with root package name */
    private WebView f10320a;
    private int b = 0;

    public i(WebView webView) {
        this.f10320a = webView;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(Configuration configuration) {
        super.a(configuration);
        try {
            JSONObject jSONObject = new JSONObject();
            if (configuration.orientation == 2) {
                jSONObject.put(U3.i.n, U3.i.C);
            } else {
                jSONObject.put(U3.i.n, U3.i.D);
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f10320a, U3.i.n, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void b() {
        super.b();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f10320a, "onSystemDestory", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void d() {
        super.d();
        this.b = 0;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f10320a, "onSystemResume", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void e() {
        super.e();
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f10320a, "onSystemBackPressed", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void g() {
        super.g();
        this.b = 1;
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.f10320a, "onSystemPause", "");
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public void a(int i) {
        super.a(i);
        this.b = i;
    }

    @Override // com.mbridge.msdk.video.signal.impl.b, com.mbridge.msdk.video.signal.b
    public int a() {
        return this.b;
    }
}
