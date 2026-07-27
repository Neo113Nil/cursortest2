package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.u8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0876u8 extends MessageNano {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0876u8[] f8410b;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8411a;

    public C0876u8() {
        a();
    }

    public static C0876u8[] b() {
        if (f8410b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8410b == null) {
                        f8410b = new C0876u8[0];
                    }
                } finally {
                }
            }
        }
        return f8410b;
    }

    public final C0876u8 a() {
        this.f8411a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f8411a, WireFormatNano.EMPTY_BYTES) ? CodedOutputByteBufferNano.computeBytesSize(1, this.f8411a) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8411a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8411a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0876u8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f8411a = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0876u8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0876u8) MessageNano.mergeFrom(new C0876u8(), bArr);
    }

    public static C0876u8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0876u8().mergeFrom(codedInputByteBufferNano);
    }
}
