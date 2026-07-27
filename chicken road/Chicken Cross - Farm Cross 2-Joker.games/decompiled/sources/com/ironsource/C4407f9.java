package com.ironsource;

import com.ironsource.environment.ContextProvider;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.f9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4407f9 {

    /* renamed from: a, reason: collision with root package name */
    public static final C4407f9 f8194a = new C4407f9();

    private C4407f9() {
    }

    @JvmStatic
    public static final JSONObject a() {
        new T9().b(ContextProvider.getInstance().getApplicationContext());
        String jSONObject = new C4389e9().a().toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "InitProvider().getInitData().toString()");
        Ve.c(jSONObject);
        JSONObject encodedJsonInitResponse = new JSONObject().put("data", I9.e(C4457i5.b().c(), jSONObject));
        Intrinsics.checkNotNullExpressionValue(encodedJsonInitResponse, "encodedJsonInitResponse");
        return encodedJsonInitResponse;
    }
}
