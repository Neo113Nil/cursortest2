package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* loaded from: classes6.dex */
public final class V4 extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Wj f6906a;

    public V4(Wj wj) {
        this.f6906a = wj;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        return MediaType.parse(this.f6906a.a());
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f6906a.a(sink);
    }
}
