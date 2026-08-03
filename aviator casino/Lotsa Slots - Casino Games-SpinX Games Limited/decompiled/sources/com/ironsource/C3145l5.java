package com.ironsource;

/* renamed from: com.ironsource.l5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3145l5 implements com.ironsource.Ib<java.lang.String, com.ironsource.mediationsdk.d.a> {
    @Override // com.ironsource.Ib
    public com.ironsource.mediationsdk.d.a a(java.lang.String input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        com.ironsource.mediationsdk.d.a a2 = com.ironsource.mediationsdk.d.b().a(new org.json.JSONObject(input));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(a2, "getInstance().getAuction…sponse(JSONObject(input))");
        return a2;
    }
}
