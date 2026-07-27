package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;

/* renamed from: com.inmobi.media.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3726g3 extends Wj {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7115a;

    public C3726g3(byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f7115a = bytes;
    }

    @Override // com.inmobi.media.Wj
    public final void a(BufferedSink bufferedSink) {
        Intrinsics.checkNotNullParameter(bufferedSink, "bufferedSink");
        bufferedSink.write(this.f7115a);
    }

    @Override // com.inmobi.media.Wj
    public final String a() {
        return "application/octet-stream";
    }
}
