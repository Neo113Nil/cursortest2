package com.ironsource;

/* renamed from: com.ironsource.e9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3024e9 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.C3024e9 f6214a = new com.ironsource.C3024e9();

    private C3024e9() {
    }

    @kotlin.jvm.JvmStatic
    public static final org.json.JSONObject a() {
        new com.ironsource.T9().b(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext());
        java.lang.String jSONObject = new com.ironsource.C3006d9().a().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "InitProvider().getInitData().toString()");
        com.ironsource.Xe.c(jSONObject);
        org.json.JSONObject encodedJsonInitResponse = new org.json.JSONObject().put("data", com.ironsource.I9.e(com.ironsource.C3127k5.b().c(), jSONObject));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
