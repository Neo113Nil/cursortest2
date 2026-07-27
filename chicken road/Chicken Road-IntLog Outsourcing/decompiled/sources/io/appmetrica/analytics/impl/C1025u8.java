package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025u8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C1025u8[] f9362b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9363a;

    public C1025u8() {
        a();
    }

    public static C1025u8[] b() {
        if (f9362b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9362b == null) {
                        f9362b = new C1025u8[0];
                    }
                } finally {
                }
            }
        }
        return f9362b;
    }

    public final C1025u8 a() {
        this.f9363a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f9363a, WireFormatNano.EMPTY_BYTES) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f9363a) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!Arrays.equals(this.f9363a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9363a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1025u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9363a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C1025u8 a(byte[] bArr) {
        return (C1025u8) MessageNano.mergeFrom(new C1025u8(), bArr);
    }

    public static C1025u8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C1025u8().mergeFrom(codedInputByteBufferNano);
    }
}
