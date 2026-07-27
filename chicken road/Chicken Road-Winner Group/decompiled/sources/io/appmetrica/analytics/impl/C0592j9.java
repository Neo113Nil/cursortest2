package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0592j9 extends MessageNano {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C0592j9[] f7609c;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7610a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f7611b;

    public C0592j9() {
        a();
    }

    public static C0592j9[] b() {
        if (f7609c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7609c == null) {
                        f7609c = new C0592j9[0];
                    }
                } finally {
                }
            }
        }
        return f7609c;
    }

    public final C0592j9 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7610a = bArr;
        this.f7611b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7610a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7610a);
        }
        return !Arrays.equals(this.f7611b, bArr2) ? CodedOutputByteBufferNano.computeBytesSize(2, this.f7611b) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f7610a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7610a);
        }
        if (!Arrays.equals(this.f7611b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7611b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0592j9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f7610a = codedInputByteBufferNano.readBytes();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                this.f7611b = codedInputByteBufferNano.readBytes();
            }
        }
        return this;
    }

    public static C0592j9 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0592j9().mergeFrom(codedInputByteBufferNano);
    }

    public static C0592j9 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0592j9) MessageNano.mergeFrom(new C0592j9(), bArr);
    }
}
