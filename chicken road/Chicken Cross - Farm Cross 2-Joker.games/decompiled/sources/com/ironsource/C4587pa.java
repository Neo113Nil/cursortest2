package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.ironsource.pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4587pa implements Re<JSONObject> {

    /* renamed from: a, reason: collision with root package name */
    private final Re<String> f8479a;

    public C4587pa(Re<String> serverResponse) {
        Intrinsics.checkNotNullParameter(serverResponse, "serverResponse");
        this.f8479a = serverResponse;
    }

    @Override // com.ironsource.Re
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONObject a() {
        return new JSONObject(this.f8479a.a());
    }
}
