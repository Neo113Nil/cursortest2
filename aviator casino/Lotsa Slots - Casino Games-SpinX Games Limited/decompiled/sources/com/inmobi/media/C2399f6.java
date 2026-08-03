package com.inmobi.media;

/* renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2399f6 implements com.inmobi.media.Ve {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.EnumC2372e6 f5193a;
    public final okio.ByteString b;

    public C2399f6(java.lang.String url, com.inmobi.media.EnumC2372e6 errorCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f5193a = errorCode;
        this.b = okio.ByteString.EMPTY;
    }

    @Override // com.inmobi.media.Ve
    public final java.lang.Object a() {
        return null;
    }

    @Override // com.inmobi.media.Ve
    public final com.inmobi.media.Qe b() {
        return new com.inmobi.media.Qe(0L, kotlin.collections.MapsKt.emptyMap(), 0, "");
    }

    @Override // com.inmobi.media.Ve
    public final int c() {
        return this.f5193a.f5171a;
    }

    @Override // com.inmobi.media.Ve
    public final okio.ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.Ve
    public final java.lang.String e() {
        return this.f5193a.name();
    }
}
