package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ia extends com.inmobi.media.Hi {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f4762a;

    public Ia(org.json.JSONObject jsonObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        this.f4762a = jsonObject;
    }

    @Override // com.inmobi.media.Hi
    public final void a(okio.BufferedSink bufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        java.lang.String jSONObject = this.f4762a.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        bufferedSink.writeUtf8(jSONObject);
    }

    @Override // com.inmobi.media.Hi
    public final java.lang.String a() {
        return com.ironsource.B5.M;
    }
}
