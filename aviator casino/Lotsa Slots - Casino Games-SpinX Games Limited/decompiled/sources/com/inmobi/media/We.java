package com.inmobi.media;

/* loaded from: classes5.dex */
public final class We implements com.inmobi.media.Ve {

    /* renamed from: a, reason: collision with root package name */
    public final int f5031a;
    public final okio.ByteString b;
    public final com.inmobi.media.Qe c;

    public We(java.lang.String resolvedUrl, int i, okio.ByteString bodyBytes, com.inmobi.media.Qe responseMetaData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolvedUrl, "resolvedUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseMetaData, "responseMetaData");
        this.f5031a = i;
        this.b = bodyBytes;
        this.c = responseMetaData;
    }

    @Override // com.inmobi.media.Ve
    public final java.lang.Object a() {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.C2712r4.class, "clazz");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.C2712r4.class, "type");
        org.json.JSONObject jsonObject = new org.json.JSONObject(this.b.string(kotlin.text.Charsets.UTF_8));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com.inmobi.media.C2712r4.class, "type");
        return com.inmobi.media.C2712r4.class.cast(com.inmobi.media.AbstractC2773ta.a(jsonObject, com.inmobi.media.C2712r4.class, null, null));
    }

    @Override // com.inmobi.media.Ve
    public final com.inmobi.media.Qe b() {
        return this.c;
    }

    @Override // com.inmobi.media.Ve
    public final int c() {
        return this.f5031a;
    }

    @Override // com.inmobi.media.Ve
    public final okio.ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.Ve
    public final java.lang.String e() {
        return null;
    }
}
