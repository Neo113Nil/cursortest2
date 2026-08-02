package com.facebook;

import com.facebook.C0717k;
import com.facebook.z;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.facebook.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0701f implements z.b {
    public final /* synthetic */ C0717k.d a;

    public /* synthetic */ C0701f(C0717k.d dVar) {
        this.a = dVar;
    }

    @Override // com.facebook.z.b
    public final void a(E response) {
        C0717k.d refreshResult = this.a;
        Intrinsics.checkNotNullParameter(refreshResult, "$refreshResult");
        Intrinsics.checkNotNullParameter(response, "response");
        JSONObject jSONObject = response.d;
        if (jSONObject == null) {
            return;
        }
        refreshResult.a = jSONObject.optString("access_token");
        refreshResult.b = jSONObject.optInt("expires_at");
        refreshResult.c = jSONObject.optInt("expires_in");
        refreshResult.d = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
        refreshResult.e = jSONObject.optString("graph_domain", null);
    }
}
