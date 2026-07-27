package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0902v8 extends MessageNano {

    /* renamed from: d, reason: collision with root package name */
    public static volatile C0902v8[] f8500d;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8501a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f8502b;

    /* renamed from: c, reason: collision with root package name */
    public C0928w8 f8503c;

    public C0902v8() {
        a();
    }

    public static C0902v8[] b() {
        if (f8500d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8500d == null) {
                        f8500d = new C0902v8[0];
                    }
                } finally {
                }
            }
        }
        return f8500d;
    }

    public final C0902v8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8501a = bArr;
        this.f8502b = bArr;
        this.f8503c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8501a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8501a);
        }
        if (!Arrays.equals(this.f8502b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8502b);
        }
        C0928w8 c0928w8 = this.f8503c;
        return c0928w8 != null ? CodedOutputByteBufferNano.computeMessageSize(3, c0928w8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8501a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8501a);
        }
        if (!Arrays.equals(this.f8502b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8502b);
        }
        C0928w8 c0928w8 = this.f8503c;
        if (c0928w8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c0928w8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0902v8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8501a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f8502b = codedInputByteBufferNano.readBytes();
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8503c == null) {
                    this.f8503c = new C0928w8();
                }
                codedInputByteBufferNano.readMessage(this.f8503c);
            }
        }
        return this;
    }

    public static C0902v8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0902v8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0902v8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0902v8) MessageNano.mergeFrom(new C0902v8(), bArr);
    }
}
