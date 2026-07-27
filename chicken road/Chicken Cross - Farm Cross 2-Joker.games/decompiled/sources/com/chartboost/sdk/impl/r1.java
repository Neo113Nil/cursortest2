package com.chartboost.sdk.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class r1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Function1 f4989a = new Function1() { // from class: com.chartboost.sdk.impl.r1$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return r1.a((m1) obj);
        }
    };

    public static final com.chartboost.sdk.internal.Model.a a(m1 it) {
        JSONObject jSONObject;
        String str = JsonUtils.EMPTY_JSON;
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            String string = it.g().getString("config", JsonUtils.EMPTY_JSON);
            if (string != null) {
                str = string;
            }
            jSONObject = new JSONObject(str);
        } catch (Exception e) {
            mb.b("Error reading config from shared preferences", e);
            jSONObject = new JSONObject();
        }
        return new com.chartboost.sdk.internal.Model.a(jSONObject);
    }
}
