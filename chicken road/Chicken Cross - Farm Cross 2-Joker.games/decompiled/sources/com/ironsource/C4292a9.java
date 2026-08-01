package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.a9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4292a9 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f8076a = new ArrayList<>(new Z8().a());
    private final N6 b = new N6();

    public final JSONObject a() {
        JSONObject a2 = this.b.a(this.f8076a);
        Intrinsics.checkNotNullExpressionValue(a2, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return a2;
    }
}
