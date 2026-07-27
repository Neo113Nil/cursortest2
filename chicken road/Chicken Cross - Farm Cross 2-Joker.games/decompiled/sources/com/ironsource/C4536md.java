package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.md, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C4536md implements D0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f8362a;

    public C4536md(String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        this.f8362a = placementName;
    }

    @Override // com.ironsource.D0
    public Map<String, Object> a(B0 b0) {
        HashMap hashMap = new HashMap();
        hashMap.put("placement", this.f8362a);
        return hashMap;
    }
}
