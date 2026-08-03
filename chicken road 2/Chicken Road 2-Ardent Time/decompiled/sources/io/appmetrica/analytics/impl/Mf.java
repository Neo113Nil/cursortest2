package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Mf implements io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4670a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper f4671b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer f4672c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter f4673d;

    public Mf(java.lang.String str, io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper iBinaryDataHelper, io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer<io.appmetrica.analytics.protobuf.nano.MessageNano> protobufStateSerializer, io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter<java.lang.Object, io.appmetrica.analytics.protobuf.nano.MessageNano> protobufConverter) {
        this.f4670a = str;
        this.f4671b = iBinaryDataHelper;
        this.f4672c = protobufStateSerializer;
        this.f4673d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f4671b.remove(this.f4670a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final java.lang.Object read() {
        try {
            byte[] bArr = this.f4671b.get(this.f4670a);
            if (bArr != null && bArr.length != 0) {
                return this.f4673d.toModel((io.appmetrica.analytics.protobuf.nano.MessageNano) this.f4672c.toState(bArr));
            }
            return this.f4673d.toModel((io.appmetrica.analytics.protobuf.nano.MessageNano) this.f4672c.defaultValue());
        } catch (java.lang.Throwable unused) {
            return this.f4673d.toModel((io.appmetrica.analytics.protobuf.nano.MessageNano) this.f4672c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(java.lang.Object obj) {
        this.f4671b.insert(this.f4670a, this.f4672c.toByteArray((io.appmetrica.analytics.protobuf.nano.MessageNano) this.f4673d.fromModel(obj)));
    }
}
