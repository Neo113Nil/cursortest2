package com.google.android.gms.internal.ads;

import Q2.C0379q;
import android.os.Bundle;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1845yp implements Lp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16481a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16482b;

    public /* synthetic */ C1845yp(int i, Object obj) {
        this.f16481a = i;
        this.f16482b = obj;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final /* synthetic */ void k(Object obj) {
        int i = this.f16481a;
    }

    @Override // com.google.android.gms.internal.ads.Lp
    public final void o(Object obj) {
        boolean z3;
        switch (this.f16481a) {
            case 0:
                C0572Ch c0572Ch = (C0572Ch) obj;
                if (((Kq) this.f16482b) != null) {
                    if (((Boolean) Q2.r.f5053d.f5056c.a(F7.yb)).booleanValue()) {
                        return;
                    }
                    Bundle bundle = c0572Ch.f8049a;
                    Kq kq = (Kq) this.f16482b;
                    synchronized (kq.f10255c) {
                        kq.c();
                        z3 = kq.f10257e == 2;
                    }
                    bundle.putBoolean("render_in_browser", z3);
                    c0572Ch.f8049a.putBoolean("disable_ml", ((Kq) this.f16482b).b());
                    return;
                }
                return;
            case 1:
                try {
                    ((JSONObject) obj).put("cache_state", (JSONObject) this.f16482b);
                    return;
                } catch (JSONException unused) {
                    T2.G.m("Unable to get cache_state");
                    return;
                }
            case 2:
                JSONObject jSONObject = (JSONObject) obj;
                Wp wp = (Wp) this.f16482b;
                wp.getClass();
                try {
                    jSONObject.put("gms_sdk_env", wp.f12094a);
                    return;
                } catch (JSONException unused2) {
                    T2.G.m("Failed putting version constants.");
                    return;
                }
            default:
                try {
                    ((JSONObject) obj).put("video_decoders", C0379q.f.f5048a.g((HashMap) this.f16482b));
                    return;
                } catch (JSONException e3) {
                    T2.G.m("Could not encode video decoder properties: ".concat(String.valueOf(e3.getMessage())));
                    return;
                }
        }
    }

    private final /* synthetic */ void a(Object obj) {
    }

    private final /* synthetic */ void b(Object obj) {
    }

    private final /* synthetic */ void c(Object obj) {
    }

    private final /* synthetic */ void d(Object obj) {
    }
}
