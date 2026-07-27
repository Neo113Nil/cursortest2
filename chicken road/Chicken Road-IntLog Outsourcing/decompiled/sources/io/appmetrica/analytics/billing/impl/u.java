package io.appmetrica.analytics.billing.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class u extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile u[] f5989c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f5990a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f5991b;

    public u() {
        a();
    }

    public static u[] b() {
        if (f5989c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f5989c == null) {
                        f5989c = new u[0];
                    }
                } finally {
                }
            }
        }
        return f5989c;
    }

    public final u a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f5990a = bArr;
        this.f5991b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f5990a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f5990a);
        }
        return !Arrays.equals(this.f5991b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f5991b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f5990a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f5990a);
        }
        if (!Arrays.equals(this.f5991b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f5991b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final u mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f5990a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f5991b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static u b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new u().mergeFrom(codedInputByteBufferNano);
    }

    public static u a(byte[] bArr) {
        return (u) MessageNano.mergeFrom(new u(), bArr);
    }
}
