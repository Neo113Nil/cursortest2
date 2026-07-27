package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public abstract class s {
    public static final Map a(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        String a2 = rVar.a();
        if (a2 == null) {
            a2 = "";
        }
        return MapsKt.mapOf(TuplesKt.to("CB_AUCTION_ID", a2), TuplesKt.to("CB_IMPRESSION_IDS", new JSONArray((Collection) rVar.e()).toString()));
    }
}
