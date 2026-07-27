package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class C5 implements D0 {
    public final Map<String, Object> a(C4434h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
        String aVar = adProperties.a().toString();
        Intrinsics.checkNotNullExpressionValue(aVar, "adProperties.adFormat.toString()");
        hashMap.put(Ta.f, aVar);
        hashMap.put("adf", Integer.valueOf(Gf.c(adProperties.a())));
        String uuid = adProperties.b().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "adProperties.adId.toString()");
        hashMap.put(Ta.i, uuid);
        hashMap.put("mediationAdUnitId", adProperties.c());
        hashMap.put("isMultipleAdUnits", 1);
        return hashMap;
    }
}
