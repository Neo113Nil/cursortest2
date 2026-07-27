package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes.dex */
public final class Rf implements ProtobufStateStorage {

    /* renamed from: a, reason: collision with root package name */
    public final String f6510a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinaryDataHelper f6511b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtobufStateSerializer f6512c;

    /* renamed from: d, reason: collision with root package name */
    public final ProtobufConverter f6513d;

    public Rf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f6510a = str;
        this.f6511b = iBinaryDataHelper;
        this.f6512c = protobufStateSerializer;
        this.f6513d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f6511b.remove(this.f6510a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f6511b.get(this.f6510a);
            if (bArr != null && bArr.length != 0) {
                return this.f6513d.toModel((MessageNano) this.f6512c.toState(bArr));
            }
            return this.f6513d.toModel((MessageNano) this.f6512c.defaultValue());
        } catch (Throwable unused) {
            return this.f6513d.toModel((MessageNano) this.f6512c.defaultValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f6511b.insert(this.f6510a, this.f6512c.toByteArray((MessageNano) this.f6513d.fromModel(obj)));
    }
}
