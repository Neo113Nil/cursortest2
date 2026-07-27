package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class K implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final M f8990a;

    /* JADX WARN: Multi-variable type inference failed */
    public K() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(J j3) {
        return MessageNano.toByteArray(this.f8990a.fromModel(j3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f8990a.fromModel((J) obj));
    }

    public K(M m3) {
        this.f8990a = m3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final J toModel(byte[] bArr) {
        S s3;
        try {
            s3 = (S) MessageNano.mergeFrom(new S(), bArr);
        } catch (Throwable unused) {
            s3 = new S();
        }
        return this.f8990a.toModel(s3);
    }

    public /* synthetic */ K(M m3, int i3, kotlin.jvm.internal.f fVar) {
        this((i3 & 1) != 0 ? new M(null, 1, null) : m3);
    }
}
