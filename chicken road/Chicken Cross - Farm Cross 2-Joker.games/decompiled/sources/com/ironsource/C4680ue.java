package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.ue, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4680ue {

    /* renamed from: a, reason: collision with root package name */
    private final Te f8709a;
    private final Ed b;
    private final Id c;
    private final L3 d;
    private final K5 e;

    public C4680ue(Te fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.f8709a = fullResponse;
        JSONObject optJSONObject = fullResponse.j().optJSONObject(C4698ve.f8737a);
        this.b = new Ed(optJSONObject == null ? new JSONObject() : optJSONObject);
        JSONObject optJSONObject2 = fullResponse.j().optJSONObject(C4698ve.b);
        this.c = new Id(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = fullResponse.j().optJSONObject("configurations");
        this.d = new L3(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        JSONObject optJSONObject4 = fullResponse.j().optJSONObject(C4698ve.d);
        this.e = new K5(optJSONObject4 == null ? new JSONObject() : optJSONObject4);
    }

    public final L3 a() {
        return this.d;
    }

    public final K5 b() {
        return this.e;
    }

    public final Te c() {
        return this.f8709a;
    }

    public final Ed d() {
        return this.b;
    }

    public final Id e() {
        return this.c;
    }
}
