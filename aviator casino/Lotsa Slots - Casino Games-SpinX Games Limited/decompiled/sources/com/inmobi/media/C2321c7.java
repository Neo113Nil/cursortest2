package com.inmobi.media;

/* renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2321c7 extends com.inmobi.media.Hi {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f5135a;

    public C2321c7(java.util.HashMap payload, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        this.f5135a = payload;
    }

    @Override // com.inmobi.media.Hi
    public final void a(okio.BufferedSink bufferedSink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        bufferedSink.writeUtf8(com.inmobi.media.J3.a(this.f5135a));
    }

    @Override // com.inmobi.media.Hi
    public final java.lang.String a() {
        return androidx.browser.trusted.sharing.ShareTarget.ENCODING_TYPE_URL_ENCODED;
    }

    public C2321c7(java.util.HashMap payload) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payload, "payload");
        this.f5135a = payload;
    }
}
