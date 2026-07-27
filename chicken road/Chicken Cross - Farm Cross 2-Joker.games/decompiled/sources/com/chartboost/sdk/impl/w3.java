package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class w3 {
    public JSONObject a(u3 u3Var) {
        return u3Var == null ? new JSONObject() : x2.a(x2.a("carrier-name", u3Var.d()), x2.a("mobile-country-code", u3Var.a()), x2.a("mobile-network-code", u3Var.b()), x2.a("iso-country-code", u3Var.c()), x2.a("phone-type", Integer.valueOf(u3Var.e())));
    }
}
