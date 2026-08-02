package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.content.Context;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068ha implements InterfaceC0933ea, InterfaceC1560sa {

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC0677Re f13758k;

    public C1068ha(Context context, U2.a aVar) {
        V9 v9 = P2.o.f4767B.f4772d;
        InterfaceC0677Re f = V9.f(null, aVar, context, new C1586t(0, 0, 0), null, new C1773x6(), null, null, null, null, null, null, "", false, false);
        this.f13758k = f;
        f.K().setWillNotDraw(true);
    }

    public static final void q(Runnable runnable) {
        U2.e eVar = C0379q.f.f5048a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            T2.G.m("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            T2.G.m("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (T2.L.f5672l.post(runnable)) {
                return;
            }
            U2.j.i("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final void a(String str, Map map) {
        try {
            k("openIntentAsync", C0379q.f.f5048a.g((HashMap) map));
        } catch (JSONException unused) {
            U2.j.i("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1560sa
    public final void b(String str, InterfaceC1821y9 interfaceC1821y9) {
        this.f13758k.s0(str, new C1023ga(this, interfaceC1821y9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0933ea, com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void d(String str) {
        T2.G.m("invokeJavascript on adWebView from js");
        q(new RunnableC0978fa(this, str, 1));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1560sa
    public final void i(String str, InterfaceC1821y9 interfaceC1821y9) {
        this.f13758k.A0(str, new U4(6, interfaceC1821y9));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void j(String str, String str2) {
        d(str + "(" + str2 + ");");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0889da
    public final /* synthetic */ void k(String str, JSONObject jSONObject) {
        AbstractC1803xs.y(this, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1113ia
    public final void o(String str, JSONObject jSONObject) {
        j(str, jSONObject.toString());
    }

    public final void p() {
        this.f13758k.destroy();
    }
}
