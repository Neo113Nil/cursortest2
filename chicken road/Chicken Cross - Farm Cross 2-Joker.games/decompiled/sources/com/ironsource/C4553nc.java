package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4531m8;
import com.ironsource.U3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.nc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4553nc {
    private final InterfaceC4673u7 b = Ib.a0().a();

    /* renamed from: a, reason: collision with root package name */
    P6 f8454a = new P6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f8454a.a(L6.n, Boolean.valueOf(this.b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f8454a.a(L6.i, new JSONObject(controllerConfig).opt(U3.a.q));
        } catch (JSONException e) {
            C4491k4.d().a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void c() {
        this.f8454a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f8454a.a(L6.V, "9.5.0");
    }

    public void e() {
        HashMap hashMap = new HashMap();
        hashMap.put(L6.E, Fc.f);
        hashMap.put(L6.D, Fc.e);
        this.f8454a.a(hashMap);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f8454a.a("debug", jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        this.f8454a.a(L6.l, jSONObject);
    }

    public void a(C4531m8.c cVar) {
        this.f8454a.a(L6.y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f8454a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.f8454a.a(L6.B1, list);
    }

    public void a(boolean z) {
        this.f8454a.a(L6.U0, Boolean.valueOf(z));
    }
}
