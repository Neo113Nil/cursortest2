package com.ironsource;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.lg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4521lg {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f8318a = C4503kg.f8291a.a();
    private final N6 b = new N6();

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the new method getToken(context: Context)")
    public final JSONObject a() {
        JSONObject a2 = this.b.a(this.f8318a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return a(a2);
    }

    public final JSONObject a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject a2 = this.b.a(context, this.f8318a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return a(a2);
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject b = O6.b(jSONObject.optJSONObject(L6.u));
        if (b != null) {
            jSONObject.put(L6.u, b);
        }
        return jSONObject;
    }
}
