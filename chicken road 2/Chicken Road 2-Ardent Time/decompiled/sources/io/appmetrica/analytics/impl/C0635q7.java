package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635q7 implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0609p7 f6677a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0635q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(io.appmetrica.analytics.impl.C0660r7 c0660r7) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f6677a.fromModel(c0660r7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f6677a.fromModel((io.appmetrica.analytics.impl.C0660r7) obj));
    }

    public C0635q7(io.appmetrica.analytics.impl.C0609p7 c0609p7) {
        this.f6677a = c0609p7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.C0660r7 toModel(byte[] bArr) {
        io.appmetrica.analytics.impl.C0583o7 c0583o7;
        if (bArr != null) {
            try {
                c0583o7 = (io.appmetrica.analytics.impl.C0583o7) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.impl.C0583o7(), bArr);
            } catch (io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException unused) {
                c0583o7 = new io.appmetrica.analytics.impl.C0583o7();
            }
        }
        c0583o7 = new io.appmetrica.analytics.impl.C0583o7();
        return this.f6677a.toModel(c0583o7);
    }

    public /* synthetic */ C0635q7(io.appmetrica.analytics.impl.C0609p7 c0609p7, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.impl.C0609p7(null, 1, null) : c0609p7);
    }
}
