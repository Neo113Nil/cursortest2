package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.q8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0922q8 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0922q8[] f9069c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f9070a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f9071b;

    public C0922q8() {
        a();
    }

    public static C0922q8[] b() {
        if (f9069c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9069c == null) {
                        f9069c = new C0922q8[0];
                    }
                } finally {
                }
            }
        }
        return f9069c;
    }

    public final C0922q8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9070a = bArr;
        this.f9071b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f9070a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9070a);
        }
        return !Arrays.equals(this.f9071b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f9071b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f9070a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9070a);
        }
        if (!Arrays.equals(this.f9071b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f9071b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0922q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f9070a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f9071b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0922q8 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0922q8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0922q8 a(byte[] bArr) {
        return (C0922q8) MessageNano.mergeFrom(new C0922q8(), bArr);
    }
}
