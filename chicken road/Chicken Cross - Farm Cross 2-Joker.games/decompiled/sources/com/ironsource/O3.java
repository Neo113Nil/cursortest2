package com.ironsource;

import android.content.Context;
import com.ironsource.U3;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class O3 implements InterfaceC4584p7 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC4566o7 f7823a;

    protected O3(JSONObject jSONObject, Context context) {
        this.f7823a = a(jSONObject, context);
        Logger.i("O3", "created ConnectivityAdapter with strategy " + this.f7823a.getClass().getSimpleName());
    }

    public JSONObject a(Context context) {
        return this.f7823a.c(context);
    }

    @Override // com.ironsource.InterfaceC4584p7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC4584p7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.f7823a.b(context);
    }

    @Override // com.ironsource.InterfaceC4584p7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f7823a.a(context);
    }

    public void b() {
        this.f7823a.a();
    }

    private InterfaceC4566o7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(U3.j.g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (C1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new C4446hc(this);
        }
        return new BroadcastReceiverStrategy(this);
    }
}
