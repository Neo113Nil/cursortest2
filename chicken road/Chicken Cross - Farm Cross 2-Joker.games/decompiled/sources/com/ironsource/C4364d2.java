package com.ironsource;

import com.ironsource.L6;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.d2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4364d2 {

    /* renamed from: a, reason: collision with root package name */
    private final L6.a f8120a;
    private final ArrayList<String> b = new ArrayList<>(new C4328b2().a());
    private final N6 c = new N6();

    public C4364d2(L6.a aVar) {
        this.f8120a = aVar;
    }

    public final JSONObject a() {
        L6.a aVar = this.f8120a;
        JSONObject a2 = aVar != null ? this.c.a(this.b, aVar) : null;
        if (a2 == null) {
            a2 = this.c.a(this.b);
            Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
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
