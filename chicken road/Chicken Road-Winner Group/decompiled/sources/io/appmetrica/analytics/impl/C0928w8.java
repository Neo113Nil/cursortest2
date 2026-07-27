package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.w8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0928w8 extends MessageNano {

    /* renamed from: e, reason: collision with root package name */
    public static volatile C0928w8[] f8552e;

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8553a;

    /* renamed from: b, reason: collision with root package name */
    public C0643l8 f8554b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f8555c;

    /* renamed from: d, reason: collision with root package name */
    public C0798r8 f8556d;

    public C0928w8() {
        a();
    }

    public static C0928w8[] b() {
        if (f8552e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8552e == null) {
                        f8552e = new C0928w8[0];
                    }
                } finally {
                }
            }
        }
        return f8552e;
    }

    public final C0928w8 a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8553a = bArr;
        this.f8554b = null;
        this.f8555c = bArr;
        this.f8556d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8553a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8553a);
        }
        C0643l8 c0643l8 = this.f8554b;
        if (c0643l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c0643l8);
        }
        if (!Arrays.equals(this.f8555c, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f8555c);
        }
        C0798r8 c0798r8 = this.f8556d;
        return c0798r8 != null ? CodedOutputByteBufferNano.computeMessageSize(4, c0798r8) + computeSerializedSize : computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8553a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8553a);
        }
        C0643l8 c0643l8 = this.f8554b;
        if (c0643l8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c0643l8);
        }
        if (!Arrays.equals(this.f8555c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f8555c);
        }
        C0798r8 c0798r8 = this.f8556d;
        if (c0798r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c0798r8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0928w8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            }
            if (readTag == 10) {
                this.f8553a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                if (this.f8554b == null) {
                    this.f8554b = new C0643l8();
                }
                codedInputByteBufferNano.readMessage(this.f8554b);
            } else if (readTag == 26) {
                this.f8555c = codedInputByteBufferNano.readBytes();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    break;
                }
            } else {
                if (this.f8556d == null) {
                    this.f8556d = new C0798r8();
                }
                codedInputByteBufferNano.readMessage(this.f8556d);
            }
        }
        return this;
    }

    public static C0928w8 b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C0928w8().mergeFrom(codedInputByteBufferNano);
    }

    public static C0928w8 a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C0928w8) MessageNano.mergeFrom(new C0928w8(), bArr);
    }
}
