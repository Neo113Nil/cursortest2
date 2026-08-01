package com.ironsource;

import com.ironsource.InterfaceC4495k8;
import com.ironsource.U3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.l8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4513l8 implements InterfaceC4495k8, InterfaceC4495k8.a {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f8310a = new JSONObject();
    private JSONObject b = new JSONObject();
    private JSONObject c = new JSONObject();

    private final Object e(String str) {
        if (this.c.has(str)) {
            return this.c.get(str);
        }
        if (this.b.has(str)) {
            return this.b.get(str);
        }
        if (this.f8310a.has(str)) {
            return this.f8310a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4495k8
    public JSONObject a(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof JSONObject) {
            return (JSONObject) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4495k8
    public Integer b(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof Integer) {
            return (Integer) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4495k8
    public Boolean c(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof Boolean) {
            return (Boolean) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4495k8
    public String d(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object e = e(configKey);
        if (e instanceof String) {
            return (String) e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC4495k8.a
    public void a(JSONObject controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.f8310a = controllerConfig;
        JSONObject optJSONObject = controllerConfig.optJSONObject(U3.a.b);
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        this.b = optJSONObject;
        JSONObject optJSONObject2 = this.f8310a.optJSONObject(U3.a.c);
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        this.c = optJSONObject2;
    }
}
