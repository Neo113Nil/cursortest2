package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0273c7 implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0247b7 f5636a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0273c7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(io.appmetrica.analytics.impl.C0299d7 c0299d7) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f5636a.fromModel(c0299d7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f5636a.fromModel((io.appmetrica.analytics.impl.C0299d7) obj));
    }

    public C0273c7(io.appmetrica.analytics.impl.C0247b7 c0247b7) {
        this.f5636a = c0247b7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.C0299d7 toModel(byte[] bArr) {
        io.appmetrica.analytics.impl.C0531m7 c0531m7;
        if (bArr != null) {
            try {
                c0531m7 = (io.appmetrica.analytics.impl.C0531m7) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0531m7(), bArr);
            } catch (io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException unused) {
                c0531m7 = new io.appmetrica.analytics.impl.C0531m7();
            }
        }
        c0531m7 = new io.appmetrica.analytics.impl.C0531m7();
        return this.f5636a.toModel(c0531m7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C0273c7(io.appmetrica.analytics.impl.C0247b7 c0247b7, int i2, kotlin.jvm.internal.e eVar) {
        this(c0247b7);
        if ((i2 & 1) != 0) {
            c0247b7 = new io.appmetrica.analytics.impl.C0247b7(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
