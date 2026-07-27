package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONObject;

/* renamed from: com.ironsource.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4345c1 {

    /* renamed from: a, reason: collision with root package name */
    private NetworkSettings f8106a;
    private JSONObject b;
    private IronSource.a c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;

    public C4345c1(NetworkSettings networkSettings, JSONObject jSONObject, IronSource.a aVar) {
        this.f8106a = networkSettings;
        this.b = jSONObject;
        int optInt = jSONObject.optInt("instanceType");
        this.f = optInt;
        this.d = optInt == 2;
        this.e = jSONObject.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
        this.g = jSONObject.optInt("maxAdsPerSession", 99);
        this.c = aVar;
    }

    public String a() {
        return this.f8106a.getAdSourceNameForEvents();
    }

    public IronSource.a b() {
        return this.c;
    }

    public JSONObject c() {
        return this.b;
    }

    public int d() {
        return this.f;
    }

    public int e() {
        return this.g;
    }

    public String f() {
        return this.f8106a.getProviderName();
    }

    public String g() {
        return this.f8106a.getProviderTypeForReflection();
    }

    public NetworkSettings h() {
        return this.f8106a;
    }

    public String i() {
        return this.f8106a.getSubProviderId();
    }

    public boolean j() {
        return this.d;
    }

    public boolean k() {
        return this.e;
    }
}
