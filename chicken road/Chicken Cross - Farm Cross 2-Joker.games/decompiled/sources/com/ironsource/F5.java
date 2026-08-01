package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class F5 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f7624a = new ArrayList<>(new E5().a());
    private final N6 b = new N6();

    public final JSONObject a() {
        JSONObject a2 = this.b.a(this.f7624a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return a2;
    }
}
