package com.inmobi.media;

/* renamed from: com.inmobi.media.y4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2897y4 extends okhttp3.RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.inmobi.media.Hi f5562a;

    public C2897y4(com.inmobi.media.Hi hi) {
        this.f5562a = hi;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final okhttp3.MediaType get$contentType() {
        return okhttp3.MediaType.parse(this.f5562a.a());
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(okio.BufferedSink sink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sink, "sink");
        this.f5562a.a(sink);
    }
}
