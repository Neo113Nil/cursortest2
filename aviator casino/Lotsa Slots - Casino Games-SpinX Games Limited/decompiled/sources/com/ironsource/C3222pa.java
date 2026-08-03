package com.ironsource;

/* renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3222pa implements com.ironsource.Te<org.json.JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.Te<java.lang.String> f6554a;

    public C3222pa(com.ironsource.Te<java.lang.String> serverResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f6554a = serverResponse;
    }

    @Override // com.ironsource.Te
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.json.JSONObject a() {
        return new org.json.JSONObject(this.f6554a.a());
    }
}
