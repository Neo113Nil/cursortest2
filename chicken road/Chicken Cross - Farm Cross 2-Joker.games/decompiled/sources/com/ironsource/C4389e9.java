package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.e9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4389e9 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f8154a = new ArrayList<>(new C4335b9().a());
    private final N6 b = new N6();

    public final JSONObject a() {
        JSONObject a2 = this.b.a(this.f8154a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return a2;
    }
}
