package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0741j9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0741j9[] f8524c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8525a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8526b;

    public C0741j9() {
        a();
    }

    public static C0741j9[] b() {
        if (f8524c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8524c == null) {
                        f8524c = new C0741j9[0];
                    }
                } finally {
                }
            }
        }
        return f8524c;
    }

    public final C0741j9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8525a = bArr;
        this.f8526b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8525a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8525a);
        }
        return !Arrays.equals(this.f8526b, bArr2) ? computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f8526b) : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        byte[] bArr = this.f8525a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8525a);
        }
        if (!Arrays.equals(this.f8526b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8526b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0741j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f8525a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f8526b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    public static C0741j9 b(CodedInputByteBufferNano codedInputByteBufferNano) {
        return new C0741j9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0741j9 a(byte[] bArr) {
        return (C0741j9) MessageNano.mergeFrom(new C0741j9(), bArr);
    }
}
