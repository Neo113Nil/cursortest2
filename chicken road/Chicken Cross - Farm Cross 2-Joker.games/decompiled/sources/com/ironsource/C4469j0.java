package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.j0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4469j0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f8254a = new ArrayList<>(new C4452i0().a());
    private final N6 b = new N6();

    public final JSONObject a() {
        JSONObject a2 = this.b.a(this.f8254a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return a2;
    }
}
