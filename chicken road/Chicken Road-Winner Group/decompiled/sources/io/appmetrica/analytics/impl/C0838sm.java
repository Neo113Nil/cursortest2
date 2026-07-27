package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0838sm extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0838sm[] f8318b;

    /* renamed from: a, reason: collision with root package name */
    public long f8319a;

    public C0838sm() {
        a();
    }

    public static C0838sm[] b() {
        if (f8318b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8318b == null) {
                        f8318b = new C0838sm[0];
                    }
                } finally {
                }
            }
        }
        return f8318b;
    }

    public final C0838sm a() {
        this.f8319a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j3 = this.f8319a;
        return j3 != 10000 ? CodedOutputByteBufferNano.computeInt64Size(1, j3) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j3 = this.f8319a;
        if (j3 != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j3);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0838sm mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8319a = codedInputByteBufferNano.readInt64();
            }
        }
        return this;
    }

    public static C0838sm a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0838sm) MessageNano.mergeFrom(new C0838sm(), bArr);
    }

    public static C0838sm b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0838sm().mergeFrom(codedInputByteBufferNano);
    }
}
