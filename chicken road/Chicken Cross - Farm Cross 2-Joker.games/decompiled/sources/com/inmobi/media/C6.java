package com.inmobi.media;

import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class C6 implements Of {

    /* renamed from: a, reason: collision with root package name */
    public final B6 f6489a;
    public final ByteString b;

    public C6(String url, B6 errorCode) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f6489a = errorCode;
        this.b = ByteString.EMPTY;
    }

    @Override // com.inmobi.media.Of
    public final Object a() {
        return null;
    }

    @Override // com.inmobi.media.Of
    public final Jf b() {
        return new Jf(0L, MapsKt.emptyMap(), 0, "");
    }

    @Override // com.inmobi.media.Of
    public final int c() {
        return this.f6489a.f6470a;
    }

    @Override // com.inmobi.media.Of
    public final ByteString d() {
        return this.b;
    }

    @Override // com.inmobi.media.Of
    public final String e() {
        return this.f6489a.name();
    }
}
